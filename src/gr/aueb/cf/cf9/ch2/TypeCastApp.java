package gr.aueb.cf.cf9.ch2;

public class TypeCastApp {
    public static void main(String[] args) {
        long myLong = (long) 2147482647;
        int myInt = (int) myLong;

        System.out.println(myLong);
        System.out.printf("%d%n", myLong);
        System.out.println(myInt);
    }
}
