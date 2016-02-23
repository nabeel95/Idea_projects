import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertFalse;
import org.junit.Test;

public class WordCountTest {

	String empty = "";
	String singleWord ="single";
	String multipleWords = "a quick brown fox jump over the lazy dog";
	String multipleWords2 = "a quick   brown   fox jump over the lazy dog";
	String multipleLines = "a quick brown fow\njump over \n the lazy \n dog";
	String specialChars = "◊ÅŒÆÚ”’””Æ¿¿—±·‚‡°ﬁﬂ‹›€‹‹€⁄‹€›››";
//====================================================================

	@Test
	public void character_count_should_return_zero_for_empty_string(){
		WordCount str = new WordCount(empty);
		assertEquals(0,str.getCharCount());
	}

	@Test
	public void character_count_should_return_count_for_single_word_string(){
		WordCount str = new WordCount(singleWord);
		assertEquals(6,str.getCharCount());
	}

	@Test
	public void character_count_should_return_count_for_multiple_word_string(){
		WordCount str = new WordCount(multipleWords);
		assertEquals(40,str.getCharCount());
	}

	@Test
	public void character_count_should_return_count_for_special_char_string(){
		WordCount str = new WordCount(specialChars);
		assertEquals(32,str.getCharCount());
	}
//====================================================================

	@Test
	public void word_count_should_return_zero_for_empty_string(){
		WordCount str = new WordCount(empty);
		assertEquals(0,str.getWordCount());
	}

	@Test
	public void word_count_should_return_count_for_single_word_string(){
		WordCount str = new WordCount(singleWord);
		assertEquals(1,str.getWordCount());
	}

	@Test
	public void word_count_should_return_count_for_multiple_word_string(){
		WordCount str = new WordCount(multipleWords);
		assertEquals(9,str.getWordCount());
	}

	@Test
	public void word_count_should_return_count_for_spaced_multiple_word_string(){
		WordCount str = new WordCount(multipleWords2);
		assertEquals(9,str.getWordCount());
	}
//====================================================================

	@Test
	public void line_count_should_return_one_for_empty_string(){
		WordCount str = new WordCount(empty);
		assertEquals(1,str.getLineCount());
	}

	@Test
	public void line_count_should_return_count_of_line_for_multiple_lines_string(){
		WordCount str = new WordCount(multipleLines);
		assertEquals(4,str.getLineCount());
	}

//====================================================================

@Test
public void byte_count_should_return_zero_for_empty_string() throws Exception{
	WordCount str = new WordCount(empty);
	assertEquals(0,str.getByteCount());
}

@Test
public void byte_count_should_return_count_for_multiple_words_string() throws Exception{
	WordCount str = new WordCount(multipleWords);
	assertEquals(40,str.getByteCount());
}

@Test
public void byte_count_should_return_count_for_special_char_string() throws Exception{
	WordCount str = new WordCount(specialChars);
	assertEquals(86,str.getByteCount());
}

}
