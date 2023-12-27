import java.util.Scanner;

public class MyApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Shape shape = new Shape();

        System.out.println("Enter points (x y) one by one. Enter 'done' to finish:");

        while (sc.hasNextLine()) {
            String input = sc.nextLine();

            if (input.equals("done")) {
                break; // Exit the loop if "done" is entered
            }

            Scanner lineScanner = new Scanner(input);

            if (lineScanner.hasNextDouble()) {
                double x = lineScanner.nextDouble();

                if (lineScanner.hasNextDouble()) {
                    double y = lineScanner.nextDouble();
                    Point point = new Point(x, y);
                    shape.addPoint(point);
                } else {
                    System.out.println("Invalid input. Enter 'done' to finish or the next point coordinates.");
                }
            } else {
                System.out.println("Invalid input. Enter 'done' to finish or the next point coordinates.");
            }
        }

        System.out.println("\nShape Perimeter: " + shape.calculatePerimeter());
        System.out.println("Longest Side in Shape: " + shape.getLongestSide());
        System.out.println("Average Side Length in Shape: " + shape.getAverageSide());
    }
}