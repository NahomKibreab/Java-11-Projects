public class NumberToWords {

    public static void numberToWords(int number){
        if (number < 0){
            System.out.println("Invalid Value");
        }



    }

    public static int reverse(int number){
        int lastDigit = 0;
        int reversed = 0;
        int orginalNumber = number;
        if (orginalNumber < 0){
            orginalNumber = number * -1;
        }
        for (int i = 0; i < getDigitCount(orginalNumber); i++){
            lastDigit = (number % 10);
            number = number / 10;
            reversed = (reversed * 10) + lastDigit;
        }
        return reversed;
    }

    public static int getDigitCount(int number){
        int digit = 0;
        if (number < 0){
            return -1;
        }

        if (number > 0 && number < 10){
            return 1;
        } else {
            while (number > 0){
                number = number / 10;
                digit++;
            }
        }
        return digit;
    }
}
