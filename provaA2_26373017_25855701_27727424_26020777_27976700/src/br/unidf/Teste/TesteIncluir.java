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
public class TesteIncluir {
           public static void main(String[] args) throws Exception
    {
        ClienteDTO cliente = new ClienteDTO();
        cliente.setCliNome("Marcos Hamilton");
        cliente.setCliEndereco("planaltina");
        ClienteDAL dal = new ClienteDAL();
        dal.incluirCliente(cliente);
        System.out.print("Cliente " + cliente.getCliNome() + " Cadastrado com sucesso!");
    }

}
