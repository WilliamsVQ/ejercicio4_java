package com.OpenBC;

public class SmartDevice {

    private String marca;
    private String modelo;
    private int precio;

    public SmartDevice(){

    }

    public SmartDevice(String marca, String modelo, int precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", precio=" + precio +
                '}';
    }
}


class SmartPhone extends SmartDevice{
    public SmartPhone(String a,String b, int c){
        super(a,b, c);
    }
}

class SmartWatch extends SmartDevice{
    public SmartWatch(String a,String b, int c){
        super(a,b, c);
    }
}
