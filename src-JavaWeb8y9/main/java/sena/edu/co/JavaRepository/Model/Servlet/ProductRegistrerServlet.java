package sena.edu.co.JavaRepository.Model.Servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import sena.edu.co.JavaRepository.Model.Bean.Product;
import sena.edu.co.JavaRepository.Model.Repository.ProductRepositoryImpl;
import sena.edu.co.JavaRepository.Model.Repository.Repository;

import java.io.IOException;
import java.sql.SQLException;

@WebServlet("Producto")
public class ProductRegistrerServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //  collect all form data
        String productName = request.getParameter("productName");
        String productValue = request.getParameter("productValue");
        String categoryIdFK = request.getParameter("categoryIdFK");

        //  fill it up in a User Bean
        Product product = new Product();
        product.setProductName(productName);
        product.setProductValue(Integer.valueOf(productValue));
        product.setCategoryIdFK(Integer.valueOf(categoryIdFK));

        // call repository layer and save the user object to DB
        Repository<Product> repository = new ProductRepositoryImpl();
        int rows = 0;
        try {
            repository.saveObj(product);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        //todo prepare message for user about success
        //String message = null

        if(rows==0){
            System.out.println("Ocurrió un error");
        }else{
            System.out.println("Registro exitoso");
        }

        // todo write the message back to the page in client browser


    }

}
