class Solution {
  int maxDistance(List<int> position, int m) {
    position.sort();
    int n = position.length, ans = -1;
    int l = 1, r = (position[n-1] - position[0]); 

    while(l <= r)
    {
        int mid = l + (r - l) ~/ 2;
        int lastPosition = position[0], balls = 1;

        for(int i = 1; i < position.length; i++)
        {
            if(position[i] - lastPosition >= mid && balls < m)
            {
                lastPosition = position[i];
                balls++;
            }
        }
        print(balls);
        if(balls == m)
        {
            ans = mid;
            l = mid + 1;
        }
        else{
            r = mid - 1;
        }
    }
    return ans;
  }
}