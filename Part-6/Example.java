// static member ya variable ko with the help of class name . as well as object name . karke access kar  sakte h
// static member 1 baar ho bante h  
// ye class specific hote h.

class Test{
    private static int x = 10;

    public void showData(){
        // access static variable in instance method.
        System.out.println(x);
    }

    public static void setData(int data){
        x = data;
    }


}

class Example{
    public static void main(String []args){
        Test obj = new Test();
        obj.showData();  // 10

        Test obj1 = new Test();
        obj1.setData(20);
        obj1.showData();  // 20

        // now whats the output of obj.showData();

        obj.showData(); // 20 but why.
        // because static varible class specific hote h or 1 baar hi bannte 
        // object bhi unko access kar sakta h , but vo har boject ke liye alag alag nahi hoge.
        // jo bhi modification hoga vo class level par hoga.

        Test.setData(50);

        obj.showData(); // 50 
        obj1.showData(); // 50

    }
}