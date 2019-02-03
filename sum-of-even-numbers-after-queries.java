/*
   题目：查询后的偶数和
          给出一个整数数组 A 和一个查询数组 queries。
          对于第 i 次查询，有 val = queries[i][0], index = queries[i][1]，我们会把 val 加到 A[index] 上。然后，第 i 次查询的答案是 A 中偶数值的和。
（此处给定的 index = queries[i][1] 是从 0 开始的索引，每次查询都会永久修改数组 A。）
          返回所有查询的答案。你的答案应当以数组 answer 给出，answer[i] 为第 i 次查询的答案。
*/


/** code-finished_firstly**/

class Solution {
    public int[] sumEvenAfterQueries(int[] A, int[][] queries) {
      int len = queries.length;
      int len1 = A.length;
      int result[] = new int [len] ; 
      for(int i=0;i<len;i++)
      {
          int val = queries[i][0];
          int index = queries[i][1];
          A[index] +=val;
          int temp=0;
          for(int j=0;j<len1;j++)
          {
              if(A[j]%2==0)
              {
                  temp+=A[j];
              }
          }
          result[i]=temp;
      }
        return result;
    }
}
