package com.company;

import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Damian on 07.04.2017.
 */

@Path("students")
public class StudentsResource {

    private ArrayList<Student> studentsList = new ArrayList<Student>();

    public StudentsResource(){
        this.studentsList.add(new Student("12345","Jan","Nowak"));
        this.studentsList.add(new Student("12346","Piotr","Kowalski"));
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Student> getAll() {
        return this.studentsList;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Student getOne(@PathParam("id") String id){
        return this.studentsList.stream().filter(s -> s.getIndexNr().equals(id)).findFirst().get();
    }
}

