package com.APi.uniapp.until;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.nio.charset.StandardCharsets;
import java.math.BigInteger;
public class Sha256 {

    public static String sha256(String input) {
        try {
            // 实例化一个MessageDigest对象并指定SHA-256算法
            MessageDigest digest = MessageDigest.getInstance("SHA-256");

            // 使用指定的字符编码将输入字符串转换为字节数组
            byte[] hash = digest.digest(input.getBytes(StandardCharsets.UTF_8));

            // 将字节数组转换为大整数
            BigInteger number = new BigInteger(1, hash);

            // 将大整数转换为16进制字符串
            StringBuilder hexString = new StringBuilder(number.toString(16));

            // 如果生成的字符串长度小于32，则在前面补0
            while (hexString.length() < 32) {
                hexString.insert(0, '0');
            }

            return hexString.toString();

        } catch (NoSuchAlgorithmException e) {

            return "SHA-256算法不可用";

        }
    }
    public static void main(String[] args) {
        String str = "1";
        System.out.println(sha256(str));
    }
}
