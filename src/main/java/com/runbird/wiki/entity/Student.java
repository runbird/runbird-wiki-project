package com.runbird.wiki.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

/**
 * @author: JimLock
 * @desc: Student
 * @version:1.0
 * @create:2023/3/26 21:30
 */
@Data
@Entity
@Table(name = "student")
public class Student {
    @Id
    private int userId;
    private String userName;

}
