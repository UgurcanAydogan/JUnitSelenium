package day10_actions_facar_fileTestleri;

import org.junit.Assert;
import org.junit.Test;

import java.nio.file.Files;
import java.nio.file.Paths;

public class C06_BilgisayardakiDosyayiTestEtme {

    @Test
    public void test01(){

        // Downloads'da logo.png oldugunu test edin

        String dosyaYolu = "C:\\Users\\ugurc\\OneDrive\\Masaüstü";

        Assert.assertTrue(Files.exists(Paths.get(dosyaYolu)));


        // Herkeste farkli olan ==> user.home
        //          /Users/ahmetbulutluoz
        // Herkeste ayni olan
        //          /Downloads/logo.png

        String dinamikDosyaYolu = System.getProperty("user.home") +
                "\\OneDrive\\Masaüstü";

        Assert.assertTrue(Files.exists(Paths.get(dinamikDosyaYolu)));

    }
}