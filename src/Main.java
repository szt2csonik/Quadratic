import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("a: ");
        int a=scanner.nextInt();
        System.out.print("b: ");
        int b=scanner.nextInt();
        System.out.print("c: ");
        int c=scanner.nextInt();
        solveQuadraticEquation(a,b,c);
    }
    public static void solveQuadraticEquation(double a, double b, double c) {
        if (a == 0) {
            System.out.println(" 'a' értéke nem lehet nulla, mert ez nem másodfokú egyenlet.");
        } else {
            double discriminant = b * b - 4 * a * c;

            if (discriminant > 0) {
                double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
                double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
                System.out.println("Két valós gyök: x1 = " + root1 + ", x2 = " + root2);
            } else if (discriminant == 0) {
                double root = -b / (2 * a);
                System.out.println("Egy valós gyök: x = " + root);
            } else {
                System.out.println("Nincs valós gyök, mivel a diszkrimináns negatív.");
            }
        }
    }
}