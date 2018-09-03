public class Main {

    public static void main(String[] args) {
        int a = 10;
        int b = 22;
        String string = "Three Days Grace";
        String string2 = "Never too late";
        System.out.println(TestClass.getSum(a, b));
        System.out.println("------------------------------------------");
        System.out.println(TestClass.getString(string,string2));


        System.out.println("------------------------------------------");

        TestClass testClass = new TestClass();//используя объет нет доспупа к статическим методам
       
    }
}
