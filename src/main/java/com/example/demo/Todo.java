package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Todo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotNull
    @Size(min=4)
    private String name;

    @NotNull
    @Size(min=4)
    private String duedate;

    @NotNull
    @Size(min=4)
    private String priority;


    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDuedate() {
        return duedate;
    }

    public String getPriority() {
        return priority;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDuedate(String duedate) {
        this.duedate = duedate;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }
}
