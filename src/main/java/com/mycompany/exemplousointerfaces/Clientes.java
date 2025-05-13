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
public class Clientes{
    private final int codigo;
    private final String nome;
    private final String CPF;
    
        public Clientes(String nome, int codigo, String CPF){
            this.nome = nome;
            this.codigo = codigo;
            this.CPF = CPF;
        }
        
        public void mostrarCliente(){
            JOptionPane.showMessageDialog(null, "Nome do Cliente " + codigo + ": " + nome);
        }
} 
