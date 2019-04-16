package techConnect;
import techConnect.*;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.util.Random;

public class DBWrapper{
    String hostName;
    String dbName;
    String user;
    String password;
    String url;
    Connection connection;

    public DBWrapper() {
        hostName = "tconect.database.windows.net"; // update me
        dbName = "TechConnectDB"; // update me
        user = "cbuStudents"; // update me
        password = "Angel1996"; // update me
        url = String.format("jdbc:sqlserver://%s:1433;database=%s;user=%s;password=%s;encrypt=true;" + "hostNameInCertificate=*.database.windows.net;loginTimeout=30;", hostName, dbName, user, password);
        //url = "jdbc:sqlserver://tconect.database.windows.net:1433;database=TechConnectDB";
        connection = null;
    }

    private ResultSet sendQuery(String query) {
        query += " SELECT SCOPE_IDENTITY();";
        //System.out.println(query);
        if(verifyQuery(query)) {
            try {
                connection = DriverManager.getConnection(url);
                String schema = connection.getSchema();
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery(query);
                return resultSet;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    //Creates a problem provider if userType = 'P', a solution provider if 'S', or both if 'B'
    public int addUser(char userType, String name, String password, String email, String affiliation, String location, Boolean group, Boolean isPrivate) throws java.sql.SQLException {
//        if((userType == 'B' || userType == 'P' || userType == 'S') && group != null && isPrivate != null) {
        if(group != null && isPrivate != null) {
            //Get and run Query for user table
            String query = getInsertUserQ(name, password, email, affiliation, location, group);
            ResultSet rs = sendQuery(query);
            rs.next();
            int ID = rs.getInt(1);
            if (userType == 'P' || userType == 'B') {
                //Query for pprov table
                query = "INSERT INTO problem_provider VALUES (" + ID + ", " + booleanToBit(isPrivate) + ");";
                sendQuery(query);
            }
            if(userType == 'S' || userType == 'B') {
                //Query for sprov table
                query = "INSERT INTO solution_providers VALUES (" + ID + ");";
                sendQuery(query);
            }
            rs.close();
            return ID;
        }
        return 0;
    }

    //
    public ResultSet login(String userName, String passWord) {
        String query = "SELECT * FROM users WHERE user_name = '" + escape(userName) + "' AND pass = HASHBYTES('SHA2_512', salt + '" + escape(passWord) + "');";
        return sendQuery(query);
    }

    //updates the user
    public void updateUser(String name, String password, String email, String affiliation, String location, Boolean group, Boolean isPrivate, String oldName, String oldPass) throws java.sql.SQLException {
        int gBit = 0;
        int pBit = 0;
        if(group) {gBit = 1;}
        if(isPrivate) {pBit = 1;}
        String query = "UPDATE users SET user_name = '" + escape(name) + "', pass = HASHBYTES('SHA2_512', salt + '" + escape(password) + "'), email = '" + escape(email) + "', affiliationN = '" + escape(affiliation) + "', location = '" + escape(location) + "', in_group = " + gBit + ", active = " + pBit + " WHERE user_name = '" + escape(oldName) + "' AND pass = HASHBYTES('SHA2_512', salt + '" + escape(oldPass) + "');";
        sendQuery(query);
    }

    //creates an admin
    public void addAdmin(String name, String password, String email, String affiliation, String location, Boolean group) throws java.sql.SQLException {
        String query = getInsertUserQ(escape(name), escape(password), escape(email), escape(affiliation), escape(location), group);
        ResultSet rs = sendQuery(query);
        rs.next();
        int ID = rs.getInt(1);
        query = "INSERT INTO system_admin VALUES (" + ID + ");";
        sendQuery(query);
    }

    //Returns all solution providers
    public ResultSet getSolutionProviders() {
        String query = "SELECT * FROM users, solution_providers WHERE users.userID = solution_providers.sproviderID;";
        return sendQuery(query);
    }

    //Returns solution provider with the given name
    public ResultSet getSolutionProviders(String name) {
        String query = "SELECT * FROM users, solution_providers WHERE users.userID = solution_providers.sproviderID AND userName = '" + escape(name) + "';";
        return sendQuery(query);
    }

    //Returns solution provider with the given ID
    public ResultSet getSolutionProviders(int userID) {
        String query = "SELECT * FROM users, solution_providers WHERE users.userID = solution_providers.sproviderID AND userID = " + userID + ";";
        return sendQuery(query);
    }

    //Get all problem providers
    public ResultSet getProblemProviders() {
        String query = "SELECT * FROM users, problem_provider WHERE userID = pproviderID;";
        return sendQuery(query);
    }

    //Get a problem provider from a name
    public ResultSet getProblemProviders(String name) {
        String query = "SELECT * FROM users, problem_provider WHERE userID = pproviderID AND userName = '" + escape(name) +"';";
        return sendQuery(query);
    }

    //Get a problem provider from an ID
    public ResultSet getProblemProviders(int userID) {
        String query = "SELECT * FROM users, problem_provider WHERE userID = pproviderID AND userID = " + userID + ";";
        return sendQuery(query);
    }

    //get all admins
    public ResultSet getAdmins() {
        String query = "SELECT * FROM users, system_admin WHERE userID = adminID;";
        return sendQuery(query);
    }

    //get all admins of the given name
    public ResultSet getAdmins(String name) {
        String query = "SELECT * FROM users, system_admin WHERE userID = adminID AND userName = '" + escape(name) + ";";
        return sendQuery(query);
    }

    //get all admins of the given id
    public ResultSet getAdmins(int userID) {
        String query = "SELECT * FROM users, system_admin WHERE userID = adminID AND userID = " + userID + ";";
        return sendQuery(query);
    }

    //Used to add most contacts
    public ResultSet addContact(int userID, String contactType, String address, Boolean primary) {
        String query = "INSERT INTO additional_contacts VALUES (" + userID + ", '" + escape(contactType) + "', '" + escape(address) + "', " + booleanToBit(primary) + ");";
        return sendQuery(query);
    }

    public ResultSet getContacts(int userID) {
        String query = "Select * FROM additional_contacts WHERE userID = " + userID + ";";
        return sendQuery(query);
    }

    public void updateContact(int ID, String type, String address) {
        String query = "UPDATE additional_contacts SET contact_type = '" + escape(type) + "', contact_address = '" + escape(address) + "' WHERE contactID = " + ID + ";";
        sendQuery(query);
    }

    public void deleteContact(int ID) {
        String query = "DELETE FROM additional_contacts WHERE contactID = " + ID + ";";
        sendQuery(query);
    }

    /*
    private void addPhone() {}
    */

    //Creates query to add a skill
    public ResultSet addSkill(String skillName) {
        String newSkillQuery = "INSERT INTO skills VALUES ('" + escape(skillName) + "');";
        return sendQuery(newSkillQuery);
    }

    //Gets all skills saved in DB.
    public ResultSet getSkills() {
        String query = "SELECT * FROM skills;";
        return sendQuery(query);
    }

    //Sets a skill to a user
    public void setUserSkills(int skillID, int userID, int level) {
        String query = "INSERT INTO solution_providers_skills VALUES (" + skillID + ", " + userID + ", " + level + ");";
        sendQuery(query);
    }

    //Returns all the skills associated with a given user
    public ResultSet getUserSkills(int userID) {
        String query = "SELECT * FROM solution_providers_skills, skills WHERE solution_providers_skills.skillID = skills.skillID and sproviderID = " + userID + ";";
        return sendQuery(query);
    }

    //changes skill name
    public void updateSkills(int ID, String skillName) {
        String query = "UPDATE skills SET skill_name = '" + escape(skillName) + "' WHERE skillID = " + ID + ";";
        sendQuery(query);
    }

    //deletes skill and every use of it
    public void deleteSkills(int ID) {
        String query = "DELETE FROM solution_providers_skills WHERE skillID = " + ID + ";";
        sendQuery(query);
        query = "DELETE FROM skills WHERE skillID = " + ID + ";";
        sendQuery(query);
    }

    //deletes a relationship between skill and user
    public void deleteUserSkill(int userID, int skillID) {
        String query = "DELETE FROM solution_providers_skills WHERE skillID = " + skillID + " AND sproviderID = " + userID + ";";
        sendQuery(query);
    }

    //Creates query to add a media file for a project
    public ResultSet addProjectMedia(int projectID, String address) {
        String query = "INSERT INTO project_media_files VALUES (" + projectID + ", '" + escape(address) + "');";
        return sendQuery(query);
    }

    //Returns all media file addresses assosiated with a given project.
    public ResultSet getProjectMedia(int projectID) {
        String query = "Select * FROM project_media_files WHERE projectID = " + projectID + ";";
        return sendQuery(query);
    }

    public void deleteProjectMedia(int ID) {
        String query = "DELETE FROM project_media_files WHERE fileID = " + ID + ";";
        sendQuery(query);
    }

    //Adds a media file for a user
    public ResultSet addUserMedia(int userID, String address) {
        String query = "INSERT INTO user_media_files VALUES (" + userID + ", '" + escape(address) + "');";
        return sendQuery(query);
    }

    //Returns all media file addresses assosiated with a given user.
    public ResultSet getUserMedia(int userID) {
        String query = "Select * FROM user_media_files WHERE userID = " + userID + ";";
        return sendQuery(query);
    }

    public void deleteUserMedia(int ID) {
        String query = "DELETE FROM user_media_files WHERE fileID = " + ID + ";";
        sendQuery(query);
    }

    //Creates query to add a public project
    public ResultSet addPublicProject(int providerID, String pName, String proposal) throws java.sql.SQLException {
        //code
        String query = "INSERT INTO project VALUES(" + providerID +", '" + escape(pName)+ "', '" + escape(proposal) + "', 0);";
        ResultSet rs = sendQuery(query);
        rs.next();
        int ID = rs.getInt(1);
        query = "INSERT INTO public_project VALUES (" + ID + ");";
        sendQuery(query);
        return rs;
    }

    //Gets all public projects
    public ResultSet getPublicProjects() {
        String query = "Select * FROM project, public_project WHERE project.projectID = public_project.projectID;";
        return sendQuery(query);
    }

    //Gets all public projects asosiated with a provider
    public ResultSet getPublicProjects(int pproviderID) {
        String query = "Select * FROM project, public_project WHERE project.projectID = public_project.projectID AND pproviderID = " + pproviderID + ";";
        return sendQuery(query);
    }

    //Gets a public project matching the name
    public ResultSet getPublicProjects(String name) {
        String query = "Select * FROM project, public_project WHERE project.projectID = public_project.projectID AND projectName = '" + escape(name) + "';";
        return sendQuery(query);
    }

    public ResultSet getPublicProjectsWithProjectID(int ID) {
        String query = "Select * FROM project, public_project WHERE project.projectID = public_project.projectID AND project.projectID = '" + ID + "';";
        return sendQuery(query);
    }

    public ResultSet getPrivteProjectsWithProjectID(int ID) {
        String query = "Select * FROM project, private_project WHERE project.projectID = private_project.projectID AND project.projectID = '" + ID + "';";
        return sendQuery(query);
    }

    //Creates query to add a private project
    public ResultSet addPrivateProject(int providerID, int adminID, String pName, String proposal) throws java.sql.SQLException {
        //code
        String query = "INSERT INTO project VALUES(" + providerID +", '" + escape(pName)+ "', '" + escape(proposal) + "', 0); SELECT SCOPE_IDENTITY() AS NewID;";
        ResultSet rs = sendQuery(query);
        rs.next();
        int ID = rs.getInt(1);
        query = "INSERT INTO private_project VALUES (" + ID + ", " + adminID + ");";
        sendQuery(query);
        return rs;
    }

    //returns all private projects
    public ResultSet getPrivateProjects() {
        String query = "Select * FROM project, private_project WHERE project.projectID = private_project.projectID;";
        return sendQuery(query);
    }

    //returns all private projects assossiated with a provider
    public ResultSet getPrivateProjects(int pproviderID) {
        String query = "Select * FROM project, private_project WHERE project.projectID = private_project.projectID AND pproviderID = " + pproviderID + ";";
        return sendQuery(query);
    }

    //returns a project with a given name
    public ResultSet getPrivateProjects(String name) {
        String query = "Select * FROM project, private_project WHERE project.projectID = private_project.projectID AND projectName = '" + escape(name) + "';";
        return sendQuery(query);
    }

    public void updateProjects(int projectID, String name, String proposal, Boolean complete) {
        int cBit = 0;
        if(complete) {cBit = 1;}
        String query = "UPDATE project SET projectName = '" + escape(name) + "', proposal = '" + escape(proposal) + "', complete = " + cBit + " WHERE projectID = " + projectID + ";";
        sendQuery(query);
    }

    //gets all private projects overseen by a given admin
    public ResultSet getAdminsPrivateProjects(int adminID) {
        String query = "Select * FROM project, private_project WHERE project.projectID = private_project.projectID AND AdminID = " + adminID + ";";
        return sendQuery(query);
    }

    //Creates query to add a pairing between solution provider and project
    public void addPairing(int projectID, int sproviderID, int adminID) {
        String query = "INSERT INTO project_solution_providers VALUES (" + projectID + ", " + sproviderID + ", " + adminID + ", 1);";
        if(adminID == 0) { query = "INSERT INTO project_solution_providers VALUES (" + projectID + ", " + sproviderID + ", null, 1);"; }
        sendQuery(query);
    }

    //Returns the ID and user name of all users assigned to a certain project
    public ResultSet getProjectContributors(int projectID) {
        String query = "SELECT solution_providers.sproviderID, projectID, project_solution_providers.active, adminID FROM project_solution_providers, solution_providers, users WHERE solution_providers.sproviderID = project_solution_providers.sproviderID AND users.userID = solution_providers.sproviderID AND projectID = " + projectID + ";";
        return sendQuery(query);
    }

    //Returns all projects worked on by a user.
    public ResultSet getSolutionProvidersProjects(int userID) {
        String query = "SELECT project.projectID, pproviderID, sproviderID, adminID, projectName, proposal, complete, active FROM project, project_solution_providers WHERE project.projectID = project_solution_providers.projectID AND sproviderID = " + userID + ";";
        return sendQuery(query);
    }

    public ResultSet getAdminsPairings(int adminID) {
        String query = "SELECT * FROM project, project_solution_providers, users WHERE project.projectID = project_solution_providers.projectID AND users.userID = project_solution_providers.sproviderID and adminID = " + adminID + ";";
        return sendQuery(query);
    }

    //Checks if query contains comments or is null
    private Boolean verifyQuery(String Query) {
        if(Query.contains("/*") || Query.contains("*/") || Query.contains("--") || Query == null) { return false; }
        return true;
    }

    //Coverts a java boolean to SQL Bit
    private int booleanToBit(Boolean b) {
        if(b) {
            return 1;
        }else {
            return 0;
        }
    }

    private String getInsertUserQ(String name, String password, String email, String affiliation, String location, Boolean group) {
        String rand = randomString();
        String insertedPass = rand + password;
        int pGroup = booleanToBit(group);
        return "INSERT INTO users VALUES ('" + name + "', HASHBYTES('SHA2_512', '" + insertedPass + "'), '" + rand + "', '" + email + "', '" + affiliation + "', '" + location + "', " + pGroup + ", 1);";// + " SELECT SCOPE_IDENTITY();";
    }

    //creates and returns random string for salt.
    private String randomString() {
        //Code copied from Eugen Paraschiv (https://www.baeldung.com/java-random-string)
        int leftLimit = 33;
        int rightLimit = 128;
        int targetStringLength = 25;
        Random random = new Random();
        StringBuilder buffer = new StringBuilder(targetStringLength);
        for (int i = 0; i < targetStringLength; i++) {
            int randomLimitedInt = leftLimit + (int)
                    (random.nextFloat() * (rightLimit - leftLimit + 1));
            buffer.append((char) randomLimitedInt);
        }
        String generatedString = buffer.toString();

        //Replaces potentioally dangerous charachters with harmlss ones.
        generatedString = generatedString.replace("-", ".");
        generatedString = generatedString.replace("\\", "=");
        generatedString = generatedString.replace("*", "[");
        generatedString = generatedString.replace("'", "\"");

        return generatedString;
    }

    public String escape(String s) {
        return s.replace("'", "''");
    }
}