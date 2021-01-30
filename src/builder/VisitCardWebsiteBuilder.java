package builder;

public class VisitCardWebsiteBuilder extends WebSiteBuilder{
    @Override
    void buildName() {

        webSide.setName("Visit");
    }

    @Override
    void buildCms() {
        webSide.setCms(Cms.WORDPRESS);

    }

    @Override
    void buildPrise() {
        webSide.setPrise(500);

    }
}
