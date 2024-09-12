package com.oluwaseyi.userloginregverify.demo.registration;


import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v2/register")
@AllArgsConstructor
public class RegisterController {


    private final RegistrationService registrationService;



    @PostMapping
    public String register ( @RequestBody  RegisterRequest request) {
      return   registrationService.register(request);
    }
}
