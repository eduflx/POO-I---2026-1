/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.poo.prjeqseggrau_poo1;

/**
 *
 * @author Iftm
 */
public class PrjEqSegGrau_POO1 {

    public static void main(String[] args) {
        DadosEntrada de = new DadosEntrada();
        
        de.setA(1);
        de.setB(5);
        de.setC(6);
        
        System.out.println("DADOS DE ENTRADA:");
        System.out.println("A: " + de.getA());
        System.out.println("B: " + de.getB());
        System.out.println("C: " + de.getC());
        
        CalcularEqSeqGrau esg = new CalcularEqSeqGrau();
        /*DadosSaida ds = esg.delta(de);
        ds = esg.x1L(de);
        ds = esg.x2L(de);
        ds = esg.xV(de);
        ds = esg.yV(de);
        */
        
        DadosSaida ds = new DadosSaida();
        CalcularEqSeqGrau2 esg2 = new CalcularEqSeqGrau2();
        
        System.out.println("Delta: " + ds.getDelta());
        System.out.println("X': " + ds.getX1L());
        System.out.println("X'': " + ds.getX2L());
        System.out.println("xV: " + ds.getxV());
        System.out.println("yV: " + ds.getyV());
         
    }
}
