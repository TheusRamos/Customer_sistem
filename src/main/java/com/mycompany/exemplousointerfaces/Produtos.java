/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exemplousointerfaces;

import javax.swing.JOptionPane;

/**
 *
 * @author Servidor
 */
public class Produtos {
    private final int ID;
    private final String Nome;
    private int Estoque;
    
    public Produtos(int ID, String Nome, int Estoque){
        this.Estoque = Estoque;
        this.Nome = Nome;
        this.ID = ID;  
    }
    
    public void Mostrar(){
        System.out.println("ID: " + ID + "\nNome do Produto: " + Nome + "\nQuantidade em estoque: " + Estoque + "\n");
    }
}

