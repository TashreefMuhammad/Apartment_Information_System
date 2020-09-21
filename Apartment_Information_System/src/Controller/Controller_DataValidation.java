package Controller;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Controller_DataValidation {

    public boolean validateContact(String contact) {
        int l = contact.length();

        if (l == 11 && contact.substring(0, 2).equals("01")) {
            int i;
            for (i = 0; i < l; ++i) {
                if (contact.charAt(i) < '0' || contact.charAt(i) > '9') {
                    break;
                }
            }

            if (i == l) {
                return true;
            }
            return false;
        } else {
            return false;
        }
    }

    public boolean validateEmail(String email) {
        Pattern pattern = Pattern.compile("[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,4}");
        Matcher mat = pattern.matcher(email);

        return mat.matches();
    }

    public Boolean validateMoney(String money) {
        int i, j, l = money.length();

        for (i = 0; i < l && money.charAt(i) != '.'; ++i) {
            if (money.charAt(i) < '0' || money.charAt(i) > '9') {
                break;
            }
        }

        if (i == l) {
            return true;
        } else if (money.charAt(i) == '.') {
            for (j = i + 1; j < l; ++j) {
                if (money.charAt(j) < '0' || money.charAt(j) > '9') {
                    break;
                }
            }
            if (j == l) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public boolean isNumber(String number) {
        try {
            Integer.parseInt(number);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
