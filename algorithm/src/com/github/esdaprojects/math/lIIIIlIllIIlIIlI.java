package com.github.esdaprojects.math;

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

public class lIIIIlIllIIlIIlI
{
  private static final String _$3 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567";
  private static final String _$2 = "abcdefghijklmnopqrstuvwxyz018967";
  private static final int[] _$1 = { 255, 255, 26, 27, 28, 29, 30, 31, 255, 255, 255, 255, 255, 255, 255, 255, 255, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 255, 255, 255, 255, 255, 255, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 255, 255, 255, 255, 255 };
  
  public static String _$1(String paramString, int paramInt1, int paramInt2)
  {
    if (paramString == null) {
      return null;
    }
    byte[] arrayOfByte;
    try
    {
      arrayOfByte = paramString.getBytes("utf8");
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      return null;
    }
    int i = 0;
    int j = 0;
    int k = 0;
    int i1 = (arrayOfByte.length + 7) * 8 / 5;
    StringBuffer localStringBuffer1 = new StringBuffer(i1);
    StringBuffer localStringBuffer2 = new StringBuffer(i1 + 8);
    for (int i2 = 0; i2 < arrayOfByte.length; i2++)
    {
      Integer localInteger = Integer.valueOf(arrayOfByte[i2]);
      localStringBuffer2.append(Integer.toBinaryString(Math.abs(localInteger.intValue())).substring(1));
      if (localStringBuffer2.length() > i1) {
        break;
      }
    }
    while (i < arrayOfByte.length)
    {
      int m = arrayOfByte[i] >= 0 ? arrayOfByte[i] : arrayOfByte[i] + 256;
      if (j > 3)
      {
        int n;
        if (i + 1 < arrayOfByte.length) {
          n = arrayOfByte[(i + 1)] >= 0 ? arrayOfByte[(i + 1)] : arrayOfByte[(i + 1)] + 256;
        } else {
          n = 0;
        }
        k = m & 255 >> j;
        j = (j + 5) % 8;
        k <<= j;
        k |= n >> 8 - j;
        i++;
      }
      else
      {
        k = m >> 8 - (j + 5) & 0x1F;
        j = (j + 5) % 8;
        if (j == 0) {
          i++;
        }
      }
      if (localStringBuffer2.charAt(j) == '1') {
        localStringBuffer1.append("ABCDEFGHIJKLMNOPQRSTUVWXYZ234567".charAt(k));
      } else {
        localStringBuffer1.append("abcdefghijklmnopqrstuvwxyz018967".charAt(k));
      }
    }
    return localStringBuffer1.toString();
  }
  
  public static byte[] _$1(String paramString)
  {
    String str = paramString + "";
    for (int i = 0; i < 32; i++) {
      str = str.replaceAll("abcdefghijklmnopqrstuvwxyz018967".charAt(i) + "", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567".charAt(i) + "");
    }
    byte[] arrayOfByte = new byte[str.length() * 5 / 8];
    int i = 0;
    int j = 0;
    int m = 0;
    while (i < str.length())
    {
      int k = str.charAt(i) - '0';
      if ((k >= 0) && (k < _$1.length))
      {
        int n = _$1[k];
        if (n != 255) {
          if (j <= 3)
          {
            j = (j + 5) % 8;
            if (j == 0)
            {
              int tmp184_182 = m;
              byte[] tmp184_180 = arrayOfByte;
              tmp184_180[tmp184_182] = ((byte)(tmp184_180[tmp184_182] | n));
              m++;
              if (m >= arrayOfByte.length) {
                break;
              }
            }
            else
            {
              int tmp209_207 = m;
              byte[] tmp209_205 = arrayOfByte;
              tmp209_205[tmp209_207] = ((byte)(tmp209_205[tmp209_207] | n << 8 - j));
            }
          }
          else
          {
            j = (j + 5) % 8;
            int tmp235_233 = m;
            byte[] tmp235_231 = arrayOfByte;
            tmp235_231[tmp235_233] = ((byte)(tmp235_231[tmp235_233] | n >>> j));
            m++;
            if (m >= arrayOfByte.length) {
              break;
            }
            int tmp262_260 = m;
            byte[] tmp262_258 = arrayOfByte;
            tmp262_258[tmp262_260] = ((byte)(tmp262_258[tmp262_260] | n << 8 - j));
          }
        }
      }
      i++;
    }
    return arrayOfByte;
  }
  
  public static void main(String[] paramArrayOfString)
    throws UnsupportedEncodingException
  {
    String str1 = "hello，USA! yu7654wedfgnhjmki78u6y54redfdv";
    String str2 = _$1(str1, 256, 62);
    System.out.println(str2);
    System.out.println(new String(_$1(str2), "utf8"));
  }
}
