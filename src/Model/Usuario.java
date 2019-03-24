/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Date;

public class Usuario extends Pessoa {
    //Atributos
    private String email;
    private String senha;
    
    //Método construtor
    public Usuario(String nome, Date dtNascimento, String[] telefone, String email, String senha) {
        super(nome, dtNascimento, telefone);
        this.email = email;
        this.senha = senha;
    }
    
    //métodos get's e set's
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    
    public String getSenha(){
        return senha;
    }
    public void setSenha(String senha){
        this.senha = senha;
    }
}
