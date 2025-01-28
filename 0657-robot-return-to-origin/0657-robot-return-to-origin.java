class Solution {
    public boolean judgeCircle(String moves) {
        List<Character> allMoves = new ArrayList<>(); 

        for(char c : moves.toCharArray()){
            if(allMoves.size() > 0){
                if(c == 'U' && allMoves.contains('D')){
                    allMoves.remove(Character.valueOf('D'));
                }
                else if(c == 'D' && allMoves.contains('U')){
                    allMoves.remove(Character.valueOf('U'));
                }
                else if(c == 'R' && allMoves.contains('L')){
                    allMoves.remove(Character.valueOf('L'));
                }
                else if(c == 'L' && allMoves.contains('R')){
                    allMoves.remove(Character.valueOf('R'));
                }
                else allMoves.add(c);
            }else allMoves.add(c);

           
        }
        return allMoves.size() > 0 ? false:true;
    }
}