// i want to Access this X?

class A{
    private static int x;
    private static int y;

    static void display(){
        System.out.println(x); // 0
    }
    static void setData(int data){
        y = data;
    }
    static  void showData() {
        System.out.println(y); // 15
    }
}

public class Example {
    public static  void  main(String []args){
        A.display();
        A.setData(15);
        A.showData();
    }
}
