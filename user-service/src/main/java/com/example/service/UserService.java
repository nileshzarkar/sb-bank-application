package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.VO.Department;
import com.example.VO.ResponseTemplateVO;
import com.example.entity.User;
import com.example.repository.UserRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class UserService {
    
  @Autowired
  private UserRepository userRepository;

  @Autowired
  private RestTemplate restTemplate;

public User saveUser(User user) {
    log.info("Inside saveUser method of UserService");
    return userRepository.save(user);
}

public ResponseTemplateVO getUserWithDepartment(Long userId) {
     ResponseTemplateVO responseTemplateVO = new ResponseTemplateVO();
     User user = userRepository.findByUserId(userId);
     log.info("Inside getUserWithDepartment method of UserService " + user.getDepartmentId());
     Department department = restTemplate.getForObject("http://DEPARTMENT-SERVICE/departments/"+ user.getDepartmentId(), 
                                                       Department.class);
     responseTemplateVO.setUser(user);
     responseTemplateVO.setDepartment(department); 
     return responseTemplateVO;
}

}
