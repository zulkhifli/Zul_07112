package Controller;

import Entity.Zul07112_Pelanggan;
import java.util.ArrayList;
import Model.Parkiran;

public class Zul07112_Controller {
    Parkiran parkir = new Parkiran();
    public void Insert(Zul07112_Pelanggan pelanggan){
        parkir.insert(pelanggan);
    }
    public void Delete(String zul07112_nama,String zul07112_plat){
        parkir.delete(zul07112_nama, zul07112_plat);
    }
    public void Update(String zul07112_update,String baru){
        parkir.update(zul07112_update, baru);
    }
    public ArrayList <Zul07112_Pelanggan> View(){
        return parkir.view();
    }
}