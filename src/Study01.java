public class Study01 {
    public static void main(String[] args) {
        int num1;
        double num2;
        String str;

        str = "1236589";
        num1 = Integer.parseInt(str);
        System.out.println("문자열 ==> 정수 : " +num1);

        str = "3.155688";
        num2 = Double.parseDouble(str);
        System.out.println("문자열 ==> 실수 : " + num2);
    }
}
