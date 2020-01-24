import org.testng.Assert;
import org.testng.annotations.Test;


public class testCalc {

        private Calc calc = new Calc();

        @Test
        public void testSum() throws Exception {
            Assert.assertEquals(5, calc.sum(2, 3));
        }
        @Test
        public void testFuck() throws Exception{
            Assert.assertEquals(true, calc.fuck(5));
        }
    }
