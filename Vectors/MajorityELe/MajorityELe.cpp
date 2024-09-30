#include <bits/stdc++.h>
using namespace std;

int main()
{
  vector<int> vec = {1, 2, 2, 1, 1};
  int n = vec.size();
  int freq;

  for (int val : vec)
  {
    freq = 0;
    for (int vd : vec)
    {
      if (val == vd)
      {
        freq++;
      }
    }
    if (freq > n / 2)
    {
      cout << "Majority Element" << endl;
    }
    else
    {
      cout << "No element" ;
    }
  }

  return 0;
}