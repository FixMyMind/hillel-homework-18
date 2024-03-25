import java.util.Arrays;

public class MainClass {
    public static void main(String[] args) {
        Bank bankAndPrice = new Bank();
        String[][] bankNameAndUSDPrice = new String[Bank.NUMBER_OF_BANKS][2];
        int iteration = 0;
        while (iteration < Bank.NUMBER_OF_BANKS) {
            bankNameAndUSDPrice[iteration][0] = Bank.bankNamesArray[iteration];
            bankNameAndUSDPrice[iteration][1] = Double.toString(bankAndPrice.buyPrice());
            iteration++;
        }
        for (int i = 0; i < Bank.NUMBER_OF_BANKS; i++) {
            System.out.println(Arrays.toString(bankNameAndUSDPrice[i]));
        }
    }
}

