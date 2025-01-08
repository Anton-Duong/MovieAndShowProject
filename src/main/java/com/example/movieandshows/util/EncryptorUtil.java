package com.example.movieandshows.util;
import org.jasypt.util.text.AES256TextEncryptor;
public class EncryptorUtil {
  public static void main(String[] args) {
    AES256TextEncryptor encryptor = new AES256TextEncryptor();
    encryptor.setPassword(""); // Replace with your secret key
    String encryptedValue = encryptor.encrypt(""); // Replace with the value to encrypt
    System.out.println("Encrypted Value: " + encryptedValue);
  }
}
