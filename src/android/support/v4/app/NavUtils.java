package android.support.v4.app;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v4.content.IntentCompat;
import r;

public final class NavUtils
{
  private static final NavUtilsImpl IMPL = new NavUtilsImplBase();
  public static final String PARENT_ACTIVITY = "android.support.PARENT_ACTIVITY";
  private static final String TAG = "NavUtils";
  
  static
  {
    if (Build.VERSION.SDK_INT >= 16)
    {
      IMPL = new NavUtilsImplJB();
      return;
    }
  }
  
  public static Intent getParentActivityIntent(Activity paramActivity)
  {
    return IMPL.getParentActivityIntent(paramActivity);
  }
  
  public static Intent getParentActivityIntent(Context paramContext, ComponentName paramComponentName)
  {
    String str = getParentActivityName(paramContext, paramComponentName);
    if (str == null) {
      return null;
    }
    paramComponentName = new ComponentName(paramComponentName.getPackageName(), str);
    if (getParentActivityName(paramContext, paramComponentName) == null) {
      return IntentCompat.makeMainActivity(paramComponentName);
    }
    return new Intent().setComponent(paramComponentName);
  }
  
  private static Intent getParentActivityIntent(Context paramContext, Class<?> paramClass)
  {
    paramClass = getParentActivityName(paramContext, new ComponentName(paramContext, paramClass));
    if (paramClass == null) {
      return null;
    }
    paramClass = new ComponentName(paramContext, paramClass);
    if (getParentActivityName(paramContext, paramClass) == null) {
      return IntentCompat.makeMainActivity(paramClass);
    }
    return new Intent().setComponent(paramClass);
  }
  
  @r
  public static String getParentActivityName(Activity paramActivity)
  {
    try
    {
      paramActivity = getParentActivityName(paramActivity, paramActivity.getComponentName());
      return paramActivity;
    }
    catch (PackageManager.NameNotFoundException paramActivity)
    {
      throw new IllegalArgumentException(paramActivity);
    }
  }
  
  @r
  public static String getParentActivityName(Context paramContext, ComponentName paramComponentName)
  {
    paramComponentName = paramContext.getPackageManager().getActivityInfo(paramComponentName, 128);
    return IMPL.getParentActivityName(paramContext, paramComponentName);
  }
  
  private static void navigateUpFromSameTask(Activity paramActivity)
  {
    Intent localIntent = getParentActivityIntent(paramActivity);
    if (localIntent == null) {
      throw new IllegalArgumentException("Activity " + paramActivity.getClass().getSimpleName() + " does not have a parent activity name specified. (Did you forget to add the android.support.PARENT_ACTIVITY <meta-data>  element in your manifest?)");
    }
    IMPL.navigateUpTo(paramActivity, localIntent);
  }
  
  private static void navigateUpTo(Activity paramActivity, Intent paramIntent)
  {
    IMPL.navigateUpTo(paramActivity, paramIntent);
  }
  
  private static boolean shouldUpRecreateTask(Activity paramActivity, Intent paramIntent)
  {
    return IMPL.shouldUpRecreateTask(paramActivity, paramIntent);
  }
  
  static abstract interface NavUtilsImpl
  {
    public abstract Intent getParentActivityIntent(Activity paramActivity);
    
    public abstract String getParentActivityName(Context paramContext, ActivityInfo paramActivityInfo);
    
    public abstract void navigateUpTo(Activity paramActivity, Intent paramIntent);
    
    public abstract boolean shouldUpRecreateTask(Activity paramActivity, Intent paramIntent);
  }
  
  static class NavUtilsImplBase
    implements NavUtils.NavUtilsImpl
  {
    public Intent getParentActivityIntent(Activity paramActivity)
    {
      String str = NavUtils.getParentActivityName(paramActivity);
      if (str == null) {
        return null;
      }
      ComponentName localComponentName = new ComponentName(paramActivity, str);
      try
      {
        if (NavUtils.getParentActivityName(paramActivity, localComponentName) == null) {
          return IntentCompat.makeMainActivity(localComponentName);
        }
        paramActivity = new Intent().setComponent(localComponentName);
        return paramActivity;
      }
      catch (PackageManager.NameNotFoundException paramActivity)
      {
        new StringBuilder("getParentActivityIntent: bad parentActivityName '").append(str).append("' in manifest");
      }
      return null;
    }
    
    public String getParentActivityName(Context paramContext, ActivityInfo paramActivityInfo)
    {
      if (metaData == null) {
        paramActivityInfo = null;
      }
      String str;
      do
      {
        return paramActivityInfo;
        str = metaData.getString("android.support.PARENT_ACTIVITY");
        if (str == null) {
          return null;
        }
        paramActivityInfo = str;
      } while (str.charAt(0) != '.');
      return paramContext.getPackageName() + str;
    }
    
    public void navigateUpTo(Activity paramActivity, Intent paramIntent)
    {
      paramIntent.addFlags(67108864);
      paramActivity.startActivity(paramIntent);
      paramActivity.finish();
    }
    
    public boolean shouldUpRecreateTask(Activity paramActivity, Intent paramIntent)
    {
      paramActivity = paramActivity.getIntent().getAction();
      return (paramActivity != null) && (!paramActivity.equals("android.intent.action.MAIN"));
    }
  }
  
  static final class NavUtilsImplJB
    extends NavUtils.NavUtilsImplBase
  {
    private Intent superGetParentActivityIntent(Activity paramActivity)
    {
      return super.getParentActivityIntent(paramActivity);
    }
    
    public final Intent getParentActivityIntent(Activity paramActivity)
    {
      Intent localIntent2 = NavUtilsJB.getParentActivityIntent(paramActivity);
      Intent localIntent1 = localIntent2;
      if (localIntent2 == null) {
        localIntent1 = super.getParentActivityIntent(paramActivity);
      }
      return localIntent1;
    }
    
    public final String getParentActivityName(Context paramContext, ActivityInfo paramActivityInfo)
    {
      String str2 = NavUtilsJB.getParentActivityName(paramActivityInfo);
      String str1 = str2;
      if (str2 == null) {
        str1 = super.getParentActivityName(paramContext, paramActivityInfo);
      }
      return str1;
    }
    
    public final void navigateUpTo(Activity paramActivity, Intent paramIntent)
    {
      NavUtilsJB.navigateUpTo(paramActivity, paramIntent);
    }
    
    public final boolean shouldUpRecreateTask(Activity paramActivity, Intent paramIntent)
    {
      return NavUtilsJB.shouldUpRecreateTask(paramActivity, paramIntent);
    }
  }
}

/* Location:
 * Qualified Name:     android.support.v4.app.NavUtils
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */