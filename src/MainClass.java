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
//        Перший варіант вирішення задачі без сортування, лише через находження найбільшого курсу
//        boolean bigger;
//        int result = 0;
//        for (int i = 1; i < Bank.NUMBER_OF_BANKS; i++) {
//            bigger = (int) ((Double.parseDouble(bankNameAndUSDPrice[result][1]) * 100) /
//                    (Double.parseDouble(bankNameAndUSDPrice[i][1]) * 100)) > 0;
//            if (!bigger) {
//                result = i;
//            }
//        }

//        for (int i = 0; i < Bank.NUMBER_OF_BANKS; i++) { // Вивід у консоль не сортованого масиву додано для тестування
//            System.out.println(Arrays.toString(bankNameAndUSDPrice[i]));
//        }
//        Другий варіант вирішення завдання з додаванням сортування бульбашковим алгоритмом
        String temp;
        String temp1;
        for (int i = 0; i < bankNameAndUSDPrice.length; i++) {
            for (int j = bankNameAndUSDPrice.length - 1; j > i; j--) {
                if ((int) ((Double.parseDouble(bankNameAndUSDPrice[i][1]) * 100) /
                        (Double.parseDouble(bankNameAndUSDPrice[j][1]) * 100)) > 0) {
                    temp = bankNameAndUSDPrice[i][1];
                    temp1 = bankNameAndUSDPrice[i][0];
                    bankNameAndUSDPrice[i][1] = bankNameAndUSDPrice[j][1];
                    bankNameAndUSDPrice[i][0] = bankNameAndUSDPrice[j][0];
                    bankNameAndUSDPrice[j][1] = temp;
                    bankNameAndUSDPrice[j][0] = temp1;
                }
            }
        }
//        for (int i = 0; i < Bank.NUMBER_OF_BANKS; i++) { // Вивід у консоль сортованого масиву додано для тестування
//            System.out.println(Arrays.toString(bankNameAndUSDPrice[i]));
//        }
        System.out.println("Найкращий курс у наступних банках: ");
        System.out.println(Arrays.toString(bankNameAndUSDPrice[Bank.NUMBER_OF_BANKS - 1]));
        System.out.println(Arrays.toString(bankNameAndUSDPrice[Bank.NUMBER_OF_BANKS - 2]));
        System.out.println(Arrays.toString(bankNameAndUSDPrice[Bank.NUMBER_OF_BANKS - 3]));
    }
}

