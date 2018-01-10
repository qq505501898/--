package com.example.white.huanchong.entity;

/******************************************
 * 类名称：AddPetInfo
 * 类描述：
 *
 * @version: 1.0
 * @author: chj
 * @time: 2018/1/8
 * @email: chj294671171@126.com
 * @github: https://github.com/cngmsy
 ******************************************/
public class AddPetInfo {
    private long id;
    private String petCode;//宠物code


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






    private int petSex;//宠物性别



    private String updateTime;//修改时间
    private String petImage;//宠物图片


    private String petParentTypeName;//父类型名称


    private String petPricingCode;//宠物定价code
    private int petState;//宠物状态
    private int isUse;//是否启用

    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public int getIsUse() {
        return isUse;
    }
    public void setIsUse(int isUse) {
        this.isUse = isUse;
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getPetCode() {
        return petCode;
    }
    public void setPetCode(String petCode) {
        this.petCode = petCode;
    }
    public String getPetName() {
        return petName;
    }
    public void setPetName(String petName) {
        this.petName = petName;
    }
    public String getUserId() {
        return userId;
    }
    public void setUserId(String userId) {
        this.userId = userId;
    }
    public int getPetSex() {
        return petSex;
    }
    public void setPetSex(int petSex) {
        this.petSex = petSex;
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
    public String getCreateTime() {
        return createTime;
    }
    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }
    public String getUpdateTime() {
        return updateTime;
    }
    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public String getPetType() {
        return petType;
    }
    public void setPetType(String petType) {
        this.petType = petType;
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
    public String getPetPricingCode() {
        return petPricingCode;
    }
    public void setPetPricingCode(String petPricingCode) {
        this.petPricingCode = petPricingCode;
    }
    public int getPetState() {
        return petState;
    }
    public void setPetState(int petState) {
        this.petState = petState;
    }
    public String getPetImage() {
        return petImage;
    }
    public void setPetImage(String petImage) {
        this.petImage = petImage;
    }
    public int getIsimmune() {
        return isimmune;
    }
    public void setIsimmune(int isimmune) {
        this.isimmune = isimmune;
    }
    public String getPetParentTypeName() {
        return petParentTypeName;
    }
    public void setPetParentTypeName(String petParentTypeName) {
        this.petParentTypeName = petParentTypeName;
    }
}

