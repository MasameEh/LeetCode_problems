class Solution {
  List<String> commonChars(List<String> words) {

    List<String> commonChars = [];
    
    for(int i = 0; i < words[0].length; i++)
    {
        if(isContains(words[0][i], words))
        {
            commonChars.add(words[0][i]);
        }
    }
    return commonChars;
  }

  static bool isContains(String ch, List<String> words)
  {
    for(int i = 1; i < words.length; i++)
    {
        if(!words[i].contains(ch))
        {
            return false;
        }
        else 
        {
            words[i] = words[i].replaceFirst(ch, "@");
        }
    }
    return true;
  }
}