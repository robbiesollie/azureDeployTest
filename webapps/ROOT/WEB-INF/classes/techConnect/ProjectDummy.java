package techConnect;

import DummyProjects.ProjectDummyBean;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ProjectDummy {

    public ProjectDummy project(){
        return new ProjectDummy();
    }

    public List<ProjectDummyBean> getProjects() {
        List<ProjectDummyBean> beanQueuen = new LinkedList<>();
        for (int i = 0; i < 7; i++) {
            ProjectDummyBean bean = new ProjectDummyBean();
            bean.setPicture(getPic().get(i));
            bean.setTitle(getTitle().get(i));
            bean.setDate(getDate().get(i));
            bean.setContact(getContact().get(i));
            bean.setNeed(getNeed().get(i));
            bean.setRequest(getRequest().get(i));
            bean.setWho(getWhoNeed().get(i));
            bean.setLanguage(getLanguageNeed().get(i));
            bean.setExtra(getExtra().get(i));
            beanQueuen.add(bean);
        }

        return beanQueuen;
    }

    private List<String> getPic() {
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

    private List<String> getTitle() {
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

    private List<String> getDate(){
        List<String> dateList = new LinkedList<>();
        dateList.add("October 16, 2014");
        dateList.add("January 28, 2015");
        dateList.add("February 4, 2015");
        dateList.add("March 17, 2015");
        dateList.add("June 14, 2015");
        dateList.add("2015");
        dateList.add("April 28, 2015");
        return dateList;
    }
    private List<String> getContact(){
        List<String> contactList = new LinkedList<>();
        contactList.add("Kevin Baggett\n" +
                "kevintbaggett@gmail.com");
        contactList.add("Name:  Matthew Bandy\n" +
                "Email Address: MSB863786@IsleConx.com");
        contactList.add("Name: Adam Winters\n" +
                "Email Address: adw499764@eastofdateline.com");
        contactList.add("Name: Will Ellis\n" +
                "Email Address: wse815775@eurasianetworks.com");
        contactList.add("Larry and Jeremy");
        contactList.add("N/A");
        contactList.add("John Randall\n" +
                "JCR929215@AsiaNetRising.com\n" +
                "www.southerncrossproject.org\n" +
                "Facebook Southern Cross Project\n");
        return contactList;
    }
    private List<String> getNeed() {
        List<String> needList = new LinkedList<>();
        needList.add("pastoral application and form");
        needList.add("Creating a cross platform app which can be downloaded on pretty much any phone in China");
        needList.add("Web App Development to be bridge seekers to the truth and disciple new believers");
        needList.add("A website and/or other deployment solution for a Global Language Assessment Program");
        needList.add("Develop an initial pass at an affinity database along with a team of folks to work on getting our data stored and secured");
        needList.add("Have a series of websites that has three user interfaces and works on three different levels.");
        needList.add("Southern Cross Project would like to look into the possibility of sending “push notifications” to Chinese tourists who have smart phones.");
        return needList;
    }

    private List<String> getRequest(){
        List<String> whyList = new LinkedList<>();
        whyList.add("It would be primarily aimed at the leader.  The app would open with the 3/3rds idea.  " +
                "I'm imagining three columns on the screen that the leader can touch.1st 1/3 - All the questions" +
                " that are normally included in this session.  Pastoral care focused.  It would be nice if this section" +
                " had an area so the leader could input notes that he could use to remember for the next week.  " +
                "After finishing, the leader can move to the next 1/3 section. 2nd 1/3 -  This is the meat of the app." +
                "  I would like to look like a template for how the small group should flow.  I have an example of this " +
                "in a Word format through Acts.  In short: Prayer, Praise, Remember last passage/story, context of this story," +
                " the oral story and the biblical text of the story (each group could decide whether to listen/tell the " +
                "story or read the passages), SPEKA questions (possibly adapted), Prayer to close.  After finishing, the " +
                "leader can move to the next 1/3 section. I am going to be working in January and February " +
                "with one of the guys I'm discipling to record simple songs (him and the guitar or keyboard).  " +
                "The app would have the words to the song, the chords to the song, and would also have the recording " +
                "so they could just play the song over speakers or their phone if they wanted.  It would be " +
                "nice if there was some way that the Bible passage/storying sets could be in \"packages\" that each group " +
                "could set up as they used the app.  I'm thinking about something like the Fighter Verse app where you can " +
                "choose a set of verses to memorize and then the app works through those verses. 3rd 1/3 - This section " +
                "would look a lot like the first third.  It would have questions about obedience and how the leader could" +
                " pray for or help the group members.  It would be nice if he could take notes here.  If the notes from " +
                "this section could merge into the first 1/3 for the next week that would be cool and help the leader with" +
                " pastoral care.  It might also be nice for record keeping purposes if there were a list where the person" +
                " could keep track of who came to the group, if they are a believer, if they are baptized, etc. etc. ");
        whyList.add("I am looking for someone overseas (i.e. Thailand or the States) to take up a technical project for " +
                "our work among the Naxi creating a cross platform app which can be downloaded on pretty much any phone in China." +
                "  The content will contain our work of Naxi bible recordings and a few Naxi songs recorded.  We want to add to " +
                "the content over the years as new resources become available.  We need the app source to be out of country and" +
                " secure while also able to deal with the Great Firewall of China in an effective way.    We also want to run " +
                "google analytics to see where anyone that downloads it are using the app (i.e. general area).  We want it to be" +
                " used on iPhones and on other Chinese phone platforms.  Again, I need someone to actually work on the technical " +
                "side of setting up the app completely themselves in support of our work and all I would need to do would be to " +
                "send them the files and consult with them on how all of this would work.  I am committed to the project for the long haul.\n" +
                "The Naxi Bible App is strategic at this stage in the Church Planting process due to the need for wide seed sowing, " +
                "locals to hear the Bible in their own heart language (as 99.9% of them cannot read their heart language) so hearing" +
                " is the most effective way of reaching them, and MP3 players are much too expensive, bulky and risky to do things " +
                "on a large scale – whereas an app would be free for locals to download and pass along to others.  This app will be " +
                "very important in the future also related to trainings and helping churches have a form of church – with helps related" +
                " to worship, Scripture readings and storying. ");
        whyList.add("We need assistance in developing a website and app for our EV and discipleship method in Indonesia. " +
                " There is a good chance we can get help with the website in country but certainly need help with app development." +
                "  Here’s the premise behind this project.\n" +
                "a.\tJakarta will be our target group but of course this project will spread all over Indonesia.  Jakarta is the number" +
                " 2 facebook user and number 1 twitter user in the world respectfully.  We began thinking how to use facebook and " +
                "twitter to share the gospel, bridge seekers to the truth and disciple new believers.  We already have several videos" +
                " that simulate our EV and early discipleship process.  These will go on our webpage once it’s developed and we’ll " +
                "use facebook and twitter to share links to this website.  We hope the website will also have audio and text for those" +
                " with slower internet connections.  We also want to compartmentalize the website so each user is required to view/study " +
                "each lesson before they can move on.  \n" +
                "b.\tWe also want an app that compliments the above process with the same materials, audio, video, text and an in app " +
                "interface that allows easy navigation.  When it comes to app develop I have no clue where to begin or really what to even ask." +
                "  So we’ll need lots of help here.  \n" +
                "We are currently seeing God do some amazing things in Jakarta." +
                "  The short of it is that there are approximately 3000 new believers since September 14th, 2014 and 100+ house churches." +
                "  This has all occurred through traditional EV and Discipleship means.  We already use 3G for the bible (kitabsuci.mobi) " +
                "or other apps but how can we reach the 18-24 year olds that make up 52% of facebook users in Indonesia? Indonesia has " +
                "70+ million facebook users and some 100+ million people have access to internet with that number to increase dramatically" +
                " over the next few years as infrastructure is being developed now.  3G is also available and rightfully so since there are" +
                " over 300 million smartphones, tablets and other devices in Indonesia.  It gives us and others free access into many lives," +
                " homes and communities that would otherwise be off limits and logistically challenging to engage.  We have 1000’s already on" +
                " the frontlines here being discipled who would be ready to assist with face to face follow up and discipleship of new believers " +
                "through this project.  ");
        whyList.add("This site/program would provide a consistent and equitable language proficiency assessment means " +
                "which could be deployed to any company language learner at the needed time(s). Language learning is a " +
                "critical skill and endeavor in reaching every tribe, language, people and nation. Assessments provide " +
                "helpful feedback in growing in depth and breadth of learning, and in addition, the Apprentice program " +
                "requires a certain level of language proficiency (and some Affinities even require proficiency beyond " +
                "this level for some positions). This site/program would streamline the assessment process for learners," +
                " and especially for coaches.");
        whyList.add("I have been tasked by Todd Lafferty, our AGSL, and Duane Falk, our head researcher, with the development " +
                "of an Affinity-wide database to hold both our static data (geography, people groups, teams, etc.) and our dynamic " +
                "data (churches, locations, trainings, etc.).  The idea we discussed was hosting this data securely and providing " +
                "a set of input and output parameters that various client software could access and use.  The research team in the " +
                "East cluster has already developed a database program for their work using a local Indian Christian developer.  " +
                "However, there are security concerns with it.  We are, however, thinking that we would like to use this Indian firm" +
                " to develop an initial pass at an affinity database, but we understand that it probably won’t be all that we would want." +
                "  Therefore, I know I hinted at this when we talked, but now am officially asking:  Larry – would you be able to help us get a few things:\n" +
                " \n" +
                "1.       A team of folks to work on getting our data stored and secured?\n" +
                "2.       A team to take the client that gets developed by the Indian brothers and turn it into something fast and slick." +
                "  I have some very specific requirements and have been doing some self-coding speed tests using the DevExpress tools for Windows " +
                "(It’s a great toolkit).  BTW – Windows will be the initial client of choice because our national Indian Christian networks all " +
                "use windows in the affinity, and there will be a variation client version for nationals to use to track their own work.\n" +
                "3.       Ultimately, after the new CPPI is in place, we would need a team to develop a link between it and our data so that the data " +
                "could be properly processed and uploaded easily to CPPI.\n" +
                " \n" +
                "Concerning timeframe:  Sadly, the Indian brother who we had contracted to procure and produce static data for us went blind in one " +
                "eye and broke his hip in 3 places about 3 months ago and work on our static data has ground to a halt.  I’m hoping to get all of his " +
                "static data via Dropbox while on STAS.  After I have it, we would start there by getting it hosted and secure.  I could also develop the " +
                "tables we would require for the dynamic data.  On the client program side of things, work will not realistically start until we return from STAS" +
                " and Brad Kinsey (South Asia researcher and my partner in this project) and I are able to go to Calcutta to meet with the developers of the " +
                "East Cluster’s database client.  So timeframe-wise, I could possibly have some work for a team by March, but it may be as late as June or July " +
                "before we would begin in earnest.");
        whyList.add("The Goal: For both our stateside partners and personnel to have access to the latest and greatest resources and best practices at any time.  It needs to be simple to use and modifiable as needed with little “bottleneck” control.\n" +
                "\n" +
                "The overall idea: Have a web-site (a series of websites actually) that has three user interfaces and works on three different levels. The three user-interfaces (end users) would be 1. National partners, 2. Our personnel, and 3. USA Constituency.  There would need to be three separate user interfaces and that are linked together in different ways. Since there’s three different end-users, I propose three corresponding “tiers” of websites. \n" +
                "\n" +
                "Tier One: Team level\n" +
                "End User: National Partners, Teammates and USA Constituency\n" +
                "Maintenance: By the team\n" +
                "Public/Private: Public\n" +
                "Content: Whatever the team deems necessary.  Obviously, the team would need to control their content in terms of security.\n" +
                "Layout: Each team should have the freedom to lay it out how they want.  Templates are available and are simple to modify.  Our new site is being built by our teammate.  The link temporarily is here (http://truthproject.businesscatalyst.com/index.html).  Our permanent site is www.zhenlixiangmu.com \n" +
                "Link to other “tiers”: None.\n" +
                "Reasoning: This allows each team the flexibility to provide what and how they do what they do in their given context.  They obviously must be careful not to leak where they serve specifically or the identity of anyone they work with.\n" +
                "\n" +
                "Tier Two: Affinity Level\n" +
                "End User: Co-workers within the IMB\n" +
                "Maintenance: By team and the affinity\n" +
                "Public/Private: Private\n" +
                "Content: This would be on the intranet and not available to the public.  The content should largely be determined by the teams as they see fit.  It is important to be end-user driven.  This site is not open to the public, so it does not need to be “censored”. Various IMB personnel within the East Asia Affinity should be able to put up whatever best practices and trainings they feel are effective.  Links can be provided to the “uploaders” email address or team site to allow for questions and follow-up.  \n" +
                "Lay-out: Needs to be Ultra Simple with just a few large categories to choose from.  I see that just five categories would suffice and sub-categories can be listed within those five.  If this is tied into the existing East Asia site, I propose a complete redo.  I see no more than five main categories be listed on the East Asia main site.  These could be 1. Personnel Needs/Bureaucracy, 2. Prayer (and resources), 3. Cluster/Team Websites, 4. Training/Best Practices, 5. UPG/UUPG/National Partner Network (In proposal #2). \n" +
                "1.\tPersonnel Needs/Bureaucracy: Driven, controlled and populated by the affinity leadership.\n" +
                "2.\tPrayer (and resources): Driven and controlled by the affinity and partially populated by personnel.  \n" +
                "3.\tCluster/Team Websites: Within this is just links to sites developed and maintained by individual clusters or teams.\n" +
                "4.\tTraining/Best Practices: Driven, controlled and populated by personnel.  \n" +
                "5.\tUPG/UUPG/National Partner Network: Driven, controlled and populated by personnel.  \n" +
                "6.\tIn all of this, support would need to do occasional maintenance and cleanup.\n" +
                "Link to other “tiers”: Should one-way link to cluster and team websites even though those sites do not link back.  \n" +
                "Reasoning: This allows the affinity leadership to communicate what they want everyone to know and various personnel to be able to share what has worked for them with everyone else.  \n" +
                "How the Training/Best Practices Page works: Within this page there should be five more categories.  1. Evangelism, 2. Short Term Discipleship, 3. Long Term Discipleship, 4. Leadership Development, 5. Cross-Cultural.  Individual co-workers could then upload whatever materials and descriptions they feel are the best practices within their ministry.  It would need to be a simple site where people could easily upload and download various resources as they see fit.  There would not need to be much control and there would need to be some sort of dialogue…chatroom style…of forum where people could discuss the “ins” and “outs” of various trainings and strategies. When this is done, an email should automatically be sent notifying everyone that a new resource is available and could even provide the title of “best practice” in the subject line.  In this way, if a specific training or strategy is done in a multiplicity of ways, then a multiplicity of the same training in different formats could be uploaded with a simple description of what the training is and how it works.  Eventually, some form of organization would need to be employed…I have ideas on that as well.\n" +
                "\n" +
                "Tier Three: USA Interface level\n" +
                "End User: USA Constituency\n" +
                "Maintenance: By the affinity\n" +
                "Public/Private: Public\n" +
                "Content: This is a public site. The content will be what the affinity leadership deems useful as an “overall” strategy to present to our USA constituents.  The content would be officially approved and supported by the Affinity Leadership.\n" +
                "Layout: Very simple with 3 key categories.  1. Resources for advocacy for East Asian Peoples., 2. Training Strategy Resources, 3. Maybe even links to certain team websites…this might connect too many dots though. If connecting to team websites is too high of a security risk, then videos describing various Macro-strategies from around East Asia demonstrating how the trainings work would be a good alternative.  \n" +
                "Link to other “tiers”: The IMB site.  (maybe team sites)\n" +
                "Reasoning: This would help provide a “united front” if you will, to our stateside partners.  The point is that we’d be working to be a blessing to our USA partners to help them do and be what God has called them to do and be.  Instead of only asking for help, prayer and resources for our work, we’d be demonstrating to them that our goal is to build God’s kingdom and bless them with no strings attached.  I truly believe we have a lot to offer the church in the USA and this could be one way to bless them without extraordinary amounts of time and effort away from our main task of reaching East Asian Peoples. \n" +
                "\n" +
                "In summary: I propose three “tiers” of websites for the sake of our national partners, field personnel and our USA partners.  As one moves up the tiers of websites:\n" +
                " \tField personnel move from more control over content to less control\n" +
                " \tContent moves from less scrutiny to more scrutiny as to what is presented\n" +
                " \tThe Affinity Leadership moves from less control to more control\n" +
                "\t\n" +
                "Overall Rationale: I know that some conversations along these lines have already taken place, but I’d like to really pursue the idea of making it an affinity level initiative…especially in light of David Platt’s last email.  I believe we have full capacity to solidify partnership with many SBC churches who are currently wary of the IMB and help us fulfill what needs to be done with our national partners IF we do an effective job of partnering with them and helping them as much as they help us.  So, with that said, here’s the background information…\n" +
                "\n" +
                "1.\tDonn helped me form a partnership with Mississippi by introducing me to Ken Rhodes.  During my last STAS, Ken Rhodes paid to get me to MS and take tours of several associations and churches.  The result was a partnership where they send as many teams of pastors as we can handle.  To date, we’ve had 14 teams of MS pastors and with each team we cast vision and give an overview of our strategy and training regimen.  Each team asks if they can have the resources we use and most of the teams ask if we can help train their own churches back in the states.  The requests are too many for us to handle, so we do what we can without taking away from the work.  Several of the pastors have asked me multiple times if our East Asia strategies and resources will be taught in our SBC seminaries.  Others have asked if we can at least have video resources showing how to use each resource so that they can utilize them in their own contexts.\n" +
                "2.\tDonn and Victor introduced me to FBC Central Florida and they have officially partnered with us and have sent out 3 teams so far with 4 more in the works for 2015.  Each of their teams includes pastors from other churches…including some of their church plants.  They have now begun to use our resources with all of their church plants.  One of which is implementing the Vision Casting and the Andrew Project as well as training other pastors.\n" +
                "3.\tDonn also introduced me to his parents-in-law’s church in South Carolina.  They have sent out a couple of teams so far, and plan to send 2 more in 2015.  They invited Donn and I to a missions conference where we helped with training while on STAS last year and have begun to use our Small Group Training, Healthy Disciple and Andrew Project materials.  Their commitment to what we’re doing has increased substantially and so has our commitment to them.  \n" +
                "4.\tJust last month I had 3 USA pastors in my house along with half a dozen local partners and we talked through our training system.  Each USA pastor was excited about different aspects of what we have to offer and each of them took back different English translated resources.  We worked through how to use the different materials that they wanted according to their own local contexts, and now we have 3 pastors (and churches) that are more committed to what we’re doing than ever!  \n" +
                "5.\tWhile on STAS, 13 of the 15 churches I spoke in substantially increased their LMCO giving year-on-year.  That wasn’t entirely because I spoke in those churches, but the personal connection was certainly a part of it.  In addition to all of that, I sat down with the key leaders in each of those churches and presented what we do and why we do it.  All of them expressed how they have never had a missionary “offer” something.  They were used to missionaries “asking” for something.  I think we can make the tide turn in our SBC churches (and non-SBC churches) if we “shock” them with our generosity.\n" +
                "6.\tThe Buntains feel certain that churches in the USA would be excited about the various kinds of trainings we have to offer and have offered to ask USA churches if they’d like to be involved in this project.\n" +
                "7.\tWe, as missionaries, have a great deal to offer the church in the west.  We’ve done a poor job of communicating that and this can help change the message.  God has given us as sent-out ones (Eph. 4:11…I know we’re not apostles like the 1st century apostles, but we are sent out…we are evangelists, teachers and pastors) to equip the saints (Eph. 4:12) for the work of ministry to grow the body of Christ.  We, as missionaries, learn all kinds of lessons that the church in the USA can benefit from.\n" +
                "\n" +
                "We are already going to do this on a small scale within our own team, but I think this could be much more effective on an Affinity-wide scale. I don’t foresee this being a large time/resource consumer, but it would require the use of video and sound bites to help make each training system more effective.\n" +
                "\n" +
                "It would also be easier to have a discussion about these details as opposed to lengthy emails to pull this off.  I think this will also show Richmond how we in East Asia are working to be blessed to be a blessing and are on the cutting edge of being effective at equipping the church to finish the task!\n" +
                "\n" +
                "Action Plan: My team has already done a lot of research on this and we have a pretty good feel for how to possibly make this thing work.  \n" +
                "1.\tTechnology Team: This is anything but a full-time roll for anyone, but we would need to put together a team that can collaborate.  I don’t know the intricacies of how our company handles the intranet sites and how they’re built.  I think the team could be made up of some tech-savy field personnel, whoever is responsible for our intranet sites and some USA partners.  I plan to ask my USA partners if any of them would be interested in 1. Helping build the site (or at least team sites if our tech department doesn’t want outsiders helping with the intranet site) and 2. Help with hosting websites as well as costs. The Buntains are actively recruiting on their end as well.  Once we have a clearer perspective on what direction to take all of this, I think we can help them better know what exactly it is that we need.\n" +
                "2.\tIntegrating with the Training Media Team:  The findings of the recent survey done by the Media Training Team could be invaluable to this process.  Their findings certainly may impact a significant portion of this project.\n" +
                "3.\tSolving some interactive issues:  Making the Tier Two site interactive where people can upload/download as they please will be a challenge.  I think we can find people within our own company or USA constituency who can help solve those issues so that there’s as little maintenance on the site as possible.  \n" +
                "4.\tPresentation: I have communicated with Nancy Addison about this, and she is on-board with her folks helping us out with recordings, stories and videos.\n" +
                "5.\tTiers One and Two: Tiers one and two can be built simultaneously since they do not depend on each other.  For many of our teams, the idea of a website might be intimidating but I think our team has found a way to make it very simple. Sites like www.godaddy.com have premade templates and hosting options that make site building very simple and very inexpensive.  My teammate found a plethora of other templates for free or very cheap and with simple modifications could be done to build our current site.  For how to proceed with Tier Two, I’d need to talk to whoever is in charge of our intranet site for protocols and to see what resources we have there.\n" +
                "6.\tTier Three: I think once we get tier two up and running, then the focus could shift to Tier Three since many of the resources, strategies and multi-media presentations may be derived from Tier Two and sometimes even some of the Tier One sites.  I would imagine the affinity leadership would need to approve whatever is placed on that site since the company may be claiming support or at least some form of endorsement for whatever is placed there. \n");
        whyList.add("Southern Cross Project would like to look into the possibility of sending “push notifications” to Chinese tourists who have smart phones.\n" +
                "\n" +
                "•\tThe concept is that as they come near our distribution point their cell phone would receive a push notification to download an app or look at a web site.\n" +
                "\n" +
                "We have looked at some YouTube videos concerning geofence, ibeacons and push notification.    But since we are not software developers this is beyond our comprehension.\n" +
                "\n" +
                "Most of the Chinese smart phone tourists will not have Taiwan service.   But they may have blue tooth or WI-FI turned on.\n" +
                "\n" +
                "So another idea is to set up a mobile Wi-Fi signal using a cell phone hot spot.   \n" +
                "\n" +
                "•\tThe tourists would need to get a push message then get on the limited access Wi-Fi to view a Gospel website or download a public domain Bible App like youversion.com \n");
        return whyList;
    }

    private List<String> getWhoNeed(){
        List<String> whoList = new LinkedList<>();
        whoList.add("Pastors");
        whoList.add("We will encourage all of the Naxi brothers and sisters in town to begin using this app and then it " +
                "will begin to branch out to outlying areas in numerous Naxi villages");
        whoList.add("We hope everyone and anyone.  We do not intend for this to replace house church or one on one discipleship." +
                "  This tool will be a bridge to a life changing relationship through Christ and community with other believers." +
                "  We will group people as quickly as possible after they have come to faith and been obedient to believer’s baptism." +
                "  We will share this tool with local churches, other GCC’s, like-minded mission organizations and anyone else " +
                "interested.  However we plan to retain complete ownership of the content. ");
        whoList.add("The use of the site/program would begin in NAME and be made available to the other Affinities as" +
                " needed/requested." + "\n" + "Could be extended to as many language learners as the teachers/coaches " +
                "(and servers!) can handle\n" + "Apart from the Naxi themselves, some foreigners who are wanting to study " +
                "Naxi now or in the future");
        whoList.add("Indian Firm");
        whoList.add("N/A");
        whoList.add("100 million Chinese tourists are traveling outside of China every year.   They are traveling to many countries where East Asia teams are seeking to reach the Chinese diaspora.  Using this concept: with a small local Chinese volunteer team, and some site signage it will be easy and low cost to interact with these tourists at multiple sites around the world.   Currently Southern Cross Project is limited by the cost for material handling, storage and international shipping to provide multiple site interaction with these Chinese tourists.    This application might possibly also be applied to in country interaction: Harvest Initiative https://vimeo.com/96947216, \n" +
                " http://yesu.me/\n");
        return whoList;
    }

    private List<String> getLanguageNeed(){
        List <String> languageList = new LinkedList<>();
        languageList.add("N/A");
        languageList.add("The Naxi language of Southeast Asia.");
        languageList.add("Indonesian will be our focus but there are many other heart languages here.  90+ of the population" +
                " speaks Indonesian and close to 100% of young people speak Indonesian\n" + "Indonesian will be our focus but there" +
                " are many other heart languages here.  90+ of the population speaks Indonesian and close to 100% of young people speak Indonesian\n" +
                "We hope other IMB personnel and GCC’s around the world can take our model and apply it where they are.  The content may be altered " +
                "or changed to suit their culture or majority religion.  As mentioned before, this will be available to anyone to utilize and a bridging" +
                " tool to church and developing followers of Christ.");
        languageList.add("Users will be our personnel, though this could expand later to include others partnering with" +
                " us. Therefore at the start, they will all speak English, though if the program were expanded, other " +
                "languages would need to be taken into account (i.e. Korean, Spanish, Chinese).");

        languageList.add("N/A");
        languageList.add("N/A");
        languageList.add("This work will performed in mandarin Chinese with limited English or local country languages.\n" + "A.\tThis application might possibly also be applied to in country interaction.  (see above)\n" +
                "B.\tOther Affinities also have literature distribution projects.   Examples are: lights for Asia (Thailand) Joseph York jyacts18@yahoo.com,  Operation transit   www.optransit.net or others.\n");
        return languageList;
    }

    private List<String> getExtra(){
        List<String> extraList = new LinkedList<>();
        extraList.add("N/A");
        extraList.add("The greatest challenge to fulfilling this request is the time associated with setting it up, " +
                "security issues, cross platform usage, firewall issues of using it in China.\n" + "The data is mostly " +
                "Naxi Bible recordings – currently about 1.5 GB worth of data.  We have the data in Mp3 format.  In the" +
                " future the app would also need to include the option to have read the Naxi bible text while also listening" +
                " to it.  However, due to security concerns the Bible text will not be available for several more years.  " +
                "However, when creating the app this might be something to consider.  Apart from just the recordings, we would " +
                "also like to possibly include some simple text in the app – content which I am not sure about yet.");
        extraList.add("One of the greatest challenges of this project is no one on our team right now has the skills to develop an app." +
                "  We are talking with several people who can assist us with web development.  We want to be very selective in allowing " +
                "others direct access to the development stage because we think it’s important to maintain full “ownership” of the final " +
                "product and make all decisions regarding content.  Where we need help is in development and user friendliness of the website and app\n" +
                "We first started discussing the possibilities of using media 4 years ago.  At that time we were discussing how to use text messaging or" +
                " micro disks to evangelize and/or disciple.  It became what it is today mainly because of the facebook and twitter use already occurring." +
                "  The enemy uses these things each day to destroy lives little by little so why shouldn’t we be using it to allow our King to restore lives." +
                "  Not little by little but instantly through Christ.  As we have walked this path over the past 2 years we have developed a broad network" +
                " of like-minded organizations from Indonesia and other countries who are trying to use media to reach the lost.  TV is being used to share" +
                " truth but rarely if ever do these shows share the gospel and definitely have no capacity to disciple people.  Face to face follow up has " +
                "been a big challenge for these other media outlets too.  This is something we hope to avoid as we already have believers trained in the " +
                "methodology we use all over Indonesia who are prepared to follow up with people open to the Gospel or those who have already believed.");
        extraList.add("There will be lots of coding hours necessary");
        extraList.add("N/A");
        extraList.add("N/A");
        extraList.add("N/A");
        return extraList;
    }

}
