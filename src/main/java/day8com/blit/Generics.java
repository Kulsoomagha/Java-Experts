package day8com.blit;

public class Generics <T,V>{
//  GENERICS:
//  Java generics allows us to create a single class of generics
//      that can be used with different types of data

//    <T> is known as the type of parameter
//      which means instead of String or int we can use the <T>

   private T data;
   private V data1;

    public Generics() {
    }

    public Generics(T data, V data1) {
        this.data = data;
        this.data1 = data1;
    }



    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public V getDate() {
        return data1;
    }

    public void setDate(V date) {
        this.data1 = date;
    }

    public <T,V> void shout(T thingtoshout, V date1){
        System.out.println(thingtoshout + "!!!!");
        System.out.println(date1 + "!!!!!");
    }

}
