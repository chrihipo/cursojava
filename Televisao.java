public class Televisao{
    private String   marca;
    private int      tamanho;
    private int      voltagem;
    private boolean  ligada;
    private boolean  desligar; 
    private int      volume;
    private int      aumentarvolume;
    private int      diminuirvolume;
    private int      canal;
    private String   tipo;

    //Quero criar meu próprio método construtor
    public Televisao(String ma, int ta, int vo, String ti){
        marca    = ma;
        tamanho  = ta;
        voltagem = vo;
        tipo     = ti
        ligada   = false;
        volume   = 0;
        canal    = 1;
    }

    //Getters & Setters
    public void setMarca(String novamarca){
        marca = novamarca;
    }
    public String getMarca(String novamarca){
        return marca;
    }

    public void setTamanho(String novatamanho){
        marca = novotamanho;
    }

    public String getTamnho(String novatamanho){
        return Tamanho;
    }

    public void setVolume(String novatamanho){
        marca = novovolume;
    }

    public String getTamnho(String novatamanho){
        return Tamanho;
    }

    void ligada(){
        System.out.println("Chamei a funcao pra ligar ...");
        ligada = true;
        System.out.println("Agora a TV"+marca+" esta ligada");
        
    }  
    void desligar(){
        System.out.println("Tv será desligada ...");
        desligar = true;
        System.out.println("Agora a TV"+marca+" esta desligada");
        
    }   
    void aumentarvolume(){
        System.out.println("Aumentar o volume ...");
        aumentarvolume = newvolume;
        System.out.println("Agora a TV"+marca+" esta com o volume mais alto");
       
    }  
        void diminuirvolume(){
        System.out.println("Diminuindo o volume ...");
        aumentarvolume = newvolume;
        System.out.println("Agora a TV"+marca+" esta com o volume mais baixo");
       
    }  

}