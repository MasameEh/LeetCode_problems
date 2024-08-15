/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
char ** commonChars(char ** words, int wordsSize, int* returnSize){
    char **ans = (char **)malloc(sizeof(char *) * wordsSize);
    int hash[100][26] = {{0}};
    *returnSize = 0;
    int min;
    char *s;

    /* Get the frequency of characters in each word */
    for(int i = 0; i < wordsSize; i++) 
    {
        for (s = words[i]; *s; s++) 
        {
            hash[i][*s - 'a']++;
        }
    }
   
    /* Find out the lowest frequency of each character in words */ 
    for (int i = 0; i < 26; i++) 
    {
        min = INT_MAX;
        
        for (int j = 0; j < wordsSize; j++) 
        {
            if (hash[j][i] < min) 
            {
                min = hash[j][i];
            }
        }

        while(min)
        {
            ans[*returnSize] = (char *)malloc(sizeof(char) * 2);
            ans[*returnSize][0] = i + 'a';
            ans[*returnSize][1] = 0;
            (*returnSize)++;
            min--;
        }
        
    }
     if (*returnSize == 0) 
        {
            free(ans);
            ans = NULL;
        }
    /*
     * Output:
     *  returnSize, number of elements in returned array
     *  return an array of all characters that show up in 
     *  all strings within the words (including duplicates)
     */
    
    return ans;
  
}
