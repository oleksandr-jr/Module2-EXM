package L7.E2;

public class Main {
    public static void main(String[] args) {

    }

    public String getProductTypeByName(String product) {
        String productType = "";

        switch (product) {
            case "Apple":
                productType = "Fruit";
                break;

            case "Peach":
                productType = "Fruit";
                break;

            case "Raspberry":
                productType = "Berry";
                break;

            case "Cherry":
                productType = "Berry";
                break;

            case "Tomato":
                productType = "Vegetables";
                break;

            default:
                productType = "other";
                break;
        }

        return productType;
    }
}
