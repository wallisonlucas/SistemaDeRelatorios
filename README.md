# 📊 Sistema de Relatórios — Padrão de Projeto Bridge
> Atividade prática da disciplina de **Padrões de Projeto** do curso de **Análise e Desenvolvimento de Sistemas (ADS) - IFPB**, aplicando o padrão **Bridge** para separar tipos de relatório dos formatos de exportação, permitindo que ambos variem de forma independente.

---

## 📌 Sobre o projeto
Este projeto simula um sistema corporativo de geração de relatórios que precisa lidar com duas dimensões variáveis: o **tipo de relatório** (Financeiro ou Vendas) e o **formato de exportação** (PDF ou Excel). Utilizando o **padrão Bridge**, essas duas hierarquias são desacopladas via composição, eliminando a explosão de classes que surgiria com combinações como `RelatorioFinanceiroPDFDetalhado` ou `RelatorioVendasExcelSimples`.

---

## 🎯 Objetivo
Aplicar o padrão **Bridge** para:
- Separar a abstração (tipo de relatório) da implementação (formato de exportação)
- Permitir que tipo e formato variem de forma independente
- Suportar níveis de detalhamento sem criar classes combinadas

---

## 🧠 O Padrão Bridge
O **Bridge** é um padrão estrutural que desacopla uma abstração de sua implementação, para que as duas possam variar independentemente. A ponte entre elas é feita por composição.

```
Exportador (interface)
  ├── ExportadorPDF
  └── ExportadorExcel

Relatorio (abstração)
  ├── exportador → referência ao Exportador (a "ponte")
  ├── RelatorioFinanceiro   → abstração refinada
  └── RelatorioVendas       → abstração refinada
```

A `Main` combina livremente qualquer tipo de relatório com qualquer exportador, sem necessidade de classes intermediárias para cada combinação.

---

## 👨‍💻 Autor
Desenvolvido como atividade prática da disciplina de **Padrões de Projeto**.
