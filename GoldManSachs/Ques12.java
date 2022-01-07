public class Ques12 {
    static Long squaresInChessBoard(Long N) {
        long temp = (N*(N+1)*(2*N+1))/6; //summation of n^2
        return temp;
    }
}
