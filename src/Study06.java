public class Study06 {
    public static void main(String[] args) {
        String ind = "난생처음 자바를 처음 학습 중입니다. 자바는 처음이지만 재미있네요.";
        String str = "Java";

        System.out.println(ind.indexOf("처음"));
        System.out.println(ind.indexOf("학습"));
        System.out.println(ind.indexOf("처음",4));
        System.out.println(ind.indexOf("자바",10));
        System.out.println(str.substring(0,3));
        System.out.println(str.charAt(2));
    }
}
