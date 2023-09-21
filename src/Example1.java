/*
* 1.Always make constructor private for Singleton DP.
* 2.object create with the help of method.
* 3.create field to store is private
* 4.for multithreaded environment we use synchronized block for creating singleton object.
*
* */

import java.io.Serializable;

public class Example1 implements Serializable , Cloneable{
    //constructor
    private static Example1 example1;
    private Example1(){
        if(example1!=null){
            throw new RuntimeException("You are trying to break the Singleton Pattern");
        }

    }

    //lazy way of creating single object
    public static Example1 getExample1() {
        //object of this class
        if (example1 == null) {
            synchronized (Example1.class) {
                if (example1 == null) {
                    example1 = new Example1();
                }
            }
        }
        return example1;
    }

    public Object readResolve(){ //solution for Deserialization
            return example1;
    }

    @Override
    public Object clone() throws CloneNotSupportedException{
//        return super.clone();  //breaks singleton pattern
        return example1; //solution to maintain Singleton pattern.
    }
}
