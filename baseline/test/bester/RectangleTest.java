package bester;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import static junit.framework.Assert.assertEquals;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class RectangleTest {
    @Test
    public void areaShouldBeEqualToLengthyMultipliedByBreadth() throws Exception {
        assertEquals(6.0, new Rectangle(2, 3).area());
        assertEquals(0.0, new Rectangle(0, 1).area());
        assertEquals(3.75, new Rectangle(1.5, 2.5).area());
    }

    @Test
    public void shouldSayBiggerRectangleIsBetter(){
        assertThat(new Rectangle(4,5).isBetter(new Rectangle(1,2)), is(true));
    }

    @Test
    public void shouldSaySmallerRectangleIsNotBetter(){
        assertThat(new Rectangle(1,2).isBetter(new Rectangle(4,5)), is(false));
    }
}
