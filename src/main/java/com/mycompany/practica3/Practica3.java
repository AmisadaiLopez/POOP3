/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.practica3;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Enumeration;
import java.util.Hashtable;

/**
 *
 * @author Lopez Hernandez Miriam Amisadai
 */
public class Practica3 {

    public static void main(String[] args) {
        System.out.println("#####ARREGLOS#####");
        int []nums;
        int[] nums1;
        int [] nums2;
        int nums3[];
        int[] nums4 = {1, 2, 3, 4};
        
        System.out.println("####FOR####");
        for (int i = 0; i < nums4.length; i++) {
            int j = nums4[i];
            System.out.println(j);
        }
        System.out.println("###FOR EACH###");
        for (int i : nums4) {
            System.out.println(i);
        }
        
        System.out.println("###CONCATENAR###");
        String s =new String("Hola Mundo");
        String s1 ="Hola Mundo";
        System.out.println(s);
        System.out.println(s1);
        String nombre= "Miriam";
        String apellido= "Lopez";
        String nombreCompleto= nombre+" "+ apellido;
        System.out.println(nombreCompleto);
        
        System.out.println("###ORDENAR PUNTO###");
        System.out.println("Numero de elementos del arreglo: " +nums4.length);
        System.out.println("Numero de elementos de nombre: "+nombre.length());
        System.out.println(nombreCompleto.toUpperCase());
        System.out.println(nombreCompleto);
        
       
        System.out.println("###WRAPPERS Y AUTOBOXING###");
        int a=3; 
        Integer k = new Integer(50);
        Integer l=22;
        int r=l;
        int b=7;
        float c=b;
        int d= (int) c;
        Integer rr=r; 
        String s3 =rr.toString();
        System.out.println(s3);
        String s4 =r + "";
        System.out.println(s4);
        System.out.println(s4.length());
        
        System.out.println("###COLECIONES###");
        System.out.println("###ArrayList###");
        ArrayList<Integer>miArrayList = new ArrayList<Integer>();
        miArrayList.add(d);
        miArrayList.add(9);
        System.out.println(miArrayList.size());
        System.out.println(miArrayList.get(0));
        miArrayList.add(0,20);
        System.out.println("***");
        for (Integer integer : miArrayList){
            System.out.println(integer);
        }
        System.out.println("###HashTable###");
        Hashtable<Integer,String> agenda=new Hashtable<Integer,String>();
        //Intable representa numeros
        //String representa  nombre
        //set de datos no hay orden de insercion y no permite elementos duplicados
        agenda.put(k, "Perengano");
        agenda.put(5555555, "Pepe Toño");
        agenda.put(6666666, "Epafrodita");
        agenda.put(888888, "Matilde");
        System.out.println(agenda.size());
        System.out.println("***");
        for (String valor: agenda.values ()){
            System.out.println(valor);
        }
        for (Integer clave : agenda.keySet()){
            System.out.println(clave);
        }
        System.out.println("####ENUMERACION###");
        Integer clave; 
        String valor; 
        Enumeration <Integer> llaves =agenda.keys();
        while (llaves.hasMoreElements()){
            clave=llaves.nextElement();
            valor=agenda.get(clave);
            System.out.println("Clave: "+clave+ "Valor "+valor);
        }
        System.out.println("####MATH####");
        System.out.println(Math.PI);
        System.out.println(Math.abs(-5));
        System.out.println(Math.pow(3,2));
        System.out.println(Math.sqrt(9));
        System.out.println(Math.max(80,7));
        
        System.out.println("###DATE###");
        Date hoy=new Date();
        System.out.println(hoy);
        
        System.out.println("###CALENDARIO###");
        Calendar calendarioHoy = Calendar.getInstance();
        System.out.println(calendarioHoy);
        
        System.out.println("###FORMATO DE DATE###");
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd-MM-yyyy");
        System.out.println(formatoFecha.format(hoy));
        
        System.out.println("###FORMATO CALENDAR###");
        String fechaActual = calendarioHoy.get(Calendar.DAY_OF_MONTH) + " de ";
            fechaActual += (calendarioHoy.get(Calendar.MONTH)+1 + " de ";
            fechaActual += calendarioHoy.get(Calendar.YEAR);
        System.out.println(fechaActual);
        
    }
}
