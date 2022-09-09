package questao04;

public class Filme {
    private String titulo;
    private int minutos;
    private boolean audioOriginal;
    private boolean legenda;

    //Método Construtor
    public Filme(String titulo, int minutos, boolean audioOriginal, boolean legenda) {
        this.titulo = titulo;
        this.minutos = minutos;
        this.audioOriginal = audioOriginal;
        this.legenda = legenda;
    }

    //Métodos Públicos
    public String getDuracaoHorasMinutos(){

        int hours = getMinutos() / 60;
        int minutes = getMinutos() % 60;

        return hours + " horas e " + minutes + " minutos";
    }

    public String getDescricao(){

        return "O filme " + getTitulo() + " possui " + getDuracaoHorasMinutos() + " de duração";
    }

    //Getters and Setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public boolean getAudioOriginal() {
        return audioOriginal;
    }

    public void setAudioOriginal(boolean audioOriginal) {
        this.audioOriginal = audioOriginal;
    }

    public boolean getLegenda() {
        return legenda;
    }

    public void setLegenda(boolean legenda) {
        this.legenda = legenda;
    }
}
