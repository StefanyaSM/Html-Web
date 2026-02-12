package com.fing;

import java.util.List;

public class User {

  private String name;
  private String email;
  private String github;
  private List<String> tools;

  public User() {}

  public User(String name, String email, String github, List<String> tools) {
    this.name = name;
    this.email = email;
    this.github = github;
    this.tools = tools;
  }
  
  //set y get de cada dato
  public String getName() {
	  return name; }
  public String getEmail() { 
	  return email; }
  public String getGithub() { 
	  return github; }
  public List<String> getTools() { 
	  return tools; }

  public void setName(String name) { 
	  this.name = name; }
  public void setEmail(String email) { 
	  this.email = email; }
  public void setGithub(String github) { 
	  this.github = github; }
  public void setTools(List<String> tools) { 
	  this.tools = tools; }
}
