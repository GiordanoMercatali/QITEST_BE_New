//package com.advancia.qitest.repositories;
//
//import javax.sql.DataSource;
//
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.stereotype.Repository;
//
//@Repository
//public class GeCVRepository {
//
//    private final JdbcTemplate jdbcTemplate;
//
//    public GeCVRepository(@Qualifier("gecvDataSource") DataSource gecvDataSource) {
//        this.jdbcTemplate = new JdbcTemplate(gecvDataSource);
//    }
//
//    public Integer findUserIdByEmail(String email) {
//        String query = "SELECT ID FROM UTENTI WHERE EMAIL = ?";
//        return jdbcTemplate.queryForObject(query, (rs, rowNum) -> rs.getInt("ID"), email);
//    }
//
//    public void updateLogicalTest(Integer userId, int result) {
//        String query = "UPDATE UTENTI SET TEST_LOGICA = ? WHERE ID = ?";
//        jdbcTemplate.update(query, result, userId);
//    }
//
//    public void updateAnalyticalTest(Integer userId, int result) {
//        String query = "UPDATE UTENTI SET TEST_ANALITICO = ? WHERE ID = ?";
//        jdbcTemplate.update(query, result, userId);
//    }
//}