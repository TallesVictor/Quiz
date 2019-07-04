/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import model.Pergunta;
import model.PerguntaDao;

public class PerguntaController {
    PerguntaDao dao;

    public ArrayList<Pergunta> RandomizarPergunta() {
        dao = new PerguntaDao();
        return dao.RandomizarPergunta();
    }
    
    public boolean salvarPergunta(Pergunta p){
        dao = new PerguntaDao();
        return dao.salvar(p);
    }

    public ArrayList<Pergunta> buscarPerguntas() {
        dao = new PerguntaDao();
        return dao.buscarTodos();
    }

    public Pergunta buscarPorId(Integer id) {
        dao = new PerguntaDao();
        return dao.buscarPorId(id);
    }

    public void excluir(Integer id) {
        dao = new PerguntaDao();
        dao.excluir(id);
    }

    public void atualizarPergunta(Pergunta p) {
        dao = new PerguntaDao();
        dao.atualizar(p);
    }

    public ArrayList<Pergunta> filtrarPerguntas(String id, String pergunta, String resposta, String opcao) {
        dao = new PerguntaDao();
        if ("".equals(id) && "".equals(pergunta) && "".equals(pergunta) && "".equals(opcao)) {
            return dao.buscarTodos();
        }else{
            return dao.filtrarPerguntas(id, pergunta, resposta, opcao);
        }
    }
}
