#include <bits/stdc++.h>
using namespace std;
/*
0
11
222
3333
*/
int main()
{
  for (int i = 0; i < 4; i++)
  {
    char ch = 'A' + i;
    for (int j = 0; j <= i; j++)
    {
      cout << ch << " ";
    }
    cout << endl; 
  }
  return 0;
}
