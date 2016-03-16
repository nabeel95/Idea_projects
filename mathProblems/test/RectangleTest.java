import junit.framework.Assert;
import org.junit.Test;


import static junit.framework.TestCase.assertEquals;

public class RectangleTest {
    @Test
    public void testGetAreaShouldReturnAreaOfRectangle() throws Exception {
        Rectangle rectangle = new Rectangle(5, 10);
        assertEquals(50.0,rectangle.getArea());
    }

    @Test
    public void testGetPerimeterShouldReturnPerimeterOfRectangle() throws Exception {
        Rectangle rectangle = new Rectangle(5, 10);
        assertEquals(30.0,rectangle.getPerimeter());
    }

    @Test
    public void testGetAreaShouldReturnAreaForDecimalValuesOfHeightAndWidth() {
        Rectangle rectangle = new Rectangle(2.3,4.5);
        assertEquals(10.35,rectangle.getArea());
    }

    @Test
    public void testGetPerimeterShouldReturnPerimeterOfRectangleIfTheValuesareInFloat() throws Exception {
        Rectangle rectangle = new Rectangle(5.5, 10.5);
        assertEquals(32.0,rectangle.getPerimeter());
    }


}
