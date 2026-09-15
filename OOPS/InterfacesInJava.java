public class InterfacesInJava{
    public static void main(String args[]){
        Rook r = new Rook();
        r.moves();
    }
}

interface ChessPlayer{
    void moves(); // it is public, abstract, and without implementation
}

class Rook implements ChessPlayer{
    public void moves(){
        System.out.print("Up, Down, Left, Right");
    }
}

class King implements ChessPlayer{
    public void moves(){ // it must be public like moves from interface.
        System.out.print("UP, Down, Left, Right, Diagonal by 1");
    }
}