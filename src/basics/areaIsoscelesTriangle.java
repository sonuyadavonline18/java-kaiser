package basics;

import java.util.Scanner;

public class areaIsoscelesTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // input base and height
        System.out.print("Enter equal side (a): ");
        double a = input.nextDouble();
        System.out.print("Enter base (b): ");
        double baseIso = input.nextDouble();
        double area = (baseIso / 4.0) * Math.sqrt(4 * a * a - baseIso * baseIso);
        System.out.println(area);
        input.close();
    }
}
