import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PostfixExpression {
    public static void func(String s) {
        s = s.replaceAll("\\s+", "");

        for (int i = 0; i < s.length(); i++) {
            if ((s.charAt(i) == '-' || s.charAt(i) == '+') && (i == 0 || s.charAt(i - 1) == '(')) {
                if (i == 0) {
                    s = "0" + s;
                } else {
                    s = s.substring(0, i) + "0" + s.substring(i);
                }
            }
        }

        char[] str = s.toCharArray();
        for (int i = 0; i < str.length - 1; i++) {
            if (str[i] == '+' && str[i + 1] == '-') {
                str[i] = ' ';
                str[i + 1] = '-';
            } else if (str[i] == '+' && str[i + 1] == '+') {
                str[i] = ' ';
                str[i + 1] = '+';
            } else if (str[i] == '-' && str[i + 1] == '+') {
                str[i] = ' ';
                str[i + 1] = '-';
            } else if (str[i] == '-' && str[i + 1] == '-') {
                str[i] = ' ';
                str[i + 1] = '+';
            }
        }

        String s1 = new String(str);
        s1 = s1.replaceAll("\\s+", "");
        char[] str1 = s1.toCharArray();

        List<String> list = new ArrayList<>();
        Stack<String> opStack = new Stack<>();
        String op1 = "+-";
        String op2 = "+-*/%";
        String op3 = "*/%";

        for (int i = 0; i < str1.length; i++) {
            int num = 0;
            boolean flag = false;
            boolean negFlag = false;

//            if (str1[i] == '-' && !Character.isDigit(str1[i - 1])) {
//                i++;
//                negFlag = true;
//            }
            for (; i < str1.length && Character.isDigit(str1[i]); i++) {
                num = num * 10 + Character.getNumericValue(str1[i]);
                flag = true;
            }
//            if (negFlag) {
//                num = -num;
//                negFlag = false;
//            }
            if (flag) {
                list.add(String.valueOf(num));
                i--;
                flag = false;
                continue;
            }

            if (opStack.size() == 0 || str1[i] == '(') {
                opStack.push(str1[i] + "");
                continue;
            }

            if (str1[i] == ')') {
                while (opStack.size() != 0 && !opStack.peek().equals("(")) {
                    list.add(opStack.pop());
                }
                opStack.pop();
                continue;
            }

            while (opStack.size() != 0 && op1.contains(str1[i] + "") && op2.contains(opStack.peek())) {
                list.add(opStack.pop());
            }
            while (opStack.size() != 0 && op3.contains(str1[i] + "") && op3.contains(opStack.peek())) {
                list.add(opStack.pop());
            }
            opStack.push(str1[i] + "");
        }

        while (opStack.size() != 0) {
            list.add(opStack.pop());
        }

        int sum = 0;
        boolean flag = false;
        for (int i = 2; list.size() != 1; i++) {
            switch (list.get(i)) {
                case "+" -> {
                    sum = Integer.parseInt(list.get(i - 2)) + Integer.parseInt(list.get(i - 1));
                    flag = true;
                }
                case "-" -> {
                    sum = Integer.parseInt(list.get(i - 2)) - Integer.parseInt(list.get(i - 1));
                    flag = true;
                }
                case "*" -> {
                    sum = Integer.parseInt(list.get(i - 2)) * Integer.parseInt(list.get(i - 1));
                    flag = true;
                }
                case "/" -> {
                    sum = Integer.parseInt(list.get(i - 2)) / Integer.parseInt(list.get(i - 1));
                    flag = true;
                }
            }
            if (flag) {
                list.set(i, String.valueOf(sum));
                list.remove(i - 1);
                list.remove(i - 2);
                i = 1;
                flag = false;
            }
        }

        System.out.println(list.get(0));
    }
}
