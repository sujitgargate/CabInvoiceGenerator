import org.junit.Assert;
import org.junit.Test;

public class CabFareTest {

   @Test
   public void givenDistanceAndTimeForJourney_ShouldReturnTotalFare() {
      CabFareInvoice cabFareInvoice = new CabFareInvoice();
      double totalFareForJourney = cabFareInvoice.getTotalFareForJourney(2.0, 10, 5, 1);
      Assert.assertEquals(25, totalFareForJourney, 0.0);
   }

   @Test
   public void givenDistanceAndTimeForJourney_ShouldReturnFalseForNegativeTest() {
      CabFareInvoice cabFareInvoice = new CabFareInvoice();
      double totalFareForJourney = cabFareInvoice.getTotalFareForJourney(2.0, 10, 5, 1);
      Assert.assertNotEquals(totalFareForJourney, 25);
   }
}


