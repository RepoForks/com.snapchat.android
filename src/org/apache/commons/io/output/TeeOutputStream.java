package org.apache.commons.io.output;

import java.io.OutputStream;

public class TeeOutputStream
  extends ProxyOutputStream
{
  protected OutputStream branch;
  
  public TeeOutputStream(OutputStream paramOutputStream1, OutputStream paramOutputStream2)
  {
    super(paramOutputStream1);
    branch = paramOutputStream2;
  }
  
  public void close()
  {
    try
    {
      super.close();
      return;
    }
    finally
    {
      branch.close();
    }
  }
  
  public void flush()
  {
    super.flush();
    branch.flush();
  }
  
  public void write(int paramInt)
  {
    try
    {
      super.write(paramInt);
      branch.write(paramInt);
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public void write(byte[] paramArrayOfByte)
  {
    try
    {
      super.write(paramArrayOfByte);
      branch.write(paramArrayOfByte);
      return;
    }
    finally
    {
      paramArrayOfByte = finally;
      throw paramArrayOfByte;
    }
  }
  
  public void write(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    try
    {
      super.write(paramArrayOfByte, paramInt1, paramInt2);
      branch.write(paramArrayOfByte, paramInt1, paramInt2);
      return;
    }
    finally
    {
      paramArrayOfByte = finally;
      throw paramArrayOfByte;
    }
  }
}

/* Location:
 * Qualified Name:     org.apache.commons.io.output.TeeOutputStream
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */