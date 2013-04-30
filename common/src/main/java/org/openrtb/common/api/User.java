/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package org.openrtb.common.api;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class User extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"User\",\"namespace\":\"org.openrtb.common.api\",\"fields\":[{\"name\":\"Id\",\"type\":[\"string\",\"null\"]},{\"name\":\"buyeruid\",\"type\":[\"string\",\"null\"]},{\"name\":\"yob\",\"type\":[\"int\",\"null\"]},{\"name\":\"gender\",\"type\":[\"string\",\"null\"]},{\"name\":\"keywords\",\"type\":[\"string\",\"null\"]},{\"name\":\"customdata\",\"type\":[\"string\",\"null\"]},{\"name\":\"geo\",\"type\":[{\"type\":\"record\",\"name\":\"Geo\",\"fields\":[{\"name\":\"lat\",\"type\":[\"float\",\"null\"]},{\"name\":\"lon\",\"type\":[\"float\",\"null\"]},{\"name\":\"country\",\"type\":[\"string\",\"null\"]},{\"name\":\"region\",\"type\":[\"string\",\"null\"]},{\"name\":\"regionfips104\",\"type\":[\"string\",\"null\"]},{\"name\":\"metro\",\"type\":[\"string\",\"null\"]},{\"name\":\"city\",\"type\":[\"string\",\"null\"]},{\"name\":\"zip\",\"type\":[\"string\",\"null\"]},{\"name\":\"type\",\"type\":[\"int\",\"null\"]},{\"name\":\"ext\",\"type\":[\"string\",\"null\"]}]},\"null\"]},{\"name\":\"data\",\"type\":[{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"Data\",\"fields\":[{\"name\":\"id\",\"type\":[\"string\",\"null\"]},{\"name\":\"name\",\"type\":[\"string\",\"null\"]},{\"name\":\"segment\",\"type\":[{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"Segment\",\"fields\":[{\"name\":\"id\",\"type\":[\"string\",\"null\"]},{\"name\":\"name\",\"type\":[\"string\",\"null\"]},{\"name\":\"value\",\"type\":[\"string\",\"null\"]},{\"name\":\"ext\",\"type\":[\"string\",\"null\"]}]}},\"null\"]},{\"name\":\"ext\",\"type\":[\"string\",\"null\"]}]}},\"null\"]},{\"name\":\"ext\",\"type\":[\"string\",\"null\"]}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.CharSequence Id;
  @Deprecated public java.lang.CharSequence buyeruid;
  @Deprecated public java.lang.Integer yob;
  @Deprecated public java.lang.CharSequence gender;
  @Deprecated public java.lang.CharSequence keywords;
  @Deprecated public java.lang.CharSequence customdata;
  @Deprecated public org.openrtb.common.api.Geo geo;
  @Deprecated public java.util.List<org.openrtb.common.api.Data> data;
  @Deprecated public java.lang.CharSequence ext;

  /**
   * Default constructor.
   */
  public User() {}

  /**
   * All-args constructor.
   */
  public User(java.lang.CharSequence Id, java.lang.CharSequence buyeruid, java.lang.Integer yob, java.lang.CharSequence gender, java.lang.CharSequence keywords, java.lang.CharSequence customdata, org.openrtb.common.api.Geo geo, java.util.List<org.openrtb.common.api.Data> data, java.lang.CharSequence ext) {
    this.Id = Id;
    this.buyeruid = buyeruid;
    this.yob = yob;
    this.gender = gender;
    this.keywords = keywords;
    this.customdata = customdata;
    this.geo = geo;
    this.data = data;
    this.ext = ext;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return Id;
    case 1: return buyeruid;
    case 2: return yob;
    case 3: return gender;
    case 4: return keywords;
    case 5: return customdata;
    case 6: return geo;
    case 7: return data;
    case 8: return ext;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: Id = (java.lang.CharSequence)value$; break;
    case 1: buyeruid = (java.lang.CharSequence)value$; break;
    case 2: yob = (java.lang.Integer)value$; break;
    case 3: gender = (java.lang.CharSequence)value$; break;
    case 4: keywords = (java.lang.CharSequence)value$; break;
    case 5: customdata = (java.lang.CharSequence)value$; break;
    case 6: geo = (org.openrtb.common.api.Geo)value$; break;
    case 7: data = (java.util.List<org.openrtb.common.api.Data>)value$; break;
    case 8: ext = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'Id' field.
   */
  public java.lang.CharSequence getId() {
    return Id;
  }

  /**
   * Sets the value of the 'Id' field.
   * @param value the value to set.
   */
  public void setId(java.lang.CharSequence value) {
    this.Id = value;
  }

  /**
   * Gets the value of the 'buyeruid' field.
   */
  public java.lang.CharSequence getBuyeruid() {
    return buyeruid;
  }

  /**
   * Sets the value of the 'buyeruid' field.
   * @param value the value to set.
   */
  public void setBuyeruid(java.lang.CharSequence value) {
    this.buyeruid = value;
  }

  /**
   * Gets the value of the 'yob' field.
   */
  public java.lang.Integer getYob() {
    return yob;
  }

  /**
   * Sets the value of the 'yob' field.
   * @param value the value to set.
   */
  public void setYob(java.lang.Integer value) {
    this.yob = value;
  }

  /**
   * Gets the value of the 'gender' field.
   */
  public java.lang.CharSequence getGender() {
    return gender;
  }

  /**
   * Sets the value of the 'gender' field.
   * @param value the value to set.
   */
  public void setGender(java.lang.CharSequence value) {
    this.gender = value;
  }

  /**
   * Gets the value of the 'keywords' field.
   */
  public java.lang.CharSequence getKeywords() {
    return keywords;
  }

  /**
   * Sets the value of the 'keywords' field.
   * @param value the value to set.
   */
  public void setKeywords(java.lang.CharSequence value) {
    this.keywords = value;
  }

  /**
   * Gets the value of the 'customdata' field.
   */
  public java.lang.CharSequence getCustomdata() {
    return customdata;
  }

  /**
   * Sets the value of the 'customdata' field.
   * @param value the value to set.
   */
  public void setCustomdata(java.lang.CharSequence value) {
    this.customdata = value;
  }

  /**
   * Gets the value of the 'geo' field.
   */
  public org.openrtb.common.api.Geo getGeo() {
    return geo;
  }

  /**
   * Sets the value of the 'geo' field.
   * @param value the value to set.
   */
  public void setGeo(org.openrtb.common.api.Geo value) {
    this.geo = value;
  }

  /**
   * Gets the value of the 'data' field.
   */
  public java.util.List<org.openrtb.common.api.Data> getData() {
    return data;
  }

  /**
   * Sets the value of the 'data' field.
   * @param value the value to set.
   */
  public void setData(java.util.List<org.openrtb.common.api.Data> value) {
    this.data = value;
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

  /** Creates a new User RecordBuilder */
  public static org.openrtb.common.api.User.Builder newBuilder() {
    return new org.openrtb.common.api.User.Builder();
  }
  
  /** Creates a new User RecordBuilder by copying an existing Builder */
  public static org.openrtb.common.api.User.Builder newBuilder(org.openrtb.common.api.User.Builder other) {
    return new org.openrtb.common.api.User.Builder(other);
  }
  
  /** Creates a new User RecordBuilder by copying an existing User instance */
  public static org.openrtb.common.api.User.Builder newBuilder(org.openrtb.common.api.User other) {
    return new org.openrtb.common.api.User.Builder(other);
  }
  
  /**
   * RecordBuilder for User instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<User>
    implements org.apache.avro.data.RecordBuilder<User> {

    private java.lang.CharSequence Id;
    private java.lang.CharSequence buyeruid;
    private java.lang.Integer yob;
    private java.lang.CharSequence gender;
    private java.lang.CharSequence keywords;
    private java.lang.CharSequence customdata;
    private org.openrtb.common.api.Geo geo;
    private java.util.List<org.openrtb.common.api.Data> data;
    private java.lang.CharSequence ext;

    /** Creates a new Builder */
    private Builder() {
      super(org.openrtb.common.api.User.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(org.openrtb.common.api.User.Builder other) {
      super(other);
    }
    
    /** Creates a Builder by copying an existing User instance */
    private Builder(org.openrtb.common.api.User other) {
            super(org.openrtb.common.api.User.SCHEMA$);
      if (isValidValue(fields()[0], other.Id)) {
        this.Id = data().deepCopy(fields()[0].schema(), other.Id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.buyeruid)) {
        this.buyeruid = data().deepCopy(fields()[1].schema(), other.buyeruid);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.yob)) {
        this.yob = data().deepCopy(fields()[2].schema(), other.yob);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.gender)) {
        this.gender = data().deepCopy(fields()[3].schema(), other.gender);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.keywords)) {
        this.keywords = data().deepCopy(fields()[4].schema(), other.keywords);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.customdata)) {
        this.customdata = data().deepCopy(fields()[5].schema(), other.customdata);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.geo)) {
        this.geo = data().deepCopy(fields()[6].schema(), other.geo);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.data)) {
        this.data = data().deepCopy(fields()[7].schema(), other.data);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.ext)) {
        this.ext = data().deepCopy(fields()[8].schema(), other.ext);
        fieldSetFlags()[8] = true;
      }
    }

    /** Gets the value of the 'Id' field */
    public java.lang.CharSequence getId() {
      return Id;
    }
    
    /** Sets the value of the 'Id' field */
    public org.openrtb.common.api.User.Builder setId(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.Id = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'Id' field has been set */
    public boolean hasId() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'Id' field */
    public org.openrtb.common.api.User.Builder clearId() {
      Id = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'buyeruid' field */
    public java.lang.CharSequence getBuyeruid() {
      return buyeruid;
    }
    
    /** Sets the value of the 'buyeruid' field */
    public org.openrtb.common.api.User.Builder setBuyeruid(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.buyeruid = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'buyeruid' field has been set */
    public boolean hasBuyeruid() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'buyeruid' field */
    public org.openrtb.common.api.User.Builder clearBuyeruid() {
      buyeruid = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'yob' field */
    public java.lang.Integer getYob() {
      return yob;
    }
    
    /** Sets the value of the 'yob' field */
    public org.openrtb.common.api.User.Builder setYob(java.lang.Integer value) {
      validate(fields()[2], value);
      this.yob = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'yob' field has been set */
    public boolean hasYob() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'yob' field */
    public org.openrtb.common.api.User.Builder clearYob() {
      yob = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /** Gets the value of the 'gender' field */
    public java.lang.CharSequence getGender() {
      return gender;
    }
    
    /** Sets the value of the 'gender' field */
    public org.openrtb.common.api.User.Builder setGender(java.lang.CharSequence value) {
      validate(fields()[3], value);
      this.gender = value;
      fieldSetFlags()[3] = true;
      return this; 
    }
    
    /** Checks whether the 'gender' field has been set */
    public boolean hasGender() {
      return fieldSetFlags()[3];
    }
    
    /** Clears the value of the 'gender' field */
    public org.openrtb.common.api.User.Builder clearGender() {
      gender = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /** Gets the value of the 'keywords' field */
    public java.lang.CharSequence getKeywords() {
      return keywords;
    }
    
    /** Sets the value of the 'keywords' field */
    public org.openrtb.common.api.User.Builder setKeywords(java.lang.CharSequence value) {
      validate(fields()[4], value);
      this.keywords = value;
      fieldSetFlags()[4] = true;
      return this; 
    }
    
    /** Checks whether the 'keywords' field has been set */
    public boolean hasKeywords() {
      return fieldSetFlags()[4];
    }
    
    /** Clears the value of the 'keywords' field */
    public org.openrtb.common.api.User.Builder clearKeywords() {
      keywords = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /** Gets the value of the 'customdata' field */
    public java.lang.CharSequence getCustomdata() {
      return customdata;
    }
    
    /** Sets the value of the 'customdata' field */
    public org.openrtb.common.api.User.Builder setCustomdata(java.lang.CharSequence value) {
      validate(fields()[5], value);
      this.customdata = value;
      fieldSetFlags()[5] = true;
      return this; 
    }
    
    /** Checks whether the 'customdata' field has been set */
    public boolean hasCustomdata() {
      return fieldSetFlags()[5];
    }
    
    /** Clears the value of the 'customdata' field */
    public org.openrtb.common.api.User.Builder clearCustomdata() {
      customdata = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    /** Gets the value of the 'geo' field */
    public org.openrtb.common.api.Geo getGeo() {
      return geo;
    }
    
    /** Sets the value of the 'geo' field */
    public org.openrtb.common.api.User.Builder setGeo(org.openrtb.common.api.Geo value) {
      validate(fields()[6], value);
      this.geo = value;
      fieldSetFlags()[6] = true;
      return this; 
    }
    
    /** Checks whether the 'geo' field has been set */
    public boolean hasGeo() {
      return fieldSetFlags()[6];
    }
    
    /** Clears the value of the 'geo' field */
    public org.openrtb.common.api.User.Builder clearGeo() {
      geo = null;
      fieldSetFlags()[6] = false;
      return this;
    }

    /** Gets the value of the 'data' field */
    public java.util.List<org.openrtb.common.api.Data> getData() {
      return data;
    }
    
    /** Sets the value of the 'data' field */
    public org.openrtb.common.api.User.Builder setData(java.util.List<org.openrtb.common.api.Data> value) {
      validate(fields()[7], value);
      this.data = value;
      fieldSetFlags()[7] = true;
      return this; 
    }
    
    /** Checks whether the 'data' field has been set */
    public boolean hasData() {
      return fieldSetFlags()[7];
    }
    
    /** Clears the value of the 'data' field */
    public org.openrtb.common.api.User.Builder clearData() {
      data = null;
      fieldSetFlags()[7] = false;
      return this;
    }

    /** Gets the value of the 'ext' field */
    public java.lang.CharSequence getExt() {
      return ext;
    }
    
    /** Sets the value of the 'ext' field */
    public org.openrtb.common.api.User.Builder setExt(java.lang.CharSequence value) {
      validate(fields()[8], value);
      this.ext = value;
      fieldSetFlags()[8] = true;
      return this; 
    }
    
    /** Checks whether the 'ext' field has been set */
    public boolean hasExt() {
      return fieldSetFlags()[8];
    }
    
    /** Clears the value of the 'ext' field */
    public org.openrtb.common.api.User.Builder clearExt() {
      ext = null;
      fieldSetFlags()[8] = false;
      return this;
    }

    @Override
    public User build() {
      try {
        User record = new User();
        record.Id = fieldSetFlags()[0] ? this.Id : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.buyeruid = fieldSetFlags()[1] ? this.buyeruid : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.yob = fieldSetFlags()[2] ? this.yob : (java.lang.Integer) defaultValue(fields()[2]);
        record.gender = fieldSetFlags()[3] ? this.gender : (java.lang.CharSequence) defaultValue(fields()[3]);
        record.keywords = fieldSetFlags()[4] ? this.keywords : (java.lang.CharSequence) defaultValue(fields()[4]);
        record.customdata = fieldSetFlags()[5] ? this.customdata : (java.lang.CharSequence) defaultValue(fields()[5]);
        record.geo = fieldSetFlags()[6] ? this.geo : (org.openrtb.common.api.Geo) defaultValue(fields()[6]);
        record.data = fieldSetFlags()[7] ? this.data : (java.util.List<org.openrtb.common.api.Data>) defaultValue(fields()[7]);
        record.ext = fieldSetFlags()[8] ? this.ext : (java.lang.CharSequence) defaultValue(fields()[8]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
