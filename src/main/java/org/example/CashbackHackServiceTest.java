package org.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CashbackHackServiceTest {
   @Test
   public void whenTheAmountEqualBoundary(){
       CashbackHackService cashback = new CashbackHackService();
       int amount = 1000;

       int actual = cashback.remain(amount);
       int expected = 1000;

       assertEquals(expected, actual);
   }
    @Test
    public void whenTheAmountLessBoundary(){
        CashbackHackService cashback = new CashbackHackService();
        int amount = 585;

        int actual = cashback.remain(amount);
        int expected = 415;

        assertEquals(expected, actual);
    }
}
