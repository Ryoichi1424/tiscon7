package com.tiscon.form;

import com.tiscon.validator.Numeric;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * 顧客が入力する見積もり情報を保持するクラス。
 *
 * @author Oikawa Yumi
 */
public class UserOrderForm {

    @NotBlank(message = "氏名を入力してください。")
    private String customerName;

    @NotBlank(message = "電話番号を入力してください。")
    @Numeric(message = "電話番号を半角で入力してください。")
    private String tel;

    @Email
    @NotBlank(message = "メールアドレスを入力してください。")
    private String email;

    @NotBlank(message = "集荷元住所(都道府県)を入力してください。")
    private String oldPrefectureId;

    @NotBlank(message = "集荷元住所(市町村以下)を入力してください。")
    private String oldAddress;

    @NotBlank(message = "お届け先住所(都道府県)を入力してください。")
    private String newPrefectureId;

    @NotBlank(message = "お届け先住所(市町村以下)を入力してください。")
    private String newAddress;

    @Numeric(message = "ダンボールの個数を半角数字で入力してください。")
    @NotBlank(message = "ダンボールの個数を入力してください。")
    private String box;

    @Numeric(message = "ベッドの個数を半角数字で入力してください。")
    @NotBlank(message = "ベッドの個数を入力してください。")
    private String bed;

    @Numeric(message = "自転車の個数を半角数字で入力してください。")
    @NotBlank(message = "自転車の個数を入力してください。")
    private String bicycle;

    @Numeric(message = "洗濯機の個数を半角数字で入力してください。")
    @NotBlank(message = "洗濯機の個数を入力してください。")
    private String washingMachine;

    @NotNull(message = "どちらかを選択してください。")
    private boolean washingMachineInstallation;

    @NotBlank(message = "引越し先までの距離を入力してください。")
    private String distance2;

    @NotBlank(message = "引っ越し予定の月を入力してください。")
    private String month;

    @NotBlank(message = "引っ越し予定の日を入力してください。")
    private String day;

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getOldPrefectureId() {
        return oldPrefectureId;
    }

    public void setOldPrefectureId(String oldPrefectureId) {
        this.oldPrefectureId = oldPrefectureId;
    }

    public String getOldAddress() {
        return oldAddress;
    }

    public void setOldAddress(String oldAddress) {
        this.oldAddress = oldAddress;
    }

    public String getNewPrefectureId() {
        return newPrefectureId;
    }

    public void setNewPrefectureId(String newPrefectureId) {
        this.newPrefectureId = newPrefectureId;
    }

    public String getNewAddress() {
        return newAddress;
    }

    public void setNewAddress(String newAddress) {
        this.newAddress = newAddress;
    }

    public String getBox() {
        return box;
    }

    public void setBox(String box) {
        this.box = box;
    }

    public String getBed() {
        return bed;
    }

    public void setBed(String bed) {
        this.bed = bed;
    }

    public String getBicycle() {
        return bicycle;
    }

    public void setBicycle(String bicycle) {
        this.bicycle = bicycle;
    }

    public String getWashingMachine() {
        return washingMachine;
    }

    public void setWashingMachine(String washingMachine) {
        this.washingMachine = washingMachine;
    }

    public boolean getWashingMachineInstallation() {
        return washingMachineInstallation;
    }

    public void setWashingMachineInstallation(boolean washingMachineInstallation) {
        this.washingMachineInstallation = washingMachineInstallation;
    }

    public String getDistance2() {return distance2;}
    public void setDistance2(String distance2) {this.distance2 = distance2;}

    public String getMonth() {return month;}
    public void setMonth(String month) {this.month = month;}

    public String getDay() {return day;}
    public void setDay(String day) {this.day = day;}
}

