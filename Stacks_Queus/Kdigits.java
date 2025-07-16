class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < num.length(); i++) {
            char digit = num.charAt(i);
            while (!stack.isEmpty() && k > 0 && stack.peek() - '0' > digit - '0') {
                stack.pop();
                k--;
            }
            stack.push(digit);
        }

        while (k > 0) {
            stack.pop();
            k--;
        }

        if (stack.isEmpty()) {
            return "0";
        }

        String s = "";
        while (!stack.isEmpty()) {
            s += stack.pop();
        }

        String ans = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            ans += s.charAt(i);
        }

        int index = 0;
        while (index < ans.length() && ans.charAt(index) == '0') {
            index++;
        }

        if (index == ans.length()) {
            return "0";
        }

        ans = ans.substring(index);
        return ans;
    }
}
