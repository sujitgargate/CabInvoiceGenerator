import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CabFareTest {

   CabFareInvoice cabFareInvoice;
   Journey[] muiltipleRides = null;

   @Before
   public void setUp() throws Exception {
      cabFareInvoice = new CabFareInvoice();
      muiltipleRides = new Journey[]{new Journey(2, 5),
              new Journey(0.1, 1)
      };
   }

   //Tests Generated Fare And Expected Fare
   @Test
   public void givenDistanceAndTimeForJourney_ShouldReturnTotalFare() {
      double totalFareForJourney = cabFareInvoice.getTotalFareForJourney(2.0, 5);
      Assert.assertEquals(25, totalFareForJourney, 0.1);
   }

   //Negative Tests For Generated Fare And Expected Fare
   @Test
   public void givenDistanceAndTimeForJourney_ShouldPassTestForNegativeTest() {
      double totalFareForJourney = cabFareInvoice.getTotalFareForJourney(2.0, 5);
      Assert.assertNotEquals(85, totalFareForJourney);
   }

   //Test For Minimum Fare
   @Test
   public void givenDistanceAndTimeForJourney_ShouldReturnMinimumFare() {
      double totalFareForJourney = cabFareInvoice.getTotalFareForJourney(0.2, 0);
      Assert.assertEquals(5, totalFareForJourney, 0.1);
   }

   //Tests For Muiltiple Rides
   @Test
   public void givenDistanceAndTimeForMuiltipleJourney_ShouldReturnTotalFare() {
      double totalFareForMuiltipleJourney = cabFareInvoice.getTotalFareForMuiltipleJourney(muiltipleRides);
      Assert.assertEquals(5, totalFareForMuiltipleJourney, 0.0);
   }

   //Negative Test For Muiltiple Rides
   @Test
   public void givenDistanceAndTimeForMuiltipleJourney_ShouldPassTestForNegativeTest() {
      double totalFareForMuiltipleJourney = cabFareInvoice.getTotalFareForMuiltipleJourney(muiltipleRides);
      Assert.assertNotEquals(160, totalFareForMuiltipleJourney, 0.0);
   }

   //Tests For Muiltiple Rides with Invoice Summary
   @Test
   public void givenDistanceAndTimeForMuiltipleJourney_ShouldReturnInvoiceSummary() {
      InvoiceSummary invoiceSummary = cabFareInvoice.getTotalFareForMuiltipleJourneySummary(muiltipleRides);
      InvoiceSummary expectedInvoiceSummary = new InvoiceSummary(2, 30);
      Assert.assertEquals(expectedInvoiceSummary, invoiceSummary);
   }

   //Tests For Muiltiple Rides with Invoice Summary
   @Test
   public void givenDistanceAndTimeForMuiltipleJourney_ForInvoiceSummary_ShouldPassNegativeTest() {
      InvoiceSummary invoiceSummary = cabFareInvoice.getTotalFareForMuiltipleJourneySummary(muiltipleRides);
      InvoiceSummary expectedInvoiceSummary = new InvoiceSummary(2, 101);
      Assert.assertNotEquals(expectedInvoiceSummary, invoiceSummary);
   }
}


