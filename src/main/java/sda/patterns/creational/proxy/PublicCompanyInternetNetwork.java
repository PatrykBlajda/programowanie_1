package sda.patterns.creational.proxy;

public class PublicCompanyInternetNetwork implements CompanyInternetNetwork {

private String username;

public PublicCompanyInternetNetwork(String username){
this.username = username;
        }

        @Override
public void getAccess(String username) {
            System.out.println("PUBLIC network access " + "granted for " + username);
        }
}
