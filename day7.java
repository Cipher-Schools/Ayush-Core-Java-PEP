

// public class day7 {
//     enum seasons{summer(2), winter(4), autumn(6), spring(8), rainy(10);
//     int val;
//     private seasons(int val){
//         this.val = val;
//     }
//     }

//         public static void main(String[] args) {
//             for (seasons str : seasons.values()) {
//                 System.out.println(str + " "+ str.val);
//             }
//             seasons winter = seasons.winter;

//             A a = new A();
//         }
    
// }

// class A{
//     private A() {
//     }
// }
public class day7{

}

// enum Day{Sun {
//     @Override
//     int A() {
//         // TODO Auto-generated method stub
//         throw new UnsupportedOperationException("Unimplemented method 'A'");
//     }
// }, Mon {
//     @Override
//     int A() {
//         // TODO Auto-generated method stub
//         throw new UnsupportedOperationException("Unimplemented method 'A'");
//     }
// }, Tue {
//     @Override
//     int A() {
//         // TODO Auto-generated method stub
//         throw new UnsupportedOperationException("Unimplemented method 'A'");
//     }
// };

//     abstract int A();
// }

// enum colours{red , white , blue}
// class Test{
//     public static void main(String[] args) {
//         colours c = colours.red;
//         switch (c) {
//             case red:
//                 System.out.println("RED");
//                 break;
//             case white:
//                 System.out.println("RED");
//                 break;
//             case blue:
//                 System.out.println("RED");
//                 break;
        
//             default:
//                 break;
//         }
//     }
// }

// Autoboxing -> primitive to Wrapper
// Unboxing ->  Wrapper to primitive 

// class Test{
//     public static void main(String[] args) {
//         int i = 10;
//         Integer j = new Integer(2); 

//         Integer a = Integer.valueOf(i); // Autoboxing

//         int b = j.intValue(); // Unboxing
//     }
// }

// class Test{
//     public static void main(String[] args) {
//         String [] Arr = new String[5];
//         Arr[2] = "HI HOW WAS YOUR DAY";
//         Optional<String> CheckNull = Optional.ofNullable(Arr[2]);
//         CheckNull.ifPresent(System.out::println);
//         System.out.println(CheckNull.get());
//         String LowerStr = Arr[2].toLowerCase();
//         System.out.println(LowerStr);
        

//     }
// }

class Test{
    public static void main(String[] args) {
        // int n = 5,m=5;
        // int count1=0, count2=0; // (n+m+1)= O(n+m)
        // for (int i = 0; i < n/2; i++) {
        //     count1++; 
        //     for (int j = 0; j < n; i++) {
        //         count2++;    // logn
        //     }
        // } 
        
        // System.out.println(count1+" "+count2);

        int n =18, a=0;
        int i =n;
        while(i>0){
            System.out.println(a+" ");
            a=a+i;
            i=i/2;
        }
    }
}