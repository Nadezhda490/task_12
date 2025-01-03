public class Main {

//    public static int length(char[] arr));
//    1. Описание:
//    Метод возвращает длину массива символов arr.
//    Считает количество символов в массиве arr и возвращает это значение.

    public static int length(char[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            count++;
        }
        return count;
    }

//    public static char charAt(int index);
//    2. Описание:
//    Метод возвращает символ, находящийся по указанному индексу в массиве.
//    Берет массив символов и индекс index, проверяет, существует ли символ на этом месте. Если индекс корректен, возвращает символ.

    public static char charAt(int index) {
        char[] arr = {'N', 'a', 'd', 'y', 'a'};
        for (int i = 0; i < arr.length; i++);
        return arr[index];
    }

//    public static char charAt(int index) {
//        char[] arr5 = new char[5];
//        for (int i = 0; i < index; i++) {
//        if (index >= 0 && index < arr5.length) {
//            return arr5[index];
//        } else {
//            System.out.println("Нет такого индекса");
//        }
//        return (char) index;
//    }

//    public static int indexOf(char simvol);
//    3. Описание:
//    Метод возвращает индекс первого вхождения символа simvol в массиве. Если символ не найден, возвращает -1.
//    Проходит по массиву слева направо, ищет первый символ, совпадающий с simvol. Если символ найден, возвращает его индекс. Если нет, возвращает -1.

    public static int indexOf(char simvol) {
        char[] arr = {'N','a','D','7','a'};
        for (int i = 0; i <= arr.length - 1; i++) {
            if (arr[i] == simvol) {
                return i;
            }
        }
        return -1;
    }
//    public static int indexOf(char[] arr, char simvol) {
//        for (int i = 0; i <= arr.length - 1; i++) {
//            if (arr[i] == simvol) {
//                return i;
//            }
//        }
//        return -1;
//    }

//    public static int lastIndexOf(char simvol);
//    4. Описание:
//    Метод возвращает индекс последнего вхождения символа simvol в массиве. Если символ не найден, возвращает -1.
//    Проходит по массиву справа налево, ищет последний символ, совпадающий с simvol. Если символ найден, возвращает его индекс. Если нет, возвращает -1.

    public static int lastIndexOf(char simvol) {
        char[] arr = {'n','A','d','0','a'};
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == simvol) {
                return i;
            }
        }
        return -1;
    }

//    public static int lastIndexOf(char[] arr, char simvol) {
//        for (int i = arr.length - 1; i >= 0; i--) {
//            if (arr[i] == simvol) {
//                return i;
//            }
//        }
//        return -1;
//    }

//    public static char[] toUpperCase(char[] arr);
//    5. Описание:
//    Метод возвращает новый массив символов, где все буквы преобразованы в верхний регистр.
//    Для каждой буквы в массиве проверяет, является ли она строчной (например, a-z). Если да, то заменяет её на соответствующую заглавную (например, A-Z).
//    Если символ не является буквой, он остается неизменным.

    public static char[] toUpperCase(char[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 'a' && arr[i] <= 'z') {
                arr[i] -= 32;
            }
        }
        return arr;
    }

//    public static char[] toLowerCase(char[] arr);
//    6. Описание:
//    Метод возвращает новый массив символов, где все буквы преобразованы в нижний регистр.
//    Для каждой буквы в массиве проверяет, является ли она заглавной (например, A-Z). Если да, то заменяет её на соответствующую строчную (например, a-z).
//    Если символ не является буквой, он остается неизменным.

    public static char[] toLowerCase(char[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 'A' && arr[i] <= 'Z') {
                arr[i] += 32;
            }
        }
        return arr;
    }

//    public static char[] trim(char[] arr );
//    7. Метод возвращает новый массив символов, из которого удалены начальные и конечные пробелы.
//    Удаляет все пробелы (символы ' ') с начала и конца массива.
//    Пробелы внутри строки остаются неизменными.

    public static char[] myTrim(char[] arr) {
        int countSpaseL = 0;
        int countSpaseR = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == ' ') {
                countSpaseL++;
            } else {
                break;
            }
        }
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == ' ') {
                countSpaseR++;
            } else {
                break;
            }
        }
        char[] arr2 = new char[arr.length - countSpaseL - countSpaseR];
        System.out.println(arr2.length);

        for (int i = countSpaseL, j = 0; i < arr.length - countSpaseR; i++, j++) {
            arr2[j] = arr[i];
        }
        return arr2;
    }



    public static void main(String[] args) {
        System.out.println();
        //1
        char[] arr = {'N', 'a', 'd', 'y', 'a'};
        System.out.println("Количество символов: " + length(arr));
        //2
//        char[] arr1 = {'N','a','d','y','a'};
//        String str = "Nadya";
        System.out.print("Символ: ");
        System.out.println(charAt(3));
        //3
        System.out.println("Индекс первого вхождения: " + indexOf('7'));
//        char[] arr2 = {'N','a','D','7','a'};
//        char simvol = '7';
//        System.out.println("Индекс первого вхождения: " + indexOf(arr2, simvol));
        //4
        System.out.println("Индекс последнего вхождения: " + lastIndexOf('d'));
//        char[] arr3 = {'n','A','d','0','a'};
//        char simvol1 = 'a';
//        System.out.println("Индекс последнего вхождения: " + lastIndexOf(arr3, simvol1));
        //5
        char[] arr4 = {'n','A','d','!','a'};
        System.out.print("Буквы преобразованы в верхний регистр: ");
        System.out.println(toUpperCase(arr4));
        //6
        char[] arr5 = {'N','a','D','0','a'};
        System.out.print("Буквы преобразованы в нижний регистр: ");
        System.out.println(toLowerCase(arr5));
        //7
        System.out.println("Удалены начальные и конечные пробелы: ");
        String str1 = "   Nadezhda   Veronika   ";
        System.out.println(str1.trim().length());
        char[] array = str1.toCharArray();
        char[] result = myTrim(array);
        System.out.println(str1);
        System.out.println(result);

    }
}