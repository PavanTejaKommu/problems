package com.abstraction;

import java.util.Scanner;

abstract class User {

    String userName;
    String email;
    String role;

    abstract void accessDashboard();

    abstract void login();

    abstract void logout();

    abstract void updateProfile();

    public User(String userName, String email, String role) {
        this.userName = userName;
        this.email = email;
        this.role = role;
    }
}

class Student extends User {

    String enrolledCourses;
    String grades;

    public Student(String userName, String email, String role,
                   String enrolledCourses, String grades) {

        super(userName, email, role);
        this.enrolledCourses = enrolledCourses;
        this.grades = grades;
    }

    @Override
    void accessDashboard() {
        System.out.println(
            "Accessing Student Dashboard: " + userName + "\nEnrolled Courses: " +
            enrolledCourses +"\nGrades: " +grades);
    }

    @Override
    void login() {
        System.out.println("Login Successful");
    }

    @Override
    void logout() {
        System.out.println("Logout Successful");
    }

    @Override
    void updateProfile() {
        System.out.println("Profile Updated Successfully");
    }
}

class Instructor extends User {

    String createdCourses;
    String studentSubmissions;

    public Instructor(String userName, String email, String role,
                      String createdCourses, String studentSubmissions) {

        super(userName, email, role);
        this.createdCourses = createdCourses;
        this.studentSubmissions = studentSubmissions;
    }

    @Override
    void accessDashboard() {
        System.out.println(
            "Accessing Instructor Dashboard: " + userName + "  \nCreated Courses: " +
            createdCourses +"  \nStudent Submissions: " +studentSubmissions
        );
    }

    @Override
    void login() {
        System.out.println("Login Successful");
    }

    @Override
    void logout() {
        System.out.println("Logout Successful");
    }

    @Override
    void updateProfile() {
        System.out.println("Profile Updated Successfully");
    }
}

class Admin extends User {

    String siteAnalytics;
    String userManagementTools;

    public Admin(String userName, String email, String role,
                 String siteAnalytics, String userManagementTools) {

        super(userName, email, role);
        this.siteAnalytics = siteAnalytics;
        this.userManagementTools = userManagementTools;
    }

    @Override
    void accessDashboard() {
        System.out.println(
            "Accessing Admin Dashboard: " +userName +"\nSite Analytics: " +
            siteAnalytics +"\nUser Management Tools: " +userManagementTools);
    }

    @Override
    void login() {
        System.out.println("Login Successful");
    }

    @Override
    void logout() {
        System.out.println("Logout Successful");
    }

    @Override
    void updateProfile() {
        System.out.println("Profile Updated Successfully");
    }
}

public class Example4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Select Your Choice : ");
        System.out.println("1. Student");
        System.out.println("2. Instructor");
        System.out.println("3. Admin");

        int key = sc.nextInt();

        switch (key) {

            case 1:

                User student = new Student(
                    "Teja",
                    "Teja@example.com",
                    "Student",
                    "Math, Science",
                    "Math: 90, Science: 85"
                );

                student.login();
                student.accessDashboard();
                student.updateProfile();
                student.logout();

                break;

            case 2:

                User instructor = new Instructor(
                    "Ravi",
                    "iravi@gmail.com",
                    "Instructor",
                    "Math 101",
                    "Submission 1, Submission 2"
                );

                instructor.login();
                instructor.accessDashboard();
                instructor.updateProfile();
                instructor.logout();

                break;

            case 3:

                User admin = new Admin(
                    "admin1",
                    "admin1@example.com",
                    "Admin",
                    "Visitors: 1000, Courses: 50",
                    "Add User, Remove User"
                );

                admin.login();
                admin.accessDashboard();
                admin.updateProfile();
                admin.logout();

                break;

            default:

                System.out.println("Invalid Input");
        }

        sc.close();
    }
}