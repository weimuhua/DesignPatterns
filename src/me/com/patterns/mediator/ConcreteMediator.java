package me.com.patterns.mediator;

/**
 * 具体中介者对象
 */
public class ConcreteMediator extends Mediator {

    private Tenant tenant;
    private HouseOwner houseOwner;

    public HouseOwner getHouseOwner() {
        return houseOwner;
    }

    public void setHouseOwner(HouseOwner houseOwner) {
        this.houseOwner = houseOwner;
    }

    public Tenant getTenant() {
        return tenant;
    }

    public void setTenant(Tenant tenant) {
        this.tenant = tenant;
    }

    public void contract(String message, Person person) {
        if (person == houseOwner) {
            //如果是房主，则租房者获得信息
            tenant.getMessage(message);
        } else {
            //反之则是房主获得信息
            houseOwner.getMessage(message);
        }
    }
}
