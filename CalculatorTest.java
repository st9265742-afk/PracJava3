public class CalculatorTest {
    Calculator calculator = new Calculator();

    // Тест сложения
    @Test
    void testAddition() throws InvalidInputException {
        assertEquals(10.0, calculator.add(5, 5));
    }

    // Тест вычитания
    @Test
    void testSubtraction() throws InvalidInputException {
        assertEquals(5.0, calculator.subtract(10, 5));
    }

    // Тест умножения
    @Test
    void testMultiplication() throws InvalidInputException {
        assertEquals(20.0, calculator.multiply(4, 5));
    }

    // Тест деления
    @Test
    void testDivision() throws InvalidInputException {
        assertEquals(5.0, calculator.divide(10, 2));
    }

    // Тест деления на ноль
    @Test
    void testDivisionByZero() {
        assertThrows(
            ArithmeticException.class,
            () -> calculator.divide(10, 0)
        );
    }

    // Тест собственного исключения
    @Test
    void testInvalidInput() {
        assertThrows(
            InvalidInputException.class,
            () -> calculator.add(Double.NaN, 5)
        );
    }

    // Тест некорректного строкового ввода
    @Test
    void testInvalidStringInput() {
        assertThrows(
            NumberFormatException.class,
            () -> Double.parseDouble("hello")
        );
    }
}
