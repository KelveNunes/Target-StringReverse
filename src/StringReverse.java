
public class StringReverse {
	public static void main(String[] args) {
		String nome = "Kelve Nunes Bernardo";
		
		int caracteres = nome.length();
		String stringReverse = "";
		
		for(int i =(caracteres-1); i>=0; i--) {
			stringReverse+= nome.charAt(i);
		}
		System.out.println(stringReverse);
		
	}
}
