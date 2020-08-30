public class InvoiceSummary {

   private final int noOfJournies;
   private final double totalFare;
   private final double averageFare;

   public InvoiceSummary(int noOfJournies, double totalFare) {
      this.noOfJournies = noOfJournies;
      this.totalFare = totalFare;
      this.averageFare = totalFare / noOfJournies;
   }

   /**
    *
    * @param obj contains journies, totalFare
    * @return object contains compared journies, totalFare, averageFare
    */

   //Overrides Current Equals() to compare muiltiple params
   @Override
   public boolean equals(Object obj) {
      if (this == obj)
         return true;
      if (obj == null || getClass() != obj.getClass())
         return false;
      InvoiceSummary that = (InvoiceSummary) obj;
      return noOfJournies == that.noOfJournies &&
              Double.compare(that.totalFare, totalFare) == 0 &&
              Double.compare(that.averageFare, averageFare) == 0;
   }
}