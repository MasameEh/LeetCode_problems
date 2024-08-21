class Solution {
  int sumOfTheDigitsOfHarshadNumber(int x) {
    int sum = 0, num = x;
    while(x > 0){
        int rem = x % 10;
        sum+= rem;
        x ~/= 10;
    }
    return (num % sum == 0) ? sum : -1;
  }
}