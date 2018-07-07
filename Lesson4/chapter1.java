class CallMethodExample{
    public static void countdown(){
        System.out.println("countdownfanction");
        for (int i = 5;i>=0;i--){
            System.out.println(i);
        }
    }
    public static void main(String[] args){
        countdown();
    }
}

class CallMethodExample2{
    public static void methodA(){
        System.out.println("I'm methodA");
    }
    public static void main(String[] args){
        System.out.println("main will called methodA");
        methodA();
        System.out.println("end to called metodA");
    }
}

class CallMethodExample3{
    public static void methodA(){
        System.out.println("I'm methodA");
        System.out.println("methodA will called methodB");
        methodB();
        System.out.println("end to called metodB");
    }
    
    public static void methodB(){
        System.out.println("I'm methodB");
    }
    
    public static void main(String[] args){
        System.out.println("main will called methodA");
        methodA();
        System.out.println("end to called metodA");
    }
}