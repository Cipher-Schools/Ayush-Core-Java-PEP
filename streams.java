import java.util.ArrayList;
import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class product {
    int id;
    String name;
    int price;

    public product(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getPrice(){
        return price;
    }
}

public class streams {
    public static void main(String[] args) {
        List<product> plist = new ArrayList<product>();
        plist.add(new product(1, "apple", 20));
        plist.add(new product(2, "orange", 30));
        plist.add(new product(3, "banana", 40));
        plist.add(new product(4, "grapes", 10));
        plist.add(new product(5, "dragonfruit", 50));
        plist.add(new product(6, "kiwi", 90));

        // List<Integer> pprice = new ArrayList<>();
        // for (product p : plist) {
        //     if(p.price < 40){
        //         pprice.add(p.price);
        //     }
        // }
        // System.out.println(pprice);

        // List<Integer> pprice = plist.stream().filter(p -> p.price < 40)
        //                                   .map(p -> p.price).collect(Collectors.toList());  
        // System.out.println(pprice);

        // plist.stream().filter(p -> p.price < 40).forEach(product -> System.out.println(product.name));

        // int totPrice = plist.stream().map(product -> product.price).reduce(0, Integer :: sum);
        // System.out.println(totPrice);

        // double totPrice = plist.stream().collect(Collectors.summingDouble(product-> product.price));
        // System.out.println(totPrice);

        // product maxPriceProduct = plist.stream().max((prod1,prod2)-> prod1.price > prod2.price ? 1:-1).get();
        // System.out.println(maxPriceProduct.price);

        // long count = plist.stream().filter(product -> product.price < 40).count();
        // System.out.println(count);

        // Set<Integer> pprice = plist.stream().filter(p -> p.price < 40)
        //                                   .map(p -> p.price).collect(Collectors.toSet()); 
        // System.out.println(pprice);

        Map<Integer,String> pmap = plist.stream().collect(Collectors.toMap(p->p.id,p->p.name));
        System.out.println(pmap);

        Set<Integer> pprice = plist.stream().filter(p -> p.price < 40)
                                          .map(product :: getPrice).collect(Collectors.toSet()); 
        System.out.println(pprice);



    }
}
