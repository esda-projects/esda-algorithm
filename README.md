# ESDA Algorithm Tools

## How to get

Using in maven:

```xml
<dependency>
	<groupId>com.github.esdaprojects</groupId>
	<artifactId>esda-algorithm</artifactId>
	<version>0.1</version>
</dependency>
```

## API

### DES

```java
byte[] arrayOfByte1 = IIIlIIllllIlIlIl._$1();
System.out.println("key " + IIIlIIllllIlIlIl._$1(arrayOfByte1));
Key localKey = IIIlIIllllIlIlIl._$2(arrayOfByte1);
String str = "DES";
System.out.println("o string:" + str);
System.out.println("o byte[]:" + IIIlIIllllIlIlIl._$1(str.getBytes()));
System.out.println();
byte[] arrayOfByte2 = IIIlIIllllIlIlIl._$2(str.getBytes(), localKey);
System.out.println("a byte[]:" + IIIlIIllllIlIlIl._$1(arrayOfByte2));
System.out.println();
byte[] arrayOfByte3 = IIIlIIllllIlIlIl._$1(arrayOfByte2, localKey);
System.out.println("d byte[]:" + IIIlIIllllIlIlIl._$1(arrayOfByte3));
System.out.println("d string:" + new String(arrayOfByte3));
```

### AES

```java
byte[] arrayOfByte1 = lIIlIIIlIIlIlllI._$1();
System.out.println("key: " + lIIlIIIlIIlIlllI._$1(arrayOfByte1));
Key localKey = lIIlIIIlIIlIlllI._$2(arrayOfByte1);
String str = "AES";
System.out.println("o string:" + str);
System.out.println("o byte[]:" + lIIlIIIlIIlIlllI._$1(str.getBytes()));
System.out.println();
byte[] arrayOfByte2 = _$2(str.getBytes(), localKey);
System.out.println("a byte[]:" + lIIlIIIlIIlIlllI._$1(arrayOfByte2));
System.out.println();
byte[] arrayOfByte3 = _$1(arrayOfByte2, localKey);
System.out.println("e byte[]:" + lIIlIIIlIIlIlllI._$1(arrayOfByte3));
System.out.println("e string:" + new String(arrayOfByte3));
```

### Security Hash

In the case of security authorization, using MD5 in the password encryption and verification process is not safe enough. Even though the SHA algorithm also has the potential to attack. That's why we use salt, you could call it 'sugar', as you like. So, we try to implement the abstract algorithm transformed the original before executing digest algorithm to avoid the conventional "rainbow table" attack.

## Why is class named like '1III1II'

We work for university and goverment in the past, so we named them like this for some special reasons and we were used it.

## Why open source

We think this project is useful for others, and we are very confident about its security.

## Who are we

ESDA is a computer algorithm research teams at an university, focusing on computer algorithms implement and data processing tools.

We are working on a digest algorithm now.