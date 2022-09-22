# listaContatos
CRUD de contatos de uma pessoa com Spring Boot e Java 8

# Teste no PostMan

#### GET Pessoas

http://localhost:8080/listaContato/pessoas

#### GET Contatos

http://localhost:8080/listaContato/contatos_pessoa/1

#### POST AddPessoa
http://localhost:8080/listaContato/adicionar_pessoa

```sh
json
{
  "nome": "Pedro Silva"
}
```

#### POST AddContato
http://localhost:8080/listaContato/adicionar_contato

```sh
json
{
  "telefone": "99999999",
  "email": "usuario.gmail.com",
  "whatsapp": "99999999",
  "pessoa": {
    "id": 1
  }
}
```

#### GET Pessoa

http://localhost:8080/listaContato/pessoa/1

#### PUT EditarPessoa

http://localhost:8080/listaContato/editar_pessoa

```sh
json
{
  "id": 1,
  "nome": "Pedro Silva editado"
}
```

#### DEL RemoverPessoa

http://localhost:8080/listaContato/remover_pessoa/1

#### PUT EditarContato

http://localhost:8080/listaContato/editar_contato

```sh
json
{
  "id": 1,
  "telefone": "99999999",
  "email": "usuario_editado.gmail.com",
  "whatsapp": "99999999",
  "pessoa": {
    "id": 1
  }
}
```

#### DEL RemoverContato

http://localhost:8080/listaContato/remover_contato/1
