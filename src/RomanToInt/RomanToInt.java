package RomanToInt;

public class RomanToInt {

    public static void main(String[] args) {
        RomanToInt toInt = new RomanToInt();
        System.out.println(toInt.romanToInt("MCMXCIV"));
    }

    public int romanToInt(String s) {
        char[] ch = s.toCharArray();
        if (s.length() == 1) {
            return getIntByChar(ch[0]);
        }

        int sum = 0;  // 最后返回值

        for (int i = 0; i < ch.length; i++) {
            if (i == ch.length - 1) {
                sum += getIntByChar(ch[i]);
                return sum;
            }

            if (getIntByChar(ch[i]) >= getIntByChar(ch[i + 1])) {
                sum += getIntByChar(ch[i]);
            } else {
                sum -= getIntByChar(ch[i]);
            }
        }

        return sum;
    }

    private int getIntByChar(char s) {
        switch (s) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }
}
