

Descrição do Projeto

Neste sistema, a biblioteca pode gerenciar dois tipos de materiais: livros e revistas.
Vamos utilizar uma classe base chamada Material para representar um material da biblioteca e criar subclasses Livro e Revista que herdam de Material.
A biblioteca deve ser capaz de adicionar, pesquisar, excluir e listar ambos os tipos de materiais.

Estrutura do Projeto

Classe Material: Classe base para livros e revistas.
Classe Livro: Subclasse de Material que representa um livro.
Classe Revista: Subclasse de Material que representa uma revista.
Classe Biblioteca: Gerencia a coleção de materiais e fornece métodos para adicionar, pesquisar, excluir e listar materiais.
Enum Genero: Representa os gêneros dos materiais (aplicável a livros).
Classe Main: Contém o menu e a lógica principal do sistema.

Explicação da Implementação

Classe Material: Classe base abstrata que contém os atributos comuns a todos os materiais da biblioteca, como titulo e autor. Os métodos toString e os getters/setters são definidos aqui.

Classe Livro: Herda de Material e adiciona um atributo específico para livros, que é genero. O método toString é sobrescrito para incluir o gênero.

Classe Revista: Também herda de Material e adiciona um atributo específico para revistas, que é numero. O método toString é sobrescrito para incluir o número da revista.

Classe Biblioteca: Usa uma ArrayList para gerenciar uma lista de objetos Material, permitindo adicionar, pesquisar, excluir e listar materiais. As operações agora podem lidar com ambos os tipos de materiais (livros e revistas) de forma polimórfica.

Classe Main: Atualizada para permitir a adição de livros e revistas. Adiciona materiais à biblioteca e realiza operações de pesquisa, exclusão e listagem.

Feedback nas Operações:

Em todas as operações, fornecer feedback ao usuário. Por exemplo, ao concluir o cadastro de um novo material, exibir a mensagem "Novo material cadastrado com sucesso!".
Ao excluir um material, confirmar a exclusão com a mensagem "Material excluído com sucesso!".





