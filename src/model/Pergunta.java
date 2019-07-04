/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

public class Pergunta {
    private Integer id;
    private String pergunta;
    private String a;
    private String b;
    private String c;
    private String d;
    private String opcaoCorreta;

    public Pergunta(String pergunta, String a, String b, String c, String d, String opcaoCorreta) {
        this.pergunta = pergunta;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.opcaoCorreta = opcaoCorreta;
    }
    
    public Pergunta(Integer id, String pergunta, String a, String b, String c, String d, String opcaoCorreta) {
        this.id = id;
        this.pergunta = pergunta;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.opcaoCorreta = opcaoCorreta;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPergunta() {
        return pergunta;
    }

    public void setPergunta(String pergunta) {
        this.pergunta = pergunta;
    }

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }

    public String getC() {
        return c;
    }

    public void setC(String c) {
        this.c = c;
    }

    public String getD() {
        return d;
    }

    public void setD(String d) {
        this.d = d;
    }

    public String getOpcaoCorreta() {
        return opcaoCorreta;
    }

    public void setOpcaoCorreta(String opcaoCorreta) {
        this.opcaoCorreta = opcaoCorreta;
    }
    
    
}
