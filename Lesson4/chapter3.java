import java.util.Scanner;

class ReturnExample{
    public static double getAreaOfCircle(double radius){
        return radius *radius *3.14;
    }
    public static void main(String[] args){
        double circleArea = getAreaOfCircle(2.5);
        System.out.println(circleArea);
    }
}

class ReturnExample2{
    public static boolean isPositiveNumber(int i){
        if(i>0){
            return true;
        }else {
            return false;
        }
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int i = in.nextInt();
        if(isPositiveNumber(i) == true){
            System.out.println("i is +");
        } else {
            System.out.println("i is 0 or -");
        }

    }
}