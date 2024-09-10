#include <bits/stdc++.h>
using namespace std;
/*
1111
 222
  33
   4
*/
int main()
{
  for (int i = 0; i < 4; i++)
  {
    for (int j = 0; j < i; j++)
    {
      cout << " ";
    }
    for (int j = i; j < 4; j++)
    {
      cout << i + 1;
    }
    cout << endl;
  }
  return 0;
}
