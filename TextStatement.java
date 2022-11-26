import java.util.Enumeration;

public class TextStatement extends Statement {
  protected String toStrHeader(String name) {
    return ("Rental Record for " + name + "\n");
  }

  protected String toStrRental(Rental aRental) {
    return ("\t" + aRental.getMovie().getTitle() + "\t" + String.valueOf(aRental.getCharge()) + "\n");
  }

  protected String toStrTotalCharge(double totalCharge) {
    return ("Amount owed is " + String.valueOf(totalCharge) + "\n");
  }

  protected String toStrTotalFrequentRenterPoints(int totalFrequentRenterPoints) {
    return ("You earned " + String.valueOf(totalFrequentRenterPoints) + " frequent renter points");
  }
}