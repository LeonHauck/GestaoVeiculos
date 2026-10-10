# Relatório Teórico: Sistema Automotivo - Gestão de Estoque de Veículos

## 1. Levantamento de Requisitos (Mínimo 10 Perguntas)
1. **P:** Qual o principal objetivo do sistema? 
   **R:** Gerenciar de forma centralizada o estoque de veículos da concessionária, organizando cadastro e busca.
2. **P:** Quais informações do veículo são obrigatórias no cadastro?
   **R:** Modelo, marca, ano, cor, preço, quilometragem e status de disponibilidade.
3. **P:** Como as marcas e modelos devem ser tratados?
   **R:** Devem ter cadastros próprios e os veículos devem ser vinculados a eles.
4. **P:** O que deve acontecer quando um veículo for vendido?
   **R:** O status dele deve ser atualizado para "Vendido" ou ele deve ser removido do estoque.
5. **P:** Quais filtros são essenciais na busca?
   **R:** Filtro por marca, modelo, ano, preço máximo e status de disponibilidade.
6. **P:** Quem utilizará o sistema?
   **R:** Vendedores, para buscar veículos, e administradores, para gerenciar o cadastro.
7. **P:** Quais tecnologias serão usadas no backend?
   **R:** Java com Spring Boot.
8. **P:** Qual será o banco de dados utilizado?
   **R:** MySQL.
9. **P:** O sistema precisa de alguma interface web?
   **R:** Sim, uma interface simples (Front-End) para listar, filtrar e cadastrar os veículos.
10. **P:** Qual é o tempo de resposta esperado para buscas?
    **R:** O sistema deve ter alta performance (Requisito Não Funcional), respondendo quase que instantaneamente.

## 2. Descrição das Principais Entidades
* **Marca:** Representa a fabricante do veículo. Contém apenas ID e Nome.
* **Modelo:** Representa o modelo específico de um carro e tem relação obrigatória com uma Marca (Ex: Corolla pertence à Toyota).
* **Veículo:** A entidade central do sistema. Representa uma unidade física no estoque, guardando detalhes específicos como cor, ano de fabricação, quilometragem atual, preço e seu status atual (Disponível, Vendido). Relaciona-se com a entidade Modelo.

## 3. Aplicação dos Conceitos de POO
* **Classes e Objetos:** Foram criadas classes modelo como `Veiculo`, `Marca` e `Modelo`. Elas representam entidades do mundo real dentro do software.
* **Atributos e Métodos:** Cada classe possui atributos privados (ex: `preco`, `cor`) e métodos de acesso (Getters e Setters gerados pelo Lombok).
* **Encapsulamento:** Os atributos das entidades são privados e só podem ser manipulados indiretamente ou por meio de repositórios, garantindo a integridade dos dados (como impedir um preço negativo na lógica de negócio).
* **Camadas (Arquitetura):** O uso de Controllers e Services em Spring Boot promove a separação de responsabilidades.

## 4. Requisitos Funcionais e Não Funcionais
**Funcionais:**
* **RF1:** Cadastro de novos veículos, marcas e modelos.
* **RF2:** Relacionar os veículos a marcas/modelos na base de dados.
* **RF3:** Atualização dos dados (editar preço, km, etc).
* **RF4:** Deleção lógica ou remoção física de veículos.
* **RF5:** Consulta e filtro aprimorado de veículos.

**Não Funcionais:**
* **RNF1 (Usabilidade):** Interface Front-End web deve ser simples e clara.
* **RNF2 (Performance):** A API deve utilizar consultas eficientes (JPA Specifications) para não onerar o banco nas pesquisas.
* **RNF3 (Tecnologias):** Aplicação RESTful construída com Spring Boot.

## 5. Justificativa das Tecnologias
* **Java:** Linguagem fortemente tipada, excelente para implementar Orientação a Objetos de forma clara, o que foi essencial para o design do projeto.
* **Spring Boot:** Framework que agiliza a criação de APIs RESTful, reduzindo o *boilerplate* de configuração e simplificando a injeção de dependências e a exposição de *endpoints*.
* **MySQL:** Banco de dados relacional (RDBMS) muito robusto, ideal para estruturar tabelas de Marcas, Modelos e Veículos com suas respectivas chaves estrangeiras, garantindo integridade referencial.
