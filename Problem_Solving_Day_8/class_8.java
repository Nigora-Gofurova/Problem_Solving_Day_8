package Problem_Solving_Day_8;
//1
public class class_8 {
    public void shakl(int N) {
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("    ");
            }
            System.out.println(i);
        }
    }

    //2
    public void teskari_shakl(int N) {
        for (int i = N; i >= 1; i--) {
            for (int j = 1; j <= N - i; j++) {
                System.out.print("    ");
            }
            System.out.println(i);
        }
    }

    //3
    public void tub_oddiy(int N) {
        if (N < 2) {
            System.out.println(N + " - tub emas");
            return;
        }

        boolean tubmi = true;

        for (int i = 2; i < N; i++) {
            if (N % i == 0) {
                tubmi = false;
                break;
            }
        }

        if (tubmi) {
            System.out.println(N + " - tub son");
        } else {
            System.out.println(N + " - tub son emas");
        }
    }

    //4
    public void murakkab(int N) {
        boolean murakkab = true;
        if (N < 2) {
            System.out.print("bu ummuman murakkkab ham tub ham emas ");
            return;
        }
        for (int i = 2; i < N; i++) {
            if (N % i == 0) {
                System.out.print("true");
                break;
            }
        }
        if (murakkab) {
            System.out.print(N + "true");
        } else {
            System.out.print(N + "false");
        }
    }

    //5
    public void karra() {
        int i = 2;
        while (i <= 9) {
            int j = 1;
            while (j <= 10) {
                System.out.println(i + " * " + j + " = " + (i * j));
                j++;
            }
            System.out.println();
            i++;
        }
    }

    //6
    public void toq_karra() {
        int i = 1;
        while (i <= 9) {
            int j = 1;
            while (j <= 10) {
                System.out.println(i + " * " + j + " = " + (i * j));
                j++;
            }
            System.out.println();
            i = i + 2;
        }
    }

    //7
    public void juft_karra() {
        int i = 2;
        while (i <= 10) {
            int j = 1;
            while (j <= 10) {
                System.out.println(i + " * " + j + " = " + (i * j));
                j++;
            }
            System.out.println();
            i = i + 2;
        }
    }

    //8
    public void shakll(int N) {

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                if (i % 2 == 1) {
                    System.out.print("*");
                } else {
                    if (j == 1 || j == N) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                if (j != N) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    //9
    public void shakl_2(int N) {

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                    if (i == 1 || i == N) {
                        System.out.print("*");
                    } else {
                        if(j==1||j==N){
                        System.out.print("*");
                    }else{
                            System.out.print(" ");
                        }
                }
                if (j != N) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    //10
    public void shakl_3(int N) {

        int orta_qator=(N+1)/2;

        for(int i=1;i<=N;i++){
            for (int j=1;j<=N;j++){
                if(i==orta_qator){
                    System.out.print("*");
                }else{
                    if(j==1||j==N){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }
                if (j != N) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    //11
    public void shakl_4(int N) {
        for(int i=1;i<=N;i++ ){
            for (int j=1;j<=N;j++) {
                if (j == i || j == N - i + 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
                if (j != N) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    //12
    public void sonlar(int N) {
        for (int i = 1; i <= N; i++) {
            int son=N-i+1;
            for (int j = 1; j <= i; j++) {
                System.out.print(son+" ");
            }
            System.out.println();
        }
    }
    //13
    public void kamayuvchi(int N) {
        for (int i = 1; i <= N - 1; i++) {
            int soni = N - i;                    // qator sayin kamayadi
            for (int j = 1; j <= soni; j++) {
                System.out.print("*");
                if (j != soni) System.out.print(" ");
            }
            System.out.println();
        }
    }
    //14
    public void ortuvchi(int N) {
        for (int i = 1; i <= N; i++) {
            int soni = i - 1;                    // qator sayin ortadi, 1-qatorda 0
            for (int j = 1; j <= soni; j++) {
                System.out.print("*");
                if (j != soni) System.out.print(" ");
            }
            System.out.println();
        }
    }
    //15
    public void bloklar(int N) {
        for (int blok = 1; blok <= N; blok++) {
            for (int qator = 1; qator <= 2; qator++) {
                for (int j = 1; j <= N - 1; j++) {
                    System.out.print("*     ");
                }
                System.out.println();
            }
            System.out.println();   // bloklar orasida bo'sh qator
        }
    }
}