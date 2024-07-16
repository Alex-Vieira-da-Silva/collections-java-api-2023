package list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

  private List<Item> itemList;

  public CarrinhoDeCompras() {
    this.itemList = new ArrayList<>();
  }

  public void adicionarItem(String nome, double preco, int quantidade) {
    Item item = new Item(nome, preco, quantidade);
    this.itemList.add(item);
  }

  public void removerItem(String nome) {
    List<Item> itensParaRemover = new ArrayList<>();
    if (!itemList.isEmpty()) {
      for (Item i : itemList) {
        if (i.getNome().equalsIgnoreCase(nome)) {
          itensParaRemover.add(i);
        }
      }
      itemList.removeAll(itensParaRemover);
    } else {
      System.out.println("A lista está vazia!");
    }
  }

  public double calcularValorTotal() {
    double valorTotal = 0d;
    if (!itemList.isEmpty()) {
      for (Item item : itemList) {
        double valorItem = item.getPreco() * item.getQuant();
        valorTotal += valorItem; //valorTotal = valorTotal + valorItem;
      }
      return valorTotal;
    } else {
      throw new RuntimeException("A lista está vazia!");
    }
  }

  public void exibirItens() {
    if (!itemList.isEmpty()) {
      System.out.println(this.itemList);
    } else {
      System.out.println("A lista está vazia!");
    }
  }

  @Override
  public String toString() {
    return "CarrinhoDeCompras{" +
        "itens=" + itemList +
        '}';
  }

  public static void main(String[] args) {

    CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

    carrinhoDeCompras.adicionarItem("Café", 5d, 100);
    carrinhoDeCompras.adicionarItem("Leite", 9d, 50);
    carrinhoDeCompras.adicionarItem("Chocolate em pó", 15d, 80);
    carrinhoDeCompras.adicionarItem("Pipoca", 3d, 25);

    carrinhoDeCompras.exibirItens();

  }
}