import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.concurrent.TimeUnit;

public final class bnv
{
  final bmq a;
  final bmp b;
  public final cax c;
  final caw d;
  int e = 0;
  int f = 0;
  private final Socket g;
  
  public bnv(bmq parambmq, bmp parambmp, Socket paramSocket)
  {
    a = parambmq;
    b = parambmp;
    g = paramSocket;
    c = cbe.a(cbe.b(paramSocket));
    d = cbe.a(cbe.a(paramSocket));
  }
  
  public final cbk a(long paramLong)
  {
    if (e != 4) {
      throw new IllegalStateException("state: " + e);
    }
    e = 5;
    return new bnv.e(paramLong);
  }
  
  public final void a()
  {
    d.flush();
  }
  
  public final void a(int paramInt1, int paramInt2)
  {
    if (paramInt1 != 0) {
      c.E_().a(paramInt1, TimeUnit.MILLISECONDS);
    }
    if (paramInt2 != 0) {
      d.E_().a(paramInt2, TimeUnit.MILLISECONDS);
    }
  }
  
  public final void a(bmv.a parama)
  {
    for (;;)
    {
      String str = c.n();
      if (str.length() == 0) {
        break;
      }
      bnj.b.a(parama, str);
    }
  }
  
  public final void a(bmv parambmv, String paramString)
  {
    if (e != 0) {
      throw new IllegalStateException("state: " + e);
    }
    d.b(paramString).b("\r\n");
    int i = 0;
    int j = a.length / 2;
    while (i < j)
    {
      d.b(parambmv.a(i)).b(": ").b(parambmv.b(i)).b("\r\n");
      i += 1;
    }
    d.b("\r\n");
    e = 1;
  }
  
  public final boolean b()
  {
    try
    {
      int i = g.getSoTimeout();
      try
      {
        g.setSoTimeout(1);
        boolean bool = c.d();
        return !bool;
      }
      finally
      {
        g.setSoTimeout(i);
      }
      return false;
    }
    catch (SocketTimeoutException localSocketTimeoutException)
    {
      return true;
    }
    catch (IOException localIOException) {}
  }
  
  public final bnd.a c()
  {
    if ((e != 1) && (e != 3)) {
      throw new IllegalStateException("state: " + e);
    }
    try
    {
      bog localbog;
      do
      {
        localbog = bog.a(c.n());
        localObject = new bnd.a();
        b = a;
        c = b;
        d = c;
        bmv.a locala = new bmv.a();
        a(locala);
        locala.a(boa.d, a.toString());
        ((bnd.a)localObject).a(locala.a());
      } while (b == 100);
      e = 4;
      return (bnd.a)localObject;
    }
    catch (EOFException localEOFException)
    {
      Object localObject = new IOException("unexpected end of stream on " + b + " (recycle count=" + bnj.b.b(b) + ")");
      ((IOException)localObject).initCause(localEOFException);
      throw ((Throwable)localObject);
    }
  }
  
  abstract class a
    implements cbk
  {
    protected boolean a;
    
    private a() {}
    
    public final cbl E_()
    {
      return c.E_();
    }
    
    protected final void a(boolean paramBoolean)
    {
      if (e != 5) {
        throw new IllegalStateException("state: " + e);
      }
      e = 0;
      if ((paramBoolean) && (f == 1))
      {
        f = 0;
        bnj.b.a(a, b);
      }
      while (f != 2) {
        return;
      }
      e = 6;
      b.c.close();
    }
    
    protected final void b()
    {
      bnq.a(b.c);
      e = 6;
    }
  }
  
  final class b
    implements cbj
  {
    private boolean b;
    
    private b() {}
    
    public final cbl E_()
    {
      return d.E_();
    }
    
    public final void a_(cav paramcav, long paramLong)
    {
      if (b) {
        throw new IllegalStateException("closed");
      }
      if (paramLong == 0L) {
        return;
      }
      d.i(paramLong);
      d.b("\r\n");
      d.a_(paramcav, paramLong);
      d.b("\r\n");
    }
    
    /* Error */
    public final void close()
    {
      // Byte code:
      //   0: aload_0
      //   1: monitorenter
      //   2: aload_0
      //   3: getfield 37	bnv$b:b	Z
      //   6: istore_1
      //   7: iload_1
      //   8: ifeq +6 -> 14
      //   11: aload_0
      //   12: monitorexit
      //   13: return
      //   14: aload_0
      //   15: iconst_1
      //   16: putfield 37	bnv$b:b	Z
      //   19: aload_0
      //   20: getfield 16	bnv$b:a	Lbnv;
      //   23: getfield 29	bnv:d	Lcaw;
      //   26: ldc 58
      //   28: invokeinterface 53 2 0
      //   33: pop
      //   34: aload_0
      //   35: getfield 16	bnv$b:a	Lbnv;
      //   38: iconst_3
      //   39: putfield 62	bnv:e	I
      //   42: goto -31 -> 11
      //   45: astore_2
      //   46: aload_0
      //   47: monitorexit
      //   48: aload_2
      //   49: athrow
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	50	0	this	b
      //   6	2	1	bool	boolean
      //   45	4	2	localObject	Object
      // Exception table:
      //   from	to	target	type
      //   2	7	45	finally
      //   14	42	45	finally
    }
    
    /* Error */
    public final void flush()
    {
      // Byte code:
      //   0: aload_0
      //   1: monitorenter
      //   2: aload_0
      //   3: getfield 37	bnv$b:b	Z
      //   6: istore_1
      //   7: iload_1
      //   8: ifeq +6 -> 14
      //   11: aload_0
      //   12: monitorexit
      //   13: return
      //   14: aload_0
      //   15: getfield 16	bnv$b:a	Lbnv;
      //   18: getfield 29	bnv:d	Lcaw;
      //   21: invokeinterface 65 1 0
      //   26: goto -15 -> 11
      //   29: astore_2
      //   30: aload_0
      //   31: monitorexit
      //   32: aload_2
      //   33: athrow
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	34	0	this	b
      //   6	2	1	bool	boolean
      //   29	4	2	localObject	Object
      // Exception table:
      //   from	to	target	type
      //   2	7	29	finally
      //   14	26	29	finally
    }
  }
  
  final class c
    extends bnv.a
  {
    private long d = -1L;
    private boolean e = true;
    private final bnx f;
    
    c(bnx parambnx)
    {
      super((byte)0);
      f = parambnx;
    }
    
    public final long a(cav paramcav, long paramLong)
    {
      if (paramLong < 0L) {
        throw new IllegalArgumentException("byteCount < 0: " + paramLong);
      }
      if (a) {
        throw new IllegalStateException("closed");
      }
      if (!e) {}
      do
      {
        return -1L;
        if ((d != 0L) && (d != -1L)) {
          break;
        }
        if (d != -1L) {
          c.n();
        }
        Object localObject;
        try
        {
          d = c.l();
          localObject = c.n().trim();
          if ((d < 0L) || ((!((String)localObject).isEmpty()) && (!((String)localObject).startsWith(";")))) {
            throw new ProtocolException("expected chunk size and optional extensions but was \"" + d + (String)localObject + "\"");
          }
        }
        catch (NumberFormatException paramcav)
        {
          throw new ProtocolException(paramcav.getMessage());
        }
        if (d == 0L)
        {
          e = false;
          localObject = new bmv.a();
          a((bmv.a)localObject);
          f.a(((bmv.a)localObject).a());
          a(true);
        }
      } while (!e);
      paramLong = c.a(paramcav, Math.min(paramLong, d));
      if (paramLong == -1L)
      {
        b();
        throw new IOException("unexpected end of stream");
      }
      d -= paramLong;
      return paramLong;
    }
    
    public final void close()
    {
      if (a) {
        return;
      }
      if ((e) && (!bnq.a(this, TimeUnit.MILLISECONDS))) {
        b();
      }
      a = true;
    }
  }
  
  final class d
    implements cbj
  {
    private boolean b;
    private long c;
    
    private d(long paramLong)
    {
      c = paramLong;
    }
    
    public final cbl E_()
    {
      return d.E_();
    }
    
    public final void a_(cav paramcav, long paramLong)
    {
      if (b) {
        throw new IllegalStateException("closed");
      }
      bnq.a(b, paramLong);
      if (paramLong > c) {
        throw new ProtocolException("expected " + c + " bytes but received " + paramLong);
      }
      d.a_(paramcav, paramLong);
      c -= paramLong;
    }
    
    public final void close()
    {
      if (b) {
        return;
      }
      b = true;
      if (c > 0L) {
        throw new ProtocolException("unexpected end of stream");
      }
      e = 3;
    }
    
    public final void flush()
    {
      if (b) {
        return;
      }
      d.flush();
    }
  }
  
  final class e
    extends bnv.a
  {
    private long d;
    
    public e(long paramLong)
    {
      super((byte)0);
      d = paramLong;
      if (d == 0L) {
        a(true);
      }
    }
    
    public final long a(cav paramcav, long paramLong)
    {
      if (paramLong < 0L) {
        throw new IllegalArgumentException("byteCount < 0: " + paramLong);
      }
      if (a) {
        throw new IllegalStateException("closed");
      }
      if (d == 0L) {
        return -1L;
      }
      paramLong = c.a(paramcav, Math.min(d, paramLong));
      if (paramLong == -1L)
      {
        b();
        throw new ProtocolException("unexpected end of stream");
      }
      d -= paramLong;
      if (d == 0L) {
        a(true);
      }
      return paramLong;
    }
    
    public final void close()
    {
      if (a) {
        return;
      }
      if ((d != 0L) && (!bnq.a(this, TimeUnit.MILLISECONDS))) {
        b();
      }
      a = true;
    }
  }
  
  final class f
    extends bnv.a
  {
    private boolean d;
    
    private f()
    {
      super((byte)0);
    }
    
    public final long a(cav paramcav, long paramLong)
    {
      if (paramLong < 0L) {
        throw new IllegalArgumentException("byteCount < 0: " + paramLong);
      }
      if (a) {
        throw new IllegalStateException("closed");
      }
      if (d) {
        return -1L;
      }
      paramLong = c.a(paramcav, paramLong);
      if (paramLong == -1L)
      {
        d = true;
        a(false);
        return -1L;
      }
      return paramLong;
    }
    
    public final void close()
    {
      if (a) {
        return;
      }
      if (!d) {
        b();
      }
      a = true;
    }
  }
}

/* Location:
 * Qualified Name:     bnv
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */