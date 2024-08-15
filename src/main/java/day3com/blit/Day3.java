package day3com.blit;

public class Day3 {
    public static void main(String[] args) {
//        classname     objectname = new classname();
          Tv         samsung  = new Tv();

        samsung.model = "OLED";
        samsung.os = "webOS";
        samsung.size = "64inch";
        samsung.mfgYear = 2020;
        samsung.specs = "4K resolution";
        samsung.color = "Black";

//        samsung.displayAllVariables();

        Tv tcl = new Tv();
        tcl.model = "LCD";
        tcl.os = "webOS";
        tcl.size = "54inch";
        tcl.mfgYear = 2000;
        tcl.specs = "8K resolution";
        tcl.color = "RED";

//      to call methods:
//      classname.methodname();

        tcl.displayAllVariables();

        tcl.watching();

        System.out.println(tcl.add(23,56));


        tcl.changeChannel(46);
        System.out.println(tcl.changeChannelNo);


//        METHODS:
//        something that performs a specific task
        tcl.changecolor("green");
        System.out.println(tcl.color);

        Tv olg = new Tv("LED","70INCH");


    }
}
