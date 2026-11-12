public class Calculator {
     // Проверка входных данных
    private void validateInput(double a, double b)
            throws InvalidInputException {

        if (!Double.isFinite(a) || !Double.isFinite(b)) {
            throw new InvalidInputException(
                "Введены некорректные числа!"
            );
        }
    }

    // Сложение
    public double add(double a, double b)
            throws InvalidInputException {

        validateInput(a, b);
        return a + b;
    }

    // Вычитание
    public double subtract(double a, double b)
            throws InvalidInputException {

        validateInput(a, b);
        return a - b;
    }

    // Умножение
    public double multiply(double a, double b)
            throws InvalidInputException {

        validateInput(a, b);
        return a * b;
    }

    // Деление
    public double divide(double a, double b)
            throws InvalidInputException {

        validateInput(a, b);

        if (b == 0) {
            throw new ArithmeticException(
                "Деление на ноль невозможно!"
            );
        }

        return a / b;
    }
}
