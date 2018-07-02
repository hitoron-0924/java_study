
class CalcExample{
    public static void main(String[] args){
        System.out.println(2 + 3);
    }
}

class CalcExample2{
    public static void main(String[] args){
        int i = 10;
        int j = i * 2;
        System.out.println("i is " + i);
        System.out.println("j is " + j);
    }
}
class CalcExample3{
    public static void main(String[] args){
        int i;
        i = 11;
        i++;
        i /= 2;
        System.out .println("i is " + i);

        int j;
        j = i * i;
        System.out.println("j is " + j);

        j = i++;
        System.out.println("frist increment " + j);
        System.out.println("i is " + i);
        
        j = ++i;
        System.out.println("second increment " + j);
        System.out.println("i is " + i);

    }
}