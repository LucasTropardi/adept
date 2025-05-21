package br.com.adpt;

import com.vaadin.flow.component.page.AppShellConfigurator;
import com.vaadin.flow.theme.Theme;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

@SpringBootApplication
@Theme(value = "adeptms")
public class Application implements AppShellConfigurator {

    public static void main(String[] args) {
        loadExternalProperties();
        SpringApplication.run(Application.class, args);
    }

    private static void loadExternalProperties() {
        String[] possiblePaths = {
                "/data/adeptms.properties",                     // Produção
                "C://adeptms//adeptms.properties",              // Dev local
                "/home/lucas/Configs/adeptms.properties"        // Dev Linux
        };

        for (String path : possiblePaths) {
            File file = new File(path);
            if (file.exists()) {
                try (InputStream input = new FileInputStream(file)) {
                    Properties props = new Properties();
                    props.load(input);
                    for (String key : props.stringPropertyNames()) {
                        System.setProperty(key, props.getProperty(key));
                    }
                    System.out.println("Configurações carregadas de: " + path);
                    return; // Parar após o primeiro válido
                } catch (IOException e) {
                    System.out.println("Erro ao carregar propriedades de: " + path);
                    e.printStackTrace();
                }
            }
        }

        System.out.println("Nenhum arquivo de configuração externo encontrado.");
    }
}
