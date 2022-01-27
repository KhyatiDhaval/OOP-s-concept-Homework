package homework3;

import ClassObjectMethodAndConstructor.MethodOverLoading;

public class RunnerTest extends MethodOverLoading { // method over loading
    static int myPlusMethodInt(int a, int b) { //same method name with different parameters
        return a + b;
    }
    static int myPlusMethodInt1(int c, int d){
        return c + d;
    }

    public static void main(String[] args) {


        Iphone iphone = new Iphone(); // created iphone object
        iphone.getModel();
        iphone.OperatingSystem();
        iphone.PhoneStorage();
        iphone.PictureClearity();
        iphone.BatteryLife();
        iphone.Functionality();
        iphone.communication();


        Samsung samsung = new Samsung();// created samsung object
        samsung.GetModelWithColor();
        samsung.OperatingSystem();
        samsung.BatteryLife();
        samsung.Functionality();
        samsung.LockTheScreen();


        GooglePixel googlepixel = new GooglePixel(); // created googlepixel object

        googlepixel.getOperatingSystem();
        googlepixel.Functionality();
        googlepixel.LockTheScreen();
        googlepixel.PictureClearity();

        MobilePhone mobilephone = new MobilePhone(); // created object
        mobilephone.communication();
        mobilephone.Functionality();
        mobilephone.OperatingSystem();

        Landline landline = new Landline(); // created object
        landline.phoneSize();
        landline.communication();
        landline.sizeOfPhone();

        int myNum1 = myPlusMethodInt( 799 , 1299);// price of phone
        int myNum2 = myPlusMethodInt1(64, 128);// storage of phone



        System.out.println("int: " + myNum1);
        System.out.println("int: " + myNum2);

        }


    }







