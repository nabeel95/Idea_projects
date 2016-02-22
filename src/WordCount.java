public class WordCount{
	private String str;
	public WordCount(String str){
		this.str=str;
	}
	public int getCharCount(){
		return this.str.length();
	}
	public int getWordCount(){
		String trimmed = this.str.trim();
		int words = trimmed.isEmpty() ? 0 : trimmed.split("\\s+").length;
		return words;
	}
	public int getLineCount(){
		return 0;
	}
}