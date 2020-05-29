public class Livro{
    private String titulo;
    private String autor;
    private int anopub;
    private String categoria;
    private int numest;
    private int numprat;
    private boolean emprestado;

    public Livro(String titulo, String autor, int anopub, String categoria; int numest, int numprat){
        this.titulo    = titulo;
        this.autor     = autor;
        this.anopub    = anopub;
        this.categoria = categoria;
        this.numest    = numest;
        this.numprat   = numprat;
       
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public String getTitulo(String titulo){
        return this.titulo;
    }

    public void setAutor(String autor){
        this.autor = autor;
    }
    public String getAutor(String Autor){
        return this.autor;
    }

    public void setAnopub(String Anopub){
        this.Anopub = Anopub;
    }
    public String getAutor(String Autor){
        return this.autor;
    }








}