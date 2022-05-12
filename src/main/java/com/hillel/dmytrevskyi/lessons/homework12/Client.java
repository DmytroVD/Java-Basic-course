package com.hillel.dmytrevskyi.lessons.homework12;

public class Client {
    private final String name;
    private final String dateOfBirth;
    private final String monthOfBirth;
    private int year;
    private final String mail;
    private final String phone;


    public String surname;
    public double weight;
    public double pressure;
    public double stepsPerDay;

    private final int age;

    public Client(String name, String dateOfBirth, String monthOfBirth, int year, String mail, String phone,
                  String surname, double weight, double pressure, double stepsPerDay) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.monthOfBirth = monthOfBirth;
        this.year = year;
        this.mail = mail;
        this.phone = phone;
        this.surname = surname;
        this.weight = weight;
        this.pressure = pressure;
        this.stepsPerDay = stepsPerDay;
        this.age = 2022 - year;
    }

    public String getName() {
        return name;
    }

    public String getDatеOfBirth() {
        return dateOfBirth;
    }

    public String getMonthOfBirth() {
        return monthOfBirth;
    }

    public int getYear() {
        return year;
    }

    public String getMail() {
        return mail;
    }

    public String getPhone() {
        return phone;
    }

    public String getSurname() {
        return surname;
    }

    public double getWeight() {
        return weight;
    }

    public double getPressure() {
        return pressure;
    }

    public double getStepsPerDay() {
        return stepsPerDay;
    }

    public int getAge() {
        return age;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setPressure(double pressure) {
        this.pressure = pressure;
    }

    public void setStepsPerDay(double stepsPerDay) {
        this.stepsPerDay = stepsPerDay;
    }

      public void printAccountInfo() {
        System.out.println("Client{" +
                "name='" + name + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", monthOfBirth='" + monthOfBirth + '\'' +
                ", year=" + year +
                ", mail='" + mail + '\'' +
                ", phone='" + phone + '\'' +
                ", surname='" + surname + '\'' +
                ", weight=" + weight +
                ", pressure=" + pressure +
                ", stepsPerDay=" + stepsPerDay +
                ", age=" + age +
                '}');
    }





}



