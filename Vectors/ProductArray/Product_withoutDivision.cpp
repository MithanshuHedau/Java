#include <bits/stdc++.h>
using namespace std;
//Without Division operator 
int main()
{
  vector<int> vec1 = {1, 2, 3, 4};
  vector<int> vec2;
  int mul;

  for (int i = 0; i < vec1.size(); i++)
  {
    mul = 1;
    for (int j = 0; j < vec1.size(); j++)
    {
      if (i == j)
      {
        continue;
      }
      mul *= vec1[j];
    }
    vec2.push_back(mul);
  }
  for (int i = 0; i < vec2.size(); i++)
  {
    cout << vec2[i] << " ";
  }
  return 0;
}