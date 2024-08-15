package day4com.blit;

public class Person1 {
//    name,age,height,phoneNumber,email.
// variables = private
// constructors
// methods =

    private String name;
    private int age;
    private double height;
    private int phoneNumber;
    protected String email;

//  get method
//  set methods

    public Person1(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}


