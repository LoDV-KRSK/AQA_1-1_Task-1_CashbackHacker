package ru.netology.unit;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.Assert.assertEquals;

public class CashbackHackServiceTest {

    CashbackHackService service = new CashbackHackService();


    /* JUnit 4 */

    @Test
    public void shouldNotReturnAnything() {
        Assertions.assertEquals(0, service.remain(1000));
    }

    @Test
    public void shouldReturnOne() {
        Assertions.assertEquals(1, service.remain(999));
    }

    @Test
    public void shouldReturnFiveHundred() {
        Assertions.assertEquals(500, service.remain(500));
    }

    @Test
    public void shouldReturn999forSmallPurchase() {
        Assertions.assertEquals(999, service.remain(1));
    }

    @Test
    public void shouldReturn999forLargePurchase() {
        Assertions.assertEquals(999, service.remain(1));
    }

    @Test
    public void shouldReturn450() {
        Assertions.assertEquals(450, service.remain(1550));
    }

    /* JUnit 5 */

    @org.junit.jupiter.api.Test
    public void shouldNotReturnAnything_JU5() {
        Assertions.assertEquals(0, service.remain(1000));
    }

    @org.junit.jupiter.api.Test
    public void shouldReturnOne_JU5() {
        Assertions.assertEquals(1, service.remain(999));
    }

    @org.junit.jupiter.api.Test
    public void shouldReturnFiveHundred_JU5() {
        Assertions.assertEquals(500, service.remain(500));
    }

    @org.junit.jupiter.api.Test
    public void shouldReturn999forSmallPurchase_JU5() {
        Assertions.assertEquals(999, service.remain(1));
    }

    @org.junit.jupiter.api.Test
    public void shouldReturn999forLargePurchase_JU5() {
        Assertions.assertEquals(999, service.remain(1001));
    }

    @org.junit.jupiter.api.Test
    public void shouldReturn450_JU5() {
        Assertions.assertEquals(450, service.remain(1550));
    }
}