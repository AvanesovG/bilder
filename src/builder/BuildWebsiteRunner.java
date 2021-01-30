package builder;

public class BuildWebsiteRunner {
    public static void main(String[] args) {
        Director director= new Director();
        director.setBuilder(new EnterpriseWebSite());
        WebSite webSite = director.buildWebSite();
        System.out.println(webSite);
    }
}
