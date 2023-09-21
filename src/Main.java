import java.io.*;
import java.lang.reflect.Constructor;

public class Main {
    public static void main(String[] args) throws Exception, CloneNotSupportedException
    {

//                    Accessing objects

//        System.out.println("All Example1 objects should have same hashcode:");
//        Example1 example11 = Example1.getExample1();
//        System.out.println(example11.hashCode());
//        Example1 example12 = Example1.getExample1();
//        System.out.println(example12.hashCode());
//
//        System.out.println("All Example2 objects have same hashcode:");
//        Example2 example21 = Example2.getExample2();
//        System.out.println(example21.hashCode());
//        Example2 example22 = Example2.getExample2();
//        System.out.println(example22.hashCode());

        /*
        * Ways to break Singleton DP :
        *
        * 1.Reflection API
        *     solution: 1 -> if object is there => throw exception from inside constructor.
        *               2 -> use enum -> public enum Example1{ INSTANCE; }
        * ----------------------------------------------------------------------------
        * 2.Using Deserialization
        *   solution: implement readResolve method
        * ----------------------------------------------------------------------------
        * 3.Cloning
        *   solution : just override clone method and return the same instance.
        * -----------------------------------------------------------------------------
        * */


//                 using reflection API

//        Example1 example11 = Example1.getExample1();
//        System.out.println(example11.hashCode());
//
//        Constructor<Example1> constructor = Example1.class.getDeclaredConstructor();
//        constructor.setAccessible(true);
//        Example1 example12 = constructor.newInstance();
//        System.out.println(example12.hashCode());
//--------------------------------------------------------------------------------------
//                  Using Deserialization

//        System.out.println("Before Serialization");
//        Example1 example11 = Example1.getExample1();
//        System.out.println(example11.hashCode());
//        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("abc.obj"));
//        oos.writeObject(example11);
//        System.out.println("Serialization Done...");
//
//        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("abc.obj"));
//        Example1 example12 = (Example1) ois.readObject();
//        System.out.println(example12.hashCode());
//--------------------------------------------------------------------------------------
//                    using Cloning

//        Example1 example11 = Example1.getExample1();
//        System.out.println(example11.hashCode());
//        Example1 example12 =(Example1) example11.clone();
//        System.out.println(example12.hashCode());

    }
}