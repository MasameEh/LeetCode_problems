class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> magafreq = new HashMap<>();

        for (char c : magazine.toCharArray()) {
            magafreq.put(c, magafreq.getOrDefault(c, 0) + 1);
        }

        for (char c : ransomNote.toCharArray()) {
            if (!magafreq.containsKey(c) || magafreq.get(c) <= 0) {
                return false;
            }
            magafreq.put(c, magafreq.get(c) - 1);
        }

        return true;
    }
}