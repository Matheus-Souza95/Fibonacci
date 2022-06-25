public class Main {
    public static void main(String[] args) {

        int n1 = 1;
        int n2 = 0;
        int target = 13;

        for (int i = 0; n1 < target; i++) {
            n1 = n1 + n2;
            n2 = n1 - n2;
            System.out.println("Fibonacci: " + n1);

            if (n1 == target) {
                System.out.println("Numero " + target + " pertence a formula!!");
                break;
            }
            if (n1 >= target) {
                System.out.println("Numero " + target + " nao pertence a formula!!");
                break;
            }
        }
    }
}