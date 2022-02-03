import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

@WebServlet("/InfoPage")
public class InfoPage extends HttpServlet {
        private static final long serialVersionUID = 1L;
  
    public InfoPage() {
        super();
       
    }
        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
                
                response.getWriter().write("I am in InfoPage");
        }
        protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
                
                doGet(request, response);
        }

}