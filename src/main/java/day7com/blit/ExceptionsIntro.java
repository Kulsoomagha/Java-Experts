package day7com.blit;

public class ExceptionsIntro {
//    ERRORS:
//    something that you need to resolve in order to run java program:
//    Example: syntaxerror, outofmemory

//    EXCEPTIONS:
//    exceptions are some kind of errors that can be resolved by try catch blocks
//    Example: arthematicexception, arrayindexoutodbounfexception.

//handling the exceptions:
//    it will try a bunch of code
//           try {
//
//            }
//    it will catch the exceptions that try is seeing in its block
//            catch(){
//
//            }
//    it is a block which will work no matter the exception occurs or not
//    finally{
//    }

//    Parent of all exceptions is THROWABLE.

//    CHECKED:
//    at compile time
//    use keyword throw
//    handled using try/catch block

//    UN-CHECKED:
//    not checked at compile time
//    comes at run-time
//    uses keyword throws

//    THROW: manually throw an exception
//    THROWS: in a method to specify that which exception the method may throw

    public static void main(String[] args) {

        try{
            int a = 10;
            int b = 0;
            int result = a/b;
            System.out.println(result);
        }catch(ArithmeticException e){
            System.out.println("cannot divide by zero");
        }
        System.out.println("hello this is result");

        String[] names = {"kulsoom", "agha"};
//                            0        1
//        System.out.println(names[2].toUpperCase());

        try{
            names[2].toUpperCase();
        }catch(Exception e){
//            e.printStackTrace();
            e.getMessage();
        }finally {
            System.out.println("this is finally block");
        }

    }

}
