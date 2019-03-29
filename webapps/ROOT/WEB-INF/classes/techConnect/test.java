package techConnect;

import techConnect.beans.*;
import techConnect.dao.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Queue;
import java.util.Random;


@WebServlet("/test")
public class test extends HttpServlet {
    DBWrapper DB;
    public test() {
        DB = new DBWrapper();
    }

    //Conducts several tests to assure wrappers ability to store and retrieve data
    private Boolean wrapperTests() throws java.sql.SQLException {
        //Creates random data to create users
        Random rn = new Random();
        char userType1 = 'S', userType2 = 'P', userType3 = 'B';
        String name1 = getRandomString(rn.nextInt(10) + 4), name2 = getRandomString(rn.nextInt(10) + 4), name3 = getRandomString(rn.nextInt(10) + 4), nameA = getRandomString(rn.nextInt(10) + 4);
        String pass1 = getRandomString(rn.nextInt(10) + 4), pass2 = getRandomString(rn.nextInt(10) + 4), pass3 = getRandomString(rn.nextInt(10) + 4), passA = getRandomString(rn.nextInt(10) + 4);
        String mail1 = getRandomString(rn.nextInt(20) + 1), mail2 = getRandomString(rn.nextInt(20) + 1), mail3 = getRandomString(rn.nextInt(20) + 1), mailA = getRandomString(rn.nextInt(10) + 4);
        String afil1 = getRandomString(rn.nextInt(20) + 1), afil2 = getRandomString(rn.nextInt(20) + 1), afil3 = getRandomString(rn.nextInt(20) + 1), afilA = getRandomString(rn.nextInt(10) + 4);
        String loca1 = getRandomString(rn.nextInt(20) + 1), loca2 = getRandomString(rn.nextInt(20) + 1), loca3 = getRandomString(rn.nextInt(20) + 1), locaA = getRandomString(rn.nextInt(10) + 4);
        Boolean g1 = (rn.nextInt(2) == 1), g2 = (rn.nextInt(2) == 1), g3 = (rn.nextInt(2) == 1), gA = (rn.nextInt(2) == 1);
        Boolean p1 = (rn.nextInt(2) == 1), p2 = (rn.nextInt(2) == 1), p3 = (rn.nextInt(2) == 1);

        //Adds new users to database
        DB.addUser(userType1, name1, pass1, mail1, afil1, loca1, g1, p1);
        DB.addUser(userType2, name2, pass2, mail2, afil2, loca2, g2, p2);
        DB.addUser(userType3, name3, pass3, mail3, afil3, loca3, g3, p3);
        DB.addAdmin(nameA, passA, mailA, afilA, locaA, gA);

        //Retrieves user data into reult set
        ResultSet rs1 = DB.login(name1, pass1), rs2 = DB.login(name2, pass2), rs3 = DB.login(name3, pass3), rsA = DB.login(nameA, passA);

        //sets the set to the first row
        rs1.next();
        rs2.next();
        rs3.next();
        rsA.next();

        //Tests for any changes in the data
        if(!rs1.getString("email").equals(mail1) || !rs2.getString("email").equals(mail2) || !rs3.getString("email").equals(mail3) || !rsA.getString("email").equals(mailA)){
            System.out.println("Email fail: " + rs1.getString("email") + " - " + mail1 + ", " + rs2.getString("email") + " - " + mail2 + ", " + rs3.getString("email") + " - " + mail3 + ", " + rsA.getString("email") + " - " + mailA + ".");
            return false;
        }
        if(!rs1.getString("affiliationn").equals(afil1) || !rs2.getString("affiliationn").equals(afil2) || !rs3.getString("affiliationn").equals(afil3) || !rsA.getString("affiliationn").equals(afilA)){
            System.out.println("Affiliation fail: " + rs1.getString("affiliationn") + " - " + afil1 + ", " + rs2.getString("affiliationn") + " - " + afil2 + ", " + rs3.getString("affiliationn") + " - " + afil3 + ", " + rsA.getString("affiliationn") + " - " + afilA + ".");
            return false;
        }
        if(!rs1.getString("location").equals(loca1) || !rs2.getString("location").equals(loca2) || !rs3.getString("location").equals(loca3) || !rsA.getString("location").equals(locaA)){
            System.out.println("Location fail: " + rs1.getString("location") + " - " + loca1 + ", " + rs2.getString("location") + " - " + loca2 + ", " + rs3.getString("location") + " - " + loca3 + ", " + rsA.getString("location") + " - " + locaA + ".");
            return false;
        }
        if(rs1.getBoolean("in_group") != g1 || rs2.getBoolean("in_group") != g2 || rs3.getBoolean("in_group") != g3 || rsA.getBoolean("in_group") != gA){
            System.out.println("Location fail: " + rs1.getBoolean("in_group") + " - " + g1 + ", " + rs2.getBoolean("in_group") + " - " + g2 + ", " + rs3.getBoolean("in_group") + " - " + g3 + ", " + rsA.getBoolean("in_group") + " - " + gA + ".");
            return false;
        }

        //Gets the ID for all users
        int uid1 = rs1.getInt("userID"), uid2 = rs2.getInt("userID"), uid3 = rs3.getInt("userID"), aid = rsA.getInt("userID");

        //Cretats test data for projects
        String project1 = getRandomString(rn.nextInt(9) + 4), project2 = getRandomString(rn.nextInt(9) + 4);
        String proposal1 = getRandomString(rn.nextInt(20) + 4), proposal2 = getRandomString(rn.nextInt(20) + 4);

        //adds projects to data base
        DB.addPrivateProject(uid2, aid, project1, proposal1);
        DB.addPublicProject(uid2, project2, proposal2);

        //retrieves project data
        rs1 = DB.getPrivateProjects(project1);
        rs1.next();
        rs2 = DB.getPublicProjects(project2);
        rs2.next();

        //tests for any alterations to project data
        if(!rs1.getString("projectName").equals(project1) || !rs2.getString("projectName").equals(project2)){
            System.out.println("Project name error.");
            return false;
        }

        //gets project Ids
        int pubProjID = rs1.getInt("projectID"), priProjID = rs2.getInt("projectID");

        //creates dummy media data
        String mediaAddressP = getRandomString(rn.nextInt(20) + 4), mediaAddressU = getRandomString(rn.nextInt(20) + 4);;

        //Adds to the database
        DB.addProjectMedia(pubProjID, mediaAddressP);
        DB.addUserMedia(uid1, mediaAddressU);

        rs1 = DB.getProjectMedia(pubProjID);
        rs2 = DB.getUserMedia(uid1);

        if(!rs1.next() || !rs2.next()) {
            System.out.println("Medias not found.");
        }

        DB.addContact(uid1, getRandomString(rn.nextInt(10) + 4), getRandomString(rn.nextInt(20) + 4), false);
        rs3 = DB.getContacts(uid1);

        if(!rs3.next()){
            System.out.println("Contact not found.");
        }

        rs1.close();
        rs2.close();
        rs3.close();
        rsA.close();

        return true;
    }

    private Boolean DAOTester() throws java.sql.SQLException {
        Random rn = new Random();

        //Test creation of each type of user
        providerBean solutionProvider = new providerBean(), problemProvider = new providerBean(), duelProvider = new providerBean(), admin = new providerBean();
        SolutionProviderDAO SPDAO = new SolutionProviderDAO();
        initUserBean(solutionProvider);
        ProjectProviderDAO PPDAO = new ProjectProviderDAO();
        initUserBean(problemProvider);
        initUserBean(duelProvider);
        adminDAO ADAO = new adminDAO();
        initUserBean(admin);

        //Tests user creation capabilities
        SPDAO.setSolutionProvider(solutionProvider);
        PPDAO.setProjectProvider(problemProvider);
        PPDAO.setDoubleProvider(duelProvider);
        ADAO.setAdmin(admin);

        //Tests user login capabilities
        providerBean solutionProvider2 = SPDAO.login(solutionProvider), problemProvider2 = PPDAO.login(problemProvider), duelProvider2 = PPDAO.login(duelProvider), admin2 = ADAO.login(admin);
        if(!(compareUserBeans(solutionProvider, solutionProvider2) && compareUserBeans(problemProvider, problemProvider2) && compareUserBeans(duelProvider, duelProvider2) && compareUserBeans(admin, admin2))) {
            System.out.println("DAO login failed");
            return false;
        }

        //Test user update capabilities
        String newName = getRandomString(rn.nextInt(10) + 4);
        String newPass = getRandomString(rn.nextInt(10) + 4);
        solutionProvider2.setPassword(solutionProvider.getPassword());
        solutionProvider.setUserName(newName);
        solutionProvider.setPassword(newPass);
        SPDAO.updateUser(solutionProvider, solutionProvider2);
        solutionProvider2 = SPDAO.login(solutionProvider);
        if(!solutionProvider2.getUserName().equals(newName)) {
            System.out.println("User or password was not updated correctly");
            System.out.println("New: " + newName + " Current: " + solutionProvider2.getUserName());

            return false;
        }

        //Tests contact creation and search
        ContactDAO CDAO = new ContactDAO();
        contactBean cb1 = new contactBean(), cb2 = new contactBean(), cb3 = new contactBean(), cb4 = new contactBean();
        initContactBean(cb1, solutionProvider2);
        initContactBean(cb2, solutionProvider2);
        initContactBean(cb3, duelProvider2);
        initContactBean(cb4, duelProvider2);
        CDAO.setCotact(cb1);
        CDAO.setCotact(cb2);
        CDAO.setCotact(cb3);
        Queue<contactBean> solutionContacts = CDAO.getContact(cb1);
        Queue<contactBean> duelContacts = CDAO.getContact(cb3);
        while(!solutionContacts.isEmpty()) {
            if (!(compareContactBean(cb1, solutionContacts.peek()) || compareContactBean(cb2, solutionContacts.peek()))) {
                System.out.println("Solution provider contacts failed");
                return false;
            }
            solutionContacts.remove();
        }
        if (!compareContactBean(cb3, duelContacts.peek())) {
            System.out.println("Duel provider contacts failed");
            return false;
        }

        //Tests contact update
        cb4.setContactID(duelContacts.peek().getContactID());
        CDAO.updateContact(cb4);
        duelContacts = CDAO.getContact(cb3);
        if (compareContactBean(cb3, duelContacts.peek())) {
            System.out.println("Updated contact matches old contact");
            return false;
        }
        if (!compareContactBean(cb4, duelContacts.peek())) {
            System.out.println("Updated contact does not match new contact");
            return false;
        }

        //Tests contact deletion
        CDAO.deleteContact(cb4);
        duelContacts = CDAO.getContact(cb3);
        if(!duelContacts.isEmpty()) {
            System.out.println("Contact still exists");
            return false;
        }

        //Testing skills
        SkillDAO SDAO = new SkillDAO();
        skillBean sb1 = new skillBean(), sb2 = new skillBean();
        sb1.setSkillName(getRandomString(rn.nextInt(10) + 6));
        sb2.setSkillName(getRandomString(rn.nextInt(10) + 6));

        //Test skill creation
        Queue<skillBean> skillQueue = SDAO.getSkills();
        int originalSkillSize = skillQueue.size();
        SDAO.setSkill(sb1);
        SDAO.setSkill(sb2);
        skillQueue = SDAO.getSkills();
        if(!(originalSkillSize + 2 == skillQueue.size())) {
            System.out.println(originalSkillSize);
            System.out.println(skillQueue.size());
            System.out.println("Wrong number of skills were added.");
            return false;
        }

        //Test connecting skill to users
        sb1.setUserID(solutionProvider2.getUserID());
        sb2.setUserID(solutionProvider2.getUserID());
        SDAO.setUserSkill(sb1);
        SDAO.setUserSkill(sb2);
        skillQueue = SDAO.getUserSkills(sb1);
        if(skillQueue.size() != 2) {
            System.out.println("Did not receive correct number of user skills");
            return false;
        }
        while(!skillQueue.isEmpty()) {
            if (!(sb1.getSkillName().equals(skillQueue.peek().getSkillName()) || sb2.getSkillName().equals(skillQueue.peek().getSkillName()))) {
                System.out.println("Failed to receive correct skills");
                return false;
            }
            skillQueue.remove();
        }

        //Test deleting skills
        SDAO.deleteSkill(sb1);
        skillQueue = SDAO.getUserSkills(sb2);
        if(skillQueue.size() != 1 || SDAO.getSkills().size() != originalSkillSize + 1) {
            System.out.println("No skill was deleted");
            return false;
        }
        if(!skillQueue.peek().getSkillName().equals(sb2.getSkillName())) {
            System.out.println("The wrong skill was deleted.");
            return false;
        }

        //Test updating skills
        String oldSkillName = sb2.getSkillName();
        sb2.setSkillName(getRandomString(rn.nextInt(10) + 6));
        SDAO.updateSkill(sb2);
        skillQueue = SDAO.getUserSkills(sb2);
        if(oldSkillName.equals(skillQueue.peek().getSkillName())) {
            System.out.println("Skill name was not changed");
            return false;
        }
        if(!sb2.getSkillName().equals(skillQueue.peek().getSkillName())) {
            System.out.println("Skill name was not updated to the correct name.");
            return false;
        }

        //Tests disconnecting skills
        SDAO.deleteUserSkill(sb2);
        if(SDAO.getUserSkills(sb2).size() != 0 || SDAO.getSkills().size() != originalSkillSize + 1) {
            System.out.println("Skill was not disconnected from user correctly.");
            return false;
        }

        //Use newly created users to make projects and test them
        PrivateProjectDAO PriDAO = new PrivateProjectDAO();
        PublicProjectDAO PubDAO = new PublicProjectDAO();
        Queue<projectBean> privateProjectQueue = PriDAO.getPrivateProject(), publicProjectQueue = PubDAO.getPublicProject();
        int originalPrivateProjectSize = privateProjectQueue.size(), originalPublicProjectSize = publicProjectQueue.size();

        projectBean pri1 = new projectBean(), pri2 = new projectBean(), pri3 = new projectBean();
        projectBean pub1 = new projectBean(), pub2 = new projectBean(), pub3 = new projectBean();
        initProjectBean(pri1, problemProvider2);
        initProjectBean(pri2, problemProvider2);
        initProjectBean(pub3, problemProvider2);
        initProjectBean(pri3, duelProvider2);
        initProjectBean(pub2, duelProvider2);
        initProjectBean(pub1, duelProvider2);
        pri1.setAdminID(admin2.getUserID());
        pri2.setAdminID(admin2.getUserID());
        pri3.setAdminID(admin2.getUserID());

        //Test project creation and retrieval
        PriDAO.setPrivateProject(pri1);
        PriDAO.setPrivateProject(pri2);
        PriDAO.setPrivateProject(pri3);
        PubDAO.setPublicProject(pub1);
        PubDAO.setPublicProject(pub2);
        PubDAO.setPublicProject(pub3);
        if(originalPrivateProjectSize + 3 != PriDAO.getPrivateProject().size() || originalPublicProjectSize + 3 != PubDAO.getPublicProject().size()) {
            System.out.println(originalPrivateProjectSize + " " + PriDAO.getPrivateProject().size());
            System.out.println(originalPublicProjectSize + " " + PubDAO.getPublicProject().size());
            System.out.println("Did not store the correct number of projects.");
            return false;
        }
        if(!(compareProjectBean(pri1, PriDAO.getPrivateProjectFromName(pri1)) && compareProjectBean(pri2, PriDAO.getPrivateProjectFromName(pri2)) &&
                compareProjectBean(pri3, PriDAO.getPrivateProjectFromName(pri3)) && compareProjectBean(pub1, PubDAO.getPublicProjectFromName(pub1)) &&
                compareProjectBean(pub2, PubDAO.getPublicProjectFromName(pub2)) && compareProjectBean(pub3, PubDAO.getPublicProjectFromName(pub3)))) {
            System.out.println("Projects retrieved did not match projects stored");
            return false;
        }
        if(!(compareProjectBean(pri1, PriDAO.getPrivateProjectFromID(pri1)) && compareProjectBean(pri2, PriDAO.getPrivateProjectFromID(pri2)) &&
                compareProjectBean(pri3, PriDAO.getPrivateProjectFromID(pri3)) && compareProjectBean(pub1, PubDAO.getPublicProjectFromID(pub1)) &&
                compareProjectBean(pub2, PubDAO.getPublicProjectFromID(pub2)) && compareProjectBean(pub3, PubDAO.getPublicProjectFromID(pub3)))) {
            System.out.println("Could not get correct project from an ID");
            return false;
        }
        if(PriDAO.getAdminsPrivateProtects(pri1).size() != 3) {
            System.out.println("Couldn't receive the correct number of projects from the Admin search.");
            return false;
        }

        //Test project update
        String newProjName = getRandomString(rn.nextInt(10) + 6);
        pri1.setComplete(false);
        pri1.setProjectName(newProjName);
        PriDAO.updateProject(pri1);
        if(!PriDAO.getPrivateProjectFromID(pri1).getProjectName().equals(newProjName)) {
            System.out.println(PriDAO.getPrivateProjectFromID(pri1).getProjectName());
            System.out.println(newProjName);
            System.out.println("Project name was not edited correctly");
            return false;
        }

        //Test Project Pairing
        pri2.setSolutionProviderID(duelProvider2.getUserID());
        pub2.setSolutionProviderID(solutionProvider2.getUserID());
        PriDAO.setPairing(pri2);
        PubDAO.setPairing(pub2);
        if(PriDAO.getAdminsPairings(pri2).size() != 1) {
            System.out.println("A pairing including an admin was not saved");
            return false;
        }
        if(!solutionProvider2.getUserID().equals(PubDAO.getContributors(pub2).peek().getSolutionProviderID())) {
            System.out.println(solutionProvider2.getUserID() + " " + PubDAO.getContributors(pub2).peek().getSolutionProviderID());
            System.out.println("Project was not correctly matched with solution provider");
            return false;
        }

        //Add media to users and projects
        mediaDAO MDAO = new mediaDAO();
        mediaBean userMedia = new mediaBean(), projectMedia = new mediaBean();
        userMedia.setUserID(solutionProvider2.getUserID());
        projectMedia.setProjectID(pub2.getProjectID());
        userMedia.setAddress(getRandomString(rn.nextInt(10) + 6));
        projectMedia.setAddress(getRandomString(rn.nextInt(10) + 6));

        //Tests ability to set the media
        MDAO.setProjectMedia(projectMedia);
        MDAO.setUserMedia(userMedia);
        Queue<mediaBean> mediaQueue = MDAO.getProjectMedia(projectMedia);
        if(!mediaQueue.peek().getAddress().equals(projectMedia.getAddress())) {
            System.out.println("Project media failed.");
            return false;
        }
        int projectMediaSize = mediaQueue.size();

        mediaQueue = MDAO.getUserMedia(userMedia);
        if(!mediaQueue.peek().getAddress().equals(userMedia.getAddress())) {
            System.out.println("User media failed.");
            return false;
        }
        int userMediaSize = mediaQueue.size();

        //Testing media deletion
        MDAO.deleteProjectMedia(projectMedia);
        if(projectMediaSize - 1 != MDAO.getProjectMedia(projectMedia).size()) {
            System.out.println("Project media wasn't deleted");
            return false;
        }

        MDAO.deleteUserMedia(userMedia);
        if(userMediaSize - 1 != MDAO.getUserMedia(userMedia).size()) {
            System.out.println("User media wasn't deleted");
            return false;
        }
        return true;
    }

    private void initUserBean(providerBean bean) {
        Random rn = new Random();
        bean.setUserName(getRandomString(rn.nextInt(10) + 6));
        bean.setPassword(getRandomString(rn.nextInt(10) + 6));
        bean.setAffiliation(getRandomString(rn.nextInt(10) + 6));
        bean.setLocation(getRandomString(rn.nextInt(10) + 6));
        bean.setEmail(getRandomString(rn.nextInt(10) + 6));
        bean.setGroup(rn.nextInt(2) == 1);
        bean.setActive(rn.nextInt(2) == 1);
    }

    private void initContactBean(contactBean bean, providerBean bean2) {
        Random rn = new Random();
        bean.setUserID(bean2.getUserID());
        bean.setType(getRandomString(rn.nextInt(10) + 6));
        bean.setAddress(getRandomString(rn.nextInt(10) + 6));
    }

    private void initProjectBean(projectBean bean, providerBean pBean) {
        Random rn = new Random();
        bean.setProjectProviderID(pBean.getUserID());
        bean.setProjectName(getRandomString(rn.nextInt(10) + 6));
        bean.setProposal(getRandomString(rn.nextInt(10) + 20));
    }

    private Boolean compareUserBeans(providerBean A, providerBean B) {
        if(!A.getUserName().equals(B.getUserName())) { return false; }
        if(!A.getAffiliation().equals(B.getAffiliation())) { return false; }
        if(!A.getLocation().equals(B.getLocation())) { return false; }
        if(!A.getEmail().equals(B.getEmail())) { return false; }
        if(A.getGroup() != B.getGroup()) { return false; }

        return true;
    }

    private Boolean compareContactBean(contactBean A, contactBean B) {
        if(!A.getAddress().equals(B.getAddress())) {return false;}
        if(!A.getType().equals(B.getType())) {return false;}
        if(!A.getUserID().equals(B.getUserID())) {return false;}
        return true;
    }

    private Boolean compareProjectBean(projectBean A, projectBean B) {
        //System.out.println(B.getProjectProviderID());// + " " + B.getProjectProviderID());
        if(!A.getProjectProviderID().equals(B.getProjectProviderID())) { return false; }
        //System.out.println(A.getProjectName() + " " + B.getProjectName());
        if(!A.getProjectName().equals(B.getProjectName())) { return false; }
        if(!A.getProposal().equals(B.getProposal())) { return false; }
        return true;
    }

    public Boolean testWrapper() throws java.sql.SQLException {
        if(DAOTester()) {
            System.out.println("Passed.");
        }
        return true;
    }

    protected String getRandomString(int l) {
        String SALTCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        StringBuilder salt = new StringBuilder();
        Random rnd = new Random();
        while (salt.length() < l) { // length of the random string.
            int index = (int) (rnd.nextFloat() * SALTCHARS.length());
            salt.append(SALTCHARS.charAt(index));
        }
        String saltStr = salt.toString();
        return saltStr;

    }

    public static void main(String[] args) throws java.sql.SQLException {
        test tester = new test();
        tester.testWrapper();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            test tester = new test();
            tester.testWrapper();
        }
        catch (SQLException e) {}
    }
}