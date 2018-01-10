package com.example.white.huanchong.entity;

/******************************************
 * 类名称：PetInfos
 * 类描述：
 *
 * @version: 1.0
 * @author: chj
 * @time: 2018/1/8
 * @email: chj294671171@126.com
 * @github: https://github.com/cngmsy
 ******************************************/
public class PetInfos {

    /**
     * header : {"sign":"EE2DCEEBB1EF53EBEF46A92B2BA91B7D","ip":"172.28.24.3","token":"\u201d EE2DCEEBB1EF53EBEF46A92B2BA91B7D\u201d","channel":"android"}
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
         * token : ” EE2DCEEBB1EF53EBEF46A92B2BA91B7D”
         * channel : android
         */

        private String sign;
        private String ip;
        private String token;
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
            return token;
        }

        public void setToken(String token) {
            this.token = token;
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

        private String petName;//宠物昵称
        private String petType;//宠物类型
        private String userName;//用户名称
        private String createTime;//创建时间
        private String petBirthTime;//宠物出生日期
        private String petInfo;//宠物简介
        private String petTypeName;//宠物类型名称
        private int isSterilization;//是否绝育
        private double petWeight;//宠物体重
        private String userId;//用户id
        private int isimmune;//是否免疫

        public String getPetName() {
            return petName;
        }

        public void setPetName(String petName) {
            this.petName = petName;
        }

        public String getPetType() {
            return petType;
        }

        public void setPetType(String petType) {
            this.petType = petType;
        }

        public String getUserName() {
            return userName;
        }

        public void setUserName(String userName) {
            this.userName = userName;
        }

        public String getCreateTime() {
            return createTime;
        }

        public void setCreateTime(String createTime) {
            this.createTime = createTime;
        }

        public String getPetBirthTime() {
            return petBirthTime;
        }

        public void setPetBirthTime(String petBirthTime) {
            this.petBirthTime = petBirthTime;
        }

        public String getPetInfo() {
            return petInfo;
        }

        public void setPetInfo(String petInfo) {
            this.petInfo = petInfo;
        }

        public String getPetTypeName() {
            return petTypeName;
        }

        public void setPetTypeName(String petTypeName) {
            this.petTypeName = petTypeName;
        }

        public int getIsSterilization() {
            return isSterilization;
        }

        public void setIsSterilization(int isSterilization) {
            this.isSterilization = isSterilization;
        }

        public double getPetWeight() {
            return petWeight;
        }

        public void setPetWeight(double petWeight) {
            this.petWeight = petWeight;
        }

        public String getUserId() {
            return userId;
        }

        public void setUserId(String userId) {
            this.userId = userId;
        }

        public int getIsimmune() {
            return isimmune;
        }

        public void setIsimmune(int isimmune) {
            this.isimmune = isimmune;
        }
    }
}
