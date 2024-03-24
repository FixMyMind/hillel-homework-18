public class MainClass {
    public static void main(String[] args) {
        String[][] bankNameAndUSDPrice = new String[Bank.NUMBER_OF_BANKS][Bank.NUMBER_OF_BANKS];
        Bank bankAndPrice = new Bank();
        String[][] sortedArray = new String[Bank.NUMBER_OF_BANKS][Bank.NUMBER_OF_BANKS];
        for (int i = 0; i < bankNameAndUSDPrice.length; i++) {
            bankNameAndUSDPrice[i][i] = Bank.bankNamesArray[i] + bankAndPrice.buyPrice();
        }
        for (int i = 0; i < bankNameAndUSDPrice.length; i++) {
            for (int j = 0; j < bankNameAndUSDPrice.length; j++) {
                if (bankNameAndUSDPrice[i][i] == bankNameAndUSDPrice[j][j]){

                }

            }
        }
        for (int i = 0; i < bankNameAndUSDPrice.length; i++) {
            System.out.println(bankNameAndUSDPrice[i][i]);
        }
    }
}
