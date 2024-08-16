package day6com.blit;

public abstract class Bankaccount {
// developer class
    private int accountNumber;
    private int routingNumber;
    private String name;
//    Abstract class:
//    can have concrete and abstract methods
//    cannot create objects using abstract class

     abstract void checkBalanace();

    public void checkCreditScore(){
        System.out.println("this is the score: ");
    }


}
