package com.ppw.couchbase.entity;

import com.couchbase.client.java.repository.annotation.Id;

public class SystemUser {
   
   @Id
   private String id;
   private String name;
   private UserBU bu;
   private int age;
   private long createTime;
   
   public enum UserBU{
      Cloud,Native
   }

   public String getId() {
      return id;
   }

   public void setId(String id) {
      this.id = id;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public UserBU getBu() {
      return bu;
   }

   public void setBu(UserBU bu) {
      this.bu = bu;
   }

   public int getAge() {
      return age;
   }

   public void setAge(int age) {
      this.age = age;
   }

   public long getCreateTime() {
      return createTime;
   }

   public void setCreateTime(long createTime) {
      this.createTime = createTime;
   }
   
   
}
