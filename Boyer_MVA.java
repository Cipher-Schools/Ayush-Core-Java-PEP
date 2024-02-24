public class Boyer_MVA {
    public static int maj(int[] arr){
        int count = 0;
        int ans = arr[0];
        for(int num : arr){
            if(count == 0)
             ans = num;
            if(num == ans)
             count++;
            else
             count--;
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = {2,2,2,3,3,3,3,3,3,3,1,1,1,1 ,1,1,1,1,1,1,1,1,1};
        System.out.println(maj(arr));
    }
}
