import java.util.Enumeration;

public class TextStatement extends Statement {
  private String toStrHeader(String name) {
    return ("Rental Record for " + name + "\n");
  }

  private String toStrRental(Rental aRental) {
    return ("\t" + aRental.getMovie().getTitle() + "\t" + String.valueOf(aRental.getCharge()) + "\n");
  }

  private String toStrTotalCharge(double totalCharge) {
    return ("Amount owed is " + String.valueOf(totalCharge) + "\n");
  }

  private String toStrTotalFrequentRenterPoints(int totalFrequentRenterPoints) {
    return ("You earned " + String.valueOf(totalFrequentRenterPoints) + " frequent renter points");
  }

  public String value(Customer aCustomer) {
    Enumeration rentals = aCustomer.getRentals();
    String result = toStrHeader(aCustomer.getName());

    while (rentals.hasMoreElements()) {
      Rental each = (Rental) rentals.nextElement();
      // show figures for this rental
      result += toStrRental(each);
    }
    // add footer lines
    result += toStrTotalCharge(aCustomer.getTotalCharge());
    result += toStrTotalFrequentRenterPoints(aCustomer.getTotalFrequentRenterPoints());
    return result;
  }
}