package polycom.blit;

import java.util.Map;

public class PolymorphismIntro {
    public static void main(String[] args) {
//  POLY  MORPHISM
//  many  forms

//   2 Types of Polymorphism =
//   1, Compile-time polymorphism or method over-loading :
//    -> method name should be same
//    -> different number of parameters if the same datatype
//    -> within the same class

//    2, Run-time polymorphism or method over-riding :
//     -> overriding happens when we have 2 classes having inheritance
//     -> having same method name with different implementations
//     -> @Override is recommended to overcome java's confusion that it's overriding not overloading

//        OVER-LOADING EXAMPLE:
//        Maths obj = new Maths();
//        obj.add

        Child c1 = new Child();
        c1.honk();

//          over loading =
//    create a subtract method with different parameters
//        --------------------------------------------------------------
//          overriding =
//    class animal -> parent -> method sound(anything)
//                    |
//                    v
//    class dog -> child -> method sound (bow bow)
//                    |
//                    v
//    class cat -> grand child -> method sound (meow meow)

    }
}
