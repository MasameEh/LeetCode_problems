class Solution {
    int minimumDeletions(String s) {
        int bCount = 0;
        int delReq = 0;

        for (int i = 0; i < s.length; i++) {
        if (s[i] == 'b') {
            bCount++;
        } else {
            delReq = (bCount < delReq + 1) ? bCount : delReq + 1;
        }
        }
        return delReq;
    }
}