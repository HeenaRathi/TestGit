import java.util.HashSet;
import java.util.Set;

public class DuplicateChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str= "Hello World";
		char[] charArray= str.toCharArray();
		Set<Character> set= new HashSet<Character>();
		for(int i=0; i<charArray.length;i++)
		{
			if(!set.add(charArray[i]))
			{
				System.out.println("Duplicate characters at position"+i);
			}
		}
	}

}
