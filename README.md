## Este projeto é uma aplicação web desenvolvida usando o framework Spring Boot. 

Ele é baseado em um modelo entidade-relacionamento (ER) fornecido, que inclui várias entidades e seus relacionamentos.
O objetivo do projeto é criar uma aplicação que permita realizar operações CRUD (Create, Read, Update, Delete) em pelo menos 4 entidades do modelo ER fornecido.
Aqui está uma explicação do que cada parte do projeto faz:

* ###  Models (Modelos):
São classes Java que representam as entidades do modelo ER fornecido.
Cada classe representa uma tabela no banco de dados.
Os atributos da classe representam as colunas da tabela.
As classes são anotadas com @Entity para que o Spring as reconheça como entidades JPA.

* ### Repositories (Repositórios):
São interfaces que estendem JpaRepository do Spring Data.
Fornecem métodos para realizar operações CRUD no banco de dados para cada entidade.
Os métodos incluem operações como salvar, buscar por ID, buscar todos, atualizar e excluir.

* ### Controllers (Controladores):
São classes responsáveis por receber e responder às requisições HTTP.
Cada controller é responsável por manipular as requisições relacionadas a uma entidade específica.
Os métodos do controller mapeiam para as operações CRUD e fazem chamadas aos métodos do repositório apropriado.
Os controllers são anotados com @RestController e os métodos são anotados com @GetMapping, @PostMapping, @PutMapping e @DeleteMapping para mapear os endpoints HTTP corretamente.
Exemplo de Uso:
Por exemplo, se você acessar /clientes usando um método GET, o controlador de clientes responderá com uma lista de todos os clientes no banco de dados.
Se você acessar /clientes usando um método POST com um JSON representando um novo cliente, o controlador de clientes irá salvar esse cliente no banco de dados.


O projeto fornece uma estrutura básica para uma aplicação Spring Boot que permite a manipulação de dados de acordo com o modelo ER fornecido. 
Você pode expandir este projeto adicionando mais funcionalidades, como validações, tratamento de exceções, autenticação e autorização, entre outros.



![apipizzaria](https://github.com/nayarakarinearaujo/pizzaria-api/assets/149000384/07d110cd-5022-40a3-ab95-a939f56ecc89)



