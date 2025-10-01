package com.practise.apachecamel.repository;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class ApacheEmployeeRepository {

	private final JdbcTemplate jdbcTemplate;
    
    public ApacheEmployeeRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
    
 // Create table (run once)
    public void createTable() {
        String sql = "CREATE TABLE IF NOT EXISTS apacheemployee (" +
                "id BIGINT AUTO_INCREMENT PRIMARY KEY, " +
                "name VARCHAR(255), " +
                "department VARCHAR(255), " +
                "email VARCHAR(255)" +
                ")";
        jdbcTemplate.execute(sql);
    }
}
