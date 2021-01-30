package builder;

public class EnterpriseWebSite extends WebSiteBuilder{
    @Override
    void buildName() {
webSide.setName("Enterpise");
    }

    @Override
    void buildCms() {
        webSide.setCms(Cms.ALIFRESCO);

    }

    @Override
    void buildPrise() {
        webSide.setPrise(10000);

    }
}
