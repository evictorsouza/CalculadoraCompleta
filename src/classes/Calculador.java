package classes;
/**
 *
 * @author edson
 */
public class Calculador implements Calculadora{
    //ATRIBUTOS
    private double num;
    private double memoria;
    private boolean somando;
    private boolean subtraindo;
    private boolean igual;
    private boolean multiplicando;
    private boolean dividindo;
    
    //METODOS PERSONALIZADOS
    private void Somar(String valor){
        if(!this.isIgual()){
            if(this.num != 0){
                this.num +=  Double.parseDouble(valor);
            }else{
                this.num = Double.parseDouble(valor);
            }
        }
    }
    
    private void Subtrair(String valor){
        if(!this.isIgual()){
            if(this.num != 0){
                this.num -=  Double.parseDouble(valor);
            }else{
                this.num = Double.parseDouble(valor);
            }
        }
    }
    
    private void Multiplicar(String valor){
        if(!this.isIgual()){
            if(this.num != 0){
                this.num *=  Double.parseDouble(valor);
            }else{
                this.num = Double.parseDouble(valor);
            }
        }
    }
    
    private void Dividir(String valor){
        if(!this.isIgual()){
            if(this.num != 0){
                this.num /=  Double.parseDouble(valor);
            }else{
                this.num = Double.parseDouble(valor);
            }
        }
    }
    
    private void Raiz(String valor){
        if(!this.isIgual()){
            if(this.num >= 0){
                this.num =  Math.sqrt(Double.parseDouble(valor));
            }else{
                this.num = 0;
            }
        }
    }
    
    private void Porcentagem(String valor){
        if(!this.isIgual()){
                this.num =  Double.parseDouble(valor)/100;
        }
    }
    
    private void somarMemoria(String valor){
        this.setMemoria(this.getMemoria() + Double.parseDouble(valor));
    }
    
    private void subtrairMemoria(String valor){
        this.setMemoria(this.getMemoria() - Double.parseDouble(valor));
    }
    
    private void limparMemoria(){
        this.setMemoria(0);
    }
    
    private String isInteiro(){
        String inteiro;
        if (this.getNum() % 1 == 0){
               inteiro = Integer.toString((int) this.getNum());
           }else{
               inteiro = Double.toString(this.getNum());
           }
        return inteiro;
    }
    
    public String isInteiroMemoria(){
        String inteiro;
        if (this.getNum() % 1 == 0){
               inteiro = Integer.toString((int) this.getMemoria());
           }else{
               inteiro = Double.toString(this.getMemoria());
           }
        return inteiro;
    }
    
    // CONSTRUTOR
    public Calculador() {
        this.setNum(0);
        this.setMemoria(0);
        this.setSomando(false);
        this.setSubtraindo(false);
        this.setMultiplicando(false);
        this.setDividindo(false);
        this.setIgual(false);
    }

    //GETTERS E SETTERS
    private double getNum() {
        return this.num;
    }

    private void setNum(double num) {
        this.num = num;
    }

    private double getMemoria() {
        return memoria;
    }

    private void setMemoria(double memoria) {
        this.memoria = memoria;
    }
   
    private boolean isSomando() {
        return this.somando;
    }

    private void setSomando(boolean somando) {
        this.somando = somando;
    }

    private boolean isSubtraindo() {
        return this.subtraindo;
    }

    private void setSubtraindo(boolean subtraindo) {
        this.subtraindo = subtraindo;
    }

    private boolean isIgual() {
        return this.igual;
    }

    private void setIgual(boolean igual) {
        this.igual = igual;
    }

    private boolean isMultiplicando() {
        return multiplicando;
    }

    private void setMultiplicando(boolean multiplicando) {
        this.multiplicando = multiplicando;
    }

    private boolean isDividindo() {
        return dividindo;
    }

    private void setDividindo(boolean dividindo) {
        this.dividindo = dividindo;
    }

    //METODOS DA INTERFACE
    @Override
    public String botaoZero(String texto) {
        String valor = texto;
        if(texto.equals("0")){
            return valor = "0";
        }else{
            return valor += "0";
        }
    }

    @Override
    public String botaoUm(String texto) {
        String valor = texto;
        if(texto.equals("0")){
            return valor = "1";
        }else{
            return valor += "1";
        }
    }

    @Override
    public String botaoDois(String texto) {
        String valor = texto;
        if(texto.equals("0")){
            return valor = "2";
        }else{
            return valor += "2";
        }
    }

    @Override
    public String botaoTres(String texto) {
        String valor = texto;
        if(texto.equals("0")){
            return valor = "3";
        }else{
            return valor += "3";
        }
    }

    @Override
    public String botaoQuatro(String texto) {
        String valor = texto;
        if(texto.equals("0")){
            return valor = "4";
        }else{
            return valor += "4";
        }
    }

    @Override
    public String botaoCinco(String texto) {
        String valor = texto;
        if(texto.equals("0")){
            return valor = "5";
        }else{
            return valor += "5";
        }
    }

    @Override
    public String botaoSeis(String texto) {
        String valor = texto;
        if(texto.equals("0")){
            return valor = "6";
        }else{
            return valor += "6";
        }
    }

    @Override
    public String botaoSete(String texto) {
        String valor = texto;
        if(texto.equals("0")){
            return valor = "7";
        }else{
            return valor += "7";
        }
    }

    @Override
    public String botaoOito(String texto) {
        String valor = texto;
        if(texto.equals("0")){
            return valor = "8";
        }else{
            return valor += "8";
        }
    }

    @Override
    public String botaoNove(String texto) {
        String valor = texto;
        if(texto.equals("0")){
            return valor = "9";
        }else{
            return valor += "9";
        }
    }

    @Override
    public String botaoPonto(String texto) {
        String valor = texto;
        if(!texto.contains(".")) valor += ".";
        return valor;
    }
    @Override
    public String botaoMaisMenos(String texto) {
        if (Double.parseDouble(texto) % 1 == 0){
            int n = Integer.parseInt(texto) * -1;
            texto = Integer.toString(n);
            return texto;
        }else{
            double n = Double.parseDouble(texto) *-1;
            texto = Double.toString(n);
            return texto;
        }
    }
     
    @Override
    public String botaoSomar(String texto) {
        this.setSomando(true);
        this.setSubtraindo(false);
        this.setMultiplicando(false);
        this.setDividindo(false);
        this.setIgual(false);
        this.Somar(texto);
        return "0";
    }

    @Override
    public String botaoSubtrair(String texto) {
        this.setSubtraindo(true);
        this.setSomando(false);
        this.setMultiplicando(false);
        this.setDividindo(false);
        this.setIgual(false);
        this.Subtrair(texto);
        return "0";
    }

    @Override
    public String botaoMultiplicar(String texto) {
        this.setMultiplicando(true);
        this.setSomando(false);
        this.setSubtraindo(false);
        this.setDividindo(false);
        this.setIgual(false);
        this.Multiplicar(texto);
        return "0";
    }

    @Override
    public String botaoDividir(String texto) {
        this.setDividindo(true);
        this.setMultiplicando(false);
        this.setSomando(false);
        this.setSubtraindo(false);
        this.setIgual(false);
        this.Dividir(texto);
        return "0";
    }

    @Override
    public String botaoRaiz(String texto) {
        this.setDividindo(false);
        this.setMultiplicando(false);
        this.setSomando(false);
        this.setSubtraindo(false);
        this.setIgual(false);
        this.Raiz(texto);
        texto = this.isInteiro();
        this.setNum(0);
        return texto;
    }

    @Override
    public String botaoPorcentagem(String texto) {
        this.setDividindo(false);
        this.setMultiplicando(false);
        this.setSomando(false);
        this.setSubtraindo(false);
        this.setIgual(false);
        this.Porcentagem(texto);
        texto = this.isInteiro();
        this.setNum(0);
        return texto;
    }
    
    @Override
    public String botaoIgual(String texto){
        if(this.isSomando()){
           this.Somar(texto);
           texto = this.isInteiro();
       }
       if(this.isSubtraindo()){
           this.Subtrair(texto);
           texto = this.isInteiro();
       }
       if(this.isMultiplicando()){
           this.Multiplicar(texto);
           texto = this.isInteiro();
       }
       if (this.isDividindo()){
           this.Dividir(texto);
           texto = this.isInteiro();
       }
       this.setNum(0);
       this.setSomando(false);
       this.setSubtraindo(false);
       this.setMultiplicando(false);
       this.setDividindo(false);
       this.setIgual(true);
       return texto;
    }

    @Override
    public String botaoClear() {
        this.setNum(0);
        return "0";
    }

    @Override
    public void botaoMemoriaMais(String texto) {
        this.somarMemoria(texto);
    }

    @Override
    public void botaoMemoriaMenos(String texto) {
        this.subtrairMemoria(texto);
    }

    @Override
    public void botaoMemoriaClear() {
        this.limparMemoria();
    }

    @Override
    public String botaoMemoriaReveal() {
        return this.isInteiroMemoria();
    }
    
    
}
