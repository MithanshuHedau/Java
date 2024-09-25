#include <bits/stdc++.h>
using namespace std;

vector<int> pairsums(vector<int> vec, int target)
{
  vector<int> ans;
  int n = vec.size();
  for (int i = 0; i < n; i++)
  {
    for (int j = i + 1; j < n; j++)
    {
      if (vec[i] + vec[j] == target)
      {
        ans.push_back(i);
        ans.push_back(j);
        return ans;
      }
    }
  }
  return {};
}

int main()
{
  vector<int> arr = {2, 7, 11, 15};

  vector<int> finalans=pairsums(arr,9);
  cout<<finalans[0]<<" "<<finalans[ 1];

  return 0;
}