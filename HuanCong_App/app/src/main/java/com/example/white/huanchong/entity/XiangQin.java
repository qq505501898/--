package com.example.white.huanchong.entity;

/**
 * Created by 丁军明 on 2018/1/9.
 * 寄养师详情
 */

public class XiangQin {

    /**
     * header : {"channel":"android","ip":"172.16.170.2","sign":"454CD10B9CD9DB06D134350FC0A32BFA","token":"1A4F9E0E6DFA0D2B4FFEA6AECE497DFF"}
     * body : {"userId":"8"}
     */

    private HeaderBean header;
    private BodyBean body;

    public HeaderBean getHeader() {
        return header;
    }

    public void setHeader(HeaderBean header) {
        this.header = header;
    }

    public BodyBean getBody() {
        return body;
    }

    public void setBody(BodyBean body) {
        this.body = body;
    }

    public static class HeaderBean {
        /**
         * channel : android
         * ip : 172.16.170.2
         * sign : 454CD10B9CD9DB06D134350FC0A32BFA
         * token : 1A4F9E0E6DFA0D2B4FFEA6AECE497DFF
         */

        private String channel;
        private String ip;
        private String sign;
        private String token;

        public String getChannel() {
            return channel;
        }

        public void setChannel(String channel) {
            this.channel = channel;
        }

        public String getIp() {
            return ip;
        }

        public void setIp(String ip) {
            this.ip = ip;
        }

        public String getSign() {
            return sign;
        }

        public void setSign(String sign) {
            this.sign = sign;
        }

        public String getToken() {
            return token;
        }

        public void setToken(String token) {
            this.token = token;
        }
    }

    public static class BodyBean {
        /**
         * userId : 8
         */

        private String userId;

        public String getUserId() {
            return userId;
        }

        public void setUserId(String userId) {
            this.userId = userId;
        }
    }
}
