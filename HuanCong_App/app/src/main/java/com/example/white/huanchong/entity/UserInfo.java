package com.example.white.huanchong.entity;

/******************************************
 * 类名称：UserInfo
 * 类描述：
 *
 * @version: 1.0
 * @author: chj
 * @time: 2018/1/8
 * @email: chj294671171@126.com
 * @github: https://github.com/cngmsy
 ******************************************/
public class UserInfo {

    /**
     * ret : true
     * result : {"isUse":0,"userPhone":18837956501,"password":"E10ADC3949BA59ABBE56E057F20F883E","id":0,"state":0,"qq":0,"userSex":1,"userName":"hip038","userId":"915f482212a741348d1ec880ff032740","position":1}
     */

    private boolean ret;
    private ResultBean result;

    public boolean isRet() {
        return ret;
    }

    public void setRet(boolean ret) {
        this.ret = ret;
    }

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

    public static class ResultBean {
        /**
         * isUse : 0
         * userPhone : 18837956501
         * password : E10ADC3949BA59ABBE56E057F20F883E
         * id : 0
         * state : 0
         * qq : 0
         * userSex : 1
         * userName : hip038
         * userId : 915f482212a741348d1ec880ff032740
         * position : 1
         */

        private int isUse;
        private long userPhone;
        private String password;
        private int id;
        private int state;
        private int qq;
        private int userSex;
        private String userName;
        private String userId;
        private int position;

        public int getIsUse() {
            return isUse;
        }

        public void setIsUse(int isUse) {
            this.isUse = isUse;
        }

        public long getUserPhone() {
            return userPhone;
        }

        public void setUserPhone(long userPhone) {
            this.userPhone = userPhone;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public int getState() {
            return state;
        }

        public void setState(int state) {
            this.state = state;
        }

        public int getQq() {
            return qq;
        }

        public void setQq(int qq) {
            this.qq = qq;
        }

        public int getUserSex() {
            return userSex;
        }

        public void setUserSex(int userSex) {
            this.userSex = userSex;
        }

        public String getUserName() {
            return userName;
        }

        public void setUserName(String userName) {
            this.userName = userName;
        }

        public String getUserId() {
            return userId;
        }

        public void setUserId(String userId) {
            this.userId = userId;
        }

        public int getPosition() {
            return position;
        }

        public void setPosition(int position) {
            this.position = position;
        }
    }
}
