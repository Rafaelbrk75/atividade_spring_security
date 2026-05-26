Parte 1 - Conceitos
1. Explique com suas palavras o que é Spring Security.
R- O Spring Security é um framework do ecossistema Spring usado para proteger aplicações.
Ele controla autenticação (quem é o usuário) e autorização (o que ele pode acessar).

2. Para que serve o método csrf().disable()?
R- O CSRF é uma proteção contra ataques chamados Cross-Site Request Forgery.
Em APIs REST normalmente essa proteção é desnecessária, principalmente quando usamos JWT ou APIs stateless.
Então:
csrf(csrf -> csrf.disable())

desabilita essa proteção.

3. Explique o que significa SessionCreationPolicy.STATELESS.
R- Significa que a aplicação NÃO vai guardar sessão do usuário no servidor.
Cada requisição precisa trazer suas próprias credenciais.
Muito usado em APIs REST modernas.

4. Qual a função do permitAll()?
R- Ele libera o acesso para qualquer pessoa, sem precisar autenticação.
Exemplo:
.requestMatchers("/produtos").permitAll()

Qualquer usuário consegue acessar essa rota.

5. Explique o que faz o requestMatchers().
R- Serve para definir quais rotas terão regras específicas de segurança.
Exemplo:
.requestMatchers(HttpMethod.GET, "/produtos")

Está selecionando a rota GET /produtos.

6. Qual a função do anyRequest().authenticated()?
R- Significa:
qualquer rota que não foi liberada anteriormente vai exigir autenticação.
Exemplo:

.anyRequest().authenticated()

7. O que é uma API Stateless?
R-  É uma API que não guarda informações da requisição anterior.
Cada requisição é independente.
O servidor não mantém sessão do usuário.

8. Explique o que a lambda abaixo faz:
   session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS)
R- Essa lambda configura o Spring Security para trabalhar sem sessões.
Ou seja:
nenhuma sessão será criada, a API será stateless e cada requisição deve conter autenticação própria
 