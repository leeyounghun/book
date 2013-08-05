package al;

import java.security.InvalidAlgorithmParameterException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test2 {

	/**
	 * @param args
	 * @throws InvalidAlgorithmParameterException
	 */
	public static void main(String[] args) throws InvalidAlgorithmParameterException {
		String reg = "[a-zA-Z]+";
		String chars = "adbcdefgjklieabcdefghiabcdeeed";

		if(chars.matches(reg)){
			Integer charsLength = chars.length();
			Integer[] as2 = new Integer[charsLength];
			Integer[] indexCnt = new Integer[charsLength];
			Test2 t = new Test2();

			as2 = t.covert(chars);

			for (int i = 0; i < indexCnt.length; i++) {
				System.out.println(as2[i]);
			}
			for (int i = 0; i < indexCnt.length; i++) {
				indexCnt[i] = 0;
			}

			Integer maxIndex = 0;
			Integer maxSize = 0;
			for (int i = 0; i < charsLength; i++) {
				for (int j = i + 1, x = 1; j < charsLength; j++, x++) {
					if ((as2[i] + x) == as2[j]) {
						indexCnt[i] = indexCnt[i] + 1;
						if(maxSize < indexCnt[i]){
							maxSize = indexCnt[i];
							maxIndex = i;
						}

					} else {
						break;
					}
				}
			}

			for (int i = 0; i < indexCnt.length; i++) {
				System.out.println(indexCnt[i]);
			}

			System.out.println("ind : " + maxIndex);
			System.out.println("size : " + maxSize);
			System.out.print(new StringBuffer(chars.substring(maxIndex, maxIndex + maxSize +1)).reverse().toString());
		}else{
			System.out.println("invalid arg only alpah accepted");
		}


	}

	public Integer[] covert(String input) {
		Integer[] as2 = new Integer[input.length()];
		for (int i = 0; i < input.length(); i++) {
			as2[i] = (int) input.charAt(i);
		}

		return as2;
	}
}
