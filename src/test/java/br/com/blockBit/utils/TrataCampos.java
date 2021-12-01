package br.com.blockBit.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TrataCampos {

    public static String trataCampo(String valor){
        String valorTratado = "";
        if (valor.contains("[data]")){
            valorTratado = valor.replace("[data]","_"+getData());
        }

        return valorTratado;
    }

    public static String getData(){
        SimpleDateFormat sdf1= new SimpleDateFormat("ddMMyyyyHHmmss"); //você pode usar outras máscaras
        Date y=new Date();
        return sdf1.format(y);
    }
}
