import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Target;
import java.util.*;

// public class day6 {
//     static int divideByZero(int a , int b) throws ArithmeticException{
//         throw new ArithmeticException("exception in calling divideByZero");
//     }

//     static int callDivide(int a , int b){
//         int val =0;
//         try{
//             val = divideByZero(a, b);
//         }
//         catch(ArrayIndexOutOfBoundsException e){
//             System.out.println("Array index out of bounds");
//         }
//         return val;
//     }
//     static final int a = 5;
//     public static void main(String[] args) throws ArithmeticException {
        
//         // int a = 5;
//         // int b = 0;
//         // try {
//         //     int res = a/b;
//         //     System.out.println("I'm still able to execute in try");
        
//         // }
        
//         //  catch (ArithmeticException e) {
//         //     // TODO: handle exception
//         //     System.out.println(e.getMessage());
//         // } catch(Exception e){
            
//         // }  
//         // System.out.println("Hi");
//         // // finally{
//         // //     System.out.println("I'm still able to execute in finally");
//         // // } 

//         // try {
//         //     // line 1 where exception occured
//         //     try {
//         //         // line 2 exception
//         //     } catch (Exception e) {
//         //         // TODO: handle line 2 exception
//         //     }
//         // } catch (Exception e) {
//         //     // TODO: handle line 1 exception
//         // }

//             // int NoOfCars = 12;
//             // if(NoOfCars < 15){
//             //     throw new ArithmeticException("Cars are not enough");
//             // }
//             // System.out.println("other lines..");

//         //  try {
//         //     int res =divideByZero(0, 0);   
//         //  } catch (Exception e) {
//         //     // TODO: handle exception
//         //  }
//         // System.out.println("BYE");
//         // try {
//         //     throw new myException("User defined exception occured");
//         // } catch (Exception e) {
//         //     // TODO: handle exception
//         //     System.out.println(e.getMessage());
//         // }

//         // final , finally , finalize
//         day6 obj = new day6();
//         System.out.println(obj.hashCode());
//         obj = null;
//         System.gc();
//         System.out.println("garbage collected..");
//     }
//     public void finalize(){
//         System.out.println("In finalize");
//     }

   
// }
// class myException extends Exception{
//     public myException(String s ) {
//         super(s);
//     }
// }

// class car{
//     void speed(){
//         System.out.println("speed of car");
//     }
// }
// class BMW extends car{
//     @Override
//     void speed(){
//         System.out.println("BMW");
//     }
// }

// class test{
//     @Deprecated
//     void first(){

//     }
//     void second(){

//     }
// }

// @Target(ElementType.TYPE)
// @interface MyAnnotation{
//     int res() default 0;
// }

// @Inherited
// @interface FORALL{}

// @FORALL
// class parent{

// }
// class child extends parent{

// }

// @MyAnnotation(res=5)
// public class day6{
//     public static void main(String[] args) {
//         test t = new test();
//         t.first();
//         t.second();
//     }

//     void dummy(){

//     }
// }
// T Type
// E Element
// K Key
// N Number
// V Value

class myClass<T>{
    T obj;
    void add(T obj){
        this.obj = obj;
    }
    T get(){
        return obj;
    }
}
public class day6{
    public static void main(String[] args) {
        // List<String> list = new ArrayList<>();
        // list.add("abc");

        // String s = list.get('1');
        // System.out.println(list);

        // Map<Integer, String> map = new HashMap<>();
        // map.put(1, "one");
        // }

        // myClass<Integer> c = new myClass<>();
        // c.add(2);
        // System.out.println(c.get());

        Integer[] arr1 = {1,2,3,4};
        Character[] arr2 = {'a','b','c'};
        print(arr1);
        print(arr2);


}
public static <E> void print(E[] elements){
    for (E e : elements) {
        System.out.print(e);
    }
    System.out.println();
}
}


