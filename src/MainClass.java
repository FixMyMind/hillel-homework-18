import java.util.Arrays;

public class MainClass {
    public static void main(String[] args) {
        double[] priceArray = new double[Bank.NUMBER_OF_BANKS];
        String[] nameArray = new String[Bank.NUMBER_OF_BANKS];
        Bank[] banks = new Bank[Bank.NUMBER_OF_BANKS];
        Bank bankAndPrice = new Bank();
        for (int i = 0; i < Bank.NUMBER_OF_BANKS; i++) {
            Bank bank = new Bank(Bank.bankNamesArray[i], bankAndPrice.buyPrice());
            priceArray[i] = bank.price;
            nameArray[i] = bank.name;
            banks[i] = bank;
//            System.out.println(bank); //якщо тустрінг метод переоприділений
            System.out.println(priceArray[i]);
            System.out.println(nameArray[i]);
            System.out.println(banks[i]);
        }
        Arrays.sort(priceArray);
        for (int i = 0; i < Bank.NUMBER_OF_BANKS; i++) {
            if (priceArray[Bank.NUMBER_OF_BANKS] == banks[i]) {

            }
            System.out.println(priceArray[i]);
        }


    }
}



