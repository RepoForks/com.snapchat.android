package com.snapchat.android.fragments.stories;

import ahz;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewParent;
import com.snapchat.android.ui.ptr.SnapchatPtrFrameLayout;

final class StoriesAdapter$f
  implements View.OnTouchListener
{
  private ahz b;
  
  public StoriesAdapter$f(StoriesAdapter paramStoriesAdapter, ahz paramahz)
  {
    b = paramahz;
  }
  
  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    if (paramMotionEvent.getAction() == 1)
    {
      paramMotionEvent = (SnapchatPtrFrameLayout)paramView.getRootView().findViewById(2131362758);
      ((ViewParent)paramView.getRootView().findViewById(2131362759)).requestDisallowInterceptTouchEvent(false);
      paramMotionEvent.setEnabled(true);
      new Handler().postDelayed(new Runnable()
      {
        public final void run()
        {
          StoriesAdapter.f.a(StoriesAdapter.f.this).u();
          StoriesAdapter.f.a(StoriesAdapter.f.this).d(false);
        }
      }, 4000L);
    }
    return false;
  }
}

/* Location:
 * Qualified Name:     com.snapchat.android.fragments.stories.StoriesAdapter.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */