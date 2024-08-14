class Solution {
  List<int> luckyNumbers (List<List<int>> matrix) {
    Map<int, int> minElements = {};
    List<int> luckyNumbers = [];

    for(int i = 0; i < matrix.length; i++){
        int minNum = matrix[i].reduce(min);
        minElements[minNum] = matrix[i].indexOf(minNum);
    }
    print(minElements);
    

    minElements.forEach((key,value) {
        int i = 0;
        while(i < matrix.length){
            if(key >= matrix[i][value]){

            }else break;
            i++;
            if(i == matrix.length){
                luckyNumbers.add(key);
            }
        }
    }
        
    );
    return luckyNumbers;
  }
}