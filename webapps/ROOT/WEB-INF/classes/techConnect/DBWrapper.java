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
        //
        hostName = "tconect.database.windows.net"; // update me
        dbName = "TechConnectDB"; // update me
        user = "cbuStudents"; // update me
        password = "Angel1996"; // update me
        url = String.format("jdbc:sqlserver://%s:1433;database=%s;user=%s;password=%s;encrypt=true;"
                + "hostNameInCertificate=*.database.windows.net;loginTimeout=30;", hostName, dbName, user, password);
        connection = null;
    }

    private ResultSet sendQuery(String query) {
        try {
            System.out.println("=========================================");
            connection = DriverManager.getConnection(url);
            System.out.println("=========================================");
            String schema = connection.getSchema();
            System.out.println("Successful connection - Schema: " + schema);

            System.out.println("Query data example:");
            System.out.println("=========================================");

            // Create and execute a SELECT SQL statement.
            String selectSql = query;

            try (Statement statement = connection.createStatement();
                 ResultSet resultSet = statement.executeQuery(selectSql)) {

                // Print results from select statement
                //System.out.println("Top 20 categories:");
                while (resultSet.next())
                {
                    System.out.println(resultSet.getString(1) + " " + resultSet.getString(2));
                }
                connection.close();
                //return resultSet;
            }
        }
        catch (Exception e) {
            System.out.println("kkk");
            e.printStackTrace();
        }
        return null;
    }

    public void testQ (String q) {
        sendQuery(q);
    }
    /*public DBWrapper() {
        try {
            String connectionUrl = "tconect.database.windows.net";
            Connection con = null;
            Statement stmt = null;
            //ResultSet rs = null;
            Class.forName("tconect.database.windows.net");
            con = DriverManager.getConnection(connectionUrl);
            //String SQL = "select smth from tableName where smth";
            stmt = con.createStatement();
            //rs = stmt.executeQuery(query);
            //return rs;
        } catch (Exception e) {
            throw new IllegalArgumentException(e);
            //return null;
        }
    }

    //Code based on (https://stackoverflow.com/questions/19514881/java-how-retrieve-data-from-database)
    //Submits given query and returns the result set
    private ResultSet sendQuery(String query) {
        //Submit query
        if(verrifyQuery(query)) {
            ResultSet rs = null;
            rs = stmt.executeQuery(query);
            return rs;
        }
        throw new IllegalArgumentException("Dangerous Query detected");
        //return null;
    }*/

    //Creates a problem provider if userType = 'P', a solution provider if 'S', or both if 'B'
    public void addUser(char userType, String name, String password, String email, String affiliation, String location, Boolean group, Boolean isPrivate) throws java.sql.SQLException {
        if((userType == 'B' || userType == 'P' || userType == 'S') && group != null && isPrivate != null) {
            //Get and run Query for user table
            String query = getInsertUserQ(name, password, email, affiliation, location, group);
            ResultSet rs = sendQuery(query);
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
        }
    }

    //creates an admin
    public void addAdmin(String name, String password, String email, String affiliation, String location, Boolean group) throws java.sql.SQLException {
        String query = getInsertUserQ(name, password, email, affiliation, location, group);
        ResultSet rs = sendQuery(query);
        int ID = rs.getInt(1);
        query = "INSERT INTO system_admin VALUES (" + ID + ");";
        sendQuery(query);
    }

    //Returns data of problem provider with correct login input
    public ResultSet problemProviderLogin(String userName, String passWord) {
        String query = "SELECT * FROM users, problem_provider WHERE userID = pproviderID AND userName = '" + userName + "' AND pass = HASHBYTES('SHA2_512', salt + '" + passWord + "');";
        return sendQuery(query);
    }

    //Returns data of solution provider with correct login input
    public ResultSet solutionProviderLogin(String userName, String passWord) {
        String query = "SELECT * FROM users, solution_providers WHERE userID = sproviderID AND userName = '" + userName + "' AND pass = HASHBYTES('SHA2_512', salt + '" + passWord + "');";
        return sendQuery(query);
    }

    //Returns data of problem and solution provider with correct login input
    public ResultSet doubleProviderLogin(String userName, String passWord) {
        String query = "SELECT * FROM users, solution_providers, problem_provider WHERE userID = sproviderID AND userID = pproviderID AND userName = '" + userName + "' AND pass = HASHBYTES('SHA2_512', salt + '" + passWord + "');";
        return sendQuery(query);
    }

    //Returns data of admins with correct login input
    public ResultSet adminLogin(String userName, String passWord) {
        String query = "SELECT * FROM users, system_admin WHERE userID = adminID AND userName = '" + userName + "' AND pass = HASHBYTES('SHA2_512', salt + '" + passWord + "');";
        return sendQuery(query);
    }

    //Returns all solution providers
    public ResultSet getSolutionProviders() {
        String query = "SELECT * FROM users, solution_providers WHERE users.userID = solution_providers.sproviderID;";
        return sendQuery(query);
    }

    //Returns solution provider with the given name
    public ResultSet getSolutionProviders(String name) {
        String query = "SELECT * FROM users, solution_providers WHERE users.userID = solution_providers.sproviderID AND userName = '" + name + "';";
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
        String query = "SELECT * FROM users, problem_provider WHERE userID = pproviderID AND userName = '" + name +"';";
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
        String query = "SELECT * FROM users, system_admin WHERE userID = adminID AND userName = '" + name + ";";
        return sendQuery(query);
    }

    //get all admins of the given id
    public ResultSet getAdmins(int userID) {
        String query = "SELECT * FROM users, system_admin WHERE userID = adminID AND userID = " + userID + ";";
        return sendQuery(query);
    }

    //Used to add most contacts
    public void addContact(int userID, String contactType, String address, Boolean primary) {
        String query = "INSERT INTO additional_contacts VALUES (" + userID + ", '" + contactType + "', '" + address + "', " + booleanToBit(primary) + ");";
        sendQuery(query);
    }

    public ResultSet getContacts(int userID) {
        String query = "Select * FROM additional_contacts WHERE userID = " + userID + ";";
        return sendQuery(query);
    }
    /*
    //Used to add phone contacts
    public void addContact() {

    }

    private void addPhone() {}
    */

    //Creates query to add a skill
    public void addSkill(String skillName) {
        if(skillName.length() <= 90) {
            String newSkillQuery = "INSERT INTO skills VALUES ('" + skillName + "');";
        }else {
            throw new IllegalArgumentException("Skill's name is too long.");
        }
    }

    //Gets all skills saved in DB.
    public ResultSet getSkills() {
        String query = "SELECT * FROM skills;";
        return sendQuery(query);
    }

    //Sets a skill to a user
    public void setUserSkills(int skillID, int userID) {
        String query = "INSERT INTO solution_providers_skills VALUES (" + skillID + ", " + userID + ");";
        sendQuery(query);
    }

    //Returns all the skills associated with a given user
    public ResultSet getUserSkills(int userID) {
        String query = "SELECT skill_name FROM solution_providers_skills, skills WHERE skills.skillID = solution_providers_skills.skillID AND sproviderID = " + userID + ";";
        return sendQuery(query);
    }

    //Creates query to add a media file for a project
    public void addProjectMedia(int projectID, String address) {
        String query = "INSERT INTO project_media_files VALUES (" + projectID + ", '" + address + "');";
        sendQuery(query);
    }

    //Returns all media file addresses assosiated with a given project.
    public ResultSet getProjectMedia(int projectID) {
        String query = "Select * FROM project_media_files WHERE projectID = " + projectID + ";";
        return sendQuery(query);
    }

    //Adds a media file for a user
    public void addUserMedia(int projectID, Boolean profile, String address) {
        String query = "INSERT INTO user_media_files VALUES (" + projectID + ", '" + address + "');";
        sendQuery(query);
    }

    //Returns all media file addresses assosiated with a given user.
    public ResultSet getUserMedia(int projectID) {
        String query = "Select * FROM user_media_files WHERE projectID = " + projectID + ";";
        return sendQuery(query);
    }

    //Creates query to add a public project
    public void addPublicProject(int providerID, String pName, String proposal) throws java.sql.SQLException {
        //code
        String query = "INSERT INTO project VALUES(" + providerID +", '" + pName+ "', '" + proposal + "', 0;";
        ResultSet rs = sendQuery(query);
        int ID = rs.getInt(1);
        query = "INSERT INTO public_project VALUES (" + ID + ");";
        sendQuery(query);
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
        String query = "Select * FROM project, public_project WHERE project.projectID = public_project.projectID AND projectName = '" + name + "';";
        return sendQuery(query);
    }

    //Creates query to add a private project
    public void addPrivateProject(int providerID, int adminID, String pName, String proposal) throws java.sql.SQLException {
        //code
        String query = "INSERT INTO project VALUES(" + providerID +", '" + pName+ "', '" + proposal + "', 0);";
        ResultSet rs = sendQuery(query);
        int ID = rs.getInt(1);
        query = "INSERT INTO private_project VALUES (" + ID + ", " + adminID + ");";
        sendQuery(query);
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
        String query = "Select * FROM project, private_project WHERE project.projectID = private_project.projectID AND projectName = '" + name + "';";
        return sendQuery(query);
    }

    //gets all private projects overseen by a given admin
    public ResultSet getAdminsPrivateProjects(int adminID) {
        String query = "Select * FROM project, private_project WHERE project.projectID = private_project.projectID AND AdminID = " + adminID + ";";
        return sendQuery(query);
    }

    //Creates query to add a pairing between solution provider and project
    public void addPairing(int projectID, int sproviderID, int adminID) {
        String query = "INSERT INTO project_solution_providers VALUES (" + projectID + ", " + sproviderID + ", " + adminID + ", 1;";
        sendQuery(query);
    }

    //Returns the ID and user name of all users assigned to a certain project
    public ResultSet getProjectContributors(int projectID) {
        String query = "SELECT userID, userName, project_solution_providers.active FROM project_solution_providers, solution_providers, users WHERE solution_providers.sproviderID = project_solution_providers.sproviderID AND users.userID = solution_providers.sproviderID AND projectID = " + projectID + ";";
        return sendQuery(query);
    }

    //Returns all projects worked on by a user.
    public ResultSet getSolutionProvidersProjects(int userID) {
        String query = "SELECT project.projectID, projectName, proposal, active FROM project, project_solution_providers WHERE project.projectID = project_solution_providers.projectID AND sproviderID = " + userID + ";";
        return sendQuery(query);
    }

    public ResultSet getAdminsPairings(int adminID) {
        String query = "SELECT project.projectID, projectName, userID, userName, adminID FROM project, project_solution_providers, users WHERE project.projectID = project_solution_providers.projectID AND users.userID = project_solution_providers.sproviderID and adminID = " + adminID + ";";
        return sendQuery(query);
    }

    //Checks if query contains comments or is null
    private Boolean verrifyQuery(String Query) {
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
        String userTab = "INSERT INTO users VALUES ('" + name + "', HASHBYTES('SHA2_512', '" + insertedPass + "'), '" + rand + "', '" + email + "', '" + affiliation + "', '" + location + "', " + pGroup + ", 1);";
        return userTab + " " + "SELECT SCOPE_IDENTITY();";
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
}