class overloadExample{
    public static void methodA(){
        System.out.println("noting num");
    }
    public static void methodA(int i){
        System.out.println("I'm receved " + i);
    }
    public static void methodA(double d){
        System.out.println("I'm receved " + d);
    }
    public static void methodA(String s){
        System.out.println("I'm receved " + s);
    }
    public static void main(String[] args){
        methodA();
        methodA(1);
        methodA(0.1);
        methodA("Hello");
    }

}