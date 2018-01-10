package com.example.white.huanchong.entity;

/******************************************
 * 类名称：DetailRequestBean
 * 类描述：
 *
 * @version: 1.0
 * @author: chj
 * @time: 2018/1/8
 * @email: chj294671171@126.com
 * @github: https://github.com/cngmsy
 ******************************************/
public class DetailRequestBean {


    /**
     * header : {"sign":"EE2DCEEBB1EF53EBEF46A92B2BA91B7D","ip":"172.28.24.3","Token":"\u201d EE2DCEEBB1EF53EBEF46A92B2BA91B7D\u201d","channel":"android"}
     * body : {" petCode ":" EE2DCEEBB1EF53EBEF46A92B2BA91B7D "}
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
         * Token : ” EE2DCEEBB1EF53EBEF46A92B2BA91B7D”
         * channel : android
         * 29887A76369E5B26DE027B726EC5EAF6
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
         *  petCode  :  EE2DCEEBB1EF53EBEF46A92B2BA91B7D 
         */

        private String petCode;

        public String getPetCode() {
            return petCode;
        }

        public void setPetCode(String petCode) {
            this.petCode = petCode;
        }
    }
}
