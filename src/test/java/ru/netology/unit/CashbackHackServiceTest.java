package ru.netology.unit;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CashbackHackServiceTest {

    @Test
    public void shouldNotReturnAnything() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(1000);
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnOne() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(999);
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnFiveHundred() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(500);
        int expected = 500;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturn999forSmallPurchase() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(1);
        int expected = 999;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturn999forLargePurchase() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(1001);
        int expected = 999;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturn450() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(1550);
        int expected = 450;
        assertEquals(expected, actual);
    }
}
