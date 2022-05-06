package com.hillel.dmytrevskyi.lessons.homework11;

public class CoWorker {

    String fullName;
    String post;
    String email;
    String phoneNumber;
    String salary;
    int age;

    public CoWorker(String fullName, String post, String email, String phoneNumber, String salary, int age) {
        this.fullName = fullName;
        this.post = post;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;

    }


    public void printInfo() {

        System.out.println("fullName: " + fullName + '\'' +
                ", post: " + post + '\'' +
                ", email: " + email + '\'' +
                ", phoneNumber: " + phoneNumber + '\'' +
                ", salary: " + salary + '\'' +
                ", age: " + age);

    }

}


