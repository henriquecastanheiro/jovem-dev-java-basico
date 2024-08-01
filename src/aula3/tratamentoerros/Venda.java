package aula3.tratamentoerros;

import java.util.ArrayList;

public class Venda {
    private String nomeCliente;
    ArrayList<Item> itens;

    public Venda() {
        this.itens = new ArrayList<>();
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public ArrayList<Item> getItens() {
        return itens;
    }

    public void setItens(ArrayList<Item> itens) {
        this.itens = itens;
    }

    public String geraCupomFiscal() {
        String txt = "          CUPOM FISCAL \n\n"
            + "Nome do cliente: " + this.nomeCliente
            + "  \nQuantidade de itens: " + this.itens.size()
            + "\n\n     Produtos Comprados \n";

        double total = 0;
        for (Item i : itens) {
            txt += "\nItem: " + i.getNome() + "\nPreço: R$ " + i.getPreco() + "\n";
            total += i.getPreco();
        }

        txt += "\nTotal: R$ " + total;

        return txt;
    }
}
