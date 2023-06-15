package org.example;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CashbackHackServiceTest {
    @Test
    public void shouldCountBoundary(){
        CashbackHackService cashback = new CashbackHackService();
        int amount = 2300;

        int actual = cashback.remain(amount);
        int expected = 700;

        assertEquals(actual, expected);
}
}
