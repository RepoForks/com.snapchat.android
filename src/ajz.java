import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import java.util.List;

public class ajz
{
  @SerializedName("addlive_proxy_list")
  public List<String> mAddliveBaseUrls;
  @SerializedName("gae_proxy")
  public String mBaseUrl;
  @SerializedName("media_proxy")
  public String mMediaBaseUrl;
  @SerializedName("priority")
  private int mPriority;
  
  public ajz(String paramString1, String paramString2, List<String> paramList, int paramInt)
  {
    mBaseUrl = paramString1;
    mMediaBaseUrl = paramString2;
    mAddliveBaseUrls = paramList;
    mPriority = paramInt;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {}
    do
    {
      return true;
      if (!(paramObject instanceof ajz)) {
        return false;
      }
      paramObject = (ajz)paramObject;
    } while ((mBaseUrl.equals(mBaseUrl)) && (mMediaBaseUrl.equals(mMediaBaseUrl)) && (mAddliveBaseUrls.containsAll(mAddliveBaseUrls)) && (mAddliveBaseUrls.containsAll(mAddliveBaseUrls)) && (mPriority == mPriority));
    return false;
  }
  
  public int hashCode()
  {
    return mBaseUrl.hashCode();
  }
  
  public String toString()
  {
    return aul.a().toJson(this, ajz.class);
  }
}

/* Location:
 * Qualified Name:     ajz
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */