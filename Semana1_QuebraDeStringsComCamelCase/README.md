Criar utilizando TDD um método que transforma uma cadeia de caracteres em camel case (http://pt.wikipedia.org/wiki/CamelCase) em uma lista de Strings com as palavras. O método deve possuir a seguinte assinatura: "public static List<String> converterCamelCase(String original)".
<br/>
Faça um relatório detalhando todo o processo de TDD.
<br/>
Para cada ciclo que você fizer no TDD, adicione uma seção no relatório o seguinte: o teste adicionado, como estava o código antes, como ficou o código depois para fazer o teste passar e uma pequena descrição textual do que foi feito.
<br/>
Abaixo seguem alguns exemplos de entrada e saída que você pode usar como base para os seus testes (crie adicionais ou diferentes se achar necessário):
<br/>
<ul>
<li>nome - “nome”</li>
<li>Nome - “nome”</li>
<li>nomeComposto - “nome”, “composto”</li>
<li>NomeComposto - “nome”, “composto”</li>
<li>CPF - “CPF”</li>
<li>numeroCPF - “numero”, “CPF”</li>
<li>numeroCPFContribuinte - “numero”, “CPF”, “contribuinte”</li>
<li>recupera10Primeiros - “recupera”, “10”, “primeiros”</li>
<li>10Primeiros - Inválido → não deve começar com números</li>
<li>nome#Composto - Inválido → caracteres especiais não são permitidos, somente letras e números</li>
</ul>
<br/>
É permitida a criação de métodos auxiliares. Para ficar mais divertido e praticar a refatoração, nenhum método pode possuir mais de dez linhas de código em seu corpo. Não vale “roubar” e incluir vários comandos em uma mesma linha de código!
<br/>
Para cada refatoração que precisar fazer nesse processo, adicione uma seção no relatório o seguinte: como estava o código antes, como ficou o código depois da refatoração e uma pequena descrição textual do que foi feito.
<br/>
No método desenvolvido é permitida somente a utilização de classes da API básica da linguagem Java. Se você utilizar algum componente externo que facilite demais sua tarefa, estará tirando o propósito do exercício!
<br/>
Você deverá entregar o relatório detalhado e o código final.
