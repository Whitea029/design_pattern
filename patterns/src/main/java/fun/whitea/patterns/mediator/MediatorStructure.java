package fun.whitea.patterns.mediator;

public class MediatorStructure extends Mediator {

    private HouseOwner houseOwner;
    private Tenant tenant;

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

    @Override
    public void contract(String message, Person person) {
        if (person == houseOwner) {
            tenant.contract(message);
        } else {
            houseOwner.construct(message);
        }
    }
}
