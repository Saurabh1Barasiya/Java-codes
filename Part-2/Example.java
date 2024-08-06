class Example{
    static void fun1(){
        System.out.println("fun1 calling...");
    }

    static void fun2(){
        System.out.println("fun2 calling...");
    }
    
    static void fun3(){
        System.out.println("fun3 calling...");
    }

    public static void main(String []args){
        System.out.println("main calling...");
        fun1();
        fun2();
        fun3();
    }
}