
import java.util.Random;

public class Codificare extends Write{
	Codificare(char _cuvant)
	{
		super(_cuvant);
	}
	public void encode()
	{
		Random rand = new Random();
		int n1 = rand.nextInt(100);
		int n2 = 255 + n1;
		this.cuvant = (char)(n1+(cuvant+n1)%(n2-n1));
		this.cuvant = (char)(this.cuvant+1);
	}
	public void setCuvant(String caractere) {
		// TODO Auto-generated method stub
		
	}
}
