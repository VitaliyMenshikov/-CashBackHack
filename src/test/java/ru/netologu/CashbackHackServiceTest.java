package ru.netologu;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void remain() {
        CashbackHackService service = new CashbackHackService();
        int amount = 120;
        int actual = service.remain(amount);
        int expected = 880;
        assertEquals(actual, expected);
    }

    @Test
    public void remain1() {
        CashbackHackService service = new CashbackHackService();
        int amount = 900;
        int actual = service.remain(amount);
        int expected = 100;
        assertEquals(actual, expected);
    }

    @Test
    public void remain2() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;
        assertEquals(actual, expected);
    }

    @Test
    public void remain3() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1100;
        int actual = service.remain(amount);
        int expected = 0;
        assertEquals(actual, expected);
    }

    @Test
    public void remain4() {
        CashbackHackService service = new CashbackHackService();
        int amount = 4263;
        int actual = service.remain(amount);
        int expected = 0;
        assertEquals(actual, expected);
    }
}