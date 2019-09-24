public class Application {
    public static void main(String[] args) {
        doFirstTask();
        doSecondTask();
    }

    private static void doFirstTask() {
        int var1 = 7;
        int var2 = 10;
        int result = var1 + var2;
        System.out.println(result);
    }

    private static void doSecondTask() {
        String s1 = "s1";
        String s2 = "s2";
        String s3 = "s3";
        String s4 = "s4";
        System.out.println(s1 + s2 + s3 + s4);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
    }
}
