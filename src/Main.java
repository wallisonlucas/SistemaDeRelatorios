import Exportadores.ExportadorExcel;
import Exportadores.ExportadorPDF;
import Relatorios.ItemRelatorio;
import Relatorios.Relatorio;
import Relatorios.RelatorioFinanceiro;
import Relatorios.RelatorioVendas;

public class Main {
    public static void main(String[] args) {

        ItemRelatorio a = new ItemRelatorio("Produto A", 50);
        ItemRelatorio b = new ItemRelatorio("Produto B", 200);
        ItemRelatorio c = new ItemRelatorio("Produto C", 150);

        Relatorio relatorio1 = new RelatorioFinanceiro(new ExportadorPDF());
        relatorio1.adicionarItem(a);
        relatorio1.adicionarItem(b);
        relatorio1.adicionarItem(c);
        relatorio1.gerar(false);

        Relatorio relatorio2 = new RelatorioFinanceiro(new ExportadorExcel());
        relatorio2.adicionarItem(a);
        relatorio2.adicionarItem(b);
        relatorio2.adicionarItem(c);
        relatorio2.gerar(true);

        Relatorio relatorio3 = new RelatorioVendas(new ExportadorPDF());
        relatorio3.adicionarItem(a);
        relatorio3.adicionarItem(b);
        relatorio3.adicionarItem(c);
        relatorio3.gerar(true);

        Relatorio relatorio4 = new RelatorioVendas(new ExportadorExcel());
        relatorio4.adicionarItem(a);
        relatorio4.adicionarItem(b);
        relatorio4.adicionarItem(c);
        relatorio4.gerar(false);
    }
}