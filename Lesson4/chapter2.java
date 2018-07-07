class CallMethodExample4{
    public static void countdown(int start){
        System.out.println("I'm receved " + start);
        System.out.println("I do countdown");
        for(int i = start;i>=0;i--){
            System.out.println(i);
        }
    }
    public static void main(String[] args){
        countdown(3);
        countdown(10);
    }
}

    
class CallMethodExample5{
    public static void countdown(int start,int end){
        System.out.println("I'm receved start at " + start);
        System.out.println("I'm receved end at " + end);
        System.out.println("I do countdown");
        for(int i = start ; i >= end ; i--){
            System.out.println(i);
        }
    }
    public static void main(String[] args){
        countdown(7,3);
    }
}