public class Main {
    public static void main(String[] args) {
        int balance = 800;
        int refill = 300;
        int finalBalance;

        if (refill > 1000) {
            finalBalance = balance + refill + refill / 100;
        } else {
            finalBalance = balance + refill;
        }
        System.out.println(finalBalance);
    }
}