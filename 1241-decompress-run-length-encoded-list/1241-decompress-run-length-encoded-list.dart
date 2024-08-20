class Solution {
  List<int> decompressRLElist(List<int> nums) {
    List<int> decompressedList = [];

    for(int i = 0; i < nums.length/2; i++){
        int freq = nums[2*i];
        int val = nums[2*i+1];

        while(freq > 0){
            decompressedList.add(val);
            freq--;
        }
    }
    return decompressedList;
  }
}