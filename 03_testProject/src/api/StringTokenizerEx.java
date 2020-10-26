package api;
import java.util.StringTokenizer;
public class StringTokenizerEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringTokenizer st = new StringTokenizer("»´±Êµø/¿Â»≠/»¶ø¨/ƒ·¡„/∆œ¡„", "/");
		while (st.hasMoreTokens())
			System.out.println(st.nextToken("ø¨"));
	}
	
}
