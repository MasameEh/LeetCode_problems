class Solution {
  int maxFrequencyElements(List<int> nums) {
    Map<int, int> freq = {};
    int maxFreq = 0;
    int maxFreqCount = 0;

    for (int num in nums) {
      freq[num] = (freq[num] ?? 0) + 1;
      if (freq[num]! > maxFreq) {
        maxFreq = freq[num]!;
        maxFreqCount = 1;
      } else if (freq[num]! == maxFreq) {
        maxFreqCount++;
      }
    }

    return maxFreq * maxFreqCount;
  }
}