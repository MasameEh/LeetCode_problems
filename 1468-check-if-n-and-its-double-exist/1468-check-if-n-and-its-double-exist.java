class Solution {
    public boolean checkIfExist(int[] arr) {
        HashSet<Integer> contain = new HashSet<>();

        for(int num : arr){
            if(contain.contains(num * 2) || (num % 2 == 0 && contain.contains(num / 2))) {
                return true;
            }
            contain.add(num);
        }
        return false;
    }

}