public class FuncionesConParametrosConRetorno {

    public Double calcularPromedioIdat(Double ec1, Double ec2, Double ec3, Double tf){
        Double promedio = (ec1*0.04)+(ec2*0.12)+(ec3*0.24)+(tf*0.6);
        return promedio;
    }
}
