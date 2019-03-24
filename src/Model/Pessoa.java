/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Date;

/**
 *
 * @author marlon.cruz
 */
public class Pessoa {
    //Atributos
    private String nome;
    private Date dtNascimento;
    private String[] telefone;
    
    //Construtores
    public Pessoa(String nome, Date dtNascimento, String[] telefone){
        this.nome = nome;
        this.dtNascimento = dtNascimento;
        this.telefone = telefone;
    }
    
    //Metodos get's e set's
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public Date getDtNascimento(){
        return dtNascimento;
    }
    public void setDtNascimento(Date dtNascimento){
        this.dtNascimento = dtNascimento;
    }
    public String[] getTelefone(){
        return telefone;
    }
    public void setTelefone(String[] telefone){
        this.telefone = telefone;
    }
}
