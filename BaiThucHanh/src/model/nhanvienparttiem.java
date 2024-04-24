package model;

import model.util.configs;

public class nvpartime extends nhanvien {
  int giolamviec; 
 public nvpartime (String ten , int giolamviec){
    this.ten=ten;
    this.giolamviec=giolamviec;

  }
  @Override
  public String loainhanvien(){
    return "nhan vien partime";

  }
public void tinhluong(){
    luong = configs.luong_partime * giolamviec;
  }

}