package sena.edu.co.JavaRepository.Model.Servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import sena.edu.co.JavaRepository.Model.Bean.Category;
import sena.edu.co.JavaRepository.Model.Repository.CategoryRepositoryImpl;
import sena.edu.co.JavaRepository.Model.Repository.Repository;

import java.io.IOException;
import java.sql.SQLException;

@WebServlet("/Categoria")
public class CategoryRegistrerServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //  collect all form data
        String categoryName = request.getParameter("categoryName");

        //  fill it up in a User Bean
        Category category = new Category();
        category.setCategoryName(categoryName);

        // call repository layer and save the user object to DB
        Repository<Category> repository = new CategoryRepositoryImpl();
        int rows = 0;
        try {
            repository.saveObj(category);
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
