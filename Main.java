import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        try {
            System.out.println("=== CALCULATOR ===");

            System.out.print("Введіть перше число: ");
            double a = Double.parseDouble(scanner.nextLine());

            System.out.print("Введіть друге число: ");
            double b = Double.parseDouble(scanner.nextLine());

            System.out.println("\nВыберіть операцію:");
            System.out.println("+  Додавання");
            System.out.println("-  Віднімання");
            System.out.println("*  Множення");
            System.out.println("/  Ділення");

            System.out.print("Операція: ");
            String operation = scanner.nextLine();

            double result;

            switch (operation) {
                case "+":
                    result = calculator.add(a, b);
                    break;

                case "-":
                    result = calculator.subtract(a, b);
                    break;

                case "*":
                    result = calculator.multiply(a, b);
                    break;

                case "/":
                    result = calculator.divide(a, b);
                    break;

                default:
                    throw new InvalidInputException(
                        "Невдома операція!"
                    );
            }

            System.out.println("\nРезультат: " + result);

        } catch (NumberFormatException e) {
            System.out.println(
                "Помилка: необхідно вводити числа!"
            );

        } catch (ArithmeticException e) {
            System.out.println("Помилка: " + e.getMessage());

        } catch (InvalidInputException e) {
            System.out.println("Помилка: " + e.getMessage());

        } finally {
            System.out.println(
                "\nОбробка запиту завершена."
            );
            scanner.close();
        }
    }
}
