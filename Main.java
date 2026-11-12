import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        try {
            System.out.println("=== JAVA CALCULATOR ===");

            System.out.print("Введите первое число: ");
            double a = Double.parseDouble(scanner.nextLine());

            System.out.print("Введите второе число: ");
            double b = Double.parseDouble(scanner.nextLine());

            System.out.println("\nВыберите операцию:");
            System.out.println("+  Сложение");
            System.out.println("-  Вычитание");
            System.out.println("*  Умножение");
            System.out.println("/  Деление");

            System.out.print("Операция: ");
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
                        "Неизвестная операция!"
                    );
            }

            System.out.println("\nРезультат: " + result);

        } catch (NumberFormatException e) {
            System.out.println(
                "Ошибка: необходимо вводить числа!"
            );

        } catch (ArithmeticException e) {
            System.out.println("Ошибка: " + e.getMessage());

        } catch (InvalidInputException e) {
            System.out.println("Ошибка: " + e.getMessage());

        } finally {
            System.out.println(
                "\nОбработка запроса завершена."
            );
            scanner.close();
        }
    }
}
