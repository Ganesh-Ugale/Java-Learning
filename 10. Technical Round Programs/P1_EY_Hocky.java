/*
EY Company Technical Round Question
Q.1) Bob loves playing hockey. One day, as he was watching a hockey match, he was writing the players' current positions on a piece of paper. To simplify the situation he depicted it as a string consisting of zeros and ones. A zero corresponds to players of one team; a one corresponds to players of another team. If there are at least 7 players of some team standing one after another, then the situation is considered dangerous.
-----------------------------------------------------------------------------------------
For example, the situation 0100110111111101 is dangerous and 11101110111101 is not.
You are given the current situation. Determine whether it is dangerous or not.

INPUT: One line containing a non-empty string S consisting of characters "0" and "1"

OUTPUT: Print "YES" if the situation is dangerous. Otherwise, print "NO".

CONSTRAINTS
1 ≤ length of string ≤ 100
*/


class P1_EY_Hocky{
    public static void main(String[] args){

        String str = "1010010101100101010101";
        int len = str.length();
        int count1 = 0, count0 = 0;

        for (int i = 0; i < len; i++){
            char ch = str.charAt(i);

            if (ch == '1') {
                count1++;
                count0 = 0;

                if (count1 >= 7)
                    break;
            }
            else if(ch == '0'){
                count0++;
                count1 = 0;

                if(count0 >= 7)
                    break;
            }
        }
        System.out.println(count1 >= 7 || count0 >= 7 ? "YES, it is Danger!" : "NO, Danger!");
    }
}