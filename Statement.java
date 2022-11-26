import java.util.Enumeration;

public abstract class Statement {
  protected abstract String toStrHeader(String name);

  protected abstract String toStrRental(Rental aRental);

  protected abstract String toStrTotalCharge(double totalCharge);

  protected abstract String toStrTotalFrequentRenterPoints(int totalFrequentRenterPoints);

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