package builder;

public abstract class WebSiteBuilder {

    WebSite webSide;
    void createWebsite(){
        webSide = new WebSite();
    }
    abstract void buildName();
    abstract void buildCms();
    abstract void buildPrise();

    WebSite getWebSide(){
        return  webSide;
    }


}
