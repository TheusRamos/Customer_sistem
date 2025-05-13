/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exemplousointerfaces;

import java.util.Scanner;
import javax.swing.JOptionPane;
import java.util.ArrayList;

/**
 *
 * @author Servidor
 */

 

public class Gerenciador {

    public static void main(String[] args) {
        
        ArrayList<Clientes> Clientes = new ArrayList<>();
        System.out.println("Sistemas de Clientes:\n");
        int cont = 0;
        boolean execução = true;
        while(execução){
          try{
          int teste = Integer.parseInt(JOptionPane.showInputDialog("MENU:\n[1] MENU DE CLIENTES\n[2] MENU DE PRODUTOS\n[3]\n"));
          switch(teste){
            case 1:
            try{
                int teste2 = Integer.parseInt(JOptionPane.showInputDialog("MENU:\n[1] NOVO CLIENTE\n[2] MOSTRAR CLIENTES\n[3] EXCLUIR CLIENTE\n"));
                switch(teste2){
                case 1:
                    String nome = JOptionPane.showInputDialog("Digite o nome: ");
                    String CPF = JOptionPane.showInputDialog("Digite o CPF: ");
                    Clientes NovoCliente = new Clientes(nome, cont, CPF);
                    Clientes.add(NovoCliente);
                    cont++;
                    System.out.println("Olá, deu certo.");
                    break;
                        
                case 2:
                    for(Clientes Cliente : Clientes){
                        Cliente.mostrarCliente();
                    }
                    break;
                case 3:
                    System.out.println("Saindo...");
                    
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida, tente novamente.");
                    break;
                }  
                }catch(NumberFormatException e){
                    JOptionPane.showMessageDialog(null, "Digite um valor válido.");
                }catch(Exception e){
                    JOptionPane.showMessageDialog(null, "Erro inesperado: " + e.getMessage());
                } 
                break;            
            case 3:
                System.out.println("Saindo...");
                execução = false;
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opção inválida, tente novamente.");
                break;
                
        }  
        }catch(NumberFormatException e){
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro inesperado: " + e.getMessage());
        }
    }

    }
}