public class Gambler{
    public static final int AMOUNT_OF_STAKE = 100;
    public static final int AMOUNT_BET = 1;

    public static void main(String[] args) {
        int remaining_amount = AMOUNT_OF_STAKE ;
        double random = Math.floor(Math.random() * 10) % 2;
        if (random == 0) {
            remaining_amount = remaining_amount + AMOUNT_BET;
            System.out.println("After winning bet" + remaining_amount);
        } else
            remaining_amount = remaining_amount - AMOUNT_BET;
        System.out.println("After loosing bet" + remaining_amount);
    }
}
