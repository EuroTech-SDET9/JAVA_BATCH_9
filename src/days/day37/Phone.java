package days.day37;

public class Phone {


    String phoneName;
    int phoneId;
    boolean isActive;
    String modelNumber;
    int warranty;
    int serialNumber;
    int macIP;
    String ownerCode;

    public Phone(String phoneName ){
        this.phoneName = phoneName;
        System.out.println("!!!Const!!!");
    }


    public Phone(String phoneName, int phoneId, boolean isActive, String modelNumber, int warranty, int serialNumber, int macIP, String ownerCode) {
        System.out.println("NEW PHONE CREATED!!! \n WELCOME TO THE TECH!!!");
        this.phoneName = phoneName;
        this.phoneId = phoneId;
        this.isActive = isActive;
        this.modelNumber = modelNumber;
        this.warranty = warranty;
        this.serialNumber = serialNumber;
        this.macIP = macIP;
        this.ownerCode = ownerCode;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "phoneName='" + phoneName + '\'' +
                ", phoneId=" + phoneId +
                ", isActive=" + isActive +
                ", modelNumber='" + modelNumber + '\'' +
                ", warranty=" + warranty +
                ", serialNumber=" + serialNumber +
                ", macIP=" + macIP +
                ", ownerCode='" + ownerCode + '\'' +
                '}';
    }
}
