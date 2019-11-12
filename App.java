package app;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.management.MemoryMXBean;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class App extends HttpServlet{
   
    private static final long serialVersionUID = -3967314453512919811L;

    public static void main(String[] args) throws Exception {
        System.out.println("Dizionario Sinonimi & Contrari");
    }

    private String mymsg;
    public void init() throws ServletException 
    {      
       mymsg = "Http Servlet Demo";   
    }

    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException{
        // Setting up the content type of web page      
        PrintWriter out = res.getWriter();      
        String parola = req.getParameter("parola");
        out.println("<h1>" + mymsg + "</h1>");      
        out.println("<p>"+parola+"</p>");
        res.setContentType("text/html");
		
		//controlli per le parole : 'abbondante','babbeo','cafone','ubbidiente','vacuo' - "exit" per uscire.
		
        if(parola.equals("abbondante")){
            out.println("<p>"+"(S)eccessivo-esagerato-esorbitante-smodato-ampio - (C)scarso-limitato-insufficiente-manchevole-scarseggiante."+"</p>");
        }
        if(parola.equals("babbeo")){
            out.println("<p>"+"(S)sciocco-grullo-semplicione-allocco - (C)furbacchione-cervello fino."+"</p>");
        }
        if(parola.equals("cafone")){
            out.println("<p>"+"(S)villanzone-zotico-buzzurro-villanaccio - (C)signore-gentiluomo."+"</p>");
        }
		 if(parola.equals("ubbidiente")){
            out.println("<p>"+"(S)docile-devoto-sottomesso-disciplinato-ossequente - (C)ribelle-resistente-renitente-disubbidiente."+"</p>");
        }
		 if(parola.equals("vacuo")){
            out.println("<p>"+"(S)vuoto-leggero-vano-privo-mancante-sgombro-vacante - (C)interessante-profondo-serio-concreto-consistente."+"</p>");
        }
		if(parola.equals("exit")){
			System.out.println("programma in chiusura . . .");
			break;
		}
    }
}