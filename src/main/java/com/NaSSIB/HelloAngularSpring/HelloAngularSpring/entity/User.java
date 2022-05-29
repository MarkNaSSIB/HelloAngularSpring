package com.NaSSIB.HelloAngularSpring.HelloAngularSpring.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class User {
  @Id
  @GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
  private long id;
  private String name;
  private String email;

  public User(String name, String email) {
    super();
    this.name = name;
    this.email = email;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public String getEmail() {
    return email;
  }

  @Override
  public String toString() {
    return "User [id=" + id + ", name=" + name + "]";
  }


  // standard constructors / setters / getters / toString
}
