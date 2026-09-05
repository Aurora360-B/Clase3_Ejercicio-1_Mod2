

public class Video {

   private String titulo;
    private String imagenURL;
    private  Comentario[] comentarios;
    private  int contadorComentarios;


    public  Video (String imagenURL, String titulo, int maxComentarios){
        this.imagenURL = imagenURL; 
        this.titulo = titulo;
        this.comentarios = new Comentario[maxComentarios];
        this.contadorComentarios = 0;
    }


    public String getTitulo() {
        return titulo;
    }


    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }


    public String getImagenURL() {
        return imagenURL;
    }



    public  void  getComentario(){
        System.out.println(comentarios.length + " comentarios");
        for(int i=0; i<contadorComentarios; i++){
           /* System.out.println("Comentario " +(i+1) + ": " + comentarios[i].getTexto() + " - Autor: "
        + comentarios[i].getAutor());*/

        System.out.println(" ");
        System.out.println(comentarios[i].getAutor());
        System.out.println(comentarios[i].getTexto());
        System.out.println("=============================");

        }
    }

    public  void  agregarComentarios(Comentario comentario){
        if (contadorComentarios < comentarios.length) {
            comentarios [contadorComentarios] = comentario;
            contadorComentarios++;

            
        } else{
            System.out.println("No se pueden agregar más comentarios. ");
        }
    }



    

}
