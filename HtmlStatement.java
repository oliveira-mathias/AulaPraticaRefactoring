import java.util.Enumeration;

public class HtmlStatement extends Statement {
  private String toStrHeader(String name) {
    return ("<H1>Rentals for <EM>" + name + "</EM></H1><P>\n");
  }

  private String toStrRental(Rental aRental) {
    return (aRental.getMovie().getTitle() + ": " + String.valueOf(aRental.getCharge()) + "<BR>\n");
  }

  private String toStrTotalCharge(double totalCharge) {
    return ("<P>You owe <EM>" + String.valueOf(totalCharge) + "</EM><P>\n");
  }

  private String toStrTotalFrequentRenterPoints(int totalFrequentRenterPoints) {
    return ("On this rental you earned <EM>" + String.valueOf(totalFrequentRenterPoints)
        + "</EM> frequent renter points<P>");
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