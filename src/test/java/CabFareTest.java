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
      Journey[] muiltipleRides = {new Journey(2.0, 5),
              new Journey(5.0, 10)
      };
      double totalFareForMuiltipleJourney = cabFareInvoice.getTotalFareForMuiltipleJourney(muiltipleRides);
      Assert.assertEquals(60, totalFareForMuiltipleJourney, 0.0);
   }

   //Negative Test For Muiltiple Rides
   @Test
   public void givenDistanceAndTimeForMuiltipleJourney_ShouldPassTestForNegativeTest() {
      Journey[] muiltipleRides = {new Journey(2.0, 5),
              new Journey(5.0, 10)
      };
      double totalFareForMuiltipleJourney = cabFareInvoice.getTotalFareForMuiltipleJourney(muiltipleRides);
      Assert.assertNotEquals(160, totalFareForMuiltipleJourney, 0.0);
   }
}


