package br.com.alura.comex;

import br.com.alura.comex.produtos.Produto;
import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class teste{
    public static void main(String[] args) throws IOException, InterruptedException {

//        Semana 5
//        cards 4 e 5


        /*try {
            Scanner leitura = new Scanner(System.in);
            System.out.println("Digite um número");
            int numero = leitura.nextInt();
            System.out.println("O número digitado é: " + numero);
        }catch(Exception e){
            System.out.println("O valor digitado não é um número!");
        }*/

// CARD 6 à 9

        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite um produto");
        var busca = leitura.nextInt();

        String endereco = "https://fakestoreapi.com/products/"+ busca;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());

        Gson gson = new Gson();

        Produto meuProduto = gson.fromJson(response.body(), Produto.class);
        System.out.println(meuProduto);
    }
}
