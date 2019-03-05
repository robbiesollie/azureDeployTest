package techConnect;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.RandomUtils;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class ProfileDummy {
    NumberFormat numberFormat = new DecimalFormat("#0.00");
    private static final String ALPHA_NUMERIC_STRING = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789abcdefghijklmnopqrstuvwxyz";


    public List<String> setProfilePic() {
        List<String> imageLinks = new LinkedList<>();
        imageLinks.add("\"assets/TechConnectCats/linktocat.png\"");
        imageLinks.add("\"assets/TechConnectCats/bear-cavalry.png\"");
        imageLinks.add("\"assets/TechConnectCats/bouncercat.png\"");
        imageLinks.add("\"assets/TechConnectCats/dojocat.jpg\"");
        imageLinks.add("\"assets/TechConnectCats/femalecodertocat.png\"");
        imageLinks.add("\"assets/TechConnectCats/foundingfather_v2.png\"");
        imageLinks.add("\"assets/TechConnectCats/riddlocat.png\"");
        return imageLinks;
    }

    public List<String> setName() {
        List<String> namesList = new LinkedList<>();
        namesList.add("LinkCat");
        namesList.add("BearCat");
        namesList.add("BouncerCat");
        namesList.add("DojoCat");
        namesList.add("CoderCat");
        namesList.add("FoundingFatherCat");
        namesList.add("RiddlerCat");
        return namesList;
    }

    public List<String> setOccupation() {
        List<String> occupationList = new LinkedList<>();
        occupationList.add("Adventurer");
        occupationList.add("Bear");
        occupationList.add("Bouncer");
        occupationList.add("Dojo Teacher");
        occupationList.add("Coder");
        occupationList.add("Government");
        occupationList.add("Comedian");
        return occupationList;
    }

    public String setMissionaryWork(){
        return "Missionary Aviation Fellowship";
    }
    public String setWork() {
        return "Github";
    }

    public String setPhone() {
        return "231-123-1234";
    }

    public String setEmail() {
        return "IAmAnEmailYay@gmail.com";
    }

    public String setGithub() {
        return "https://github.com/";
    }

    public String setLinkedIn() {
        return "https://www.linkedin.com/";
    }

    //2nd section
    public String setSummary() {
        return "The standard Lorem Ipsum passage, used since the 1500s\n" +
                "\"Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.\"\n" +
                "\n" +
                "Section 1.10.32 of \"de Finibus Bonorum et Malorum\", written by Cicero in 45 BC\n" +
                "\"Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aperiam, eaque ipsa quae ab illo inventore veritatis et quasi architecto beatae vitae dicta sunt explicabo. Nemo enim ipsam voluptatem quia voluptas sit aspernatur aut odit aut fugit, sed quia consequuntur magni dolores eos qui ratione voluptatem sequi nesciunt. Neque porro quisquam est, qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit, sed quia non numquam eius modi tempora incidunt ut labore et dolore magnam aliquam quaerat voluptatem. Ut enim ad minima veniam, quis nostrum exercitationem ullam corporis suscipit laboriosam, nisi ut aliquid ex ea commodi consequatur? Quis autem vel eum iure reprehenderit qui in ea voluptate velit esse quam nihil molestiae consequatur, vel illum qui dolorem eum fugiat quo voluptas nulla pariatur?\"";
    }

    public List<String> setDegree() {
        List<String> degreeList = new LinkedList<>();
        degreeList.add("Masters in Computer Science and Engineering");
        degreeList.add("BSc. in Computer Science and Engineering");
        return degreeList;
    }

    public int setYear() {
        return 1997;
    }

    public String setGPA() {
        return "4.0";
    }

    public List<String> setSkills() {
        List<String> percentageList = new LinkedList<>();
        percentageList.add("65%");
        percentageList.add("90%");
        percentageList.add("30%");
        percentageList.add("20%");
        percentageList.add("80%");
        percentageList.add("40%");
        percentageList.add("10%");

        return percentageList;
    }

    public String setResearchInterests() {
        return "Software Engineering, Machine Learning, Image Processing,\n" +
                "                        Computer Vision, Artificial Neural Networks, Data Science,\n" +
                "                        Evolutionary Algorithms.";
    }

    public String setMissionaryInterests(){
        return "Furthering the mission of Christ";
    }

    public List<String> setExperienceTitle() {
        List<String> expTitle = new LinkedList<>();
        expTitle.add("Software Engineer at Twitter");
        expTitle.add("Software Engineer at LinkedIn");
        expTitle.add("Software Engineer at Github");
        expTitle.add("Computer Scientist at Facebook");
        expTitle.add("Computer Scientist at Google");
        expTitle.add("Wycliffe Bible Translator");
        expTitle.add("Missionary Aviation Fellowship Drone Project");
        return expTitle;
    }

    public String setExperienceBody() {
        return "Lorem Ipsum is simply dummy text of the printing and typesetting industry.";
    }

    public String setExpertise() {
        return "Lorem Ipsum is simply dummy text of the printing and typesetting industry.";

    }

}



