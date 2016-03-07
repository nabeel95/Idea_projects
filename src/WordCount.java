
public class WordCount {
    private String str;

    public WordCount(String str) {
        this.str = str;
    }

    public int getCharCount() {
        return this.str.length();
    }

    public int getByteCount() throws Exception {
        return this.str.getBytes("UTF-8").length;
    }

    public int getWordCount() {
        String trimmed = this.str.trim();
        return trimmed.isEmpty() ? 0 : trimmed.split("\\s+").length;
    }

    public int getLineCount() {
        String[] string = this.str.split("\n");
        return string.length - 1;
    }

}
