package homework3;

public class MobilePhone extends Telephone { // parent class or super class

    public void LockTheScreen(){

        System.out.println("Mobile Phone lock Screen Timing");

    }

    public void OperatingSystem(){

        System.out.println("Mobile Phone------Operating System");
    }

    public void Functionality(){

        System.out.println("Different Different Feature of Mobile Phone");
    }

    public void BatteryLife(){

        System.out.println("Mobile Phone Battery Life");

    }

    public void PictureClearity(){

        System.out.println("Mobile Phone picture clearity");

    }

    public void PhoneStorage(){

        System.out.println("Mobile Phone Storage");

    }

    @Override
    public void sizeOfPhone() {
        System.out.println("size of phone");
    }
}

