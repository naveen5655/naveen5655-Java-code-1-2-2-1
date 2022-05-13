package naveen;
public class NaiveSearch {
	public static void search(String txt, String pat)
	{
		int M = pat.length();
		int N = txt.length();
		for (int i = 0; i <= N - M; i++) {
			int j;
			for (j = 0; j < M; j++)
				if (txt.charAt(i + j) != pat.charAt(j))
					break;
			if (j == M) 
				System.out.println("Pattern found at index " + i);
		}
	}

	public static void main(String[] args)
	{
		String txt ="THIS IS A TEST TEXT";
		String pat ="TEST";
		search(txt, pat);
	}
}

