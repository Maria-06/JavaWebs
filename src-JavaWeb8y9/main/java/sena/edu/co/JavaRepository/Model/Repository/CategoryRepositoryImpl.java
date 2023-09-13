package sena.edu.co.JavaRepository.Model.Repository;

import sena.edu.co.JavaRepository.Model.Bean.Category;
import sena.edu.co.JavaRepository.Util.ConnectionPool;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CategoryRepositoryImpl  implements  Repository<Category>{

    private String  sql = null;

    @Override
    public Category createObj(ResultSet rs) throws SQLException {
        Category category = new Category();

        category.setCategoryId(rs.getInt("categoryId"));
        category.setCategoryName(rs.getString("categoryName"));
        return category;
    }

    @Override
    public List<Category> listAllObj() throws SQLException {
        sql = "select c.categoryId, c.categoryName " +
                "from category c order by c.categoryName ";
        List<Category> category = new ArrayList<>();
        try (Connection conn = ConnectionPool.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)){
            while (rs.next()){
                Category c = createObj(rs);
                category.add(c);
            }//while
        }//try
        return category;
    }//listObj

    @Override
    public Category byIdObj(Integer id) throws  SQLException{
        sql = "select c.categoryId, c.categoryName " +
                "from category c where c.categoryId =? ";
        Category category = null;

        try(Connection conn = ConnectionPool.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql)){
            ps.setInt(1,id);
            try(ResultSet rs = ps.executeQuery()){
                if(rs.next()){
                    category = createObj(rs);
                }
            }
        }//try
        return category;
    }//byIdObj

    public Integer saveObj(Category category) throws SQLException{
        int rowAffected = 0;

        if(category.getCategoryId()!= null && category.getCategoryId() > 0) {
            sql = "update Category set categoryId = ?, categoryName = ? " +
                    "where  categoryId = ?";
        }else{
            sql = " insert into Category (categoryName)" + "values(upper(?))";
        }
        try (Connection conn= ConnectionPool.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, category.getCategoryName());
            if (category.getCategoryId()!= null && category.getCategoryId() > 0){
                ps.setInt(5, category.getCategoryId());
            }
            rowAffected = ps.executeUpdate();
        }
        return rowAffected;
    }//saveObj

    @Override
    public void deleteObj(Integer id) throws SQLException {
        sql = "delete from Category where categoryId = ?";
        try(Connection conn = ConnectionPool.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql)){
            ps.setInt(1,id);
            ps.executeUpdate();
        }//try
    }//deleteObj

}
