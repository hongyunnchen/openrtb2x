/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package org.openrtb.common.api;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class Data extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Data\",\"namespace\":\"org.openrtb.common.api\",\"fields\":[{\"name\":\"id\",\"type\":[\"string\",\"null\"]},{\"name\":\"name\",\"type\":[\"string\",\"null\"]},{\"name\":\"segment\",\"type\":[{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"Segment\",\"fields\":[{\"name\":\"id\",\"type\":[\"string\",\"null\"]},{\"name\":\"name\",\"type\":[\"string\",\"null\"]},{\"name\":\"value\",\"type\":[\"string\",\"null\"]},{\"name\":\"ext\",\"type\":[\"string\",\"null\"]}]}},\"null\"]},{\"name\":\"ext\",\"type\":[\"string\",\"null\"]}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.CharSequence id;
  @Deprecated public java.lang.CharSequence name;
  @Deprecated public java.util.List<org.openrtb.common.api.Segment> segment;
  @Deprecated public java.lang.CharSequence ext;

  /**
   * Default constructor.
   */
  public Data() {}

  /**
   * All-args constructor.
   */
  public Data(java.lang.CharSequence id, java.lang.CharSequence name, java.util.List<org.openrtb.common.api.Segment> segment, java.lang.CharSequence ext) {
    this.id = id;
    this.name = name;
    this.segment = segment;
    this.ext = ext;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return id;
    case 1: return name;
    case 2: return segment;
    case 3: return ext;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: id = (java.lang.CharSequence)value$; break;
    case 1: name = (java.lang.CharSequence)value$; break;
    case 2: segment = (java.util.List<org.openrtb.common.api.Segment>)value$; break;
    case 3: ext = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'id' field.
   */
  public java.lang.CharSequence getId() {
    return id;
  }

  /**
   * Sets the value of the 'id' field.
   * @param value the value to set.
   */
  public void setId(java.lang.CharSequence value) {
    this.id = value;
  }

  /**
   * Gets the value of the 'name' field.
   */
  public java.lang.CharSequence getName() {
    return name;
  }

  /**
   * Sets the value of the 'name' field.
   * @param value the value to set.
   */
  public void setName(java.lang.CharSequence value) {
    this.name = value;
  }

  /**
   * Gets the value of the 'segment' field.
   */
  public java.util.List<org.openrtb.common.api.Segment> getSegment() {
    return segment;
  }

  /**
   * Sets the value of the 'segment' field.
   * @param value the value to set.
   */
  public void setSegment(java.util.List<org.openrtb.common.api.Segment> value) {
    this.segment = value;
  }

  /**
   * Gets the value of the 'ext' field.
   */
  public java.lang.CharSequence getExt() {
    return ext;
  }

  /**
   * Sets the value of the 'ext' field.
   * @param value the value to set.
   */
  public void setExt(java.lang.CharSequence value) {
    this.ext = value;
  }

  /** Creates a new Data RecordBuilder */
  public static org.openrtb.common.api.Data.Builder newBuilder() {
    return new org.openrtb.common.api.Data.Builder();
  }
  
  /** Creates a new Data RecordBuilder by copying an existing Builder */
  public static org.openrtb.common.api.Data.Builder newBuilder(org.openrtb.common.api.Data.Builder other) {
    return new org.openrtb.common.api.Data.Builder(other);
  }
  
  /** Creates a new Data RecordBuilder by copying an existing Data instance */
  public static org.openrtb.common.api.Data.Builder newBuilder(org.openrtb.common.api.Data other) {
    return new org.openrtb.common.api.Data.Builder(other);
  }
  
  /**
   * RecordBuilder for Data instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Data>
    implements org.apache.avro.data.RecordBuilder<Data> {

    private java.lang.CharSequence id;
    private java.lang.CharSequence name;
    private java.util.List<org.openrtb.common.api.Segment> segment;
    private java.lang.CharSequence ext;

    /** Creates a new Builder */
    private Builder() {
      super(org.openrtb.common.api.Data.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(org.openrtb.common.api.Data.Builder other) {
      super(other);
    }
    
    /** Creates a Builder by copying an existing Data instance */
    private Builder(org.openrtb.common.api.Data other) {
            super(org.openrtb.common.api.Data.SCHEMA$);
      if (isValidValue(fields()[0], other.id)) {
        this.id = data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.name)) {
        this.name = data().deepCopy(fields()[1].schema(), other.name);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.segment)) {
        this.segment = data().deepCopy(fields()[2].schema(), other.segment);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.ext)) {
        this.ext = data().deepCopy(fields()[3].schema(), other.ext);
        fieldSetFlags()[3] = true;
      }
    }

    /** Gets the value of the 'id' field */
    public java.lang.CharSequence getId() {
      return id;
    }
    
    /** Sets the value of the 'id' field */
    public org.openrtb.common.api.Data.Builder setId(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.id = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'id' field has been set */
    public boolean hasId() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'id' field */
    public org.openrtb.common.api.Data.Builder clearId() {
      id = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'name' field */
    public java.lang.CharSequence getName() {
      return name;
    }
    
    /** Sets the value of the 'name' field */
    public org.openrtb.common.api.Data.Builder setName(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.name = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'name' field has been set */
    public boolean hasName() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'name' field */
    public org.openrtb.common.api.Data.Builder clearName() {
      name = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'segment' field */
    public java.util.List<org.openrtb.common.api.Segment> getSegment() {
      return segment;
    }
    
    /** Sets the value of the 'segment' field */
    public org.openrtb.common.api.Data.Builder setSegment(java.util.List<org.openrtb.common.api.Segment> value) {
      validate(fields()[2], value);
      this.segment = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'segment' field has been set */
    public boolean hasSegment() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'segment' field */
    public org.openrtb.common.api.Data.Builder clearSegment() {
      segment = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /** Gets the value of the 'ext' field */
    public java.lang.CharSequence getExt() {
      return ext;
    }
    
    /** Sets the value of the 'ext' field */
    public org.openrtb.common.api.Data.Builder setExt(java.lang.CharSequence value) {
      validate(fields()[3], value);
      this.ext = value;
      fieldSetFlags()[3] = true;
      return this; 
    }
    
    /** Checks whether the 'ext' field has been set */
    public boolean hasExt() {
      return fieldSetFlags()[3];
    }
    
    /** Clears the value of the 'ext' field */
    public org.openrtb.common.api.Data.Builder clearExt() {
      ext = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    @Override
    public Data build() {
      try {
        Data record = new Data();
        record.id = fieldSetFlags()[0] ? this.id : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.name = fieldSetFlags()[1] ? this.name : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.segment = fieldSetFlags()[2] ? this.segment : (java.util.List<org.openrtb.common.api.Segment>) defaultValue(fields()[2]);
        record.ext = fieldSetFlags()[3] ? this.ext : (java.lang.CharSequence) defaultValue(fields()[3]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
