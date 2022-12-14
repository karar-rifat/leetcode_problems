import java.util.Stack;

class Solution_20{
    public boolean isValid(String s){
        char[] parentheses = s.toCharArray();
        Stack<Character> characters = new Stack<>();
        if(parentheses.length == 0) return false;
        for(char p : parentheses){
            if(p == '(' || p == '{' || p == '['){
                characters.push(p);
            }else if(p == ')' || p == '}' || p == ']'){
                if(characters.empty()) return false;
                char c = characters.pop();
                if(c=='(' && p==')' || c=='{' && p=='}' || c=='[' && p==']' ) continue;
                else return false;
            }
        }
        return characters.empty();
    }
    public static void main(String[] args){
        Solution_20 s = new Solution_20();
        boolean b = s.isValid("");
        System.out.println(b);
    }
}