class Singleton{
    private static Singleton single_instance = null;
    public String s;
    private Singleton(){
        s = "part of singleton class";
    }
    public static synchronized Singleton getInstance(){
        if(single_instance == null){
            single_instance = new Singleton();
        }
        return single_instance;
    }
}

public class Design {
    public static void main(String[] args) {
        Singleton x = Singleton.getInstance();
        Singleton y = Singleton.getInstance();
        Singleton z = Singleton.getInstance();
        System.out.println("hashcode of x: "+x.hashCode());
        System.out.println("hashcode of y: "+x.hashCode());
        System.out.println("hashcode of z: "+x.hashCode());

        if(x == y && y == z){
            System.out.println("objects assigned to same memory");
        }
        else{
            System.out.println("Not in same memory");
        }
    }
}
