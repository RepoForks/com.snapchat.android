import android.os.Bundle;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class px
  extends pk
{
  private static final String FRIENDS_STORIES_PARAM = "friend_stories";
  private static final String TASK_NAME = "UpdateStoriesTask";
  private static final String USERNAME_PARAM = "username";
  public static Map<String, akm> sPendingStoryViewRecords = new HashMap();
  private List<akm> mStoryViewRecordList;
  private String mUsername;
  
  public px()
  {
    akp localakp = akp.g();
    mUsername = akr.l();
    synchronized (mStoryViewRecordsSinceLastServerChange)
    {
      mStoryViewRecordList = new ArrayList(???.size());
      Iterator localIterator = ???.entrySet().iterator();
      if (localIterator.hasNext())
      {
        Map.Entry localEntry = (Map.Entry)localIterator.next();
        mStoryViewRecordList.add(localEntry.getValue());
        sPendingStoryViewRecords.put(localEntry.getKey(), localEntry.getValue());
      }
    }
    mStoryViewRecordsSinceLastServerChange.clear();
  }
  
  protected final String a()
  {
    return "/bq/update_stories";
  }
  
  protected final void a(String arg1, int paramInt)
  {
    ??? = akp.g();
    if (??? == null) {
      return;
    }
    synchronized (mStoryViewRecordsSinceLastServerChange)
    {
      Iterator localIterator = mStoryViewRecordList.iterator();
      if (localIterator.hasNext())
      {
        akm localakm = (akm)localIterator.next();
        String str = mId;
        if (!???.containsKey(str)) {
          ???.put(str, localakm);
        }
        sPendingStoryViewRecords.remove(str);
      }
    }
  }
  
  protected final Bundle b()
  {
    Bundle localBundle = new Bundle();
    localBundle.putString("username", mUsername);
    localBundle.putString("friend_stories", aul.a().toJson(mStoryViewRecordList));
    return localBundle;
  }
  
  protected final void b(alp paramalp)
  {
    paramalp = mStoryViewRecordList.iterator();
    while (paramalp.hasNext())
    {
      akm localakm = (akm)paramalp.next();
      sPendingStoryViewRecords.remove(mId);
    }
  }
  
  protected final String c()
  {
    return "UpdateStoriesTask";
  }
}

/* Location:
 * Qualified Name:     px
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */