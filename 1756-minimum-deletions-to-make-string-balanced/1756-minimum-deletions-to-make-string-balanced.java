class Solution {
    public int minimumDeletions(String s) {
        int bCount = 0;
        int delReq = 0;

        for(char chr : s.toCharArray()){
            if(chr == 'b'){
                bCount++;
            }else{
                delReq = Math.min(bCount, delReq + 1);
            }
        }
        return delReq;
    }
}