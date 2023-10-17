/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unidf.DTO;

/**
 *
 * @author Suporte
 */
    
    public class ClienteDTO
{
    private long cliID;
    private String cliNome;
    private String cliEndereco;

    public long getCliID() {
        return cliID;
    }

    public void setCliID(long cliID) {
        this.cliID = cliID;
    }

    public String getCliNome() {
        return cliNome;
    }

    public void setCliNome(String cliNome) {
        this.cliNome = cliNome;
    }

    public String getCliEndereco() {
        return cliEndereco;
    }

    public void setCliEndereco(String cliEndereco) {
        this.cliEndereco = cliEndereco;
    }

}
