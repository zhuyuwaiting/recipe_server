package com.zhuyuwaiting.recipemanage;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement
@SpringBootApplication
@MapperScan("com.zhuyuwaiting.recipemanage.mapper")
public class RecipeManageApplication {

    public static void main(String[] args) {
        SpringApplication.run(RecipeManageApplication.class, args);
    }

}

