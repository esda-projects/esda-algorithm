package com.github.esdaprojects.security;

import java.io.PrintStream;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

public class lIIlIIIlIIlIlllI
{
  private static final String _$2 = "AES";
  private static final String _$1 = "AES/ECB/PKCS5Padding";
  
  public static byte[] _$1()
  {
    KeyGenerator localKeyGenerator = null;
    try
    {
      localKeyGenerator = KeyGenerator.getInstance("AES");
    }
    catch (NoSuchAlgorithmException localNoSuchAlgorithmException)
    {
      localNoSuchAlgorithmException.printStackTrace();
      return new byte[0];
    }
    localKeyGenerator.init(128);
    SecretKey localSecretKey = localKeyGenerator.generateKey();
    return localSecretKey.getEncoded();
  }
  
  public static Key _$2(byte[] paramArrayOfByte)
  {
    return new SecretKeySpec(paramArrayOfByte, "AES");
  }
  
  public static byte[] _$2(byte[] paramArrayOfByte, Key paramKey)
    throws Exception
  {
    return _$2(paramArrayOfByte, paramKey, "AES/ECB/PKCS5Padding");
  }
  
  public static byte[] _$2(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
    throws Exception
  {
    return _$2(paramArrayOfByte1, paramArrayOfByte2, "AES/ECB/PKCS5Padding");
  }
  
  public static byte[] _$2(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, String paramString)
    throws Exception
  {
    Key localKey = _$2(paramArrayOfByte2);
    return _$2(paramArrayOfByte1, localKey, paramString);
  }
  
  public static byte[] _$2(byte[] paramArrayOfByte, Key paramKey, String paramString)
    throws Exception
  {
    Cipher localCipher = Cipher.getInstance(paramString);
    localCipher.init(1, paramKey);
    return localCipher.doFinal(paramArrayOfByte);
  }
  
  public static byte[] _$1(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
    throws Exception
  {
    return _$1(paramArrayOfByte1, paramArrayOfByte2, "AES/ECB/PKCS5Padding");
  }
  
  public static byte[] _$1(byte[] paramArrayOfByte, Key paramKey)
    throws Exception
  {
    return _$1(paramArrayOfByte, paramKey, "AES/ECB/PKCS5Padding");
  }
  
  public static byte[] _$1(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, String paramString)
    throws Exception
  {
    Key localKey = _$2(paramArrayOfByte2);
    return _$1(paramArrayOfByte1, localKey, paramString);
  }
  
  public static byte[] _$1(byte[] paramArrayOfByte, Key paramKey, String paramString)
    throws Exception
  {
    Cipher localCipher = Cipher.getInstance(paramString);
    localCipher.init(2, paramKey);
    return localCipher.doFinal(paramArrayOfByte);
  }
  
  private static String _$1(byte[] paramArrayOfByte)
  {
    if (null == paramArrayOfByte) {
      return null;
    }
    StringBuilder localStringBuilder = new StringBuilder("{");
    for (int k : paramArrayOfByte) {
      localStringBuilder.append(k).append(",");
    }
    localStringBuilder.deleteCharAt(localStringBuilder.length() - 1);
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
  
  public static void main(String[] paramArrayOfString)
    throws Exception
  {
    byte[] arrayOfByte1 = _$1();
    System.out.println("key: " + _$1(arrayOfByte1));
    Key localKey = _$2(arrayOfByte1);
    String str = "AES";
    System.out.println("o string:" + str);
    System.out.println("o byte[]:" + _$1(str.getBytes()));
    System.out.println();
    byte[] arrayOfByte2 = _$2(str.getBytes(), localKey);
    System.out.println("a byte[]:" + _$1(arrayOfByte2));
    System.out.println();
    byte[] arrayOfByte3 = _$1(arrayOfByte2, localKey);
    System.out.println("e byte[]:" + _$1(arrayOfByte3));
    System.out.println("e string:" + new String(arrayOfByte3));
  }
}
