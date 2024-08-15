class Solution {
  double averageWaitingTime(List<List<int>> customers) {
    int startTime = customers[0][0], endTime = 0;
    double sum = 0;

    for (int i = 0; i < customers.length; i++) {
        endTime = startTime + customers[i][1];
        int waitingTime = endTime - customers[i][0];
        sum += waitingTime;

        if (i + 1 < customers.length && customers[i + 1][0] <= endTime) {
            startTime = endTime;
        } else if (i + 1 < customers.length) {
            startTime = customers[i + 1][0];
        }
    }

    double avg = sum / customers.length;
    return avg;
  }
}