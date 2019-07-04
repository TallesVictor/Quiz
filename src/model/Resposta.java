/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

public class Resposta {
private Integer id;
private Integer idusuario;
private Integer Idpergunta;
private String resposta;

    public Resposta(Integer id, Integer idusuario, Integer Idpergunta, String resposta) {
        this.id = id;
        this.idusuario = idusuario;
        this.Idpergunta = Idpergunta;
        this.resposta = resposta;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(Integer idusuario) {
        this.idusuario = idusuario;
    }

    public Integer getIdpergunta() {
        return Idpergunta;
    }

    public void setIdpergunta(Integer Idpergunta) {
        this.Idpergunta = Idpergunta;
    }

    public String getResposta() {
        return resposta;
    }

    public void setResposta(String resposta) {
        this.resposta = resposta;
    }

    

}
