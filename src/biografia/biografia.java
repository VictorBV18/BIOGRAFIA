
package biografia;

import com.itextpdf.io.font.FontConstants;
import com.itextpdf.io.image.ImageDataFactory;
import com.itextpdf.kernel.font.PdfFont;
import com.itextpdf.kernel.font.PdfFontFactory;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Image;
import com.itextpdf.layout.element.Paragraph;
import java.io.IOException;
import javax.swing.JOptionPane;


public class biografia {
     
    //Esta ruta se tiene que ir cambiando para cuando lo quieras mandar
    public static final String CARA="C:\\Users\\vic_a\\OneDrive\\Documentos\\NetBeansProjects\\biografiav\\fotocara1.jpg";
    public static final String DEST="C:\\Users\\vic_a\\OneDrive\\Documentos\\NetBeansProjects\\biografiav\\mibiografia.pdf";
    public static void main(String[] args) throws IOException {
        
        new biografia().crearpdf(DEST);
        
        
    }
    
    public void crearpdf(String dest) throws IOException{
    PdfWriter writer= new PdfWriter(dest);
    PdfDocument pdf =new PdfDocument(writer);
    Document document =new Document(pdf);
    Image cara =new Image(ImageDataFactory.create(CARA));   
  
    
    PdfFont font= PdfFontFactory.createFont(FontConstants.TIMES_ITALIC);
    
    
    Paragraph p = new Paragraph("Bernabe Vazquez Victor 2002-Actualidad Futuro Ingeniero En Sistemas ")
                    .add(cara)
                    .add("\n\nNaci un jueves 18 de abril del 2002 en el transcurso de la tarde, soy de la CDMX,")
                    .add("aunque actualmente vivo en Toluca EDOMEX.")
                    .add("Creci con mis padres, mi hermana mi abuelita y mi tio, ")
                    .add("desde siempre me gustaba ver la television y me encantaban mucho los power rangers ")
                    .add("de pequeño me gustaba mucho jugar con cosas armables, Desde pequeño me gustaba mucho Spiderman, de ")
                    .add("echo tengo una cicatriz en la cara por andar jugando a ser Spiderman.")
                    .add("Estudie en un kinder con un uniforme muy bonito, la cual no termine porque me cai, me ")
                    .add("lastime muy feo y ya no fui el ultimo año, entre a una bonita primaria, aunque para llegar ")
                    .add("tenia que subir demasiadas escaleras, en esos años casi no hablaba, tambien en ultimo año de ")
                    .add("primaria estuve en la escolta, cuando entre a la secundaria empece a socializar mas,")
                    .add("en estas epocas mi abuelita fallecio y fue algo complicado e incluso confuso pues fue de gran impacto ")
                    .add("ahi estudie una carrera tecnica de informatica, al entrar a la prepa conoci mucha mas gente y me reencontre ")
                    .add("con una compañera de la secundaria que me caia mal y actualmente es mi novia y hasta vive conmigo ")
                    .add("en la prepa jugaba demasido fronton y baraja porque a ambas cosas les podia sacar dinero, a finales ")
                    .add("de la preparatoria empezo la pandemia y en ese tiempo no hice mucho, solamente hice examenes para ")
                    .add("la universidad y me quede en la UAEMEX y actualmente cruzo 3er Semestre de la carrera de ")
                    .add("INGENIERIA EN COMPUTACION,")
                    .add("en la universidad conoci a muchas buenas personas y amigos con los cuales actualmente me llevo muy bien ")
                    .add("fue un cambio bastante grande porque en la prepa los maestros eran bastante enojones y mis compañeros eran ")
                    .add("muy llevados o agresivos, hasta el punto de ser fastidiosos, asi que al entrar a la universidad y conocer ")
                    .add("a personas muy buenas y con una vibra magnifica fue un gran cambio, tambien la mayoria de profesores han sido ")
                    .add("demasiado buenos con todos nosotros y comprensivos, en mi pequeño cuarto(hogar) de foraneo tambien la paso bien ")
                    .add("me gusta tener a alguien con quien llegar y platicar, llevarme bien y conocerla tanto")
                    .add("y bueno, algunas materias se me dificultan mas que otras en la universidad, aunque se que si puedo llegar a pasar ")
                    .add("se que me puedo llegar a graduar, todo reprobado pero graduado :) ");
              
    
    document.add(p);
    document.close();
    JOptionPane.showMessageDialog(null,"Se CREO LA BIOGRAFIA ");
    
        
        
        
    }
}
