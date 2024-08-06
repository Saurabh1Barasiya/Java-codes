class Demo{
    void fun1(){
        System.out.println("I am fun1");   
    }
    void fun2(){
        System.out.println("I am fun2");
    }
}

class Example{
    public static void main(String []args){
        Demo obj = new Demo();
        obj = new Demo();

        // yaha par do object banage but obj new object ko point karne lagega.
        // ab obj purane object ko point nahi kar raha h to 
        // java ka garbage collector new (pahle) Object ko autometic delete kar dega.

        obj.fun1();
        obj.fun2();
    }
}