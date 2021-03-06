/**
 * Autogenerated by Thrift Compiler (0.10.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package gen_java.example;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.10.0)", date = "2020-12-03")
public class MathCalc implements org.apache.thrift.TBase<MathCalc, MathCalc._Fields>, java.io.Serializable, Cloneable, Comparable<MathCalc> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("MathCalc");

  private static final org.apache.thrift.protocol.TField SUM_FIELD_DESC = new org.apache.thrift.protocol.TField("sum", org.apache.thrift.protocol.TType.DOUBLE, (short)1);
  private static final org.apache.thrift.protocol.TField DIF_FIELD_DESC = new org.apache.thrift.protocol.TField("dif", org.apache.thrift.protocol.TType.DOUBLE, (short)2);
  private static final org.apache.thrift.protocol.TField MUL_FIELD_DESC = new org.apache.thrift.protocol.TField("mul", org.apache.thrift.protocol.TType.DOUBLE, (short)3);
  private static final org.apache.thrift.protocol.TField DIV_FIELD_DESC = new org.apache.thrift.protocol.TField("div", org.apache.thrift.protocol.TType.DOUBLE, (short)4);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new MathCalcStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new MathCalcTupleSchemeFactory();

  public double sum; // required
  public double dif; // required
  public double mul; // required
  public double div; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    SUM((short)1, "sum"),
    DIF((short)2, "dif"),
    MUL((short)3, "mul"),
    DIV((short)4, "div");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // SUM
          return SUM;
        case 2: // DIF
          return DIF;
        case 3: // MUL
          return MUL;
        case 4: // DIV
          return DIV;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new java.lang.IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(java.lang.String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final java.lang.String _fieldName;

    _Fields(short thriftId, java.lang.String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public java.lang.String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __SUM_ISSET_ID = 0;
  private static final int __DIF_ISSET_ID = 1;
  private static final int __MUL_ISSET_ID = 2;
  private static final int __DIV_ISSET_ID = 3;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.SUM, new org.apache.thrift.meta_data.FieldMetaData("sum", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE)));
    tmpMap.put(_Fields.DIF, new org.apache.thrift.meta_data.FieldMetaData("dif", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE)));
    tmpMap.put(_Fields.MUL, new org.apache.thrift.meta_data.FieldMetaData("mul", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE)));
    tmpMap.put(_Fields.DIV, new org.apache.thrift.meta_data.FieldMetaData("div", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(MathCalc.class, metaDataMap);
  }

  public MathCalc() {
  }

  public MathCalc(
    double sum,
    double dif,
    double mul,
    double div)
  {
    this();
    this.sum = sum;
    setSumIsSet(true);
    this.dif = dif;
    setDifIsSet(true);
    this.mul = mul;
    setMulIsSet(true);
    this.div = div;
    setDivIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public MathCalc(MathCalc other) {
    __isset_bitfield = other.__isset_bitfield;
    this.sum = other.sum;
    this.dif = other.dif;
    this.mul = other.mul;
    this.div = other.div;
  }

  public MathCalc deepCopy() {
    return new MathCalc(this);
  }

  @Override
  public void clear() {
    setSumIsSet(false);
    this.sum = 0.0;
    setDifIsSet(false);
    this.dif = 0.0;
    setMulIsSet(false);
    this.mul = 0.0;
    setDivIsSet(false);
    this.div = 0.0;
  }

  public double getSum() {
    return this.sum;
  }

  public MathCalc setSum(double sum) {
    this.sum = sum;
    setSumIsSet(true);
    return this;
  }

  public void unsetSum() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __SUM_ISSET_ID);
  }

  /** Returns true if field sum is set (has been assigned a value) and false otherwise */
  public boolean isSetSum() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __SUM_ISSET_ID);
  }

  public void setSumIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __SUM_ISSET_ID, value);
  }

  public double getDif() {
    return this.dif;
  }

  public MathCalc setDif(double dif) {
    this.dif = dif;
    setDifIsSet(true);
    return this;
  }

  public void unsetDif() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __DIF_ISSET_ID);
  }

  /** Returns true if field dif is set (has been assigned a value) and false otherwise */
  public boolean isSetDif() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __DIF_ISSET_ID);
  }

  public void setDifIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __DIF_ISSET_ID, value);
  }

  public double getMul() {
    return this.mul;
  }

  public MathCalc setMul(double mul) {
    this.mul = mul;
    setMulIsSet(true);
    return this;
  }

  public void unsetMul() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __MUL_ISSET_ID);
  }

  /** Returns true if field mul is set (has been assigned a value) and false otherwise */
  public boolean isSetMul() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __MUL_ISSET_ID);
  }

  public void setMulIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __MUL_ISSET_ID, value);
  }

  public double getDiv() {
    return this.div;
  }

  public MathCalc setDiv(double div) {
    this.div = div;
    setDivIsSet(true);
    return this;
  }

  public void unsetDiv() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __DIV_ISSET_ID);
  }

  /** Returns true if field div is set (has been assigned a value) and false otherwise */
  public boolean isSetDiv() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __DIV_ISSET_ID);
  }

  public void setDivIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __DIV_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case SUM:
      if (value == null) {
        unsetSum();
      } else {
        setSum((java.lang.Double)value);
      }
      break;

    case DIF:
      if (value == null) {
        unsetDif();
      } else {
        setDif((java.lang.Double)value);
      }
      break;

    case MUL:
      if (value == null) {
        unsetMul();
      } else {
        setMul((java.lang.Double)value);
      }
      break;

    case DIV:
      if (value == null) {
        unsetDiv();
      } else {
        setDiv((java.lang.Double)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case SUM:
      return getSum();

    case DIF:
      return getDif();

    case MUL:
      return getMul();

    case DIV:
      return getDiv();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case SUM:
      return isSetSum();
    case DIF:
      return isSetDif();
    case MUL:
      return isSetMul();
    case DIV:
      return isSetDiv();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof MathCalc)
      return this.equals((MathCalc)that);
    return false;
  }

  public boolean equals(MathCalc that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_sum = true;
    boolean that_present_sum = true;
    if (this_present_sum || that_present_sum) {
      if (!(this_present_sum && that_present_sum))
        return false;
      if (this.sum != that.sum)
        return false;
    }

    boolean this_present_dif = true;
    boolean that_present_dif = true;
    if (this_present_dif || that_present_dif) {
      if (!(this_present_dif && that_present_dif))
        return false;
      if (this.dif != that.dif)
        return false;
    }

    boolean this_present_mul = true;
    boolean that_present_mul = true;
    if (this_present_mul || that_present_mul) {
      if (!(this_present_mul && that_present_mul))
        return false;
      if (this.mul != that.mul)
        return false;
    }

    boolean this_present_div = true;
    boolean that_present_div = true;
    if (this_present_div || that_present_div) {
      if (!(this_present_div && that_present_div))
        return false;
      if (this.div != that.div)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(sum);

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(dif);

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(mul);

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(div);

    return hashCode;
  }

  @Override
  public int compareTo(MathCalc other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetSum()).compareTo(other.isSetSum());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSum()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.sum, other.sum);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetDif()).compareTo(other.isSetDif());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDif()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.dif, other.dif);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetMul()).compareTo(other.isSetMul());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMul()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.mul, other.mul);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetDiv()).compareTo(other.isSetDiv());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDiv()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.div, other.div);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    scheme(iprot).read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("MathCalc(");
    boolean first = true;

    sb.append("sum:");
    sb.append(this.sum);
    first = false;
    if (!first) sb.append(", ");
    sb.append("dif:");
    sb.append(this.dif);
    first = false;
    if (!first) sb.append(", ");
    sb.append("mul:");
    sb.append(this.mul);
    first = false;
    if (!first) sb.append(", ");
    sb.append("div:");
    sb.append(this.div);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class MathCalcStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public MathCalcStandardScheme getScheme() {
      return new MathCalcStandardScheme();
    }
  }

  private static class MathCalcStandardScheme extends org.apache.thrift.scheme.StandardScheme<MathCalc> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, MathCalc struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // SUM
            if (schemeField.type == org.apache.thrift.protocol.TType.DOUBLE) {
              struct.sum = iprot.readDouble();
              struct.setSumIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // DIF
            if (schemeField.type == org.apache.thrift.protocol.TType.DOUBLE) {
              struct.dif = iprot.readDouble();
              struct.setDifIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // MUL
            if (schemeField.type == org.apache.thrift.protocol.TType.DOUBLE) {
              struct.mul = iprot.readDouble();
              struct.setMulIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // DIV
            if (schemeField.type == org.apache.thrift.protocol.TType.DOUBLE) {
              struct.div = iprot.readDouble();
              struct.setDivIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, MathCalc struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(SUM_FIELD_DESC);
      oprot.writeDouble(struct.sum);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(DIF_FIELD_DESC);
      oprot.writeDouble(struct.dif);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(MUL_FIELD_DESC);
      oprot.writeDouble(struct.mul);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(DIV_FIELD_DESC);
      oprot.writeDouble(struct.div);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class MathCalcTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public MathCalcTupleScheme getScheme() {
      return new MathCalcTupleScheme();
    }
  }

  private static class MathCalcTupleScheme extends org.apache.thrift.scheme.TupleScheme<MathCalc> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, MathCalc struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetSum()) {
        optionals.set(0);
      }
      if (struct.isSetDif()) {
        optionals.set(1);
      }
      if (struct.isSetMul()) {
        optionals.set(2);
      }
      if (struct.isSetDiv()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetSum()) {
        oprot.writeDouble(struct.sum);
      }
      if (struct.isSetDif()) {
        oprot.writeDouble(struct.dif);
      }
      if (struct.isSetMul()) {
        oprot.writeDouble(struct.mul);
      }
      if (struct.isSetDiv()) {
        oprot.writeDouble(struct.div);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, MathCalc struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        struct.sum = iprot.readDouble();
        struct.setSumIsSet(true);
      }
      if (incoming.get(1)) {
        struct.dif = iprot.readDouble();
        struct.setDifIsSet(true);
      }
      if (incoming.get(2)) {
        struct.mul = iprot.readDouble();
        struct.setMulIsSet(true);
      }
      if (incoming.get(3)) {
        struct.div = iprot.readDouble();
        struct.setDivIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

