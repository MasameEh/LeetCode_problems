class Solution {
  int minOperations(List<String> logs) {
    int minOperations = 0;

    for (int i = 0; i < logs.length; i++) {
        if (logs[i] != "../" && logs[i] != "./") {
            minOperations++;
        } else if (logs[i] == "../" && minOperations != 0) {
            minOperations--;
        }
    }
    return minOperations;
  }
}