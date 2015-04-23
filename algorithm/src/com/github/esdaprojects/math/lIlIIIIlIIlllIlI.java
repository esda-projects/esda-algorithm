package com.github.esdaprojects.math;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class lIlIIIIlIIlllIlI
{
  public static Integer[] _$1(String paramString)
    throws UnsupportedEncodingException
  {
    byte[] arrayOfByte = paramString.getBytes("utf8");
    Integer[] arrayOfInteger = new Integer[arrayOfByte.length];
    for (int i = 0; i < arrayOfByte.length; i++)
    {
      int j = arrayOfByte[i] + 128;
      arrayOfInteger[i] = Integer.valueOf(j);
    }
    return arrayOfInteger;
  }
  
  public static Integer[] _$1(String paramString, IllIllIllIllllll paramIllIllIllIllllll)
  {
    char[] arrayOfChar = paramString.toCharArray();
    Integer[] arrayOfInteger = new Integer[arrayOfChar.length];
    for (int i = 0; i < arrayOfChar.length; i++)
    {
      int j = paramIllIllIllIllllll._$1(arrayOfChar[i] + "");
      arrayOfInteger[i] = Integer.valueOf(j);
    }
    return arrayOfInteger;
  }
  
  public static Integer[] _$1(String[] paramArrayOfString, IllIllIllIllllll paramIllIllIllIllllll)
  {
    Integer[] arrayOfInteger = new Integer[paramArrayOfString.length];
    for (int i = 0; i < paramArrayOfString.length; i++)
    {
      int j = paramIllIllIllIllllll._$1(paramArrayOfString[i]);
      arrayOfInteger[i] = Integer.valueOf(j);
    }
    return arrayOfInteger;
  }
  
  public static String _$1(String paramString, int paramInt)
    throws llllllIIllIlllII, IlIllllIllllIlll, UnsupportedEncodingException
  {
    return _$1(paramString, 256, paramInt);
  }
  
  public static String _$1(String paramString, int paramInt1, int paramInt2)
    throws llllllIIllIlllII, IlIllllIllllIlll, UnsupportedEncodingException
  {
    IllIllIllIllllll localIllIllIllIllllll = new IllIllIllIllllll(paramInt2);
    return _$1(paramString, paramInt1, localIllIllIllIllllll);
  }
  
  public static String _$1(String[] paramArrayOfString, IllIllIllIllllll paramIllIllIllIllllll1, IllIllIllIllllll paramIllIllIllIllllll2)
    throws llllllIIllIlllII, IlIllllIllllIlll
  {
    Integer[] arrayOfInteger1 = _$1(paramArrayOfString, paramIllIllIllIllllll1);
    Integer[] arrayOfInteger2 = _$1(arrayOfInteger1, paramIllIllIllIllllll1._$1(), paramIllIllIllIllllll2._$1());
    StringBuffer localStringBuffer = new StringBuffer();
    for (int i = 0; i < arrayOfInteger2.length; i++) {
      localStringBuffer.append(paramIllIllIllIllllll2._$1(arrayOfInteger2[i].intValue()));
    }
    return localStringBuffer.toString();
  }
  
  public static String _$1(String paramString, IllIllIllIllllll paramIllIllIllIllllll1, IllIllIllIllllll paramIllIllIllIllllll2)
    throws llllllIIllIlllII, IlIllllIllllIlll
  {
    Integer[] arrayOfInteger = _$1(paramString, paramIllIllIllIllllll1);
    String[] arrayOfString = _$1(arrayOfInteger, paramIllIllIllIllllll1, paramIllIllIllIllllll2);
    StringBuffer localStringBuffer = new StringBuffer(arrayOfString[0]);
    for (int i = 1; i < arrayOfString.length; i++) {
      localStringBuffer.append(arrayOfString[i]);
    }
    return localStringBuffer.toString();
  }
  
  public static String[] _$1(Integer[] paramArrayOfInteger, IllIllIllIllllll paramIllIllIllIllllll1, IllIllIllIllllll paramIllIllIllIllllll2)
    throws llllllIIllIlllII, IlIllllIllllIlll
  {
    Integer[] arrayOfInteger = _$1(paramArrayOfInteger, paramIllIllIllIllllll1._$1(), paramIllIllIllIllllll2._$1());
    String[] arrayOfString = new String[arrayOfInteger.length];
    for (int i = 0; i < arrayOfInteger.length; i++) {
      arrayOfString[i] = paramIllIllIllIllllll2._$1(arrayOfInteger[i].intValue());
    }
    return arrayOfString;
  }
  
  public static String _$1(String paramString, int paramInt, IllIllIllIllllll paramIllIllIllIllllll)
    throws llllllIIllIlllII, IlIllllIllllIlll, UnsupportedEncodingException
  {
    IllIllIllIllllll localIllIllIllIllllll = new IllIllIllIllllll(paramInt);
    return _$1(paramString, localIllIllIllIllllll, paramIllIllIllIllllll);
  }
  
  public static Integer[] _$1(Integer[] paramArrayOfInteger, int paramInt1, int paramInt2)
    throws llllllIIllIlllII, IlIllllIllllIlll
  {
    ArrayList localArrayList1 = new ArrayList(Arrays.asList(paramArrayOfInteger));
    ArrayList localArrayList2 = new ArrayList();
    ArrayList localArrayList3 = localArrayList1;
    while (localArrayList3.size() > 0)
    {
      int i = 0;
      ArrayList localArrayList4 = localArrayList3;
      localArrayList3 = new ArrayList();
      while (localArrayList4.size() > 0)
      {
        Integer localInteger = (Integer)localArrayList4.get(0);
        localArrayList4.remove(0);
        int j = localInteger.intValue();
        int k = i * paramInt1 + j;
        int m = k / paramInt2;
        i = k % paramInt2;
        localArrayList3.add(Integer.valueOf(m));
      }
      while ((localArrayList3.size() > 0) && (((Integer)localArrayList3.get(0)).intValue() == 0)) {
        localArrayList3.remove(0);
      }
      localArrayList2.add(0, Integer.valueOf(i));
    }
    return (Integer[])localArrayList2.toArray(new Integer[0]);
  }
}
