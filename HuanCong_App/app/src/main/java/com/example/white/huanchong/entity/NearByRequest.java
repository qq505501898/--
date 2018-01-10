package com.example.white.huanchong.entity;

/******************************************
 * 类名称：NearByRequest
 * 类描述：
 *
 * @version: 1.0
 * @author: chj
 * @time: 2018/1/8
 * @email: chj294671171@126.com
 * @github: https://github.com/cngmsy
 ******************************************/
public class NearByRequest {

    /**
     * header : {"channel":"android","ip":"172.28.119.4","sign":"B2754A38A5D5027F49424934A8DF5752","token":"96F65F14C026230FD1D097C435964E0E"}
     * body : {"beginIndex":"0","coordX":"40.116384","coordY":"116.250374","endIndex":"10","orderBy":"distance asc"}
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
         * ip : 172.28.119.4
         * sign : B2754A38A5D5027F49424934A8DF5752
         * token : 96F65F14C026230FD1D097C435964E0E
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
         * beginIndex : 0
         * coordX : 40.116384
         * coordY : 116.250374
         * endIndex : 10
         * orderBy : distance asc
         */

        private String beginIndex;
        private String coordX;
        private String coordY;
        private String endIndex;
        private String orderBy;

        public String getBeginIndex() {
            return beginIndex;
        }

        public void setBeginIndex(String beginIndex) {
            this.beginIndex = beginIndex;
        }

        public String getCoordX() {
            return coordX;
        }

        public void setCoordX(String coordX) {
            this.coordX = coordX;
        }

        public String getCoordY() {
            return coordY;
        }

        public void setCoordY(String coordY) {
            this.coordY = coordY;
        }

        public String getEndIndex() {
            return endIndex;
        }

        public void setEndIndex(String endIndex) {
            this.endIndex = endIndex;
        }

        public String getOrderBy() {
            return orderBy;
        }

        public void setOrderBy(String orderBy) {
            this.orderBy = orderBy;
        }
    }
}
