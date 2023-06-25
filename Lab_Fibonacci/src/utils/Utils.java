
package utils;

import static java.lang.Integer.parseInt;
import java.util.ArrayList;
import java.util.Scanner;


public class Utils {

    public static int inputInt(String displayMess, String displayError) {
        boolean flag = true;
        int temp = 0;
        do {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.print(displayMess);
                temp = sc.nextInt();
                flag = true;

            } catch (Exception e) {

                System.out.println(displayError);

                flag = false;
            }

        } while (flag == false);
        return temp;

    }

    public static int inputIntMin(String displayMess, String displayError, int min) {
        boolean flag = true;
        int temp = 0;
        do {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.print(displayMess);
                temp = sc.nextInt();
                if (temp < min) {
                    throw new Exception();
                }

                flag = true;

            } catch (Exception e) {
                System.out.println(displayError);
                flag = false;
            }

        } while (flag == false);
        return temp;

    }

    public static int inputIntMax(String displayMess, String displayError, int max) {
        boolean flag = true;
        int temp = 0;
        do {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.print(displayMess);
                temp = sc.nextInt();
                if (temp > max) {
                    throw new Exception();
                }

                flag = true;

            } catch (Exception e) {
                System.out.println(displayError);
                flag = false;
            }

        } while (flag == false);
        return temp;

    }

    public static int inputIntMinMax(String displayMess, String displayError, int min, int max) {
        boolean flag = true;
        int temp = 0;
        do {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.print(displayMess);
                temp = parseInt(sc.nextLine());
                if (temp > max || temp < min) {
                    throw new Exception();
                }

                flag = true;

            } catch (Exception e) {
                System.out.println(displayError);
                flag = false;
            }

        } while (flag == false);
        return temp;

    }

    public static float inputFloatMinMax(String displayMess, String displayError, float min, float max) {
        boolean flag = true;
        float temp = 0;
        do {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.print(displayMess);
                temp = sc.nextFloat();
                if (temp > max || temp < min) {
                    throw new Exception();
                }

                flag = true;

            } catch (Exception e) {
                System.out.println(displayError);
                flag = false;
            }

        } while (flag == false);
        return temp;

    }

    public static String inputString(String displayMess) {
        Scanner sc = new Scanner(System.in);
        System.out.print(displayMess);
        String temp = sc.nextLine();

        return temp;
    }

    public static String inputString(String displayMess, String displayError) {

        boolean check = false;
        String temp = "";
        do {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.print(displayMess);
                temp = sc.nextLine();

                if (temp.equalsIgnoreCase("") || temp.matches("\\s+") || !(temp.equalsIgnoreCase("Y") || temp.equalsIgnoreCase("N"))) {
                    throw new Exception();
                }
                check = true;
            } catch (Exception e) {
                System.out.println(displayError);
            }
        } while (check == false);

        return temp;

    }

    public static String inputStringRegex(String displayMess, String displayError, String regex) {
        //Nhap String Regex nghia la input String phai theo 1 mau nhat dinh
        boolean check = false;
        String temp = "";
        do {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.print(displayMess);
                temp = sc.nextLine();

                if (!temp.matches(regex)) {
                    throw new Exception();
                }
                check = true;
            } catch (Exception e) {
                System.out.println(displayError);
            }
        } while (check == false);

        return temp;

    }

    public static String inputStringPattern(String displayMess, String displayError, ArrayList<String> khuon) {

        boolean check = false;
        String temp = "";
        do {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.print(displayMess);
                temp = sc.nextLine();
                for (String acc : khuon) {
                    if (acc.equalsIgnoreCase(temp) == true) {
                        check = true;
                    }
                }
                if (check == false) {
                    throw new Exception();
                }

            } catch (Exception e) {
                System.out.println(displayError);
            }
        } while (check == false);

        return temp;

    }

    public static String inputStringRegex(String displayMess, String displayError, ArrayList<String> khuon) {

        boolean check = true;
        String temp = "";
        do {
            check = true;
            try {
                Scanner sc = new Scanner(System.in);
                System.out.print(displayMess);
                temp = sc.nextLine();
                for (String acc : khuon) {
                    if (acc.equalsIgnoreCase(temp) == true) {
                        check = false;
                    }
                }
                if (check == false) {
                    throw new Exception();
                }

            } catch (Exception e) {
                System.out.println(displayError);
            }
        } while (check == false);

        return temp;

    }

    public static Boolean inputBoolean(String displayMess, String displayError) {
        boolean flag = true;
        boolean temp = false;
        do {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.print(displayMess);
                temp = sc.nextBoolean();
                flag = true;

            } catch (Exception e) {
                System.out.println(displayError);
                flag = false;
            }

        } while (flag == false);
        return temp;

    }

    public static String updateString(String welcome, String oldData) {
        String result = oldData;
        Scanner sc = new Scanner(System.in);
        System.out.print(welcome);
        String tmp = sc.nextLine();
        if (!tmp.isEmpty()) {
            result = tmp;
        }
        return result;
    }

    public static int updateInt(String welcome, String error, int min, int max, int oldData) {
        boolean check = true;
        int number = oldData;
        do {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.print(welcome);
                String tmp = sc.nextLine();
                if (tmp.isEmpty()) {
                    check = false;
                } else {
                    number = Integer.parseInt(tmp);
                    check = false;
                }
            } catch (Exception e) {
                System.out.println(error);
            }
        } while (check || number > max || number < min);
        return number;
    }

    public static float updateFloat(String welcome, String error, float min, float max, float oldData) {
        boolean check = true;
        float number = oldData;
        do {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.print(welcome);
                String tmp = sc.nextLine();
                if (tmp.isEmpty()) {
                    check = false;
                } else {
                    number = Float.parseFloat(tmp);
                    check = false;
                }
            } catch (Exception e) {
                System.out.println(error);
            }
        } while (check || number > max || number < min);
        return number;
    }

    public static boolean updateBoolean(String welcome, String error, Boolean oldData) {
        boolean check = true;
        boolean bool = oldData;
        do {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.print(welcome);
                String tmp = sc.nextLine();
                tmp = tmp.toLowerCase();
                if (!(tmp.equals("true") || tmp.equals("false") || tmp.equals(""))) {
                    throw new Exception();
                }
                if (tmp.isEmpty()) {
                    check = false;
                } else {
                    bool = Boolean.parseBoolean(tmp);
                    check = false;
                }
            } catch (Exception e) {
                System.out.println(error);
            }
        } while (check);
        return bool;
    }

    public static int getRandomNumberInRange(int min, int max) {
        return (int) ((Math.random() * (max - min + 1))) + min;
    }

    public static int[] randomIntegerArray(int length, int min, int max) {
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i] = Utils.getRandomNumberInRange(min, max);
        }
        return arr;
    }

    public static void displayIntArray(int arr[]) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public static int[] randomIntArray(int length, int min, int max) {
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = Utils.getRandomNumberInRange(min, max);
        }
        return array;
    }

    public static void swap(int array[], int index1, int index2) {
        int tmp = array[index1];
        array[index1] = array[index2];
        array[index2] = tmp;
    }

    public static int[] cloneArray(int arr[]) {
        int ret[] = new int[arr.length];
        int c = 0;
        for (int i : arr) {
            ret[c++] = i;
        }
        return ret;
    }
}
