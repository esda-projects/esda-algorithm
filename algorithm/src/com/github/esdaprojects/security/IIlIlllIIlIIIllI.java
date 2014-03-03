package com.github.esdaprojects.security;

import com.github.esdaprojects.math.IlIllllIllllIlll;
import com.github.esdaprojects.math.IllIllIllIllllll;
import com.github.esdaprojects.math.lIlIIIIlIIlllIlI;
import com.github.esdaprojects.math.llllllIIllIlllII;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.regex.Pattern;

public class IIlIlllIIlIIIllI
  implements IlIIlIlIllllIlIl
{
  private static Pattern _$34 = Pattern.compile("^\\d+([:-|]\\w([:-|]\\d+[\\dX]?([:-|].+)?)?)?$");
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
  private static final String _$23 = "锟絕?锟斤拷锟斤拷???锟斤拷锟斤拷锟絨?锟斤拷锟紹锟斤拷锟斤拷锟絋锟絨?";
  private static final int _$22 = 1;
  private static final int _$21 = 2;
  private static final int _$20 = 3;
  private static final int _$19 = 128;
  private static final int _$18 = 16;
  private static final String _$17 = "鎹肩澔飰繀銆佹湯锘楆飒傡ソ铹欎煱攴旉姱椴ょ媭霟介對銟匡煂銙ヮ棻鐕樸剷訃鈴冡謿軖鑳㈩雺掂獍氠濯犲埢須斥В饩勫彂铆鈨茧厸娅嬰腹洎屽韮鋶嶃巺錀股垮�榫ㄥ啠鋫忛姖悖惦捕?醿匡彃齑屷彫寰椾悧鞉х附鎽濁コ鎮佷繙鈭倛錄爺?喁涱�悒婁鈶滌嫇瓯㈤啎顟诡焾銤窌浜╂睎飺暫旮堧└鈹拨霌嗩鐞熶璁婄�霑︿爟飿庢劦鍨硅泚岫烆嚫闋戞韬旈瑸锜╈箷猓熻病瑜嶋喀鋲ㄤ啓獯忞仈氍";
  private static final byte[] _$16 = new byte['膧'];
  private static final int[] _$15 = new int['膧'];
  private static final int[] _$14 = new int['膧'];
  private static final int[] _$13 = new int['膧'];
  private static final int[] _$12 = new int['膧'];
  private static final byte[] _$11 = new byte['膧'];
  private static final int[] _$10 = new int['膧'];
  private static final int[] _$9 = new int['膧'];
  private static final int[] _$8 = new int['膧'];
  private static final int[] _$7 = new int['膧'];
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
  
  public String _$$2(String paramString)
  {
    String str1 = paramString;
    Object localObject444;
    byte[] arrayOfByte2;
    Object localObject5;
    Object localObject8;
    if (str1.matches(_$34.pattern()))
    {
      try
      {
        IllIllIllIllllll localIllIllIllIllllll = new IllIllIllIllllll(16);
        String[] localObject1 = str1.split("[:\\-,_|]");
        String[] localObject2 = new String[4];
        Object localObject3;
        if ((localObject1[0] != null) && (localObject1[0].matches("^\\d{11}$")))
        {
          localObject2[0] = _$4(localObject1[0].substring(1));
          localObject2[0] = ("a" + _$1(lIlIIIIlIIlllIlI._$1(localObject2[0], 10, 16), 9));
        }
        else if ((localObject1[0] != null) && (localObject1[0].matches("^\\w$")))
        {
          localObject3 = lIlIIIIlIIlllIlI._$1(localObject1[0], 62, 16);
          localObject2[0] = (((String)localObject3).length() + "a" + (String)localObject3);
        }
        if ((localObject1.length > 1) && (localObject1[1] != null) && (localObject1[1].matches("^\\w$")))
        {
          localObject3 = lIlIIIIlIIlllIlI._$1(localObject1[1], 62, 16);
          localObject2[1] = (((String)localObject3).length() + "a" + (String)localObject3);
        }
        else if ((localObject1.length > 1) && (localObject1[1] != null) && (localObject1[1].matches("^\\d{1,3}$")))
        {
          localObject3 = lIlIIIIlIIlllIlI._$1(localObject1[1], 10, 16);
          localObject2[1] = (((String)localObject3).length() + "b" + (String)localObject3);
        }
        String str2;
        Object localObject6;
        Object localObject7;
        String str6;
        StringBuffer localObject9;
		if ((localObject1.length > 2) && (localObject1[2] != null) && (localObject1[2].matches("^\\d{1,3}$")))
        {
          localObject3 = lIlIIIIlIIlllIlI._$1(localObject1[2], 10, 16);
          localObject2[2] = (((String)localObject3).length() + "a" + (String)localObject3);
        }
        else if ((localObject1.length > 2) && (localObject1[2] != null) && (localObject1[2].matches("^\\d{6}[12]\\d{3}[01]\\d[0123]\\d\\d{3}[\\dX]$")))
        {
          localObject2[2] = localObject1[2];
          localObject3 = localObject2[2].substring(0, 6);
          if (Integer.parseInt((String)localObject3) == 710000) {
            localObject3 = Integer.parseInt("0xA1220", 16) + "";
          }
          if (Integer.parseInt((String)localObject3) == 710001) {
            localObject3 = Integer.parseInt("0xA1221", 16) + "";
          }
          if (Integer.parseInt((String)localObject3) == 810000) {
            localObject3 = Integer.parseInt("0xA3930", 16) + "";
          }
          if (Integer.parseInt((String)localObject3) == 820000) {
            localObject3 = Integer.parseInt("0xA6040", 16) + "";
          }
          localObject3 = Integer.parseInt((String)localObject3) - 110000 + "";
          str2 = localObject2[2].substring(6, 10);
          String str3 = localObject2[2].substring(10, 12);
          localObject6 = localObject2[2].substring(12, localObject2[2].length() - 1);
          localObject7 = _$1(lIlIIIIlIIlllIlI._$1(str3, 10, 16), 1);
         String localObjectaaa = _$1(lIlIIIIlIIlllIlI._$1((String)localObject3, 10, 16), 5);
          String str5 = _$1(lIlIIIIlIIlllIlI._$1(Integer.parseInt(str2) - 1889 + "", 10, 16), 2);
          str6 = _$1(lIlIIIIlIIlllIlI._$1((String)localObject6, 10, 16), 4);
          String stabr7 = (String)localObject7 + localObjectaaa + str5 + str6;
          localObject2[2] = ("b" + stabr7);
        }
        else if ((localObject1.length > 2) && (localObject1[2] != null) && (localObject1[2].matches("^\\d+$")))
        {
          localObject3 = lIlIIIIlIIlllIlI._$1(localObject1[2], 10, 16);
          localObject2[2] = (((String)localObject3).length() + "c" + (String)localObject3);
        }
        else if ((localObject1.length > 2) && (localObject1[2] != null) && (localObject1[2].matches("^\\w+$")))
        {
          localObject3 = lIlIIIIlIIlllIlI._$1(localObject1[2], 62, 16);
          localObject2[2] = (((String)localObject3).length() + "d" + (String)localObject3);
        }
        if ((localObject1.length > 3) && (localObject1[3] != null) && (localObject1[3].matches("^\\w+$")))
        {
          localObject3 = lIlIIIIlIIlllIlI._$1(localObject1[3], 62, 16);
          localObject2[3] = (((String)localObject3).length() + "a" + (String)localObject3);
        }
        else if ((localObject1.length > 3) && (localObject1[3] != null) && (localObject1[3].matches("^[\\w\\u4E00-\\u9FA5\\uF900-\\uFA2D]+$")))
        {
          char[] a = localObject1[3].toCharArray();
          str2 = a.length + "b";
          for (int k = 0; k < a.length; k++) {
            str2 = str2 + _$1(Integer.toHexString(a[k]), 4);
          }
          localObject2[3] = str2;
        }
        for (int i = 0; i < localObject2.length; i++) {
          if (localObject2[i] == null) {
            localObject2[i] = "";
          }
        }
        str1 = lllIIIIIIIIlIIll._$1((Object[])localObject2, "");
        if (str1.length() > 64)
        {
          localObject444 = str1;
          for (int j = str1.length(); j > 64; j -= 4) {}
          int j = 0;
		str1 = str1.substring(0, j);
          String str4 = "";
          try
          {
            localObject6 = MessageDigest.getInstance("SHA");
            ((MessageDigest)localObject6).update(((String)localObject444).getBytes());
            byte[] localObjectA71 = ((MessageDigest)localObject6).digest();
            localObject9 = new StringBuffer();
            for (int i3 = 0; i3 < localObjectA71.length; i3++)
            {
              str6 = Integer.toHexString(localObjectA71[i3] & 0xFF);
              if (str6.length() < 2) {
                ((StringBuffer)localObject9).append(0);
              }
              ((StringBuffer)localObject9).append(str6);
            }
            str4 = str4 + ((StringBuffer)localObject9).toString();
          }
          catch (NoSuchAlgorithmException localNoSuchAlgorithmException3)
          {
            return null;
          }
          int n = 64 - str1.length();
          str1 = str1 + str4.substring(0, n);
        }
        str1 = _$1(str1, 64);
        str1 = _$4(str1);
        localObject444 = lIlIIIIlIIlllIlI._$1(str1, localIllIllIllIllllll);
        arrayOfByte2 = new byte[32];
        for (int m = 0; m < arrayOfByte2.length; m++) {
		Integer[] localObject4 = null;
		arrayOfByte2[m] = (byte)(((Integer) localObject4[2 * m]).intValue() << 4 | localObject4[2 * m + 1].intValue());
        }
       byte[] localObject51 = _$2(arrayOfByte2);
        Integer[] arrayOfInteger = new Integer[localObject51.length - 1];
        for (int i2 = 0; i2 < arrayOfInteger.length; i2++) {
          arrayOfInteger[i2] = Integer.valueOf(localObject51[i2] + 128);
        }
        localObject8 = Arrays.copyOf((byte[])localObject51, localObject51.length - 1);
        Object localObject911 = _$3((byte[])localObject8);
        return _$4((String)localObject911);
      }
      catch (llllllIIllIlllII localllllllIIllIlllII)
      {
        localllllllIIllIlllII.printStackTrace();
      }
      catch (IlIllllIllllIlll localIlIllllIllllIlll)
      {
        localIlIllllIllllIlll.printStackTrace();
      }
      catch (NumberFormatException localNumberFormatException)
      {
        localNumberFormatException.printStackTrace();
      }
      catch (UnsupportedEncodingException localUnsupportedEncodingException)
      {
        localUnsupportedEncodingException.printStackTrace();
      }
      return null;
    }
    byte[] arrayOfByte1 = _$2(str1.getBytes());
    Object localObject1 = Arrays.copyOfRange(arrayOfByte1, 0, arrayOfByte1.length - 1);
    Arrays.sort((byte[])localObject1);
    localObject1 = _$2((byte[])localObject1);
    Object localObject2 = "";
    int i1;
    try
    {
      localObject444 = MessageDigest.getInstance("SHA");
      ((MessageDigest)localObject444).update(arrayOfByte1);
      arrayOfByte2 = ((MessageDigest)localObject444).digest();
      localObject5 = new StringBuffer();
      for (i1 = 0; i1 < arrayOfByte2.length; i1++)
      {
        localObject8 = Integer.toHexString(arrayOfByte2[i1] & 0xFF);
        if (((String)localObject8).length() < 2) {
          ((StringBuffer)localObject5).append(0);
        }
        ((StringBuffer)localObject5).append((String)localObject8);
      }
      localObject2 = (String)localObject2 + ((StringBuffer)localObject5).toString();
    }
    catch (NoSuchAlgorithmException localNoSuchAlgorithmException1)
    {
      return null;
    }
    try
    {
      MessageDigest localMessageDigest = MessageDigest.getInstance("SHA");
      localMessageDigest.update((byte[])localObject1);
      arrayOfByte2 = localMessageDigest.digest();
      localObject5 = new StringBuffer();
      for (i1 = 0; i1 < arrayOfByte2.length; i1++)
      {
        localObject8 = Integer.toHexString(arrayOfByte2[i1] & 0xFF);
        if (((String)localObject8).length() < 2) {
          ((StringBuffer)localObject5).append(0);
        }
        ((StringBuffer)localObject5).append((String)localObject8);
      }
      localObject2 = (String)localObject2 + ((StringBuffer)localObject5).toString();
    }
    catch (NoSuchAlgorithmException localNoSuchAlgorithmException2)
    {
      return null;
    }
    return ((String)localObject2).substring(1, 65);
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
    return _$1(paramString, null);
  }
  
  private static String _$1(String paramString, Character paramCharacter)
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
      _$1(arrayOfByte2, _$32);
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
  
  private static void _$1(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
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
      String i9 = "鎹肩澔飰繀銆佹湯锘楆飒傡ソ铹欎煱攴旉姱椴ょ媭霟介對銟匡煂銙ヮ棻鐕樸剷訃鈴冡謿軖鑳㈩雺掂獍氠濯犲埢須斥В饩勫彂铆鈨茧厸娅嬰腹洎屽韮鋶嶃巺錀股垮�榫ㄥ啠鋫忛姖悖惦捕?醿匡彃齑屷彫寰椾悧鞉х附鎽濁コ鎮佷繙鈭倛錄爺?喁涱�悒婁鈶滌嫇瓯㈤啎顟诡焾銤窌浜╂睎飺暫旮堧└鈹拨霌嗩鐞熶璁婄�霑︿爟飿庢劦鍨硅泚岫烆嚫闋戞韬旈瑸锜╈箷猓熻病瑜嶋喀鋲ㄤ啓獯忞仈氍�.charAt(n >>> 1)";
      int j = (byte)((n & 0x1) == 0 ? n >>> 8 : n) & 0xFF;
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
    byte[] arrayOfByte1 = "锟絕?锟斤拷锟斤拷???锟斤拷锟斤拷锟絨?锟斤拷锟紹锟斤拷锟斤拷锟絋锟絨?".getBytes();
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
