package com.zw.domain;

public class Order {
    private Integer id;

    private String ordernumber;

    private String spec;

    private String nickname;

    private String name;

    private Integer number;

    private Integer goodsamount;

    private Integer goodprice;

    private Integer commission;

    private Integer poundage;

    private Integer wlprice;

    private Integer issd;

    private Integer favoritestatus;

    private Integer scStatus;

    private Long paytime;

    private Long sctime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrdernumber() {
        return ordernumber;
    }

    public void setOrdernumber(String ordernumber) {
        this.ordernumber = ordernumber == null ? null : ordernumber.trim();
    }

    public String getSpec() {
        return spec;
    }

    public void setSpec(String spec) {
        this.spec = spec == null ? null : spec.trim();
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Integer getGoodsamount() {
        return goodsamount;
    }

    public void setGoodsamount(Integer goodsamount) {
        this.goodsamount = goodsamount;
    }

    public Integer getGoodprice() {
        return goodprice;
    }

    public void setGoodprice(Integer goodprice) {
        this.goodprice = goodprice;
    }

    public Integer getCommission() {
        return commission;
    }

    public void setCommission(Integer commission) {
        this.commission = commission;
    }

    public Integer getPoundage() {
        return poundage;
    }

    public void setPoundage(Integer poundage) {
        this.poundage = poundage;
    }

    public Integer getWlprice() {
        return wlprice;
    }

    public void setWlprice(Integer wlprice) {
        this.wlprice = wlprice;
    }

    public Integer getIssd() {
        return issd;
    }

    public void setIssd(Integer issd) {
        this.issd = issd;
    }

    public Integer getFavoritestatus() {
        return favoritestatus;
    }

    public void setFavoritestatus(Integer favoritestatus) {
        this.favoritestatus = favoritestatus;
    }

    public Integer getScStatus() {
        return scStatus;
    }

    public void setScStatus(Integer scStatus) {
        this.scStatus = scStatus;
    }

    public Long getPaytime() {
        return paytime;
    }

    public void setPaytime(Long paytime) {
        this.paytime = paytime;
    }

    public Long getSctime() {
        return sctime;
    }

    public void setSctime(Long sctime) {
        this.sctime = sctime;
    }
}