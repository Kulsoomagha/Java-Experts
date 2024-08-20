package day7com.blit;

public class throwIntro {
//      custom exception class
    public static class NegativeNumberException extends Exception{
//      Constructor
    public NegativeNumberException(String message) {
        super(message);
    }
}

//    creating method to check if number is positive or negative
    public static void checkNumber(int number)throws NegativeNumberException{
        if(number<0){
            throw new NegativeNumberException("Number must be positive");
        }
        else {
            System.out.println("Number is positive");
        }
    }
//      main method:
    public static void main(String[] args) {
        try{
            checkNumber(-5);
        }catch (NegativeNumberException e){
            System.out.println("caught an exception: " + e.getMessage());
        }
//        try{
//            checkNumber(10);
//        }catch (Exception e){
//            System.out.println("caught an exception: " + e.getMessage());
//        }

    }
}
