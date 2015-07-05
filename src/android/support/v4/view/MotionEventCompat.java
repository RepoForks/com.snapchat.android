package android.support.v4.view;

import android.os.Build.VERSION;
import android.view.MotionEvent;

public final class MotionEventCompat
{
  public static final int ACTION_HOVER_ENTER = 9;
  public static final int ACTION_HOVER_EXIT = 10;
  public static final int ACTION_HOVER_MOVE = 7;
  public static final int ACTION_MASK = 255;
  public static final int ACTION_POINTER_DOWN = 5;
  public static final int ACTION_POINTER_INDEX_MASK = 65280;
  public static final int ACTION_POINTER_INDEX_SHIFT = 8;
  public static final int ACTION_POINTER_UP = 6;
  public static final int ACTION_SCROLL = 8;
  static final MotionEventVersionImpl IMPL = new BaseMotionEventVersionImpl();
  
  static
  {
    if (Build.VERSION.SDK_INT >= 5)
    {
      IMPL = new EclairMotionEventVersionImpl();
      return;
    }
  }
  
  public static int findPointerIndex(MotionEvent paramMotionEvent, int paramInt)
  {
    return IMPL.findPointerIndex(paramMotionEvent, paramInt);
  }
  
  public static int getActionIndex(MotionEvent paramMotionEvent)
  {
    return (paramMotionEvent.getAction() & 0xFF00) >> 8;
  }
  
  public static int getActionMasked(MotionEvent paramMotionEvent)
  {
    return paramMotionEvent.getAction() & 0xFF;
  }
  
  public static int getPointerCount(MotionEvent paramMotionEvent)
  {
    return IMPL.getPointerCount(paramMotionEvent);
  }
  
  public static int getPointerId(MotionEvent paramMotionEvent, int paramInt)
  {
    return IMPL.getPointerId(paramMotionEvent, paramInt);
  }
  
  public static float getX(MotionEvent paramMotionEvent, int paramInt)
  {
    return IMPL.getX(paramMotionEvent, paramInt);
  }
  
  public static float getY(MotionEvent paramMotionEvent, int paramInt)
  {
    return IMPL.getY(paramMotionEvent, paramInt);
  }
  
  static final class BaseMotionEventVersionImpl
    implements MotionEventCompat.MotionEventVersionImpl
  {
    public final int findPointerIndex(MotionEvent paramMotionEvent, int paramInt)
    {
      if (paramInt == 0) {
        return 0;
      }
      return -1;
    }
    
    public final int getPointerCount(MotionEvent paramMotionEvent)
    {
      return 1;
    }
    
    public final int getPointerId(MotionEvent paramMotionEvent, int paramInt)
    {
      if (paramInt == 0) {
        return 0;
      }
      throw new IndexOutOfBoundsException("Pre-Eclair does not support multiple pointers");
    }
    
    public final float getX(MotionEvent paramMotionEvent, int paramInt)
    {
      if (paramInt == 0) {
        return paramMotionEvent.getX();
      }
      throw new IndexOutOfBoundsException("Pre-Eclair does not support multiple pointers");
    }
    
    public final float getY(MotionEvent paramMotionEvent, int paramInt)
    {
      if (paramInt == 0) {
        return paramMotionEvent.getY();
      }
      throw new IndexOutOfBoundsException("Pre-Eclair does not support multiple pointers");
    }
  }
  
  static final class EclairMotionEventVersionImpl
    implements MotionEventCompat.MotionEventVersionImpl
  {
    public final int findPointerIndex(MotionEvent paramMotionEvent, int paramInt)
    {
      return MotionEventCompatEclair.findPointerIndex(paramMotionEvent, paramInt);
    }
    
    public final int getPointerCount(MotionEvent paramMotionEvent)
    {
      return MotionEventCompatEclair.getPointerCount(paramMotionEvent);
    }
    
    public final int getPointerId(MotionEvent paramMotionEvent, int paramInt)
    {
      return MotionEventCompatEclair.getPointerId(paramMotionEvent, paramInt);
    }
    
    public final float getX(MotionEvent paramMotionEvent, int paramInt)
    {
      return MotionEventCompatEclair.getX(paramMotionEvent, paramInt);
    }
    
    public final float getY(MotionEvent paramMotionEvent, int paramInt)
    {
      return MotionEventCompatEclair.getY(paramMotionEvent, paramInt);
    }
  }
  
  static abstract interface MotionEventVersionImpl
  {
    public abstract int findPointerIndex(MotionEvent paramMotionEvent, int paramInt);
    
    public abstract int getPointerCount(MotionEvent paramMotionEvent);
    
    public abstract int getPointerId(MotionEvent paramMotionEvent, int paramInt);
    
    public abstract float getX(MotionEvent paramMotionEvent, int paramInt);
    
    public abstract float getY(MotionEvent paramMotionEvent, int paramInt);
  }
}

/* Location:
 * Qualified Name:     android.support.v4.view.MotionEventCompat
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */