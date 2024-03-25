import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test6 {


  public static BigDecimal getDeliverooSubstitutionUnitPrice(BigDecimal price) {
    return price.divide(BigDecimal.valueOf(100), 2, RoundingMode.HALF_UP);
  }

  private static BigDecimal calculateVendorUnitPrice(BigDecimal webPrice,
                                                     BigDecimal inflationRate) {
    return webPrice.multiply(inflationRate)
        .setScale(2, RoundingMode.HALF_UP);
  }

  private static BigDecimal calculateInflationRate(BigDecimal inflationPercent) {
    return inflationPercent.divide(BigDecimal.valueOf(100), 2, RoundingMode.HALF_UP)
        .add(BigDecimal.ONE);
  }
}

