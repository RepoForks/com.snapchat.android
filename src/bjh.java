import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public final class bjh
{
  @SerializedName("height")
  protected Integer height;
  @SerializedName("iv")
  protected String iv;
  @SerializedName("key")
  protected String key;
  @SerializedName("media_id")
  protected String mediaId;
  @SerializedName("media_type")
  protected String mediaType;
  @SerializedName("width")
  protected Integer width;
  
  public final bjh a(Integer paramInteger)
  {
    width = paramInteger;
    return this;
  }
  
  public final bjh a(String paramString)
  {
    mediaId = paramString;
    return this;
  }
  
  public final String a()
  {
    return mediaId;
  }
  
  public final bjh b(Integer paramInteger)
  {
    height = paramInteger;
    return this;
  }
  
  public final bjh b(String paramString)
  {
    key = paramString;
    return this;
  }
  
  public final String b()
  {
    return mediaType;
  }
  
  public final bjh c(String paramString)
  {
    iv = paramString;
    return this;
  }
  
  public final String c()
  {
    return key;
  }
  
  public final String d()
  {
    return iv;
  }
  
  public final Integer e()
  {
    return width;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (paramObject == this) {
      return true;
    }
    if (!(paramObject instanceof bjh)) {
      return false;
    }
    paramObject = (bjh)paramObject;
    return new EqualsBuilder().append(mediaId, mediaId).append(mediaType, mediaType).append(key, key).append(iv, iv).append(width, width).append(height, height).isEquals();
  }
  
  public final Integer f()
  {
    return height;
  }
  
  public final int hashCode()
  {
    return new HashCodeBuilder().append(mediaId).append(mediaType).append(key).append(iv).append(width).append(height).toHashCode();
  }
  
  public final String toString()
  {
    return ToStringBuilder.reflectionToString(this);
  }
}

/* Location:
 * Qualified Name:     bjh
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */