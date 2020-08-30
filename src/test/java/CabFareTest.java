import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CabFareTest {

   CabFareInvoice cabFareInvoice;

   int COST_PER_KM = 10;
   int FARE_PER_MIN = 1;

   @Before
   public void setUp() throws Exception {
      cabFareInvoice = new CabFareInvoice();
   }

   //Tests Generated Fare And Expected Fare
   @Test
   public void givenDistanceAndTimeForJourney_ShouldReturnTotalFare() {
      double totalFareForJourney = cabFareInvoice.getTotalFareForJourney(2.0, COST_PER_KM, 5, FARE_PER_MIN);
      Assert.assertEquals(25, totalFareForJourney, 0.1);
   }

   //Negative Tests For Generated Fare And Expected Fare
   @Test
   public void givenDistanceAndTimeForJourney_ShouldPassTestForNegativeTest() {
      double totalFareForJourney = cabFareInvoice.getTotalFareForJourney(2.0, COST_PER_KM, 5, FARE_PER_MIN);
      Assert.assertNotEquals(85, totalFareForJourney);
   }

   //Test For Minimum Fare
   @Test
   public void givenDistanceAndTimeForJourney_ShouldReturnMinimumFare() {
      double totalFareForJourney = cabFareInvoice.getTotalFareForJourney(0.2, COST_PER_KM, 0, FARE_PER_MIN);
      Assert.assertEquals(5, totalFareForJourney, 0.1);
   }
   @Test
   public void givenDistanceAndTimeForMuiltipleJourney_ShouldReturnTotalFare() {
      Journey[] muiltipleRides = {new Journey(2.0, COST_PER_KM, 5, FARE_PER_MIN),
              new Journey(5.0, COST_PER_KM, 10, FARE_PER_MIN)
      };
      double totalFareForMuiltipleJourney = cabFareInvoice.getTotalFareForMuiltipleJourney(muiltipleRides);
      Assert.assertEquals(60, totalFareForMuiltipleJourney, 0.0);
   }
}


