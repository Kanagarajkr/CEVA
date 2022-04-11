package stringRelatedPrograms;

public class TC06_ReverseWordsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub]
		String input = "My name is KR";
		String reverse="";
		String[] split = input.split(" ");
		System.out.println(split.length);
		//char[] charArray = input.toCharArray();
		for (int i = split.length-1; i >=0; i--) {
			reverse = reverse+split[i];
		}
		System.out.println(reverse);
	}

}
