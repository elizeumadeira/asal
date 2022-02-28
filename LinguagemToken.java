import java.util.Objects;

class LinguagemToken{
    public String funcao;
    public String var;
    public String tipo;

    public LinguagemToken(String funcao, String var, String tipo){
        this.funcao = funcao;
        this.var = var;
        this.tipo = tipo;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.funcao);
        hash = 97 * hash + Objects.hashCode(this.var);
        // hash = 97 * hash + Objects.hashCode(this.tipo);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final LinguagemToken other = (LinguagemToken) obj;
        if (!Objects.equals(this.funcao, other.funcao)) {
            return false;
        }
        if (!Objects.equals(this.var, other.var)) {
            return false;
        }
        if (!Objects.equals(this.tipo, other.tipo)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "LinguagemToken{" + "funcao=" + funcao + ", var=" + var + '}';
    }
}