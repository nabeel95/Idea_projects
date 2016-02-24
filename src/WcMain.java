import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;
import java.io.File;
import java.util.ArrayList;
class WcMain  {

	public static String getDataFromFile(String fileName) throws Exception{
		FileReader file = new FileReader(fileName);
		BufferedReader reader = new BufferedReader(file);
		String text = "";
		String line = reader.readLine();
		while (line!=null) {
				text+=line+"\n";
				line=reader.readLine();
		}
		return text;
	}

	public static void printWithoutCommands(ArrayList<String> files) throws Exception{
		int totalChar=0,totalWord=0,totalLine=0,totalByte=0;
		for (int j =0;j<files.size() ;j++ ) {
			String text=getDataFromFile(files.get(j));
			WordCount str = new WordCount(text);
			if(files.get(j)!=null){
				totalChar+=str.getCharCount();
				totalWord+=str.getWordCount();
				totalLine+=str.getLineCount();
				totalByte+=str.getByteCount();
				System.out.println("\t"+str.getLineCount()+"\t"+str.getWordCount()+"\t"+str.getCharCount()+"\t"+files.get(j));
			}
		}
		if(files.size()>1)
			System.out.println("\t"+totalLine+"\t"+totalWord+"\t"+totalChar+"\t"+"total");
	}

	public static String resultAccordingCommands(ArrayList<String> files,ArrayList<String> commands,String result) throws Exception{
		int totalChar=0,totalWord=0,totalLine=0,totalByte=0;
		int charCountedTimes=0,wordCountedTimes=0,lineCountedTimes=0,byteCountedTimes=0;
		for (int j =0;j<files.size() ;j++ ) {
			String text=getDataFromFile(files.get(j));
			WordCount str = new WordCount(text);
			for (int i=0;i<commands.size() ;i++ ) {
				if(commands.get(i).charAt(0) == "-".charAt(0)) {
					for(int k=1;k<commands.get(i).length();k++){
						if(commands.get(i).charAt(k)=="l".charAt(0)){
							result +="\t"+ str.getLineCount();
						}else if(commands.get(i).charAt(k)=="w".charAt(0)){
								result +="\t"+str.getWordCount();
						}else if(commands.get(i).charAt(k)=="m".charAt(0)){
								result +="\t"+str.getCharCount();
						}else if(commands.get(i).charAt(k)=="c".charAt(0)){
								result +="\t"+str.getByteCount();
						}else{
							result+="\n"+"\t"+"Wrong Command";
						}
					}
				}
			}
			result+="\t"+files.get(j)+"\n";
		}
		return result;
	}

	public static void main(String[] args) throws Exception {
		ArrayList<String> files = new ArrayList<String>();
		ArrayList<String> commands = new ArrayList<String>();
		String result="";
		for(int i=0;i<args.length;i++){
			File f = new File(args[i]);
			if(f.exists()){
				files.add(args[i]);
			}else{
				commands.add(args[i]);
			}
		}
		if(commands.size()==0){
			printWithoutCommands(files);
		}else {
			String res = resultAccordingCommands(files,commands,result);
			System.out.println(res);
		}	
	}
}
