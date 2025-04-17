class Solution {
    public boolean isValid(String s) {
        int n = s.length();
    // Quick reject: odd length can't be fully paired
    if ((n & 1) == 1) return false;

    char[] stack = new char[n];
    int top = 0;

    for (int i = 0; i < n; i++) {
        char c = s.charAt(i);
        if (top > 0 && isMatchingPair(stack[top - 1], c)) {
            // pop matching open bracket
            top--;
        } else {
            // push new bracket (open or unmatched close)
            stack[top++] = c;
        }
    }
    return top == 0;
}

private boolean isMatchingPair(char open, char close) {
    // single comparison of three possibilities
    return (open == '(' && close == ')')
        || (open == '[' && close == ']')
        || (open == '{' && close == '}');
}
}