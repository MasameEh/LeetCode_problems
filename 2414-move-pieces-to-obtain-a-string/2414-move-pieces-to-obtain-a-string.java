class Solution {
    public boolean canChange(String start, String target) {
        if (!start.replace("_", "").equals(target.replace("_", ""))) {
            return false;
        }
        
        for(int i = 0, j = 0; i < start.length(); i++){
            char c = start.charAt(i);

            if(c == '_'){
                continue;
            }else{
                while (target.charAt(j) == '_') {
                    j++;
                }
                if(c == 'L'){
                    if (i < j) {
                        return false;
                    }
                }else{
                    if (i > j) {
                        return false;
                    }
                }
            }
            j++;
        }
        return true;
    }
}