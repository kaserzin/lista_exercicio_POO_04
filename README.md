Questao 1:<br>
A) verdadeira os construtores de uma superclasse não são herdados pelas subclasses. Entretanto, uma subclasse pode chamar o construtor da superclasse utilizando super(), para inicializar os atributos herdados.
<br>B) verdadeira o relacionamento tem um representa uma associação entre classes, enquanto o relacionamento é um é implementado por meio da herança. Exemplo, se Cachorro herda de Animal, o cachorro é um animal.
<br>C) falsa quando uma subclasse redefine um método da superclasse com a mesma assinatura, ocorre uma sobrescrita. A sobrecarga acontece quando existem métodos com o mesmo nome, mas com parâmetros diferentes.
<br><br>
Questao 2:
<br>o acesso protected permite que os atributos e métodos sejam acessados pela própria classe, por classes do mesmo pacote e por subclasses, facilitando a reutilização de código por herança. Já o acesso private restringe o acesso diretamente à própria classe, protegendo melhor os dados e preservando o encapsulamento. Por isso, private costuma ser preferível, enquanto protected pode ser útil quando as subclasses realmente precisam acessar determinados membros.
<br><br>Questao 3:<br>
o construtor da superclasse precisa ser executado antes da inicialização específica da subclasse. Essa chamada pode ser explícita, utilizando super(), ou implícita, quando o compilador insere super() automaticamente, desde que exista um construtor sem parâmetros acessível na superclasse. Isso é necessário para garantir que a parte herdada do objeto seja inicializada corretamente antes da execução do construtor da subclasse.
