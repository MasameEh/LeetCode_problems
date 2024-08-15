
int count_set_bits(int num)
{
    int ret_counter = 0;
    while(num > 0)
    {
        num &= num-1;
        ret_counter++;
    }
    return ret_counter;
}

/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* countBits(int n, int* returnSize) {
    int i=0, counter = 0;
    int* retArray = (int*) malloc(sizeof(int) * (n+1));
    *returnSize = n+1;
    while( n >= 0)
    {
        counter = count_set_bits(n);
        retArray[n] = counter;
        n--;
    }
    return retArray;
}