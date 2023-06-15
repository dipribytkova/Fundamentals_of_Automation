package org.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CashbackHackServiceTest {
   @Test
   public void shouldCountBoundary(){
       CashbackHackService cashback = new CashbackHackService();
       int amount = 1000;

       int actual = cashback.remain(amount);
       int expected = 1000;

       assertEquals(expected, actual);
   }
}
