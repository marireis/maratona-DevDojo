package academy.devdojo.maratonajava.javacore.Ycolecoes.dominio;

public class Smartphone {
    private String serialNumber;
    private String marca;

    public Smartphone(String serialNumber, String marca) {
        this.serialNumber = serialNumber;
        this.marca = marca;
    }
    //metodo equal:
    // 1. reflexivo -  x.equals(x) - tem que ser true para tudo que for diferente de null
    //2. Simetrico - para x e y diferente de null, se x.equals(y) ==true logo, y.equals(x) ==true
    //3. transitividade: para x,y,z diferentes de null, se x.equals(y)==true, x.equals(z) ==true logo, y.equals(z) ==true
    //4. Consistente: x.equals(x) sempre retorna true se x for diferente de null
    //5. para x diferente de null, x.equals(null) tem que retornar false.
    @Override
    public boolean equals(Object obj) {
        if(obj == null) return false;
        if(this == obj) return true;
        if(this.getClass() != obj.getClass()) return false;
        Smartphone smartphone = (Smartphone) obj;
        return serialNumber != null && serialNumber.equals(smartphone.serialNumber);
    }
    //metodo HashCode
    //1. Se tiver x.equals(y)== true, y.hashCode() == x.hashCode()
    //2. y.hashCode() == x.hashCode() não necessariamente o equals de y.equals(x) tem que ser true
    //se x.equals(y) == false
    //se y.hashCode() != x.hashCode() x.equals(y) deverá ser false.
    @Override
    public int hashCode() {//é um numero que vai se gerado para os objetos, ideal que seja único
        return serialNumber == null ? 0: this.serialNumber.hashCode();
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "serialNumber='" + serialNumber + '\'' +
                ", marca='" + marca + '\'' +
                '}';
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
