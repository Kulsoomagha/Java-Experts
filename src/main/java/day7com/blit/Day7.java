package day7com.blit;

public class Day7 {
//    THREAD:
//    java supports multithreading: meaning a program can perform multiple tasks simultaneously

//    KEY CONCEPTS:
//    concurrency: multiple threads can run in parallel, sharing the CPU time.
//    multithreading: multiple threads can be executed within a single program.
//    synchronization: mechanism to control the access of multiple threads to be shared

//    Ways to achieve:
//    By extending thread class.
//    by implementing runnable interface

//    Synchronization: keyword synchronized.
//    when multiple threads access shared resources, there can be conflicts,
//    synchronization is used to control this access and prevent issues like race condition/conflicts.

//    Deadlock:
//    A lock applied when you have a synchronization process.
//    A thread is waiting outside and a lock is applied then once a thread has finished its work
//    the lock will be removed and other thread can enter

//    String Builder :
//    -> its not thread safe
//    -> it means its not suitable for multithreading environment
//    -> however it is more efficient than string buffer
//        the reason is of the thread safety condition.

//    String Buffer :
//    -> it is thread safe
//    -> it is suitable for multithreading environment
//    -> however it is less efficient than string builder.

//    String builder and String buffer: -> mutable
//        -> this classes will allow you to modify without creating new objects each time
//        -> both classes will provide similar functionality,
//             but they differ in their thread safety
public static void main(String[] args) {
    StringBuilder a = new StringBuilder();
    String b = "hellotob";
    a.append(b);
    a.append("world");
    a.replace(0,8,"hey");

    System.out.println(a);

    StringBuffer d = new StringBuffer();
    String c = "hellotoc";
    d.append(c);
    d.append("world");
    d.replace(0,8,"hey");

    System.out.println(d);


}
}
