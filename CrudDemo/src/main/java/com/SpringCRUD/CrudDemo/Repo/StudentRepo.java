package com.SpringCRUD.CrudDemo.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SpringCRUD.CrudDemo.Models.Students;

@Repository
public interface StudentRepo extends JpaRepository<Students,Integer>
{

}
