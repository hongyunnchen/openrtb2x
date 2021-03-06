/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package org.openrtb.common.api;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class Site extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Site\",\"namespace\":\"org.openrtb.common.api\",\"fields\":[{\"name\":\"id\",\"type\":[\"string\",\"null\"]},{\"name\":\"name\",\"type\":[\"string\",\"null\"]},{\"name\":\"domain\",\"type\":[\"string\",\"null\"]},{\"name\":\"cat\",\"type\":[{\"type\":\"array\",\"items\":\"string\"},\"null\"]},{\"name\":\"sectioncat\",\"type\":[{\"type\":\"array\",\"items\":\"string\"},\"null\"]},{\"name\":\"pagecat\",\"type\":[{\"type\":\"array\",\"items\":\"string\"},\"null\"]},{\"name\":\"page\",\"type\":[\"string\",\"null\"]},{\"name\":\"privacypolicy\",\"type\":[\"int\",\"null\"]},{\"name\":\"ref\",\"type\":[\"string\",\"null\"]},{\"name\":\"search\",\"type\":[\"int\",\"null\"]},{\"name\":\"publisher\",\"type\":[{\"type\":\"record\",\"name\":\"Publisher\",\"fields\":[{\"name\":\"id\",\"type\":[\"string\",\"null\"]},{\"name\":\"name\",\"type\":[\"string\",\"null\"]},{\"name\":\"cat\",\"type\":[{\"type\":\"array\",\"items\":\"string\"},\"null\"]},{\"name\":\"domain\",\"type\":[\"string\",\"null\"]},{\"name\":\"ext\",\"type\":[\"string\",\"null\"]}]},\"null\"]},{\"name\":\"content\",\"type\":[{\"type\":\"record\",\"name\":\"Content\",\"fields\":[{\"name\":\"id\",\"type\":[\"string\",\"null\"]},{\"name\":\"episode\",\"type\":[\"int\",\"null\"]},{\"name\":\"title\",\"type\":[\"string\",\"null\"]},{\"name\":\"series\",\"type\":[\"string\",\"null\"]},{\"name\":\"season\",\"type\":[\"string\",\"null\"]},{\"name\":\"url\",\"type\":[\"string\",\"null\"]},{\"name\":\"cat\",\"type\":[{\"type\":\"array\",\"items\":\"string\"},\"null\"]},{\"name\":\"videoquality\",\"type\":[\"int\",\"null\"]},{\"name\":\"keywords\",\"type\":[\"string\",\"null\"]},{\"name\":\"contentrating\",\"type\":[\"string\",\"null\"]},{\"name\":\"userrating\",\"type\":[\"string\",\"null\"]},{\"name\":\"context\",\"type\":[\"string\",\"null\"]},{\"name\":\"livestream\",\"type\":[\"int\",\"null\"]},{\"name\":\"sourcerelationship\",\"type\":[\"int\",\"null\"]},{\"name\":\"producer\",\"type\":[{\"type\":\"record\",\"name\":\"Producer\",\"fields\":[{\"name\":\"id\",\"type\":[\"string\",\"null\"]},{\"name\":\"name\",\"type\":[\"string\",\"null\"]},{\"name\":\"cat\",\"type\":[{\"type\":\"array\",\"items\":\"string\"},\"null\"]},{\"name\":\"domain\",\"type\":[\"string\",\"null\"]},{\"name\":\"ext\",\"type\":[\"string\",\"null\"]}]},\"null\"]},{\"name\":\"len\",\"type\":[\"int\",\"null\"]},{\"name\":\"qagmediarating\",\"type\":[\"int\",\"null\"]},{\"name\":\"embeddable\",\"type\":[\"int\",\"null\"]},{\"name\":\"language\",\"type\":[\"string\",\"null\"]},{\"name\":\"ext\",\"type\":[\"string\",\"null\"]}]},\"null\"]},{\"name\":\"keywords\",\"type\":[\"string\",\"null\"]},{\"name\":\"ext\",\"type\":[\"string\",\"null\"]}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.CharSequence id;
  @Deprecated public java.lang.CharSequence name;
  @Deprecated public java.lang.CharSequence domain;
  @Deprecated public java.util.List<java.lang.CharSequence> cat;
  @Deprecated public java.util.List<java.lang.CharSequence> sectioncat;
  @Deprecated public java.util.List<java.lang.CharSequence> pagecat;
  @Deprecated public java.lang.CharSequence page;
  @Deprecated public java.lang.Integer privacypolicy;
  @Deprecated public java.lang.CharSequence ref;
  @Deprecated public java.lang.Integer search;
  @Deprecated public org.openrtb.common.api.Publisher publisher;
  @Deprecated public org.openrtb.common.api.Content content;
  @Deprecated public java.lang.CharSequence keywords;
  @Deprecated public java.lang.CharSequence ext;

  /**
   * Default constructor.
   */
  public Site() {}

  /**
   * All-args constructor.
   */
  public Site(java.lang.CharSequence id, java.lang.CharSequence name, java.lang.CharSequence domain, java.util.List<java.lang.CharSequence> cat, java.util.List<java.lang.CharSequence> sectioncat, java.util.List<java.lang.CharSequence> pagecat, java.lang.CharSequence page, java.lang.Integer privacypolicy, java.lang.CharSequence ref, java.lang.Integer search, org.openrtb.common.api.Publisher publisher, org.openrtb.common.api.Content content, java.lang.CharSequence keywords, java.lang.CharSequence ext) {
    this.id = id;
    this.name = name;
    this.domain = domain;
    this.cat = cat;
    this.sectioncat = sectioncat;
    this.pagecat = pagecat;
    this.page = page;
    this.privacypolicy = privacypolicy;
    this.ref = ref;
    this.search = search;
    this.publisher = publisher;
    this.content = content;
    this.keywords = keywords;
    this.ext = ext;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return id;
    case 1: return name;
    case 2: return domain;
    case 3: return cat;
    case 4: return sectioncat;
    case 5: return pagecat;
    case 6: return page;
    case 7: return privacypolicy;
    case 8: return ref;
    case 9: return search;
    case 10: return publisher;
    case 11: return content;
    case 12: return keywords;
    case 13: return ext;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: id = (java.lang.CharSequence)value$; break;
    case 1: name = (java.lang.CharSequence)value$; break;
    case 2: domain = (java.lang.CharSequence)value$; break;
    case 3: cat = (java.util.List<java.lang.CharSequence>)value$; break;
    case 4: sectioncat = (java.util.List<java.lang.CharSequence>)value$; break;
    case 5: pagecat = (java.util.List<java.lang.CharSequence>)value$; break;
    case 6: page = (java.lang.CharSequence)value$; break;
    case 7: privacypolicy = (java.lang.Integer)value$; break;
    case 8: ref = (java.lang.CharSequence)value$; break;
    case 9: search = (java.lang.Integer)value$; break;
    case 10: publisher = (org.openrtb.common.api.Publisher)value$; break;
    case 11: content = (org.openrtb.common.api.Content)value$; break;
    case 12: keywords = (java.lang.CharSequence)value$; break;
    case 13: ext = (java.lang.CharSequence)value$; break;
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
   * Gets the value of the 'domain' field.
   */
  public java.lang.CharSequence getDomain() {
    return domain;
  }

  /**
   * Sets the value of the 'domain' field.
   * @param value the value to set.
   */
  public void setDomain(java.lang.CharSequence value) {
    this.domain = value;
  }

  /**
   * Gets the value of the 'cat' field.
   */
  public java.util.List<java.lang.CharSequence> getCat() {
    return cat;
  }

  /**
   * Sets the value of the 'cat' field.
   * @param value the value to set.
   */
  public void setCat(java.util.List<java.lang.CharSequence> value) {
    this.cat = value;
  }

  /**
   * Gets the value of the 'sectioncat' field.
   */
  public java.util.List<java.lang.CharSequence> getSectioncat() {
    return sectioncat;
  }

  /**
   * Sets the value of the 'sectioncat' field.
   * @param value the value to set.
   */
  public void setSectioncat(java.util.List<java.lang.CharSequence> value) {
    this.sectioncat = value;
  }

  /**
   * Gets the value of the 'pagecat' field.
   */
  public java.util.List<java.lang.CharSequence> getPagecat() {
    return pagecat;
  }

  /**
   * Sets the value of the 'pagecat' field.
   * @param value the value to set.
   */
  public void setPagecat(java.util.List<java.lang.CharSequence> value) {
    this.pagecat = value;
  }

  /**
   * Gets the value of the 'page' field.
   */
  public java.lang.CharSequence getPage() {
    return page;
  }

  /**
   * Sets the value of the 'page' field.
   * @param value the value to set.
   */
  public void setPage(java.lang.CharSequence value) {
    this.page = value;
  }

  /**
   * Gets the value of the 'privacypolicy' field.
   */
  public java.lang.Integer getPrivacypolicy() {
    return privacypolicy;
  }

  /**
   * Sets the value of the 'privacypolicy' field.
   * @param value the value to set.
   */
  public void setPrivacypolicy(java.lang.Integer value) {
    this.privacypolicy = value;
  }

  /**
   * Gets the value of the 'ref' field.
   */
  public java.lang.CharSequence getRef() {
    return ref;
  }

  /**
   * Sets the value of the 'ref' field.
   * @param value the value to set.
   */
  public void setRef(java.lang.CharSequence value) {
    this.ref = value;
  }

  /**
   * Gets the value of the 'search' field.
   */
  public java.lang.Integer getSearch() {
    return search;
  }

  /**
   * Sets the value of the 'search' field.
   * @param value the value to set.
   */
  public void setSearch(java.lang.Integer value) {
    this.search = value;
  }

  /**
   * Gets the value of the 'publisher' field.
   */
  public org.openrtb.common.api.Publisher getPublisher() {
    return publisher;
  }

  /**
   * Sets the value of the 'publisher' field.
   * @param value the value to set.
   */
  public void setPublisher(org.openrtb.common.api.Publisher value) {
    this.publisher = value;
  }

  /**
   * Gets the value of the 'content' field.
   */
  public org.openrtb.common.api.Content getContent() {
    return content;
  }

  /**
   * Sets the value of the 'content' field.
   * @param value the value to set.
   */
  public void setContent(org.openrtb.common.api.Content value) {
    this.content = value;
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

  /** Creates a new Site RecordBuilder */
  public static org.openrtb.common.api.Site.Builder newBuilder() {
    return new org.openrtb.common.api.Site.Builder();
  }
  
  /** Creates a new Site RecordBuilder by copying an existing Builder */
  public static org.openrtb.common.api.Site.Builder newBuilder(org.openrtb.common.api.Site.Builder other) {
    return new org.openrtb.common.api.Site.Builder(other);
  }
  
  /** Creates a new Site RecordBuilder by copying an existing Site instance */
  public static org.openrtb.common.api.Site.Builder newBuilder(org.openrtb.common.api.Site other) {
    return new org.openrtb.common.api.Site.Builder(other);
  }
  
  /**
   * RecordBuilder for Site instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Site>
    implements org.apache.avro.data.RecordBuilder<Site> {

    private java.lang.CharSequence id;
    private java.lang.CharSequence name;
    private java.lang.CharSequence domain;
    private java.util.List<java.lang.CharSequence> cat;
    private java.util.List<java.lang.CharSequence> sectioncat;
    private java.util.List<java.lang.CharSequence> pagecat;
    private java.lang.CharSequence page;
    private java.lang.Integer privacypolicy;
    private java.lang.CharSequence ref;
    private java.lang.Integer search;
    private org.openrtb.common.api.Publisher publisher;
    private org.openrtb.common.api.Content content;
    private java.lang.CharSequence keywords;
    private java.lang.CharSequence ext;

    /** Creates a new Builder */
    private Builder() {
      super(org.openrtb.common.api.Site.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(org.openrtb.common.api.Site.Builder other) {
      super(other);
    }
    
    /** Creates a Builder by copying an existing Site instance */
    private Builder(org.openrtb.common.api.Site other) {
            super(org.openrtb.common.api.Site.SCHEMA$);
      if (isValidValue(fields()[0], other.id)) {
        this.id = data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.name)) {
        this.name = data().deepCopy(fields()[1].schema(), other.name);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.domain)) {
        this.domain = data().deepCopy(fields()[2].schema(), other.domain);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.cat)) {
        this.cat = data().deepCopy(fields()[3].schema(), other.cat);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.sectioncat)) {
        this.sectioncat = data().deepCopy(fields()[4].schema(), other.sectioncat);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.pagecat)) {
        this.pagecat = data().deepCopy(fields()[5].schema(), other.pagecat);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.page)) {
        this.page = data().deepCopy(fields()[6].schema(), other.page);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.privacypolicy)) {
        this.privacypolicy = data().deepCopy(fields()[7].schema(), other.privacypolicy);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.ref)) {
        this.ref = data().deepCopy(fields()[8].schema(), other.ref);
        fieldSetFlags()[8] = true;
      }
      if (isValidValue(fields()[9], other.search)) {
        this.search = data().deepCopy(fields()[9].schema(), other.search);
        fieldSetFlags()[9] = true;
      }
      if (isValidValue(fields()[10], other.publisher)) {
        this.publisher = data().deepCopy(fields()[10].schema(), other.publisher);
        fieldSetFlags()[10] = true;
      }
      if (isValidValue(fields()[11], other.content)) {
        this.content = data().deepCopy(fields()[11].schema(), other.content);
        fieldSetFlags()[11] = true;
      }
      if (isValidValue(fields()[12], other.keywords)) {
        this.keywords = data().deepCopy(fields()[12].schema(), other.keywords);
        fieldSetFlags()[12] = true;
      }
      if (isValidValue(fields()[13], other.ext)) {
        this.ext = data().deepCopy(fields()[13].schema(), other.ext);
        fieldSetFlags()[13] = true;
      }
    }

    /** Gets the value of the 'id' field */
    public java.lang.CharSequence getId() {
      return id;
    }
    
    /** Sets the value of the 'id' field */
    public org.openrtb.common.api.Site.Builder setId(java.lang.CharSequence value) {
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
    public org.openrtb.common.api.Site.Builder clearId() {
      id = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'name' field */
    public java.lang.CharSequence getName() {
      return name;
    }
    
    /** Sets the value of the 'name' field */
    public org.openrtb.common.api.Site.Builder setName(java.lang.CharSequence value) {
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
    public org.openrtb.common.api.Site.Builder clearName() {
      name = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'domain' field */
    public java.lang.CharSequence getDomain() {
      return domain;
    }
    
    /** Sets the value of the 'domain' field */
    public org.openrtb.common.api.Site.Builder setDomain(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.domain = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'domain' field has been set */
    public boolean hasDomain() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'domain' field */
    public org.openrtb.common.api.Site.Builder clearDomain() {
      domain = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /** Gets the value of the 'cat' field */
    public java.util.List<java.lang.CharSequence> getCat() {
      return cat;
    }
    
    /** Sets the value of the 'cat' field */
    public org.openrtb.common.api.Site.Builder setCat(java.util.List<java.lang.CharSequence> value) {
      validate(fields()[3], value);
      this.cat = value;
      fieldSetFlags()[3] = true;
      return this; 
    }
    
    /** Checks whether the 'cat' field has been set */
    public boolean hasCat() {
      return fieldSetFlags()[3];
    }
    
    /** Clears the value of the 'cat' field */
    public org.openrtb.common.api.Site.Builder clearCat() {
      cat = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /** Gets the value of the 'sectioncat' field */
    public java.util.List<java.lang.CharSequence> getSectioncat() {
      return sectioncat;
    }
    
    /** Sets the value of the 'sectioncat' field */
    public org.openrtb.common.api.Site.Builder setSectioncat(java.util.List<java.lang.CharSequence> value) {
      validate(fields()[4], value);
      this.sectioncat = value;
      fieldSetFlags()[4] = true;
      return this; 
    }
    
    /** Checks whether the 'sectioncat' field has been set */
    public boolean hasSectioncat() {
      return fieldSetFlags()[4];
    }
    
    /** Clears the value of the 'sectioncat' field */
    public org.openrtb.common.api.Site.Builder clearSectioncat() {
      sectioncat = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /** Gets the value of the 'pagecat' field */
    public java.util.List<java.lang.CharSequence> getPagecat() {
      return pagecat;
    }
    
    /** Sets the value of the 'pagecat' field */
    public org.openrtb.common.api.Site.Builder setPagecat(java.util.List<java.lang.CharSequence> value) {
      validate(fields()[5], value);
      this.pagecat = value;
      fieldSetFlags()[5] = true;
      return this; 
    }
    
    /** Checks whether the 'pagecat' field has been set */
    public boolean hasPagecat() {
      return fieldSetFlags()[5];
    }
    
    /** Clears the value of the 'pagecat' field */
    public org.openrtb.common.api.Site.Builder clearPagecat() {
      pagecat = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    /** Gets the value of the 'page' field */
    public java.lang.CharSequence getPage() {
      return page;
    }
    
    /** Sets the value of the 'page' field */
    public org.openrtb.common.api.Site.Builder setPage(java.lang.CharSequence value) {
      validate(fields()[6], value);
      this.page = value;
      fieldSetFlags()[6] = true;
      return this; 
    }
    
    /** Checks whether the 'page' field has been set */
    public boolean hasPage() {
      return fieldSetFlags()[6];
    }
    
    /** Clears the value of the 'page' field */
    public org.openrtb.common.api.Site.Builder clearPage() {
      page = null;
      fieldSetFlags()[6] = false;
      return this;
    }

    /** Gets the value of the 'privacypolicy' field */
    public java.lang.Integer getPrivacypolicy() {
      return privacypolicy;
    }
    
    /** Sets the value of the 'privacypolicy' field */
    public org.openrtb.common.api.Site.Builder setPrivacypolicy(java.lang.Integer value) {
      validate(fields()[7], value);
      this.privacypolicy = value;
      fieldSetFlags()[7] = true;
      return this; 
    }
    
    /** Checks whether the 'privacypolicy' field has been set */
    public boolean hasPrivacypolicy() {
      return fieldSetFlags()[7];
    }
    
    /** Clears the value of the 'privacypolicy' field */
    public org.openrtb.common.api.Site.Builder clearPrivacypolicy() {
      privacypolicy = null;
      fieldSetFlags()[7] = false;
      return this;
    }

    /** Gets the value of the 'ref' field */
    public java.lang.CharSequence getRef() {
      return ref;
    }
    
    /** Sets the value of the 'ref' field */
    public org.openrtb.common.api.Site.Builder setRef(java.lang.CharSequence value) {
      validate(fields()[8], value);
      this.ref = value;
      fieldSetFlags()[8] = true;
      return this; 
    }
    
    /** Checks whether the 'ref' field has been set */
    public boolean hasRef() {
      return fieldSetFlags()[8];
    }
    
    /** Clears the value of the 'ref' field */
    public org.openrtb.common.api.Site.Builder clearRef() {
      ref = null;
      fieldSetFlags()[8] = false;
      return this;
    }

    /** Gets the value of the 'search' field */
    public java.lang.Integer getSearch() {
      return search;
    }
    
    /** Sets the value of the 'search' field */
    public org.openrtb.common.api.Site.Builder setSearch(java.lang.Integer value) {
      validate(fields()[9], value);
      this.search = value;
      fieldSetFlags()[9] = true;
      return this; 
    }
    
    /** Checks whether the 'search' field has been set */
    public boolean hasSearch() {
      return fieldSetFlags()[9];
    }
    
    /** Clears the value of the 'search' field */
    public org.openrtb.common.api.Site.Builder clearSearch() {
      search = null;
      fieldSetFlags()[9] = false;
      return this;
    }

    /** Gets the value of the 'publisher' field */
    public org.openrtb.common.api.Publisher getPublisher() {
      return publisher;
    }
    
    /** Sets the value of the 'publisher' field */
    public org.openrtb.common.api.Site.Builder setPublisher(org.openrtb.common.api.Publisher value) {
      validate(fields()[10], value);
      this.publisher = value;
      fieldSetFlags()[10] = true;
      return this; 
    }
    
    /** Checks whether the 'publisher' field has been set */
    public boolean hasPublisher() {
      return fieldSetFlags()[10];
    }
    
    /** Clears the value of the 'publisher' field */
    public org.openrtb.common.api.Site.Builder clearPublisher() {
      publisher = null;
      fieldSetFlags()[10] = false;
      return this;
    }

    /** Gets the value of the 'content' field */
    public org.openrtb.common.api.Content getContent() {
      return content;
    }
    
    /** Sets the value of the 'content' field */
    public org.openrtb.common.api.Site.Builder setContent(org.openrtb.common.api.Content value) {
      validate(fields()[11], value);
      this.content = value;
      fieldSetFlags()[11] = true;
      return this; 
    }
    
    /** Checks whether the 'content' field has been set */
    public boolean hasContent() {
      return fieldSetFlags()[11];
    }
    
    /** Clears the value of the 'content' field */
    public org.openrtb.common.api.Site.Builder clearContent() {
      content = null;
      fieldSetFlags()[11] = false;
      return this;
    }

    /** Gets the value of the 'keywords' field */
    public java.lang.CharSequence getKeywords() {
      return keywords;
    }
    
    /** Sets the value of the 'keywords' field */
    public org.openrtb.common.api.Site.Builder setKeywords(java.lang.CharSequence value) {
      validate(fields()[12], value);
      this.keywords = value;
      fieldSetFlags()[12] = true;
      return this; 
    }
    
    /** Checks whether the 'keywords' field has been set */
    public boolean hasKeywords() {
      return fieldSetFlags()[12];
    }
    
    /** Clears the value of the 'keywords' field */
    public org.openrtb.common.api.Site.Builder clearKeywords() {
      keywords = null;
      fieldSetFlags()[12] = false;
      return this;
    }

    /** Gets the value of the 'ext' field */
    public java.lang.CharSequence getExt() {
      return ext;
    }
    
    /** Sets the value of the 'ext' field */
    public org.openrtb.common.api.Site.Builder setExt(java.lang.CharSequence value) {
      validate(fields()[13], value);
      this.ext = value;
      fieldSetFlags()[13] = true;
      return this; 
    }
    
    /** Checks whether the 'ext' field has been set */
    public boolean hasExt() {
      return fieldSetFlags()[13];
    }
    
    /** Clears the value of the 'ext' field */
    public org.openrtb.common.api.Site.Builder clearExt() {
      ext = null;
      fieldSetFlags()[13] = false;
      return this;
    }

    @Override
    public Site build() {
      try {
        Site record = new Site();
        record.id = fieldSetFlags()[0] ? this.id : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.name = fieldSetFlags()[1] ? this.name : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.domain = fieldSetFlags()[2] ? this.domain : (java.lang.CharSequence) defaultValue(fields()[2]);
        record.cat = fieldSetFlags()[3] ? this.cat : (java.util.List<java.lang.CharSequence>) defaultValue(fields()[3]);
        record.sectioncat = fieldSetFlags()[4] ? this.sectioncat : (java.util.List<java.lang.CharSequence>) defaultValue(fields()[4]);
        record.pagecat = fieldSetFlags()[5] ? this.pagecat : (java.util.List<java.lang.CharSequence>) defaultValue(fields()[5]);
        record.page = fieldSetFlags()[6] ? this.page : (java.lang.CharSequence) defaultValue(fields()[6]);
        record.privacypolicy = fieldSetFlags()[7] ? this.privacypolicy : (java.lang.Integer) defaultValue(fields()[7]);
        record.ref = fieldSetFlags()[8] ? this.ref : (java.lang.CharSequence) defaultValue(fields()[8]);
        record.search = fieldSetFlags()[9] ? this.search : (java.lang.Integer) defaultValue(fields()[9]);
        record.publisher = fieldSetFlags()[10] ? this.publisher : (org.openrtb.common.api.Publisher) defaultValue(fields()[10]);
        record.content = fieldSetFlags()[11] ? this.content : (org.openrtb.common.api.Content) defaultValue(fields()[11]);
        record.keywords = fieldSetFlags()[12] ? this.keywords : (java.lang.CharSequence) defaultValue(fields()[12]);
        record.ext = fieldSetFlags()[13] ? this.ext : (java.lang.CharSequence) defaultValue(fields()[13]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
