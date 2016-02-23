import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;

class WcMain  {
	public static String data(String fileName) throws Exception{
		FileReader file = new FileReader(fileName);
		BufferedReader reader = new BufferedReader(file);
		String text = "";
		String line = reader.readLine();
		int lines=0;
		while (line!=null) {
			text+=line+"\n";
			line=reader.readLine();
			lines++;
		}
		return text;
	}

	public static void main(String[] args) throws Exception {
			String fileName="";
			if(args[0].charAt(0) != "-".charAt(0)){
				fileName+=args[0];
			}else {
				fileName+=args[1];
			}
			String text = data(fileName);
			WordCount str = new WordCount(text);
			if(args[0].length()==2 && args[0].charAt(0) == "-".charAt(0) && args[0].charAt(1) == "l".charAt(0)){
				System.out.println("Lines = "+str.getLineCount());
			}
			else if(args[0].length()==2 && args[0].charAt(0) == "-".charAt(0) && args[0].charAt(1) == "w".charAt(0)){
				System.out.println("Words = "+str.getWordCount());
			}
			else if(args[0].length()==2 && args[0].charAt(0) == "-".charAt(0) && args[0].charAt(1) == "c".charAt(0)){
				System.out.println("Characters = "+str.getCharCount());
			}else{
				System.out.println("Characters = "+str.getCharCount());
				System.out.println("Words = "+str.getWordCount());
				System.out.println("Lines = "+str.getLineCount());
				System.out.println("Bytes = "+str.getByteCount());

			}
	}
}
