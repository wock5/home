public class Study16a {
    public static void main(String[] args) {

        for (int i=0; i<4 ; i++) {
            for (int j=0; j<3-i ; j++)
                System.out.print(" ");{
                for (int k=1; k<=1+2*i ; k++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
