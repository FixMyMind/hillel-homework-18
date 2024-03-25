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
        boolean bigger;
        int result = 0;
//        for (int i = 1; i < Bank.NUMBER_OF_BANKS; i++) {
//            bigger = (int) ((Double.parseDouble(bankNameAndUSDPrice[result][1]) * 100) /
//                    (Double.parseDouble(bankNameAndUSDPrice[i][1]) * 100)) > 0;
//            if (!bigger) {
//                result = i;
//            }
//        }
        for (int i = 0; i < Bank.NUMBER_OF_BANKS; i++) {
            System.out.println(Arrays.toString(bankNameAndUSDPrice[i]));
        }
        String temp;
        String temp1;
        for (int i = 1; i < Bank.NUMBER_OF_BANKS; i++) {
            if ((int) ((Double.parseDouble(bankNameAndUSDPrice[result][1]) * 100) /
                    (Double.parseDouble(bankNameAndUSDPrice[i][1]) * 100)) < 0) {
                temp = bankNameAndUSDPrice[result][1];
                temp1 = bankNameAndUSDPrice[result][0];
                bankNameAndUSDPrice[result][1] = bankNameAndUSDPrice[i][1];
                bankNameAndUSDPrice[result][0] = bankNameAndUSDPrice[i][0];
                bankNameAndUSDPrice[i][1] = temp;
                bankNameAndUSDPrice[i][0] = temp1;
                i = 1;
                result = 0;
            } else if () {


            }
        }
        System.out.println("На ринку є 14 банків з різними курсами доллара: ");
        for (
                int i = 0;
                i < Bank.NUMBER_OF_BANKS; i++) {
            System.out.

                    println(Arrays.toString(bankNameAndUSDPrice[i]));
        }
        System.out.

                println("Найкращий курс: ");
        System.out.

                println(Arrays.toString(bankNameAndUSDPrice[result]));
    }
}

