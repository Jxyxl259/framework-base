package com.jiang.framework.utils;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Created by issuser on 2016/5/30.
 */
public class MD5Utils {

    /**
     * 使用md5的算法进行加密
     */
    public static String md5Digest(String plainText) {
        byte[] secretBytes = null;
        try {
            secretBytes = MessageDigest.getInstance("md5").digest(
                    plainText.getBytes());
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("没有md5这个算法！");
        }
        String md5code = new BigInteger(1, secretBytes).toString(16);
        for (int i = 0; i < 32 - md5code.length(); i++) {
            md5code = "0" + md5code;
        }
        return md5code;
    }

    public static void main(String[] args) {

//        System.out.println(md5Digest("123"));
//        String jsonParam = "<WarehousePriority><WarehouseCode>005</WarehouseCode><StorageCode>BJCK</StorageCode><ProvinceNo>010</ProvinceNo><IsEnable>0</IsEnable><UseWeight>500</UseWeight><Action>D</Action></WarehousePriority>";
//        String key = "BtcpBaseStorageToken";
//        String url = "http://team3-btcpws-api.dockeruat.lefile.cn/btcpws/queryTMSWehouse.do";
//        String data_digest = MD5Utils.sign(jsonParam, key, "utf-8");
        String jsonParam = "{\"warehouseCode\":\"All\"}";
        String key = "shop20181116";
        String url = "http://team3-btcpws-api.dockeruat.lefile.cn/btcpws/queryTMSWehouse.do";
        String data_digest = MD5Utils.sign(jsonParam, key, "utf-8");

        System.out.println(data_digest);
//        Map<String, String> paramMap = new HashMap<String, String>();
//        paramMap.put("json", jsonParam);
//        paramMap.put("cid", "officialportal");
//        paramMap.put("data_digest", data_digest);
//
//        System.out.println("密文"+data_digest);
//        String warehouseInfosJsonArrayStr = HttpUtils.postStr(url, paramMap);
//        System.out.println(warehouseInfosJsonArrayStr);


    }

    public static String sign(String text, String key, String input_charset) {
        text = text + key;
        MessageDigest md5 = null;
        String value = "";
        try {
            md5 = MessageDigest.getInstance("MD5");
            sun.misc.BASE64Encoder baseEncoder = new sun.misc.BASE64Encoder();
            value = baseEncoder.encode(md5.digest(text.getBytes("utf-8")));
            //System.out.println(value);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return value;
    }
}
