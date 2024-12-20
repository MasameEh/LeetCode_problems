class Solution {
public:
    vector<int> finalPrices(vector<int>& prices) {
        for(int i = 0; i < prices.size(); i++){

            for(int j = i+1; j < prices.size(); j++){
                int discount = prices[j];

                if(prices[i] >= discount){
                    prices[i] -= discount;
                    break;
                }
            }
        }
        return prices;

    }
};