package ex3;

public class Draw implements Stars {

    @Override
    public String drawSquare(int n) {
        StringBuilder square = new StringBuilder();
        if (n < 1){
            throw new IllegalArgumentException();
        }
        else {
            for (int i = 1; i<=n; i++){
                for (int j = 1; j<=n; j++) {
                    square.append("*");
                }
                if (i<n) {
                    square.append("\n");
                }
            }
        }
        return String.valueOf(square);
    }

    @Override
    public String drawRectangle(int n, int m) {
        StringBuilder rectangle = new StringBuilder();
        if (n < 1){
            throw new IllegalArgumentException();
        }
        else {
            for (int i = 1; i<=m; i++){
                for (int j = 1; j<=n; j++) {
                    rectangle.append("*");
                }
                if (i<m) {
                    rectangle.append("\n");
                }
            }
        }
        return String.valueOf(rectangle);
    }

    @Override
    public String drawIsoscelesTriangle(int n) {
        StringBuilder triangle = new StringBuilder();
        if (n < 1){
            throw new IllegalArgumentException();
        }
        else {
            for (int i=1; i<=n; i++){
                for (int j=1; j<=n-i; j++){
                    triangle.append("-");
                }
                for (int j=1; j<=i*2-1; j++){
                    triangle.append("*");
                }
                if (i<n) {
                    triangle.append("\n");
                }
            }
        }
        return String.valueOf(triangle);
    }


    @Override
    public String drawDiamond(int n) {
        StringBuilder diamond = new StringBuilder();
        if (n < 1 || n%2 == 0){
            throw new IllegalArgumentException();
        }
        else {
            //TO-DO
        }
        return String.valueOf(diamond);
    }

    @Override
    public String drawRectangleTriangle(int n) {
        StringBuilder triangle = new StringBuilder();
        if (n < 1){
            throw new IllegalArgumentException();
        }
        else {
            for (int i=1; i<=n; i++){
                for (int j=1; j<=i; j++) {
                    triangle.append("*");
                }
                if (i<n){
                    triangle.append("\n");
                }
            }
        }
        return String.valueOf(triangle);
    }
}
