public class stringarr {
    public static void main(String[] args) {
        String[] str_arr1 = new String[4];
        str_arr1[0] = "Life is good";
        str_arr1[1] = "cute";
        str_arr1[2] = "layla!";
        

        String[] str_arr2 = new String[] {
            "Life is good",
            "cute",
            "layla!"
        };

        String[] str_arr3 = new String[4];
        str_arr3[0] = new String("cuate");
        str_arr3[1] = new String("layla");
        str_arr3[2] = new String("Lumine!");

        String[] str_arr4 = {
            "life is good",
            "layla",
            "lumine"
        };

        for(int i=0; i<str_arr1.length; i++) {
            System.out.println(str_arr1.length + " : " + str_arr1[i]);
        }

        for(int i=0; i<str_arr2.length; i++) {
            System.out.println(str_arr2.length + " : " + str_arr2[i]);
        }

        for(int i=0; i<str_arr3.length; i++) {
            System.out.println(str_arr3.length + " : " + str_arr3[i]);
        }

        for(int i=0; i<str_arr4.length; i++) {
            System.out.println(str_arr4.length + " : " + str_arr4[i]);
        }
        return;
    }
}