import java.util.Random;

public class Bank {
    public static final double MIN_PRICE = 37.0;
    public static final double MAX_PRICE = 42.0;
    public static final int NUMBER_OF_BANKS = 14;

    public static String[] bankNamesArray = new String[]{"ПРИВАТБАНК", "Сенс Банк", "Сітібанк", "ІНГ Банк Україна",
            "Ощадбанк", "Укрексімбанк", "УКРГАЗБАНК", "Райффайзен Банк", "УКРСИББАНК", "ПУМБ", "КРЕДІ АГРІКОЛЬ БАНК",
            "Південний", "КРЕДОБАНК", "Банк Кредит Дніпро"};
    Random random = new Random();

    double buyPrice() {
        return Math.round((random.nextDouble() * (MAX_PRICE - MIN_PRICE) + MIN_PRICE) * 100.0) / 100.0;
    }


}
