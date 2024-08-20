package day7com.blit;

public class ThreadIntro {
    public static void main(String[] args) {
        cooking c1 = new cooking();
        cleaning c2 = new cleaning();

        c1.start();
        c2.start();

    }

    public static class cooking extends Thread{
        public void run() {
            int i = 0;
            while (i<400)
            {
                System.out.println("this is cooking thread");
                i++;
            }
        }

    }

    public static class cleaning extends Thread{
        public void run() {
            int i = 0;
            while(i<400)
            {
                System.out.println("this is cleaning thread");
                i++;
            }
        }
    }

}
