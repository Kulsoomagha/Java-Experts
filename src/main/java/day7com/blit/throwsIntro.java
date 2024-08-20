package day7com.blit;

public class throwsIntro {


    public static int divide (int a, int b) throws ArithmeticException {
        int result = a/b;
        return result;
    }

    public static void main(String[] args) {


        try{
            int c = divide(10,0);
            System.out.println(c);
        }catch (Exception e ){

        }

/*        int c = divide(10,0);
        System.out.println(c);*/

    }
}
