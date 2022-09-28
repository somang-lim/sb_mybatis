package com.ll.exam.sb_mybatis.app.util.Util;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

public class Util {
    public static class url {
        public static String encode(String str) {
            try {
                return URLEncoder.encode(str, "UTF-8");
            } catch (UnsupportedEncodingException e) {
                return str;
            }
        }
    }
}
