class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        int len1 = s1.length();
        int diffCount = 0;
        Set<Character> setDiff1 = new TreeSet<Character>();
        Set<Character> setDiff2 = new TreeSet<Character>();

        for(int i = 0; i < len1; i++){
            if(s1.charAt(i) != s2.charAt(i)){
                diffCount++;
                setDiff1.add(s1.charAt(i));
                setDiff2.add(s2.charAt(i));
            }
        }

        return setDiff1.equals(setDiff2) && (diffCount == 2|| diffCount == 0);
    }
}