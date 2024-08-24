class Solution {
  int minimumSum(int num) {
    List<int> digits = num.toString().split('').map(int.parse).toList();

    digits.sort();

    int new1 = digits[0] * 10 + digits[2];
    int new2 = digits[1] * 10 + digits[3];

    return new1 + new2;
  }
}