import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.Paths;


public class Write {
	private static final OpenOption APPEND = null;
	private static final OpenOption CREATE = null;
	protected char cuvant;
	Write(char _cuvant)
	{
		this.cuvant = _cuvant;
	}

	public void setCuvant(char _cuvant)
	{
		this.cuvant = _cuvant;
	}
	
	public void writeOutput()
	{
		Path p = Paths.get("C:\\Users\\rober\\eclipse-workspace\\Criptare\\src\\encoded.bin");
		try(OutputStream out = new BufferedOutputStream(Files.newOutputStream(p, CREATE,APPEND)))
		{
			out.write(this.cuvant);
		}
		catch (IOException x)
		{
			System.err.println(x);
		}
	}
}
