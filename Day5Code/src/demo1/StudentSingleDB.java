package demo1;

import exceptionHW.Students;

import java.util.ArrayList;

public class StudentSingleDB {
    private static StudentSingleDB studentsDB = null;
    private ArrayList<Students> students = new ArrayList<>();

    private StudentSingleDB() {
        Students user1 = new Students( "xing", "12","aaaa");
        Students user2 = new Students( "zhang", "22","bbbb");
        Students user3 = new Students("ruby", "16","cccc");
        students.add(user1);
        students.add(user2);
        students.add(user3);
    }

    public static StudentSingleDB getStudentsDB() {
        if (studentsDB == null) {
            studentsDB = new StudentSingleDB();
        }
        return studentsDB;
    }

    public void saveuserdb(ArrayList<Students> userdb) {
        this.students = userdb;
    }

    public ArrayList<Students> getuserdb() {
        return students;
    }
}
