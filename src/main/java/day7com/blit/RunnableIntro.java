package day7com.blit;
class threadrunnable1 implements Runnable{


    @Override
    public synchronized void run() {
        int i = 0;
        while(i<5){
            System.out.println("this is thread 1");
            i++;
        }

    }
}

class threadrunnable2 implements Runnable{

    @Override
    public void run() {
        System.out.println("this is thread 2");
    }
}

class threadrunnable3 implements Runnable{

    @Override
    public void run() {
        int i = 0;
        while(i<5){
            System.out.println("this is thread 3");
            i++;
        }

    }
}


public class RunnableIntro {
    public static void main(String[] args) {
        threadrunnable1 bullet1 = new threadrunnable1();
        Thread gun1 = new Thread(bullet1);

        threadrunnable2 bullet2 = new threadrunnable2();
        Thread gun2 = new Thread(bullet2);

        threadrunnable3 bullet3 = new threadrunnable3();
        Thread gun3 = new Thread(bullet3);

        gun2.start();
        gun1.start();
        gun3.start();
    }
}
