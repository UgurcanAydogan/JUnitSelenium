package day10_actions_facar_fileTestleri;

import org.junit.Test;
import utilities.TestBase;

public class C04_DosyaYolunuDinamikYapma extends TestBase {

    @Test
    public void test01(){

        /*
            Java dosya yolunu dinamik hale getirebilmemiz icin
            bize iki temel konuma ulasmak icin hazir method sunmus

            1-  calistigimiz projenin dosya yoluna ulasmak isterseniz
                System.getProperty("user.dir")

            2- bilgisayarin ana dosyayoluna ulasmak isterseniz
               System.getProperty("user.home")

               Eger bir takim halinde calisiyorsak
               projemizdeki bir dosya
               veya downloads'a indirdigimiz bir dosyanin varligini test etmek istiyorsak
               dosya yolunu bu iki kodu kullanarak dinamik hale getirmeliyiz
         */

        System.out.println(System.getProperty("user.dir"));

        // C:\Users\\ugurc\IdeaProjects\com.team127_JUnit


        System.out.println(System.getProperty("user.home"));
        // C:\Users\\ugurc

    }
}