package sena.edu.co.JavaRepository.Model.Repository;

import sena.edu.co.JavaRepository.Model.Bean.Product;
import sena.edu.co.JavaRepository.Util.ConnectionPool;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public  class ProductRepositoryImpl implements Repository<Product>{
    //atribute of the class
    private String sql = null;

    @Override
    public Product createObj(ResultSet rs) throws SQLException {
        Product product = new Product();
        product.setProductId(rs.getInt("productId"));
        product.setProductName(rs.getString("productName"));
        product.setProductValue(rs.getInt("productValue"));
        product.setCategoryIdFK(rs.getInt("categoryId"));
        return product;
    }//createObj

    @Override
    public List<Product> listAllObj() throws SQLException {
        List<Product> product = new ArrayList<>();
        sql= "select p.productId, p.productName, p.productValue, p.categoryId " +
                "from Product p";
        try (Connection conn = ConnectionPool.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)){
            while (rs.next()){
                Product p = createObj(rs);
                product.add(p);
            }//while
        }//try
        return product;
    }//listAllObj

    @Override
    public Product byIdObj(Integer id) throws  SQLException{
        sql = "select p.productId, p.productName, p.productValue, p.categoryId " +
                "from Product p where p.productId =? ";
        Product product = null;

        try(Connection conn = ConnectionPool.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql)){
            ps.setInt(1,id);
            try(ResultSet rs = ps.executeQuery()){
                if(rs.next()){
                    product = createObj(rs);
                }
            }
        }//try
        return product;
    }//byIdObj

    public Integer saveObj(Product product) throws SQLException{
        int rowAffected = 0;

        if(product.getProductId()!= null && product.getProductId() > 0) {
            sql = "update Product set productId = ?, productName = ?, productValue = ?, categoryId = ? " +
                    "where  productId = ?";
        }else{
            sql = " insert into Product (productName, productValue,categoryId)" + "values(upper(?), upper(?), lower(?))";
        }
        try (Connection conn= ConnectionPool.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, product.getProductName());
            ps.setInt(2, product.getProductValue());
            ps.setInt(3, product.getCategoryIdFK());
            if (product.getProductId()!= null && product.getProductId() > 0){
                ps.setInt(5, product.getProductId());
            }
            rowAffected = ps.executeUpdate();
        }
        return rowAffected;
    }//saveObj


    @Override
    public void deleteObj(Integer id) throws SQLException {
        sql = "delete from Product where productId = ? ";
        try(Connection conn = ConnectionPool.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql)){
            ps.setInt(1,id);
            ps.executeUpdate();
        }//try
    }//deleteObj

}
