package com.company;

public class claves implements Comparable<claves> {
    private int nip;
    public claves(int nip){

        this.nip=nip;

    }

    public int compareTo(claves u){
        if (getNip()<u.getNip()){
            return -1;
        }
        else if (getNip()> u.getNip()){
            return 1;
        }
        else {
            return 0;
        }
    }
    public int getNip(){
        return nip;

    }
    public void  setNip(int nip){
        this.nip=nip;
    }

}