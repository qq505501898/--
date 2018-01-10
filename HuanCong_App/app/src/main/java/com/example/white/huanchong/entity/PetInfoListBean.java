package com.example.white.huanchong.entity;

/******************************************
 * 类名称：PetInfoListBean
 * 类描述：
 *
 * @version: 1.0
 * @author: chj
 * @time: 2018/1/8
 * @email: chj294671171@126.com
 * @github: https://github.com/cngmsy
 ******************************************/
public class PetInfoListBean {

    /**
     * header : {"sign":"EE2DCEEBB1EF53EBEF46A92B2BA91B7D","ip":"172.28.24.3","Token":"vvvvv","channel":"android"}
     * body : {" userId ":"18234834396"}
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
         * sign : EE2DCEEBB1EF53EBEF46A92B2BA91B7D
         * ip : 172.28.24.3
         * Token : vvvvv
         * channel : android
         */

        private String userId;

        public String getUserId() {
            return userId;
        }

        public void setUserId(String userId) {
            this.userId = userId;
        }

        private String sign;
        private String ip;
        private String Token;
        private String channel;

        public String getSign() {
            return sign;
        }

        public void setSign(String sign) {
            this.sign = sign;
        }

        public String getIp() {
            return ip;
        }

        public void setIp(String ip) {
            this.ip = ip;
        }

        public String getToken() {
            return Token;
        }

        public void setToken(String Token) {
            this.Token = Token;
        }

        public String getChannel() {
            return channel;
        }

        public void setChannel(String channel) {
            this.channel = channel;
        }
    }

    public static class BodyBean {
        /**
         *  userId  : 18234834396
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
