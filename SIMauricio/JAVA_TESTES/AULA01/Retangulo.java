public class Retangulo {
    public float base;
    public float altura;

    Retangulo(float base, float altura){
        this.base = base;
        this.altura = altura;
    }

    float calcularArea(){
        return this.base * this.altura;
    }

    void exibir(){
        System.out.println("----> Dados do Retângulo: ");
        System.out.println("Base= "+this.base);
        System.out.println("Altura= "+this.altura);
    }

    public static void main(String[] args){
        Retangulo r1 = new Retangulo(12f, 5f);
        r1.exibir();
        Retangulo r2 = new Retangulo(3.5f, 9.0f);
        r2.exibir();
        
        r2.base = 9.5f;
        r2.altura = 16.3f;
        float area = r2.calcularArea();
        System.out.println("-----Novo Retângulo------");
        System.out.println("Base: " + r2.base + " Altura: " + r2.altura);
        System.out.println("Área do Novo Retângulo: "+area);

    }


}
