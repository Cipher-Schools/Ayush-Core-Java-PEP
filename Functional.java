import java.util.function.Function;
import java.util.function.*;
import java.util.function.Predicate;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.util.function.BiFunction;
import java.util.*;
import java.lang.*;

@FunctionalInterface
interface Drawable{
    public int draw(int x, int y);
}

public class Functional {
    public static void main(String[] args) {
    // Logger logger = Logger.getLogger(Functional.class.getName());
    // Function<Integer,Integer> mul = x -> x*3;
    // Function<Integer,Integer> add = x -> x + 3;
    // // Function<Integer,Unit> LogOutput = x -> {
    // //     logger.info("Data: "+x); 
    // //     return Unit.unit();
    // // };

    // Function<Integer,Integer> pipeline = mul.andThen(add);
    // System.out.println();
    // }  
    // Function <Double, Double > log = (value) -> Math.log(value);
    // Function <Double, Double > sqrt = (value) -> Math.sqrt(value);

    // Function <Double, Double > logThenSqrt = sqrt.compose(log);
    // double result1 = logThenSqrt.apply(3.14);

    // Function<Double,Double> sqrtThenLog = sqrt.andThen(log);
    // double result2 = sqrtThenLog.apply(3.14);
    // System.out.println("Log of 3.14: "+Math.log(3.14));
    // System.out.println("sqrt of log of 3.14: "+Math.sqrt(Math.log(3.14)));
    // System.out.println(result1);
    // System.out.println(result2);

    // int length = 20;
    // Drawable d = (x,y)-> {
    //         System.out.println("Drawing with Length : "+ x +" and breadth :"+y);
    //         return x*y;
    // };

    // System.out.println("Area: "+d.draw(10,20));

    List<Integer> l1 = new ArrayList<>();
    l1.add(1);
    l1.add(2);
    l1.add(3);
    l1.forEach((n)->System.out.println(n));


    // unsorted array:- arr[1,2,0]  // output -> 3   [3,4,-1,1] //output-> 2 ) 

    // String : "Keyboardkey" dict: ["key","board"] // output = true

    //[2,2,2,3,3,3,3,3,3,3,1,1,1,1]  output - 3         O(n) time and O(1) space

 }
}
