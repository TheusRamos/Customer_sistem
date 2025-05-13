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

 

public class ExemploUsoInterfaces {

    public static void main(String[] args) {
        
        ArrayList<Clientes> Clientes = new ArrayList<>();
        ArrayList<Produtos> Produtos = new ArrayList<>();
        System.out.println("Sistemas de Clientes:\n");
        int ContadorClientes = 0;
        int ContadorProdutos = 0;
        boolean execução = true;
        while(execução){
          try{
          int MenuPrincipal = Integer.parseInt(JOptionPane.showInputDialog("MENU:\n[1] MENU DE CLIENTES\n[2] MENU DE PRODUTOS\n[3] SAIR DA EXECUÇÃO\n"));
          switch(MenuPrincipal){
            case 1:
            try{
                int MenuCliente = Integer.parseInt(JOptionPane.showInputDialog("MENU:\n[1] NOVO CLIENTE\n[2] MOSTRAR CLIENTES\n[3] EXCLUIR CLIENTE\n"));
                switch(MenuCliente){
                case 1:
                    String nome = JOptionPane.showInputDialog("Digite o nome: ");
                    String CPF = JOptionPane.showInputDialog("Digite o CPF: ");
                    Clientes NovoCliente = new Clientes(nome, ContadorClientes, CPF);
                    Clientes.add(NovoCliente);
                    ContadorClientes++;
                    System.out.println("Cliente adicionado com sucesso..");
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
                
            case 2:
                try{
                int MenuProdutos = Integer.parseInt(JOptionPane.showInputDialog("MENU DE PRODUTOS:\n[1] CADASTRAR NOVO PRODUTO \n[2] MOSTRAR PRODUTOS\n[3] VOLTAR"));  
                switch(MenuProdutos){
                    case 1:
                        String nome = JOptionPane.showInputDialog("Digite o nome do produto: ");
                        int Estoque = Integer.parseInt(JOptionPane.showInputDialog("Quantos desse produto há no estoque?"));
                        Produtos NovoProduto = new Produtos(ContadorProdutos, nome, Estoque);
                        Produtos.add(NovoProduto);
                        ContadorProdutos++;
                        System.out.println("Produto adicionado com sucesso..");
                        break;
                        
                    case 2:
                        for(Produtos Produto : Produtos){
                            Produto.Mostrar();
                        }
                        break;
                        
                    case 3:
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opção inválida.");
                        break;
                }
                }catch(NumberFormatException e){
                    JOptionPane.showMessageDialog(null,"Digite um valor válido.");
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
