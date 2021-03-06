package com.google.android.gms.internal;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;

public class zzaq
{
  private static boolean zza(Character.UnicodeBlock paramUnicodeBlock)
  {
    return (paramUnicodeBlock == Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS) || (paramUnicodeBlock == Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_A) || (paramUnicodeBlock == Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_B) || (paramUnicodeBlock == Character.UnicodeBlock.CJK_COMPATIBILITY) || (paramUnicodeBlock == Character.UnicodeBlock.CJK_COMPATIBILITY_FORMS) || (paramUnicodeBlock == Character.UnicodeBlock.CJK_COMPATIBILITY_IDEOGRAPHS) || (paramUnicodeBlock == Character.UnicodeBlock.CJK_COMPATIBILITY_IDEOGRAPHS_SUPPLEMENT) || (paramUnicodeBlock == Character.UnicodeBlock.BOPOMOFO) || (paramUnicodeBlock == Character.UnicodeBlock.HIRAGANA) || (paramUnicodeBlock == Character.UnicodeBlock.KATAKANA) || (paramUnicodeBlock == Character.UnicodeBlock.HANGUL_SYLLABLES) || (paramUnicodeBlock == Character.UnicodeBlock.HANGUL_JAMO);
  }
  
  static boolean zzd(int paramInt)
  {
    return (Character.isLetter(paramInt)) && (zza(Character.UnicodeBlock.of(paramInt)));
  }
  
  public static int zzo(String paramString)
  {
    try
    {
      byte[] arrayOfByte = paramString.getBytes("UTF-8");
      paramString = arrayOfByte;
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      for (;;)
      {
        paramString = paramString.getBytes();
      }
    }
    return zzmc.zza(paramString, 0, paramString.length, 0);
  }
  
  public static String[] zzp(String paramString)
  {
    if (paramString == null) {
      return null;
    }
    ArrayList localArrayList = new ArrayList();
    char[] arrayOfChar = paramString.toCharArray();
    int n = paramString.length();
    int j = 0;
    int i = 0;
    int k = 0;
    int m;
    int i1;
    if (k < n)
    {
      m = Character.codePointAt(arrayOfChar, k);
      i1 = Character.charCount(m);
      if (zzd(m))
      {
        if (j != 0) {
          localArrayList.add(new String(arrayOfChar, i, k - i));
        }
        localArrayList.add(new String(arrayOfChar, k, i1));
        m = 0;
        j = i;
        i = m;
      }
    }
    for (;;)
    {
      m = k + i1;
      k = j;
      j = i;
      i = k;
      k = m;
      break;
      if (Character.isLetterOrDigit(m))
      {
        if (j == 0) {
          i = k;
        }
        j = i;
        i = 1;
      }
      else if (j != 0)
      {
        localArrayList.add(new String(arrayOfChar, i, k - i));
        j = i;
        i = 0;
        continue;
        if (j != 0) {
          localArrayList.add(new String(arrayOfChar, i, k - i));
        }
        return (String[])localArrayList.toArray(new String[localArrayList.size()]);
      }
      else
      {
        m = i;
        i = j;
        j = m;
      }
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzaq
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */