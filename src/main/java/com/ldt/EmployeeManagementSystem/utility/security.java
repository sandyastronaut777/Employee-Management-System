package com.ldt.EmployeeManagementSystem.utility;

import org.springframework.security.crypto.bcrypt.BCrypt;

public class security {
    private String password = "sandy123";
    private String hashedPassword = BCrypt.hashpw(password,BCrypt.gensalt(10));
    public void checkPass(String password)
    {
        if(BCrypt.checkpw(password,hashedPassword))
        {
            System.out.println("Password Match");
        }
        else {
            System.out.println("No Match");
        }
    }
}



