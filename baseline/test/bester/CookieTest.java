package bester;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class CookieTest {
    @Test
    public void shouldReturnTrueIfOtherCookieHasMoreChips() {
        Cookie cookie = new Cookie(20);
        Cookie otherCookie = new Cookie(30);

        assertThat(otherCookie.isBetter(cookie), is(true));
    }



}