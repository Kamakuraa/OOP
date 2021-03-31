package FastTrackIt.TemaCurs8.Tema1.Tema2;

public class AdsMain {
    public static void main(String[] args) {
        String[] messages = {
                "Este timpul sa iti schimbi viata"
        };
        AdsPage adsPage = new AdsPage(messages);
        adsPage.sendAdsMessages(new Email("test@test.ro",
                "test", "cea mai buna oferta"));
        adsPage.sendAdsMessages(new Facebook("Joe", "oferta, cel mai bun pret",
                30, true));
        adsPage.sendAdsMessages(new Print("Nu rata ocazia, doar astazi........"));
    }
}
