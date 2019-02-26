package techConnect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.Queue;

public class test{
    public test() {
        System.out.println("HI");
    }

    public static void main(String[] args) throws java.sql.SQLException {
        privateProjectBean pb = new privateProjectBean();
        PrivateProjectDAO pp = new PrivateProjectDAO();

        /*pb.setProviderID(8);
        pb.setComplete(false);
        pb.setName("a");
        pb.setProposal("alphabet.");
        pb.setAdminID(7);
        pp.setPrivateProject(pb);
        pb.setName("12");
        pb.setProposal("num.");
        pp.setPrivateProject(pb);
        pb.setName("te");
        pb.setProposal("testing.");
        pp.setPrivateProject(pb);*/

        pb = pp.getPrivateProject("a");
        System.out.println(pb.getName() + " " + pb.getProposal());

        Queue<privateProjectBean> ppb = new LinkedList<>();
        ppb = pp.getPrivateProject(8);
        while(!ppb.isEmpty()) {
            pb = ppb.remove();
            System.out.println(pb.getName() + " " + pb.getProposal());
        }
        //DBWrapper d = new DBWrapper();
        //d.testQ("SELECT * FROM users;");
    }


}