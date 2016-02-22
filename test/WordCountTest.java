import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertFalse;
import org.junit.Test;

public class WordCountTest {
	
	String empty = "";
	String singleWord ="single";
	String multipleWords = "a quick brown fox jump over the lazy dog";
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
//====================================================================
	
	@Test
		public void line_count_should_return_zero_for_empty_string(){
			WordCount str = new WordCount(empty);
			assertEquals(0,str.getLineCount());
		}


}