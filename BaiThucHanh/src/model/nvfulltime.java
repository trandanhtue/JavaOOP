package model;

import model.util.configs;

public class nvfulltime extends nhanvien{
    int ngaylamthem ,chucvu ;
   
    public nvfulltime(String ten){
        super(ten);
    this.chucvu = configs.nv_linh;
    } 
    public nvfulltime(String ten , int ngaylamthem){
        super(ten);
    this.ngaylamthem = ngaylamthem;
    this.chucvu = configs.nv_linh;
    }
    public void loaichucvu(int chucvu){
    this.chucvu = chucvu;
    }
    public String loainhanvien(){
        Object configs;
        if ( chucvu == configs.nv_linh){
            return " linh fulltime";
        }else {
            return " sep ";
        }
    
    }
    /**
     * 
     */
    public void tinhluong(){
        Object configs;
        if ( chucvu == configs.nv_linh){
            luong = configs.luong_nv_fulltime_linh + ngaylamthem * configs.luong_fulltime;
        }else if ( chucvu == configs.nv_sep){
            luong = configs.luong_nv_fulltime_sep + ngaylamthem * configs.luong_fulltime;
        }
     }
    }