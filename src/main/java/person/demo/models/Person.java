package person.demo.models;

import javax.persistence.*;

@Entity
@Table(name="Persons")
public class Person {
    private long id;
    private String name;

    public Person(){

    }

    public Person(String name){
        this.name=name;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long getId(){
        return id;
    }
    public void setId(long id){
        this.id=id;
    }

    @Column(name="name",nullable = false)
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name=name;
    }
}
