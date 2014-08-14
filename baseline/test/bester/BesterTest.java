package bester;

import org.hamcrest.CoreMatchers;
import org.junit.Test;
import org.w3c.dom.css.Rect;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class BesterTest {
    @Test
    public void shouldReturnSoleRectangleInCollection() throws Exception {
        List<Rectangle> rectangles = new ArrayList<Rectangle>();
        Rectangle rectangle = new Rectangle(2, 2);
        rectangles.add(rectangle);

        Bester bester = new Bester<Rectangle>(rectangles);
        assertThat(bester.getBest(), CoreMatchers.<Betterable>is(rectangle));
    }

    @Test
    public void shouldReturnBigRectangleWhenItIsTheBestRectangle() throws Exception {
        Rectangle bigRectangle = new Rectangle(4,5);
        Rectangle smallRectangle = new Rectangle(1,2);

        List<Rectangle> rectangles = new ArrayList<Rectangle>();
        rectangles.add(smallRectangle);
        rectangles.add(bigRectangle);

        Bester bester = new Bester<Rectangle>(rectangles);

        assertThat(bester.getBest(), CoreMatchers.<Betterable>is(bigRectangle));
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowIllegalArgumentExceptionWhenGivenEmptyList() throws Exception {
        Bester bester = new Bester(new ArrayList<Betterable>());

        bester.getBest();
    }

    @Test(expected = NullPointerException.class)
    public void shouldThrowExceptionGivenNullInConstructor() throws Exception {
        (new Bester(null)).getBest();
    }

    @Test
    public void shouldReturnSoleCookie(){
        List<Cookie> cookies = new ArrayList<Cookie>();
        cookies.add(new Cookie(34));

        Bester bester = new Bester<Cookie>(cookies);

        assertThat(bester.getBest(), CoreMatchers.<Betterable>is(cookies.get(0)));
    }

    @Test
    public void shouldReturnBetterCookieWhenBetterCookieIsBetter(){
        Cookie cookie = new Cookie(10);
        Cookie betterCookie = new Cookie(20);

        List<Cookie> betterables = new ArrayList<Cookie>();

        betterables.add(cookie);
        betterables.add(betterCookie);

        Bester bester = new Bester<Cookie>(betterables);

        assertThat(bester.getBest(), CoreMatchers.<Betterable>is(betterCookie));
    }
}