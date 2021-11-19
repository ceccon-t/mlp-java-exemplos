public class Algo {
    private int id;
    
    public Algo(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    // Versao sem pattern matching (Java 15 ou anterior)
    public boolean equalsJava15(Object o) {
        if (o instanceof Algo) {
            return ((Algo) o).getId() == this.id;
        }
        return false;
    }

    // Versao com Pattern Matching para instance of (Java16)
    public boolean equalsJava16(Object o) {
        if (o instanceof Algo outroAlgo) {
            return outroAlgo.getId() == this.id;
        }
        return false;
    }

    // Versao com Pattern Matching para switch (Java 17)
    @Override
    public boolean equals(Object o) {
        return switch(o) {
            case Algo outroAlgo -> outroAlgo.getId() == this.id;
            default             -> false;
        };
    }
}
