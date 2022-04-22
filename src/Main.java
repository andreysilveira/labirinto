class Main {
    public static void main(String[] args) {

        // Para mudar o mapa é so descomentar a variavel e lab de baixo onde faz os testes de coodernadas

        //Lab 1
        char[][] lab1 = {
                {'#','#','#','#','#','#','#','#','#','#'},
                {'#','.','.','.','.','.','.','.','.','#'},
                {'#','#','.','#','.','#','#','#','#','#'},
                {'#','.','.','#','.','#','.','.','.','#'},
                {'#','.','.','#','.','.','.','#','.','#'},
                {'#','#','#','#','.','#','#','#','.','#'},
                {'#','.','#','.','.','.','.','#','#','#'},
                {'#','.','.','#','#','.','#','#','.','#'},
                {'#','.','.','.','#','.','.','.','.','#'},
                {'#','#','#','#','#','#','#','#','#','#'}};


          //Lab 2
//        char[][] lab2 = {
//                {'#','#','#','#','#','#','#','#','#','#'},
//                {'#','#','.','.','.','.','.','#','.','#'},
//                {'#','#','.','#','#','.','#','#','.','#'},
//                {'#','#','.','.','#','.','.','.','.','#'},
//                {'#','#','.','#','.','#','#','#','#','#'},
//                {'#','#','.','#','.','#','#','#','#','#'},
//                {'#','.','.','#','#','.','.','#','.','#'},
//                {'#','.','#','#','.','#','.','#','.','#'},
//                {'#','.','.','.','.','.','.','.','.','#'},
//                {'#','#','#','#','#','#','#','#','#','#'}};


          //Lab 3
//        char[][] lab3 = {
//                {'#','#','#','#','#','#','#','#','#','#'},
//                {'#','#','#','#','#','.','.','#','.','#'},
//                {'#','#','#','#','.','#','#','#','#','#'},
//                {'#','#','.','.','.','.','.','.','.','#'},
//                {'#','.','.','#','#','.','.','#','.','#'},
//                {'#','#','.','#','#','.','#','#','.','#'},
//                {'#','#','#','#','.','.','.','#','.','#'},
//                {'#','.','.','#','.','#','.','#','.','#'},
//                {'#','#','.','#','.','.','#','#','#','#'},
//                {'#','#','#','#','#','#','#','#','#','#'},
//        };

        // Lab 1
        Coordinates startCoordinates1 = new Coordinates(7,8);
        Coordinates endCoordinates1 = new Coordinates(1,8);

        System.out.println("##############################################");
        System.out.println("Labirinto 1 com saida:");
        System.out.println("##############################################");

        if (Stack.pathExists(lab1, startCoordinates1, endCoordinates1)) {
            System.out.println("Resultado: Saiu!");
        }


        // Lab 2
//        Coordinates startCoordinates2 = new Coordinates(7,1);
//        Coordinates endCoordinates2 = new Coordinates(6,2);
//
//        System.out.println("##############################################");
//        System.out.println("Labirinto 2 com saida:");
//        System.out.println("##############################################");

//        if (Stack.pathExists(lab2, startCoord2, endCoord2)) {
//            System.out.println("Resultado: Saiu!");
//        }


        // Lab 3
//        Coordinates startCoordinates3 = new Coordinates(8,4);
//        Coordinates endCoordinates3 = new Coordinates(8,2);
//
//        System.out.println("##############################################");
//        System.out.println("Labirinto 3 sem saida:");
//        System.out.println("##############################################");
//
//        if (Stack.pathExists(lab3, startCoordinates3, endCoordinates3)) {
//            System.out.println("Resultado: Sem saida!");
//        }

    }
}