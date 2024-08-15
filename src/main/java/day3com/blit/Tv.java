package day3com.blit;

public class Tv {
    String model;
    String os;
    String size;
    int mfgYear;
    String specs;
    String color;
    int changeChannelNo;


//    methods:
//    public void methodname (){
//        body of my method
//    }
    public void displayAllVariables (){
        System.out.println(model);
        System.out.println(os);
        System.out.println(size);
        System.out.println(mfgYear);
        System.out.println(specs);
        System.out.println(color);
    }
//    i am watching tv
//  concrete/simple methods
    public void watching(){
        System.out.println("i am watching TV");
    }
//    a method streaming
//    i am streaming netflix


//    add method:
    public int add (int a , int b){
        return a + b;
    }
//    parameterized methods:
//    methods with parameters to ask user to give some values.

//    subtract 3 parameters:

//    change channel no for my tv
    public void changeChannel (int newChannel){
        changeChannelNo = newChannel;
    }

//create a method which will change the color with parameters

    public void changecolor (String newcolor){
        color = newcolor;
    }

    public void changeyear (int newyear){
        mfgYear = newyear;
    }

//    Constructors:
//    they are used to initialize/ creating an object

//  public classname(){
//    }

    public Tv(){

    }
//    default constructors:

    public Tv(String model1, String size1 ){
        model = model1;
        size = size1;
    }
//    parameterized Constructor:


    public Tv(String model) {
        this.model = model;
//      this means i am talking about the variable in my class
    }


}
