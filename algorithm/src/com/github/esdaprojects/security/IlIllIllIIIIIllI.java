package com.github.esdaprojects.security;

import com.github.esdaprojects.math.IlIllllIllllIlll;
import com.github.esdaprojects.math.IllIllIllIllllll;
import com.github.esdaprojects.math.lIlIIIIlIIlllIlI;
import com.github.esdaprojects.math.llllllIIllIlllII;
import java.io.UnsupportedEncodingException;
import java.security.Key;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

public class IlIllIllIIIIIllI
  implements IlIIlIlIllllIlIl
{
  private static final int _$34 = 32;
  private static final int _$33 = 16;
  private static final byte[] _$32 = new byte[16];
  private static final StringBuilder _$31 = new StringBuilder(64);
  private static final char[] _$30 = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f' };
  private static final char _$29 = 'D';
  private static final char _$28 = 'F';
  private static final char _$27 = 'M';
  private static final char _$26 = 'Y';
  private static final StringBuilder _$25 = new StringBuilder();
  private static final StringBuilder _$24 = new StringBuilder();
  private static final String _$23 = "ᾤ껝꼬퉖躛Ჰइ者⤮";
  private static final int _$22 = 1;
  private static final int _$21 = 2;
  private static final int _$20 = 3;
  private static final int _$19 = 128;
  private static final int _$18 = 16;
  private static final String _$17 = "捼睻濅、末ﻗꭶ쪂쥽繁䟰귔ꊯ鲤狀럽錦㘿㒥燘ㄕӇ⏃ᢖ֚ܒ胢뉵ঃⰚ᭮媠刻횳⧣⾄发í⃼녛櫋븹䩌壏탯꫻䍍㎅䗹ɿ值龨冣䂏銝㣵벶?ჿ촌Ꮼ得䐗쒧總摝ᥳ悁俜∪邈䛮렔?௛㨊䤆⑜싓걢醕㝭跕亩汖敺금멸┮Ღ듆琟䮽變瀾땦䠃愵垹蛁ᶞ頑槙躔鬞蟩칕⣟財褍뿦䉨䆙ⴏ끔묖";
  private static final byte[] _$16 = new byte['Ā'];
  private static final int[] _$15 = new int['Ā'];
  private static final int[] _$14 = new int['Ā'];
  private static final int[] _$13 = new int['Ā'];
  private static final int[] _$12 = new int['Ā'];
  private static final byte[] _$11 = new byte['Ā'];
  private static final int[] _$10 = new int['Ā'];
  private static final int[] _$9 = new int['Ā'];
  private static final int[] _$8 = new int['Ā'];
  private static final int[] _$7 = new int['Ā'];
  private static final int[] _$6 = new int[10];
  private static int _$5 = 0;
  private static int _$4 = 0;
  private static int _$3 = 0;
  private static int[] _$2 = null;
  private static int[] _$1 = null;
  
  private String _$1(String paramString, int paramInt)
  {
    if (paramString.length() < paramInt)
    {
      int i = paramInt - paramString.length();
      for (int j = 0; j < i; j++) {
        paramString = "0" + paramString;
      }
    }
    return paramString;
  }
  
  private String _$5(String paramString)
  {
    char[] arrayOfChar = paramString.toCharArray();
    String str = "";
    for (int i = 0; i < arrayOfChar.length; i++)
    {
      int j = arrayOfChar[i];
      str = str + Integer.toHexString(j);
    }
    return str;
  }
  
  public String _$$2(String paramString)
  {
    String str1 = paramString;
    String str2 = "鍐颔瓧萹햘餐测";
    String str3 = "䮮頷鞀⬈䴕隙긘䖣ꉏꜿპ讧頟⟡켫倸娧ﱁሜ匮ﴡ";
    String str4 = _$5(str2);
    byte[] arrayOfByte1 = _$1(str4);
    Key localKey = lIIlIIIlIIlIlllI._$2(arrayOfByte1);
    try
    {
      str3 = new String(lIIlIIIlIIlIlllI._$1(_$1(_$5(str3)), localKey));
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
    Object localObject1;
    String str6;
    Object localObject2;
    Object localObject3;
    String str9;
    if (str1.matches(str3))
    {
      localObject1 = str1.substring(0, 6);
      if (Integer.parseInt((String)localObject1) == 710000) {
        localObject1 = Integer.parseInt("0xA1220", 16) + "";
      }
      if (Integer.parseInt((String)localObject1) == 710001) {
        localObject1 = Integer.parseInt("0xA1221", 16) + "";
      }
      if (Integer.parseInt((String)localObject1) == 810000) {
        localObject1 = Integer.parseInt("0xA3930", 16) + "";
      }
      if (Integer.parseInt((String)localObject1) == 820000) {
        localObject1 = Integer.parseInt("0xA6040", 16) + "";
      }
      localObject1 = Integer.parseInt((String)localObject1) - 110000 + "";
      String str5 = str1.substring(6, 10);
      str6 = str1.substring(10, 12);
      localObject2 = str1.substring(12, str1.length() - 1);
      try
      {
        String str7 = _$1(lIlIIIIlIIlllIlI._$1(str6, 10, 16), 1);
        localObject3 = _$1(lIlIIIIlIIlllIlI._$1((String)localObject1, 10, 16), 5);
        String str8 = _$1(lIlIIIIlIIlllIlI._$1(Integer.parseInt(str5) - 1889 + "", 10, 16), 2);
        str9 = _$1(lIlIIIIlIIlllIlI._$1((String)localObject2, 10, 16), 4);
        String str10 = str7 + (String)localObject3 + str8 + str9;
        String str11 = str1.substring(str1.length() - 1, str1.length());
        str1 = "b" + str10 + (str11.matches("[Xx]") ? "a" : str11);
      }
      catch (llllllIIllIlllII localllllllIIllIlllII2)
      {
        try
        {
          localObject3 = str1.getBytes("UTF-8");
        }
        catch (UnsupportedEncodingException localUnsupportedEncodingException3)
        {
          localObject3 = str1.getBytes();
        }
        str1 = "a" + _$3((byte[])localObject3);
      }
      catch (IlIllllIllllIlll localIlIllllIllllIlll2)
      {
        try
        {
          localObject3 = str1.getBytes("UTF-8");
        }
        catch (UnsupportedEncodingException localUnsupportedEncodingException4)
        {
          localObject3 = str1.getBytes();
        }
        str1 = "a" + _$3((byte[])localObject3);
      }
      catch (UnsupportedEncodingException localUnsupportedEncodingException2)
      {
        try
        {
          localObject3 = str1.getBytes("UTF-8");
        }
        catch (UnsupportedEncodingException localUnsupportedEncodingException5)
        {
          localObject3 = str1.getBytes();
        }
        str1 = "a" + _$3((byte[])localObject3);
      }
    }
    else
    {
      try
      {
        localObject1 = str1.getBytes("UTF-8");
      }
      catch (UnsupportedEncodingException localUnsupportedEncodingException1)
      {
        localObject1 = str1.getBytes();
      }
      str1 = "a" + _$3((byte[])localObject1);
    }
    if (str1.length() > 32)
    {
      localObject1 = str1;
      int i;
      for (i = str1.length(); i > 32; i -= 4) {}
	str1 = str1.substring(0, i);
      str6 = "";
      try
      {
        localObject2 = MessageDigest.getInstance("SHA");
        ((MessageDigest)localObject2).update(((String)localObject1).getBytes());
        byte[] arrayOfByte4 = ((MessageDigest)localObject2).digest();
        localObject3 = new StringBuffer();
        for (int n = 0; n < arrayOfByte4.length; n++)
        {
          str9 = Integer.toHexString(arrayOfByte4[n] & 0xFF);
          if (str9.length() < 2) {
            ((StringBuffer)localObject3).append(0);
          }
          ((StringBuffer)localObject3).append(str9);
        }
        str6 = str6 + ((StringBuffer)localObject3).toString();
      }
      catch (NoSuchAlgorithmException localNoSuchAlgorithmException)
      {
        return null;
      }
      int k = 32 - str1.length();
      str1 = str1 + str6.substring(0, k);
    }
    str1 = _$1(str1, 32);
    str1 = _$4(str1);
    try
    {
      Integer[] localObject11 = lIlIIIIlIIlllIlI._$1(str1, new IllIllIllIllllll(16));
      byte[] arrayOfByte2 = new byte[16];
      for (int j = 0; j < arrayOfByte2.length; j++) {
        arrayOfByte2[j] = ((byte)(localObject11[(2 * j)].intValue() << 4 | localObject11[(2 * j + 1)].intValue()));
      }
      byte[] arrayOfByte3 = _$2(arrayOfByte2);
      Integer[] arrayOfInteger = new Integer[arrayOfByte3.length - 1];
      for (int m = 0; m < arrayOfInteger.length; m++) {
        arrayOfInteger[m] = Integer.valueOf(arrayOfByte3[m] + 128);
      }
      byte[] arrayOfByte5 = Arrays.copyOf(arrayOfByte3, arrayOfByte3.length - 1);
      localObject3 = _$3(arrayOfByte5);
      return _$4((String)localObject3);
    }
    catch (llllllIIllIlllII localllllllIIllIlllII1)
    {
      return null;
    }
    catch (IlIllllIllllIlll localIlIllllIllllIlll1) {}
    return null;
  }
  
  private String _$4(String paramString)
  {
    if (paramString == null) {
      return null;
    }
    char[] arrayOfChar1 = paramString.toCharArray();
    char[] arrayOfChar2 = new char[arrayOfChar1.length / 2 + arrayOfChar1.length % 2];
    char[] arrayOfChar3 = new char[arrayOfChar1.length / 2 + arrayOfChar1.length % 2];
    for (int i = 0; i < arrayOfChar1.length; i++) {
      if (i % 2 == 0) {
        arrayOfChar2[(i / 2)] = arrayOfChar1[i];
      } else {
        arrayOfChar3[(i / 2)] = arrayOfChar1[i];
      }
    }
    _$1(arrayOfChar2);
    for (int i = 0; i < arrayOfChar1.length; i++) {
      if (i % 2 == 0) {
        arrayOfChar1[i] = arrayOfChar2[(i / 2)];
      } else {
        arrayOfChar1[i] = arrayOfChar3[(i / 2)];
      }
    }
    _$2(arrayOfChar1);
    return new String(arrayOfChar1);
  }
  
  private void _$2(char[] paramArrayOfChar)
  {
    if (paramArrayOfChar.length < 2) {
      return;
    }
    int i = paramArrayOfChar[0];
    for (int j = 1; j < paramArrayOfChar.length; j++) {
      paramArrayOfChar[(j - 1)] = paramArrayOfChar[j];
    }
    paramArrayOfChar[(paramArrayOfChar.length - 1)] = (char) i;
  }
  
  private static void _$1(char[] paramArrayOfChar)
  {
    int i = 0;
    int j = paramArrayOfChar.length - 1;
    while (j > 2 * i)
    {
      int k = paramArrayOfChar[i];
      paramArrayOfChar[i] = paramArrayOfChar[(j - i)];
      paramArrayOfChar[(j - i)] = (char) k;
      i++;
    }
  }
  
  private static String _$3(String paramString)
  {
    return _$2(paramString, null);
  }
  
  private static String _$2(String paramString, Character paramCharacter)
  {
    if ((paramString == null) || (paramString.trim().length() == 0)) {
      return "";
    }
    String str = "";
    try
    {
      str = _$1(_$2(paramString.getBytes()), paramCharacter);
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
    return str;
  }
  
  private static String _$2(String paramString)
  {
    if ((paramString == null) || (paramString.trim().length() == 0)) {
      return "";
    }
    String str = "";
    try
    {
      str = _$3(_$2(paramString.getBytes()));
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
    return str;
  }
  
  private static String _$1(byte[] paramArrayOfByte, Character paramCharacter)
    throws UnsupportedEncodingException
  {
    _$25.delete(0, _$25.length());
    for (char c : new String(paramArrayOfByte, "latin1").toCharArray()) {
      if (c == '\n') {
        _$25.append('D').append('F');
      } else if (c == '\r') {
        _$25.append('D').append('Y');
      } else if (c == 'D') {
        _$25.append('D').append('D');
      } else if ((paramCharacter != null) && (c == paramCharacter.charValue())) {
        _$25.append('D').append('M');
      } else {
        _$25.append(c);
      }
    }
    return _$25.toString();
  }
  
  private static byte[] _$1(String paramString, Character paramCharacter)
    throws UnsupportedEncodingException
  {
    _$24.delete(0, _$24.length());
    for (int i = 0; i < paramString.length(); i++)
    {
      char c = paramString.charAt(i);
      if (c == 'D')
      {
        int j = paramString.charAt(i + 1);
        if (j == 68) {
          _$24.append('D');
        } else if (j == 70) {
          _$24.append('\n');
        } else if (j == 89) {
          _$24.append('\r');
        } else if ((paramCharacter != null) && (j == 77)) {
          _$24.append(paramCharacter);
        }
        i++;
      }
      else
      {
        _$24.append(c);
      }
    }
    return _$24.toString().getBytes("latin1");
  }
  
  private static String _$3(byte[] paramArrayOfByte)
  {
    _$31.delete(0, _$31.length());
    for (int i = 0; i < paramArrayOfByte.length; i++)
    {
      int j = paramArrayOfByte[i];
      _$31.append(_$30[((j & 0xF0) >> 4)]).append(_$30[(j & 0xF)]);
    }
    return _$31.toString();
  }
  
  private static byte[] _$1(String paramString)
  {
    char[] arrayOfChar = paramString.toCharArray();
    byte[] arrayOfByte = new byte[arrayOfChar.length / 2];
    for (int i = 0; i < arrayOfByte.length; i++) {
      arrayOfByte[i] = ((byte)((_$1(arrayOfChar[(i << 1)]) << 4) + _$1(arrayOfChar[((i << 1) + 1)])));
    }
    return arrayOfByte;
  }
  
  private static int _$1(char paramChar)
  {
    return paramChar < ':' ? paramChar - '0' : paramChar - 'W';
  }
  
  private static byte[] _$2(byte[] paramArrayOfByte)
  {
    int i = (int)Math.ceil(paramArrayOfByte.length / 16.0D);
    byte[] arrayOfByte1 = new byte[i * 16 + 1];
    for (int j = 0; j < i; j++)
    {
      int k = 16 * j;
      byte[] arrayOfByte2 = Arrays.copyOfRange(paramArrayOfByte, k, k + 16);
      _$2(arrayOfByte2, _$32);
      System.arraycopy(_$32, 0, arrayOfByte1, k, 16);
    }
    arrayOfByte1[(arrayOfByte1.length - 1)] = ((byte)(paramArrayOfByte.length % 16));
    return arrayOfByte1;
  }
  
  private static void _$1(byte[] paramArrayOfByte)
  {
    int j = 0;
    int k = 0;
    for (int m = 0; k < _$4; m += 4)
    {
      _$2[k] = (paramArrayOfByte[m] << 24 | (paramArrayOfByte[(m + 1)] & 0xFF) << 16 | (paramArrayOfByte[(m + 2)] & 0xFF) << 8 | paramArrayOfByte[(m + 3)] & 0xFF);
      k++;
    }
    k = _$4;
    for (int m = 0; k < _$3; m--)
    {
      int i = _$2[(k - 1)];
      if (m == 0)
      {
        m = _$4;
        i = _$16[(i >>> 16 & 0xFF)] << 24 | (_$16[(i >>> 8 & 0xFF)] & 0xFF) << 16 | (_$16[(i & 0xFF)] & 0xFF) << 8 | _$16[(i >>> 24)] & 0xFF;
        i ^= _$6[(j++)];
      }
      else if ((_$4 == 8) && (m == 4))
      {
        i = _$16[(i >>> 24)] << 24 | (_$16[(i >>> 16 & 0xFF)] & 0xFF) << 16 | (_$16[(i >>> 8 & 0xFF)] & 0xFF) << 8 | _$16[(i & 0xFF)] & 0xFF;
      }
      _$2[k] = (_$2[(k - _$4)] ^ i);
      k++;
    }
    int i = 0;
  }
  
  private static void _$1()
  {
    int i = 0;
    int j = 4 * _$5;
    _$1[i] = _$2[j];
    _$1[(i + 1)] = _$2[(j + 1)];
    _$1[(i + 2)] = _$2[(j + 2)];
    _$1[(i + 3)] = _$2[(j + 3)];
    i += 4;
    j -= 4;
    for (int m = 1; m < _$5; m++)
    {
      int k = _$2[j];
      _$1[i] = (_$10[(_$16[(k >>> 24)] & 0xFF)] ^ _$9[(_$16[(k >>> 16 & 0xFF)] & 0xFF)] ^ _$8[(_$16[(k >>> 8 & 0xFF)] & 0xFF)] ^ _$7[(_$16[(k & 0xFF)] & 0xFF)]);
      k = _$2[(j + 1)];
      _$1[(i + 1)] = (_$10[(_$16[(k >>> 24)] & 0xFF)] ^ _$9[(_$16[(k >>> 16 & 0xFF)] & 0xFF)] ^ _$8[(_$16[(k >>> 8 & 0xFF)] & 0xFF)] ^ _$7[(_$16[(k & 0xFF)] & 0xFF)]);
      k = _$2[(j + 2)];
      _$1[(i + 2)] = (_$10[(_$16[(k >>> 24)] & 0xFF)] ^ _$9[(_$16[(k >>> 16 & 0xFF)] & 0xFF)] ^ _$8[(_$16[(k >>> 8 & 0xFF)] & 0xFF)] ^ _$7[(_$16[(k & 0xFF)] & 0xFF)]);
      k = _$2[(j + 3)];
      _$1[(i + 3)] = (_$10[(_$16[(k >>> 24)] & 0xFF)] ^ _$9[(_$16[(k >>> 16 & 0xFF)] & 0xFF)] ^ _$8[(_$16[(k >>> 8 & 0xFF)] & 0xFF)] ^ _$7[(_$16[(k & 0xFF)] & 0xFF)]);
      i += 4;
      j -= 4;
    }
    _$1[i] = _$2[j];
    _$1[(i + 1)] = _$2[(j + 1)];
    _$1[(i + 2)] = _$2[(j + 2)];
    _$1[(i + 3)] = _$2[(j + 3)];
  }
  
  private static void _$1(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    throws RuntimeException
  {
    if ((paramInt1 != 128) && (paramInt1 != 192) && (paramInt1 != 256)) {
      throw new RuntimeException("Invalid AES key size (" + paramInt1 + " bits)");
    }
    _$4 = paramInt1 >>> 5;
    _$5 = _$4 + 6;
    _$3 = 4 * (_$5 + 1);
    _$2 = new int[_$3];
    _$1 = new int[_$3];
    if ((paramInt2 & 0x3) != 0)
    {
      _$1(paramArrayOfByte);
      if ((paramInt2 & 0x2) != 0) {
        _$1();
      }
    }
  }
  
  private static void _$1(byte[] paramArrayOfByte, int paramInt)
    throws RuntimeException
  {
    _$1(paramArrayOfByte, paramInt, 3);
  }
  
  private static void _$2(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    int i = 0;
    int k = (paramArrayOfByte1[0] << 24 | (paramArrayOfByte1[1] & 0xFF) << 16 | (paramArrayOfByte1[2] & 0xFF) << 8 | paramArrayOfByte1[3] & 0xFF) ^ _$2[0];
    int m = (paramArrayOfByte1[4] << 24 | (paramArrayOfByte1[5] & 0xFF) << 16 | (paramArrayOfByte1[6] & 0xFF) << 8 | paramArrayOfByte1[7] & 0xFF) ^ _$2[1];
    int n = (paramArrayOfByte1[8] << 24 | (paramArrayOfByte1[9] & 0xFF) << 16 | (paramArrayOfByte1[10] & 0xFF) << 8 | paramArrayOfByte1[11] & 0xFF) ^ _$2[2];
    int i1 = (paramArrayOfByte1[12] << 24 | (paramArrayOfByte1[13] & 0xFF) << 16 | (paramArrayOfByte1[14] & 0xFF) << 8 | paramArrayOfByte1[15] & 0xFF) ^ _$2[3];
    for (int i2 = 1; i2 < _$5; i2++)
    {
      i += 4;
      int i3 = _$15[(k >>> 24)] ^ _$14[(m >>> 16 & 0xFF)] ^ _$13[(n >>> 8 & 0xFF)] ^ _$12[(i1 & 0xFF)] ^ _$2[i];
      int i4 = _$15[(m >>> 24)] ^ _$14[(n >>> 16 & 0xFF)] ^ _$13[(i1 >>> 8 & 0xFF)] ^ _$12[(k & 0xFF)] ^ _$2[(i + 1)];
      int i5 = _$15[(n >>> 24)] ^ _$14[(i1 >>> 16 & 0xFF)] ^ _$13[(k >>> 8 & 0xFF)] ^ _$12[(m & 0xFF)] ^ _$2[(i + 2)];
      int i6 = _$15[(i1 >>> 24)] ^ _$14[(k >>> 16 & 0xFF)] ^ _$13[(m >>> 8 & 0xFF)] ^ _$12[(n & 0xFF)] ^ _$2[(i + 3)];
      k = i3;
      m = i4;
      n = i5;
      i1 = i6;
    }
    i += 4;
    int j = _$2[i];
    paramArrayOfByte2[0] = ((byte)(_$16[(k >>> 24)] ^ j >>> 24));
    paramArrayOfByte2[1] = ((byte)(_$16[(m >>> 16 & 0xFF)] ^ j >>> 16));
    paramArrayOfByte2[2] = ((byte)(_$16[(n >>> 8 & 0xFF)] ^ j >>> 8));
    paramArrayOfByte2[3] = ((byte)(_$16[(i1 & 0xFF)] ^ j));
    j = _$2[(i + 1)];
    paramArrayOfByte2[4] = ((byte)(_$16[(m >>> 24)] ^ j >>> 24));
    paramArrayOfByte2[5] = ((byte)(_$16[(n >>> 16 & 0xFF)] ^ j >>> 16));
    paramArrayOfByte2[6] = ((byte)(_$16[(i1 >>> 8 & 0xFF)] ^ j >>> 8));
    paramArrayOfByte2[7] = ((byte)(_$16[(k & 0xFF)] ^ j));
    j = _$2[(i + 2)];
    paramArrayOfByte2[8] = ((byte)(_$16[(n >>> 24)] ^ j >>> 24));
    paramArrayOfByte2[9] = ((byte)(_$16[(i1 >>> 16 & 0xFF)] ^ j >>> 16));
    paramArrayOfByte2[10] = ((byte)(_$16[(k >>> 8 & 0xFF)] ^ j >>> 8));
    paramArrayOfByte2[11] = ((byte)(_$16[(m & 0xFF)] ^ j));
    j = _$2[(i + 3)];
    paramArrayOfByte2[12] = ((byte)(_$16[(i1 >>> 24)] ^ j >>> 24));
    paramArrayOfByte2[13] = ((byte)(_$16[(k >>> 16 & 0xFF)] ^ j >>> 16));
    paramArrayOfByte2[14] = ((byte)(_$16[(m >>> 8 & 0xFF)] ^ j >>> 8));
    paramArrayOfByte2[15] = ((byte)(_$16[(n & 0xFF)] ^ j));
  }
  
  private static void _$1(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    int i = 0;
    int k = (paramArrayOfByte1[0] << 24 | (paramArrayOfByte1[1] & 0xFF) << 16 | (paramArrayOfByte1[2] & 0xFF) << 8 | paramArrayOfByte1[3] & 0xFF) ^ _$1[0];
    int m = (paramArrayOfByte1[4] << 24 | (paramArrayOfByte1[5] & 0xFF) << 16 | (paramArrayOfByte1[6] & 0xFF) << 8 | paramArrayOfByte1[7] & 0xFF) ^ _$1[1];
    int n = (paramArrayOfByte1[8] << 24 | (paramArrayOfByte1[9] & 0xFF) << 16 | (paramArrayOfByte1[10] & 0xFF) << 8 | paramArrayOfByte1[11] & 0xFF) ^ _$1[2];
    int i1 = (paramArrayOfByte1[12] << 24 | (paramArrayOfByte1[13] & 0xFF) << 16 | (paramArrayOfByte1[14] & 0xFF) << 8 | paramArrayOfByte1[15] & 0xFF) ^ _$1[3];
    for (int i2 = 1; i2 < _$5; i2++)
    {
      i += 4;
      int i3 = _$10[(k >>> 24)] ^ _$9[(i1 >>> 16 & 0xFF)] ^ _$8[(n >>> 8 & 0xFF)] ^ _$7[(m & 0xFF)] ^ _$1[i];
      int i4 = _$10[(m >>> 24)] ^ _$9[(k >>> 16 & 0xFF)] ^ _$8[(i1 >>> 8 & 0xFF)] ^ _$7[(n & 0xFF)] ^ _$1[(i + 1)];
      int i5 = _$10[(n >>> 24)] ^ _$9[(m >>> 16 & 0xFF)] ^ _$8[(k >>> 8 & 0xFF)] ^ _$7[(i1 & 0xFF)] ^ _$1[(i + 2)];
      int i6 = _$10[(i1 >>> 24)] ^ _$9[(n >>> 16 & 0xFF)] ^ _$8[(m >>> 8 & 0xFF)] ^ _$7[(k & 0xFF)] ^ _$1[(i + 3)];
      k = i3;
      m = i4;
      n = i5;
      i1 = i6;
    }
    i += 4;
    int j = _$1[i];
    paramArrayOfByte2[0] = ((byte)(_$11[(k >>> 24)] ^ j >>> 24));
    paramArrayOfByte2[1] = ((byte)(_$11[(i1 >>> 16 & 0xFF)] ^ j >>> 16));
    paramArrayOfByte2[2] = ((byte)(_$11[(n >>> 8 & 0xFF)] ^ j >>> 8));
    paramArrayOfByte2[3] = ((byte)(_$11[(m & 0xFF)] ^ j));
    j = _$1[(i + 1)];
    paramArrayOfByte2[4] = ((byte)(_$11[(m >>> 24)] ^ j >>> 24));
    paramArrayOfByte2[5] = ((byte)(_$11[(k >>> 16 & 0xFF)] ^ j >>> 16));
    paramArrayOfByte2[6] = ((byte)(_$11[(i1 >>> 8 & 0xFF)] ^ j >>> 8));
    paramArrayOfByte2[7] = ((byte)(_$11[(n & 0xFF)] ^ j));
    j = _$1[(i + 2)];
    paramArrayOfByte2[8] = ((byte)(_$11[(n >>> 24)] ^ j >>> 24));
    paramArrayOfByte2[9] = ((byte)(_$11[(m >>> 16 & 0xFF)] ^ j >>> 16));
    paramArrayOfByte2[10] = ((byte)(_$11[(k >>> 8 & 0xFF)] ^ j >>> 8));
    paramArrayOfByte2[11] = ((byte)(_$11[(i1 & 0xFF)] ^ j));
    j = _$1[(i + 3)];
    paramArrayOfByte2[12] = ((byte)(_$11[(i1 >>> 24)] ^ j >>> 24));
    paramArrayOfByte2[13] = ((byte)(_$11[(n >>> 16 & 0xFF)] ^ j >>> 16));
    paramArrayOfByte2[14] = ((byte)(_$11[(m >>> 8 & 0xFF)] ^ j >>> 8));
    paramArrayOfByte2[15] = ((byte)(_$11[(k & 0xFF)] ^ j));
  }
  
  protected final void finalize()
  {
    int i;
    if (_$2 != null)
    {
      for (i = 0; i < _$2.length; i++) {
        _$2[i] = 0;
      }
      _$2 = null;
    }
    if (_$1 != null)
    {
      for (i = 0; i < _$1.length; i++) {
        _$1[i] = 0;
      }
      _$1 = null;
    }
  }
  
  static
  {
    int i = 283;
    for (int n = 0; n < 256; n++)
    {
      int i9 = "捼睻濅、末ﻗꭶ쪂쥽繁䟰귔ꊯ鲤狀럽錦㘿㒥燘ㄕӇ⏃ᢖ֚ܒ胢뉵ঃⰚ᭮媠刻횳⧣⾄发í⃼녛櫋븹䩌壏탯꫻䍍㎅䗹ɿ值龨冣䂏銝㣵벶?ჿ촌Ꮼ得䐗쒧總摝ᥳ悁俜∪邈䛮렔?௛㨊䤆⑜싓걢醕㝭跕亩汖敺금멸┮Ღ듆琟䮽變瀾땦䠃愵垹蛁ᶞ頑槙躔鬞蟩칕⣟財褍뿦䉨䆙ⴏ끔묖".charAt(n >>> 1);
      int j = (byte)((n & 0x1) == 0 ? i9 >>> 8 : i9) & 0xFF;
      int k = j << 1;
      if (k >= 256) {
        k ^= i;
      }
      int m = k ^ j;
      int i1 = n << 1;
      if (i1 >= 256) {
        i1 ^= i;
      }
      int i2 = i1 << 1;
      if (i2 >= 256) {
        i2 ^= i;
      }
      int i3 = i2 << 1;
      if (i3 >= 256) {
        i3 ^= i;
      }
      int i4 = i3 ^ n;
      int i5 = i4 ^ i1;
      int i6 = i4 ^ i2;
      int i7 = i3 ^ i2 ^ i1;
      _$16[n] = ((byte)j);
      int i8;
      _$15[n] = (i8 = k << 24 | j << 16 | j << 8 | m);
      _$14[n] = (i8 >>> 8 | i8 << 24);
      _$13[n] = (i8 >>> 16 | i8 << 16);
      _$12[n] = (i8 >>> 24 | i8 << 8);
      _$11[j] = ((byte)n);
      _$10[j] = (i8 = i7 << 24 | i4 << 16 | i6 << 8 | i5);
      _$9[j] = (i8 >>> 8 | i8 << 24);
      _$8[j] = (i8 >>> 16 | i8 << 16);
      _$7[j] = (i8 >>> 24 | i8 << 8);
    }
    int i9 = 1;
    _$6[0] = (i9 << 24);
    for (int i10 = 1; i10 < 10; i10++)
    {
      i9 <<= 1;
      if (i9 >= 256) {
        i9 ^= i;
      }
      _$6[i10] = (i9 << 24);
    }
    byte[] arrayOfByte1 = "ᾤ껝꼬퉖躛Ჰइ者⤮".getBytes();
    byte[] arrayOfByte2 = new byte[16];
    int k = 1;
    for (int m = 0; m < 16; m++)
    {
      k = 31 * k + m;
      arrayOfByte2[m] = arrayOfByte1[Math.abs(k % arrayOfByte1.length)];
    }
    _$1(arrayOfByte2, 128);
  }
}
