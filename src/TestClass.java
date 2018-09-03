public final class TestClass {

    private static int sumResult(int a, int b){
        return a += b;
    }

    public static int getSum(int a, int b){
        return sumResult(a, b);
    }

    private static String sumStrings(String str, String str2){
        return str += " - " + str2;
    }

    public static String getString(String string, String string2){
        return sumStrings(string, string2);
    }

}
