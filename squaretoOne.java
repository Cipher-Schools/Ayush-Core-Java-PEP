public class squaretoOne {
    public static boolean result(int n){
        int slow = squaredSum(n);
        int fast = squaredSum(squaredSum(n));
        while(slow != fast){
            slow = squaredSum(slow);
            fast = squaredSum(squaredSum(fast));
        }
        return slow == 1;
    }
    private static int squaredSum(int n){
        int sum = 0;
        while(n>0){
            sum += Math.pow(n%10, 2);
            n /= 10;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(result(19));
    }
}

// Scanner sc= new Scanner(System.in);

// Heap , Stack , PC registers, Method area
// object in Heap, reference in stack

// Garbage collector tuning
