class ForExample{
    public static void main(String[] args){
        for(int i = 0;i<5;i++){
            System.out.println("times Forfanction is " + i);
        }
        System.out.println("out of Forfanction");
    }
}

class ForExample2{
    public static void main(String[] args){
        int sum = 0;
        for (int i=1;i <= 10;i++){
            sum += i;
            System.out.println("sum add "+i);
        }
        System.out.println("sum is " + sum);
    }
}

class DoWhileExample{
    public static void main(String[] args){
        int i = 5;
        do {
            System.out.println(i);
            i--;
        }while(i<0);
    }
}

class BreakExample{
    public static void main(String[] args){
        int sum = 0;
        for(int i = 1;i<=10;i++){
            sum += i;
            System.out.println("sum add " + i  + "sum is " + sum);
            if(sum > 20){
                System.out.println("sum is over 20");
                break;
            }
        }
    }
}

class ContinuExample{
    public static void main(String[] args){
        int sum = 0;
        for(int i=1;i<=10;i++){
            if(i % 2 == 0){
                continue;
            }
            sum += i;
            System.out.println("sum add " + i + "sum is " + sum);
        }
    }
}

class TestWhile{
    public static void main(String[] args){
        boolean i = false;
        while(i){
            System.out.print(i);
        }
    }
}

class NestExample{
    public static void main(String[] args){
        for(int a = 1;a<=3;a++){
            for (int b=5;b>=3;b--){
                System.out.println( a +" "+ b );
            }
        }
    }
}