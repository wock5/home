public class Study12 {
    public static void main(String[] args) {
        // 산술연산자

        // 일반 연산
        System.out.println(4 + 2); //6
        System.out.println(4 - 2); //2
        System.out.println(4 * 2); //8
        System.out.println(4 / 2); //2
        System.out.println(5 / 2); //2

        // 증감 연산 ++, --
        int val;
        val = 10;
        System.out.println(val); //10 val=10
        System.out.println(++val); //11 1+val 한 값이 출력됨

        val = 10;
        System.out.println(val); //10
        System.out.println(val++); //10 val 값만 출력후 +1은 저장만 됨
        System.out.println(val); //11 저장된 값이 출력됨

    }
}
