#include <bits/stdc++.h>
using namespace std;
/*
1234
 234 i=1 j=i
  34 i=2 j=2
   4
*/
int main()
{
  int n = 4 ; 
  int num = 1 ;
  for (int i = 0; i < 3; i++)
  {
    for (int j = 0; j < 3; j++)
    {
      cout << num;
      num++;
    }
    cout << endl;
  }
  return 0;
}