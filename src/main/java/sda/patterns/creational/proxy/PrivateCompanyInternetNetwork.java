package sda.patterns.creational.proxy;

public class PrivateCompanyInternetNetwork implements CompanyInternetNetwork {

private String username;

    public PrivateCompanyInternetNetwork(String username){
        this.username = username;
    }

    @Override
    public void getAccess(String username) {
        System.out.println("PRIVATE network access " + "granted for " + username);
    }
}
