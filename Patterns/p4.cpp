#include <bits/stdc++.h>
using namespace std;
/*
1
2 1  
3 2 1  
4 3 2 1
*/
int main()
{
  for (int i = 0; i < 4; i++)
  {
    for (int j = i + 1; j >= 1; j--)
    {
      cout << j << " ";
    }
    cout << endl;
  }
  return 0;
}
