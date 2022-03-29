package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target\\cucumber-reports.html",
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-report/cucumber.xml"},
        features="src/test/resources/features",
        glue = "stepdefinitions",
        tags="  @Automation",
        dryRun = false

)

public class Runner {
    // Runner class inin body sine hicbir kod yazmiyoruz
    //bu class icin onemli olan kullanacagimiz 2 adet notasyon
    //dryRun=false yazildiginda belirlenen tag la etiketlenen tum senaryoları sırasıyla
    //calistirir
    //dryRun=true dedigimizde ise kodları çalıstırmadan eksik stepler olup olmadigini kontrol eder
    // ve varsa bize eksik stepleri rapor eder

    // features ve glue olarak spesifik bir class veya feature dosyasini degil
    // tum klasor ve package'i sectik
    // dolayisiyla stepdefinitions package'i icerisinde hangi class'da olursa olsun
    // isimize yarayan bir stepdefition varsa rahatlikla kullanabiliriz
}
