class CastExample{
    public static void main(String[] args) {
        int i = 5;
        double d = 0.5;
        System.out.println("i + d");
        int a = 5;
        int b = 2;
        double c = a / b;
        System.out.println("noting for cast c is " + c);
        c = (double)a / (double)b;
        System.out.println("cast is c " + c);
    }
}