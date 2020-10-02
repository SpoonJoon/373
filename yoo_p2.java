package yoo_p2;

public class yoo_p2 {
	static String gateDirections;
	static String inputString;
	public static void main(String[] args) {

		gateDirections = args[0];
		inputString = args[1];

		System.out.println(do_p2(gateDirections, inputString));
		

	}

	static String do_p2(String directions, String input) {
		String s=directions;	
		char[] temp=directions.toCharArray();
		char output = 'B';
		for(int i=0; i<input.length(); i++) {
			if(temp[0] == 'L') {
				//changing first char
				if(input.charAt(i)=='0')
					temp[0] = 'R';
				else
					temp[0] = 'C';

				//changing second char
				if(temp[1] == 'L') {
					//return B
					output='B';
					temp[1] = 'R';
				}else{
					//return C
					output='C';
					temp[1] = 'L';
				}
			}else if(temp[0] == 'C') {
				//we go to X3
				if(input.charAt(i)=='0')
					temp[0] = 'L';
				else
					temp[0] = 'R';

				if(temp[2] == 'L') {
					output ='C';
					temp[2] ='R';
				}else{
					//return D
					output = 'D';
					temp[2] = 'L';
				}
			}else{
				//we go to X4
				if(input.charAt(i)=='0')
					temp[0] = 'C';
				else
					temp[0] = 'L';

				if(temp[3] == 'L') {
					//return D
					output = 'D';
					temp[3] = 'R';
				}else {
					//return E
					output = 'E';
					temp[3] = 'L';
				}
			}

			if(i == input.length()) {

			}
			String tempString = new String(temp);
			s+="->"+tempString;
		}
		return s + " " + output;
	}
}