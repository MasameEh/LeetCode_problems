class Solution {
    public long coloredCells(int n) {

        if(n == 1) return 1;
        if(n == 2) return 5;

        long ret = 5, step = 4;

        for(int i = 3; i <= n; i++){
            step += 4;
            ret += step;
        }

        return ret;
    }
}