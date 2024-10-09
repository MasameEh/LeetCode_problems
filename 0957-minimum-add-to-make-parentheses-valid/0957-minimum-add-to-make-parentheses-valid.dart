class Solution {
  int minAddToMakeValid(String s) {
    int openCount = 0; // To track unmatched opening parentheses
    int closeCount = 0; // To track unmatched closing parentheses
    
    for (int i = 0; i < s.length; i++) {
      if (s[i] == '(') {
        openCount++;  // Push '(' onto the stack
      } else {
        if (openCount > 0) {
          openCount--;  // Pop '(' from the stack if available
        } else {
          closeCount++; // No matching '(', so we need an extra '('
        }
      }
    }
    
    // The total moves required will be unmatched '(' + unmatched ')'
    return openCount + closeCount;
  }
}