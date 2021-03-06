import com.google.gson.annotations.SerializedName;
import java.util.List;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class bix
{
  @SerializedName("added_friends")
  protected List<biu> addedFriends;
  @SerializedName("bests")
  protected List<String> bests;
  @SerializedName("friends")
  protected List<biu> friends;
  
  public final List<biu> a()
  {
    return friends;
  }
  
  public final List<biu> b()
  {
    return addedFriends;
  }
  
  public final List<String> c()
  {
    return bests;
  }
  
  public boolean equals(Object paramObject)
  {
    if (paramObject == this) {
      return true;
    }
    if (!(paramObject instanceof bix)) {
      return false;
    }
    paramObject = (bix)paramObject;
    return new EqualsBuilder().append(friends, friends).append(addedFriends, addedFriends).append(bests, bests).isEquals();
  }
  
  public int hashCode()
  {
    return new HashCodeBuilder().append(friends).append(addedFriends).append(bests).toHashCode();
  }
  
  public String toString()
  {
    return ToStringBuilder.reflectionToString(this);
  }
}

/* Location:
 * Qualified Name:     bix
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */