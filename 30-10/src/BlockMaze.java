public class BlockMaze {
    static void blockGrid(int sr,int sc,int er,int ec,int[][] path,String str,boolean[][] isvisited){
        if(sr<0 || sc<0) return;
        if(sr>er || sc>ec) return;
        if(path[sr][sc]==0) return;
        if(isvisited[sr][sc]==true) return;
        if(sr==er && sc==ec) {
            System.out.println(str);
            return;
        }
        isvisited[sr][sc]=true;

        blockGrid(sr,sc-1,er,ec,path,str+"L",isvisited);    //Going left
        blockGrid(sr,sc+1,er,ec,path,str+"R",isvisited);    //Going right
        blockGrid(sr+1,sc,er,ec,path,str+"D",isvisited);    //Going down
        blockGrid(sr-1,sc,er,ec,path,str+"U",isvisited);    //Going up

        isvisited[sr][sc]=false;
    }

    public static void main(String[] args) {
        int er=4;
        int ec=6;
        int[][] path = {{1,0,1,1,1,1},{1,1,1,1,0,1},{1,1,1,1,1,1},{1,0,1,0,1,1}};
        boolean[][] isvisited = new boolean[er][ec];
        blockGrid(0,0,er-1,ec-1,path,"",isvisited);
    }
}
