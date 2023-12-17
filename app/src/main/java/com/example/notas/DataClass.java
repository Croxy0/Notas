package com.example.notas;

public class DataClass {
    private String dataNombre;
    private String dataApellido;
    private String dataN1,dataN2,dataN3;
    private String DataEstado;
    private String DataPromedio;
    private String DataImage;
    private String Key;

    public DataClass() {
    }

    public DataClass(String dataNombre, String dataApellido, String dataN1, String dataN2, String dataN3, String dataEstado, String dataPromedio, String dataImage) {
        this.dataNombre = dataNombre;
        this.dataApellido = dataApellido;
        this.dataN1 = dataN1;
        this.dataN2 = dataN2;
        this.dataN3 = dataN3;
        DataEstado = dataEstado;
        DataPromedio = dataPromedio;
        DataImage = dataImage;
    }

    public String getDataNombre() {
        return dataNombre;
    }

    public void setDataNombre(String dataNombre) {
        this.dataNombre = dataNombre;
    }

    public String getDataApellido() {
        return dataApellido;
    }

    public void setDataApellido(String dataApellido) {
        this.dataApellido = dataApellido;
    }

    public String getDataN1() {
        return dataN1;
    }

    public void setDataN1(String dataN1) {
        this.dataN1 = dataN1;
    }

    public String getDataN2() {
        return dataN2;
    }

    public void setDataN2(String dataN2) {
        this.dataN2 = dataN2;
    }

    public String getDataN3() {
        return dataN3;
    }

    public void setDataN3(String dataN3) {
        this.dataN3 = dataN3;
    }

    public String getDataEstado() {
        return DataEstado;
    }

    public void setDataEstado(String dataEstado) {
        DataEstado = dataEstado;
    }

    public String getDataPromedio() {
        return DataPromedio;
    }

    public void setDataPromedio(String dataPromedio) {
        DataPromedio = dataPromedio;
    }

    public String getDataImage() {
        return DataImage;
    }

    public void setDataImage(String dataImage) {
        DataImage = dataImage;
    }

    public String getKey() {
        return Key;
    }

    public void setKey(String key) {
        Key = key;
    }
}

