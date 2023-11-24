public class CalendarioBasico {
    private int dia;
    private int mes;
    private int ano;
    public CalendarioBasico() {
        dia = 1;
        mes = 1;
        ano = 1;
    }

    public String obtenerFecha(){
        String saberDia = dia + "";
        String saberMes = mes + "";
        String saberAno = ano + "";
        if(dia < 10){
            saberDia = "0" + dia;
        }
        if(mes < 10){
            saberMes = "0" + mes;
        }
        if(ano < 10){
            saberAno = "0" + ano;
        }
        return saberDia + "-" + saberMes + "-" + saberAno;
    }
     public void fijarFecha(int nuevoDia, int nuevoMes, int nuevoAno){
        dia = nuevoDia;
        mes = nuevoMes;
        ano = nuevoAno;
    }
}