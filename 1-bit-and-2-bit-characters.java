/*
题目：
       有两种特殊字符。第一种字符可以用一比特0来表示。第二种字符可以用两比特(10 或 11)来表示。
       现给一个由若干比特组成的字符串。问最后一个字符是否必定为一个一比特字符。给定的字符串总是由0结束。
*/

/**code1-finished_firstly**/
class Solution {
    public boolean isOneBitCharacter(int[] bits) {
        if(bits==null||bits.length==0)
            return false;
        int len = bits.length;
        if(len==1) return true;
        int i=0;
        boolean result=true;
        while(i<len)
        {
            if(bits[i]==1) {i+=2; result=false;}
            else{i++; result=true;}
        }
        return result;
    }
}
