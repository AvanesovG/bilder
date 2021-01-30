package builder;

public class WebSite {

    private String name;
    private Cms cms;
    private int prise;

    public void setName(String name) {
        this.name = name;
    }

    public void setCms(Cms cms) {
        this.cms = cms;
    }

    public void setPrise(int prise) {
        this.prise = prise;
    }

    @Override
    public String toString() {
        return "WebSide{" +
                "name='" + name + '\'' +
                ", cms=" + cms +
                ", prise=" + prise +
                '}';
    }

}
