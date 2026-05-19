# 📊 Sistema Comercial de Gestão de Equipes

Um sistema comercial robusto desenvolvido em **Java** com persistência de dados em **MySQL**, projetado para otimizar o gerenciamento de equipes, monitoramento de metas, controle de produtividade e atribuição de funções dentro de um ambiente corporativo.

---

## 🚀 Funcionalidades Principais

*   **Autenticação e Segurança:** Controle de acesso com níveis de permissão diferenciados (Administrador, Gerente, Colaborador).
*   **Gestão de Equipes:** Criação, edição e exclusão de equipes comerciais, vinculando colaboradores e líderes.
*   **Controle de Metas e Vendas:** Registro e acompanhamento do desempenho comercial em tempo real.
*   **Atribuição de Tarefas:** Distribuição e monitoramento de atividades com prazos e status de entrega.
*   **Relatórios Gerenciais:** Geração de métricas de desempenho e relatórios de produtividade da equipe.

---

## 🛠️ Tecnologias Utilizadas

O projeto foi construído utilizando as seguintes tecnologias e bibliotecas:

*   **Linguagem:** Java (JDK 17 ou superior)
*   **Interface Gráfica (GUI):** Java Swing / JavaFX *(Ajuste de acordo com o que usou)*
*   **Banco de Dados:** MySQL 8.0
*   **Conectividade:** JDBC (Java Database Connectivity)
*   **Padrão de Arquitetura:** MVC (Model-View-Controller)

---

## 📦 Estrutura do Banco de Dados

O banco de dados armazena informações cruciais para o funcionamento do sistema. Abaixo estão as principais entidades mapeadas:

*   `usuarios` (ID, Nome, Email, Senha, Cargo)
*   `equipes` (ID, Nome_Equipe, ID_Gerente)
*   `metas` (ID, Descricao, Valor_Alvo, Data_Limite, ID_Equipe)
*   `relatorios_vendas` (ID, ID_Usuario, Valor_Venda, Data_Venda)

> 💡 **Nota:** O script SQL completo para criação das tabelas está disponível no arquivo `database.sql` na raiz do projeto.

---

## 🔧 Como Executar o Projeto

### Pré-requisitos
Antes de começar, você vai precisar ter instalado em sua máquina:
*   [Java JDK 17+](https://www.oracle.com/java/technologies/downloads/)
*   [MySQL Server](https://dev.mysql.com/downloads/installer/)
*   Uma IDE de sua preferência (Eclipse, IntelliJ IDEA ou NetBeans)

### Passos para Configuração

1. **Clonar o repositório:**
   
   git clone [https://github.com/davidteixeira23/Sistema-comercial-para-gestao-de-equipes/tree/main)
   Sistema comercial para gestão de equipes
