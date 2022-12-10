public class AlatMusik {
    protected String name;

public AlatMusik (String name) {
        this.name = name;
    }

    public String getname() {
        return name;
    }

    public void caraMain() {
        System.out.println("");
    }

    public void suara() {
        System.out.println("");
    }
}

public class Gitar extends AlatMusik {
    public Gitar(String name) {
        super(name);
    }

    public void caraMain() {
        System.out.println("di petik");

    }

    public void suara() {
        System.out.println("Jreng jreng jreng....");
    }
}