class Solution {
  List<List<int>> construct2DArray(List<int> original, int m, int n) {
    if(n*m != original.length){
        return [];
    }
    List<List<int>> arr2D =  List.generate(m, (_) => List.generate(n,(_) => 0));
    int nextIndex = 0;
    for(int i = 0; i < m; i++){
        for(int j = 0; j < n; j++){
            arr2D[i][j] = original[nextIndex++];
        }
    }
    return arr2D;
  }
}