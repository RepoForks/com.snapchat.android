import java.util.HashMap;
import java.util.Map;

public final class fz
  extends lt
{
  private final String eventName = "CHAT_CHAT_UNSAVE";
  public hy mediaType;
  
  public final Map<String, Object> a()
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("event_name", "CHAT_CHAT_UNSAVE");
    if (mediaType != null) {
      localHashMap.put("media_type", mediaType);
    }
    localHashMap.putAll(super.a());
    return localHashMap;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {}
    do
    {
      return true;
      if ((paramObject == null) || (getClass() != paramObject.getClass())) {
        return false;
      }
      if (!super.equals(paramObject)) {
        return false;
      }
      paramObject = (fz)paramObject;
      if (mediaType == null) {
        break;
      }
    } while (mediaType.equals(mediaType));
    for (;;)
    {
      return false;
      if (mediaType == null) {
        break;
      }
    }
  }
  
  public final int hashCode()
  {
    int j = super.hashCode();
    if (mediaType != null) {}
    for (int i = mediaType.hashCode();; i = 0) {
      return i + j * 31;
    }
  }
}

/* Location:
 * Qualified Name:     fz
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */