import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main 
{

    public static void main(String[] args) throws IOException
    {

        Codificare cuvant;
        cuvant = new Codificare(' ');
        
        StringBuilder sb = new StringBuilder();

        try (BufferedReader br = Files.newBufferedReader(Paths.get("C:\\Users\\rober\\eclipse-workspace\\Criptare\\src\\input.txt"))) {

            String line;
            while ((line = br.readLine()) != null) {
                sb.append(line).append("\n");
                String caractere = (String)line;
            	cuvant.setCuvant(caractere);
            	cuvant.encode();
            	cuvant.writeOutput();
            }

        }    
        
    }

}



