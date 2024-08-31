class Solution {
  List<int> separateDigits(List<int> nums) {
    List<int> separatedDigits = [];

    for(int i = 0; i < nums.length; i++){
        String number = nums[i].toString();

        for(int j = 0; j < number.length; j++){
            separatedDigits.add(int.parse(number[j]));
        }
    }

    return separatedDigits;
  }
}