package Lab7;

public class A {
    public static void main(String[] args) {
        f(8,12,33);
    }

    public static int f(int a, int b, int c) {
        System.out.println(a + " * " + b + " - " + c + " = " + B.g(a, b, c));
        return B.g(a, b, c);
    }
}
