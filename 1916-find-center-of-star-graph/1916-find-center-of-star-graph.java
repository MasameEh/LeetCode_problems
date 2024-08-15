class Solution {
    public int findCenter(int[][] edges) {
        int center = 0; 

        if(edges[1][0] == edges[0][0] || edges[1][1] == edges[0][0])
        {
            center = edges[0][0];
        }
        else center = edges[0][1];

        return center;
    }
}