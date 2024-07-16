package list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {

  private List<Tarefa> tarefaList;

  public ListaTarefa() {
    this.tarefaList = new ArrayList<>();
  }

  public void adicionarTarefa(String descricao) {
    tarefaList.add(new Tarefa(descricao));
  }

  public void removerTarefa(String descricao) {
    List<Tarefa> removerTarefas = new ArrayList<>();
    if (!tarefaList.isEmpty()) {
      for (Tarefa tarefa : tarefaList) {
        if (tarefa.getDescricao().equalsIgnoreCase(descricao)) {
          removerTarefas.add(tarefa);
        }
      }
      tarefaList.removeAll(removerTarefas);
    } else {
      System.out.println("A lista está vazia!");
    }
  }

  public int obterNumeroTotalTarefas() {
    return tarefaList.size();
  }

  public void obterDescricoesTarefas() {
    if (!tarefaList.isEmpty()) {
      System.out.println(tarefaList);
    } else {
      System.out.println("A lista está vazia!");
    }
  }

  public static void main(String[] args) {

    ListaTarefa listaTarefa = new ListaTarefa();


    listaTarefa.adicionarTarefa("Estudar o conteúdo da prova para a certificação PL-200");
    listaTarefa.adicionarTarefa("Fazer caminhada por 30 minutos");
    listaTarefa.adicionarTarefa("Comprar leite");
    listaTarefa.adicionarTarefa("Lavar a louça");


    System.out.println("Você tem " + listaTarefa.obterNumeroTotalTarefas() + " tarefas na lista:");

    listaTarefa.obterDescricoesTarefas();

  }
}
