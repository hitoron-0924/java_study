import java.util.Scanner;



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

class ArgmentExample{
    public static void main(String[] args){
        System.out.println("count receved args length "+args.length);
        for(int i=0;i<args.length;i++){
            System.out.println(args[i]);
        }
    }
}

class Multiply{
    public static void main(String[] args){
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        System.out.println(a * b);
    }
}


class InputExample{
    public static void countdown(int start){
        for(int i=start;i>=0;i--){
            System.out.println(i);
       }
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Is num start count down");
        int i = in.nextInt();
        System.out.println(i+ " to start count down");
        countdown(i);
    }
}
