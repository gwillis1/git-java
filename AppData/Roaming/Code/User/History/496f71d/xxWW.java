package Apartments;

public class apartment {

    private int apartment_num;
    private int num_bedrooms;
    private double rent;

    public apartment(int apartment_num, int num_bedrooms, double rent) {
        this.apartment_num = apartment_num;
        this.num_bedrooms = num_bedrooms;
        this.rent = rent;
    }

    public int getApartment_num() {
        return apartment_num;
    }


    public int getNum_bedrooms() {
        return num_bedrooms;
    }


    public double getRent() {
        return rent;
    }

    @Override
    public String toString(){
        String result = "Apartment #" + getApartment_num() + "\n" + " with " +  getNum_bedrooms() + " bedrooms, renting for $" + getRent();
        return result;


    }

    
}
