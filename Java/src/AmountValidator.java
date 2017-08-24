import java.util.regex.Pattern;


public class AmountValidator {
    public static void main(String[] args) {
        AmountValidator amountValidator = new AmountValidator();
        System.out.println(amountValidator.validateAmount("99999999999.99"));
    }

    public boolean validateAmount(String amount){

        boolean isValid = true;
        String regExp = "^(\\$?\\d{1,3}(,?\\d{3})?(\\.\\d\\d?)?|\\(\\$?\\d{1,3}(,?\\d{3})?(\\.\\d\\d?)?\\))$";
        final Pattern amountPattern = Pattern.compile(regExp.toString());
        if(!amount.matches(amountPattern.pattern())) {
            isValid = false;
        }
        return isValid;
    }
}
