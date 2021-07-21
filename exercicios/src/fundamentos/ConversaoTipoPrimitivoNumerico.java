package fundamentos;

public class ConversaoTipoPrimitivoNumerico {
	public static void main(String[] args) {

		double a = 1; // conversao implícita
		System.out.println(a);

		float b = (float) 1.123456788888; // conversao explícita (CAST)
		System.out.println(b);

		int c = 129;
		byte d = (byte) c;
		System.out.println(d);
		
		double e = 1.99999;
		int f = (int) e; // conversao explícita (CAST)
		System.out.println(f);
	}
}
