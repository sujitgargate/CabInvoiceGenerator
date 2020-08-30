import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CabFareTest {

   CabFareInvoice cabFareInvoice;

   @Before
   public void setUp() throws Exception {
      cabFareInvoice = new CabFareInvoice();
   }

   //Tests Generated Fare And Expected Fare
   @Test
   public void givenDistanceAndTimeForJourney_ShouldReturnTotalFare() {
      double totalFareForJourney = cabFareInvoice.getTotalFareForJourney(2.0, 10, 5, 1);
      Assert.assertEquals(25, totalFareForJourney, 0.1);
   }

   //Negative Tests For Generated Fare And Expected Fare
   @Test
   public void givenDistanceAndTimeForJourney_ShouldReturnFalseForNegativeTest() {
      double totalFareForJourney = cabFareInvoice.getTotalFareForJourney(2.0, 10, 5, 1);
      Assert.assertNotEquals(85, totalFareForJourney);
   }

   @Test
   public void givenDistanceAndTimeForJourney_ShouldReturnMinimumFare() {
      double totalFareForJourney = cabFareInvoice.getTotalFareForJourney(0.2, 10, 0, 1);
      Assert.assertEquals(5, totalFareForJourney, 0.1);
   }
}


