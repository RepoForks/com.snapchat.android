import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;

public final class bxm
{
  private static String a = "versionInfo";
  
  public static String a(Context paramContext)
  {
    if (paramContext != null) {
      return paramContext.getSharedPreferences("HockeyApp", 0).getString(a, "[]");
    }
    return "[]";
  }
  
  public static void a(Context paramContext, String paramString)
  {
    if (paramContext != null)
    {
      paramContext = paramContext.getSharedPreferences("HockeyApp", 0).edit();
      paramContext.putString(a, paramString);
      bxj.a(paramContext);
    }
  }
}

/* Location:
 * Qualified Name:     bxm
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */