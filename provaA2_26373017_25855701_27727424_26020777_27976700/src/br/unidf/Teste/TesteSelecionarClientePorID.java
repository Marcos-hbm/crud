/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unidf.Teste;

import br.unidf.DAL.ClienteDAL;
import br.unidf.DTO.ClienteDTO;

/**
 *
 * @author Suporte
 */
public class TesteSelecionarClientePorID {
    public static void main(String[ ] args) throws Exception
    {
        ClienteDAL dal = new ClienteDAL();
        ClienteDTO cliente = dal.selecionarClientePorID(1);
        System.out.println("Codigo: " + cliente.getCliID());
        System.out.println("Nome Cliente: " + cliente.getCliNome());
        System.out.println("Endereço: " + cliente.getCliEndereco());
   
    }

}
