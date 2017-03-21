package cn.wanru.util;

import java.math.BigDecimal;

/**
 * @author xxf
 * @since 17/3/21
 */
public abstract class MathUtil {

  public static boolean eq(BigDecimal v1,BigDecimal v2) {
    if (v1 == v2) {
      return true;
    }

    return v1.compareTo(v2) == 0;
  }

  public static boolean gt(BigDecimal v1,BigDecimal v2) {
    if (v1 == v2){
      return false;
    }

    return v1.compareTo(v2) > 0 ;
  }

  public static boolean lt(BigDecimal v1,BigDecimal v2) {
    if (v1 == v2) {
      return false;
    }

    return v1.compareTo(v2) < 0;
  }


}
