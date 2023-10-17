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
public class TesteAlterarCliente {
    public static void main(String[ ] args) throws Exception
    {
        ClienteDAL dal = new ClienteDAL();
        ClienteDTO cliente = new ClienteDTO();
        cliente.setCliID(1);
        cliente.setCliNome("Rafael Soares de Almeida");
        cliente.setCliEndereco("Quadra 0000");
        dal.alterarCliente(cliente);
        System.out.print("Cliente " + cliente.getCliNome() + " Alterado com sucesso!");    
    }
}
    
