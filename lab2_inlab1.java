package naveen;
public class lab2_inlab1 {
	public static void naivesearch(String txt, String pat)
	{
		int M = pat.length();
		int N = txt.length();
		for (int i = 0; i <= N - M; i++) {
			int j;
			for (j = 0; j < M; j++)
				if (txt.charAt(i + j) != pat.charAt(j))
					break;
			if (j == M)
				System.out.println("Pattern found at index:"+i );
			     
		}
	}
	 static void KMPSearch(String pat, String txt)
	    {
	        int M = pat.length();
	        int N = txt.length();
	        int lps[] = new int[M];
	        int j = 0; 
	        computeLPSArray(pat, M, lps);
	        int i = 0; 
	        while (i < N) {
	            if (pat.charAt(j) == txt.charAt(i)) {
	                j++;
	                i++;
	            }
	            if (j == M) {
	                System.out.println("Found pattern "
	                                   + "at index " + (i - j));
	                j = lps[j - 1];
	            }
	
	            else if (i < N && pat.charAt(j) != txt.charAt(i)) {
	                if (j != 0)
	                    j = lps[j - 1];
	                else
	                    i = i + 1;
	            }
	        }
	    }
	 static void computeLPSArray(String pat, int M, int lps[])
	    {
	        int len = 0;
	        int i = 1;
	        lps[0] = 0; 
	        while (i < M) {
	            if (pat.charAt(i) == pat.charAt(len)) {
	                len++;
	                lps[i] = len;
	                i++;
	            }
	            else 
	            {
	                if (len != 0) {
	                    len = lps[len - 1];
	                }
	                else 
	                {
	                    lps[i] = len;
	                    i++;
	                }
	            }
	        }
	    }
	  
	public static void main(String[] args)
	{
		String txt = "AABAACAADAABAAABAA";
		String pat = "AABA";
		System.out.println("Naive:");
		naivesearch(txt, pat);
	System.out.println("KMP:");
	KMPSearch(pat,txt);
		
		
	}
}
