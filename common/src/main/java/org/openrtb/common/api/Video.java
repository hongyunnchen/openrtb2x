/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package org.openrtb.common.api;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class Video extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Video\",\"namespace\":\"org.openrtb.common.api\",\"fields\":[{\"name\":\"mimes\",\"type\":{\"type\":\"array\",\"items\":\"string\"}},{\"name\":\"linearity\",\"type\":[\"int\",\"null\"]},{\"name\":\"minduration\",\"type\":[\"int\",\"null\"]},{\"name\":\"maxduration\",\"type\":[\"int\",\"null\"]},{\"name\":\"protocol\",\"type\":[\"int\",\"null\"]},{\"name\":\"w\",\"type\":[\"int\",\"null\"]},{\"name\":\"h\",\"type\":[\"int\",\"null\"]},{\"name\":\"startdelay\",\"type\":[\"int\",\"null\"]},{\"name\":\"sequence\",\"type\":[\"int\",\"null\"]},{\"name\":\"battr\",\"type\":[{\"type\":\"array\",\"items\":\"int\"},\"null\"]},{\"name\":\"maxextended\",\"type\":[\"int\",\"null\"]},{\"name\":\"minbitrate\",\"type\":[\"int\",\"null\"]},{\"name\":\"maxbitrate\",\"type\":[\"int\",\"null\"]},{\"name\":\"boxingallowed\",\"type\":[\"int\",\"null\"]},{\"name\":\"playbackmethod\",\"type\":[{\"type\":\"array\",\"items\":\"int\"},\"null\"]},{\"name\":\"delivery\",\"type\":[{\"type\":\"array\",\"items\":\"int\"},\"null\"]},{\"name\":\"pos\",\"type\":[\"int\",\"null\"]},{\"name\":\"companionad\",\"type\":[{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"Banner\",\"fields\":[{\"name\":\"w\",\"type\":[\"int\",\"null\"]},{\"name\":\"h\",\"type\":[\"int\",\"null\"]},{\"name\":\"id\",\"type\":[\"string\",\"null\"]},{\"name\":\"pos\",\"type\":[\"int\",\"null\"]},{\"name\":\"btype\",\"type\":[{\"type\":\"array\",\"items\":\"int\"},\"null\"]},{\"name\":\"battr\",\"type\":[{\"type\":\"array\",\"items\":\"int\"},\"null\"]},{\"name\":\"mimes\",\"type\":[{\"type\":\"array\",\"items\":\"string\"},\"null\"]},{\"name\":\"topframe\",\"type\":[\"int\",\"null\"]},{\"name\":\"expdir\",\"type\":[{\"type\":\"array\",\"items\":\"int\"},\"null\"]},{\"name\":\"api\",\"type\":[{\"type\":\"array\",\"items\":\"int\"},\"null\"]},{\"name\":\"ext\",\"type\":[\"string\",\"null\"]}]}},\"null\"]},{\"name\":\"api\",\"type\":[{\"type\":\"array\",\"items\":\"int\"},\"null\"]},{\"name\":\"companiontype\",\"type\":[{\"type\":\"array\",\"items\":\"int\"},\"null\"]},{\"name\":\"ext\",\"type\":[\"string\",\"null\"]}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.util.List<java.lang.CharSequence> mimes;
  @Deprecated public java.lang.Integer linearity;
  @Deprecated public java.lang.Integer minduration;
  @Deprecated public java.lang.Integer maxduration;
  @Deprecated public java.lang.Integer protocol;
  @Deprecated public java.lang.Integer w;
  @Deprecated public java.lang.Integer h;
  @Deprecated public java.lang.Integer startdelay;
  @Deprecated public java.lang.Integer sequence;
  @Deprecated public java.util.List<java.lang.Integer> battr;
  @Deprecated public java.lang.Integer maxextended;
  @Deprecated public java.lang.Integer minbitrate;
  @Deprecated public java.lang.Integer maxbitrate;
  @Deprecated public java.lang.Integer boxingallowed;
  @Deprecated public java.util.List<java.lang.Integer> playbackmethod;
  @Deprecated public java.util.List<java.lang.Integer> delivery;
  @Deprecated public java.lang.Integer pos;
  @Deprecated public java.util.List<org.openrtb.common.api.Banner> companionad;
  @Deprecated public java.util.List<java.lang.Integer> api;
  @Deprecated public java.util.List<java.lang.Integer> companiontype;
  @Deprecated public java.lang.CharSequence ext;

  /**
   * Default constructor.
   */
  public Video() {}

  /**
   * All-args constructor.
   */
  public Video(java.util.List<java.lang.CharSequence> mimes, java.lang.Integer linearity, java.lang.Integer minduration, java.lang.Integer maxduration, java.lang.Integer protocol, java.lang.Integer w, java.lang.Integer h, java.lang.Integer startdelay, java.lang.Integer sequence, java.util.List<java.lang.Integer> battr, java.lang.Integer maxextended, java.lang.Integer minbitrate, java.lang.Integer maxbitrate, java.lang.Integer boxingallowed, java.util.List<java.lang.Integer> playbackmethod, java.util.List<java.lang.Integer> delivery, java.lang.Integer pos, java.util.List<org.openrtb.common.api.Banner> companionad, java.util.List<java.lang.Integer> api, java.util.List<java.lang.Integer> companiontype, java.lang.CharSequence ext) {
    this.mimes = mimes;
    this.linearity = linearity;
    this.minduration = minduration;
    this.maxduration = maxduration;
    this.protocol = protocol;
    this.w = w;
    this.h = h;
    this.startdelay = startdelay;
    this.sequence = sequence;
    this.battr = battr;
    this.maxextended = maxextended;
    this.minbitrate = minbitrate;
    this.maxbitrate = maxbitrate;
    this.boxingallowed = boxingallowed;
    this.playbackmethod = playbackmethod;
    this.delivery = delivery;
    this.pos = pos;
    this.companionad = companionad;
    this.api = api;
    this.companiontype = companiontype;
    this.ext = ext;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return mimes;
    case 1: return linearity;
    case 2: return minduration;
    case 3: return maxduration;
    case 4: return protocol;
    case 5: return w;
    case 6: return h;
    case 7: return startdelay;
    case 8: return sequence;
    case 9: return battr;
    case 10: return maxextended;
    case 11: return minbitrate;
    case 12: return maxbitrate;
    case 13: return boxingallowed;
    case 14: return playbackmethod;
    case 15: return delivery;
    case 16: return pos;
    case 17: return companionad;
    case 18: return api;
    case 19: return companiontype;
    case 20: return ext;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: mimes = (java.util.List<java.lang.CharSequence>)value$; break;
    case 1: linearity = (java.lang.Integer)value$; break;
    case 2: minduration = (java.lang.Integer)value$; break;
    case 3: maxduration = (java.lang.Integer)value$; break;
    case 4: protocol = (java.lang.Integer)value$; break;
    case 5: w = (java.lang.Integer)value$; break;
    case 6: h = (java.lang.Integer)value$; break;
    case 7: startdelay = (java.lang.Integer)value$; break;
    case 8: sequence = (java.lang.Integer)value$; break;
    case 9: battr = (java.util.List<java.lang.Integer>)value$; break;
    case 10: maxextended = (java.lang.Integer)value$; break;
    case 11: minbitrate = (java.lang.Integer)value$; break;
    case 12: maxbitrate = (java.lang.Integer)value$; break;
    case 13: boxingallowed = (java.lang.Integer)value$; break;
    case 14: playbackmethod = (java.util.List<java.lang.Integer>)value$; break;
    case 15: delivery = (java.util.List<java.lang.Integer>)value$; break;
    case 16: pos = (java.lang.Integer)value$; break;
    case 17: companionad = (java.util.List<org.openrtb.common.api.Banner>)value$; break;
    case 18: api = (java.util.List<java.lang.Integer>)value$; break;
    case 19: companiontype = (java.util.List<java.lang.Integer>)value$; break;
    case 20: ext = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'mimes' field.
   */
  public java.util.List<java.lang.CharSequence> getMimes() {
    return mimes;
  }

  /**
   * Sets the value of the 'mimes' field.
   * @param value the value to set.
   */
  public void setMimes(java.util.List<java.lang.CharSequence> value) {
    this.mimes = value;
  }

  /**
   * Gets the value of the 'linearity' field.
   */
  public java.lang.Integer getLinearity() {
    return linearity;
  }

  /**
   * Sets the value of the 'linearity' field.
   * @param value the value to set.
   */
  public void setLinearity(java.lang.Integer value) {
    this.linearity = value;
  }

  /**
   * Gets the value of the 'minduration' field.
   */
  public java.lang.Integer getMinduration() {
    return minduration;
  }

  /**
   * Sets the value of the 'minduration' field.
   * @param value the value to set.
   */
  public void setMinduration(java.lang.Integer value) {
    this.minduration = value;
  }

  /**
   * Gets the value of the 'maxduration' field.
   */
  public java.lang.Integer getMaxduration() {
    return maxduration;
  }

  /**
   * Sets the value of the 'maxduration' field.
   * @param value the value to set.
   */
  public void setMaxduration(java.lang.Integer value) {
    this.maxduration = value;
  }

  /**
   * Gets the value of the 'protocol' field.
   */
  public java.lang.Integer getProtocol() {
    return protocol;
  }

  /**
   * Sets the value of the 'protocol' field.
   * @param value the value to set.
   */
  public void setProtocol(java.lang.Integer value) {
    this.protocol = value;
  }

  /**
   * Gets the value of the 'w' field.
   */
  public java.lang.Integer getW() {
    return w;
  }

  /**
   * Sets the value of the 'w' field.
   * @param value the value to set.
   */
  public void setW(java.lang.Integer value) {
    this.w = value;
  }

  /**
   * Gets the value of the 'h' field.
   */
  public java.lang.Integer getH() {
    return h;
  }

  /**
   * Sets the value of the 'h' field.
   * @param value the value to set.
   */
  public void setH(java.lang.Integer value) {
    this.h = value;
  }

  /**
   * Gets the value of the 'startdelay' field.
   */
  public java.lang.Integer getStartdelay() {
    return startdelay;
  }

  /**
   * Sets the value of the 'startdelay' field.
   * @param value the value to set.
   */
  public void setStartdelay(java.lang.Integer value) {
    this.startdelay = value;
  }

  /**
   * Gets the value of the 'sequence' field.
   */
  public java.lang.Integer getSequence() {
    return sequence;
  }

  /**
   * Sets the value of the 'sequence' field.
   * @param value the value to set.
   */
  public void setSequence(java.lang.Integer value) {
    this.sequence = value;
  }

  /**
   * Gets the value of the 'battr' field.
   */
  public java.util.List<java.lang.Integer> getBattr() {
    return battr;
  }

  /**
   * Sets the value of the 'battr' field.
   * @param value the value to set.
   */
  public void setBattr(java.util.List<java.lang.Integer> value) {
    this.battr = value;
  }

  /**
   * Gets the value of the 'maxextended' field.
   */
  public java.lang.Integer getMaxextended() {
    return maxextended;
  }

  /**
   * Sets the value of the 'maxextended' field.
   * @param value the value to set.
   */
  public void setMaxextended(java.lang.Integer value) {
    this.maxextended = value;
  }

  /**
   * Gets the value of the 'minbitrate' field.
   */
  public java.lang.Integer getMinbitrate() {
    return minbitrate;
  }

  /**
   * Sets the value of the 'minbitrate' field.
   * @param value the value to set.
   */
  public void setMinbitrate(java.lang.Integer value) {
    this.minbitrate = value;
  }

  /**
   * Gets the value of the 'maxbitrate' field.
   */
  public java.lang.Integer getMaxbitrate() {
    return maxbitrate;
  }

  /**
   * Sets the value of the 'maxbitrate' field.
   * @param value the value to set.
   */
  public void setMaxbitrate(java.lang.Integer value) {
    this.maxbitrate = value;
  }

  /**
   * Gets the value of the 'boxingallowed' field.
   */
  public java.lang.Integer getBoxingallowed() {
    return boxingallowed;
  }

  /**
   * Sets the value of the 'boxingallowed' field.
   * @param value the value to set.
   */
  public void setBoxingallowed(java.lang.Integer value) {
    this.boxingallowed = value;
  }

  /**
   * Gets the value of the 'playbackmethod' field.
   */
  public java.util.List<java.lang.Integer> getPlaybackmethod() {
    return playbackmethod;
  }

  /**
   * Sets the value of the 'playbackmethod' field.
   * @param value the value to set.
   */
  public void setPlaybackmethod(java.util.List<java.lang.Integer> value) {
    this.playbackmethod = value;
  }

  /**
   * Gets the value of the 'delivery' field.
   */
  public java.util.List<java.lang.Integer> getDelivery() {
    return delivery;
  }

  /**
   * Sets the value of the 'delivery' field.
   * @param value the value to set.
   */
  public void setDelivery(java.util.List<java.lang.Integer> value) {
    this.delivery = value;
  }

  /**
   * Gets the value of the 'pos' field.
   */
  public java.lang.Integer getPos() {
    return pos;
  }

  /**
   * Sets the value of the 'pos' field.
   * @param value the value to set.
   */
  public void setPos(java.lang.Integer value) {
    this.pos = value;
  }

  /**
   * Gets the value of the 'companionad' field.
   */
  public java.util.List<org.openrtb.common.api.Banner> getCompanionad() {
    return companionad;
  }

  /**
   * Sets the value of the 'companionad' field.
   * @param value the value to set.
   */
  public void setCompanionad(java.util.List<org.openrtb.common.api.Banner> value) {
    this.companionad = value;
  }

  /**
   * Gets the value of the 'api' field.
   */
  public java.util.List<java.lang.Integer> getApi() {
    return api;
  }

  /**
   * Sets the value of the 'api' field.
   * @param value the value to set.
   */
  public void setApi(java.util.List<java.lang.Integer> value) {
    this.api = value;
  }

  /**
   * Gets the value of the 'companiontype' field.
   */
  public java.util.List<java.lang.Integer> getCompaniontype() {
    return companiontype;
  }

  /**
   * Sets the value of the 'companiontype' field.
   * @param value the value to set.
   */
  public void setCompaniontype(java.util.List<java.lang.Integer> value) {
    this.companiontype = value;
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

  /** Creates a new Video RecordBuilder */
  public static org.openrtb.common.api.Video.Builder newBuilder() {
    return new org.openrtb.common.api.Video.Builder();
  }
  
  /** Creates a new Video RecordBuilder by copying an existing Builder */
  public static org.openrtb.common.api.Video.Builder newBuilder(org.openrtb.common.api.Video.Builder other) {
    return new org.openrtb.common.api.Video.Builder(other);
  }
  
  /** Creates a new Video RecordBuilder by copying an existing Video instance */
  public static org.openrtb.common.api.Video.Builder newBuilder(org.openrtb.common.api.Video other) {
    return new org.openrtb.common.api.Video.Builder(other);
  }
  
  /**
   * RecordBuilder for Video instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Video>
    implements org.apache.avro.data.RecordBuilder<Video> {

    private java.util.List<java.lang.CharSequence> mimes;
    private java.lang.Integer linearity;
    private java.lang.Integer minduration;
    private java.lang.Integer maxduration;
    private java.lang.Integer protocol;
    private java.lang.Integer w;
    private java.lang.Integer h;
    private java.lang.Integer startdelay;
    private java.lang.Integer sequence;
    private java.util.List<java.lang.Integer> battr;
    private java.lang.Integer maxextended;
    private java.lang.Integer minbitrate;
    private java.lang.Integer maxbitrate;
    private java.lang.Integer boxingallowed;
    private java.util.List<java.lang.Integer> playbackmethod;
    private java.util.List<java.lang.Integer> delivery;
    private java.lang.Integer pos;
    private java.util.List<org.openrtb.common.api.Banner> companionad;
    private java.util.List<java.lang.Integer> api;
    private java.util.List<java.lang.Integer> companiontype;
    private java.lang.CharSequence ext;

    /** Creates a new Builder */
    private Builder() {
      super(org.openrtb.common.api.Video.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(org.openrtb.common.api.Video.Builder other) {
      super(other);
    }
    
    /** Creates a Builder by copying an existing Video instance */
    private Builder(org.openrtb.common.api.Video other) {
            super(org.openrtb.common.api.Video.SCHEMA$);
      if (isValidValue(fields()[0], other.mimes)) {
        this.mimes = data().deepCopy(fields()[0].schema(), other.mimes);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.linearity)) {
        this.linearity = data().deepCopy(fields()[1].schema(), other.linearity);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.minduration)) {
        this.minduration = data().deepCopy(fields()[2].schema(), other.minduration);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.maxduration)) {
        this.maxduration = data().deepCopy(fields()[3].schema(), other.maxduration);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.protocol)) {
        this.protocol = data().deepCopy(fields()[4].schema(), other.protocol);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.w)) {
        this.w = data().deepCopy(fields()[5].schema(), other.w);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.h)) {
        this.h = data().deepCopy(fields()[6].schema(), other.h);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.startdelay)) {
        this.startdelay = data().deepCopy(fields()[7].schema(), other.startdelay);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.sequence)) {
        this.sequence = data().deepCopy(fields()[8].schema(), other.sequence);
        fieldSetFlags()[8] = true;
      }
      if (isValidValue(fields()[9], other.battr)) {
        this.battr = data().deepCopy(fields()[9].schema(), other.battr);
        fieldSetFlags()[9] = true;
      }
      if (isValidValue(fields()[10], other.maxextended)) {
        this.maxextended = data().deepCopy(fields()[10].schema(), other.maxextended);
        fieldSetFlags()[10] = true;
      }
      if (isValidValue(fields()[11], other.minbitrate)) {
        this.minbitrate = data().deepCopy(fields()[11].schema(), other.minbitrate);
        fieldSetFlags()[11] = true;
      }
      if (isValidValue(fields()[12], other.maxbitrate)) {
        this.maxbitrate = data().deepCopy(fields()[12].schema(), other.maxbitrate);
        fieldSetFlags()[12] = true;
      }
      if (isValidValue(fields()[13], other.boxingallowed)) {
        this.boxingallowed = data().deepCopy(fields()[13].schema(), other.boxingallowed);
        fieldSetFlags()[13] = true;
      }
      if (isValidValue(fields()[14], other.playbackmethod)) {
        this.playbackmethod = data().deepCopy(fields()[14].schema(), other.playbackmethod);
        fieldSetFlags()[14] = true;
      }
      if (isValidValue(fields()[15], other.delivery)) {
        this.delivery = data().deepCopy(fields()[15].schema(), other.delivery);
        fieldSetFlags()[15] = true;
      }
      if (isValidValue(fields()[16], other.pos)) {
        this.pos = data().deepCopy(fields()[16].schema(), other.pos);
        fieldSetFlags()[16] = true;
      }
      if (isValidValue(fields()[17], other.companionad)) {
        this.companionad = data().deepCopy(fields()[17].schema(), other.companionad);
        fieldSetFlags()[17] = true;
      }
      if (isValidValue(fields()[18], other.api)) {
        this.api = data().deepCopy(fields()[18].schema(), other.api);
        fieldSetFlags()[18] = true;
      }
      if (isValidValue(fields()[19], other.companiontype)) {
        this.companiontype = data().deepCopy(fields()[19].schema(), other.companiontype);
        fieldSetFlags()[19] = true;
      }
      if (isValidValue(fields()[20], other.ext)) {
        this.ext = data().deepCopy(fields()[20].schema(), other.ext);
        fieldSetFlags()[20] = true;
      }
    }

    /** Gets the value of the 'mimes' field */
    public java.util.List<java.lang.CharSequence> getMimes() {
      return mimes;
    }
    
    /** Sets the value of the 'mimes' field */
    public org.openrtb.common.api.Video.Builder setMimes(java.util.List<java.lang.CharSequence> value) {
      validate(fields()[0], value);
      this.mimes = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'mimes' field has been set */
    public boolean hasMimes() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'mimes' field */
    public org.openrtb.common.api.Video.Builder clearMimes() {
      mimes = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'linearity' field */
    public java.lang.Integer getLinearity() {
      return linearity;
    }
    
    /** Sets the value of the 'linearity' field */
    public org.openrtb.common.api.Video.Builder setLinearity(java.lang.Integer value) {
      validate(fields()[1], value);
      this.linearity = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'linearity' field has been set */
    public boolean hasLinearity() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'linearity' field */
    public org.openrtb.common.api.Video.Builder clearLinearity() {
      linearity = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'minduration' field */
    public java.lang.Integer getMinduration() {
      return minduration;
    }
    
    /** Sets the value of the 'minduration' field */
    public org.openrtb.common.api.Video.Builder setMinduration(java.lang.Integer value) {
      validate(fields()[2], value);
      this.minduration = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'minduration' field has been set */
    public boolean hasMinduration() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'minduration' field */
    public org.openrtb.common.api.Video.Builder clearMinduration() {
      minduration = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /** Gets the value of the 'maxduration' field */
    public java.lang.Integer getMaxduration() {
      return maxduration;
    }
    
    /** Sets the value of the 'maxduration' field */
    public org.openrtb.common.api.Video.Builder setMaxduration(java.lang.Integer value) {
      validate(fields()[3], value);
      this.maxduration = value;
      fieldSetFlags()[3] = true;
      return this; 
    }
    
    /** Checks whether the 'maxduration' field has been set */
    public boolean hasMaxduration() {
      return fieldSetFlags()[3];
    }
    
    /** Clears the value of the 'maxduration' field */
    public org.openrtb.common.api.Video.Builder clearMaxduration() {
      maxduration = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /** Gets the value of the 'protocol' field */
    public java.lang.Integer getProtocol() {
      return protocol;
    }
    
    /** Sets the value of the 'protocol' field */
    public org.openrtb.common.api.Video.Builder setProtocol(java.lang.Integer value) {
      validate(fields()[4], value);
      this.protocol = value;
      fieldSetFlags()[4] = true;
      return this; 
    }
    
    /** Checks whether the 'protocol' field has been set */
    public boolean hasProtocol() {
      return fieldSetFlags()[4];
    }
    
    /** Clears the value of the 'protocol' field */
    public org.openrtb.common.api.Video.Builder clearProtocol() {
      protocol = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /** Gets the value of the 'w' field */
    public java.lang.Integer getW() {
      return w;
    }
    
    /** Sets the value of the 'w' field */
    public org.openrtb.common.api.Video.Builder setW(java.lang.Integer value) {
      validate(fields()[5], value);
      this.w = value;
      fieldSetFlags()[5] = true;
      return this; 
    }
    
    /** Checks whether the 'w' field has been set */
    public boolean hasW() {
      return fieldSetFlags()[5];
    }
    
    /** Clears the value of the 'w' field */
    public org.openrtb.common.api.Video.Builder clearW() {
      w = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    /** Gets the value of the 'h' field */
    public java.lang.Integer getH() {
      return h;
    }
    
    /** Sets the value of the 'h' field */
    public org.openrtb.common.api.Video.Builder setH(java.lang.Integer value) {
      validate(fields()[6], value);
      this.h = value;
      fieldSetFlags()[6] = true;
      return this; 
    }
    
    /** Checks whether the 'h' field has been set */
    public boolean hasH() {
      return fieldSetFlags()[6];
    }
    
    /** Clears the value of the 'h' field */
    public org.openrtb.common.api.Video.Builder clearH() {
      h = null;
      fieldSetFlags()[6] = false;
      return this;
    }

    /** Gets the value of the 'startdelay' field */
    public java.lang.Integer getStartdelay() {
      return startdelay;
    }
    
    /** Sets the value of the 'startdelay' field */
    public org.openrtb.common.api.Video.Builder setStartdelay(java.lang.Integer value) {
      validate(fields()[7], value);
      this.startdelay = value;
      fieldSetFlags()[7] = true;
      return this; 
    }
    
    /** Checks whether the 'startdelay' field has been set */
    public boolean hasStartdelay() {
      return fieldSetFlags()[7];
    }
    
    /** Clears the value of the 'startdelay' field */
    public org.openrtb.common.api.Video.Builder clearStartdelay() {
      startdelay = null;
      fieldSetFlags()[7] = false;
      return this;
    }

    /** Gets the value of the 'sequence' field */
    public java.lang.Integer getSequence() {
      return sequence;
    }
    
    /** Sets the value of the 'sequence' field */
    public org.openrtb.common.api.Video.Builder setSequence(java.lang.Integer value) {
      validate(fields()[8], value);
      this.sequence = value;
      fieldSetFlags()[8] = true;
      return this; 
    }
    
    /** Checks whether the 'sequence' field has been set */
    public boolean hasSequence() {
      return fieldSetFlags()[8];
    }
    
    /** Clears the value of the 'sequence' field */
    public org.openrtb.common.api.Video.Builder clearSequence() {
      sequence = null;
      fieldSetFlags()[8] = false;
      return this;
    }

    /** Gets the value of the 'battr' field */
    public java.util.List<java.lang.Integer> getBattr() {
      return battr;
    }
    
    /** Sets the value of the 'battr' field */
    public org.openrtb.common.api.Video.Builder setBattr(java.util.List<java.lang.Integer> value) {
      validate(fields()[9], value);
      this.battr = value;
      fieldSetFlags()[9] = true;
      return this; 
    }
    
    /** Checks whether the 'battr' field has been set */
    public boolean hasBattr() {
      return fieldSetFlags()[9];
    }
    
    /** Clears the value of the 'battr' field */
    public org.openrtb.common.api.Video.Builder clearBattr() {
      battr = null;
      fieldSetFlags()[9] = false;
      return this;
    }

    /** Gets the value of the 'maxextended' field */
    public java.lang.Integer getMaxextended() {
      return maxextended;
    }
    
    /** Sets the value of the 'maxextended' field */
    public org.openrtb.common.api.Video.Builder setMaxextended(java.lang.Integer value) {
      validate(fields()[10], value);
      this.maxextended = value;
      fieldSetFlags()[10] = true;
      return this; 
    }
    
    /** Checks whether the 'maxextended' field has been set */
    public boolean hasMaxextended() {
      return fieldSetFlags()[10];
    }
    
    /** Clears the value of the 'maxextended' field */
    public org.openrtb.common.api.Video.Builder clearMaxextended() {
      maxextended = null;
      fieldSetFlags()[10] = false;
      return this;
    }

    /** Gets the value of the 'minbitrate' field */
    public java.lang.Integer getMinbitrate() {
      return minbitrate;
    }
    
    /** Sets the value of the 'minbitrate' field */
    public org.openrtb.common.api.Video.Builder setMinbitrate(java.lang.Integer value) {
      validate(fields()[11], value);
      this.minbitrate = value;
      fieldSetFlags()[11] = true;
      return this; 
    }
    
    /** Checks whether the 'minbitrate' field has been set */
    public boolean hasMinbitrate() {
      return fieldSetFlags()[11];
    }
    
    /** Clears the value of the 'minbitrate' field */
    public org.openrtb.common.api.Video.Builder clearMinbitrate() {
      minbitrate = null;
      fieldSetFlags()[11] = false;
      return this;
    }

    /** Gets the value of the 'maxbitrate' field */
    public java.lang.Integer getMaxbitrate() {
      return maxbitrate;
    }
    
    /** Sets the value of the 'maxbitrate' field */
    public org.openrtb.common.api.Video.Builder setMaxbitrate(java.lang.Integer value) {
      validate(fields()[12], value);
      this.maxbitrate = value;
      fieldSetFlags()[12] = true;
      return this; 
    }
    
    /** Checks whether the 'maxbitrate' field has been set */
    public boolean hasMaxbitrate() {
      return fieldSetFlags()[12];
    }
    
    /** Clears the value of the 'maxbitrate' field */
    public org.openrtb.common.api.Video.Builder clearMaxbitrate() {
      maxbitrate = null;
      fieldSetFlags()[12] = false;
      return this;
    }

    /** Gets the value of the 'boxingallowed' field */
    public java.lang.Integer getBoxingallowed() {
      return boxingallowed;
    }
    
    /** Sets the value of the 'boxingallowed' field */
    public org.openrtb.common.api.Video.Builder setBoxingallowed(java.lang.Integer value) {
      validate(fields()[13], value);
      this.boxingallowed = value;
      fieldSetFlags()[13] = true;
      return this; 
    }
    
    /** Checks whether the 'boxingallowed' field has been set */
    public boolean hasBoxingallowed() {
      return fieldSetFlags()[13];
    }
    
    /** Clears the value of the 'boxingallowed' field */
    public org.openrtb.common.api.Video.Builder clearBoxingallowed() {
      boxingallowed = null;
      fieldSetFlags()[13] = false;
      return this;
    }

    /** Gets the value of the 'playbackmethod' field */
    public java.util.List<java.lang.Integer> getPlaybackmethod() {
      return playbackmethod;
    }
    
    /** Sets the value of the 'playbackmethod' field */
    public org.openrtb.common.api.Video.Builder setPlaybackmethod(java.util.List<java.lang.Integer> value) {
      validate(fields()[14], value);
      this.playbackmethod = value;
      fieldSetFlags()[14] = true;
      return this; 
    }
    
    /** Checks whether the 'playbackmethod' field has been set */
    public boolean hasPlaybackmethod() {
      return fieldSetFlags()[14];
    }
    
    /** Clears the value of the 'playbackmethod' field */
    public org.openrtb.common.api.Video.Builder clearPlaybackmethod() {
      playbackmethod = null;
      fieldSetFlags()[14] = false;
      return this;
    }

    /** Gets the value of the 'delivery' field */
    public java.util.List<java.lang.Integer> getDelivery() {
      return delivery;
    }
    
    /** Sets the value of the 'delivery' field */
    public org.openrtb.common.api.Video.Builder setDelivery(java.util.List<java.lang.Integer> value) {
      validate(fields()[15], value);
      this.delivery = value;
      fieldSetFlags()[15] = true;
      return this; 
    }
    
    /** Checks whether the 'delivery' field has been set */
    public boolean hasDelivery() {
      return fieldSetFlags()[15];
    }
    
    /** Clears the value of the 'delivery' field */
    public org.openrtb.common.api.Video.Builder clearDelivery() {
      delivery = null;
      fieldSetFlags()[15] = false;
      return this;
    }

    /** Gets the value of the 'pos' field */
    public java.lang.Integer getPos() {
      return pos;
    }
    
    /** Sets the value of the 'pos' field */
    public org.openrtb.common.api.Video.Builder setPos(java.lang.Integer value) {
      validate(fields()[16], value);
      this.pos = value;
      fieldSetFlags()[16] = true;
      return this; 
    }
    
    /** Checks whether the 'pos' field has been set */
    public boolean hasPos() {
      return fieldSetFlags()[16];
    }
    
    /** Clears the value of the 'pos' field */
    public org.openrtb.common.api.Video.Builder clearPos() {
      pos = null;
      fieldSetFlags()[16] = false;
      return this;
    }

    /** Gets the value of the 'companionad' field */
    public java.util.List<org.openrtb.common.api.Banner> getCompanionad() {
      return companionad;
    }
    
    /** Sets the value of the 'companionad' field */
    public org.openrtb.common.api.Video.Builder setCompanionad(java.util.List<org.openrtb.common.api.Banner> value) {
      validate(fields()[17], value);
      this.companionad = value;
      fieldSetFlags()[17] = true;
      return this; 
    }
    
    /** Checks whether the 'companionad' field has been set */
    public boolean hasCompanionad() {
      return fieldSetFlags()[17];
    }
    
    /** Clears the value of the 'companionad' field */
    public org.openrtb.common.api.Video.Builder clearCompanionad() {
      companionad = null;
      fieldSetFlags()[17] = false;
      return this;
    }

    /** Gets the value of the 'api' field */
    public java.util.List<java.lang.Integer> getApi() {
      return api;
    }
    
    /** Sets the value of the 'api' field */
    public org.openrtb.common.api.Video.Builder setApi(java.util.List<java.lang.Integer> value) {
      validate(fields()[18], value);
      this.api = value;
      fieldSetFlags()[18] = true;
      return this; 
    }
    
    /** Checks whether the 'api' field has been set */
    public boolean hasApi() {
      return fieldSetFlags()[18];
    }
    
    /** Clears the value of the 'api' field */
    public org.openrtb.common.api.Video.Builder clearApi() {
      api = null;
      fieldSetFlags()[18] = false;
      return this;
    }

    /** Gets the value of the 'companiontype' field */
    public java.util.List<java.lang.Integer> getCompaniontype() {
      return companiontype;
    }
    
    /** Sets the value of the 'companiontype' field */
    public org.openrtb.common.api.Video.Builder setCompaniontype(java.util.List<java.lang.Integer> value) {
      validate(fields()[19], value);
      this.companiontype = value;
      fieldSetFlags()[19] = true;
      return this; 
    }
    
    /** Checks whether the 'companiontype' field has been set */
    public boolean hasCompaniontype() {
      return fieldSetFlags()[19];
    }
    
    /** Clears the value of the 'companiontype' field */
    public org.openrtb.common.api.Video.Builder clearCompaniontype() {
      companiontype = null;
      fieldSetFlags()[19] = false;
      return this;
    }

    /** Gets the value of the 'ext' field */
    public java.lang.CharSequence getExt() {
      return ext;
    }
    
    /** Sets the value of the 'ext' field */
    public org.openrtb.common.api.Video.Builder setExt(java.lang.CharSequence value) {
      validate(fields()[20], value);
      this.ext = value;
      fieldSetFlags()[20] = true;
      return this; 
    }
    
    /** Checks whether the 'ext' field has been set */
    public boolean hasExt() {
      return fieldSetFlags()[20];
    }
    
    /** Clears the value of the 'ext' field */
    public org.openrtb.common.api.Video.Builder clearExt() {
      ext = null;
      fieldSetFlags()[20] = false;
      return this;
    }

    @Override
    public Video build() {
      try {
        Video record = new Video();
        record.mimes = fieldSetFlags()[0] ? this.mimes : (java.util.List<java.lang.CharSequence>) defaultValue(fields()[0]);
        record.linearity = fieldSetFlags()[1] ? this.linearity : (java.lang.Integer) defaultValue(fields()[1]);
        record.minduration = fieldSetFlags()[2] ? this.minduration : (java.lang.Integer) defaultValue(fields()[2]);
        record.maxduration = fieldSetFlags()[3] ? this.maxduration : (java.lang.Integer) defaultValue(fields()[3]);
        record.protocol = fieldSetFlags()[4] ? this.protocol : (java.lang.Integer) defaultValue(fields()[4]);
        record.w = fieldSetFlags()[5] ? this.w : (java.lang.Integer) defaultValue(fields()[5]);
        record.h = fieldSetFlags()[6] ? this.h : (java.lang.Integer) defaultValue(fields()[6]);
        record.startdelay = fieldSetFlags()[7] ? this.startdelay : (java.lang.Integer) defaultValue(fields()[7]);
        record.sequence = fieldSetFlags()[8] ? this.sequence : (java.lang.Integer) defaultValue(fields()[8]);
        record.battr = fieldSetFlags()[9] ? this.battr : (java.util.List<java.lang.Integer>) defaultValue(fields()[9]);
        record.maxextended = fieldSetFlags()[10] ? this.maxextended : (java.lang.Integer) defaultValue(fields()[10]);
        record.minbitrate = fieldSetFlags()[11] ? this.minbitrate : (java.lang.Integer) defaultValue(fields()[11]);
        record.maxbitrate = fieldSetFlags()[12] ? this.maxbitrate : (java.lang.Integer) defaultValue(fields()[12]);
        record.boxingallowed = fieldSetFlags()[13] ? this.boxingallowed : (java.lang.Integer) defaultValue(fields()[13]);
        record.playbackmethod = fieldSetFlags()[14] ? this.playbackmethod : (java.util.List<java.lang.Integer>) defaultValue(fields()[14]);
        record.delivery = fieldSetFlags()[15] ? this.delivery : (java.util.List<java.lang.Integer>) defaultValue(fields()[15]);
        record.pos = fieldSetFlags()[16] ? this.pos : (java.lang.Integer) defaultValue(fields()[16]);
        record.companionad = fieldSetFlags()[17] ? this.companionad : (java.util.List<org.openrtb.common.api.Banner>) defaultValue(fields()[17]);
        record.api = fieldSetFlags()[18] ? this.api : (java.util.List<java.lang.Integer>) defaultValue(fields()[18]);
        record.companiontype = fieldSetFlags()[19] ? this.companiontype : (java.util.List<java.lang.Integer>) defaultValue(fields()[19]);
        record.ext = fieldSetFlags()[20] ? this.ext : (java.lang.CharSequence) defaultValue(fields()[20]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
