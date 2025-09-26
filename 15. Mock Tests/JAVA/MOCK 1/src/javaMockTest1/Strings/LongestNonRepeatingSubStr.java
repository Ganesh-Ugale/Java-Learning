package javaMockTest1.Strings;

public class LongestNonRepeatingSubStr {
	
	public static void main(String[] args) {
		String str = "abcabc";
		System.out.println(nonRepeatSubStr(str));
		
	}
	
//	METHODS
	public static String nonRepeatSubStr(String str) {
		String temp = "", ans = "";
		
		for (int i = 0; i < str.length()-1;i++) {
			for (int j = i+1; j <= str.length()-1;j++) {
				
				boolean flag = false;
				if (str.charAt(i) != str.charAt(j)) {
					if (temp.length() < 2) {
						temp += str.charAt(j-1)+"" + str.charAt(j);
					}
					else {
						int j2 = 0;
							for ( ; j2 <= temp.length()-1; j2++) {
								if (str.charAt(j) == temp.charAt(j2)) {
									flag = true;
									break;
								}
							}
						
						if (!flag) {
							temp += str.charAt(j);
						}
						else if(j2==0 && !flag) {
							temp += str.charAt(j);
						}
						if (flag) {
							break;
						}
					}
				}
				else if(temp.length() > ans.length()) {
					ans = temp;
					temp = "";
					break;
				}
			}
			if (temp.length()>ans.length()) {
				ans = temp;
				temp = "";
			}
		}
		
		if (str.length()!=0 && ans.length()==0) {
			ans = str.charAt(0)+"";
		}
		
		return ans;
	}
}
