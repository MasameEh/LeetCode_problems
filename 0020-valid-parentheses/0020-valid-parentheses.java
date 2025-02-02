class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>(); 

        for (char c : s.toCharArray()) { 
            if (c == '('){
                stack.push('('); 
            }
            else if (c == '{') 
            {
                stack.push('{'); 
            }
            else if (c == '['){
                stack.push('[');
            } 
            else if (!stack.isEmpty()){
                char bracket = stack.pop();
                switch(c){
                    case ']':
                       if(bracket != '[') return false;
                       break;
                    case '}':
                       if(bracket != '{') return false;
                       break;
                    case ')':
                       if(bracket != '(') return false;
                       break;
                }
                
            }
            else return false;
        }

        return stack.isEmpty();
    }
}