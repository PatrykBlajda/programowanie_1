package sda.patterns.creational.proxy;

public class ProxyCompanyInternetAccess  implements  CompanyInternetNetwork{
    CompanyInternetNetwork internetNetwork;

    private boolean isEmployee(String username){
        return CompanyEmployees.isActiveEmployee(username);

    }

    @Override
    public void getAccess(String username) {
        if (isEmployee(username)){
            internetNetwork = new PrivateCompanyInternetNetwork(username);
        } else {
            internetNetwork = new PublicCompanyInternetNetwork(username);
        }
        internetNetwork.getAccess(username);
    }
}

