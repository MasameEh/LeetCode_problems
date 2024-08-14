class Solution {
  int maximumImportance(int n, List<List<int>> roads) {
    Map<int, int> freqMap = {};
    int sum = 0;

    for(List<int> list in roads)
    {
        for(int element in list)
        {
            freqMap.update(
                element, 
                (val) => val+1, 
                ifAbsent: () => 1
            );
        }
    }
    // Convert map entries to a list and sort by values in descending order
    var sortedEntries = freqMap.entries.toList()..sort((a, b) => b.value.compareTo(a.value));
  
    // Create a new map from the sorted entries
    var sortedFreqMap = {for (var entry in sortedEntries) entry.key: entry.value};
    print(sortedFreqMap);

    int maxValue = n;

    Map<int, int> assignedValues = {};
    for (var entry in sortedEntries) {
        assignedValues[entry.key] = maxValue--;
    }

    for(List<int> list in roads)
    {
        for(int element in list)
        {
            sum += assignedValues[element]!;
        }
    }

    return sum;
  }
}