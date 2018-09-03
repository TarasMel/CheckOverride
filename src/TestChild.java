public class TestChild extends /*TestClass*/ TestParent {



    @Override
    public int sumResult(int a, int b) { // Если разкоментить тест класс, и закоментить тест парент компилятор будет ругаться, что нельзя наследоваться от финального класса
        return super.sumResult(a, b);
    }
}
