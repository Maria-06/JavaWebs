package sena.edu.co.JavaRepository.Model.Repository;

import sena.edu.co.JavaRepository.Model.Bean.Product;

import java.sql.SQLException;

public class TestProductRepositoryImpl {
    public static void main(String[] args) throws SQLException {

        ProductRepositoryImpl repository = new ProductRepositoryImpl();

        System.out.println("==========saveObj Insert==============="); //insert
        Product productInsert = new Product();
        productInsert.setProductName("Camila");
        productInsert.setProductValue(40000);
        productInsert.setCategoryIdFK(1);

        repository.saveObj(productInsert);

        System.out.println("================listAllObj==============");
        repository.listAllObj().forEach(System.out::println);
        System.out.println();

        System.out.println("================byIdObj=================");
        System.out.println(repository.byIdObj(13));
        System.out.println();

        System.out.println("================saveObj Update=================");
        Product productUpdate = new Product();
        productUpdate.setProductId(2);
        productUpdate.setProductName("Andres");
        productUpdate.setProductValue(40000);
        productUpdate.setCategoryIdFK(1);


        repository.saveObj(productInsert);
        repository.listAllObj().forEach(System.out::println);
        System.out.println();

        System.out.println("================deleteObj===============");
        repository.deleteObj(2);
        repository.listAllObj().forEach(System.out::println);



    }
}
