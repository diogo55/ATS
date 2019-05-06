
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ATS implements Runnable {

	private UMeR umer;

	public static void main(String[] args) throws InterruptedException {
		ATS ats = new ATS();
		ats.run();
	}

	public ATS() {
	  umer = new UMeR();
  }

	@Override
	public void run() {
		String filename = "log.txt";
		CharStream input;
		try {
			input = CharStreams.fromFileName(filename);
		} catch (IOException e1) {
			System.err.println("erro: log inválido");
			return;
		}

		ATSLexer lexer = new ATSLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		ATSParser parser = new ATSParser(tokens);
		parser.umer = umer;
		ParseTree tree = parser.log();
		//System.out.println("árvore: " + tree.toStringTree(parser));

    try { // guardar o estado do programa
      umer.saveUMeR("umerData-tests");
    } catch (FileNotFoundException e) {
      System.err.println("ERROR: could not save UMeR data (FileNotFoundException).");
    } catch (IOException e) {
      System.err.println("ERROR: could not save UMeR data (IOException).");
    }
	}

}
