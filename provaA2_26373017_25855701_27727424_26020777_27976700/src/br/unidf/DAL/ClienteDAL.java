/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unidf.DAL;

import br.unidf.DTO.ClienteDTO;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Suporte
 */
public class ClienteDAL extends ConexaoMySQL {
    public void incluirCliente(ClienteDTO cliente) throws Exception
    {
        //Prepara a conexão com o MySQL
        abrirBD();
        SQL = "INSERT INTO clientes (cliNome, cliEndereco) VALUES (?, ?)";
        ps = con.prepareStatement(SQL);
        //Busca os valores da classe ClienteDTO
        ps.setString(1, cliente.getCliNome());
        ps.setString(2, cliente.getCliEndereco());
        ps.executeUpdate();
        fecharBD();
    }
    public ClienteDTO selecionarClientePorID(Integer cliID)throws Exception
    {
        abrirBD();
        SQL = "SELECT * FROM clientes WHERE cliID = ?";
        ps = con.prepareStatement(SQL);
        ps.setInt(1, cliID);
        rs = ps.executeQuery();
        ClienteDTO cliente = new ClienteDTO();
        if(rs.next())
        {
            cliente.setCliID(rs.getInt("cliID"));
            cliente.setCliNome(rs.getString("cliNome"));
            cliente.setCliEndereco(rs.getString("cliEndereco"));
            fecharBD();            
        }
        return cliente;
    }
//Método que vai selecionar todos os clientes no nosso Banco de Dados
    //e ordenar por nome do cliente
    public List selecionarListaClientes() throws Exception
    {
        abrirBD();
        SQL = "SELECT * FROM clientes ORDER BY cliNome";
        ps = con.prepareStatement(SQL);
        rs = ps.executeQuery();
        List listaClientes = new ArrayList();
        while(rs.next())
        {
           ClienteDTO cliente = new ClienteDTO();
           cliente.setCliID(rs.getInt("cliID"));
           cliente.setCliNome(rs.getString("cliNome"));
           cliente.setCliEndereco(rs.getString("cliEndereco"));
           listaClientes.add(cliente);         
        }
        fecharBD();
        return listaClientes;
    }
//Método que vai fazer as alterações necessárias nos dados dos clientes
    //selecionados por seu código no nosso Banco de Dados
    public void alterarCliente(ClienteDTO cliente) throws Exception
    {
        abrirBD();         
        SQL = "UPDATE clientes SET cliNome = ?, cliEndereco = ? WHERE cliID = ?";
        ps = con.prepareStatement(SQL);        
        ps.setString(1, cliente.getCliNome());     
        ps.setString(2, cliente.getCliEndereco());
        ps.setLong(3, cliente.getCliID());
        ps.execute();
        fecharBD();
    }

    
    public void excluirCliente(Integer cliID) throws Exception
    {
        abrirBD();
        SQL = "DELETE FROM clientes WHERE cliID = ?";
        ps = con.prepareStatement(SQL);
        ps.setInt(1, cliID);
        ps.execute();
        fecharBD();
    }

}
