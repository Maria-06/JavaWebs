package sena.edu.co.JavaRepository.Model.Repository;

import sena.edu.co.JavaRepository.Model.Bean.User;

import java.sql.SQLException;


public class TestUserRepositoryImpl {
    public static void main(String[] args) throws SQLException {
        Repository<User>repository = new  UserRepositoryImpl();

        System.out.println("==========saveObj Insert==============="); //insert
        User userInsert = new User();
        userInsert.setUser_firstname("Camila");
        userInsert.setUser_lastname("Hernandez");
        userInsert.setUser_email("lmhernandez0606@gmail.com");
        userInsert.setUser_password("maria45674");

        repository.saveObj(userInsert);
        userInsert.setUser_firstname("MarIA");
        userInsert.setUser_lastname("Hernandez");
        userInsert.setUser_email("Marian45@gmail.com");
        userInsert.setUser_password("Marin895");
        repository.saveObj(userInsert);


        System.out.println("================listAllObj==============");
        repository.listAllObj().forEach(System.out::println);
        System.out.println();

        System.out.println("================byIdObj=================");
        System.out.println(repository.byIdObj(1));
        System.out.println();

        System.out.println("================saveObj Update=================");
        User userUpdate = new User();
        userUpdate.setUser_id(2);
        userUpdate.setUser_firstname("Andres");
        userUpdate.setUser_lastname("Mayorga");
        userUpdate.setUser_email("Andres06@sac.tecnology.co");
        userUpdate.setUser_password("4NDR35");
        repository.saveObj(userInsert);
        repository.listAllObj().forEach(System.out::println);
        System.out.println();

        System.out.println("================deleteObj===============");
        repository.deleteObj(2);
        repository.listAllObj().forEach(System.out::println);

    }
}//TestUserRepositoryImpl
