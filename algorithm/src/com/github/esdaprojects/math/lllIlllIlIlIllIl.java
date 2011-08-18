package com.github.esdaprojects.math;

import java.util.HashMap;
import java.util.Map;

public class lllIlllIlIlIllIl
  implements lIIllIIIIlllIllI
{
  private static final String[] _$2 = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "`", "~", "!", "@", "#", "$", "%", "^", "&", "*", "(", ")", "-", "_", "+", "=", "[", "{", "]", "}", "\\", "|", ";", ":", "'", "\"", ",", "<", ".", ">", "/", "?" };
  private Map<String, Integer> _$1 = new HashMap();
  
  public int _$$1(String paramString)
  {
    Integer localInteger = (Integer)this._$1.get(paramString);
    return localInteger.intValue();
  }
  
  public String _$$1(int paramInt)
  {
    if ((paramInt < 0) || (paramInt > _$2.length - 1)) {
      return null;
    }
    return _$2[paramInt];
  }
  
  public Integer _$$1(String paramString, Integer paramInteger)
  {
    return (Integer)this._$1.put(paramString, paramInteger);
  }
}
