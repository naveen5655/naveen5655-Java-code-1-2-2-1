package naveen;
import java.io.*;
import java.util.*;
import java.util.Map.Entry;
class Codechef1 {
	static class FastReader {
        BufferedReader br;
        StringTokenizer st;
        public FastReader()
        {
            br = new BufferedReader(
                new InputStreamReader(System.in));
        }
 
        String next()
        {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
 
        int nextInt() { return Integer.parseInt(next()); }
 
        long nextLong() { return Long.parseLong(next()); }
 
        double nextDouble()
        {
            return Double.parseDouble(next());
        }
 
        String nextLine()
        {
            String str = "";
            try {
                str = br.readLine();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
	static long  mean(long[] a,long  n ,long s) {	
		long ans=s/n;
		return ans;
	}

	static class Reader {
		final private int BUFFER_SIZE = 1 << 16;
		private DataInputStream din;
		private byte[] buffer;
		private int bufferPointer, bytesRead;

		public Reader()
		{
			din = new DataInputStream(System.in);
			buffer = new byte[BUFFER_SIZE];
			bufferPointer = bytesRead = 0;
		}

		public Reader(String file_name) throws IOException
		{
			din = new DataInputStream(
				new FileInputStream(file_name));
			buffer = new byte[BUFFER_SIZE];
			bufferPointer = bytesRead = 0;
		}

		public String readLine() throws IOException
		{
			byte[] buf = new byte[64]; // line length
			int cnt = 0, c;
			while ((c = read()) != -1) {
				if (c == '\n') {
					if (cnt != 0) {
						break;
					}
					else {
						continue;
					}
				}
				buf[cnt++] = (byte)c;
			}
			return new String(buf, 0, cnt);
		}

		public int nextInt() throws IOException
		{
			int ret = 0;
			byte c = read();
			while (c <= ' ') {
				c = read();
			}
			boolean neg = (c == '-');
			if (neg)
				c = read();
			do {
				ret = ret * 10 + c - '0';
			} while ((c = read()) >= '0' && c <= '9');

			if (neg)
				return -ret;
			return ret;
		}

		public long nextLong() throws IOException
		{
			long ret = 0;
			byte c = read();
			while (c <= ' ')
				c = read();
			boolean neg = (c == '-');
			if (neg)
				c = read();
			do {
				ret = ret * 10 + c - '0';
			} while ((c = read()) >= '0' && c <= '9');
			if (neg)
				return -ret;
			return ret;
		}

		public double nextDouble() throws IOException
		{
			double ret = 0, div = 1;
			byte c = read();
			while (c <= ' ')
				c = read();
			boolean neg = (c == '-');
			if (neg)
				c = read();

			do {
				ret = ret * 10 + c - '0';
			} while ((c = read()) >= '0' && c <= '9');

			if (c == '.') {
				while ((c = read()) >= '0' && c <= '9') {
					ret += (c - '0') / (div *= 10);
				}
			}

			if (neg)
				return -ret;
			return ret;
		}

		private void fillBuffer() throws IOException
		{
			bytesRead = din.read(buffer, bufferPointer = 0,
								BUFFER_SIZE);
			if (bytesRead == -1)
				buffer[0] = -1;
		}

		private byte read() throws IOException
		{
			if (bufferPointer == bytesRead)
				fillBuffer();
			return buffer[bufferPointer++];
		}

		public void close() throws IOException
		{
			if (din == null)
				return;
			din.close();
		}
	}

	

  public static void main(String[] args) throws IOException {
	 // Scanner sc = new Scanner(System.in);
	FastReader sc = new FastReader();
	 // Reader sc = new Reader();
	Long T = sc.nextLong();
	while(T-->0)
	{
		 int n = sc.nextInt();
		    Vector<Integer> a = new Vector<Integer>();
		    int s1=0;
		    int s2=0;
		    for(int i=0;i<n;i++) {
		     a.add(sc.nextInt());
		     s1 += a.elementAt(i);
		    }
		    Map<Integer,Integer> m= new HashMap<Integer,Integer>();
		     HashSet<Integer> b = new HashSet<Integer>(a);
		     Vector<Integer> c = new Vector<Integer>();
		     for(int i:b) {
		    	 s2 += i;
		    	c.add(Collections.frequency(a, i));
		    	 m.put(i, Collections.frequency(a, i));
		     }
		     int ans=0;
		     for (Map.Entry<Integer, Integer> e : m.entrySet())
		     {
		    	 int max = Integer.MIN_VALUE;
		    	 if(max<e.getValue())
		    	 {
		    		 ans=e.getKey();
		    	 }
		     }
		     int flag=0;
		      for(int i=0;i<c.size();i++)
		      {
		    	  int ad=c.elementAt(i);
		    	  c.removeElementAt(i);
		    	if(c.contains(ad))
		    	{
		    		flag=1;
		    		break;
		    	}
		      }
		     if(s1==s2 && flag>0)
		    	 System.out.println("CONFUSED");
		     else {
		    	 System.out.println(ans);
		     }
		     
	}
  }

}
