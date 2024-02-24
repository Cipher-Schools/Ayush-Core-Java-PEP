public class gasStation {
    public static void main(String[] args) {
        int[] gas = {1,2,3,4,5};
        int[] cost = {3,4,5,1,2};
        int tank = 0;
        for (int i = 0; i < gas.length; i++) {
            tank = tank + gas[i] - cost[i];
        }
        if (tank < 0) {
            System.out.println("-1");
        }
        int index = 0;
        int store = 0;
        for (int i = 0; i < gas.length; i++) {
            int fill = gas[i] - cost[i];
            if(fill+store<0){
                index = i+1;
                store = 0;
            }
            else{
                store+= fill;
            }
        }
        System.out.println(index);
    }
}
