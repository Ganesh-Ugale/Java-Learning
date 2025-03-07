/*
Generate 10 OTP's of the 6 Digit Only
*/

class OtpGeneration
{
	public static void main(String args[])
	{
		String otp = ""; // Initially otp rest empty

		for (int cnt = 1; cnt<=10 ; ) // Only 10 OTP generates so loop iterates only 10 times
		{
			otp += (int)(Math.random()*1000000); // generates random num and convert it into int
			if (otp.length()==6) // if len is == 6 then enters into block otherwise exit
			{
				System.out.println(i + ": " + otp);
				cnt++; // update the cnt only in this condn bcz most of the time otp generates less than the 6 digit so the loop cnt++ so total otp's not comes as expected
			}
			otp = ""; // Reset the opt var for next otp add
		}		
	}
}