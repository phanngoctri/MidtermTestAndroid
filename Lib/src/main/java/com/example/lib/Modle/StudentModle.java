package com.example.lib.Modle;

import java.io.Serializable;

public class StudentModle implements Serializable {
    public String Name;
    public  String Code;
    public String Phone;
    public int Pic;

    public StudentModle(String name, String code, String phone, int pic) {
        Name = name;
        Code = code;
        Phone = phone;
        Pic = pic;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getCode() {
        return Code;
    }

    public void setCode(String code) {
        Code = code;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public int getPic() {
        return Pic;
    }

    public void setPic(int pic) {
        Pic = pic;
    }

    @Override
    public String toString() {
        return Name + "-"  +  Code + '\n' +
                Phone ;
    }
}
