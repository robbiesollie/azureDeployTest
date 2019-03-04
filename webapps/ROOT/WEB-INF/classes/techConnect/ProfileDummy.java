package techConnect;
import DummyProjects.ProfileDummyBean;

import java.util.LinkedList;
import java.util.List;

public class ProfileDummy {

    public List<ProfileDummyBean> getProfiles() {
        List<ProfileDummyBean> beanQueuen = new LinkedList<>();
        for (int i = 0; i < 7; i++) {
            ProfileDummyBean bean = new ProfileDummyBean();
            bean.setPicture(getProfilePic());
            bean.setName(getName().get(i));
            bean.setOccupation(getOccupation().get(i));
            bean.setWork(getWork());
            bean.setPhone(getPhone());
            bean.setEmail(getEmail());
            bean.setGithub(getGithub());
            bean.setLinkedIn(getLinkedIn());
            bean.setSummary(getSummary());
            bean.setDegree(getDegree());
            bean.setYear(getYear());
            bean.setGpa(getGPA());
            bean.setSkills(getSkills());
            bean.setResearchInterests(getResearchInterests());
            bean.setExperienceTitle(getExperienceTitle());
            bean.setExperienceBody(getExperienceBody());
            bean.setExpertise(getExpertise());
            bean.setProjects(getProjectTitles());

            beanQueuen.add(bean);
        }
        return beanQueuen;
    }

    private List<String> getProfilePic() {
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

    private List<String> getName() {
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

    private List<String> getOccupation() {
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

    private String getWork() {
        return "Github";
    }

    private String getPhone() {
        return "231-123-1234";
    }

    private String getEmail() {
        return "IAmAnEmailYay@gmail.com";
    }

    private String getGithub() {
        return "https://github.com/";
    }

    private String getLinkedIn() {
        return "https://www.linkedin.com/";
    }

    //2nd section
    private String getSummary() {
        return "The standard Lorem Ipsum passage, used since the 1500s\n" +
                "\"Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.\"\n" +
                "\n" +
                "Section 1.10.32 of \"de Finibus Bonorum et Malorum\", written by Cicero in 45 BC\n" +
                "\"Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aperiam, eaque ipsa quae ab illo inventore veritatis et quasi architecto beatae vitae dicta sunt explicabo. Nemo enim ipsam voluptatem quia voluptas sit aspernatur aut odit aut fugit, sed quia consequuntur magni dolores eos qui ratione voluptatem sequi nesciunt. Neque porro quisquam est, qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit, sed quia non numquam eius modi tempora incidunt ut labore et dolore magnam aliquam quaerat voluptatem. Ut enim ad minima veniam, quis nostrum exercitationem ullam corporis suscipit laboriosam, nisi ut aliquid ex ea commodi consequatur? Quis autem vel eum iure reprehenderit qui in ea voluptate velit esse quam nihil molestiae consequatur, vel illum qui dolorem eum fugiat quo voluptas nulla pariatur?\"";
    }

    private List<String> getDegree() {
        List<String> degreeList = new LinkedList<>();
        degreeList.add("Masters in Computer Science and Engineering");
        degreeList.add("BSc. in Computer Science and Engineering");
        return degreeList;
    }

    private String getYear() {
        return "1997";
    }

    private String getGPA() {
        return "4.0";
    }

    private List<String> getSkills() {
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

    private String getResearchInterests() {
        return "Software Engineering, Machine Learning, Image Processing,\n" +
                "                        Computer Vision, Artificial Neural Networks, Data Science,\n" +
                "                        Evolutionary Algorithms.";
    }

    private List<String> getExperienceTitle() {
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

    private String getExperienceBody() {
        return "Lorem Ipsum is simply dummy text of the printing and typesetting industry.";
    }

    private String getExpertise() {
        return "Lorem Ipsum is simply dummy text of the printing and typesetting industry.";

    }

    private List<String> getProjectTitles() {
        List<String> titleList = new LinkedList<>();
        titleList.add("America's T4T App");
        titleList.add("Work among the Naxi");
        titleList.add("EV and discipleship method in Indonesia");
        titleList.add("Global Language Assessment Program");
        titleList.add("SA Research Project");
        titleList.add("Network Training and Mobilization");
        titleList.add("Southern Cross Tech Connect");

        return titleList;
    }

}



