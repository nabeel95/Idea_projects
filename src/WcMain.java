import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;

class WcMain  {
	public static void main(String[] args) throws Exception {
			String minus = "-";
			String fileName="";
			if(args[0].charAt(0) != "-".charAt(0)){
				fileName+=args[0];
				
				System.out.println("args = "+args[1].charAt(0));
				FileReader file = new FileReader(fileName);
				BufferedReader reader = new BufferedReader(file);
				String text = "";
				String line = reader.readLine();
				int lines=0;
				while (line!=null) {
					text+=line;
					line=reader.readLine();
					lines++;
				}

				WordCount str = new WordCount(text);
				System.out.println("Characters = "+str.getCharCount());
				System.out.println("Words = "+str.getWordCount());
				System.out.println("Lines = "+lines);
			}else{
				System.out.println("wrong");
			}
	}
}