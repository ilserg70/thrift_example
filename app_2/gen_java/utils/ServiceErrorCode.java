/**
 * Autogenerated by Thrift Compiler (0.10.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package gen_java.utils;


import java.util.Map;
import java.util.HashMap;
import org.apache.thrift.TEnum;

public enum ServiceErrorCode implements org.apache.thrift.TEnum {
  No(0),
  DivByZero(1);

  private final int value;

  private ServiceErrorCode(int value) {
    this.value = value;
  }

  /**
   * Get the integer value of this enum value, as defined in the Thrift IDL.
   */
  public int getValue() {
    return value;
  }

  /**
   * Find a the enum type by its integer value, as defined in the Thrift IDL.
   * @return null if the value is not found.
   */
  public static ServiceErrorCode findByValue(int value) { 
    switch (value) {
      case 0:
        return No;
      case 1:
        return DivByZero;
      default:
        return null;
    }
  }
}
