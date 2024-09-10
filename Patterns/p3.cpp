#include <bits/stdc++.h>
using namespace std;
/*
1    i=0 j=0
1 2  i=1 j=1
1 2 3
1 2 3 4
*/
int main()
{
  for (int i = 0; i < 4; i++)
  {
    for (int j = 0; j <= i; j++)
    {
      cout << j + 1;
    }
    for (int j = i; j < 4; j++)
    {
      cout << " ";
    }
    cout << endl;
  }
  return 0;
}
