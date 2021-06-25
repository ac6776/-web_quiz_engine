class CalculatorTest {
    void testAddition() {
        // implement a test case
        Calculator calculator = new Calculator();
        int res = calculator.add(2, 4);
        Assertions.assertEquals(6, res);
    }
}