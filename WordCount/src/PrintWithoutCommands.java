import java.util.ArrayList;
class PrintWithoutCommands {
	private ArrayList<String> files;
	public PrintWithoutCommands(ArrayList<String> files){
		this.files=files;
	}
	public void printResult() throws Exception{
		int totalChar=0,totalWord=0,totalLine=0,totalByte=0;
		for (int j =0;j<this.files.size() ;j++ ) {
			DataReader file = new DataReader(this.files.get(j));
			String text = file.getData();
			WordCount str = new WordCount(text);
			if(this.files.get(j)!=null){
				totalChar+=str.getCharCount();
				totalWord+=str.getWordCount();
				totalLine+=str.getLineCount();
				totalByte+=str.getByteCount();
				System.out.println("\t"+str.getLineCount()+"\t"+str.getWordCount()+"\t"+str.getCharCount()+"\t"+this.files.get(j));
			}
		}
		if(this.files.size()>1)
			System.out.println("\t"+totalLine+"\t"+totalWord+"\t"+totalChar+"\t"+"total");
	}
}

