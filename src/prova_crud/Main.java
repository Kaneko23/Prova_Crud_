/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prova_crud;

import static java.lang.Integer.parseInt;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author kaue_brito
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ArrayList<Produto> listProduct = new ArrayList<>();
        String resp = "";
        boolean serch = false;

        while (!resp.equals("x")) {

            resp = JOptionPane.showInputDialog("Bem-Vindo ao menu de produtos JoJoias \n"
                    + "Digite 1 para cadastrar:" + "\n"
                    + "Digite 2 para deletar:" + "\n"
                    + "Digite 3 para consultar:" + "\n"
                    + "Digite 4 para atualizar:" + "\n"
                    + "Digite 5 para reservar:" + "\n"
                    + "Digite 6 para cancelar reserva:" + "\n"
                    + "Digite 7 para adicionar:" + "\n"
                    + "Digite 8 para retirar do estoque:" + "\n"
                    + "Digite qualquer coisa para sair:");

            switch (resp) {
                case "1":
                    String nameProduct = JOptionPane.showInputDialog("Insira o nome do produto que deseja cadastrar");
                    Double valProduct = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor do produto que deseja cadastrar"));
                    int qtdProduct = parseInt(JOptionPane.showInputDialog("Insira o quantidade do produto que deseja cadastrar"));

                    Produto p = new Produto(nameProduct, valProduct, qtdProduct, 0);
                    listProduct.add(p);
                    JOptionPane.showMessageDialog(null, p.toString());
                    break;
                case "2":
                    String delProduct = JOptionPane.showInputDialog("Insira o nome do produto que deseja excluir");
                    for (int i = 0; i < listProduct.size(); i++) {
                        String test = listProduct.get(i).toString();
                        if (test.contains(delProduct)) {
                            listProduct.remove(listProduct.get(i));
                        }
                    }

                    break;
                case "3":

                    String consProduct = JOptionPane.showInputDialog("Insira o nome do produto que deseja consultar");

                    for (int i = 0; i < listProduct.size(); i++) {
                        if (listProduct.get(i).getNome().equals(consProduct)) {
                            JOptionPane.showMessageDialog(null, listProduct.get(i));
                            serch = true;

                        }
                    }
                    if (!serch) {
                        JOptionPane.showMessageDialog(null, "erro");
                    }
                    break;
                case "4":
                    String upProduct = JOptionPane.showInputDialog("Insira o nome do produto que deseja atualizar");

                    for (int i = 0; i < listProduct.size(); i++) {
                        if (listProduct.get(i).getNome().equals(upProduct)) {
                            JOptionPane.showMessageDialog(null, "seu produto é: " + listProduct.get(i));
                            String newNameProduct = JOptionPane.showInputDialog("Insira o novo nome do produto que deseja atualizar");
                            Double newValProduct = Double.parseDouble(JOptionPane.showInputDialog("Insira novo o valor do produto que deseja atualizar"));
                            int newQtdProduct = parseInt(JOptionPane.showInputDialog("Insira a nova quantidade do produto que deseja atualizar"));

                            listProduct.get(i).setNome(newNameProduct);
                            listProduct.get(i).setVal(newValProduct);
                            listProduct.get(i).setQtdProduto(newQtdProduct);

                            JOptionPane.showMessageDialog(null, listProduct.get(i));
                            serch = true;
                        }
                    }
                    if (!serch) {
                        JOptionPane.showMessageDialog(null, "erro");
                    }

                    break;
                case "5":
                    String resProduct = JOptionPane.showInputDialog("Insira o nome do produto que deseja Reservar");

                    for (int i = 0; i < listProduct.size(); i++) {
                        if (listProduct.get(i).getNome().equals(resProduct)) {
                            JOptionPane.showMessageDialog(null, "seu produto é: " + listProduct.get(i));
                            int qtdProductRes = parseInt(JOptionPane.showInputDialog("Insira a quantidade do produto que deseja reservar"));
                            int novaQtd = listProduct.get(i).getQtd() - qtdProductRes;
                            listProduct.get(i).setQtdProduto(novaQtd);
                            listProduct.get(i).setQtdResProduto(qtdProductRes);

                            JOptionPane.showMessageDialog(null, listProduct.get(i));
                            serch = true;
                        }
                    }
                    if (!serch) {
                        JOptionPane.showMessageDialog(null, "erro");
                    }
                    break;
                case "6":
                    String canResProduct = JOptionPane.showInputDialog("Insira o nome do produto que deseja cancelar a reservar");

                    for (int i = 0; i < listProduct.size(); i++) {
                        if (listProduct.get(i).getNome().equals(canResProduct)) {
                            JOptionPane.showMessageDialog(null, "seu produto é: " + listProduct.get(i));
                            int cancProductRes = parseInt(JOptionPane.showInputDialog("Insira a quantidade do produtos que deseja cancelar a reservar"));
                            int novaQtdRes = listProduct.get(i).getQtdRes() - cancProductRes;
                            int novaQtd = listProduct.get(i).getQtd() + cancProductRes;
                            listProduct.get(i).setQtdProduto(novaQtd);
                            listProduct.get(i).setQtdResProduto(novaQtdRes);
                            JOptionPane.showMessageDialog(null, listProduct.get(i));
                            serch = true;
                        }
                    }
                    if (!serch) {
                        JOptionPane.showMessageDialog(null, "erro");
                    }
                    break;

                case "7":
                    String addProduct = JOptionPane.showInputDialog("Insira o nome do produto que deseja adicionar");

                    for (int i = 0; i < listProduct.size(); i++) {
                        if (listProduct.get(i).getNome().equals(addProduct)) {
                            JOptionPane.showMessageDialog(null, "seu produto é: " + listProduct.get(i));
                            int qtdProductAdd = parseInt(JOptionPane.showInputDialog("Insira a quantidade do produto que deseja adicionar"));
                            int novaQtd = listProduct.get(i).getQtd() + qtdProductAdd;
                            listProduct.get(i).setQtdProduto(novaQtd);
                            JOptionPane.showMessageDialog(null, listProduct.get(i));
                            serch = true;
                        }
                    }
                    if (!serch) {
                        JOptionPane.showMessageDialog(null, "erro");
                    }
                    break;
                case "8":
                    String removeProduct = JOptionPane.showInputDialog("Insira o nome do produto que deseja remover");

                    for (int i = 0; i < listProduct.size(); i++) {
                        if (listProduct.get(i).getNome().equals(removeProduct)) {
                            JOptionPane.showMessageDialog(null, "seu produto é: " + listProduct.get(i));
                            int qtdProductRemove = parseInt(JOptionPane.showInputDialog("Insira a quantidade do produto que deseja remover"));

                            int restante = listProduct.get(i).getQtdRes() - qtdProductRemove;
                            if (restante <= 0) {
                                int qtdEstoqueTotal = listProduct.get(i).getQtd() - Math.abs(restante);
                                listProduct.get(i).setQtdProduto(qtdEstoqueTotal);
                                listProduct.get(i).setQtdResProduto(0);
                            } else {
                                listProduct.get(i).setQtdResProduto(restante);
                            }

                            JOptionPane.showMessageDialog(null, listProduct.get(i));
                            serch = true;
                        }
                    }
                    if (!serch) {
                        JOptionPane.showMessageDialog(null, "erro");
                    }
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "saindo...");
                    resp = "x";
                    break;
            }
        }
    }
}
