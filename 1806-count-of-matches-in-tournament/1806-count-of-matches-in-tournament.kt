class Solution {
    fun numberOfMatches(n: Int): Int {

        var totalCount = 0
   
        var teamsCount = n

        while(teamsCount > 1){
            var matchesCount = 0

            if(teamsCount % 2 == 0){
                matchesCount = teamsCount / 2
                teamsCount /= 2
            }else{
                matchesCount = (teamsCount - 1) / 2
                teamsCount = ((teamsCount - 1) / 2) + 1
            }

            totalCount += matchesCount
        } 
        return totalCount
    }
}