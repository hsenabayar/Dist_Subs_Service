// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: subscriber.proto
// Protobuf Java Version: 4.28.3

package subscriber;

public final class SubscriberOuterClass {
  private SubscriberOuterClass() {}
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 28,
      /* patch= */ 3,
      /* suffix= */ "",
      SubscriberOuterClass.class.getName());
  }
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface SubscriberOrBuilder extends
      // @@protoc_insertion_point(interface_extends:subscriber.Subscriber)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 id = 1;</code>
     * @return The id.
     */
    int getId();

    /**
     * <code>string name_surname = 2;</code>
     * @return The nameSurname.
     */
    java.lang.String getNameSurname();
    /**
     * <code>string name_surname = 2;</code>
     * @return The bytes for nameSurname.
     */
    com.google.protobuf.ByteString
        getNameSurnameBytes();

    /**
     * <code>int64 start_date = 3;</code>
     * @return The startDate.
     */
    long getStartDate();

    /**
     * <code>int64 last_accessed = 4;</code>
     * @return The lastAccessed.
     */
    long getLastAccessed();

    /**
     * <code>repeated string interests = 5;</code>
     * @return A list containing the interests.
     */
    java.util.List<java.lang.String>
        getInterestsList();
    /**
     * <code>repeated string interests = 5;</code>
     * @return The count of interests.
     */
    int getInterestsCount();
    /**
     * <code>repeated string interests = 5;</code>
     * @param index The index of the element to return.
     * @return The interests at the given index.
     */
    java.lang.String getInterests(int index);
    /**
     * <code>repeated string interests = 5;</code>
     * @param index The index of the value to return.
     * @return The bytes of the interests at the given index.
     */
    com.google.protobuf.ByteString
        getInterestsBytes(int index);

    /**
     * <code>bool isOnline = 6;</code>
     * @return The isOnline.
     */
    boolean getIsOnline();
  }
  /**
   * Protobuf type {@code subscriber.Subscriber}
   */
  public static final class Subscriber extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:subscriber.Subscriber)
      SubscriberOrBuilder {
  private static final long serialVersionUID = 0L;
    static {
      com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
        com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
        /* major= */ 4,
        /* minor= */ 28,
        /* patch= */ 3,
        /* suffix= */ "",
        Subscriber.class.getName());
    }
    // Use Subscriber.newBuilder() to construct.
    private Subscriber(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
    }
    private Subscriber() {
      nameSurname_ = "";
      interests_ =
          com.google.protobuf.LazyStringArrayList.emptyList();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return subscriber.SubscriberOuterClass.internal_static_subscriber_Subscriber_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return subscriber.SubscriberOuterClass.internal_static_subscriber_Subscriber_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              subscriber.SubscriberOuterClass.Subscriber.class, subscriber.SubscriberOuterClass.Subscriber.Builder.class);
    }

    public static final int ID_FIELD_NUMBER = 1;
    private int id_ = 0;
    /**
     * <code>int32 id = 1;</code>
     * @return The id.
     */
    @java.lang.Override
    public int getId() {
      return id_;
    }

    public static final int NAME_SURNAME_FIELD_NUMBER = 2;
    @SuppressWarnings("serial")
    private volatile java.lang.Object nameSurname_ = "";
    /**
     * <code>string name_surname = 2;</code>
     * @return The nameSurname.
     */
    @java.lang.Override
    public java.lang.String getNameSurname() {
      java.lang.Object ref = nameSurname_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        nameSurname_ = s;
        return s;
      }
    }
    /**
     * <code>string name_surname = 2;</code>
     * @return The bytes for nameSurname.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getNameSurnameBytes() {
      java.lang.Object ref = nameSurname_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        nameSurname_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int START_DATE_FIELD_NUMBER = 3;
    private long startDate_ = 0L;
    /**
     * <code>int64 start_date = 3;</code>
     * @return The startDate.
     */
    @java.lang.Override
    public long getStartDate() {
      return startDate_;
    }

    public static final int LAST_ACCESSED_FIELD_NUMBER = 4;
    private long lastAccessed_ = 0L;
    /**
     * <code>int64 last_accessed = 4;</code>
     * @return The lastAccessed.
     */
    @java.lang.Override
    public long getLastAccessed() {
      return lastAccessed_;
    }

    public static final int INTERESTS_FIELD_NUMBER = 5;
    @SuppressWarnings("serial")
    private com.google.protobuf.LazyStringArrayList interests_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
    /**
     * <code>repeated string interests = 5;</code>
     * @return A list containing the interests.
     */
    public com.google.protobuf.ProtocolStringList
        getInterestsList() {
      return interests_;
    }
    /**
     * <code>repeated string interests = 5;</code>
     * @return The count of interests.
     */
    public int getInterestsCount() {
      return interests_.size();
    }
    /**
     * <code>repeated string interests = 5;</code>
     * @param index The index of the element to return.
     * @return The interests at the given index.
     */
    public java.lang.String getInterests(int index) {
      return interests_.get(index);
    }
    /**
     * <code>repeated string interests = 5;</code>
     * @param index The index of the value to return.
     * @return The bytes of the interests at the given index.
     */
    public com.google.protobuf.ByteString
        getInterestsBytes(int index) {
      return interests_.getByteString(index);
    }

    public static final int ISONLINE_FIELD_NUMBER = 6;
    private boolean isOnline_ = false;
    /**
     * <code>bool isOnline = 6;</code>
     * @return The isOnline.
     */
    @java.lang.Override
    public boolean getIsOnline() {
      return isOnline_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (id_ != 0) {
        output.writeInt32(1, id_);
      }
      if (!com.google.protobuf.GeneratedMessage.isStringEmpty(nameSurname_)) {
        com.google.protobuf.GeneratedMessage.writeString(output, 2, nameSurname_);
      }
      if (startDate_ != 0L) {
        output.writeInt64(3, startDate_);
      }
      if (lastAccessed_ != 0L) {
        output.writeInt64(4, lastAccessed_);
      }
      for (int i = 0; i < interests_.size(); i++) {
        com.google.protobuf.GeneratedMessage.writeString(output, 5, interests_.getRaw(i));
      }
      if (isOnline_ != false) {
        output.writeBool(6, isOnline_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (id_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, id_);
      }
      if (!com.google.protobuf.GeneratedMessage.isStringEmpty(nameSurname_)) {
        size += com.google.protobuf.GeneratedMessage.computeStringSize(2, nameSurname_);
      }
      if (startDate_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(3, startDate_);
      }
      if (lastAccessed_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(4, lastAccessed_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < interests_.size(); i++) {
          dataSize += computeStringSizeNoTag(interests_.getRaw(i));
        }
        size += dataSize;
        size += 1 * getInterestsList().size();
      }
      if (isOnline_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(6, isOnline_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof subscriber.SubscriberOuterClass.Subscriber)) {
        return super.equals(obj);
      }
      subscriber.SubscriberOuterClass.Subscriber other = (subscriber.SubscriberOuterClass.Subscriber) obj;

      if (getId()
          != other.getId()) return false;
      if (!getNameSurname()
          .equals(other.getNameSurname())) return false;
      if (getStartDate()
          != other.getStartDate()) return false;
      if (getLastAccessed()
          != other.getLastAccessed()) return false;
      if (!getInterestsList()
          .equals(other.getInterestsList())) return false;
      if (getIsOnline()
          != other.getIsOnline()) return false;
      if (!getUnknownFields().equals(other.getUnknownFields())) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + ID_FIELD_NUMBER;
      hash = (53 * hash) + getId();
      hash = (37 * hash) + NAME_SURNAME_FIELD_NUMBER;
      hash = (53 * hash) + getNameSurname().hashCode();
      hash = (37 * hash) + START_DATE_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getStartDate());
      hash = (37 * hash) + LAST_ACCESSED_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getLastAccessed());
      if (getInterestsCount() > 0) {
        hash = (37 * hash) + INTERESTS_FIELD_NUMBER;
        hash = (53 * hash) + getInterestsList().hashCode();
      }
      hash = (37 * hash) + ISONLINE_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsOnline());
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static subscriber.SubscriberOuterClass.Subscriber parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static subscriber.SubscriberOuterClass.Subscriber parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static subscriber.SubscriberOuterClass.Subscriber parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static subscriber.SubscriberOuterClass.Subscriber parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static subscriber.SubscriberOuterClass.Subscriber parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static subscriber.SubscriberOuterClass.Subscriber parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static subscriber.SubscriberOuterClass.Subscriber parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input);
    }
    public static subscriber.SubscriberOuterClass.Subscriber parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static subscriber.SubscriberOuterClass.Subscriber parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static subscriber.SubscriberOuterClass.Subscriber parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static subscriber.SubscriberOuterClass.Subscriber parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input);
    }
    public static subscriber.SubscriberOuterClass.Subscriber parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(subscriber.SubscriberOuterClass.Subscriber prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code subscriber.Subscriber}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:subscriber.Subscriber)
        subscriber.SubscriberOuterClass.SubscriberOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return subscriber.SubscriberOuterClass.internal_static_subscriber_Subscriber_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return subscriber.SubscriberOuterClass.internal_static_subscriber_Subscriber_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                subscriber.SubscriberOuterClass.Subscriber.class, subscriber.SubscriberOuterClass.Subscriber.Builder.class);
      }

      // Construct using subscriber.SubscriberOuterClass.Subscriber.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        bitField0_ = 0;
        id_ = 0;
        nameSurname_ = "";
        startDate_ = 0L;
        lastAccessed_ = 0L;
        interests_ =
            com.google.protobuf.LazyStringArrayList.emptyList();
        isOnline_ = false;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return subscriber.SubscriberOuterClass.internal_static_subscriber_Subscriber_descriptor;
      }

      @java.lang.Override
      public subscriber.SubscriberOuterClass.Subscriber getDefaultInstanceForType() {
        return subscriber.SubscriberOuterClass.Subscriber.getDefaultInstance();
      }

      @java.lang.Override
      public subscriber.SubscriberOuterClass.Subscriber build() {
        subscriber.SubscriberOuterClass.Subscriber result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public subscriber.SubscriberOuterClass.Subscriber buildPartial() {
        subscriber.SubscriberOuterClass.Subscriber result = new subscriber.SubscriberOuterClass.Subscriber(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(subscriber.SubscriberOuterClass.Subscriber result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.id_ = id_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.nameSurname_ = nameSurname_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.startDate_ = startDate_;
        }
        if (((from_bitField0_ & 0x00000008) != 0)) {
          result.lastAccessed_ = lastAccessed_;
        }
        if (((from_bitField0_ & 0x00000010) != 0)) {
          interests_.makeImmutable();
          result.interests_ = interests_;
        }
        if (((from_bitField0_ & 0x00000020) != 0)) {
          result.isOnline_ = isOnline_;
        }
      }

      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof subscriber.SubscriberOuterClass.Subscriber) {
          return mergeFrom((subscriber.SubscriberOuterClass.Subscriber)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(subscriber.SubscriberOuterClass.Subscriber other) {
        if (other == subscriber.SubscriberOuterClass.Subscriber.getDefaultInstance()) return this;
        if (other.getId() != 0) {
          setId(other.getId());
        }
        if (!other.getNameSurname().isEmpty()) {
          nameSurname_ = other.nameSurname_;
          bitField0_ |= 0x00000002;
          onChanged();
        }
        if (other.getStartDate() != 0L) {
          setStartDate(other.getStartDate());
        }
        if (other.getLastAccessed() != 0L) {
          setLastAccessed(other.getLastAccessed());
        }
        if (!other.interests_.isEmpty()) {
          if (interests_.isEmpty()) {
            interests_ = other.interests_;
            bitField0_ |= 0x00000010;
          } else {
            ensureInterestsIsMutable();
            interests_.addAll(other.interests_);
          }
          onChanged();
        }
        if (other.getIsOnline() != false) {
          setIsOnline(other.getIsOnline());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        if (extensionRegistry == null) {
          throw new java.lang.NullPointerException();
        }
        try {
          boolean done = false;
          while (!done) {
            int tag = input.readTag();
            switch (tag) {
              case 0:
                done = true;
                break;
              case 8: {
                id_ = input.readInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
              case 18: {
                nameSurname_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
                break;
              } // case 18
              case 24: {
                startDate_ = input.readInt64();
                bitField0_ |= 0x00000004;
                break;
              } // case 24
              case 32: {
                lastAccessed_ = input.readInt64();
                bitField0_ |= 0x00000008;
                break;
              } // case 32
              case 42: {
                java.lang.String s = input.readStringRequireUtf8();
                ensureInterestsIsMutable();
                interests_.add(s);
                break;
              } // case 42
              case 48: {
                isOnline_ = input.readBool();
                bitField0_ |= 0x00000020;
                break;
              } // case 48
              default: {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
            } // switch (tag)
          } // while (!done)
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.unwrapIOException();
        } finally {
          onChanged();
        } // finally
        return this;
      }
      private int bitField0_;

      private int id_ ;
      /**
       * <code>int32 id = 1;</code>
       * @return The id.
       */
      @java.lang.Override
      public int getId() {
        return id_;
      }
      /**
       * <code>int32 id = 1;</code>
       * @param value The id to set.
       * @return This builder for chaining.
       */
      public Builder setId(int value) {

        id_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>int32 id = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        id_ = 0;
        onChanged();
        return this;
      }

      private java.lang.Object nameSurname_ = "";
      /**
       * <code>string name_surname = 2;</code>
       * @return The nameSurname.
       */
      public java.lang.String getNameSurname() {
        java.lang.Object ref = nameSurname_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          nameSurname_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string name_surname = 2;</code>
       * @return The bytes for nameSurname.
       */
      public com.google.protobuf.ByteString
          getNameSurnameBytes() {
        java.lang.Object ref = nameSurname_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          nameSurname_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string name_surname = 2;</code>
       * @param value The nameSurname to set.
       * @return This builder for chaining.
       */
      public Builder setNameSurname(
          java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        nameSurname_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>string name_surname = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearNameSurname() {
        nameSurname_ = getDefaultInstance().getNameSurname();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
        return this;
      }
      /**
       * <code>string name_surname = 2;</code>
       * @param value The bytes for nameSurname to set.
       * @return This builder for chaining.
       */
      public Builder setNameSurnameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        checkByteStringIsUtf8(value);
        nameSurname_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }

      private long startDate_ ;
      /**
       * <code>int64 start_date = 3;</code>
       * @return The startDate.
       */
      @java.lang.Override
      public long getStartDate() {
        return startDate_;
      }
      /**
       * <code>int64 start_date = 3;</code>
       * @param value The startDate to set.
       * @return This builder for chaining.
       */
      public Builder setStartDate(long value) {

        startDate_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>int64 start_date = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearStartDate() {
        bitField0_ = (bitField0_ & ~0x00000004);
        startDate_ = 0L;
        onChanged();
        return this;
      }

      private long lastAccessed_ ;
      /**
       * <code>int64 last_accessed = 4;</code>
       * @return The lastAccessed.
       */
      @java.lang.Override
      public long getLastAccessed() {
        return lastAccessed_;
      }
      /**
       * <code>int64 last_accessed = 4;</code>
       * @param value The lastAccessed to set.
       * @return This builder for chaining.
       */
      public Builder setLastAccessed(long value) {

        lastAccessed_ = value;
        bitField0_ |= 0x00000008;
        onChanged();
        return this;
      }
      /**
       * <code>int64 last_accessed = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearLastAccessed() {
        bitField0_ = (bitField0_ & ~0x00000008);
        lastAccessed_ = 0L;
        onChanged();
        return this;
      }

      private com.google.protobuf.LazyStringArrayList interests_ =
          com.google.protobuf.LazyStringArrayList.emptyList();
      private void ensureInterestsIsMutable() {
        if (!interests_.isModifiable()) {
          interests_ = new com.google.protobuf.LazyStringArrayList(interests_);
        }
        bitField0_ |= 0x00000010;
      }
      /**
       * <code>repeated string interests = 5;</code>
       * @return A list containing the interests.
       */
      public com.google.protobuf.ProtocolStringList
          getInterestsList() {
        interests_.makeImmutable();
        return interests_;
      }
      /**
       * <code>repeated string interests = 5;</code>
       * @return The count of interests.
       */
      public int getInterestsCount() {
        return interests_.size();
      }
      /**
       * <code>repeated string interests = 5;</code>
       * @param index The index of the element to return.
       * @return The interests at the given index.
       */
      public java.lang.String getInterests(int index) {
        return interests_.get(index);
      }
      /**
       * <code>repeated string interests = 5;</code>
       * @param index The index of the value to return.
       * @return The bytes of the interests at the given index.
       */
      public com.google.protobuf.ByteString
          getInterestsBytes(int index) {
        return interests_.getByteString(index);
      }
      /**
       * <code>repeated string interests = 5;</code>
       * @param index The index to set the value at.
       * @param value The interests to set.
       * @return This builder for chaining.
       */
      public Builder setInterests(
          int index, java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        ensureInterestsIsMutable();
        interests_.set(index, value);
        bitField0_ |= 0x00000010;
        onChanged();
        return this;
      }
      /**
       * <code>repeated string interests = 5;</code>
       * @param value The interests to add.
       * @return This builder for chaining.
       */
      public Builder addInterests(
          java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        ensureInterestsIsMutable();
        interests_.add(value);
        bitField0_ |= 0x00000010;
        onChanged();
        return this;
      }
      /**
       * <code>repeated string interests = 5;</code>
       * @param values The interests to add.
       * @return This builder for chaining.
       */
      public Builder addAllInterests(
          java.lang.Iterable<java.lang.String> values) {
        ensureInterestsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, interests_);
        bitField0_ |= 0x00000010;
        onChanged();
        return this;
      }
      /**
       * <code>repeated string interests = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearInterests() {
        interests_ =
          com.google.protobuf.LazyStringArrayList.emptyList();
        bitField0_ = (bitField0_ & ~0x00000010);;
        onChanged();
        return this;
      }
      /**
       * <code>repeated string interests = 5;</code>
       * @param value The bytes of the interests to add.
       * @return This builder for chaining.
       */
      public Builder addInterestsBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        checkByteStringIsUtf8(value);
        ensureInterestsIsMutable();
        interests_.add(value);
        bitField0_ |= 0x00000010;
        onChanged();
        return this;
      }

      private boolean isOnline_ ;
      /**
       * <code>bool isOnline = 6;</code>
       * @return The isOnline.
       */
      @java.lang.Override
      public boolean getIsOnline() {
        return isOnline_;
      }
      /**
       * <code>bool isOnline = 6;</code>
       * @param value The isOnline to set.
       * @return This builder for chaining.
       */
      public Builder setIsOnline(boolean value) {

        isOnline_ = value;
        bitField0_ |= 0x00000020;
        onChanged();
        return this;
      }
      /**
       * <code>bool isOnline = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsOnline() {
        bitField0_ = (bitField0_ & ~0x00000020);
        isOnline_ = false;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:subscriber.Subscriber)
    }

    // @@protoc_insertion_point(class_scope:subscriber.Subscriber)
    private static final subscriber.SubscriberOuterClass.Subscriber DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new subscriber.SubscriberOuterClass.Subscriber();
    }

    public static subscriber.SubscriberOuterClass.Subscriber getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Subscriber>
        PARSER = new com.google.protobuf.AbstractParser<Subscriber>() {
      @java.lang.Override
      public Subscriber parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        Builder builder = newBuilder();
        try {
          builder.mergeFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.setUnfinishedMessage(builder.buildPartial());
        } catch (com.google.protobuf.UninitializedMessageException e) {
          throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
        } catch (java.io.IOException e) {
          throw new com.google.protobuf.InvalidProtocolBufferException(e)
              .setUnfinishedMessage(builder.buildPartial());
        }
        return builder.buildPartial();
      }
    };

    public static com.google.protobuf.Parser<Subscriber> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Subscriber> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public subscriber.SubscriberOuterClass.Subscriber getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_subscriber_Subscriber_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_subscriber_Subscriber_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\020subscriber.proto\022\nsubscriber\"~\n\nSubscr" +
      "iber\022\n\n\002id\030\001 \001(\005\022\024\n\014name_surname\030\002 \001(\t\022\022" +
      "\n\nstart_date\030\003 \001(\003\022\025\n\rlast_accessed\030\004 \001(" +
      "\003\022\021\n\tinterests\030\005 \003(\t\022\020\n\010isOnline\030\006 \001(\010b\006" +
      "proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_subscriber_Subscriber_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_subscriber_Subscriber_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_subscriber_Subscriber_descriptor,
        new java.lang.String[] { "Id", "NameSurname", "StartDate", "LastAccessed", "Interests", "IsOnline", });
    descriptor.resolveAllFeaturesImmutable();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
