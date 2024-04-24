package model;

public class nhanvien {
    protected String ten;
    protected long luong;
    public nhanvien(){

    }
    public nhanvien(String ten ) {
        this.ten = ten;

    }
    public String loainhanvien(){
        return "";

    }
    public void inthongtin(){
        System.out.print("ten nhan vien la : " +ten);
        System.out.print("loai nhan vien la : " +loainhanvien());
        System.out.print("nhan vien co muc luong la : " +luong);
    }


    
}
    

}
