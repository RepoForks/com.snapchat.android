package com.google.android.gms.maps.model.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;
import java.util.List;

public abstract class zzm$zza
  extends Binder
  implements zzm
{
  public static zzm zzcc(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
    if ((localIInterface != null) && ((localIInterface instanceof zzm))) {
      return (zzm)localIInterface;
    }
    return new zza(paramIBinder);
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    int i = 0;
    boolean bool2 = false;
    int j = 0;
    int k = 0;
    boolean bool1 = false;
    float f;
    switch (paramInt1)
    {
    default: 
      return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    case 1598968902: 
      paramParcel2.writeString("com.google.android.gms.maps.model.internal.IPolygonDelegate");
      return true;
    case 1: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
      remove();
      paramParcel2.writeNoException();
      return true;
    case 2: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
      paramParcel1 = getId();
      paramParcel2.writeNoException();
      paramParcel2.writeString(paramParcel1);
      return true;
    case 3: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
      setPoints(paramParcel1.createTypedArrayList(LatLng.CREATOR));
      paramParcel2.writeNoException();
      return true;
    case 4: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
      paramParcel1 = getPoints();
      paramParcel2.writeNoException();
      paramParcel2.writeTypedList(paramParcel1);
      return true;
    case 5: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
      setHoles(paramParcel1.readArrayList(getClass().getClassLoader()));
      paramParcel2.writeNoException();
      return true;
    case 6: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
      paramParcel1 = getHoles();
      paramParcel2.writeNoException();
      paramParcel2.writeList(paramParcel1);
      return true;
    case 7: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
      setStrokeWidth(paramParcel1.readFloat());
      paramParcel2.writeNoException();
      return true;
    case 8: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
      f = getStrokeWidth();
      paramParcel2.writeNoException();
      paramParcel2.writeFloat(f);
      return true;
    case 9: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
      setStrokeColor(paramParcel1.readInt());
      paramParcel2.writeNoException();
      return true;
    case 10: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
      paramInt1 = getStrokeColor();
      paramParcel2.writeNoException();
      paramParcel2.writeInt(paramInt1);
      return true;
    case 11: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
      setFillColor(paramParcel1.readInt());
      paramParcel2.writeNoException();
      return true;
    case 12: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
      paramInt1 = getFillColor();
      paramParcel2.writeNoException();
      paramParcel2.writeInt(paramInt1);
      return true;
    case 13: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
      setZIndex(paramParcel1.readFloat());
      paramParcel2.writeNoException();
      return true;
    case 14: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
      f = getZIndex();
      paramParcel2.writeNoException();
      paramParcel2.writeFloat(f);
      return true;
    case 15: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
      if (paramParcel1.readInt() != 0) {
        bool1 = true;
      }
      setVisible(bool1);
      paramParcel2.writeNoException();
      return true;
    case 16: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
      bool1 = isVisible();
      paramParcel2.writeNoException();
      paramInt1 = i;
      if (bool1) {
        paramInt1 = 1;
      }
      paramParcel2.writeInt(paramInt1);
      return true;
    case 17: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
      bool1 = bool2;
      if (paramParcel1.readInt() != 0) {
        bool1 = true;
      }
      setGeodesic(bool1);
      paramParcel2.writeNoException();
      return true;
    case 18: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
      bool1 = isGeodesic();
      paramParcel2.writeNoException();
      paramInt1 = j;
      if (bool1) {
        paramInt1 = 1;
      }
      paramParcel2.writeInt(paramInt1);
      return true;
    case 19: 
      paramParcel1.enforceInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
      bool1 = zza(zzcc(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      paramInt1 = k;
      if (bool1) {
        paramInt1 = 1;
      }
      paramParcel2.writeInt(paramInt1);
      return true;
    }
    paramParcel1.enforceInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
    paramInt1 = hashCodeRemote();
    paramParcel2.writeNoException();
    paramParcel2.writeInt(paramInt1);
    return true;
  }
  
  static class zza
    implements zzm
  {
    private IBinder zzle;
    
    zza(IBinder paramIBinder)
    {
      zzle = paramIBinder;
    }
    
    public IBinder asBinder()
    {
      return zzle;
    }
    
    public int getFillColor()
    {
      Parcel localParcel1 = Parcel.obtain();
      Parcel localParcel2 = Parcel.obtain();
      try
      {
        localParcel1.writeInterfaceToken("com.google.android.gms.maps.model.internal.IPolygonDelegate");
        zzle.transact(12, localParcel1, localParcel2, 0);
        localParcel2.readException();
        int i = localParcel2.readInt();
        return i;
      }
      finally
      {
        localParcel2.recycle();
        localParcel1.recycle();
      }
    }
    
    public List getHoles()
    {
      Parcel localParcel1 = Parcel.obtain();
      Parcel localParcel2 = Parcel.obtain();
      try
      {
        localParcel1.writeInterfaceToken("com.google.android.gms.maps.model.internal.IPolygonDelegate");
        zzle.transact(6, localParcel1, localParcel2, 0);
        localParcel2.readException();
        ArrayList localArrayList = localParcel2.readArrayList(getClass().getClassLoader());
        return localArrayList;
      }
      finally
      {
        localParcel2.recycle();
        localParcel1.recycle();
      }
    }
    
    public String getId()
    {
      Parcel localParcel1 = Parcel.obtain();
      Parcel localParcel2 = Parcel.obtain();
      try
      {
        localParcel1.writeInterfaceToken("com.google.android.gms.maps.model.internal.IPolygonDelegate");
        zzle.transact(2, localParcel1, localParcel2, 0);
        localParcel2.readException();
        String str = localParcel2.readString();
        return str;
      }
      finally
      {
        localParcel2.recycle();
        localParcel1.recycle();
      }
    }
    
    public List<LatLng> getPoints()
    {
      Parcel localParcel1 = Parcel.obtain();
      Parcel localParcel2 = Parcel.obtain();
      try
      {
        localParcel1.writeInterfaceToken("com.google.android.gms.maps.model.internal.IPolygonDelegate");
        zzle.transact(4, localParcel1, localParcel2, 0);
        localParcel2.readException();
        ArrayList localArrayList = localParcel2.createTypedArrayList(LatLng.CREATOR);
        return localArrayList;
      }
      finally
      {
        localParcel2.recycle();
        localParcel1.recycle();
      }
    }
    
    public int getStrokeColor()
    {
      Parcel localParcel1 = Parcel.obtain();
      Parcel localParcel2 = Parcel.obtain();
      try
      {
        localParcel1.writeInterfaceToken("com.google.android.gms.maps.model.internal.IPolygonDelegate");
        zzle.transact(10, localParcel1, localParcel2, 0);
        localParcel2.readException();
        int i = localParcel2.readInt();
        return i;
      }
      finally
      {
        localParcel2.recycle();
        localParcel1.recycle();
      }
    }
    
    public float getStrokeWidth()
    {
      Parcel localParcel1 = Parcel.obtain();
      Parcel localParcel2 = Parcel.obtain();
      try
      {
        localParcel1.writeInterfaceToken("com.google.android.gms.maps.model.internal.IPolygonDelegate");
        zzle.transact(8, localParcel1, localParcel2, 0);
        localParcel2.readException();
        float f = localParcel2.readFloat();
        return f;
      }
      finally
      {
        localParcel2.recycle();
        localParcel1.recycle();
      }
    }
    
    public float getZIndex()
    {
      Parcel localParcel1 = Parcel.obtain();
      Parcel localParcel2 = Parcel.obtain();
      try
      {
        localParcel1.writeInterfaceToken("com.google.android.gms.maps.model.internal.IPolygonDelegate");
        zzle.transact(14, localParcel1, localParcel2, 0);
        localParcel2.readException();
        float f = localParcel2.readFloat();
        return f;
      }
      finally
      {
        localParcel2.recycle();
        localParcel1.recycle();
      }
    }
    
    public int hashCodeRemote()
    {
      Parcel localParcel1 = Parcel.obtain();
      Parcel localParcel2 = Parcel.obtain();
      try
      {
        localParcel1.writeInterfaceToken("com.google.android.gms.maps.model.internal.IPolygonDelegate");
        zzle.transact(20, localParcel1, localParcel2, 0);
        localParcel2.readException();
        int i = localParcel2.readInt();
        return i;
      }
      finally
      {
        localParcel2.recycle();
        localParcel1.recycle();
      }
    }
    
    public boolean isGeodesic()
    {
      boolean bool = false;
      Parcel localParcel1 = Parcel.obtain();
      Parcel localParcel2 = Parcel.obtain();
      try
      {
        localParcel1.writeInterfaceToken("com.google.android.gms.maps.model.internal.IPolygonDelegate");
        zzle.transact(18, localParcel1, localParcel2, 0);
        localParcel2.readException();
        int i = localParcel2.readInt();
        if (i != 0) {
          bool = true;
        }
        return bool;
      }
      finally
      {
        localParcel2.recycle();
        localParcel1.recycle();
      }
    }
    
    public boolean isVisible()
    {
      boolean bool = false;
      Parcel localParcel1 = Parcel.obtain();
      Parcel localParcel2 = Parcel.obtain();
      try
      {
        localParcel1.writeInterfaceToken("com.google.android.gms.maps.model.internal.IPolygonDelegate");
        zzle.transact(16, localParcel1, localParcel2, 0);
        localParcel2.readException();
        int i = localParcel2.readInt();
        if (i != 0) {
          bool = true;
        }
        return bool;
      }
      finally
      {
        localParcel2.recycle();
        localParcel1.recycle();
      }
    }
    
    public void remove()
    {
      Parcel localParcel1 = Parcel.obtain();
      Parcel localParcel2 = Parcel.obtain();
      try
      {
        localParcel1.writeInterfaceToken("com.google.android.gms.maps.model.internal.IPolygonDelegate");
        zzle.transact(1, localParcel1, localParcel2, 0);
        localParcel2.readException();
        return;
      }
      finally
      {
        localParcel2.recycle();
        localParcel1.recycle();
      }
    }
    
    public void setFillColor(int paramInt)
    {
      Parcel localParcel1 = Parcel.obtain();
      Parcel localParcel2 = Parcel.obtain();
      try
      {
        localParcel1.writeInterfaceToken("com.google.android.gms.maps.model.internal.IPolygonDelegate");
        localParcel1.writeInt(paramInt);
        zzle.transact(11, localParcel1, localParcel2, 0);
        localParcel2.readException();
        return;
      }
      finally
      {
        localParcel2.recycle();
        localParcel1.recycle();
      }
    }
    
    public void setGeodesic(boolean paramBoolean)
    {
      int i = 0;
      Parcel localParcel1 = Parcel.obtain();
      Parcel localParcel2 = Parcel.obtain();
      try
      {
        localParcel1.writeInterfaceToken("com.google.android.gms.maps.model.internal.IPolygonDelegate");
        if (paramBoolean) {
          i = 1;
        }
        localParcel1.writeInt(i);
        zzle.transact(17, localParcel1, localParcel2, 0);
        localParcel2.readException();
        return;
      }
      finally
      {
        localParcel2.recycle();
        localParcel1.recycle();
      }
    }
    
    public void setHoles(List paramList)
    {
      Parcel localParcel1 = Parcel.obtain();
      Parcel localParcel2 = Parcel.obtain();
      try
      {
        localParcel1.writeInterfaceToken("com.google.android.gms.maps.model.internal.IPolygonDelegate");
        localParcel1.writeList(paramList);
        zzle.transact(5, localParcel1, localParcel2, 0);
        localParcel2.readException();
        return;
      }
      finally
      {
        localParcel2.recycle();
        localParcel1.recycle();
      }
    }
    
    public void setPoints(List<LatLng> paramList)
    {
      Parcel localParcel1 = Parcel.obtain();
      Parcel localParcel2 = Parcel.obtain();
      try
      {
        localParcel1.writeInterfaceToken("com.google.android.gms.maps.model.internal.IPolygonDelegate");
        localParcel1.writeTypedList(paramList);
        zzle.transact(3, localParcel1, localParcel2, 0);
        localParcel2.readException();
        return;
      }
      finally
      {
        localParcel2.recycle();
        localParcel1.recycle();
      }
    }
    
    public void setStrokeColor(int paramInt)
    {
      Parcel localParcel1 = Parcel.obtain();
      Parcel localParcel2 = Parcel.obtain();
      try
      {
        localParcel1.writeInterfaceToken("com.google.android.gms.maps.model.internal.IPolygonDelegate");
        localParcel1.writeInt(paramInt);
        zzle.transact(9, localParcel1, localParcel2, 0);
        localParcel2.readException();
        return;
      }
      finally
      {
        localParcel2.recycle();
        localParcel1.recycle();
      }
    }
    
    public void setStrokeWidth(float paramFloat)
    {
      Parcel localParcel1 = Parcel.obtain();
      Parcel localParcel2 = Parcel.obtain();
      try
      {
        localParcel1.writeInterfaceToken("com.google.android.gms.maps.model.internal.IPolygonDelegate");
        localParcel1.writeFloat(paramFloat);
        zzle.transact(7, localParcel1, localParcel2, 0);
        localParcel2.readException();
        return;
      }
      finally
      {
        localParcel2.recycle();
        localParcel1.recycle();
      }
    }
    
    public void setVisible(boolean paramBoolean)
    {
      int i = 0;
      Parcel localParcel1 = Parcel.obtain();
      Parcel localParcel2 = Parcel.obtain();
      try
      {
        localParcel1.writeInterfaceToken("com.google.android.gms.maps.model.internal.IPolygonDelegate");
        if (paramBoolean) {
          i = 1;
        }
        localParcel1.writeInt(i);
        zzle.transact(15, localParcel1, localParcel2, 0);
        localParcel2.readException();
        return;
      }
      finally
      {
        localParcel2.recycle();
        localParcel1.recycle();
      }
    }
    
    public void setZIndex(float paramFloat)
    {
      Parcel localParcel1 = Parcel.obtain();
      Parcel localParcel2 = Parcel.obtain();
      try
      {
        localParcel1.writeInterfaceToken("com.google.android.gms.maps.model.internal.IPolygonDelegate");
        localParcel1.writeFloat(paramFloat);
        zzle.transact(13, localParcel1, localParcel2, 0);
        localParcel2.readException();
        return;
      }
      finally
      {
        localParcel2.recycle();
        localParcel1.recycle();
      }
    }
    
    /* Error */
    public boolean zza(zzm paramzzm)
    {
      // Byte code:
      //   0: iconst_0
      //   1: istore_3
      //   2: invokestatic 29	android/os/Parcel:obtain	()Landroid/os/Parcel;
      //   5: astore 4
      //   7: invokestatic 29	android/os/Parcel:obtain	()Landroid/os/Parcel;
      //   10: astore 5
      //   12: aload 4
      //   14: ldc 31
      //   16: invokevirtual 35	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
      //   19: aload_1
      //   20: ifnull +62 -> 82
      //   23: aload_1
      //   24: invokeinterface 124 1 0
      //   29: astore_1
      //   30: aload 4
      //   32: aload_1
      //   33: invokevirtual 127	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
      //   36: aload_0
      //   37: getfield 18	com/google/android/gms/maps/model/internal/zzm$zza$zza:zzle	Landroid/os/IBinder;
      //   40: bipush 19
      //   42: aload 4
      //   44: aload 5
      //   46: iconst_0
      //   47: invokeinterface 41 5 0
      //   52: pop
      //   53: aload 5
      //   55: invokevirtual 44	android/os/Parcel:readException	()V
      //   58: aload 5
      //   60: invokevirtual 47	android/os/Parcel:readInt	()I
      //   63: istore_2
      //   64: iload_2
      //   65: ifeq +5 -> 70
      //   68: iconst_1
      //   69: istore_3
      //   70: aload 5
      //   72: invokevirtual 50	android/os/Parcel:recycle	()V
      //   75: aload 4
      //   77: invokevirtual 50	android/os/Parcel:recycle	()V
      //   80: iload_3
      //   81: ireturn
      //   82: aconst_null
      //   83: astore_1
      //   84: goto -54 -> 30
      //   87: astore_1
      //   88: aload 5
      //   90: invokevirtual 50	android/os/Parcel:recycle	()V
      //   93: aload 4
      //   95: invokevirtual 50	android/os/Parcel:recycle	()V
      //   98: aload_1
      //   99: athrow
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	100	0	this	zza
      //   0	100	1	paramzzm	zzm
      //   63	2	2	i	int
      //   1	80	3	bool	boolean
      //   5	89	4	localParcel1	Parcel
      //   10	79	5	localParcel2	Parcel
      // Exception table:
      //   from	to	target	type
      //   12	19	87	finally
      //   23	30	87	finally
      //   30	64	87	finally
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.maps.model.internal.zzm.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */