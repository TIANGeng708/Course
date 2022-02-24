package xyz.chengzi.halma.model;

import xyz.chengzi.halma.listener.GameListener;
import xyz.chengzi.halma.listener.Listenable;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class ChessBoard implements Listenable<GameListener> {
    private List<GameListener> listenerList = new ArrayList<>();
    private Square[][] grid;
    private int dimension;
    private int nextMove;
    private int test=0;
    private int numbers;
    private ChessPiece rule=new ChessPiece(Color.BLACK);

    //
    private ChessPiece green1=new ChessPiece(Color.pink);
    private ChessPiece green2=new ChessPiece(Color.pink);
    private ChessPiece green3=new ChessPiece(Color.pink);
    private ChessPiece green4=new ChessPiece(Color.pink);
    private ChessPiece green5=new ChessPiece(Color.pink);
    private ChessPiece green6=new ChessPiece(Color.pink);
    private ChessPiece green7=new ChessPiece(Color.pink);
    private ChessPiece green8=new ChessPiece(Color.pink);
    private ChessPiece green9=new ChessPiece(Color.pink);
    private ChessPiece green10=new ChessPiece(Color.pink);
    private ChessPiece green11=new ChessPiece(Color.pink);
    private ChessPiece green12=new ChessPiece(Color.pink);
    private ChessPiece green13=new ChessPiece(Color.pink);
    private ChessPiece green14=new ChessPiece(Color.pink);
    private ChessPiece green15=new ChessPiece(Color.pink);
    private ChessPiece green16=new ChessPiece(Color.pink);
    private ChessPiece green17=new ChessPiece(Color.pink);
    private ChessPiece green18=new ChessPiece(Color.pink);
    private ChessPiece green19=new ChessPiece(Color.pink);
    private ChessPiece red1=new ChessPiece(Color.pink);
    private ChessPiece red2=new ChessPiece(Color.pink);
    private ChessPiece red3=new ChessPiece(Color.pink);
    private ChessPiece red4=new ChessPiece(Color.pink);
    private ChessPiece red5=new ChessPiece(Color.pink);
    private ChessPiece red6=new ChessPiece(Color.pink);
    private ChessPiece red7=new ChessPiece(Color.pink);
    private ChessPiece red8=new ChessPiece(Color.pink);
    private ChessPiece red9=new ChessPiece(Color.pink);
    private ChessPiece red10=new ChessPiece(Color.pink);
    private ChessPiece red11=new ChessPiece(Color.pink);
    private ChessPiece red12=new ChessPiece(Color.pink);
    private ChessPiece red13=new ChessPiece(Color.pink);
    private ChessPiece red14=new ChessPiece(Color.pink);
    private ChessPiece red15=new ChessPiece(Color.pink);
    private ChessPiece red16=new ChessPiece(Color.pink);
    private ChessPiece red17=new ChessPiece(Color.pink);
    private ChessPiece red18=new ChessPiece(Color.pink);
    private ChessPiece red19=new ChessPiece(Color.pink);
    private ChessPiece yellow1=new ChessPiece(Color.pink);
    private ChessPiece yellow2=new ChessPiece(Color.pink);
    private ChessPiece yellow3=new ChessPiece(Color.pink);
    private ChessPiece yellow4=new ChessPiece(Color.pink);
    private ChessPiece yellow5=new ChessPiece(Color.pink);
    private ChessPiece yellow6=new ChessPiece(Color.pink);
    private ChessPiece yellow7=new ChessPiece(Color.pink);
    private ChessPiece yellow8=new ChessPiece(Color.pink);
    private ChessPiece yellow9=new ChessPiece(Color.pink);
    private ChessPiece yellow10=new ChessPiece(Color.pink);
    private ChessPiece yellow11=new ChessPiece(Color.pink);
    private ChessPiece yellow12=new ChessPiece(Color.pink);
    private ChessPiece yellow13=new ChessPiece(Color.pink);
    private ChessPiece blue1=new ChessPiece(Color.pink);
    private ChessPiece blue2=new ChessPiece(Color.pink);
    private ChessPiece blue3=new ChessPiece(Color.pink);
    private ChessPiece blue4=new ChessPiece(Color.pink);
    private ChessPiece blue5=new ChessPiece(Color.pink);
    private ChessPiece blue6=new ChessPiece(Color.pink);
    private ChessPiece blue7=new ChessPiece(Color.pink);
    private ChessPiece blue8=new ChessPiece(Color.pink);
    private ChessPiece blue9=new ChessPiece(Color.pink);
    private ChessPiece blue10=new ChessPiece(Color.pink);
    private ChessPiece blue11=new ChessPiece(Color.pink);
    private ChessPiece blue12=new ChessPiece(Color.pink);
    private ChessPiece blue13=new ChessPiece(Color.pink);


    private String hong1;private String lv1;private String lan1;private String huang1;
    private String hong2;private String lv2;private String lan2;private String huang2;
    private String hong3;private String lv3;private String lan3;private String huang3;
    private String hong4;private String lv4;private String lan4;private String huang4;
    private String hong5;private String lv5;private String lan5;private String huang5;
    private String hong6;private String lv6;private String lan6;private String huang6;
    private String hong7;private String lv7;private String lan7;private String huang7;
    private String hong8;private String lv8;private String lan8;private String huang8;
    private String hong9;private String lv9;private String lan9;private String huang9;
    private String hong10;private String lv10;private String lan10;private String huang10;
    private String hong11;private String lv11;private String lan11;private String huang11;
    private String hong12;private String lv12;private String lan26;private String huang12;
    private String hong13;private String lv13;private String lan13;private String huang13;
    private String hong14;private String lv14;
    private String hong15;private String lv15;
    private String hong16;private String lv16;
    private String hong17;private String lv17;
    private String hong18;private String lv18;
    private String hong19;private String lv19;
    private String judge;
    private int interesting=-100;


    public ArrayList<ChessBoardLocation> huodeqizi(){
        winning();
        String colorTest="";

        ArrayList<ChessBoardLocation> now=new ArrayList<>();
        ChessBoardLocation zoudong=new ChessBoardLocation(0,0);
        for (int i=0;i<16;i++){
            for (int j=0;j<16;j++){
                if (getChessPieceAt(new ChessBoardLocation(i,j))==null){
                    ;
                }
                if (getChessPieceAt(new ChessBoardLocation(i,j))!=null) {
                    colorTest=getChessPieceAt(new ChessBoardLocation(i, j)).getColor().toString();
                    if (colorTest.equals(Color.red.toString())) {
                        zoudong=new ChessBoardLocation(i, j);
                    }
                }
            }
        }
        now.add(zoudong);
        return now;
    }



    public ChessBoard(int dimension) {
        this.grid = new Square[dimension][dimension];
        this.dimension = dimension;

        initGrid();
    }

    private void initGrid() {
        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                grid[i][j] = new Square(new ChessBoardLocation(i, j));
            }
        }
    }

    public void placeInitialPieces(int Mode) {

        hong1="0000";  lv1="1515";  lan1="1501";  huang1="0115";
        hong2="0001";  lv2="1514";  lan2="1500";  huang2="0015";
        hong3="0100";  lv3="1415";  lan3="1400";  huang3="0014";
        hong4="0101";  lv4="1414";  lan4="1401";  huang4="0114";
        hong5="0002";  lv5="1513";  lan5="1502";  huang5="0215";
        hong6="0200";  lv6="1315";  lan6="1300";  huang6="0013";
        hong7="0300";  lv7="1215";  lan7="1200";  huang7="0012";
        hong8="0201";  lv8="1314";  lan8="1301";  huang8="0113";
        hong9="0102";  lv9="1413";  lan9="1402";  huang9="0214";
        hong10="0003";  lv10="1512";  lan10="1503";  huang10="0315";
        hong11="0301";  lv11="1214";  lan11="1201";  huang11="0112";
        hong12="0202";  lv12="1313";  lan26="1302";  huang12="0213";
        hong13="0103";  lv13="1412";  lan13="1403";  huang13="0314";
        hong14="0400";  lv14="1115";
        hong15="0004";  lv15="1511";
        hong16="0104";  lv16="1411";
        hong17="0203";  lv17="1312";
        hong18="0302";  lv18="1213";
        hong19="0401";  lv19="1114";


        for (int i=0;i<dimension;i++){
            for (int j=0;j<dimension;j++){
                grid[i][j].setPiece(null);
            }
        }
        int Go=0;
        if (Mode!=0&&Mode!=1){
            ;
        }else {
            Go=Mode;
        }
        //setTest(Go);
        if (Go==1){
            // TODO: This is only a demo implementation
            grid[Integer.parseInt(hong1.substring(0,2))][Integer.parseInt(hong1.substring(2,4))].setPiece(new ChessPiece(Color.RED));
            grid[Integer.parseInt(hong2.substring(0,2))][Integer.parseInt(hong2.substring(2,4))].setPiece(new ChessPiece(Color.RED));
            grid[Integer.parseInt(hong3.substring(0,2))][Integer.parseInt(hong3.substring(2,4))].setPiece(new ChessPiece(Color.RED));
            grid[Integer.parseInt(hong4.substring(0,2))][Integer.parseInt(hong4.substring(2,4))].setPiece(new ChessPiece(Color.RED));
            grid[Integer.parseInt(hong5.substring(0,2))][Integer.parseInt(hong5.substring(2,4))].setPiece(new ChessPiece(Color.RED));
            grid[Integer.parseInt(hong6.substring(0,2))][Integer.parseInt(hong6.substring(2,4))].setPiece(new ChessPiece(Color.RED));
            grid[Integer.parseInt(hong7.substring(0,2))][Integer.parseInt(hong7.substring(2,4))].setPiece(new ChessPiece(Color.RED));
            grid[Integer.parseInt(hong8.substring(0,2))][Integer.parseInt(hong8.substring(2,4))].setPiece(new ChessPiece(Color.RED));
            grid[Integer.parseInt(hong9.substring(0,2))][Integer.parseInt(hong9.substring(2,4))].setPiece(new ChessPiece(Color.RED));
            grid[Integer.parseInt(hong10.substring(0,2))][Integer.parseInt(hong10.substring(2,4))].setPiece(new ChessPiece(Color.RED));
            grid[Integer.parseInt(hong11.substring(0,2))][Integer.parseInt(hong11.substring(2,4))].setPiece(new ChessPiece(Color.RED));
            grid[Integer.parseInt(hong12.substring(0,2))][Integer.parseInt(hong12.substring(2,4))].setPiece(new ChessPiece(Color.RED));
            grid[Integer.parseInt(hong13.substring(0,2))][Integer.parseInt(hong13.substring(2,4))].setPiece(new ChessPiece(Color.RED));






            grid[Integer.parseInt(lv1.substring(0,2))][Integer.parseInt(lv1.substring(2,4))].setPiece(new ChessPiece(Color.GREEN));
            grid[Integer.parseInt(lv2.substring(0,2))][Integer.parseInt(lv2.substring(2,4))].setPiece(new ChessPiece(Color.GREEN));
            grid[Integer.parseInt(lv3.substring(0,2))][Integer.parseInt(lv3.substring(2,4))].setPiece(new ChessPiece(Color.GREEN));
            grid[Integer.parseInt(lv4.substring(0,2))][Integer.parseInt(lv4.substring(2,4))].setPiece(new ChessPiece(Color.green));
            grid[Integer.parseInt(lv5.substring(0,2))][Integer.parseInt(lv5.substring(2,4))].setPiece(new ChessPiece(Color.green));
            grid[Integer.parseInt(lv6.substring(0,2))][Integer.parseInt(lv6.substring(2,4))].setPiece(new ChessPiece(Color.green));
            grid[Integer.parseInt(lv7.substring(0,2))][Integer.parseInt(lv7.substring(2,4))].setPiece(new ChessPiece(Color.green));
            grid[Integer.parseInt(lv8.substring(0,2))][Integer.parseInt(lv8.substring(2,4))].setPiece(new ChessPiece(Color.green));
            grid[Integer.parseInt(lv9.substring(0,2))][Integer.parseInt(lv9.substring(2,4))].setPiece(new ChessPiece(Color.green));
            grid[Integer.parseInt(lv10.substring(0,2))][Integer.parseInt(lv10.substring(2,4))].setPiece(new ChessPiece(Color.green));
            grid[Integer.parseInt(lv11.substring(0,2))][Integer.parseInt(lv11.substring(2,4))].setPiece(new ChessPiece(Color.green));
            grid[Integer.parseInt(lv12.substring(0,2))][Integer.parseInt(lv12.substring(2,4))].setPiece(new ChessPiece(Color.green));
            grid[Integer.parseInt(lv13.substring(0,2))][Integer.parseInt(lv13.substring(2,4))].setPiece(new ChessPiece(Color.green));




            grid[Integer.parseInt(lan1.substring(0,2))][Integer.parseInt(lan1.substring(2,4))].setPiece(new ChessPiece(Color.blue));
            grid[Integer.parseInt(lan2.substring(0,2))][Integer.parseInt(lan2.substring(2,4))].setPiece(new ChessPiece(Color.blue));
            grid[Integer.parseInt(lan3.substring(0,2))][Integer.parseInt(lan3.substring(2,4))].setPiece(new ChessPiece(Color.blue));
            grid[Integer.parseInt(lan4.substring(0,2))][Integer.parseInt(lan4.substring(2,4))].setPiece(new ChessPiece(Color.blue));
            grid[Integer.parseInt(lan5.substring(0,2))][Integer.parseInt(lan5.substring(2,4))].setPiece(new ChessPiece(Color.blue));
            grid[Integer.parseInt(lan6.substring(0,2))][Integer.parseInt(lan6.substring(2,4))].setPiece(new ChessPiece(Color.blue));
            grid[Integer.parseInt(lan7.substring(0,2))][Integer.parseInt(lan7.substring(2,4))].setPiece(new ChessPiece(Color.blue));
            grid[Integer.parseInt(lan8.substring(0,2))][Integer.parseInt(lan8.substring(2,4))].setPiece(new ChessPiece(Color.blue));
            grid[Integer.parseInt(lan9.substring(0,2))][Integer.parseInt(lan9.substring(2,4))].setPiece(new ChessPiece(Color.blue));
            grid[Integer.parseInt(lan10.substring(0,2))][Integer.parseInt(lan10.substring(2,4))].setPiece(new ChessPiece(Color.blue));
            grid[Integer.parseInt(lan11.substring(0,2))][Integer.parseInt(lan11.substring(2,4))].setPiece(new ChessPiece(Color.blue));
            grid[Integer.parseInt(lan26.substring(0,2))][Integer.parseInt(lan26.substring(2,4))].setPiece(new ChessPiece(Color.blue));
            grid[Integer.parseInt(lan13.substring(0,2))][Integer.parseInt(lan13.substring(2,4))].setPiece(new ChessPiece(Color.blue));





            grid[Integer.parseInt(huang1.substring(0,2))][Integer.parseInt(huang1.substring(2,4))].setPiece(new ChessPiece(Color.yellow));
            grid[Integer.parseInt(huang2.substring(0,2))][Integer.parseInt(huang2.substring(2,4))].setPiece(new ChessPiece(Color.yellow));
            grid[Integer.parseInt(huang3.substring(0,2))][Integer.parseInt(huang3.substring(2,4))].setPiece(new ChessPiece(Color.yellow));
            grid[Integer.parseInt(huang4.substring(0,2))][Integer.parseInt(huang4.substring(2,4))].setPiece(new ChessPiece(Color.yellow));
            grid[Integer.parseInt(huang5.substring(0,2))][Integer.parseInt(huang5.substring(2,4))].setPiece(new ChessPiece(Color.yellow));
            grid[Integer.parseInt(huang6.substring(0,2))][Integer.parseInt(huang6.substring(2,4))].setPiece(new ChessPiece(Color.yellow));
            grid[Integer.parseInt(huang7.substring(0,2))][Integer.parseInt(huang7.substring(2,4))].setPiece(new ChessPiece(Color.yellow));
            grid[Integer.parseInt(huang8.substring(0,2))][Integer.parseInt(huang8.substring(2,4))].setPiece(new ChessPiece(Color.yellow));
            grid[Integer.parseInt(huang9.substring(0,2))][Integer.parseInt(huang9.substring(2,4))].setPiece(new ChessPiece(Color.yellow));
            grid[Integer.parseInt(huang10.substring(0,2))][Integer.parseInt(huang10.substring(2,4))].setPiece(new ChessPiece(Color.yellow));
            grid[Integer.parseInt(huang11.substring(0,2))][Integer.parseInt(huang11.substring(2,4))].setPiece(new ChessPiece(Color.yellow));
            grid[Integer.parseInt(huang12.substring(0,2))][Integer.parseInt(huang12.substring(2,4))].setPiece(new ChessPiece(Color.yellow));
            grid[Integer.parseInt(huang13.substring(0,2))][Integer.parseInt(huang13.substring(2,4))].setPiece(new ChessPiece(Color.yellow));


            listenerList.forEach(listener -> listener.onChessBoardReload(this));
        }else {
            grid[Integer.parseInt(hong1.substring(0,2))][Integer.parseInt(hong1.substring(2,4))].setPiece(new ChessPiece(Color.RED));
            grid[Integer.parseInt(hong2.substring(0,2))][Integer.parseInt(hong2.substring(2,4))].setPiece(new ChessPiece(Color.RED));
            grid[Integer.parseInt(hong3.substring(0,2))][Integer.parseInt(hong3.substring(2,4))].setPiece(new ChessPiece(Color.RED));
            grid[Integer.parseInt(hong4.substring(0,2))][Integer.parseInt(hong4.substring(2,4))].setPiece(new ChessPiece(Color.RED));
            grid[Integer.parseInt(hong5.substring(0,2))][Integer.parseInt(hong5.substring(2,4))].setPiece(new ChessPiece(Color.RED));
            grid[Integer.parseInt(hong6.substring(0,2))][Integer.parseInt(hong6.substring(2,4))].setPiece(new ChessPiece(Color.RED));
            grid[Integer.parseInt(hong7.substring(0,2))][Integer.parseInt(hong7.substring(2,4))].setPiece(new ChessPiece(Color.RED));
            grid[Integer.parseInt(hong8.substring(0,2))][Integer.parseInt(hong8.substring(2,4))].setPiece(new ChessPiece(Color.RED));
            grid[Integer.parseInt(hong9.substring(0,2))][Integer.parseInt(hong9.substring(2,4))].setPiece(new ChessPiece(Color.RED));
            grid[Integer.parseInt(hong10.substring(0,2))][Integer.parseInt(hong10.substring(2,4))].setPiece(new ChessPiece(Color.RED));
            grid[Integer.parseInt(hong11.substring(0,2))][Integer.parseInt(hong11.substring(2,4))].setPiece(new ChessPiece(Color.RED));
            grid[Integer.parseInt(hong12.substring(0,2))][Integer.parseInt(hong12.substring(2,4))].setPiece(new ChessPiece(Color.RED));
            grid[Integer.parseInt(hong13.substring(0,2))][Integer.parseInt(hong13.substring(2,4))].setPiece(new ChessPiece(Color.RED));
            grid[Integer.parseInt(hong14.substring(0,2))][Integer.parseInt(hong14.substring(2,4))].setPiece(new ChessPiece(Color.RED));
            grid[Integer.parseInt(hong15.substring(0,2))][Integer.parseInt(hong15.substring(2,4))].setPiece(new ChessPiece(Color.RED));
            grid[Integer.parseInt(hong16.substring(0,2))][Integer.parseInt(hong16.substring(2,4))].setPiece(new ChessPiece(Color.RED));
            grid[Integer.parseInt(hong17.substring(0,2))][Integer.parseInt(hong17.substring(2,4))].setPiece(new ChessPiece(Color.RED));
            grid[Integer.parseInt(hong18.substring(0,2))][Integer.parseInt(hong18.substring(2,4))].setPiece(new ChessPiece(Color.RED));
            grid[Integer.parseInt(hong19.substring(0,2))][Integer.parseInt(hong19.substring(2,4))].setPiece(new ChessPiece(Color.RED));



            grid[Integer.parseInt(lv1.substring(0,2))][Integer.parseInt(lv1.substring(2,4))].setPiece(new ChessPiece(Color.GREEN));
            grid[Integer.parseInt(lv2.substring(0,2))][Integer.parseInt(lv2.substring(2,4))].setPiece(new ChessPiece(Color.GREEN));
            grid[Integer.parseInt(lv3.substring(0,2))][Integer.parseInt(lv3.substring(2,4))].setPiece(new ChessPiece(Color.GREEN));
            grid[Integer.parseInt(lv4.substring(0,2))][Integer.parseInt(lv4.substring(2,4))].setPiece(new ChessPiece(Color.green));
            grid[Integer.parseInt(lv5.substring(0,2))][Integer.parseInt(lv5.substring(2,4))].setPiece(new ChessPiece(Color.green));
            grid[Integer.parseInt(lv6.substring(0,2))][Integer.parseInt(lv6.substring(2,4))].setPiece(new ChessPiece(Color.green));
            grid[Integer.parseInt(lv7.substring(0,2))][Integer.parseInt(lv7.substring(2,4))].setPiece(new ChessPiece(Color.green));
            grid[Integer.parseInt(lv8.substring(0,2))][Integer.parseInt(lv8.substring(2,4))].setPiece(new ChessPiece(Color.green));
            grid[Integer.parseInt(lv9.substring(0,2))][Integer.parseInt(lv9.substring(2,4))].setPiece(new ChessPiece(Color.green));
            grid[Integer.parseInt(lv10.substring(0,2))][Integer.parseInt(lv10.substring(2,4))].setPiece(new ChessPiece(Color.green));
            grid[Integer.parseInt(lv11.substring(0,2))][Integer.parseInt(lv11.substring(2,4))].setPiece(new ChessPiece(Color.green));
            grid[Integer.parseInt(lv12.substring(0,2))][Integer.parseInt(lv12.substring(2,4))].setPiece(new ChessPiece(Color.green));
            grid[Integer.parseInt(lv13.substring(0,2))][Integer.parseInt(lv13.substring(2,4))].setPiece(new ChessPiece(Color.green));
            grid[Integer.parseInt(lv14.substring(0,2))][Integer.parseInt(lv14.substring(2,4))].setPiece(new ChessPiece(Color.green));
            grid[Integer.parseInt(lv15.substring(0,2))][Integer.parseInt(lv15.substring(2,4))].setPiece(new ChessPiece(Color.green));
            grid[Integer.parseInt(lv16.substring(0,2))][Integer.parseInt(lv16.substring(2,4))].setPiece(new ChessPiece(Color.green));
            grid[Integer.parseInt(lv17.substring(0,2))][Integer.parseInt(lv17.substring(2,4))].setPiece(new ChessPiece(Color.green));
            grid[Integer.parseInt(lv18.substring(0,2))][Integer.parseInt(lv18.substring(2,4))].setPiece(new ChessPiece(Color.green));
            grid[Integer.parseInt(lv19.substring(0,2))][Integer.parseInt(lv19.substring(2,4))].setPiece(new ChessPiece(Color.green));

            listenerList.forEach(listener -> listener.onChessBoardReload(this));
        }
    }

    public void loadD(int Mode) {


        for (int i=0;i<dimension;i++){
            for (int j=0;j<dimension;j++){
                grid[i][j].setPiece(null);
            }
        }
        int Go=0;
        if (Mode!=0&&Mode!=1){
            ;
        }else {
            Go=Mode;
        }
        //setTest(Go);
        if (Go==1){
            // TODO: This is only a demo implementation
            grid[Integer.parseInt(hong1.substring(0,2))][Integer.parseInt(hong1.substring(2,4))].setPiece(new ChessPiece(Color.RED));
            grid[Integer.parseInt(hong2.substring(0,2))][Integer.parseInt(hong2.substring(2,4))].setPiece(new ChessPiece(Color.RED));
            grid[Integer.parseInt(hong3.substring(0,2))][Integer.parseInt(hong3.substring(2,4))].setPiece(new ChessPiece(Color.RED));
            grid[Integer.parseInt(hong4.substring(0,2))][Integer.parseInt(hong4.substring(2,4))].setPiece(new ChessPiece(Color.RED));
            grid[Integer.parseInt(hong5.substring(0,2))][Integer.parseInt(hong5.substring(2,4))].setPiece(new ChessPiece(Color.RED));
            grid[Integer.parseInt(hong6.substring(0,2))][Integer.parseInt(hong6.substring(2,4))].setPiece(new ChessPiece(Color.RED));
            grid[Integer.parseInt(hong7.substring(0,2))][Integer.parseInt(hong7.substring(2,4))].setPiece(new ChessPiece(Color.RED));
            grid[Integer.parseInt(hong8.substring(0,2))][Integer.parseInt(hong8.substring(2,4))].setPiece(new ChessPiece(Color.RED));
            grid[Integer.parseInt(hong9.substring(0,2))][Integer.parseInt(hong9.substring(2,4))].setPiece(new ChessPiece(Color.RED));
            grid[Integer.parseInt(hong10.substring(0,2))][Integer.parseInt(hong10.substring(2,4))].setPiece(new ChessPiece(Color.RED));
            grid[Integer.parseInt(hong11.substring(0,2))][Integer.parseInt(hong11.substring(2,4))].setPiece(new ChessPiece(Color.RED));
            grid[Integer.parseInt(hong12.substring(0,2))][Integer.parseInt(hong12.substring(2,4))].setPiece(new ChessPiece(Color.RED));
            grid[Integer.parseInt(hong13.substring(0,2))][Integer.parseInt(hong13.substring(2,4))].setPiece(new ChessPiece(Color.RED));






            grid[Integer.parseInt(lv1.substring(0,2))][Integer.parseInt(lv1.substring(2,4))].setPiece(new ChessPiece(Color.GREEN));
            grid[Integer.parseInt(lv2.substring(0,2))][Integer.parseInt(lv2.substring(2,4))].setPiece(new ChessPiece(Color.GREEN));
            grid[Integer.parseInt(lv3.substring(0,2))][Integer.parseInt(lv3.substring(2,4))].setPiece(new ChessPiece(Color.GREEN));
            grid[Integer.parseInt(lv4.substring(0,2))][Integer.parseInt(lv4.substring(2,4))].setPiece(new ChessPiece(Color.green));
            grid[Integer.parseInt(lv5.substring(0,2))][Integer.parseInt(lv5.substring(2,4))].setPiece(new ChessPiece(Color.green));
            grid[Integer.parseInt(lv6.substring(0,2))][Integer.parseInt(lv6.substring(2,4))].setPiece(new ChessPiece(Color.green));
            grid[Integer.parseInt(lv7.substring(0,2))][Integer.parseInt(lv7.substring(2,4))].setPiece(new ChessPiece(Color.green));
            grid[Integer.parseInt(lv8.substring(0,2))][Integer.parseInt(lv8.substring(2,4))].setPiece(new ChessPiece(Color.green));
            grid[Integer.parseInt(lv9.substring(0,2))][Integer.parseInt(lv9.substring(2,4))].setPiece(new ChessPiece(Color.green));
            grid[Integer.parseInt(lv10.substring(0,2))][Integer.parseInt(lv10.substring(2,4))].setPiece(new ChessPiece(Color.green));
            grid[Integer.parseInt(lv11.substring(0,2))][Integer.parseInt(lv11.substring(2,4))].setPiece(new ChessPiece(Color.green));
            grid[Integer.parseInt(lv12.substring(0,2))][Integer.parseInt(lv12.substring(2,4))].setPiece(new ChessPiece(Color.green));
            grid[Integer.parseInt(lv13.substring(0,2))][Integer.parseInt(lv13.substring(2,4))].setPiece(new ChessPiece(Color.green));




            grid[Integer.parseInt(lan1.substring(0,2))][Integer.parseInt(lan1.substring(2,4))].setPiece(new ChessPiece(Color.blue));
            grid[Integer.parseInt(lan2.substring(0,2))][Integer.parseInt(lan2.substring(2,4))].setPiece(new ChessPiece(Color.blue));
            grid[Integer.parseInt(lan3.substring(0,2))][Integer.parseInt(lan3.substring(2,4))].setPiece(new ChessPiece(Color.blue));
            grid[Integer.parseInt(lan4.substring(0,2))][Integer.parseInt(lan4.substring(2,4))].setPiece(new ChessPiece(Color.blue));
            grid[Integer.parseInt(lan5.substring(0,2))][Integer.parseInt(lan5.substring(2,4))].setPiece(new ChessPiece(Color.blue));
            grid[Integer.parseInt(lan6.substring(0,2))][Integer.parseInt(lan6.substring(2,4))].setPiece(new ChessPiece(Color.blue));
            grid[Integer.parseInt(lan7.substring(0,2))][Integer.parseInt(lan7.substring(2,4))].setPiece(new ChessPiece(Color.blue));
            grid[Integer.parseInt(lan8.substring(0,2))][Integer.parseInt(lan8.substring(2,4))].setPiece(new ChessPiece(Color.blue));
            grid[Integer.parseInt(lan9.substring(0,2))][Integer.parseInt(lan9.substring(2,4))].setPiece(new ChessPiece(Color.blue));
            grid[Integer.parseInt(lan10.substring(0,2))][Integer.parseInt(lan10.substring(2,4))].setPiece(new ChessPiece(Color.blue));
            grid[Integer.parseInt(lan11.substring(0,2))][Integer.parseInt(lan11.substring(2,4))].setPiece(new ChessPiece(Color.blue));
            grid[Integer.parseInt(lan26.substring(0,2))][Integer.parseInt(lan26.substring(2,4))].setPiece(new ChessPiece(Color.blue));
            grid[Integer.parseInt(lan13.substring(0,2))][Integer.parseInt(lan13.substring(2,4))].setPiece(new ChessPiece(Color.blue));





            grid[Integer.parseInt(huang1.substring(0,2))][Integer.parseInt(huang1.substring(2,4))].setPiece(new ChessPiece(Color.yellow));
            grid[Integer.parseInt(huang2.substring(0,2))][Integer.parseInt(huang2.substring(2,4))].setPiece(new ChessPiece(Color.yellow));
            grid[Integer.parseInt(huang3.substring(0,2))][Integer.parseInt(huang3.substring(2,4))].setPiece(new ChessPiece(Color.yellow));
            grid[Integer.parseInt(huang4.substring(0,2))][Integer.parseInt(huang4.substring(2,4))].setPiece(new ChessPiece(Color.yellow));
            grid[Integer.parseInt(huang5.substring(0,2))][Integer.parseInt(huang5.substring(2,4))].setPiece(new ChessPiece(Color.yellow));
            grid[Integer.parseInt(huang6.substring(0,2))][Integer.parseInt(huang6.substring(2,4))].setPiece(new ChessPiece(Color.yellow));
            grid[Integer.parseInt(huang7.substring(0,2))][Integer.parseInt(huang7.substring(2,4))].setPiece(new ChessPiece(Color.yellow));
            grid[Integer.parseInt(huang8.substring(0,2))][Integer.parseInt(huang8.substring(2,4))].setPiece(new ChessPiece(Color.yellow));
            grid[Integer.parseInt(huang9.substring(0,2))][Integer.parseInt(huang9.substring(2,4))].setPiece(new ChessPiece(Color.yellow));
            grid[Integer.parseInt(huang10.substring(0,2))][Integer.parseInt(huang10.substring(2,4))].setPiece(new ChessPiece(Color.yellow));
            grid[Integer.parseInt(huang11.substring(0,2))][Integer.parseInt(huang11.substring(2,4))].setPiece(new ChessPiece(Color.yellow));
            grid[Integer.parseInt(huang12.substring(0,2))][Integer.parseInt(huang12.substring(2,4))].setPiece(new ChessPiece(Color.yellow));
            grid[Integer.parseInt(huang13.substring(0,2))][Integer.parseInt(huang13.substring(2,4))].setPiece(new ChessPiece(Color.yellow));


            listenerList.forEach(listener -> listener.onChessBoardReload(this));
        }else {
            grid[Integer.parseInt(hong1.substring(0,2))][Integer.parseInt(hong1.substring(2,4))].setPiece(new ChessPiece(Color.RED));
            grid[Integer.parseInt(hong2.substring(0,2))][Integer.parseInt(hong2.substring(2,4))].setPiece(new ChessPiece(Color.RED));
            grid[Integer.parseInt(hong3.substring(0,2))][Integer.parseInt(hong3.substring(2,4))].setPiece(new ChessPiece(Color.RED));
            grid[Integer.parseInt(hong4.substring(0,2))][Integer.parseInt(hong4.substring(2,4))].setPiece(new ChessPiece(Color.RED));
            grid[Integer.parseInt(hong5.substring(0,2))][Integer.parseInt(hong5.substring(2,4))].setPiece(new ChessPiece(Color.RED));
            grid[Integer.parseInt(hong6.substring(0,2))][Integer.parseInt(hong6.substring(2,4))].setPiece(new ChessPiece(Color.RED));
            grid[Integer.parseInt(hong7.substring(0,2))][Integer.parseInt(hong7.substring(2,4))].setPiece(new ChessPiece(Color.RED));
            grid[Integer.parseInt(hong8.substring(0,2))][Integer.parseInt(hong8.substring(2,4))].setPiece(new ChessPiece(Color.RED));
            grid[Integer.parseInt(hong9.substring(0,2))][Integer.parseInt(hong9.substring(2,4))].setPiece(new ChessPiece(Color.RED));
            grid[Integer.parseInt(hong10.substring(0,2))][Integer.parseInt(hong10.substring(2,4))].setPiece(new ChessPiece(Color.RED));
            grid[Integer.parseInt(hong11.substring(0,2))][Integer.parseInt(hong11.substring(2,4))].setPiece(new ChessPiece(Color.RED));
            grid[Integer.parseInt(hong12.substring(0,2))][Integer.parseInt(hong12.substring(2,4))].setPiece(new ChessPiece(Color.RED));
            grid[Integer.parseInt(hong13.substring(0,2))][Integer.parseInt(hong13.substring(2,4))].setPiece(new ChessPiece(Color.RED));
            grid[Integer.parseInt(hong14.substring(0,2))][Integer.parseInt(hong14.substring(2,4))].setPiece(new ChessPiece(Color.RED));
            grid[Integer.parseInt(hong15.substring(0,2))][Integer.parseInt(hong15.substring(2,4))].setPiece(new ChessPiece(Color.RED));
            grid[Integer.parseInt(hong16.substring(0,2))][Integer.parseInt(hong16.substring(2,4))].setPiece(new ChessPiece(Color.RED));
            grid[Integer.parseInt(hong17.substring(0,2))][Integer.parseInt(hong17.substring(2,4))].setPiece(new ChessPiece(Color.RED));
            grid[Integer.parseInt(hong18.substring(0,2))][Integer.parseInt(hong18.substring(2,4))].setPiece(new ChessPiece(Color.RED));
            grid[Integer.parseInt(hong19.substring(0,2))][Integer.parseInt(hong19.substring(2,4))].setPiece(new ChessPiece(Color.RED));



            grid[Integer.parseInt(lv1.substring(0,2))][Integer.parseInt(lv1.substring(2,4))].setPiece(new ChessPiece(Color.GREEN));
            grid[Integer.parseInt(lv2.substring(0,2))][Integer.parseInt(lv2.substring(2,4))].setPiece(new ChessPiece(Color.GREEN));
            grid[Integer.parseInt(lv3.substring(0,2))][Integer.parseInt(lv3.substring(2,4))].setPiece(new ChessPiece(Color.GREEN));
            grid[Integer.parseInt(lv4.substring(0,2))][Integer.parseInt(lv4.substring(2,4))].setPiece(new ChessPiece(Color.green));
            grid[Integer.parseInt(lv5.substring(0,2))][Integer.parseInt(lv5.substring(2,4))].setPiece(new ChessPiece(Color.green));
            grid[Integer.parseInt(lv6.substring(0,2))][Integer.parseInt(lv6.substring(2,4))].setPiece(new ChessPiece(Color.green));
            grid[Integer.parseInt(lv7.substring(0,2))][Integer.parseInt(lv7.substring(2,4))].setPiece(new ChessPiece(Color.green));
            grid[Integer.parseInt(lv8.substring(0,2))][Integer.parseInt(lv8.substring(2,4))].setPiece(new ChessPiece(Color.green));
            grid[Integer.parseInt(lv9.substring(0,2))][Integer.parseInt(lv9.substring(2,4))].setPiece(new ChessPiece(Color.green));
            grid[Integer.parseInt(lv10.substring(0,2))][Integer.parseInt(lv10.substring(2,4))].setPiece(new ChessPiece(Color.green));
            grid[Integer.parseInt(lv11.substring(0,2))][Integer.parseInt(lv11.substring(2,4))].setPiece(new ChessPiece(Color.green));
            grid[Integer.parseInt(lv12.substring(0,2))][Integer.parseInt(lv12.substring(2,4))].setPiece(new ChessPiece(Color.green));
            grid[Integer.parseInt(lv13.substring(0,2))][Integer.parseInt(lv13.substring(2,4))].setPiece(new ChessPiece(Color.green));
            grid[Integer.parseInt(lv14.substring(0,2))][Integer.parseInt(lv14.substring(2,4))].setPiece(new ChessPiece(Color.green));
            grid[Integer.parseInt(lv15.substring(0,2))][Integer.parseInt(lv15.substring(2,4))].setPiece(new ChessPiece(Color.green));
            grid[Integer.parseInt(lv16.substring(0,2))][Integer.parseInt(lv16.substring(2,4))].setPiece(new ChessPiece(Color.green));
            grid[Integer.parseInt(lv17.substring(0,2))][Integer.parseInt(lv17.substring(2,4))].setPiece(new ChessPiece(Color.green));
            grid[Integer.parseInt(lv18.substring(0,2))][Integer.parseInt(lv18.substring(2,4))].setPiece(new ChessPiece(Color.green));
            grid[Integer.parseInt(lv19.substring(0,2))][Integer.parseInt(lv19.substring(2,4))].setPiece(new ChessPiece(Color.green));


            listenerList.forEach(listener -> listener.onChessBoardReload(this));
        }
    }

    public Square getGridAt(ChessBoardLocation location) {
        return grid[location.getRow()][location.getColumn()];
    }

    public ChessPiece getChessPieceAt(ChessBoardLocation location) {
        return getGridAt(location).getPiece();
    }

    public void setChessPieceAt(ChessBoardLocation location, ChessPiece piece) {
        getGridAt(location).setPiece(piece);
        listenerList.forEach(listener -> listener.onChessPiecePlace(location, piece));
    }

    public ChessPiece removeChessPieceAt(ChessBoardLocation location) {
        ChessPiece piece = getGridAt(location).getPiece();
        getGridAt(location).setPiece(null);
        listenerList.forEach(listener -> listener.onChessPieceRemove(location));
        //System.out.println("Aab");
        return piece;

    }

    public void moveChessPiece(ChessBoardLocation src, ChessBoardLocation dest) {
        /*if (isValidMove(src, dest,0)!=0) {
            throw new IllegalArgumentException("Illegal halma move");
        }*/
        setChessPieceAt(dest, removeChessPieceAt(src));
        //System.out.println("Aab"); 检测位移是否成功
    }

    public int getDimension() {
        return dimension;
    }

    public int isValidMove(ChessBoardLocation src, ChessBoardLocation dest,int abc) {
        String qian="";String hou="";

            if (getChessPieceAt(src) == null || getChessPieceAt(dest) != null) {
                return -1;
            }
        int srcRow = src.getRow(), srcCol = src.getColumn(), destRow = dest.getRow(), destCol = dest.getColumn();
        int rowDistance = destRow - srcRow, colDistance = destCol - srcCol;
        int meanValueRow = (destRow+srcRow)/2, meanValueCol = (destCol+srcCol)/2;
        ChessBoardLocation mean=new ChessBoardLocation(meanValueRow,meanValueCol);
        if ((Math.abs(rowDistance)==2&&Math.abs(colDistance)==2)||(Math.abs(rowDistance)==0&&Math.abs(colDistance)==2)||(Math.abs(rowDistance)==2&&Math.abs(colDistance)==0)){
            if (getChessPieceAt(mean)!=null){
                //System.out.printf("(%d,%d),(%d,%d)\n",srcCol,srcRow,destCol,destRow);//System.out.println(numbers);

                if (numbers==0){
                    if (((srcCol==0&&srcRow==0)||(srcCol==1&&srcRow==0)||(srcCol==2&&srcRow==0)||(srcCol==3&&srcRow==0)||
                            (srcCol==4&&srcRow==0)||(srcCol==0&&srcRow==1)||(srcCol==1&&srcRow==1)||(srcCol==2&&srcRow==1)||
                            (srcCol==3&&srcRow==1)||(srcCol==4&&srcRow==1)||(srcCol==0&&srcRow==2)||(srcCol==1&&srcRow==2)||
                            (srcCol==2&&srcRow==2)||(srcCol==3&&srcRow==2)||(srcCol==0&&srcRow==3)||(srcCol==1&&srcRow==3)||
                            (srcCol==2&&srcRow==3)||(srcCol==0&&srcRow==4)||(srcCol==1&&srcRow==4))){
                        if ((destCol==0&&destRow==0)||(destCol==1&&destRow==0)||(destCol==2&&destRow==0)||(destCol==3&&destRow==0)||
                                (destCol==4&&destRow==0)||(destCol==0&&destRow==1)||(destCol==1&&destRow==1)||(destCol==2&&destRow==1)||
                                (destCol==3&&destRow==1)||(destCol==4&&destRow==1)||(destCol==0&&destRow==2)||(destCol==1&&destRow==2)||
                                (destCol==2&&destRow==2)||(destCol==3&&destRow==2)||(destCol==0&&destRow==3)||(destCol==1&&destRow==3)||
                                (destCol==2&&destRow==3)||(destCol==0&&destRow==4)||(destCol==1&&destRow==4)
                        ){
                            ;
                        }else {
                            setRule(grid[srcRow][srcCol].getPiece());
                            if (getRule().getColor()==Color.green){
                                return -1;
                            }
                            //return 0;//未做更改！！！！这是棋子为绿直接触发
                        }
                    }
                    if ((srcCol==15&&srcRow==15)||(srcCol==15&&srcRow==14)||(srcCol==15&&srcRow==13)||(srcCol==15&&srcRow==12)||
                            (srcCol==15&&srcRow==11)||(srcCol==14&&srcRow==15)||(srcCol==14&&srcRow==14)||(srcCol==14&&srcRow==13)||
                            (srcCol==14&&srcRow==12)||(srcCol==14&&srcRow==11)||(srcCol==13&&srcRow==15)||(srcCol==13&&srcRow==14)||
                            (srcCol==13&&srcRow==13)||(srcCol==13&&srcRow==12)||(srcCol==12&&srcRow==15)||(srcCol==12&&srcRow==14)||
                            (srcCol==12&&srcRow==13)||(srcCol==11&&srcRow==15)||(srcCol==11&&srcRow==14)){
                        if ((destCol==15&&destRow==15)||(destCol==15&&destRow==14)||(destCol==15&&destRow==13)||(destCol==15&&destRow==12)||
                                (destCol==15&&destRow==11)||(destCol==14&&destRow==15)||(destCol==14&&destRow==14)||(destCol==14&&destRow==13)||
                                (destCol==14&&destRow==12)||(destCol==14&&destRow==11)||(destCol==13&&destRow==15)||(destCol==13&&destRow==14)||
                                (destCol==13&&destRow==13)||(destCol==13&&destRow==12)||(destCol==12&&destRow==15)||(destCol==12&&destRow==14)||
                                (destCol==12&&destRow==13)||(destCol==11&&destRow==15)||(destCol==11&&destRow==14)
                        ){
                            ;
                        }else {
                            setRule(grid[srcRow][srcCol].getPiece());
                            if (getRule().getColor()==Color.red){
                                return -1;
                            }
                            //return 0;//未做更改！！！！这是棋子为红直接触发
                        }
                    }
                }
                if (numbers==1){
                    if ((srcCol==0&&srcRow==0)||(srcCol==1&&srcRow==0)||(srcCol==2&&srcRow==0)||(srcCol==3&&srcRow==0)||
                            (srcCol==0&&srcRow==1)||(srcCol==1&&srcRow==1)||(srcCol==2&&srcRow==1)||
                            (srcCol==3&&srcRow==1)||(srcCol==0&&srcRow==2)||(srcCol==1&&srcRow==2)||
                            (srcCol==2&&srcRow==2)||(srcCol==0&&srcRow==3)||(srcCol==1&&srcRow==3)){
                        if ((destCol==0&&destRow==0)||(destCol==1&&destRow==0)||(destCol==2&&destRow==0)||(destCol==3&&destRow==0)||
                                (destCol==0&&destRow==1)||(destCol==1&&destRow==1)||(destCol==2&&destRow==1)||
                                (destCol==3&&destRow==1)||(destCol==0&&destRow==2)||(destCol==1&&destRow==2)||
                                (destCol==2&&destRow==2)||(destCol==0&&destRow==3)||(destCol==1&&destRow==3)
                        ){
                            ;
                        }else {
                            setRule(grid[srcRow][srcCol].getPiece());
                            if (getRule().getColor()==Color.green){
                                return -1;
                            }
                            //return 0;//未做更改！！！！这是棋子为绿直接触发
                        }
                    }

                    if ((srcCol==0&&srcRow==15)||(srcCol==0&&srcRow==14)||(srcCol==0&&srcRow==13)||(srcCol==0&&srcRow==12)||
                            (srcCol==1&&srcRow==15)||(srcCol==1&&srcRow==14)||(srcCol==1&&srcRow==13)||
                            (srcCol==1&&srcRow==12)||(srcCol==2&&srcRow==15)||(srcCol==2&&srcRow==14)||
                            (srcCol==2&&srcRow==13)||(srcCol==3&&srcRow==15)||(srcCol==3&&srcRow==14)){
                        if ((destCol==0&&destRow==15)||(destCol==0&&destRow==14)||(destCol==0&&destRow==13)||(destCol==0&&destRow==12)||
                                (destCol==1&&destRow==15)||(destCol==1&&destRow==14)||(destCol==1&&destRow==13)||
                                (destCol==1&&destRow==12)||(destCol==2&&destRow==15)||(destCol==2&&destRow==14)||
                                (destCol==2&&destRow==13)||(destCol==3&&destRow==15)||(destCol==3&&destRow==14)
                        ){
                            ;
                        }else {
                            setRule(grid[srcRow][srcCol].getPiece());
                            if (getRule().getColor()==Color.yellow){
                                return -1;
                            }
                            //return 0;//未做更改！！！！这是棋子为黄直接触发
                        }
                    }

                    if ((srcCol==15&&srcRow==15)||(srcCol==15&&srcRow==14)||(srcCol==15&&srcRow==13)||(srcCol==15&&srcRow==12)||
                            (srcCol==14&&srcRow==15)||(srcCol==14&&srcRow==14)||(srcCol==14&&srcRow==13)||
                            (srcCol==14&&srcRow==12)||(srcCol==13&&srcRow==15)||(srcCol==13&&srcRow==14)||
                            (srcCol==13&&srcRow==13)||(srcCol==12&&srcRow==15)||(srcCol==12&&srcRow==14)){
                        if ((destCol==15&&destRow==15)||(destCol==15&&destRow==14)||(destCol==15&&destRow==13)||(destCol==15&&destRow==12)||
                                (destCol==14&&destRow==15)||(destCol==14&&destRow==14)||(destCol==14&&destRow==13)||
                                (destCol==14&&destRow==12)||(destCol==13&&destRow==15)||(destCol==13&&destRow==14)||
                                (destCol==13&&destRow==13)||(destCol==12&&destRow==15)||(destCol==12&&destRow==14)
                        ){
                            ;
                        }else {
                            setRule(grid[srcRow][srcCol].getPiece());
                            if (getRule().getColor()==Color.red){
                                return -1;
                            }
                            //return 0;//未做更改！！！！这是棋子为红直接触发
                        }
                    }

                    if ((srcCol==15&&srcRow==0)||(srcCol==14&&srcRow==0)||(srcCol==13&&srcRow==0)||(srcCol==12&&srcRow==0)||
                            (srcCol==15&&srcRow==1)||(srcCol==14&&srcRow==1)||(srcCol==13&&srcRow==1)||
                            (srcCol==12&&srcRow==1)||(srcCol==15&&srcRow==2)||(srcCol==14&&srcRow==2)||
                            (srcCol==13&&srcRow==2)||(srcCol==15&&srcRow==3)||(srcCol==14&&srcRow==3)){
                        if ((destCol==15&&destRow==0)||(destCol==14&&destRow==0)||(destCol==13&&destRow==0)||(destCol==12&&destRow==0)||
                                (destCol==15&&destRow==1)||(destCol==14&&destRow==1)||(destCol==13&&destRow==1)||
                                (destCol==12&&destRow==1)||(destCol==15&&destRow==2)||(destCol==14&&destRow==2)||
                                (destCol==13&&destRow==2)||(destCol==15&&destRow==3)||(destCol==14&&destRow==3)
                        ){
                            ;
                        }else {
                            setRule(grid[srcRow][srcCol].getPiece());
                            if (getRule().getColor()==Color.blue){
                                return -1;
                            }
                            //return 0;//未做更改！！！！这是棋子为蓝直接触发
                        }
                    }
                }
                if (abc==1){
                if (interesting==101){
                    setHong1(getJudge());
                }
                if (interesting==102){
                    setHong2(getJudge());
                }
                if (interesting==103){
                    setHong3(getJudge());
                }
                if (interesting==104){
                    setHong4(getJudge());
                }
                if (interesting==105){
                    setHong5(getJudge());
                }
                if (interesting==106){
                    setHong6(getJudge());
                }
                if (interesting==107){
                    setHong7(getJudge());
                }
                if (interesting==108){
                    setHong8(getJudge());
                }
                if (interesting==109){
                    setHong9(getJudge());
                }
                if (interesting==110){
                    setHong10(getJudge());
                }
                if (interesting==111){
                    setHong11(getJudge());
                }
                if (interesting==112){
                    setHong12(getJudge());
                }
                if (interesting==113){
                    setHong13(getJudge());
                }
                if (interesting==114){
                    setHong14(getJudge());
                }
                if (interesting==115){
                    setHong15(getJudge());
                }
                if (interesting==116){
                    setHong16(getJudge());
                }
                if (interesting==117){
                    setHong17(getJudge());
                }
                if (interesting==118){
                    setHong18(getJudge());
                }
                if (interesting==119){
                    setHong19(getJudge());
                }
                if (interesting==201){
                    setLv1(getJudge());
                }
                if (interesting==202){
                    setLv2(getJudge());
                }
                if (interesting==203){
                    setLv3(getJudge());
                }
                if (interesting==204){
                    setLv4(getJudge());
                }
                if (interesting==205){
                    setLv5(getJudge());
                }
                if (interesting==206){
                    setLv6(getJudge());
                }
                if (interesting==207){
                    setLv7(getJudge());
                }
                if (interesting==208){
                    setLv8(getJudge());
                }
                if (interesting==209){
                    setLv9(getJudge());
                }
                if (interesting==210){
                    setLv10(getJudge());
                }
                if (interesting==211){
                    setLv11(getJudge());
                }
                if (interesting==212){
                    setLv12(getJudge());
                }
                if (interesting==213){
                    setLv13(getJudge());
                }
                if (interesting==214){
                    setLv14(getJudge());
                }
                if (interesting==215){
                    setLv15(getJudge());
                }
                if (interesting==216){
                    setLv16(getJudge());
                }
                if (interesting==217){
                    setLv17(getJudge());
                }
                if (interesting==218){
                    setLv18(getJudge());
                }
                if (interesting==219){
                    setLv19(getJudge());
                }
                if (interesting==301){
                    setHuang1(getJudge());
                }
                if (interesting==302){
                    setHuang2(getJudge());
                }
                if (interesting==303){
                    setHuang3(getJudge());
                }
                if (interesting==304){
                    setHuang4(getJudge());
                }
                if (interesting==305){
                    setHuang5(getJudge());
                }
                if (interesting==306){
                    setHuang6(getJudge());
                }
                if (interesting==307){
                    setHuang7(getJudge());
                }
                if (interesting==308){
                    setHuang8(getJudge());
                }
                if (interesting==309){
                    setHuang9(getJudge());
                }
                if (interesting==310){
                    setHuang10(getJudge());
                }
                if (interesting==311){
                    setHuang11(getJudge());
                }
                if (interesting==312){
                    setHuang12(getJudge());
                }
                if (interesting==313){
                    setHuang13(getJudge());
                }
                if (interesting==401){
                    setLan1(getJudge());
                }
                if (interesting==402){
                    setLan2(getJudge());
                }
                if (interesting==403){
                    setLan3(getJudge());
                }
                if (interesting==404){
                    setLan4(getJudge());
                }
                if (interesting==405){
                    setLan5(getJudge());
                }
                if (interesting==406){
                    setLan6(getJudge());
                }
                if (interesting==407){
                    setLan7(getJudge());
                }
                if (interesting==408){
                    setLan8(getJudge());
                }
                if (interesting==409){
                    setLan9(getJudge());
                }
                if (interesting==410){
                    setLan10(getJudge());
                }
                if (interesting==411){
                    setLan11(getJudge());
                }
                if (interesting==412){
                    setLan26(getJudge());
                }
                if (interesting==413){
                    setLan13(getJudge());
                }





                if (Integer.parseInt(getHong14().substring(0,2))==srcRow&&Integer.parseInt(getHong14().substring(2,4))==srcCol){
                    if (destRow<10){
                        qian="0"+destRow;
                    }else {
                        qian=""+destRow;
                    }
                    if (destCol<10){hou="0"+destCol;
                    }else {
                        hou=""+destCol;
                    }
                    setInteresting(114);
                    setJudge(qian+hou);
                }
                if (Integer.parseInt(getHong15().substring(0,2))==srcRow&&Integer.parseInt(getHong15().substring(2,4))==srcCol){
                    if (destRow<10){
                        qian="0"+destRow;
                    }else {
                        qian=""+destRow;
                    }
                    if (destCol<10){hou="0"+destCol;
                    }else {
                        hou=""+destCol;
                    }
                    setInteresting(115);
                    setJudge(qian+hou);
                }
                if (Integer.parseInt(getHong16().substring(0,2))==srcRow&&Integer.parseInt(getHong16().substring(2,4))==srcCol){
                    if (destRow<10){
                        qian="0"+destRow;
                    }else {
                        qian=""+destRow;
                    }
                    if (destCol<10){hou="0"+destCol;
                    }else {
                        hou=""+destCol;
                    }
                    setInteresting(116);
                    setJudge(qian+hou);
                }
                if (Integer.parseInt(getHong17().substring(0,2))==srcRow&&Integer.parseInt(getHong17().substring(2,4))==srcCol){
                    if (destRow<10){
                        qian="0"+destRow;
                    }else {
                        qian=""+destRow;
                    }
                    if (destCol<10){hou="0"+destCol;
                    }else {
                        hou=""+destCol;
                    }
                    setInteresting(117);
                    setJudge(qian+hou);
                }
                if (Integer.parseInt(getHong18().substring(0,2))==srcRow&&Integer.parseInt(getHong18().substring(2,4))==srcCol){
                    if (destRow<10){
                        qian="0"+destRow;
                    }else {
                        qian=""+destRow;
                    }
                    if (destCol<10){hou="0"+destCol;
                    }else {
                        hou=""+destCol;
                    }
                    setInteresting(118);
                    setJudge(qian+hou);
                }
                if (Integer.parseInt(getHong19().substring(0,2))==srcRow&&Integer.parseInt(getHong19().substring(2,4))==srcCol){
                    if (destRow<10){
                        qian="0"+destRow;
                    }else {
                        qian=""+destRow;
                    }
                    if (destCol<10){hou="0"+destCol;
                    }else {
                        hou=""+destCol;
                    }
                    setInteresting(119);
                    setJudge(qian+hou);
                }
                if (Integer.parseInt(getHong1().substring(0,2))==srcRow&&Integer.parseInt(getHong1().substring(2,4))==srcCol){
                    if (destRow<10){
                        qian="0"+destRow;
                    }else {
                        qian=""+destRow;
                    }
                    if (destCol<10){hou="0"+destCol;
                    }else {
                        hou=""+destCol;
                    }
                    setInteresting(101);
                    setJudge(qian+hou);
                }
                if (Integer.parseInt(getHong2().substring(0,2))==srcRow&&Integer.parseInt(getHong2().substring(2,4))==srcCol){
                    if (destRow<10){
                        qian="0"+destRow;
                    }else {
                        qian=""+destRow;
                    }
                    if (destCol<10){hou="0"+destCol;
                    }else {
                        hou=""+destCol;
                    }
                    setInteresting(102);
                    setJudge(qian+hou);
                }
                if (Integer.parseInt(getHong3().substring(0,2))==srcRow&&Integer.parseInt(getHong3().substring(2,4))==srcCol){
                    if (destRow<10){
                        qian="0"+destRow;
                    }else {
                        qian=""+destRow;
                    }
                    if (destCol<10){hou="0"+destCol;
                    }else {
                        hou=""+destCol;
                    }
                    setInteresting(103);
                    setJudge(qian+hou);
                }
                if (Integer.parseInt(getHong4().substring(0,2))==srcRow&&Integer.parseInt(getHong4().substring(2,4))==srcCol){
                    if (destRow<10){
                        qian="0"+destRow;
                    }else {
                        qian=""+destRow;
                    }
                    if (destCol<10){hou="0"+destCol;
                    }else {
                        hou=""+destCol;
                    }
                    setInteresting(104);
                    setJudge(qian+hou);
                }
                if (Integer.parseInt(getHong5().substring(0,2))==srcRow&&Integer.parseInt(getHong5().substring(2,4))==srcCol){
                    if (destRow<10){
                        qian="0"+destRow;
                    }else {
                        qian=""+destRow;
                    }
                    if (destCol<10){hou="0"+destCol;
                    }else {
                        hou=""+destCol;
                    }
                    setInteresting(105);
                    setJudge(qian+hou);
                }
                if (Integer.parseInt(getHong6().substring(0,2))==srcRow&&Integer.parseInt(getHong6().substring(2,4))==srcCol){
                    if (destRow<10){
                        qian="0"+destRow;
                    }else {
                        qian=""+destRow;
                    }
                    if (destCol<10){hou="0"+destCol;
                    }else {
                        hou=""+destCol;
                    }
                    setInteresting(106);
                    setJudge(qian+hou);
                }
                if (Integer.parseInt(getHong7().substring(0,2))==srcRow&&Integer.parseInt(getHong7().substring(2,4))==srcCol){
                    if (destRow<10){
                        qian="0"+destRow;
                    }else {
                        qian=""+destRow;
                    }
                    if (destCol<10){hou="0"+destCol;
                    }else {
                        hou=""+destCol;
                    }
                    setInteresting(107);
                    setJudge(qian+hou);
                }
                if (Integer.parseInt(getHong8().substring(0,2))==srcRow&&Integer.parseInt(getHong8().substring(2,4))==srcCol){
                    if (destRow<10){
                        qian="0"+destRow;
                    }else {
                        qian=""+destRow;
                    }
                    if (destCol<10){hou="0"+destCol;
                    }else {
                        hou=""+destCol;
                    }
                    setInteresting(108);
                    setJudge(qian+hou);
                }
                if (Integer.parseInt(getHong9().substring(0,2))==srcRow&&Integer.parseInt(getHong9().substring(2,4))==srcCol){
                    if (destRow<10){
                        qian="0"+destRow;
                    }else {
                        qian=""+destRow;
                    }
                    if (destCol<10){hou="0"+destCol;
                    }else {
                        hou=""+destCol;
                    }
                    setInteresting(109);
                    setJudge(qian+hou);
                }
                if (Integer.parseInt(getHong10().substring(0,2))==srcRow&&Integer.parseInt(getHong10().substring(2,4))==srcCol){
                    if (destRow<10){
                        qian="0"+destRow;
                    }else {
                        qian=""+destRow;
                    }
                    if (destCol<10){hou="0"+destCol;
                    }else {
                        hou=""+destCol;
                    }
                    setInteresting(110);
                    setJudge(qian+hou);
                }
                if (Integer.parseInt(getHong11().substring(0,2))==srcRow&&Integer.parseInt(getHong11().substring(2,4))==srcCol){
                    if (destRow<10){
                        qian="0"+destRow;
                    }else {
                        qian=""+destRow;
                    }
                    if (destCol<10){hou="0"+destCol;
                    }else {
                        hou=""+destCol;
                    }
                    setInteresting(111);
                    setJudge(qian+hou);
                }
                if (Integer.parseInt(getHong12().substring(0,2))==srcRow&&Integer.parseInt(getHong12().substring(2,4))==srcCol){
                    if (destRow<10){
                        qian="0"+destRow;
                    }else {
                        qian=""+destRow;
                    }
                    if (destCol<10){hou="0"+destCol;
                    }else {
                        hou=""+destCol;
                    }
                    setInteresting(112);
                    setJudge(qian+hou);
                }
                if (Integer.parseInt(getHong13().substring(0,2))==srcRow&&Integer.parseInt(getHong13().substring(2,4))==srcCol){
                    if (destRow<10){
                        qian="0"+destRow;
                    }else {
                        qian=""+destRow;
                    }
                    if (destCol<10){hou="0"+destCol;
                    }else {
                        hou=""+destCol;
                    }
                    setInteresting(113);
                    setJudge(qian+hou);
                }

                if (Integer.parseInt(getLv14().substring(0,2))==srcRow&&Integer.parseInt(getLv14().substring(2,4))==srcCol){
                    if (destRow<10){
                        qian="0"+destRow;
                    }else {
                        qian=""+destRow;
                    }
                    if (destCol<10){hou="0"+destCol;
                    }else {
                        hou=""+destCol;
                    }
                    setInteresting(214);
                    setJudge(qian+hou);
                }
                if (Integer.parseInt(getLv15().substring(0,2))==srcRow&&Integer.parseInt(getLv15().substring(2,4))==srcCol){
                    if (destRow<10){
                        qian="0"+destRow;
                    }else {
                        qian=""+destRow;
                    }
                    if (destCol<10){hou="0"+destCol;
                    }else {
                        hou=""+destCol;
                    }
                    setInteresting(215);
                    setJudge(qian+hou);
                }
                if (Integer.parseInt(getLv16().substring(0,2))==srcRow&&Integer.parseInt(getLv16().substring(2,4))==srcCol){
                    if (destRow<10){
                        qian="0"+destRow;
                    }else {
                        qian=""+destRow;
                    }
                    if (destCol<10){hou="0"+destCol;
                    }else {
                        hou=""+destCol;
                    }
                    setInteresting(216);
                    setJudge(qian+hou);
                }
                if (Integer.parseInt(getLv17().substring(0,2))==srcRow&&Integer.parseInt(getLv17().substring(2,4))==srcCol){
                    if (destRow<10){
                        qian="0"+destRow;
                    }else {
                        qian=""+destRow;
                    }
                    if (destCol<10){hou="0"+destCol;
                    }else {
                        hou=""+destCol;
                    }
                    setInteresting(217);
                    setJudge(qian+hou);
                }
                if (Integer.parseInt(getLv18().substring(0,2))==srcRow&&Integer.parseInt(getLv18().substring(2,4))==srcCol){
                    if (destRow<10){
                        qian="0"+destRow;
                    }else {
                        qian=""+destRow;
                    }
                    if (destCol<10){hou="0"+destCol;
                    }else {
                        hou=""+destCol;
                    }
                    setInteresting(218);
                    setJudge(qian+hou);
                }
                if (Integer.parseInt(getLv19().substring(0,2))==srcRow&&Integer.parseInt(getLv19().substring(2,4))==srcCol){
                    if (destRow<10){
                        qian="0"+destRow;
                    }else {
                        qian=""+destRow;
                    }
                    if (destCol<10){hou="0"+destCol;
                    }else {
                        hou=""+destCol;
                    }
                    setInteresting(219);
                    setJudge(qian+hou);
                }
                if (Integer.parseInt(getLv1().substring(0,2))==srcRow&&Integer.parseInt(getLv1().substring(2,4))==srcCol){
                    if (destRow<10){
                        qian="0"+destRow;
                    }else {
                        qian=""+destRow;
                    }
                    if (destCol<10){hou="0"+destCol;
                    }else {
                        hou=""+destCol;
                    }
                    setInteresting(201);
                    setJudge(qian+hou);
                }
                if (Integer.parseInt(getLv2().substring(0,2))==srcRow&&Integer.parseInt(getLv2().substring(2,4))==srcCol){
                    if (destRow<10){
                        qian="0"+destRow;
                    }else {
                        qian=""+destRow;
                    }
                    if (destCol<10){hou="0"+destCol;
                    }else {
                        hou=""+destCol;
                    }
                    setInteresting(202);
                    setJudge(qian+hou);
                }
                if (Integer.parseInt(getLv3().substring(0,2))==srcRow&&Integer.parseInt(getLv3().substring(2,4))==srcCol){
                    if (destRow<10){
                        qian="0"+destRow;
                    }else {
                        qian=""+destRow;
                    }
                    if (destCol<10){hou="0"+destCol;
                    }else {
                        hou=""+destCol;
                    }
                    setInteresting(203);
                    setJudge(qian+hou);
                }
                if (Integer.parseInt(getLv4().substring(0,2))==srcRow&&Integer.parseInt(getLv4().substring(2,4))==srcCol){
                    if (destRow<10){
                        qian="0"+destRow;
                    }else {
                        qian=""+destRow;
                    }
                    if (destCol<10){hou="0"+destCol;
                    }else {
                        hou=""+destCol;
                    }
                    setInteresting(204);
                    setJudge(qian+hou);
                }
                if (Integer.parseInt(getLv5().substring(0,2))==srcRow&&Integer.parseInt(getLv5().substring(2,4))==srcCol){
                    if (destRow<10){
                        qian="0"+destRow;
                    }else {
                        qian=""+destRow;
                    }
                    if (destCol<10){hou="0"+destCol;
                    }else {
                        hou=""+destCol;
                    }
                    setInteresting(205);
                    setJudge(qian+hou);
                }
                if (Integer.parseInt(getLv6().substring(0,2))==srcRow&&Integer.parseInt(getLv6().substring(2,4))==srcCol){
                    if (destRow<10){
                        qian="0"+destRow;
                    }else {
                        qian=""+destRow;
                    }
                    if (destCol<10){hou="0"+destCol;
                    }else {
                        hou=""+destCol;
                    }
                    setInteresting(206);
                    setJudge(qian+hou);
                }
                if (Integer.parseInt(getLv7().substring(0,2))==srcRow&&Integer.parseInt(getLv7().substring(2,4))==srcCol){
                    if (destRow<10){
                        qian="0"+destRow;
                    }else {
                        qian=""+destRow;
                    }
                    if (destCol<10){hou="0"+destCol;
                    }else {
                        hou=""+destCol;
                    }
                    setInteresting(207);
                    setJudge(qian+hou);
                }
                if (Integer.parseInt(getLv8().substring(0,2))==srcRow&&Integer.parseInt(getLv8().substring(2,4))==srcCol){
                    if (destRow<10){
                        qian="0"+destRow;
                    }else {
                        qian=""+destRow;
                    }
                    if (destCol<10){hou="0"+destCol;
                    }else {
                        hou=""+destCol;
                    }
                    setInteresting(208);
                    setJudge(qian+hou);
                }
                if (Integer.parseInt(getLv9().substring(0,2))==srcRow&&Integer.parseInt(getLv9().substring(2,4))==srcCol){
                    if (destRow<10){
                        qian="0"+destRow;
                    }else {
                        qian=""+destRow;
                    }
                    if (destCol<10){hou="0"+destCol;
                    }else {
                        hou=""+destCol;
                    }
                    setInteresting(209);
                    setJudge(qian+hou);
                }
                if (Integer.parseInt(getLv10().substring(0,2))==srcRow&&Integer.parseInt(getLv10().substring(2,4))==srcCol){
                    if (destRow<10){
                        qian="0"+destRow;
                    }else {
                        qian=""+destRow;
                    }
                    if (destCol<10){hou="0"+destCol;
                    }else {
                        hou=""+destCol;
                    }
                    setInteresting(210);
                    setJudge(qian+hou);
                }
                if (Integer.parseInt(getLv11().substring(0,2))==srcRow&&Integer.parseInt(getLv11().substring(2,4))==srcCol){
                    if (destRow<10){
                        qian="0"+destRow;
                    }else {
                        qian=""+destRow;
                    }
                    if (destCol<10){hou="0"+destCol;
                    }else {
                        hou=""+destCol;
                    }
                    setInteresting(211);
                    setJudge(qian+hou);
                }
                if (Integer.parseInt(getLv12().substring(0,2))==srcRow&&Integer.parseInt(getLv12().substring(2,4))==srcCol){
                    if (destRow<10){
                        qian="0"+destRow;
                    }else {
                        qian=""+destRow;
                    }
                    if (destCol<10){hou="0"+destCol;
                    }else {
                        hou=""+destCol;
                    }
                    setInteresting(212);
                    setJudge(qian+hou);
                }
                if (Integer.parseInt(getLv13().substring(0,2))==srcRow&&Integer.parseInt(getLv13().substring(2,4))==srcCol){
                    if (destRow<10){
                        qian="0"+destRow;
                    }else {
                        qian=""+destRow;
                    }
                    if (destCol<10){hou="0"+destCol;
                    }else {
                        hou=""+destCol;
                    }
                    setInteresting(213);
                    setJudge(qian+hou);
                }
                if (Integer.parseInt(getHuang1().substring(0,2))==srcRow&&Integer.parseInt(getHuang1().substring(2,4))==srcCol){
                    if (destRow<10){
                        qian="0"+destRow;
                    }else {
                        qian=""+destRow;
                    }
                    if (destCol<10){hou="0"+destCol;
                    }else {
                        hou=""+destCol;
                    }
                    setInteresting(301);
                    setJudge(qian+hou);
                }
                if (Integer.parseInt(getHuang2().substring(0,2))==srcRow&&Integer.parseInt(getHuang2().substring(2,4))==srcCol){
                    if (destRow<10){
                        qian="0"+destRow;
                    }else {
                        qian=""+destRow;
                    }
                    if (destCol<10){hou="0"+destCol;
                    }else {
                        hou=""+destCol;
                    }
                    setInteresting(302);
                    setJudge(qian+hou);
                }
                if (Integer.parseInt(getHuang3().substring(0,2))==srcRow&&Integer.parseInt(getHuang3().substring(2,4))==srcCol){
                    if (destRow<10){
                        qian="0"+destRow;
                    }else {
                        qian=""+destRow;
                    }
                    if (destCol<10){hou="0"+destCol;
                    }else {
                        hou=""+destCol;
                    }
                    setInteresting(303);
                    setJudge(qian+hou);
                }
                if (Integer.parseInt(getHuang4().substring(0,2))==srcRow&&Integer.parseInt(getHuang4().substring(2,4))==srcCol){
                    if (destRow<10){
                        qian="0"+destRow;
                    }else {
                        qian=""+destRow;
                    }
                    if (destCol<10){hou="0"+destCol;
                    }else {
                        hou=""+destCol;
                    }
                    setInteresting(304);
                    setJudge(qian+hou);
                }
                if (Integer.parseInt(getHuang5().substring(0,2))==srcRow&&Integer.parseInt(getHuang5().substring(2,4))==srcCol){
                    if (destRow<10){
                        qian="0"+destRow;
                    }else {
                        qian=""+destRow;
                    }
                    if (destCol<10){hou="0"+destCol;
                    }else {
                        hou=""+destCol;
                    }
                    setInteresting(305);
                    setJudge(qian+hou);
                }
                if (Integer.parseInt(getHuang6().substring(0,2))==srcRow&&Integer.parseInt(getHuang6().substring(2,4))==srcCol){
                    if (destRow<10){
                        qian="0"+destRow;
                    }else {
                        qian=""+destRow;
                    }
                    if (destCol<10){hou="0"+destCol;
                    }else {
                        hou=""+destCol;
                    }
                    setInteresting(306);
                    setJudge(qian+hou);
                }
                if (Integer.parseInt(getHuang7().substring(0,2))==srcRow&&Integer.parseInt(getHuang7().substring(2,4))==srcCol){
                    if (destRow<10){
                        qian="0"+destRow;
                    }else {
                        qian=""+destRow;
                    }
                    if (destCol<10){hou="0"+destCol;
                    }else {
                        hou=""+destCol;
                    }
                    setInteresting(307);
                    setJudge(qian+hou);
                }
                if (Integer.parseInt(getHuang8().substring(0,2))==srcRow&&Integer.parseInt(getHuang8().substring(2,4))==srcCol){
                    if (destRow<10){
                        qian="0"+destRow;
                    }else {
                        qian=""+destRow;
                    }
                    if (destCol<10){hou="0"+destCol;
                    }else {
                        hou=""+destCol;
                    }
                    setInteresting(308);
                    setJudge(qian+hou);
                }
                if (Integer.parseInt(getHuang9().substring(0,2))==srcRow&&Integer.parseInt(getHuang9().substring(2,4))==srcCol){
                    if (destRow<10){
                        qian="0"+destRow;
                    }else {
                        qian=""+destRow;
                    }
                    if (destCol<10){hou="0"+destCol;
                    }else {
                        hou=""+destCol;
                    }
                    setInteresting(309);
                    setJudge(qian+hou);
                }
                if (Integer.parseInt(getHuang10().substring(0,2))==srcRow&&Integer.parseInt(getHuang10().substring(2,4))==srcCol){
                    if (destRow<10){
                        qian="0"+destRow;
                    }else {
                        qian=""+destRow;
                    }
                    if (destCol<10){hou="0"+destCol;
                    }else {
                        hou=""+destCol;
                    }
                    setInteresting(310);
                    setJudge(qian+hou);
                }
                if (Integer.parseInt(getHuang11().substring(0,2))==srcRow&&Integer.parseInt(getHuang11().substring(2,4))==srcCol){
                    if (destRow<10){
                        qian="0"+destRow;
                    }else {
                        qian=""+destRow;
                    }
                    if (destCol<10){hou="0"+destCol;
                    }else {
                        hou=""+destCol;
                    }
                    setInteresting(311);
                    setJudge(qian+hou);
                }
                if (Integer.parseInt(getHuang12().substring(0,2))==srcRow&&Integer.parseInt(getHuang12().substring(2,4))==srcCol){
                    if (destRow<10){
                        qian="0"+destRow;
                    }else {
                        qian=""+destRow;
                    }
                    if (destCol<10){hou="0"+destCol;
                    }else {
                        hou=""+destCol;
                    }
                    setInteresting(312);
                    setJudge(qian+hou);
                }
                if (Integer.parseInt(getHuang13().substring(0,2))==srcRow&&Integer.parseInt(getHuang13().substring(2,4))==srcCol){
                    if (destRow<10){
                        qian="0"+destRow;
                    }else {
                        qian=""+destRow;
                    }
                    if (destCol<10){hou="0"+destCol;
                    }else {
                        hou=""+destCol;
                    }
                    setInteresting(313);
                    setJudge(qian+hou);
                }
                if (Integer.parseInt(getLan1().substring(0,2))==srcRow&&Integer.parseInt(getLan1().substring(2,4))==srcCol){
                    if (destRow<10){
                        qian="0"+destRow;
                    }else {
                        qian=""+destRow;
                    }
                    if (destCol<10){hou="0"+destCol;
                    }else {
                        hou=""+destCol;
                    }
                    setInteresting(401);
                    setJudge(qian+hou);
                }
                if (Integer.parseInt(getLan2().substring(0,2))==srcRow&&Integer.parseInt(getLan2().substring(2,4))==srcCol){
                    if (destRow<10){
                        qian="0"+destRow;
                    }else {
                        qian=""+destRow;
                    }
                    if (destCol<10){hou="0"+destCol;
                    }else {
                        hou=""+destCol;
                    }
                    setInteresting(402);
                    setJudge(qian+hou);
                }
                if (Integer.parseInt(getLan3().substring(0,2))==srcRow&&Integer.parseInt(getLan3().substring(2,4))==srcCol){
                    if (destRow<10){
                        qian="0"+destRow;
                    }else {
                        qian=""+destRow;
                    }
                    if (destCol<10){hou="0"+destCol;
                    }else {
                        hou=""+destCol;
                    }
                    setInteresting(403);
                    setJudge(qian+hou);
                }
                if (Integer.parseInt(getLan4().substring(0,2))==srcRow&&Integer.parseInt(getLan4().substring(2,4))==srcCol){
                    if (destRow<10){
                        qian="0"+destRow;
                    }else {
                        qian=""+destRow;
                    }
                    if (destCol<10){hou="0"+destCol;
                    }else {
                        hou=""+destCol;
                    }
                    setInteresting(404);
                    setJudge(qian+hou);
                }
                if (Integer.parseInt(getLan5().substring(0,2))==srcRow&&Integer.parseInt(getLan5().substring(2,4))==srcCol){
                    if (destRow<10){
                        qian="0"+destRow;
                    }else {
                        qian=""+destRow;
                    }
                    if (destCol<10){hou="0"+destCol;
                    }else {
                        hou=""+destCol;
                    }
                    setInteresting(405);
                    setJudge(qian+hou);
                }
                if (Integer.parseInt(getLan6().substring(0,2))==srcRow&&Integer.parseInt(getLan6().substring(2,4))==srcCol){
                    if (destRow<10){
                        qian="0"+destRow;
                    }else {
                        qian=""+destRow;
                    }
                    if (destCol<10){hou="0"+destCol;
                    }else {
                        hou=""+destCol;
                    }
                    setInteresting(406);
                    setJudge(qian+hou);
                }
                if (Integer.parseInt(getLan7().substring(0,2))==srcRow&&Integer.parseInt(getLan7().substring(2,4))==srcCol){
                    if (destRow<10){
                        qian="0"+destRow;
                    }else {
                        qian=""+destRow;
                    }
                    if (destCol<10){hou="0"+destCol;
                    }else {
                        hou=""+destCol;
                    }
                    setInteresting(407);
                    setJudge(qian+hou);
                }
                if (Integer.parseInt(getLan8().substring(0,2))==srcRow&&Integer.parseInt(getLan8().substring(2,4))==srcCol){
                    if (destRow<10){
                        qian="0"+destRow;
                    }else {
                        qian=""+destRow;
                    }
                    if (destCol<10){hou="0"+destCol;
                    }else {
                        hou=""+destCol;
                    }
                    setInteresting(408);
                    setJudge(qian+hou);
                }
                if (Integer.parseInt(getLan9().substring(0,2))==srcRow&&Integer.parseInt(getLan9().substring(2,4))==srcCol){
                    if (destRow<10){
                        qian="0"+destRow;
                    }else {
                        qian=""+destRow;
                    }
                    if (destCol<10){hou="0"+destCol;
                    }else {
                        hou=""+destCol;
                    }
                    setInteresting(409);
                    setJudge(qian+hou);
                }
                if (Integer.parseInt(getLan10().substring(0,2))==srcRow&&Integer.parseInt(getLan10().substring(2,4))==srcCol){
                    if (destRow<10){
                        qian="0"+destRow;
                    }else {
                        qian=""+destRow;
                    }
                    if (destCol<10){hou="0"+destCol;
                    }else {
                        hou=""+destCol;
                    }
                    setInteresting(410);
                    setJudge(qian+hou);
                }
                if (Integer.parseInt(getLan11().substring(0,2))==srcRow&&Integer.parseInt(getLan11().substring(2,4))==srcCol){
                    if (destRow<10){
                        qian="0"+destRow;
                    }else {
                        qian=""+destRow;
                    }
                    if (destCol<10){hou="0"+destCol;
                    }else {
                        hou=""+destCol;
                    }
                    setInteresting(411);
                    setJudge(qian+hou);
                }
                //System.out.print("aaaaa"+getLan26());
                if (Integer.parseInt(getLan26().substring(0,2))==srcRow&&Integer.parseInt(getLan26().substring(2,4))==srcCol){
                    if (destRow<10){
                        qian="0"+destRow;
                    }else {
                        qian=""+destRow;
                    }
                    if (destCol<10){hou="0"+destCol;
                    }else {
                        hou=""+destCol;
                    }
                    setInteresting(412);
                    setJudge(qian+hou);
                }
                if (Integer.parseInt(getLan13().substring(0,2))==srcRow&&Integer.parseInt(getLan13().substring(2,4))==srcCol){
                    if (destRow<10){
                        qian="0"+destRow;
                    }else {
                        qian=""+destRow;
                    }
                    if (destCol<10){hou="0"+destCol;
                    }else {
                        hou=""+destCol;
                    }
                    setInteresting(413);
                    setJudge(qian+hou);
                }}






                setNextMove(1);
                setTest(1);
                return 0;
            }
            else {
                return -1;
            }
        }
        if (rowDistance != 0 && colDistance != 0 && Math.abs((double) rowDistance / colDistance) != 1.0) {
            return -1;
        }
        if (Math.abs(rowDistance) <= 1 && Math.abs(colDistance) <= 1&&getTest()==0){
            if (numbers==0){
                if (((srcCol==0&&srcRow==0)||(srcCol==1&&srcRow==0)||(srcCol==2&&srcRow==0)||(srcCol==3&&srcRow==0)||
                        (srcCol==4&&srcRow==0)||(srcCol==0&&srcRow==1)||(srcCol==1&&srcRow==1)||(srcCol==2&&srcRow==1)||
                        (srcCol==3&&srcRow==1)||(srcCol==4&&srcRow==1)||(srcCol==0&&srcRow==2)||(srcCol==1&&srcRow==2)||
                        (srcCol==2&&srcRow==2)||(srcCol==3&&srcRow==2)||(srcCol==0&&srcRow==3)||(srcCol==1&&srcRow==3)||
                        (srcCol==2&&srcRow==3)||(srcCol==0&&srcRow==4)||(srcCol==1&&srcRow==4))){
                    if ((destCol==0&&destRow==0)||(destCol==1&&destRow==0)||(destCol==2&&destRow==0)||(destCol==3&&destRow==0)||
                            (destCol==4&&destRow==0)||(destCol==0&&destRow==1)||(destCol==1&&destRow==1)||(destCol==2&&destRow==1)||
                            (destCol==3&&destRow==1)||(destCol==4&&destRow==1)||(destCol==0&&destRow==2)||(destCol==1&&destRow==2)||
                            (destCol==2&&destRow==2)||(destCol==3&&destRow==2)||(destCol==0&&destRow==3)||(destCol==1&&destRow==3)||
                            (destCol==2&&destRow==3)||(destCol==0&&destRow==4)||(destCol==1&&destRow==4)
                    ){
                        ;
                    }else {
                        setRule(grid[srcRow][srcCol].getPiece());
                        if (getRule().getColor()==Color.green){
                            return -1;
                        }
                        //return 0;//未做更改！！！！这是棋子为绿直接触发
                    }
                }
                if ((srcCol==15&&srcRow==15)||(srcCol==15&&srcRow==14)||(srcCol==15&&srcRow==13)||(srcCol==15&&srcRow==12)||
                        (srcCol==15&&srcRow==11)||(srcCol==14&&srcRow==15)||(srcCol==14&&srcRow==14)||(srcCol==14&&srcRow==13)||
                        (srcCol==14&&srcRow==12)||(srcCol==4&&srcRow==11)||(srcCol==13&&srcRow==15)||(srcCol==13&&srcRow==14)||
                        (srcCol==13&&srcRow==13)||(srcCol==13&&srcRow==12)||(srcCol==12&&srcRow==15)||(srcCol==12&&srcRow==14)||
                        (srcCol==12&&srcRow==13)||(srcCol==11&&srcRow==15)||(srcCol==11&&srcRow==14)){
                    if ((destCol==15&&destRow==15)||(destCol==15&&destRow==14)||(destCol==15&&destRow==13)||(destCol==15&&destRow==12)||
                            (destCol==15&&destRow==11)||(destCol==14&&destRow==15)||(destCol==14&&destRow==14)||(destCol==14&&destRow==13)||
                            (destCol==14&&destRow==12)||(destCol==4&&destRow==11)||(destCol==13&&destRow==15)||(destCol==13&&destRow==14)||
                            (destCol==13&&destRow==13)||(destCol==13&&destRow==12)||(destCol==12&&destRow==15)||(destCol==12&&destRow==14)||
                            (destCol==12&&destRow==13)||(destCol==11&&destRow==15)||(destCol==11&&destRow==14)
                    ){
                        ;
                    }else {
                        setRule(grid[srcRow][srcCol].getPiece());
                        if (getRule().getColor()==Color.red){
                            return -1;
                        }
                        //return 0;//未做更改！！！！这是棋子为红直接触发
                    }
                }
            }
            if (numbers==1){
                if ((srcCol==0&&srcRow==0)||(srcCol==1&&srcRow==0)||(srcCol==2&&srcRow==0)||(srcCol==3&&srcRow==0)||
                        (srcCol==0&&srcRow==1)||(srcCol==1&&srcRow==1)||(srcCol==2&&srcRow==1)||
                        (srcCol==3&&srcRow==1)||(srcCol==0&&srcRow==2)||(srcCol==1&&srcRow==2)||
                        (srcCol==2&&srcRow==2)||(srcCol==0&&srcRow==3)||(srcCol==1&&srcRow==3)){
                    if ((destCol==0&&destRow==0)||(destCol==1&&destRow==0)||(destCol==2&&destRow==0)||(destCol==3&&destRow==0)||
                            (destCol==0&&destRow==1)||(destCol==1&&destRow==1)||(destCol==2&&destRow==1)||
                            (destCol==3&&destRow==1)||(destCol==0&&destRow==2)||(destCol==1&&destRow==2)||
                            (destCol==2&&destRow==2)||(destCol==0&&destRow==3)||(destCol==1&&destRow==3)
                    ){
                        ;
                    }else {
                        setRule(grid[srcRow][srcCol].getPiece());
                        if (getRule().getColor()==Color.green){
                            return -1;
                        }
                        //return 0;//未做更改！！！！这是棋子为绿直接触发
                    }
                }

                if ((srcCol==0&&srcRow==15)||(srcCol==0&&srcRow==14)||(srcCol==0&&srcRow==13)||(srcCol==0&&srcRow==12)||
                        (srcCol==1&&srcRow==15)||(srcCol==1&&srcRow==14)||(srcCol==1&&srcRow==13)||
                        (srcCol==1&&srcRow==12)||(srcCol==2&&srcRow==15)||(srcCol==2&&srcRow==14)||
                        (srcCol==2&&srcRow==13)||(srcCol==3&&srcRow==15)||(srcCol==3&&srcRow==14)){
                    if ((destCol==0&&destRow==15)||(destCol==0&&destRow==14)||(destCol==0&&destRow==13)||(destCol==0&&destRow==12)||
                            (destCol==1&&destRow==15)||(destCol==1&&destRow==14)||(destCol==1&&destRow==13)||
                            (destCol==1&&destRow==12)||(destCol==2&&destRow==15)||(destCol==2&&destRow==14)||
                            (destCol==2&&destRow==13)||(destCol==3&&destRow==15)||(destCol==3&&destRow==14)
                    ){
                        ;
                    }else {
                        setRule(grid[srcRow][srcCol].getPiece());
                        if (getRule().getColor()==Color.yellow){
                            return -2;
                        }
                        //return 0;//未做更改！！！！这是棋子为黄直接触发
                    }
                }

                if ((srcCol==15&&srcRow==15)||(srcCol==15&&srcRow==14)||(srcCol==15&&srcRow==13)||(srcCol==15&&srcRow==12)||
                        (srcCol==14&&srcRow==15)||(srcCol==14&&srcRow==14)||(srcCol==14&&srcRow==13)||
                        (srcCol==14&&srcRow==12)||(srcCol==13&&srcRow==15)||(srcCol==13&&srcRow==14)||
                        (srcCol==13&&srcRow==13)||(srcCol==12&&srcRow==15)||(srcCol==12&&srcRow==14)){
                    if ((destCol==15&&destRow==15)||(destCol==15&&destRow==14)||(destCol==15&&destRow==13)||(destCol==15&&destRow==12)||
                            (destCol==14&&destRow==15)||(destCol==14&&destRow==14)||(destCol==14&&destRow==13)||
                            (destCol==14&&destRow==12)||(destCol==13&&destRow==15)||(destCol==13&&destRow==14)||
                            (destCol==13&&destRow==13)||(destCol==12&&destRow==15)||(destCol==12&&destRow==14)
                    ){
                        ;
                    }else {
                        setRule(grid[srcRow][srcCol].getPiece());
                        if (getRule().getColor()==Color.red){
                            return -1;
                        }
                        //return 0;//未做更改！！！！这是棋子为红直接触发
                    }
                }

                if ((srcCol==15&&srcRow==0)||(srcCol==14&&srcRow==0)||(srcCol==13&&srcRow==0)||(srcCol==12&&srcRow==0)||
                        (srcCol==15&&srcRow==1)||(srcCol==14&&srcRow==1)||(srcCol==13&&srcRow==1)||
                        (srcCol==12&&srcRow==1)||(srcCol==15&&srcRow==2)||(srcCol==14&&srcRow==2)||
                        (srcCol==13&&srcRow==2)||(srcCol==15&&srcRow==3)||(srcCol==14&&srcRow==3)){
                    if ((destCol==15&&destRow==0)||(destCol==14&&destRow==0)||(destCol==13&&destRow==0)||(destCol==12&&destRow==0)||
                            (destCol==15&&destRow==1)||(destCol==14&&destRow==1)||(destCol==13&&destRow==1)||
                            (destCol==12&&destRow==1)||(destCol==15&&destRow==2)||(destCol==14&&destRow==2)||
                            (destCol==13&&destRow==2)||(destCol==15&&destRow==3)||(destCol==14&&destRow==3)
                    ){
                        ;
                    }else {
                        setRule(grid[srcRow][srcCol].getPiece());
                        if (getRule().getColor()==Color.blue){
                            return -3;
                        }
                        //return 0;//未做更改！！！！这是棋子为蓝直接触发
                    }
                }
            }
            if (abc==1){
            if (interesting==101){
                setHong1(getJudge());
            }
            if (interesting==102){
                setHong2(getJudge());
            }
            if (interesting==103){
                setHong3(getJudge());
            }
            if (interesting==104){
                setHong4(getJudge());
            }
            if (interesting==105){
                setHong5(getJudge());
            }
            if (interesting==106){
                setHong6(getJudge());
            }
            if (interesting==107){
                setHong7(getJudge());
            }
            if (interesting==108){
                setHong8(getJudge());
            }
            if (interesting==109){
                setHong9(getJudge());
            }
            if (interesting==110){
                setHong10(getJudge());
            }
            if (interesting==111){
                setHong11(getJudge());
            }
            if (interesting==112){
                setHong12(getJudge());
            }
            if (interesting==113){
                setHong13(getJudge());
            }
            if (interesting==114){
                setHong14(getJudge());
            }
            if (interesting==115){
                setHong15(getJudge());
            }
            if (interesting==116){
                setHong16(getJudge());
                System.out.print(judge);
                System.out.print(interesting);
                System.out.print(getHong16());
                System.out.println("啊");
            }
            if (interesting==117){
                setHong17(getJudge());
            }
            if (interesting==118){
                setHong18(getJudge());
            }
            if (interesting==119){
                setHong19(getJudge());
            }
            if (interesting==201){
                setLv1(getJudge());
            }
            if (interesting==202){
                setLv2(getJudge());
            }
            if (interesting==203){
                setLv3(getJudge());
            }
            if (interesting==204){
                setLv4(getJudge());
            }
            if (interesting==205){
                setLv5(getJudge());
            }
            if (interesting==206){
                setLv6(getJudge());
            }
            if (interesting==207){
                setLv7(getJudge());
            }
            if (interesting==208){
                setLv8(getJudge());
            }
            if (interesting==209){
                setLv9(getJudge());
            }
            if (interesting==210){
                setLv10(getJudge());
            }
            if (interesting==211){
                setLv11(getJudge());
            }
            if (interesting==212){
                setLv12(getJudge());
            }
            if (interesting==213){
                setLv13(getJudge());
            }
            if (interesting==214){
                setLv14(getJudge());
            }
            if (interesting==215){
                setLv15(getJudge());
            }
            if (interesting==216){
                setLv16(getJudge());
            }
            if (interesting==217){
                setLv17(getJudge());
            }
            if (interesting==218){
                setLv18(getJudge());
            }
            if (interesting==219){
                setLv19(getJudge());
            }
            if (interesting==301){
                setHuang1(getJudge());
            }
            if (interesting==302){
                setHuang2(getJudge());
            }
            if (interesting==303){
                setHuang3(getJudge());
            }
            if (interesting==304){
                setHuang4(getJudge());
            }
            if (interesting==305){
                setHuang5(getJudge());
            }
            if (interesting==306){
                setHuang6(getJudge());
            }
            if (interesting==307){
                setHuang7(getJudge());
            }
            if (interesting==308){
                setHuang8(getJudge());
            }
            if (interesting==309){
                setHuang9(getJudge());
            }
            if (interesting==310){
                setHuang10(getJudge());
            }
            if (interesting==311){
                setHuang11(getJudge());
            }
            if (interesting==312){
                setHuang12(getJudge());
            }
            if (interesting==313){
                setHuang13(getJudge());
            }
            if (interesting==401){
                setLan1(getJudge());
            }
            if (interesting==402){
                setLan2(getJudge());
            }
            if (interesting==403){
                setLan3(getJudge());
            }
            if (interesting==404){
                setLan4(getJudge());
            }
            if (interesting==405){
                setLan5(getJudge());
            }
            if (interesting==406){
                setLan6(getJudge());
            }
            if (interesting==407){
                setLan7(getJudge());
            }
            if (interesting==408){
                setLan8(getJudge());
            }
            if (interesting==409){
                setLan9(getJudge());
            }
            if (interesting==410){
                setLan10(getJudge());
            }
            if (interesting==411){
                setLan11(getJudge());
            }
            if (interesting==412){
                setLan26(getJudge());
            }
            if (interesting==413){
                setLan13(getJudge());
            }



            if (Integer.parseInt(getHong14().substring(0,2))==srcRow&&Integer.parseInt(getHong14().substring(2,4))==srcCol){
                if (destRow<10){
                    qian="0"+destRow;
                }else {
                    qian=""+destRow;
                }
                if (destCol<10){hou="0"+destCol;
                }else {
                    hou=""+destCol;
                }
                setInteresting(114);
                setJudge(qian+hou);
            }
            if (Integer.parseInt(getHong15().substring(0,2))==srcRow&&Integer.parseInt(getHong15().substring(2,4))==srcCol){
                if (destRow<10){
                    qian="0"+destRow;
                }else {
                    qian=""+destRow;
                }
                if (destCol<10){hou="0"+destCol;
                }else {
                    hou=""+destCol;
                }
                setInteresting(115);
                setJudge(qian+hou);
            }
            if (Integer.parseInt(getHong16().substring(0,2))==srcRow&&Integer.parseInt(getHong16().substring(2,4))==srcCol){
                if (destRow<10){
                    qian="0"+destRow;
                }else {
                    qian=""+destRow;
                }
                if (destCol<10){hou="0"+destCol;
                }else {
                    hou=""+destCol;
                }
                setInteresting(116);
                setJudge(qian+hou);
            }
            if (Integer.parseInt(getHong17().substring(0,2))==srcRow&&Integer.parseInt(getHong17().substring(2,4))==srcCol){
                if (destRow<10){
                    qian="0"+destRow;
                }else {
                    qian=""+destRow;
                }
                if (destCol<10){hou="0"+destCol;
                }else {
                    hou=""+destCol;
                }
                setInteresting(117);
                setJudge(qian+hou);
            }
            if (Integer.parseInt(getHong18().substring(0,2))==srcRow&&Integer.parseInt(getHong18().substring(2,4))==srcCol){
                if (destRow<10){
                    qian="0"+destRow;
                }else {
                    qian=""+destRow;
                }
                if (destCol<10){hou="0"+destCol;
                }else {
                    hou=""+destCol;
                }
                setInteresting(118);
                setJudge(qian+hou);
            }
            if (Integer.parseInt(getHong19().substring(0,2))==srcRow&&Integer.parseInt(getHong19().substring(2,4))==srcCol){
                if (destRow<10){
                    qian="0"+destRow;
                }else {
                    qian=""+destRow;
                }
                if (destCol<10){hou="0"+destCol;
                }else {
                    hou=""+destCol;
                }
                setInteresting(119);
                setJudge(qian+hou);
            }
            if (Integer.parseInt(getHong1().substring(0,2))==srcRow&&Integer.parseInt(getHong1().substring(2,4))==srcCol){
                if (destRow<10){
                    qian="0"+destRow;
                }else {
                    qian=""+destRow;
                }
                if (destCol<10){hou="0"+destCol;
                }else {
                    hou=""+destCol;
                }
                setInteresting(101);
                setJudge(qian+hou);
            }
            if (Integer.parseInt(getHong2().substring(0,2))==srcRow&&Integer.parseInt(getHong2().substring(2,4))==srcCol){
                if (destRow<10){
                    qian="0"+destRow;
                }else {
                    qian=""+destRow;
                }
                if (destCol<10){hou="0"+destCol;
                }else {
                    hou=""+destCol;
                }
                setInteresting(102);
                setJudge(qian+hou);
            }
            if (Integer.parseInt(getHong3().substring(0,2))==srcRow&&Integer.parseInt(getHong3().substring(2,4))==srcCol){
                if (destRow<10){
                    qian="0"+destRow;
                }else {
                    qian=""+destRow;
                }
                if (destCol<10){hou="0"+destCol;
                }else {
                    hou=""+destCol;
                }
                setInteresting(103);
                setJudge(qian+hou);
            }
            if (Integer.parseInt(getHong4().substring(0,2))==srcRow&&Integer.parseInt(getHong4().substring(2,4))==srcCol){
                if (destRow<10){
                    qian="0"+destRow;
                }else {
                    qian=""+destRow;
                }
                if (destCol<10){hou="0"+destCol;
                }else {
                    hou=""+destCol;
                }
                setInteresting(104);
                setJudge(qian+hou);
            }
            if (Integer.parseInt(getHong5().substring(0,2))==srcRow&&Integer.parseInt(getHong5().substring(2,4))==srcCol){
                if (destRow<10){
                    qian="0"+destRow;
                }else {
                    qian=""+destRow;
                }
                if (destCol<10){hou="0"+destCol;
                }else {
                    hou=""+destCol;
                }
                setInteresting(105);
                setJudge(qian+hou);
            }
            if (Integer.parseInt(getHong6().substring(0,2))==srcRow&&Integer.parseInt(getHong6().substring(2,4))==srcCol){
                if (destRow<10){
                    qian="0"+destRow;
                }else {
                    qian=""+destRow;
                }
                if (destCol<10){hou="0"+destCol;
                }else {
                    hou=""+destCol;
                }
                setInteresting(106);
                setJudge(qian+hou);
            }
            if (Integer.parseInt(getHong7().substring(0,2))==srcRow&&Integer.parseInt(getHong7().substring(2,4))==srcCol){
                if (destRow<10){
                    qian="0"+destRow;
                }else {
                    qian=""+destRow;
                }
                if (destCol<10){hou="0"+destCol;
                }else {
                    hou=""+destCol;
                }
                setInteresting(107);
                setJudge(qian+hou);
            }
            if (Integer.parseInt(getHong8().substring(0,2))==srcRow&&Integer.parseInt(getHong8().substring(2,4))==srcCol){
                if (destRow<10){
                    qian="0"+destRow;
                }else {
                    qian=""+destRow;
                }
                if (destCol<10){hou="0"+destCol;
                }else {
                    hou=""+destCol;
                }
                setInteresting(108);
                setJudge(qian+hou);
            }
            if (Integer.parseInt(getHong9().substring(0,2))==srcRow&&Integer.parseInt(getHong9().substring(2,4))==srcCol){
                if (destRow<10){
                    qian="0"+destRow;
                }else {
                    qian=""+destRow;
                }
                if (destCol<10){hou="0"+destCol;
                }else {
                    hou=""+destCol;
                }
                setInteresting(109);
                setJudge(qian+hou);
            }
            if (Integer.parseInt(getHong10().substring(0,2))==srcRow&&Integer.parseInt(getHong10().substring(2,4))==srcCol){
                if (destRow<10){
                    qian="0"+destRow;
                }else {
                    qian=""+destRow;
                }
                if (destCol<10){hou="0"+destCol;
                }else {
                    hou=""+destCol;
                }
                setInteresting(110);
                setJudge(qian+hou);
            }
            if (Integer.parseInt(getHong11().substring(0,2))==srcRow&&Integer.parseInt(getHong11().substring(2,4))==srcCol){
                if (destRow<10){
                    qian="0"+destRow;
                }else {
                    qian=""+destRow;
                }
                if (destCol<10){hou="0"+destCol;
                }else {
                    hou=""+destCol;
                }
                setInteresting(111);
                setJudge(qian+hou);
            }
            if (Integer.parseInt(getHong12().substring(0,2))==srcRow&&Integer.parseInt(getHong12().substring(2,4))==srcCol){
                if (destRow<10){
                    qian="0"+destRow;
                }else {
                    qian=""+destRow;
                }
                if (destCol<10){hou="0"+destCol;
                }else {
                    hou=""+destCol;
                }
                setInteresting(112);
                setJudge(qian+hou);
            }
            if (Integer.parseInt(getHong13().substring(0,2))==srcRow&&Integer.parseInt(getHong13().substring(2,4))==srcCol){
                if (destRow<10){
                    qian="0"+destRow;
                }else {
                    qian=""+destRow;
                }
                if (destCol<10){hou="0"+destCol;
                }else {
                    hou=""+destCol;
                }
                setInteresting(113);
                setJudge(qian+hou);
            }

            if (Integer.parseInt(getLv14().substring(0,2))==srcRow&&Integer.parseInt(getLv14().substring(2,4))==srcCol){
                if (destRow<10){
                    qian="0"+destRow;
                }else {
                    qian=""+destRow;
                }
                if (destCol<10){hou="0"+destCol;
                }else {
                    hou=""+destCol;
                }
                setInteresting(214);
                setJudge(qian+hou);
            }
            if (Integer.parseInt(getLv15().substring(0,2))==srcRow&&Integer.parseInt(getLv15().substring(2,4))==srcCol){
                if (destRow<10){
                    qian="0"+destRow;
                }else {
                    qian=""+destRow;
                }
                if (destCol<10){hou="0"+destCol;
                }else {
                    hou=""+destCol;
                }
                setInteresting(215);
                setJudge(qian+hou);
            }
            if (Integer.parseInt(getLv16().substring(0,2))==srcRow&&Integer.parseInt(getLv16().substring(2,4))==srcCol){
                if (destRow<10){
                    qian="0"+destRow;
                }else {
                    qian=""+destRow;
                }
                if (destCol<10){hou="0"+destCol;
                }else {
                    hou=""+destCol;
                }
                setInteresting(216);
                setJudge(qian+hou);
            }
            if (Integer.parseInt(getLv17().substring(0,2))==srcRow&&Integer.parseInt(getLv17().substring(2,4))==srcCol){
                if (destRow<10){
                    qian="0"+destRow;
                }else {
                    qian=""+destRow;
                }
                if (destCol<10){hou="0"+destCol;
                }else {
                    hou=""+destCol;
                }
                setInteresting(217);
                setJudge(qian+hou);
            }
            if (Integer.parseInt(getLv18().substring(0,2))==srcRow&&Integer.parseInt(getLv18().substring(2,4))==srcCol){
                if (destRow<10){
                    qian="0"+destRow;
                }else {
                    qian=""+destRow;
                }
                if (destCol<10){hou="0"+destCol;
                }else {
                    hou=""+destCol;
                }
                setInteresting(218);
                setJudge(qian+hou);
            }
            if (Integer.parseInt(getLv19().substring(0,2))==srcRow&&Integer.parseInt(getLv19().substring(2,4))==srcCol){
                if (destRow<10){
                    qian="0"+destRow;
                }else {
                    qian=""+destRow;
                }
                if (destCol<10){hou="0"+destCol;
                }else {
                    hou=""+destCol;
                }
                setInteresting(219);
                setJudge(qian+hou);
            }
            if (Integer.parseInt(getLv1().substring(0,2))==srcRow&&Integer.parseInt(getLv1().substring(2,4))==srcCol){
                if (destRow<10){
                    qian="0"+destRow;
                }else {
                    qian=""+destRow;
                }
                if (destCol<10){hou="0"+destCol;
                }else {
                    hou=""+destCol;
                }
                setInteresting(201);
                setJudge(qian+hou);
            }
            if (Integer.parseInt(getLv2().substring(0,2))==srcRow&&Integer.parseInt(getLv2().substring(2,4))==srcCol){
                if (destRow<10){
                    qian="0"+destRow;
                }else {
                    qian=""+destRow;
                }
                if (destCol<10){hou="0"+destCol;
                }else {
                    hou=""+destCol;
                }
                setInteresting(202);
                setJudge(qian+hou);
            }
            if (Integer.parseInt(getLv3().substring(0,2))==srcRow&&Integer.parseInt(getLv3().substring(2,4))==srcCol){
                if (destRow<10){
                    qian="0"+destRow;
                }else {
                    qian=""+destRow;
                }
                if (destCol<10){hou="0"+destCol;
                }else {
                    hou=""+destCol;
                }
                setInteresting(203);
                setJudge(qian+hou);
            }
            if (Integer.parseInt(getLv4().substring(0,2))==srcRow&&Integer.parseInt(getLv4().substring(2,4))==srcCol){
                if (destRow<10){
                    qian="0"+destRow;
                }else {
                    qian=""+destRow;
                }
                if (destCol<10){hou="0"+destCol;
                }else {
                    hou=""+destCol;
                }
                setInteresting(204);
                setJudge(qian+hou);
            }
            if (Integer.parseInt(getLv5().substring(0,2))==srcRow&&Integer.parseInt(getLv5().substring(2,4))==srcCol){
                if (destRow<10){
                    qian="0"+destRow;
                }else {
                    qian=""+destRow;
                }
                if (destCol<10){hou="0"+destCol;
                }else {
                    hou=""+destCol;
                }
                setInteresting(205);
                setJudge(qian+hou);
            }
            if (Integer.parseInt(getLv6().substring(0,2))==srcRow&&Integer.parseInt(getLv6().substring(2,4))==srcCol){
                if (destRow<10){
                    qian="0"+destRow;
                }else {
                    qian=""+destRow;
                }
                if (destCol<10){hou="0"+destCol;
                }else {
                    hou=""+destCol;
                }
                setInteresting(206);
                setJudge(qian+hou);
            }
            if (Integer.parseInt(getLv7().substring(0,2))==srcRow&&Integer.parseInt(getLv7().substring(2,4))==srcCol){
                if (destRow<10){
                    qian="0"+destRow;
                }else {
                    qian=""+destRow;
                }
                if (destCol<10){hou="0"+destCol;
                }else {
                    hou=""+destCol;
                }
                setInteresting(207);
                setJudge(qian+hou);
            }
            if (Integer.parseInt(getLv8().substring(0,2))==srcRow&&Integer.parseInt(getLv8().substring(2,4))==srcCol){
                if (destRow<10){
                    qian="0"+destRow;
                }else {
                    qian=""+destRow;
                }
                if (destCol<10){hou="0"+destCol;
                }else {
                    hou=""+destCol;
                }
                setInteresting(208);
                setJudge(qian+hou);
            }
            if (Integer.parseInt(getLv9().substring(0,2))==srcRow&&Integer.parseInt(getLv9().substring(2,4))==srcCol){
                if (destRow<10){
                    qian="0"+destRow;
                }else {
                    qian=""+destRow;
                }
                if (destCol<10){hou="0"+destCol;
                }else {
                    hou=""+destCol;
                }
                setInteresting(209);
                setJudge(qian+hou);
            }
            if (Integer.parseInt(getLv10().substring(0,2))==srcRow&&Integer.parseInt(getLv10().substring(2,4))==srcCol){
                if (destRow<10){
                    qian="0"+destRow;
                }else {
                    qian=""+destRow;
                }
                if (destCol<10){hou="0"+destCol;
                }else {
                    hou=""+destCol;
                }
                setInteresting(210);
                setJudge(qian+hou);
            }
            if (Integer.parseInt(getLv11().substring(0,2))==srcRow&&Integer.parseInt(getLv11().substring(2,4))==srcCol){
                if (destRow<10){
                    qian="0"+destRow;
                }else {
                    qian=""+destRow;
                }
                if (destCol<10){hou="0"+destCol;
                }else {
                    hou=""+destCol;
                }
                setInteresting(211);
                setJudge(qian+hou);
            }
            if (Integer.parseInt(getLv12().substring(0,2))==srcRow&&Integer.parseInt(getLv12().substring(2,4))==srcCol){
                if (destRow<10){
                    qian="0"+destRow;
                }else {
                    qian=""+destRow;
                }
                if (destCol<10){hou="0"+destCol;
                }else {
                    hou=""+destCol;
                }
                setInteresting(212);
                setJudge(qian+hou);
            }
            if (Integer.parseInt(getLv13().substring(0,2))==srcRow&&Integer.parseInt(getLv13().substring(2,4))==srcCol){
                if (destRow<10){
                    qian="0"+destRow;
                }else {
                    qian=""+destRow;
                }
                if (destCol<10){hou="0"+destCol;
                }else {
                    hou=""+destCol;
                }
                setInteresting(213);
                setJudge(qian+hou);
            }
            if (Integer.parseInt(getHuang1().substring(0,2))==srcRow&&Integer.parseInt(getHuang1().substring(2,4))==srcCol){
                if (destRow<10){
                    qian="0"+destRow;
                }else {
                    qian=""+destRow;
                }
                if (destCol<10){hou="0"+destCol;
                }else {
                    hou=""+destCol;
                }
                setInteresting(301);
                setJudge(qian+hou);
            }
            if (Integer.parseInt(getHuang2().substring(0,2))==srcRow&&Integer.parseInt(getHuang2().substring(2,4))==srcCol){
                if (destRow<10){
                    qian="0"+destRow;
                }else {
                    qian=""+destRow;
                }
                if (destCol<10){hou="0"+destCol;
                }else {
                    hou=""+destCol;
                }
                setInteresting(302);
                setJudge(qian+hou);
            }
            if (Integer.parseInt(getHuang3().substring(0,2))==srcRow&&Integer.parseInt(getHuang3().substring(2,4))==srcCol){
                if (destRow<10){
                    qian="0"+destRow;
                }else {
                    qian=""+destRow;
                }
                if (destCol<10){hou="0"+destCol;
                }else {
                    hou=""+destCol;
                }
                setInteresting(303);
                setJudge(qian+hou);
            }
            if (Integer.parseInt(getHuang4().substring(0,2))==srcRow&&Integer.parseInt(getHuang4().substring(2,4))==srcCol){
                if (destRow<10){
                    qian="0"+destRow;
                }else {
                    qian=""+destRow;
                }
                if (destCol<10){hou="0"+destCol;
                }else {
                    hou=""+destCol;
                }
                setInteresting(304);
                setJudge(qian+hou);
            }
            if (Integer.parseInt(getHuang5().substring(0,2))==srcRow&&Integer.parseInt(getHuang5().substring(2,4))==srcCol){
                if (destRow<10){
                    qian="0"+destRow;
                }else {
                    qian=""+destRow;
                }
                if (destCol<10){hou="0"+destCol;
                }else {
                    hou=""+destCol;
                }
                setInteresting(305);
                setJudge(qian+hou);
            }
            if (Integer.parseInt(getHuang6().substring(0,2))==srcRow&&Integer.parseInt(getHuang6().substring(2,4))==srcCol){
                if (destRow<10){
                    qian="0"+destRow;
                }else {
                    qian=""+destRow;
                }
                if (destCol<10){hou="0"+destCol;
                }else {
                    hou=""+destCol;
                }
                setInteresting(306);
                setJudge(qian+hou);
            }
            if (Integer.parseInt(getHuang7().substring(0,2))==srcRow&&Integer.parseInt(getHuang7().substring(2,4))==srcCol){
                if (destRow<10){
                    qian="0"+destRow;
                }else {
                    qian=""+destRow;
                }
                if (destCol<10){hou="0"+destCol;
                }else {
                    hou=""+destCol;
                }
                setInteresting(307);
                setJudge(qian+hou);
            }
            if (Integer.parseInt(getHuang8().substring(0,2))==srcRow&&Integer.parseInt(getHuang8().substring(2,4))==srcCol){
                if (destRow<10){
                    qian="0"+destRow;
                }else {
                    qian=""+destRow;
                }
                if (destCol<10){hou="0"+destCol;
                }else {
                    hou=""+destCol;
                }
                setInteresting(308);
                setJudge(qian+hou);
            }
            if (Integer.parseInt(getHuang9().substring(0,2))==srcRow&&Integer.parseInt(getHuang9().substring(2,4))==srcCol){
                if (destRow<10){
                    qian="0"+destRow;
                }else {
                    qian=""+destRow;
                }
                if (destCol<10){hou="0"+destCol;
                }else {
                    hou=""+destCol;
                }
                setInteresting(309);
                setJudge(qian+hou);
            }
            if (Integer.parseInt(getHuang10().substring(0,2))==srcRow&&Integer.parseInt(getHuang10().substring(2,4))==srcCol){
                if (destRow<10){
                    qian="0"+destRow;
                }else {
                    qian=""+destRow;
                }
                if (destCol<10){hou="0"+destCol;
                }else {
                    hou=""+destCol;
                }
                setInteresting(310);
                setJudge(qian+hou);
            }
            if (Integer.parseInt(getHuang11().substring(0,2))==srcRow&&Integer.parseInt(getHuang11().substring(2,4))==srcCol){
                if (destRow<10){
                    qian="0"+destRow;
                }else {
                    qian=""+destRow;
                }
                if (destCol<10){hou="0"+destCol;
                }else {
                    hou=""+destCol;
                }
                setInteresting(311);
                setJudge(qian+hou);
            }
            if (Integer.parseInt(getHuang12().substring(0,2))==srcRow&&Integer.parseInt(getHuang12().substring(2,4))==srcCol){
                if (destRow<10){
                    qian="0"+destRow;
                }else {
                    qian=""+destRow;
                }
                if (destCol<10){hou="0"+destCol;
                }else {
                    hou=""+destCol;
                }
                setInteresting(312);
                setJudge(qian+hou);
            }
            if (Integer.parseInt(getHuang13().substring(0,2))==srcRow&&Integer.parseInt(getHuang13().substring(2,4))==srcCol){
                if (destRow<10){
                    qian="0"+destRow;
                }else {
                    qian=""+destRow;
                }
                if (destCol<10){hou="0"+destCol;
                }else {
                    hou=""+destCol;
                }
                setInteresting(313);
                setJudge(qian+hou);
            }
            if (Integer.parseInt(getLan1().substring(0,2))==srcRow&&Integer.parseInt(getLan1().substring(2,4))==srcCol){
                if (destRow<10){
                    qian="0"+destRow;
                }else {
                    qian=""+destRow;
                }
                if (destCol<10){hou="0"+destCol;
                }else {
                    hou=""+destCol;
                }
                setInteresting(401);
                setJudge(qian+hou);
            }
            if (Integer.parseInt(getLan2().substring(0,2))==srcRow&&Integer.parseInt(getLan2().substring(2,4))==srcCol){
                if (destRow<10){
                    qian="0"+destRow;
                }else {
                    qian=""+destRow;
                }
                if (destCol<10){hou="0"+destCol;
                }else {
                    hou=""+destCol;
                }
                setInteresting(402);
                setJudge(qian+hou);
            }
            if (Integer.parseInt(getLan3().substring(0,2))==srcRow&&Integer.parseInt(getLan3().substring(2,4))==srcCol){
                if (destRow<10){
                    qian="0"+destRow;
                }else {
                    qian=""+destRow;
                }
                if (destCol<10){hou="0"+destCol;
                }else {
                    hou=""+destCol;
                }
                setInteresting(403);
                setJudge(qian+hou);
            }
            if (Integer.parseInt(getLan4().substring(0,2))==srcRow&&Integer.parseInt(getLan4().substring(2,4))==srcCol){
                if (destRow<10){
                    qian="0"+destRow;
                }else {
                    qian=""+destRow;
                }
                if (destCol<10){hou="0"+destCol;
                }else {
                    hou=""+destCol;
                }
                setInteresting(404);
                setJudge(qian+hou);
            }
            if (Integer.parseInt(getLan5().substring(0,2))==srcRow&&Integer.parseInt(getLan5().substring(2,4))==srcCol){
                if (destRow<10){
                    qian="0"+destRow;
                }else {
                    qian=""+destRow;
                }
                if (destCol<10){hou="0"+destCol;
                }else {
                    hou=""+destCol;
                }
                setInteresting(405);
                setJudge(qian+hou);
            }
            if (Integer.parseInt(getLan6().substring(0,2))==srcRow&&Integer.parseInt(getLan6().substring(2,4))==srcCol){
                if (destRow<10){
                    qian="0"+destRow;
                }else {
                    qian=""+destRow;
                }
                if (destCol<10){hou="0"+destCol;
                }else {
                    hou=""+destCol;
                }
                setInteresting(406);
                setJudge(qian+hou);
            }
            if (Integer.parseInt(getLan7().substring(0,2))==srcRow&&Integer.parseInt(getLan7().substring(2,4))==srcCol){
                if (destRow<10){
                    qian="0"+destRow;
                }else {
                    qian=""+destRow;
                }
                if (destCol<10){hou="0"+destCol;
                }else {
                    hou=""+destCol;
                }
                setInteresting(407);
                setJudge(qian+hou);
            }
            if (Integer.parseInt(getLan8().substring(0,2))==srcRow&&Integer.parseInt(getLan8().substring(2,4))==srcCol){
                if (destRow<10){
                    qian="0"+destRow;
                }else {
                    qian=""+destRow;
                }
                if (destCol<10){hou="0"+destCol;
                }else {
                    hou=""+destCol;
                }
                setInteresting(408);
                setJudge(qian+hou);
            }
            if (Integer.parseInt(getLan9().substring(0,2))==srcRow&&Integer.parseInt(getLan9().substring(2,4))==srcCol){
                if (destRow<10){
                    qian="0"+destRow;
                }else {
                    qian=""+destRow;
                }
                if (destCol<10){hou="0"+destCol;
                }else {
                    hou=""+destCol;
                }
                setInteresting(409);
                setJudge(qian+hou);
            }
            if (Integer.parseInt(getLan10().substring(0,2))==srcRow&&Integer.parseInt(getLan10().substring(2,4))==srcCol){
                if (destRow<10){
                    qian="0"+destRow;
                }else {
                    qian=""+destRow;
                }
                if (destCol<10){hou="0"+destCol;
                }else {
                    hou=""+destCol;
                }
                setInteresting(410);
                setJudge(qian+hou);
            }
            if (Integer.parseInt(getLan11().substring(0,2))==srcRow&&Integer.parseInt(getLan11().substring(2,4))==srcCol){
                if (destRow<10){
                    qian="0"+destRow;
                }else {
                    qian=""+destRow;
                }
                if (destCol<10){hou="0"+destCol;
                }else {
                    hou=""+destCol;
                }
                setInteresting(411);
                setJudge(qian+hou);
            }
            //System.out.print("aaaaa"+getLan26());
            if (Integer.parseInt(getLan26().substring(0,2))==srcRow&&Integer.parseInt(getLan26().substring(2,4))==srcCol){
                if (destRow<10){
                    qian="0"+destRow;
                }else {
                    qian=""+destRow;
                }
                if (destCol<10){hou="0"+destCol;
                }else {
                    hou=""+destCol;
                }
                setInteresting(412);
                setJudge(qian+hou);
            }
            if (Integer.parseInt(getLan13().substring(0,2))==srcRow&&Integer.parseInt(getLan13().substring(2,4))==srcCol){
                if (destRow<10){
                    qian="0"+destRow;
                }else {
                    qian=""+destRow;
                }
                if (destCol<10){hou="0"+destCol;
                }else {
                    hou=""+destCol;
                }
                setInteresting(413);
                setJudge(qian+hou);
            }}







            setNextMove(0);
            return 0;
        }
        //System.out.println("Abcc");
        return -1;
    }

    @Override
    public void registerListener(GameListener listener) {
        listenerList.add(listener);
    }

    @Override
    public void unregisterListener(GameListener listener) {
        listenerList.remove(listener);
    }

    public void winning(){//这个方法每次走棋都会被调用两次，我也不知道为什么。未来该方法可能需要变为void
        ChessBoardLocation green01=new ChessBoardLocation(0,0);
        ChessBoardLocation green02=new ChessBoardLocation(0,1);
        ChessBoardLocation green03=new ChessBoardLocation(0,2);
        ChessBoardLocation green04=new ChessBoardLocation(0,3);
        ChessBoardLocation green05=new ChessBoardLocation(1,0);
        ChessBoardLocation green06=new ChessBoardLocation(1,1);
        ChessBoardLocation green07=new ChessBoardLocation(1,2);
        ChessBoardLocation green08=new ChessBoardLocation(1,3);
        ChessBoardLocation green09=new ChessBoardLocation(2,0);
        ChessBoardLocation green10=new ChessBoardLocation(2,1);
        ChessBoardLocation green11=new ChessBoardLocation(2,2);
        ChessBoardLocation green12=new ChessBoardLocation(3,0);
        ChessBoardLocation green13=new ChessBoardLocation(3,1);
        ChessBoardLocation green14=new ChessBoardLocation(4,0);
        ChessBoardLocation green15=new ChessBoardLocation(4,1);
        ChessBoardLocation green16=new ChessBoardLocation(3,2);
        ChessBoardLocation green17=new ChessBoardLocation(2,3);
        ChessBoardLocation green18=new ChessBoardLocation(0,4);
        ChessBoardLocation green19=new ChessBoardLocation(1,4);
        ChessBoardLocation red01=new ChessBoardLocation(15,15);
        ChessBoardLocation red02=new ChessBoardLocation(15,14);
        ChessBoardLocation red03=new ChessBoardLocation(14,15);
        ChessBoardLocation red04=new ChessBoardLocation(14,14);
        ChessBoardLocation red05=new ChessBoardLocation(15,13);
        ChessBoardLocation red06=new ChessBoardLocation(13,15);
        ChessBoardLocation red07=new ChessBoardLocation(12,15);//曾经更改过，现在改过来了
        ChessBoardLocation red08=new ChessBoardLocation(13,14);
        ChessBoardLocation red09=new ChessBoardLocation(14,13);
        ChessBoardLocation red10=new ChessBoardLocation(15,12);
        ChessBoardLocation red11=new ChessBoardLocation(12,14);
        ChessBoardLocation red12=new ChessBoardLocation(13,13);
        ChessBoardLocation red13=new ChessBoardLocation(14,12);
        ChessBoardLocation red14=new ChessBoardLocation(15,11);
        ChessBoardLocation red15=new ChessBoardLocation(14,11);
        ChessBoardLocation red16=new ChessBoardLocation(13,12);
        ChessBoardLocation red17=new ChessBoardLocation(12,13);
        ChessBoardLocation red18=new ChessBoardLocation(11,15);
        ChessBoardLocation red19=new ChessBoardLocation(11,14);

        ChessBoardLocation yellow01=new ChessBoardLocation(15,1);
        ChessBoardLocation yellow02=new ChessBoardLocation(15,0);
        ChessBoardLocation yellow03=new ChessBoardLocation(14,0);
        ChessBoardLocation yellow04=new ChessBoardLocation(14,1);
        ChessBoardLocation yellow05=new ChessBoardLocation(15,2);
        ChessBoardLocation yellow06=new ChessBoardLocation(13,0);
        ChessBoardLocation yellow07=new ChessBoardLocation(12,0);
        ChessBoardLocation yellow08=new ChessBoardLocation(13,1);
        ChessBoardLocation yellow09=new ChessBoardLocation(14,2);
        ChessBoardLocation yellow10=new ChessBoardLocation(15,3);
        ChessBoardLocation yellow11=new ChessBoardLocation(12,1);
        ChessBoardLocation yellow12=new ChessBoardLocation(13,2);
        ChessBoardLocation yellow13=new ChessBoardLocation(14,3);
        ChessBoardLocation blue01=new ChessBoardLocation(0,15);
        ChessBoardLocation blue02=new ChessBoardLocation(0,14);
        ChessBoardLocation blue03=new ChessBoardLocation(1,15);
        ChessBoardLocation blue04=new ChessBoardLocation(1,14);
        ChessBoardLocation blue05=new ChessBoardLocation(0,13);
        ChessBoardLocation blue06=new ChessBoardLocation(2,15);
        ChessBoardLocation blue07=new ChessBoardLocation(3,15);
        ChessBoardLocation blue08=new ChessBoardLocation(2,14);
        ChessBoardLocation blue09=new ChessBoardLocation(1,13);
        ChessBoardLocation blue10=new ChessBoardLocation(0,12);
        ChessBoardLocation blue11=new ChessBoardLocation(3,14);
        ChessBoardLocation blue12=new ChessBoardLocation(2,13);
        ChessBoardLocation blue13=new ChessBoardLocation(1,12);




        if (getChessPieceAt(green01)!=null&&getChessPieceAt(green02)!=null&&
                getChessPieceAt(green03)!=null&&getChessPieceAt(green04)!=null&&
                getChessPieceAt(green05)!=null&&getChessPieceAt(green06)!=null&&
                getChessPieceAt(green07)!=null&&getChessPieceAt(green08)!=null&&
                getChessPieceAt(green09)!=null&&getChessPieceAt(green10)!=null&&
                getChessPieceAt(green11)!=null&&getChessPieceAt(green12)!=null&&
                getChessPieceAt(green13)!=null&&numbers==1){
            ChessPiece green_1= grid[0][0].getPiece();
            setGreen1(green_1);
            ChessPiece green_2=grid[0][1].getPiece();
            setGreen2(green_2);
            ChessPiece green_3=grid[1][0].getPiece();
            setGreen3(green_3);
            ChessPiece green_4=grid[1][1].getPiece();
            setGreen4(green_4);
            ChessPiece green_5=grid[0][2].getPiece();
            setGreen5(green_5);
            ChessPiece green_6=grid[2][0].getPiece();
            setGreen6(green_6);
            ChessPiece green_7=grid[3][0].getPiece();
            setGreen7(green_7);
            ChessPiece green_8=grid[2][1].getPiece();
            setGreen8(green_8);
            ChessPiece green_9=grid[1][2].getPiece();
            setGreen9(green_9);
            ChessPiece green_10=grid[0][3].getPiece();
            setGreen10(green_10);
            ChessPiece green_11=grid[3][1].getPiece();
            setGreen11(green_11);
            ChessPiece green_12=grid[2][2].getPiece();
            setGreen12(green_12);
            ChessPiece green_13=grid[1][3].getPiece();
            setGreen13(green_13);
        }//这是四人局绿色胜利判定
        if (getChessPieceAt(red01)!=null&&getChessPieceAt(red02)!=null&&
                getChessPieceAt(red03)!=null&&getChessPieceAt(red04)!=null&&
                getChessPieceAt(red05)!=null&&getChessPieceAt(red06)!=null&&
                getChessPieceAt(red07)!=null&&getChessPieceAt(red08)!=null&&
                getChessPieceAt(red09)!=null&&getChessPieceAt(red10)!=null&&
                getChessPieceAt(red11)!=null&&getChessPieceAt(red12)!=null&&
                getChessPieceAt(red13)!=null&&numbers==1){
            ChessPiece red_1=grid[dimension - 1][dimension - 1].getPiece();
            setRed1(red_1);
            ChessPiece red_2=grid[dimension - 1][dimension - 2].getPiece();
            setRed2(red_2);
            ChessPiece red_3=grid[dimension - 2][dimension - 1].getPiece();
            setRed3(red_3);
            ChessPiece red_4=grid[dimension-2][dimension-2].getPiece();
            setRed4(red_4);
            ChessPiece red_5=grid[dimension-1][dimension-3].getPiece();
            setRed5(red_5);
            ChessPiece red_6=grid[dimension-3][dimension-1].getPiece();
            setRed6(red_6);
            ChessPiece red_7=grid[dimension-4][dimension-1].getPiece();//曾经更改过，现在改过来了
            setRed7(red_7);
            ChessPiece red_8=grid[dimension-3][dimension-2].getPiece();
            setRed8(red_8);
            ChessPiece red_9=grid[dimension-2][dimension-3].getPiece();
            setRed9(red_9);
            ChessPiece red_10=grid[dimension-1][dimension-4].getPiece();
            setRed10(red_10);
            ChessPiece red_11=grid[dimension-4][dimension-2].getPiece();
            setRed11(red_11);
            ChessPiece red_12=grid[dimension-3][dimension-3].getPiece();
            setRed12(red_12);
            ChessPiece red_13=grid[dimension-2][dimension-4].getPiece();
            setRed13(red_13);
        }//这是四人局红色胜利的判定

        if (getChessPieceAt(yellow01)!=null&&getChessPieceAt(yellow02)!=null&&
                getChessPieceAt(yellow03)!=null&&getChessPieceAt(yellow04)!=null&&
                getChessPieceAt(yellow05)!=null&&getChessPieceAt(yellow06)!=null&&
                getChessPieceAt(yellow07)!=null&&getChessPieceAt(yellow08)!=null&&
                getChessPieceAt(yellow09)!=null&&getChessPieceAt(yellow10)!=null&&
                getChessPieceAt(yellow11)!=null&&getChessPieceAt(yellow12)!=null&&
                getChessPieceAt(yellow13)!=null&&numbers==1){
            ChessPiece yellow_1=grid[dimension - 1][1].getPiece();
            setYellow1(yellow_1);
            ChessPiece yellow_2=grid[dimension - 1][0].getPiece();
            setYellow2(yellow_2);
            ChessPiece yellow_3=grid[dimension - 2][0].getPiece();
            setYellow3(yellow_3);
            ChessPiece yellow_4=grid[dimension-2][1].getPiece();
            setYellow4(yellow_4);
            ChessPiece yellow_5=grid[dimension-1][2].getPiece();
            setYellow5(yellow_5);
            ChessPiece yellow_6=grid[dimension-3][0].getPiece();
            setYellow6(yellow_6);
            ChessPiece yellow_7=grid[dimension-4][0].getPiece();
            setYellow7(yellow_7);
            ChessPiece yellow_8=grid[dimension-3][1].getPiece();
            setYellow8(yellow_8);
            ChessPiece yellow_9=grid[dimension-2][2].getPiece();
            setYellow9(yellow_9);
            ChessPiece yellow_10=grid[dimension-1][3].getPiece();
            setYellow10(yellow_10);
            ChessPiece yellow_11=grid[dimension-4][1].getPiece();
            setYellow11(yellow_11);
            ChessPiece yellow_12=grid[dimension-3][2].getPiece();
            setYellow12(yellow_12);
            ChessPiece yellow_13=grid[dimension-2][3].getPiece();
            setYellow13(yellow_13);
        }//这是四人局黄色胜利的判定

        if (getChessPieceAt(blue01)!=null&&getChessPieceAt(blue02)!=null&&
                getChessPieceAt(blue03)!=null&&getChessPieceAt(blue04)!=null&&
                getChessPieceAt(blue05)!=null&&getChessPieceAt(blue06)!=null&&
                getChessPieceAt(blue07)!=null&&getChessPieceAt(blue08)!=null&&
                getChessPieceAt(blue09)!=null&&getChessPieceAt(blue10)!=null&&
                getChessPieceAt(blue11)!=null&&getChessPieceAt(blue12)!=null&&
                getChessPieceAt(blue13)!=null&&numbers==1){
            ChessPiece blue_1=grid[0][dimension - 1].getPiece();
            setBlue1(blue_1);
            ChessPiece blue_2=grid[0][dimension - 2].getPiece();
            setBlue2(blue_2);
            ChessPiece blue_3=grid[1][dimension - 1].getPiece();
            setBlue3(blue_3);
            ChessPiece blue_4=grid[1][dimension-2].getPiece();
            setBlue4(blue_4);
            ChessPiece blue_5=grid[0][dimension-3].getPiece();
            setBlue5(blue_5);
            ChessPiece blue_6=grid[2][dimension-1].getPiece();
            setBlue6(blue_6);
            ChessPiece blue_7=grid[3][dimension-1].getPiece();
            setBlue7(blue_7);
            ChessPiece blue_8=grid[2][dimension-2].getPiece();
            setBlue8(blue_8);
            ChessPiece blue_9=grid[1][dimension-3].getPiece();
            setBlue9(blue_9);
            ChessPiece blue_10=grid[0][dimension-4].getPiece();
            setBlue10(blue_10);
            ChessPiece blue_11=grid[3][dimension-2].getPiece();
            setBlue11(blue_11);
            ChessPiece blue_12=grid[2][dimension-3].getPiece();
            setBlue12(blue_12);
            ChessPiece blue_13=grid[1][dimension-4].getPiece();
            setBlue13(blue_13);
        }//这是四人局蓝色胜利的判定

        if (getChessPieceAt(green01)!=null&&getChessPieceAt(green02)!=null&&
                getChessPieceAt(green03)!=null&&getChessPieceAt(green04)!=null&&
                getChessPieceAt(green05)!=null&&getChessPieceAt(green06)!=null&&
                getChessPieceAt(green07)!=null&&getChessPieceAt(green08)!=null&&
                getChessPieceAt(green09)!=null&&getChessPieceAt(green10)!=null&&
                getChessPieceAt(green11)!=null&&getChessPieceAt(green12)!=null&&
                getChessPieceAt(green13)!=null&&numbers==0&&getChessPieceAt(green14)!=null&&
                getChessPieceAt(green15)!=null&&getChessPieceAt(green16)!=null&&
                getChessPieceAt(green17)!=null&&getChessPieceAt(green18)!=null&&
                getChessPieceAt(green19)!=null&&numbers==0){
            ChessPiece green_1= grid[0][0].getPiece();
            setGreen1(green_1);
            ChessPiece green_2=grid[0][1].getPiece();
            setGreen2(green_2);
            ChessPiece green_3=grid[1][0].getPiece();
            setGreen3(green_3);
            ChessPiece green_4=grid[1][1].getPiece();
            setGreen4(green_4);
            ChessPiece green_5=grid[0][2].getPiece();
            setGreen5(green_5);
            ChessPiece green_6=grid[2][0].getPiece();
            setGreen6(green_6);
            ChessPiece green_7=grid[3][0].getPiece();
            setGreen7(green_7);
            ChessPiece green_8=grid[2][1].getPiece();
            setGreen8(green_8);
            ChessPiece green_9=grid[1][2].getPiece();
            setGreen9(green_9);
            ChessPiece green_10=grid[0][3].getPiece();
            setGreen10(green_10);
            ChessPiece green_11=grid[3][1].getPiece();
            setGreen11(green_11);
            ChessPiece green_12=grid[2][2].getPiece();
            setGreen12(green_12);
            ChessPiece green_13=grid[1][3].getPiece();
            setGreen13(green_13);
            ChessPiece green_14=grid[4][0].getPiece();
            setGreen14(green_14);
            ChessPiece green_15=grid[4][1].getPiece();
            setGreen15(green_15);
            ChessPiece green_16=grid[3][2].getPiece();
            setGreen16(green_16);
            ChessPiece green_17=grid[2][3].getPiece();
            setGreen17(green_17);
            ChessPiece green_18=grid[0][4].getPiece();
            setGreen18(green_18);
            ChessPiece green_19=grid[1][4].getPiece();
            setGreen19(green_19);

        }//这是二人局绿色胜利判定
        if (getChessPieceAt(red01)!=null&&getChessPieceAt(red02)!=null&&
                getChessPieceAt(red03)!=null&&getChessPieceAt(red04)!=null&&
                getChessPieceAt(red05)!=null&&getChessPieceAt(red06)!=null&&
                getChessPieceAt(red07)!=null&&getChessPieceAt(red08)!=null&&
                getChessPieceAt(red09)!=null&&getChessPieceAt(red10)!=null&&
                getChessPieceAt(red11)!=null&&getChessPieceAt(red12)!=null&&
                getChessPieceAt(red13)!=null&&numbers==0&&getChessPieceAt(red14)!=null&&
                getChessPieceAt(red15)!=null&&getChessPieceAt(red16)!=null&&
                getChessPieceAt(red17)!=null&&getChessPieceAt(red18)!=null&&
                getChessPieceAt(red19)!=null&&numbers==0){
            ChessPiece red_1=grid[dimension - 1][dimension - 1].getPiece();
            setRed1(red_1);
            ChessPiece red_2=grid[dimension - 1][dimension - 2].getPiece();
            setRed2(red_2);
            ChessPiece red_3=grid[dimension - 2][dimension - 1].getPiece();
            setRed3(red_3);
            ChessPiece red_4=grid[dimension-2][dimension-2].getPiece();
            setRed4(red_4);
            ChessPiece red_5=grid[dimension-1][dimension-3].getPiece();
            setRed5(red_5);
            ChessPiece red_6=grid[dimension-3][dimension-1].getPiece();
            setRed6(red_6);
            ChessPiece red_7=grid[dimension-4][dimension-1].getPiece();
            setRed7(red_7);
            ChessPiece red_8=grid[dimension-3][dimension-2].getPiece();
            setRed8(red_8);
            ChessPiece red_9=grid[dimension-2][dimension-3].getPiece();
            setRed9(red_9);
            ChessPiece red_10=grid[dimension-1][dimension-4].getPiece();
            setRed10(red_10);
            ChessPiece red_11=grid[dimension-4][dimension-2].getPiece();
            setRed11(red_11);
            ChessPiece red_12=grid[dimension-3][dimension-3].getPiece();
            setRed12(red_12);
            ChessPiece red_13=grid[dimension-2][dimension-4].getPiece();
            setRed13(red_13);
            ChessPiece red_14=grid[dimension-1][dimension-5].getPiece();
            setRed14(red_14);
            ChessPiece red_15=grid[dimension-2][dimension-5].getPiece();
            setRed15(red_15);
            ChessPiece red_16=grid[dimension-3][dimension-4].getPiece();
            setRed16(red_16);
            ChessPiece red_17=grid[dimension-4][dimension-3].getPiece();
            setRed17(red_17);
            ChessPiece red_18=grid[dimension-5][dimension-1].getPiece();
            setRed18(red_18);
            ChessPiece red_19=grid[dimension-5][dimension-2].getPiece();
            setRed19(red_19);

        }//这是二人局红色胜利的判定
    }
    public int getNextMove() {
        return nextMove;
    }

    public int getTest() {
        return test;
    }

    public ChessPiece getGreen1() {
        return green1;
    }

    public ChessPiece getGreen2() {
        return green2;
    }

    public ChessPiece getGreen3() {
        return green3;
    }

    public ChessPiece getGreen4() {
        return green4;
    }

    public ChessPiece getGreen5() {
        return green5;
    }

    public ChessPiece getGreen6() {
        return green6;
    }

    public ChessPiece getGreen7() {
        return green7;
    }

    public ChessPiece getGreen8() {
        return green8;
    }

    public ChessPiece getGreen9() {
        return green9;
    }

    public ChessPiece getGreen10() {
        return green10;
    }

    public ChessPiece getGreen11() {
        return green11;
    }

    public ChessPiece getGreen12() {
        return green12;
    }

    public ChessPiece getGreen13() {
        return green13;
    }

    public ChessPiece getGreen14() {
        return green14;
    }

    public ChessPiece getGreen15() {
        return green15;
    }

    public ChessPiece getGreen16() {
        return green16;
    }

    public ChessPiece getGreen17() {
        return green17;
    }

    public ChessPiece getGreen18() {
        return green18;
    }

    public ChessPiece getGreen19() {
        return green19;
    }

    public ChessPiece getRed1() {
        return red1;
    }

    public ChessPiece getRed2() {
        return red2;
    }

    public ChessPiece getRed3() {
        return red3;
    }

    public ChessPiece getRed4() {
        return red4;
    }

    public ChessPiece getRed5() {
        return red5;
    }

    public ChessPiece getRed6() {
        return red6;
    }

    public ChessPiece getRed7() {
        return red7;
    }

    public ChessPiece getRed8() {
        return red8;
    }

    public ChessPiece getRed9() {
        return red9;
    }

    public ChessPiece getRed10() {
        return red10;
    }

    public ChessPiece getRed11() {
        return red11;
    }

    public ChessPiece getRed12() {
        return red12;
    }

    public ChessPiece getRed13() {
        return red13;
    }

    public ChessPiece getRed14() {
        return red14;
    }

    public ChessPiece getRed15() {
        return red15;
    }

    public ChessPiece getRed16() {
        return red16;
    }

    public ChessPiece getRed17() {
        return red17;
    }

    public ChessPiece getRed18() {
        return red18;
    }

    public ChessPiece getRed19() {
        return red19;
    }

    public ChessPiece getYellow1() {
        return yellow1;
    }

    public ChessPiece getYellow2() {
        return yellow2;
    }

    public ChessPiece getYellow3() {
        return yellow3;
    }

    public ChessPiece getYellow4() {
        return yellow4;
    }

    public ChessPiece getYellow5() {
        return yellow5;
    }

    public ChessPiece getYellow6() {
        return yellow6;
    }

    public ChessPiece getYellow7() {
        return yellow7;
    }

    public ChessPiece getYellow8() {
        return yellow8;
    }

    public ChessPiece getYellow9() {
        return yellow9;
    }

    public ChessPiece getYellow10() {
        return yellow10;
    }

    public ChessPiece getYellow11() {
        return yellow11;
    }

    public ChessPiece getYellow12() {
        return yellow12;
    }

    public ChessPiece getYellow13() {
        return yellow13;
    }

    public ChessPiece getBlue1() {
        return blue1;
    }

    public ChessPiece getBlue2() {
        return blue2;
    }

    public ChessPiece getBlue3() {
        return blue3;
    }

    public ChessPiece getBlue4() {
        return blue4;
    }

    public ChessPiece getBlue5() {
        return blue5;
    }

    public ChessPiece getBlue6() {
        return blue6;
    }

    public ChessPiece getBlue7() {
        return blue7;
    }

    public ChessPiece getBlue8() {
        return blue8;
    }

    public ChessPiece getBlue9() {
        return blue9;
    }

    public ChessPiece getBlue10() {
        return blue10;
    }

    public ChessPiece getBlue11() {
        return blue11;
    }

    public ChessPiece getBlue12() {
        return blue12;
    }

    public ChessPiece getBlue13() {
        return blue13;
    }

    public int getNumbers() {
        return numbers;
    }

    public ChessPiece getRule() {
        return rule;
    }

    public String getHong1() {
        return hong1;
    }

    public String getLv1() {
        return lv1;
    }

    public String getLan1() {
        return lan1;
    }

    public String getHuang1() {
        return huang1;
    }

    public String getHong2() {
        return hong2;
    }

    public String getLv2() {
        return lv2;
    }

    public String getLan2() {
        return lan2;
    }

    public String getHuang2() {
        return huang2;
    }

    public String getHong3() {
        return hong3;
    }

    public String getLv3() {
        return lv3;
    }

    public String getLan3() {
        return lan3;
    }

    public String getHuang3() {
        return huang3;
    }

    public String getHong4() {
        return hong4;
    }

    public String getLv4() {
        return lv4;
    }

    public String getLan4() {
        return lan4;
    }

    public String getHuang4() {
        return huang4;
    }

    public String getHong5() {
        return hong5;
    }

    public String getLv5() {
        return lv5;
    }

    public String getLan5() {
        return lan5;
    }

    public String getHuang5() {
        return huang5;
    }

    public String getHong6() {
        return hong6;
    }

    public String getLv6() {
        return lv6;
    }

    public String getLan6() {
        return lan6;
    }

    public String getHuang6() {
        return huang6;
    }

    public String getHong7() {
        return hong7;
    }

    public String getLv7() {
        return lv7;
    }

    public String getLan7() {
        return lan7;
    }

    public String getHuang7() {
        return huang7;
    }

    public String getHong8() {
        return hong8;
    }

    public String getLv8() {
        return lv8;
    }

    public String getLan8() {
        return lan8;
    }

    public String getHuang8() {
        return huang8;
    }

    public String getHong9() {
        return hong9;
    }

    public String getLv9() {
        return lv9;
    }

    public String getLan9() {
        return lan9;
    }

    public String getHuang9() {
        return huang9;
    }

    public String getHong10() {
        return hong10;
    }

    public String getLv10() {
        return lv10;
    }

    public String getLan10() {
        return lan10;
    }

    public String getHuang10() {
        return huang10;
    }

    public String getHong11() {
        return hong11;
    }

    public String getLv11() {
        return lv11;
    }

    public String getLan11() {
        return lan11;
    }

    public String getHuang11() {
        return huang11;
    }

    public String getHong12() {
        return hong12;
    }

    public String getLv12() {
        return lv12;
    }

    public String getLan26() {
        return lan26;
    }

    public String getHuang12() {
        return huang12;
    }

    public String getHong13() {
        return hong13;
    }

    public String getLv13() {
        return lv13;
    }

    public String getLan13() {
        return lan13;
    }

    public String getHuang13() {
        return huang13;
    }

    public String getHong14() {
        return hong14;
    }

    public String getLv14() {
        return lv14;
    }

    public String getHong15() {
        return hong15;
    }

    public String getLv15() {
        return lv15;
    }

    public String getHong16() {
        return hong16;
    }

    public String getLv16() {
        return lv16;
    }

    public String getHong17() {
        return hong17;
    }

    public String getLv17() {
        return lv17;
    }

    public String getHong18() {
        return hong18;
    }

    public String getLv18() {
        return lv18;
    }

    public String getHong19() {
        return hong19;
    }

    public String getLv19() {
        return lv19;
    }

    public String getJudge() {
        return judge;
    }

    public int getInteresting() {
        return interesting;
    }

    public void setNextMove(int nextMove) {
        this.nextMove = nextMove;
    }

    public void setTest(int test) {
        this.test = test;
    }

    public void setGreen1(ChessPiece green1) {
        this.green1 = green1;
    }

    public void setGreen2(ChessPiece green2) {
        this.green2 = green2;
    }

    public void setGreen3(ChessPiece green3) {
        this.green3 = green3;
    }

    public void setGreen4(ChessPiece green4) {
        this.green4 = green4;
    }

    public void setGreen5(ChessPiece green5) {
        this.green5 = green5;
    }

    public void setGreen6(ChessPiece green6) {
        this.green6 = green6;
    }

    public void setGreen7(ChessPiece green7) {
        this.green7 = green7;
    }

    public void setGreen8(ChessPiece green8) {
        this.green8 = green8;
    }

    public void setGreen9(ChessPiece green9) {
        this.green9 = green9;
    }

    public void setGreen10(ChessPiece green10) {
        this.green10 = green10;
    }

    public void setGreen11(ChessPiece green11) {
        this.green11 = green11;
    }

    public void setGreen12(ChessPiece green12) {
        this.green12 = green12;
    }

    public void setGreen13(ChessPiece green13) {
        this.green13 = green13;
    }

    public void setGreen14(ChessPiece green14) {
        this.green14 = green14;
    }

    public void setGreen15(ChessPiece green15) {
        this.green15 = green15;
    }

    public void setGreen16(ChessPiece green16) {
        this.green16 = green16;
    }

    public void setGreen17(ChessPiece green17) {
        this.green17 = green17;
    }

    public void setGreen18(ChessPiece green18) {
        this.green18 = green18;
    }

    public void setGreen19(ChessPiece green19) {
        this.green19 = green19;
    }

    public void setRed1(ChessPiece red1) {
        this.red1 = red1;
    }

    public void setRed2(ChessPiece red2) {
        this.red2 = red2;
    }

    public void setRed3(ChessPiece red3) {
        this.red3 = red3;
    }

    public void setRed4(ChessPiece red4) {
        this.red4 = red4;
    }

    public void setRed5(ChessPiece red5) {
        this.red5 = red5;
    }

    public void setRed6(ChessPiece red6) {
        this.red6 = red6;
    }

    public void setRed7(ChessPiece red7) {
        this.red7 = red7;
    }

    public void setRed8(ChessPiece red8) {
        this.red8 = red8;
    }

    public void setRed9(ChessPiece red9) {
        this.red9 = red9;
    }

    public void setRed10(ChessPiece red10) {
        this.red10 = red10;
    }

    public void setRed11(ChessPiece red11) {
        this.red11 = red11;
    }

    public void setRed12(ChessPiece red12) {
        this.red12 = red12;
    }

    public void setRed13(ChessPiece red13) {
        this.red13 = red13;
    }

    public void setRed14(ChessPiece red14) {
        this.red14 = red14;
    }

    public void setRed15(ChessPiece red15) {
        this.red15 = red15;
    }

    public void setRed16(ChessPiece red16) {
        this.red16 = red16;
    }

    public void setRed17(ChessPiece red17) {
        this.red17 = red17;
    }

    public void setRed18(ChessPiece red18) {
        this.red18 = red18;
    }

    public void setRed19(ChessPiece red19) {
        this.red19 = red19;
    }

    public void setYellow1(ChessPiece yellow1) {
        this.yellow1 = yellow1;
    }

    public void setYellow2(ChessPiece yellow2) {
        this.yellow2 = yellow2;
    }

    public void setYellow3(ChessPiece yellow3) {
        this.yellow3 = yellow3;
    }

    public void setYellow4(ChessPiece yellow4) {
        this.yellow4 = yellow4;
    }

    public void setYellow5(ChessPiece yellow5) {
        this.yellow5 = yellow5;
    }

    public void setYellow6(ChessPiece yellow6) {
        this.yellow6 = yellow6;
    }

    public void setYellow7(ChessPiece yellow7) {
        this.yellow7 = yellow7;
    }

    public void setYellow8(ChessPiece yellow8) {
        this.yellow8 = yellow8;
    }

    public void setYellow9(ChessPiece yellow9) {
        this.yellow9 = yellow9;
    }

    public void setYellow10(ChessPiece yellow10) {
        this.yellow10 = yellow10;
    }

    public void setYellow11(ChessPiece yellow11) {
        this.yellow11 = yellow11;
    }

    public void setYellow12(ChessPiece yellow12) {
        this.yellow12 = yellow12;
    }

    public void setYellow13(ChessPiece yellow13) {
        this.yellow13 = yellow13;
    }

    public void setBlue1(ChessPiece blue1) {
        this.blue1 = blue1;
    }

    public void setBlue2(ChessPiece blue2) {
        this.blue2 = blue2;
    }

    public void setBlue3(ChessPiece blue3) {
        this.blue3 = blue3;
    }

    public void setBlue4(ChessPiece blue4) {
        this.blue4 = blue4;
    }

    public void setBlue5(ChessPiece blue5) {
        this.blue5 = blue5;
    }

    public void setBlue6(ChessPiece blue6) {
        this.blue6 = blue6;
    }

    public void setBlue7(ChessPiece blue7) {
        this.blue7 = blue7;
    }

    public void setBlue8(ChessPiece blue8) {
        this.blue8 = blue8;
    }

    public void setBlue9(ChessPiece blue9) {
        this.blue9 = blue9;
    }

    public void setBlue10(ChessPiece blue10) {
        this.blue10 = blue10;
    }

    public void setBlue11(ChessPiece blue11) {
        this.blue11 = blue11;
    }

    public void setBlue12(ChessPiece blue12) {
        this.blue12 = blue12;
    }

    public void setBlue13(ChessPiece blue13) {
        this.blue13 = blue13;
    }

    public void setNumbers(int numbers) {
        this.numbers = numbers;
    }

    public void setRule(ChessPiece rule) {
        this.rule = rule;
    }

    public void setHong1(String hong1) {
        this.hong1 = hong1;
    }

    public void setLv1(String lv1) {
        this.lv1 = lv1;
    }

    public void setLan1(String lan1) {
        this.lan1 = lan1;
    }

    public void setHuang1(String huang1) {
        this.huang1 = huang1;
    }

    public void setHong2(String hong2) {
        this.hong2 = hong2;
    }

    public void setLv2(String lv2) {
        this.lv2 = lv2;
    }

    public void setLan2(String lan2) {
        this.lan2 = lan2;
    }

    public void setHuang2(String huang2) {
        this.huang2 = huang2;
    }

    public void setHong3(String hong3) {
        this.hong3 = hong3;
    }

    public void setLv3(String lv3) {
        this.lv3 = lv3;
    }

    public void setLan3(String lan3) {
        this.lan3 = lan3;
    }

    public void setHuang3(String huang3) {
        this.huang3 = huang3;
    }

    public void setHong4(String hong4) {
        this.hong4 = hong4;
    }

    public void setLv4(String lv4) {
        this.lv4 = lv4;
    }

    public void setLan4(String lan4) {
        this.lan4 = lan4;
    }

    public void setHuang4(String huang4) {
        this.huang4 = huang4;
    }

    public void setHong5(String hong5) {
        this.hong5 = hong5;
    }

    public void setLv5(String lv5) {
        this.lv5 = lv5;
    }

    public void setLan5(String lan5) {
        this.lan5 = lan5;
    }

    public void setHuang5(String huang5) {
        this.huang5 = huang5;
    }

    public void setHong6(String hong6) {
        this.hong6 = hong6;
    }

    public void setLv6(String lv6) {
        this.lv6 = lv6;
    }

    public void setLan6(String lan6) {
        this.lan6 = lan6;
    }

    public void setHuang6(String huang6) {
        this.huang6 = huang6;
    }

    public void setHong7(String hong7) {
        this.hong7 = hong7;
    }

    public void setLv7(String lv7) {
        this.lv7 = lv7;
    }

    public void setLan7(String lan7) {
        this.lan7 = lan7;
    }

    public void setHuang7(String huang7) {
        this.huang7 = huang7;
    }

    public void setHong8(String hong8) {
        this.hong8 = hong8;
    }

    public void setLv8(String lv8) {
        this.lv8 = lv8;
    }

    public void setLan8(String lan8) {
        this.lan8 = lan8;
    }

    public void setHuang8(String huang8) {
        this.huang8 = huang8;
    }

    public void setHong9(String hong9) {
        this.hong9 = hong9;
    }

    public void setLv9(String lv9) {
        this.lv9 = lv9;
    }

    public void setLan9(String lan9) {
        this.lan9 = lan9;
    }

    public void setHuang9(String huang9) {
        this.huang9 = huang9;
    }

    public void setHong10(String hong10) {
        this.hong10 = hong10;
    }

    public void setLv10(String lv10) {
        this.lv10 = lv10;
    }

    public void setLan10(String lan10) {
        this.lan10 = lan10;
    }

    public void setHuang10(String huang10) {
        this.huang10 = huang10;
    }

    public void setHong11(String hong11) {
        this.hong11 = hong11;
    }

    public void setLv11(String lv11) {
        this.lv11 = lv11;
    }

    public void setLan11(String lan11) {
        this.lan11 = lan11;
    }

    public void setHuang11(String huang11) {
        this.huang11 = huang11;
    }

    public void setHong12(String hong12) {
        this.hong12 = hong12;
    }

    public void setLv12(String lv12) {
        this.lv12 = lv12;
    }

    public void setLan26(String lan26) {
        this.lan26 = lan26;
    }

    public void setHuang12(String huang12) {
        this.huang12 = huang12;
    }

    public void setHong13(String hong13) {
        this.hong13 = hong13;
    }

    public void setLv13(String lv13) {
        this.lv13 = lv13;
    }

    public void setLan13(String lan13) {
        this.lan13 = lan13;
    }

    public void setHuang13(String huang13) {
        this.huang13 = huang13;
    }

    public void setHong14(String hong14) {
        this.hong14 = hong14;
    }

    public void setLv14(String lv14) {
        this.lv14 = lv14;
    }

    public void setHong15(String hong15) {
        this.hong15 = hong15;
    }

    public void setLv15(String lv15) {
        this.lv15 = lv15;
    }

    public void setHong16(String hong16) {
        this.hong16 = hong16;
    }

    public void setLv16(String lv16) {
        this.lv16 = lv16;
    }

    public void setHong17(String hong17) {
        this.hong17 = hong17;
    }

    public void setLv17(String lv17) {
        this.lv17 = lv17;
    }

    public void setHong18(String hong18) {
        this.hong18 = hong18;
    }

    public void setLv18(String lv18) {
        this.lv18 = lv18;
    }

    public void setHong19(String hong19) {
        this.hong19 = hong19;
    }

    public void setLv19(String lv19) {
        this.lv19 = lv19;
    }

    public void setJudge(String judge) {
        this.judge = judge;
    }

    public void setInteresting(int interesting) {
        this.interesting = interesting;
    }
}