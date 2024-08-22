class Solution {
  int findComplement(int num) {
    int complement = 0; // This will store the result
    int power = 1;      // Power of 2 to place the flipped bits correctly

    while (num > 0) {
        int currentBit = num & 1;

        if (currentBit == 0) {
            complement += power;
        }

        power <<= 1;  // Move to the next bit (multiply power by 2)
        num >>= 1;    // Shift `num` to the right to process the next bit
    }
    return complement;
  }
}