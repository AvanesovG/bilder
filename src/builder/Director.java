package builder;

public class Director {
    WebSiteBuilder builder;

    public void setBuilder(WebSiteBuilder builder) {
        this.builder = builder;
    }
    WebSite buildWebSite(){
        builder.createWebsite();
        builder.buildName();
        builder.buildCms();
        builder.buildPrise();
        WebSite webSite = builder.getWebSide();
        return webSite;

    }
}
