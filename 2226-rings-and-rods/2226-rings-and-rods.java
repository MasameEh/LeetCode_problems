class Solution {
    public int countPoints(String rings) {
        
        Map<Character, Set<Character>> rodColors =  new HashMap<>();

        for(int i = 0; i < rings.length() - 1; i+=2){
            char currColor = rings.charAt(i);
            char currRod = rings.charAt(i+1);

            rodColors.putIfAbsent(currRod, new HashSet<>());
            rodColors.get(currRod).add(currColor);
        }
        System.out.println(rodColors);
        int count = 0;

        for(Set<Character> colors : rodColors.values()) {
            if(colors.size() == 3){
                count++;
            }
        }
        return count;
    }
}