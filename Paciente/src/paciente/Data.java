package paciente;
class Data {
    private int dia;
    private int mes;
    private int ano;

    public Data() {
        this.dia = 1;
        this.mes = 1;
        this.ano = 2021;
    }

    
    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAno() {
        return ano;
    }
    
    
    public void setAno(int a) {
        if (a >= 2021){
            this.ano = a;   
        }else{
            this.ano = 2021;
        }
        
    }


    public void setMes(int m) {
        if (m > 0 && m <= 12){
            this.mes = m;   
        }else{
            this.mes=1;
        }
        
    }
    
    
    
    public void setDia(int d) {
        switch (this.getMes()) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                if ( d <= 31 && d > 0) {
                    this.dia = d;
                    
                }else{
                    this.dia = 1;
                }   break;
            case 4:
            case 6:
            case 9:
            case 11:
                if ( d <= 30 && d > 0) {
                    this.dia = d;
                    
                }else{
                    this.dia = 1;
                }   break;
            case 2:
                if ( d <= 29 && d > 0 ) {
                    this.dia = d;
                    
                }else{
                    this.dia = 1;
                }   break;
            default:
                this.dia = 1;
                break;
        }
    }

    
 
public void setData(int d,int m,int a){
    this.setDia(d);
    this.setMes(m);
    this.setAno(a);
    
 
}
}
