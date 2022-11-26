import java.util.Enumeration;

public class HtmlStatement extends Statement {
  protected String toStrHeader(String name) {
    return ("<H1>Rentals for <EM>" + name + "</EM></H1><P>\n");
  }

  protected String toStrRental(Rental aRental) {
    return (aRental.getMovie().getTitle() + ": " + String.valueOf(aRental.getCharge()) + "<BR>\n");
  }

  protected String toStrTotalCharge(double totalCharge) {
    return ("<P>You owe <EM>" + String.valueOf(totalCharge) + "</EM><P>\n");
  }

  protected String toStrTotalFrequentRenterPoints(int totalFrequentRenterPoints) {
    return ("On this rental you earned <EM>" + String.valueOf(totalFrequentRenterPoints)
        + "</EM> frequent renter points<P>");
  }
}