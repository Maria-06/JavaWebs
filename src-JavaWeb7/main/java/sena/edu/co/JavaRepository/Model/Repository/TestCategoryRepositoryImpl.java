package sena.edu.co.JavaRepository.Model.Repository;

import sena.edu.co.JavaRepository.Model.Bean.Category;
import sena.edu.co.JavaRepository.Model.Repository.CategoryRepositoryImpl;
import sena.edu.co.JavaRepository.Model.Repository.Repository;

import java.sql.SQLException;

public class TestCategoryRepositoryImpl {
    public static void main(String[] args) throws SQLException {

        Repository<Category> repository = new CategoryRepositoryImpl();

        System.out.println("==========saveObj Insert==============="); //insert
        Category categoryInsert = new Category();
        categoryInsert.setCategoryName("Marketing");

        repository.saveObj(categoryInsert);

        System.out.println("================listAllObj==============");
        repository.listAllObj().forEach(System.out::println);
        System.out.println();

        System.out.println("================byIdObj=================");
        System.out.println(repository.byIdObj(1));
        System.out.println();

        System.out.println("================saveObj Update=================");
        Category categoryUpdate = new Category();
        categoryUpdate = new Category();

        categoryUpdate.setCategoryId(1);
        categoryUpdate.setCategoryName("Ventas");

        repository.saveObj(categoryInsert);
        repository.listAllObj().forEach(System.out::println);
        System.out.println();

        System.out.println("================deleteObj===============");
        repository.deleteObj(2);
        repository.listAllObj().forEach(System.out::println);


    }
}//TestCategoryRepositorryImpl
