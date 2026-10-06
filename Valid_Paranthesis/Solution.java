class Solution {
    public boolean isValid(String s) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == '(' ||
                s.charAt(i) == '[' ||
                s.charAt(i) == '{') {

                sb.append(s.charAt(i));
            }
            else {

                if (sb.length() == 0) {
                    return false;
                }

                char last = sb.charAt(sb.length() - 1);

                if ((s.charAt(i) == ')' && last == '(') ||
                    (s.charAt(i) == ']' && last == '[') ||
                    (s.charAt(i) == '}' && last == '{')) {

                    sb.deleteCharAt(sb.length() - 1);

                } else {
                    return false;
                }
            }
        }

        return sb.length() == 0;
    }
}