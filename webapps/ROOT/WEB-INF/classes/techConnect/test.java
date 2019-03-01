package techConnect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.Queue;

public class test{
    public test() {
        System.out.println();
    }

    public Boolean testWrapper() {
        System.out.println("Hiya");
        return true;
    }

    public static void main(String[] args) throws java.sql.SQLException {
        test tester = new test();
        tester.testWrapper();
    }
}