public class Ex4 {
    public static void main(String[] args) {
        double y = 0, divisor = 1;

        while (divisor < 21){
            y = 1 / divisor + y;
            divisor++;
        }

        System.out.println("y = " + y);
    }
}
