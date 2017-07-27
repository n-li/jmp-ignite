package com.example.ignite;


import org.apache.ignite.springdata.repository.IgniteRepository;
import org.apache.ignite.springdata.repository.config.RepositoryConfig;


@RepositoryConfig(cacheName = "PersonCache")
public interface PersonRepository extends IgniteRepository <Person, Long>{

}
