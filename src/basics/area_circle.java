package basics;

import java.util.Scanner;

public class area_circle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the radius of circle :");

        float radius = input.nextFloat();
        float area = (float) ((3.14)* radius*radius);
        System.out.println(area +"");
        input.close();



    }
}
