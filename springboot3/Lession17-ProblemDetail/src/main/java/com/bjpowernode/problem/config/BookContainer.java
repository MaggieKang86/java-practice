package com.bjpowernode.problem.config;

import com.bjpowernode.problem.model.BookRecord;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;

@Setter
@Getter
@ConfigurationProperties(prefix = "product")
public class BookContainer {

    private List<BookRecord> books;

}
