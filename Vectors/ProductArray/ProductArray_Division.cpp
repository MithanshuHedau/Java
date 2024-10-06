#include <bits/stdc++.h>
using namespace std;

int main()
{
  vector<int> vec1 = {1, 2, 3, 4};
  vector<int> vec2;
  int ans;
  int mulresult = 1;
  for (int i = 0; i < vec1.size(); i++)
  {
    mulresult *= vec1[i];
  }
  for (int i = 0; i < vec1.size(); i++)
  {
    ans = 0;
    ans = mulresult / vec1[i];
    vec2.push_back(ans);
  }

  for (int i = 0; i < vec2.size(); i++)
  {
    cout << vec2[i] << " ";
  }
  return 0;
}