import org.junit.Assert;
import org.junit.Test;


public class linkedListTest {
    @Test
    public void add_Function_should_return_length_of_list() throws Exception {
        LinkList<String> linkList = new LinkList<>();
        System.out.printf(String.valueOf("".getClass()));
        Assert.assertEquals(1,linkList.add("Ram"));
        Assert.assertEquals(2,linkList.add("Nabeel"));
    }

    @Test
    public void get_function_should_return_value() throws Exception {
        LinkList<java.io.Serializable> linkList = new LinkList<>();
        linkList.add("a");
        linkList.add(2);
        Assert.assertEquals("a",linkList.getValueAt(0));
        Assert.assertEquals(2,linkList.getValueAt(1));
    }

    @Test
    public void get_full_list_should_represent_full_list_in_string_form() throws Exception {
        LinkList<String> linkList = new LinkList<>();
        linkList.add("a");
        linkList.add("b");
        linkList.add("c");
        Assert.assertEquals("a\tb\tc\t",linkList.getFullList());
    }

    @Test
    public void size_should_return_size_of_list() throws Exception {
        LinkList<String> linkList = new LinkList<>();
        linkList.add("a");
        linkList.add("b");
        linkList.add("c");
        Assert.assertEquals(3,linkList.size());
    }

    @Test
    public void indexOf_should_return_index_of_element() throws Exception {
        LinkList<String> linkList = new LinkList<>();
        linkList.add("a");
        linkList.add("b");
        linkList.add("c");
        Assert.assertEquals(0,linkList.indexOf("a"));
        Assert.assertEquals(-1,linkList.indexOf("q"));
    }

    @Test
    public void contains_should_return_availability_of_element_in_list() throws Exception {
        LinkList<String> linkList = new LinkList<>();
        linkList.add("a");
        linkList.add("b");
        linkList.add("c");
        Assert.assertEquals(true,linkList.contains("a"));
        Assert.assertEquals(false,linkList.contains("q"));
    }

    @Test
    public void remove_should_remove_the_element_from_list() throws Exception {
        LinkList<String> linkList = new LinkList<>();
        linkList.add("a");
        linkList.add("b");
        linkList.add("c");
        Assert.assertEquals(2,linkList.remove("b"));
        Assert.assertEquals(false,linkList.contains("b"));
        Assert.assertEquals(1,linkList.remove("a"));
        Assert.assertEquals(false,linkList.contains("a"));
    }

    @Test
    public void listIterator_should_able_to_iterate_the_list() throws Exception {
        LinkList<String> linkList = new LinkList<>();
        linkList.add("a");
        linkList.add("b");
        linkList.add("c");
        MyItr itr = linkList.listIterator(0);
        Assert.assertEquals(true,itr.hasNext());
        itr.next();
        Assert.assertEquals(true,itr.hasNext());
        Assert.assertEquals("b", itr.currentValue());
        itr.next();
        Assert.assertEquals(false,itr.hasNext());
    }
}
