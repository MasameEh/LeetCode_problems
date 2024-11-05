class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int count = 0, index = 0;
        Arrays.sort(g);
        Arrays.sort(s);
        for(int i = 0; i < g.length; i++){

            for(int j = index; j < s.length; j++){
                if(s[j] >= g[i]){
                    count++;
                    index = j+1;
                    break;
                }   
            }
        }
        return count;
    }
}