import com.snapchat.android.analytics.framework.DictionaryEasyMetric;

public final class nx
{
  private static final String MEDIA_VIEW_INTERVAL_EVENT = "MEDIA_VIEW_INTERVAL";
  private static nx sInstance;
  public final DictionaryEasyMetric mDictionaryEasyMetric;
  
  protected nx()
  {
    this(DictionaryEasyMetric.a());
  }
  
  private nx(DictionaryEasyMetric paramDictionaryEasyMetric)
  {
    mDictionaryEasyMetric = paramDictionaryEasyMetric;
  }
  
  public static nx a()
  {
    try
    {
      if (sInstance == null) {
        sInstance = new nx();
      }
      nx localnx = sInstance;
      return localnx;
    }
    finally {}
  }
  
  private void b(String paramString)
  {
    mDictionaryEasyMetric.a("MEDIA_VIEW_INTERVAL", "context", paramString);
  }
  
  public final void a(String paramString)
  {
    mDictionaryEasyMetric.a("MEDIA_VIEW_INTERVAL", "last_action", paramString);
  }
  
  public final void a(String paramString1, String paramString2)
  {
    c(paramString2, paramString1);
    b(paramString2, paramString1);
  }
  
  public final void a(boolean paramBoolean)
  {
    mDictionaryEasyMetric.a("MEDIA_VIEW_INTERVAL", paramBoolean);
  }
  
  public final void b(String paramString1, String paramString2)
  {
    a(false);
    b(paramString2);
    a(paramString1);
  }
  
  public final void c(String paramString1, String paramString2)
  {
    mDictionaryEasyMetric.a("MEDIA_VIEW_INTERVAL", "current_action", paramString1);
    b(paramString2);
    mDictionaryEasyMetric.b("MEDIA_VIEW_INTERVAL");
  }
}

/* Location:
 * Qualified Name:     nx
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */