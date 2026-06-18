public class SearchDemo {
     public static void main(String[] args) {

        Product[] products = {
            new Product(101, "Laptop", "Electronics"),
            new Product(102, "Mobile", "Electronics"),
            new Product(103, "Shoes", "Fashion"),
            new Product(104, "Watch", "Accessories"),
            new Product(105, "Book", "Education")
        };

        int searchId = 104;

        Product linearResult = linearSearch(products, searchId);

        if (linearResult != null) {
            System.out.println("Linear Search Result:");
            System.out.println(linearResult);
        }

        Product binaryResult = binarySearch(products, searchId);

        if (binaryResult != null) {
            System.out.println("Binary Search Result:");
            System.out.println(binaryResult);
        }
    }

    public static Product linearSearch(Product[] products, int targetId) {
        for (Product product : products) {
            if (product.productId == targetId) {
                return product;
            }
        }
        return null;
    }

    public static Product binarySearch(Product[] products, int targetId) {
        int left = 0;
        int right = products.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (products[mid].productId == targetId) {
                return products[mid];
            }

            if (products[mid].productId < targetId) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return null;
    }
}
