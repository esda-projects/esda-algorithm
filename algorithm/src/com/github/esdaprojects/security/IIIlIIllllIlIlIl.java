package com.github.esdaprojects.security;

import java.io.PrintStream;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;

public class IIIlIIllllIlIlIl
{
  private static final String _$2 = "DES";
  private static final String _$1 = "DES/ECB/PKCS5Padding";
  
  public static byte[] _$1()
    throws Exception
  {
    KeyGenerator localKeyGenerator = KeyGenerator.getInstance("DES");
    localKeyGenerator.init(56);
    SecretKey localSecretKey = localKeyGenerator.generateKey();
    return localSecretKey.getEncoded();
  }
  
  private static Key _$2(byte[] paramArrayOfByte)
    throws Exception
  {
    DESKeySpec localDESKeySpec = new DESKeySpec(paramArrayOfByte);
    SecretKeyFactory localSecretKeyFactory = SecretKeyFactory.getInstance("DES");
    SecretKey localSecretKey = localSecretKeyFactory.generateSecret(localDESKeySpec);
    return localSecretKey;
  }
  
  public static byte[] _$2(byte[] paramArrayOfByte, Key paramKey)
    throws Exception
  {
    return _$2(paramArrayOfByte, paramKey, "DES/ECB/PKCS5Padding");
  }
  
  public static byte[] _$2(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
    throws Exception
  {
    return _$2(paramArrayOfByte1, paramArrayOfByte2, "DES/ECB/PKCS5Padding");
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
    return _$1(paramArrayOfByte1, paramArrayOfByte2, "DES/ECB/PKCS5Padding");
  }
  
  public static byte[] _$1(byte[] paramArrayOfByte, Key paramKey)
    throws Exception
  {
    return _$1(paramArrayOfByte, paramKey, "DES/ECB/PKCS5Padding");
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
    System.out.println("key：" + _$1(arrayOfByte1));
    Key localKey = _$2(arrayOfByte1);
    String str = "DES";
    System.out.println("o string:" + str);
    System.out.println("o byte[]:" + _$1(str.getBytes()));
    System.out.println();
    byte[] arrayOfByte2 = _$2(str.getBytes(), localKey);
    System.out.println("a byte[]:" + _$1(arrayOfByte2));
    System.out.println();
    byte[] arrayOfByte3 = _$1(arrayOfByte2, localKey);
    System.out.println("d byte[]:" + _$1(arrayOfByte3));
    System.out.println("d string:" + new String(arrayOfByte3));
  }
}
