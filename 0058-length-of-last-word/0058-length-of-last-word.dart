class Solution {
  int lengthOfLastWord(String s) {
    final splitted = s.split(' ').where((word) => word.isNotEmpty).toList();
    print(splitted);
    return splitted[splitted.length-1].length;
  }
}