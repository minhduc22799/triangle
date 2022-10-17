public class TriangleClassifier {
    public static String triangleClassifier(int sideA, int sideB, int sideC){
        if (sideA > 0 && sideB > 0 && sideC > 0 ){
            if (sideA+sideB > sideC && sideB+sideC>sideA && sideC+sideA>sideB){
                if (sideA == sideB && sideA == sideC){
                    return "tam giac deu";
                }else if (sideA==sideB|| sideA == sideC || sideB == sideC){
                    return "tam giac can";
                }else {
                    return "tam giac thuong";
                }
            }
            else {
                return "khong phai tam giac";
            }

        }
        else {
            return  "khong phai tam giac";
        }

    }
}
