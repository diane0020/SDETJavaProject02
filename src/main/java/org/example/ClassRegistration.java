package org.example;

public class ClassRegistration {

    private String email;
    private String userName;
    private String password;

    ClassRegistration(String email, String userName, String password) {
        if (isEmailValid(email) && isUserNameValid(userName) && isPasswordValid(password)) {
            this.email = email;
            this.userName = userName;
            this.password = password;
        }

    }

    void setEmail(String email) {
        if (isEmailValid(email)) {
            this.email = email;
        }
    }

    String getEmail() {
        return email;
    }

    private boolean isEmailValid(String email) {
        if (email.contains("yahoo")) {
            return true;
        } else {
            System.out.println("Invalid email address");
            return false;
        }
    }

    void setUserName(String userName) {
        if (isUserNameValid(userName)) {
            this.userName = userName;
        }
    }

    String getUserName() {
        return userName;
    }

   private boolean isUserNameValid(String userName) {
        if (!userName.isEmpty()) {
            if (userName.length() >= 6) {
                return true;
            } else {
                System.out.println("UserName is too short");
                return false;
            }
        } else {
            System.out.println("UserName can not be empty");
            return false;
        }

    }

    void setPassword(String password) {
        if (isPasswordValid(password)) {
            this.password = password;
        }
    }

    String getPassword () {
        return password;
    }

   private boolean isPasswordValid(String password) {
        if (!password.isEmpty()) {
            if (!password.equalsIgnoreCase(userName)) {
                return true;
            } else {
                System.out.println("Username cannot be your password");
                return false;
            }
        } else {
            System.out.println("password can not be empty");
            return false;
        }
    }

}

class ClassRegTester {
    public static void main(String[] args) {
        ClassRegistration user1 = new ClassRegistration("diane@yahoo", "diane0020", "1234567");
        user1.setEmail("diane@yahoo.com");
        user1.setUserName("diane0020");
        user1.setPassword("1234567");
        System.out.println(user1.getEmail() + "; " + user1.getUserName() + "; " + user1.getPassword());

    }
}
