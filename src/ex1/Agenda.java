package ex1;

import java.util.ArrayList;
import java.util.List;

public class Agenda {

    private List<Pessoa> agendaPessoas = new ArrayList<>();

    public List<Pessoa> getAgendaPessoas() {
        return agendaPessoas;
    }

    public void armazenarPessoa(String nome, int idade, float altura){
        agendaPessoas.add(new Pessoa(nome, idade, altura));
    }

    public void removePessoa(String nome){
        agendaPessoas.remove(buscaPessoa(nome));
    }

    public int buscaPessoa(String nome){
        for (Pessoa p: agendaPessoas) {
            if (p.getNome().equalsIgnoreCase(nome)) {
                return agendaPessoas.indexOf(p);
            }
        }
        throw new RuntimeException("Pessoa não encontrada!");
    }

    public void imprimeAgenda(){
        agendaPessoas.forEach(p -> System.out.println(agendaPessoas.indexOf(p) + " -> " + p.getNome()));
    }

    public void imprimePessoa(int index){
        if(index <= agendaPessoas.size() && index > 0){
            System.out.println(agendaPessoas.get(index));
        } else throw new RuntimeException("Não existe nenhuma pessoa com esse index...");
    }
}
