import java.util.Stack;

/**
 * 力扣394，字符串解码
 */
public class DecodeString {
    public String decodeString(String s) {
        Stack<String> stack = new Stack<>();
        char[] chars = s.toCharArray();
        int i = 0;

        for (char c : chars) {
            if (']' == c) {
                String popStack = stack.pop();
                StringBuilder stringBuilder = new StringBuilder();
                while (!String.valueOf('[').equals(popStack)) {
                    stringBuilder.insert(0, popStack);
                    popStack = stack.pop();
                }

                int size = Integer.parseInt(stack.pop());

                stack.push(String.valueOf(stringBuilder).repeat(Math.max(0, size)));

            } else {
                if ('[' == c) {
                    String size = getSize(chars, i);
                    stack.push(size);
                }

                if (!Character.isDigit(c)) {
                    stack.push(String.valueOf(c));
                }

            }
            i++;
        }

        StringBuilder result = new StringBuilder();
        for (String str : stack) {
            result.append(str);
        }

        return result.toString();
    }

    private String getSize(char[] chars, int i) {
        StringBuilder sizeStr = new StringBuilder();
        for (int j = i - 1; j >= 0; j--) {
            if (!Character.isDigit(chars[j])) {
                break;
            }

            sizeStr.insert(0, chars[j]);
        }

        return sizeStr.toString();
    }

    public static void main(String[] args) {
        DecodeString decodeString = new DecodeString();

        String s = decodeString.decodeString("3[a]2[bc]");
        System.out.println(s);
    }
}
