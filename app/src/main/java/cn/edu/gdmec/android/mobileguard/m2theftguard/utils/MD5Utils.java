package cn.edu.gdmec.android.mobileguard.m2theftguard.utils;

import java.io.File;
import java.io.FileInputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Created by admin on 2017/10/8.
 */

public class MD5Utils {
    /**
     * md5摘要
     * @param text
     * @return
     */
    public static String encode(String text){
        try{
           MessageDigest digest = MessageDigest.getInstance("md5");
            byte[] result = digest.digest(text.getBytes());
            StringBuilder sb = new StringBuilder();
            for(byte b : result){
                int number = b&0xff;
                String hex = Integer.toHexString(number);
                if(hex.length()==1){
                    sb.append("0"+hex);
                } else {
                    sb.append(hex);
                }
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException e){
            e.printStackTrace();
            return "";
        }
    }

    public static String getFileMd5(String path) {
        try {
            //获得数字信息的摘要器
            MessageDigest digest = MessageDigest.getInstance("md5");
            //
            File file = new File(path);
            FileInputStream fis = new FileInputStream(file);
            byte[] buffer = new byte[1024];
            int len = -1;
            while ((len = fis.read(buffer)) !=-1){
                digest.update(buffer,0,len);
            }
            //执行加密
            byte[] result = digest.digest();
            StringBuilder sb = new StringBuilder();
            //将每个byte字节的数据转换成16进制的数据
            for (byte b :result){
                int number = b&0xff;
                String hex = Integer.toHexString(number);//十进制转十六进制
                if (hex.length()==1){////判断加密后的字符的长度，如果长度为1，则在该字符前面补0
                    sb.append("0"+hex);
                }else{
                    sb.append(hex);
                }
            }
            return sb.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return  null;
        }
    }
}
