import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap do dai 3 canh tam giac");
        try {
            double a = scanner.nextInt();
            double b = scanner.nextInt();
            double c = scanner.nextInt();
            TryCatchTriangle.IllegalTriangleException(a, b, c);
        } catch (InputMismatchException e) {
            System.out.println("Khong phai la so thuc");
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("End");
        }

    }

    public static void IllegalTriangleException(double a, double b, double c) {
        if (a + b > c && a + c > b && b + c > a && a > 0 && b > 0 && c > 0) {
            throw new ArithmeticException("Triangle");
        } else {
            throw new ArithmeticException("Not a triangle");
        }
    }
}
