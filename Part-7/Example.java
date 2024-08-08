// accessing object member or instance variable member.

class Test{
    private int x = 10;
    private int y = 20;

    public void setData(int a,int b){
        x = a;
        y = b;
    }

    public void showData(){
        System.out.println(x);
        System.out.println(y);
    }

}

class Example{
    public static void main(String []args){
        Test obj = new Test();
        obj.showData(); // x = 10 , y = 20

        Test obj1 = new Test();
        obj1.setData(50,50);
        obj1.showData(); // x = 50 , y = 50.

        // instance or object ke pass apne khud ke 
        // instance variable or instance function hote 
        // jo bhi chnages hote h vo us perticuller object ke hote h.

        // agar ham 1 object ke kisi instance variable ko change kar rahe h to 
        // dusre object ke instance variable chnage  nahi hoge 

        // every object have a copy of instance variable of instance function.



        // ham classname . karke instance member ko access nahi kr sakte h.
        
        //Test.showData(); // Error.. 
        
    } 
}