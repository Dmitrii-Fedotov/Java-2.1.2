public class Main {
    public static void main(String[] args) {
        int balance = 500;
        int refill = 1500;
        int finalBalance;

        if (refill > 1000) {
            finalBalance = balance + refill + refill / 100;
        } else {
            finalBalance = balance + refill;
        }
        System.out.println("На вашем счёте:" + " " + finalBalance + " " + "рублей");
    }
}