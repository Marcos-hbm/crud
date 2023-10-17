/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unidf.Teste;

import br.unidf.DAL.ClienteDAL;

/**
 *
 * @author Suporte
 */
public class TesteExcluirCliente {
    public static void main(String[ ] args) throws Exception
    {
        ClienteDAL dal = new ClienteDAL();
        dal.excluirCliente(4);
        System.out.print("Cliente Excluído com sucesso!");
    }

}
