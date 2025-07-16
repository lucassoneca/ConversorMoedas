import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;

public class ExportadorJson {

    public static void salvarComoJson(ResultadoConversao resultado, String nomeArquivo) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        try (FileWriter writer = new FileWriter(nomeArquivo)) {
            gson.toJson(resultado, writer);
            System.out.println("Arquivo salvo com sucesso: " + nomeArquivo);
        } catch (IOException e) {
            System.out.println("Erro ao salvar JSON: " + e.getMessage());
        }
    }
}