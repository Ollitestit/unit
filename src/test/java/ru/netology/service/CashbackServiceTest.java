package ru.netology.service;

public class CashbackServiceTest {
    @org.junit.Test
    public void shouldAddIfAmountBelowBoundary() {
        CashbackHackService service = new CashbackHackService();
        org.junit.Assert.assertEquals(100, service.remain(900));
    }

    @org.junit.Test
    public void shouldAddIfAmountAboveBoundary() {
        CashbackHackService service = new CashbackHackService();
        org.junit.Assert.assertEquals(900, service.remain(1100));
    }

    @org.junit.Test
    public void shouldReturn0IfAmountEqualBoundary() {
        CashbackHackService service = new CashbackHackService();
        org.junit.Assert.assertEquals(0, service.remain(1000));
    }

    @org.junit.jupiter.api.Test
    public void shouldAddIfAmountBelowBoundaryJunit5() {
        CashbackHackService service = new CashbackHackService();
        org.junit.jupiter.api.Assertions.assertEquals(100, service.remain(900));
    }

    @org.junit.jupiter.api.Test
    public void shouldAddIfAmountAboveBoundaryJunit5() {
        CashbackHackService service = new CashbackHackService();
        org.junit.jupiter.api.Assertions.assertEquals(900, service.remain(1100));
    }

    @org.junit.jupiter.api.Test
    public void shouldReturn0IfAmountEqualBoundaryJunit5() {
        CashbackHackService service = new CashbackHackService();
        org.junit.jupiter.api.Assertions.assertEquals(0, service.remain(1000));
    }

}
