import static org.junit.Assert.assertEquals; 
import org.junit.Test; 

public class RecursiveTest {

    // count8 method tests
    @Test
    public void test1() {
        assertEquals(Main.count8(8), 1);
    }

    @Test
    public void test2() {
        assertEquals(Main.count8(1), 0);
    }

    @Test
    public void test3() {
        assertEquals(Main.count8(88), 3);
    }

    @Test
    public void test4() {
        assertEquals(Main.count8(818), 2);
    }

    @Test
    public void test5() {
        assertEquals(Main.count8(8818), 4);
    }

    
    // countHi method tests
    @Test
    public void test6() {
        assertEquals(Main.countHi("xxhixx"), 1);
    }

    @Test
    public void test7() {
        assertEquals(Main.countHi("xhixhix"), 2);
    }

    @Test
    public void test8() {
        assertEquals(Main.countHi("hi"), 1);
    }

    @Test
    public void test9() {
        assertEquals(Main.countHi("xixxhh"), 0);
    }

    @Test
    public void test10() {
        assertEquals(Main.countHi("xhiihiihix"), 3);
    }

    /*
    // countHi 2 method tests 
    @Test
    public void test11() {
        assertEquals(Main.countHi2(8818), 4);
    }

    @Test
    public void test12() {
        assertEquals(Main.countHi2(8818), 4);
    }

    @Test
    public void test13() {
        assertEquals(Main.countHi2(8818), 4);
    }

    @Test
    public void test14() {
        assertEquals(Main.countHi2(8818), 4);
    }

    @Test
    public void test15() {
        assertEquals(Main.countHi2(8818), 4);
    }

    // strCount method tests
    
    @Test
    public void test16() {
        assertEquals(Main.strCount(8818), 4);
    }

    @Test
    public void test17() {
        assertEquals(Main.strCount(8818), 4);
    }

    @Test
    public void test18() {
        assertEquals(Main.strCount(8818), 4);
    }

    @Test
    public void test19() {
        assertEquals(Main.strCount(8818), 4);
    }

    @Test
    public void test20() {
        assertEquals(Main.strCount(8818), 4);
    }

    // stringClean method tests

    @Test
    public void test21() {
        assertEquals(Main.stringClean(8818), 4);
    }

    @Test
    public void test22() {
        assertEquals(Main.stringClean(8818), 4);
    }

    @Test
    public void test23() {
        assertEquals(Main.stringClean(8818), 4);
    }

    @Test
    public void test24() {
        assertEquals(Main.stringClean(8818), 4);
    }

    @Test
    public void test25() {
        assertEquals(Main.stringClean(8818), 4);
    }
    */

}
