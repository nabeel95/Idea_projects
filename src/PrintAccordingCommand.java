import java.util.ArrayList;
class PrintAccordingCommand {
	private ArrayList<String> files;
	private ArrayList<String> commands;
	
	public PrintAccordingCommand(ArrayList<String> files,ArrayList<String> commands){
		this.files=files;
		this.commands=commands;
	}
	
	public void printResult() throws Exception{
		String result="";
		int totalChar=0,totalWord=0,totalLine=0,totalByte=0;
		for (int j =0;j<this.files.size() ;j++ ) {
			int totalCharCount=0,totalWordCount=0,totalLineCount=0,totalByteCount=0;
			DataReader file = new DataReader(this.files.get(j));
			String text = file.getData();
			WordCount str = new WordCount(text);
			for (int i=0;i<this.commands.size() ;i++ ) {
				if(this.commands.get(i).charAt(0) == "-".charAt(0)) {
					for(int k=1;k<this.commands.get(i).length();k++){
						if(this.commands.get(i).charAt(k)=="l".charAt(0) && totalLineCount<1){
							totalLineCount+=1;
							result +="\t"+ str.getLineCount();
						}else if(this.commands.get(i).charAt(k)=="w".charAt(0) && totalWordCount<1){
								totalWordCount+=1;
								result +="\t"+str.getWordCount();
						}else if(this.commands.get(i).charAt(k)=="m".charAt(0) && totalCharCount<1){
								totalCharCount+=1;
								result +="\t"+str.getCharCount();
						}else if(this.commands.get(i).charAt(k)=="c".charAt(0) && totalByteCount<1){
								totalByteCount+=1;
								result +="\t"+str.getByteCount();
						}else{
							result+="\n"+"\t"+"Wrong Command";
						}
					}
				}
			}
			result+="\t"+this.files.get(j)+"\n";
		}
		System.out.println(result);
	}
}