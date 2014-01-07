package com.github.esdaprojects.security;

public class lllIIIIIIIIlIIll
{
  public static String _$1(Object[] paramArrayOfObject)
  {
    return _$1(paramArrayOfObject, "");
  }
  
  public static String _$1(Object[] paramArrayOfObject, char paramChar)
  {
    return _$1(paramArrayOfObject, paramChar + "");
  }
  
  public static String _$1(Object[] paramArrayOfObject, String paramString)
  {
    StringBuffer localStringBuffer = new StringBuffer();
    if (paramArrayOfObject.length > 0) {
      _$1(localStringBuffer, paramArrayOfObject[0]);
    }
    for (int i = 1; i < paramArrayOfObject.length; i++)
    {
      _$1(localStringBuffer, paramString);
      _$1(localStringBuffer, paramArrayOfObject[i]);
    }
    return localStringBuffer.toString();
  }
  
  private static void _$1(StringBuffer paramStringBuffer, Object paramObject)
  {
    if (paramObject == null) {
      paramStringBuffer.append("");
    } else {
      paramStringBuffer.append(paramObject);
    }
  }
}
