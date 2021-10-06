package nl.tst.pg2.testpg2ass2;

public class StringUtility {

    public String reverseString(String s) {
        String reversed = "";
        for (int i = s.length()-1; i >= 0 ; i--) {
            reversed += s.charAt(i);
        }
        return reversed;
    }

    public String capitalizeString(String s) {
        char strArr[] = s.toCharArray();
        for (int i = 0; i < strArr.length; i++) {
            if (strArr[i] >= 'a' && strArr[i] <= 'z') {
                strArr[i] = (char) ((int) strArr[i] - 32);
            }
        }
        return String.valueOf(strArr);
    }

    public String lowercaseString(String s) {
        char strArr[] = s.toCharArray();
        for (int i = 0; i < strArr.length; i++) {
            if (strArr[i] >= 'A' && strArr[i] <= 'Z') {
                strArr[i] = (char) ((int) strArr[i] + 32);
            }
        }
        return String.valueOf(strArr);
    }
}
