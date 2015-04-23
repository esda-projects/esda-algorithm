package com.github.esdaprojects.math;

import java.util.HashMap;
import java.util.Map;

public class IllIllIllIllllll
{
  private static final String[] _$4 = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "`", "~", "!", "@", "#", "$", "%", "^", "&", "*", "(", ")", "-", "_", "+", "=", "[", "{", "]", "}", "\\", "|", ";", ":", "'", "\"", ",", "<", ".", ">", "/", "?" };
  private String[] _$3 = null;
  protected int _$2 = 0;
  private Map<String, Integer> _$1 = new HashMap();
  
  protected IllIllIllIllllll() {}
  
  public IllIllIllIllllll(String[] paramArrayOfString)
    throws llllllIIllIlllII, IlIllllIllllIlll
  {
    this(paramArrayOfString, paramArrayOfString.length);
  }
  
  public IllIllIllIllllll(int paramInt)
    throws llllllIIllIlllII, IlIllllIllllIlll
  {
    this(_$4, paramInt);
  }
  
  public IllIllIllIllllll(String[] paramArrayOfString, int paramInt)
    throws llllllIIllIlllII, IlIllllIllllIlll
  {
    if (paramInt > paramArrayOfString.length)
    {
      IlIllllIllllIlll localIlIllllIllllIlll = new IlIllllIllllIlll();
      throw localIlIllllIllllIlll;
    }
    for (int i = 0; i < paramInt; i++)
    {
      Integer localInteger = (Integer)this._$1.put(paramArrayOfString[i], Integer.valueOf(i));
      if (localInteger != null)
      {
        String str = "Duplicate label: " + paramArrayOfString[i];
        llllllIIllIlllII localllllllIIllIlllII = new llllllIIllIlllII();
        throw localllllllIIllIlllII;
      }
    }
    this._$2 = paramInt;
    this._$3 = paramArrayOfString;
  }
  
  public int _$1()
  {
    return this._$2;
  }
  
  public int _$1(String paramString)
  {
    Integer localInteger = (Integer)this._$1.get(paramString);
    if (localInteger == null) {}
    return localInteger.intValue();
  }
  
  public String _$1(int paramInt)
  {
    if ((paramInt < 0) || (paramInt > this._$2 - 1)) {
      return null;
    }
    return this._$3[paramInt];
  }
}
