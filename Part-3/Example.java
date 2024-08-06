class Tutorial{
    int x;
    int y;
}

class Example{
    public static void main(String []args){
        Tutorial obj = new Tutorial();
        obj.x = 10;
        obj.y = 20;
        Tutorial obj1 = new Tutorial();
        Tutorial obj2 = new Tutorial();

        System.out.println(obj.x);  // 10
        System.out.println(obj.y);  // 20

        // java me ye default value hoti integer ki 
        // agar apne kuch bhi value nahi di h to 0 set ho jayega.

        System.out.println(obj1.x); // 0
        System.out.println(obj1.y); // 0

        System.out.println(obj2.x); // 0
        System.out.println(obj2.y); // 0
        
    }
}