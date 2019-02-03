/*
   题目：各位相加
        
      给定一个非负整数 num，反复将各个位上的数字相加，直到结果为一位数。
      
      示例:
          输入: 38  
          输出: 2 
          解释: 各位相加的过程为：3 + 8 = 11, 1 + 1 = 2。 由于 2 是一位数，所以返回 2。
*/

/**Summary**
 数根：（自然数的属性），其定义即为题目  数根的特性有：数根就是原数字对于9的余数
 数学计算方法：求num的数根： 1+(num-1)%9

 
 ***/
 
 /**code-finished_after_search_digits root**/
 class Solution {
    public int addDigits(int num) {
        return 1+((num-1)%9);
    }
}
