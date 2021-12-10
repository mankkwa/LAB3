package com.company;

abstract class Objects {

    protected String size;

    Objects(String size){
        this.size = size;
    }

    public void setObjectSize(String size){
        this.size = size;
    }

    public String getObjectSize(){
        return size;
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (!(o instanceof Objects)) return false;
        Objects obj = (Objects) o;
        return java.util.Objects.equals(size, obj.getObjectSize());
    }


    @Override
    public String toString() {
        return "Размер объекта: " + size;
    }

    @Override
    public int hashCode() {
        return size.hashCode();
    }
}
