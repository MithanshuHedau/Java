#include <bits/stdc++.h>
using namespace std;

int main()
{
  int arr[] = {7, 1, 5, 3, 6, 4};
  int n = sizeof(arr) / sizeof(arr[0]);

  int minNum = arr[0];
  int profit = 0;
  int cost;

  for (int i = 1; i < n; i++)
  {
    cost = arr[i] - minNum;
    profit = max(profit, cost);
    minNum = min(minNum, arr[i]);
  }
  cout << profit;

  return 0;
}