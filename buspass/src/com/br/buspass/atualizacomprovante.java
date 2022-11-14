package com.br.buspass;

import java.util.*;
import java.io.*;
import com.br.buspass.conexao.ConexaoBD;

public static String endpoint = "jdbc:postgresql://localhost:5432/buspass";
public static String subscriptionKey = "postgres";
public static String imagePath = "path-to-your-image";

public static String prettify(String json_text) {
    JsonParser parser = new JsonParser();
    JsonObject json = parser.parse(json_text).getAsJsonObject();
    Gson gson = new GsonBuilder().setPrettyPrinting().create();
    return gson.toJson(json);
}

CloseableHttpClient httpClient = HttpClientBuilder.create().build();

HttpEntity entity = MultipartEntityBuilder
    .create()
    .addBinaryBody("image", new File(imagePath))
    .build();

    HttpPost httpPost = new HttpPost(endpoint);
    httpPost.setHeader("Ocp-Apim-Subscription-Key", subscriptionKey);
    httpPost.setEntity(entity);

    HttpResponse response = httpClient.execute(httpPost);
    InputStream stream = response.getEntity().getContent();

    String json = new Scanner(stream).useDelimiter("\\A").next();
    System.out.println("\nJSON Response:\n");
    System.out.println(prettify(json));