package Exportadores;

import Relatorios.ItemRelatorio;

import java.util.List;

public class ExportadorExcel implements Exportador {
    @Override
    public void exportar(String titulo, List<ItemRelatorio> itens, double total) {
        System.out.println("=== EXPORTANDO EXCEL ===");
        System.out.println("Titulo:" + titulo);
        System.out.println("Itens:");
        for (ItemRelatorio item : itens) {
            System.out.println("- " +  item.getDescricao() + " | R$ " + item.getValor());
        }
        System.out.println("Total: R$ " + total);
        System.out.println("======================");
        System.out.println();
    }
}