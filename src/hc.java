import java.util.HashMap;
import java.util.Map;

public final class hc
  extends ml
{
  public Long adIndexCount;
  public Long adIndexPos;
  public fz additionalInfo;
  public String adsnapId;
  public String editionId;
  private String errorInfo;
  private final String eventName = "DISCOVER_AD_SKIP";
  public String publisherId;
  public Long snapIndexCount;
  public Long snapIndexPos;
  public lv source;
  
  public final Map<String, Object> a()
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("event_name", "DISCOVER_AD_SKIP");
    if (adIndexCount != null) {
      localHashMap.put("ad_index_count", adIndexCount);
    }
    if (adIndexPos != null) {
      localHashMap.put("ad_index_pos", adIndexPos);
    }
    if (additionalInfo != null) {
      localHashMap.put("additional_info", additionalInfo);
    }
    if (adsnapId != null) {
      localHashMap.put("adsnap_id", adsnapId);
    }
    if (editionId != null) {
      localHashMap.put("edition_id", editionId);
    }
    if (errorInfo != null) {
      localHashMap.put("error_info", errorInfo);
    }
    if (publisherId != null) {
      localHashMap.put("publisher_id", publisherId);
    }
    if (snapIndexCount != null) {
      localHashMap.put("snap_index_count", snapIndexCount);
    }
    if (snapIndexPos != null) {
      localHashMap.put("snap_index_pos", snapIndexPos);
    }
    if (source != null) {
      localHashMap.put("source", source);
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
      paramObject = (hc)paramObject;
      if (adIndexCount != null)
      {
        if (adIndexCount.equals(adIndexCount)) {}
      }
      else {
        while (adIndexCount != null) {
          return false;
        }
      }
      if (adIndexPos != null)
      {
        if (adIndexPos.equals(adIndexPos)) {}
      }
      else {
        while (adIndexPos != null) {
          return false;
        }
      }
      if (additionalInfo != null)
      {
        if (additionalInfo.equals(additionalInfo)) {}
      }
      else {
        while (additionalInfo != null) {
          return false;
        }
      }
      if (adsnapId != null)
      {
        if (adsnapId.equals(adsnapId)) {}
      }
      else {
        while (adsnapId != null) {
          return false;
        }
      }
      if (editionId != null)
      {
        if (editionId.equals(editionId)) {}
      }
      else {
        while (editionId != null) {
          return false;
        }
      }
      if (errorInfo != null)
      {
        if (errorInfo.equals(errorInfo)) {}
      }
      else {
        while (errorInfo != null) {
          return false;
        }
      }
      if (publisherId != null)
      {
        if (publisherId.equals(publisherId)) {}
      }
      else {
        while (publisherId != null) {
          return false;
        }
      }
      if (snapIndexCount != null)
      {
        if (snapIndexCount.equals(snapIndexCount)) {}
      }
      else {
        while (snapIndexCount != null) {
          return false;
        }
      }
      if (snapIndexPos != null)
      {
        if (snapIndexPos.equals(snapIndexPos)) {}
      }
      else {
        while (snapIndexPos != null) {
          return false;
        }
      }
      if (source == null) {
        break;
      }
    } while (source.equals(source));
    for (;;)
    {
      return false;
      if (source == null) {
        break;
      }
    }
  }
  
  public final int hashCode()
  {
    int i5 = 0;
    int i6 = super.hashCode();
    int i;
    int j;
    label39:
    int k;
    label54:
    int m;
    label70:
    int n;
    label86:
    int i1;
    label102:
    int i2;
    label118:
    int i3;
    if (adIndexCount != null)
    {
      i = adIndexCount.hashCode();
      if (adIndexPos == null) {
        break label231;
      }
      j = adIndexPos.hashCode();
      if (additionalInfo == null) {
        break label236;
      }
      k = additionalInfo.hashCode();
      if (adsnapId == null) {
        break label241;
      }
      m = adsnapId.hashCode();
      if (editionId == null) {
        break label247;
      }
      n = editionId.hashCode();
      if (errorInfo == null) {
        break label253;
      }
      i1 = errorInfo.hashCode();
      if (publisherId == null) {
        break label259;
      }
      i2 = publisherId.hashCode();
      if (snapIndexCount == null) {
        break label265;
      }
      i3 = snapIndexCount.hashCode();
      label134:
      if (snapIndexPos == null) {
        break label271;
      }
    }
    label231:
    label236:
    label241:
    label247:
    label253:
    label259:
    label265:
    label271:
    for (int i4 = snapIndexPos.hashCode();; i4 = 0)
    {
      if (source != null) {
        i5 = source.hashCode();
      }
      return (i4 + (i3 + (i2 + (i1 + (n + (m + (k + (j + (i + i6 * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31 + i5;
      i = 0;
      break;
      j = 0;
      break label39;
      k = 0;
      break label54;
      m = 0;
      break label70;
      n = 0;
      break label86;
      i1 = 0;
      break label102;
      i2 = 0;
      break label118;
      i3 = 0;
      break label134;
    }
  }
}

/* Location:
 * Qualified Name:     hc
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */