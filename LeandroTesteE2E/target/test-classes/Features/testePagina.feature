Feature: acessa pagina jsonplaceholder
Scenario: valida dados do objeto
Given acessa a pagina jsonplaceholder
And acessa o menu Guide
When abre o link de photos
Then armazena os objetos em um array JSON
And verifica o id do objeto
And verifica se o albumId
And verifica se o title
And verifica a url
And verifica a thumbnailUrl