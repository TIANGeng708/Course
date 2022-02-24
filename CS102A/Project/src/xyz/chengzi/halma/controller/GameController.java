package xyz.chengzi.halma.controller;

//import org.graalvm.compiler.nodes.calc.IntegerDivRemNode;
import xyz.chengzi.halma.Erro;
import xyz.chengzi.halma.Halma;
import xyz.chengzi.halma.Open;
import xyz.chengzi.halma.Win;
import xyz.chengzi.halma.listener.InputListener;
import xyz.chengzi.halma.model.ChessBoard;
import xyz.chengzi.halma.model.ChessBoardLocation;
import xyz.chengzi.halma.model.ChessPiece;
import xyz.chengzi.halma.view.ChessBoardComponent;
import xyz.chengzi.halma.view.ChessComponent;
import xyz.chengzi.halma.view.GameFrame;
import xyz.chengzi.halma.view.SquareComponent;

import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class GameController implements InputListener {
    private ChessBoardComponent view;
    private ChessBoard model;
    private int a;
    private String b;
    private ChessBoardLocation selectedLocation;
    private Color currentPlayer;
    private JLabel jLable;
    private int Go;//新创建参数
    private ChessBoardLocation cancel;
    private ChessComponent abolish;
    private ChessBoardLocation cancelPiece;
    private ChessPiece selectPiece;
    private int mode;
    private static String text;
    private int nan0;
    private int nan1;
    private int nan2;
    private int nan3;
    private int nan4;
    private int nan5;
    private int nan6;
    private int nan7;
    private int nan8;
    private int nan9;
    private int nan10;
    private int nan11;
    private int nan12;
    private int nan13;
    private int nan14;
    private int nan15;
    private int bei0;
    private int bei1;
    private int bei2;
    private int bei3;
    private int bei4;
    private int bei5;
    private int bei6;
    private int bei7;
    private int bei8;
    private int bei9;
    private int bei10;
    private int bei11;
    private int bei12;
    private int bei13;
    private int bei14;
    private int bei15;

    public static String getText() {
        return text;
    }

    public static void setText(String text) {
        GameController.text = text;
    }

    public GameController(ChessBoardComponent chessBoardComponent, ChessBoard chessBoard, int Mode) {
        this.view = chessBoardComponent;
        this.model = chessBoard;
        if (Mode==0){
            setA(new Random().nextInt(2));
        }if (Mode==1){
            setA(new Random().nextInt(4));
        }
        if (Open.getMode()==1){
            //System.out.print("a");
            this.currentPlayer=Color.green;
        }
        if (Open.getMode()!=1) {
            if (getA() == 0) {
                this.currentPlayer = Color.red;
                setB("红方下棋");
            }
            if (getA() == 1) {
                this.currentPlayer = Color.green;
                setB("绿方下棋");
            }
            if (getA() == 2) {
                this.currentPlayer = Color.yellow;
                setB("黄方下棋");
            }
            if (getA() == 3) {
                this.currentPlayer = Color.blue;
                setB("蓝方下棋");
            }
        }
        //this.currentPlayer = Color.RED;
        view.registerListener(this);
        model.registerListener(view);
        model.placeInitialPieces(Mode);
        setGo(Mode);
        setText(toString(currentPlayer));
        model.setNumbers(Go);
        model.winning();
        winning();
    }
    public void reStart(int mode){
        next(1);change();
        model.placeInitialPieces(mode);//警告：无效参数！(其实我也不知道有没有效果了，大概有效吧）
        if (mode==0){
            setA(new Random().nextInt(2));
        }if (mode==1){
            setA(new Random().nextInt(4));
        }
        if (getA()==0){
            this.currentPlayer=Color.red;
        }if (getA()==1){
            this.currentPlayer=Color.green;
        }if (getA()==2){
            this.currentPlayer=Color.yellow;
        }if (getA()==3){
            this.currentPlayer=Color.blue;
        }
        //currentPlayer=Color.RED;
        setText(toString(currentPlayer));
        String text = GameController.getText();
        //System.out.println(text);
        JLabel statusLabel = new JLabel(text);
        statusLabel.setLocation(10, 660);
        statusLabel.setSize(200, 18);
        Font f1= new Font("宋体",Font.BOLD,18);
        statusLabel.setFont(f1);
        Halma.getMainFrame().remove(Halma.getMainFrame().getStatusLabela());
        int m = 0;
        int n = 0;
        if (n == m) {
            Halma.getMainFrame().setStatusLabela(statusLabel);
            Halma.getMainFrame().add(statusLabel);
            n++;
            Halma.getMainFrame().repaint();
        } else {
            Halma.getMainFrame().remove(statusLabel);
            Halma.getMainFrame().add(statusLabel);
            Halma.getMainFrame().repaint();
        }
        if (Open.getMode()==1){
            next(1);change();
        }
    }

    public ChessBoardLocation getSelectedLocation() {
        return selectedLocation;
    }

    public void setSelectedLocation(ChessBoardLocation location) {
        this.selectedLocation = location;
    }

    public void resetSelectedLocation() {
        setSelectedLocation(null);
    }

    public boolean hasSelectedLocation() {
        return selectedLocation != null;
    }

    public Color nextPlayer(int Mode) {
        if (Mode == 1) {
            //System.out.println("B");
            currentPlayer = currentPlayer == Color.RED ? Color.BLUE :
                    currentPlayer == Color.BLUE ? Color.GREEN :
                            currentPlayer == Color.GREEN ? Color.YELLOW : Color.RED;
        }
        if (Mode == -10) {
            currentPlayer = Color.red;
        }
        if (Mode == -20) {
            currentPlayer = Color.green;
        }
        if (Mode == -30) {
            currentPlayer = Color.yellow;
        }
        if (Mode == -40) {
            currentPlayer = Color.blue;
        }
        else if (Mode == 0) {

            //System.out.println("A");
            currentPlayer=currentPlayer==Color.red?Color.green:Color.red;
        }
        //System.out.println("刷新");
        setText(toString(currentPlayer));
        String text = GameController.getText();
        //System.out.println(text);
        JLabel statusLabel = new JLabel(text);
        statusLabel.setLocation(10, 660);
        statusLabel.setSize(200, 18);
        Font f1= new Font("宋体",Font.BOLD,18);
        statusLabel.setFont(f1);
        Halma.getMainFrame().remove(Halma.getMainFrame().getStatusLabela());
        int m = 0;
        int n = 0;
        if (n == m) {
            Halma.getMainFrame().setStatusLabela(statusLabel);
            Halma.getMainFrame().add(statusLabel);
            n++;
            Halma.getMainFrame().repaint();
        } else {
            Halma.getMainFrame().remove(statusLabel);
            Halma.getMainFrame().add(statusLabel);
            Halma.getMainFrame().repaint();
        }

        return currentPlayer;


    }

    public void setjLabel(JLabel jLabel){
        this.jLable=jLabel;
    }

    @Override
    public void onPlayerClickSquare(ChessBoardLocation location, SquareComponent component) {
        model.setNumbers(Go);
        model.winning();
        winning();
        if (hasSelectedLocation() && model.isValidMove(getSelectedLocation(), location,1)==0) {
            setCancelPiece(location);
            model.moveChessPiece(selectedLocation, location);
            resetSelectedLocation();
            if (Open.getMode()==2||Open.getMode()==4) {
                if (model.getNextMove() == 0) {
                    nextPlayer(getGo());
                }
            }if (Open.getMode()==1){
                model.winning();
                winning();
                ArrayList<ChessBoardLocation> ji=model.huodeqizi();
                for (int i=0;i<ji.size();i++){
                    ArrayList<ChessBoardLocation> po=huodeweizhi(ji.get(i));
                    if (po.size()==0){
                        if (po.size()!=1) {
                            if (getBei0()+getNan0()<2*16+1) {
                                ji.remove(i);
                                break;
                            }if (getBei1()+getNan1()<2*16+1) {
                                ji.remove(i);
                                break;
                            }if (getBei2()+getNan2()<2*16+1) {
                                ji.remove(i);
                                break;
                            }if (getBei3()+getNan3()<2*16+1) {
                                ji.remove(i);
                                break;
                            }if (getBei4()+getNan4()<2*16+1) {
                                ji.remove(i);
                                break;
                            }if (getBei5()+getNan5()<2*16+1) {
                                ji.remove(i);
                                break;
                            }if (getBei6()+getNan6()<2*16+1) {
                                ji.remove(i);
                                break;
                            }if (getBei7()+getNan7()<2*16+1) {
                                ji.remove(i);
                                break;
                            }if (getBei8()+getNan8()<2*16+1) {
                                ji.remove(i);
                                break;
                            }if (getBei9()+getNan9()<2*16+1) {
                                ji.remove(i);
                                break;
                            }if (getBei10()+getNan10()<2*16+1) {
                                ji.remove(i);
                                break;
                            }if (getBei11()+getNan11()<2*16+1) {
                                ji.remove(i);
                                break;
                            }if (getBei12()+getNan12()<2*16+1) {
                                ji.remove(i);
                                break;
                            }if (getBei13()+getNan13()<2*16+1) {
                                ji.remove(i);
                                break;
                            }if (getBei14()+getNan14()<2*16+1) {
                                ji.remove(i);
                                break;
                            }if (getBei15()+getNan15()<2*16+1) {
                                ji.remove(i);
                                break;
                            }
                        }
                    }
                    if (po.size()==1){
                        ji.remove(i);
                    }
                }
                int suijishu=new Random().nextInt(ji.size());
                ChessBoardLocation a=ji.get(suijishu);
                ArrayList<ChessBoardLocation> weizhi=huodeweizhi(a);
                int suijishu2=0;
                if (weizhi.size()!=1) {
                    int ab=weizhi.size()-1;
                    ab=Math.abs(ab);
                    suijishu2=new Random().nextInt(ab);
                }else {
                    int cd=weizhi.size();
                    cd=Math.abs(cd);
                    suijishu2=new Random().nextInt(cd);
                }
                int abs=0;
                abs=suijishu2;
                weizhi.get(Math.abs(abs));
                if (suijishu2!=0) {
                    model.moveChessPiece(a, weizhi.get(suijishu2+1));
                }else {
                    if (weizhi.size() != 1) {
                        model.moveChessPiece(a, weizhi.get(suijishu2+1));
                    }else {
                        model.moveChessPiece(a,weizhi.get(suijishu2));
                    }

                }
                currentPlayer=Color.green;
                next(1);change();
                next(1);change();
            }
            model.setNumbers(Go);
            model.winning();
            winning();
            //System.out.println(model.getInteresting());
            //System.out.println(model.getJudge());
            if (currentPlayer==Color.red){
                ;
            }if (currentPlayer==Color.green){
                ;
            }if (currentPlayer==Color.yellow){
                ;
            }if (currentPlayer==Color.blue){
                ;
            }
        }
        if (model.getTest()==1){
            setSelectedLocation(getCancelPiece());
            //if (getAbolish().isSelected()){
            //}
            //getAbolish().setSelected(true);
            //component.repaint();
        }
    }

    @Override
    public void onPlayerClickChessPiece(ChessBoardLocation location, ChessComponent component) {
        model.setNumbers(Go);
        model.winning();
        winning();
        if (model.getTest()==0) {
            setAbolish(component);
            setCancel(location);
            ChessPiece piece = model.getChessPieceAt(location);
            setSelectPiece(piece);
            if (piece.getColor() == currentPlayer && (!hasSelectedLocation() || location.equals(getSelectedLocation()))) {
                if (!hasSelectedLocation()) {
                    setSelectedLocation(location);
                } else {
                    resetSelectedLocation();
                }
                component.setSelected(!component.isSelected());
                //System.out.println("as");
                component.repaint();
            }
        }
    }

    public void winning() {
        if (Go == 1){
            if (model.getGreen1().getColor() == Color.green && model.getGreen2().getColor() == Color.green &&
                    model.getGreen3().getColor() == Color.green && model.getGreen4().getColor() == Color.green &&
                    model.getGreen5().getColor() == Color.green && model.getGreen6().getColor() == Color.green &&
                    model.getGreen7().getColor() == Color.green && model.getGreen8().getColor() == Color.green &&
                    model.getGreen9().getColor() == Color.green && model.getGreen10().getColor() == Color.green &&
                    model.getGreen11().getColor() == Color.green && model.getGreen12().getColor() == Color.green &&
                    model.getGreen13().getColor() == Color.green) {
                setText("绿色赢了！");
                Win win = new Win();
                win.main(null);
            }
            if (model.getRed1().getColor() == Color.red && model.getRed2().getColor() == Color.red &&
                model.getRed3().getColor() == Color.red && model.getRed4().getColor() == Color.red &&
                model.getRed5().getColor() == Color.red && model.getRed6().getColor() == Color.red &&
                model.getRed7().getColor() == Color.red && model.getRed8().getColor() == Color.red &&
                model.getRed9().getColor() == Color.red && model.getRed10().getColor() == Color.red &&
                model.getRed11().getColor() == Color.red && model.getRed12().getColor() == Color.red &&
                model.getRed13().getColor() == Color.red) {
                setText("红色赢了！");
                Win win = new Win();
                win.main(null);
            }
            if (model.getYellow1().getColor() == Color.yellow && model.getYellow2().getColor() == Color.yellow &&
                model.getYellow3().getColor() == Color.yellow && model.getYellow4().getColor() == Color.yellow &&
                model.getYellow5().getColor() == Color.yellow && model.getYellow6().getColor() == Color.yellow &&
                model.getYellow7().getColor() == Color.yellow && model.getYellow8().getColor() == Color.yellow &&
                model.getYellow9().getColor() == Color.yellow && model.getYellow10().getColor() == Color.yellow &&
                model.getYellow11().getColor() == Color.yellow && model.getYellow12().getColor() == Color.yellow &&
                model.getYellow13().getColor() == Color.yellow) {
                setText("黄色赢了！");
                Win win = new Win();
                win.main(null);
            }

            if (model.getBlue1().getColor() == Color.blue && model.getBlue2().getColor() == Color.blue &&
                model.getBlue3().getColor() == Color.blue && model.getBlue4().getColor() == Color.blue &&
                model.getBlue5().getColor() == Color.blue && model.getBlue6().getColor() == Color.blue &&
                model.getBlue7().getColor() == Color.blue && model.getBlue8().getColor() == Color.blue &&
                model.getBlue9().getColor() == Color.blue && model.getBlue10().getColor() == Color.blue &&
                model.getBlue11().getColor() == Color.blue && model.getBlue12().getColor() == Color.blue &&
                model.getBlue13().getColor() == Color.blue) {
                setText("蓝色赢了！");
                Win win = new Win();
                win.main(null);
            }
        }
        if (Go==0) {
            if (model.getGreen1().getColor() == Color.green && model.getGreen2().getColor() == Color.green &&
                    model.getGreen3().getColor() == Color.green && model.getGreen4().getColor() == Color.green &&
                    model.getGreen5().getColor() == Color.green && model.getGreen6().getColor() == Color.green &&
                    model.getGreen7().getColor() == Color.green && model.getGreen8().getColor() == Color.green &&
                    model.getGreen9().getColor() == Color.green && model.getGreen10().getColor() == Color.green &&
                    model.getGreen11().getColor() == Color.green && model.getGreen12().getColor() == Color.green &&
                    model.getGreen13().getColor() == Color.green&&model.getGreen14().getColor() == Color.green &&
                    model.getGreen15().getColor() == Color.green && model.getGreen16().getColor() == Color.green &&
                    model.getGreen17().getColor() == Color.green && model.getGreen18().getColor() == Color.green &&
                    model.getGreen19().getColor() == Color.green) {
                setText("绿色赢了！");
                Win win = new Win();
                win.main(null);
            }



            if (model.getRed1().getColor() == Color.red && model.getRed2().getColor() == Color.red &&
                    model.getRed3().getColor() == Color.red && model.getRed4().getColor() == Color.red &&
                    model.getRed5().getColor() == Color.red && model.getRed6().getColor() == Color.red &&
                    model.getRed7().getColor() == Color.red && model.getRed8().getColor() == Color.red &&
                    model.getRed9().getColor() == Color.red && model.getRed10().getColor() == Color.red &&
                    model.getRed11().getColor() == Color.red && model.getRed12().getColor() == Color.red &&
                    model.getRed13().getColor() == Color.red&&model.getRed14().getColor() == Color.red &&
                    model.getRed15().getColor() == Color.red && model.getRed16().getColor() == Color.red &&
                    model.getRed17().getColor() == Color.red && model.getRed18().getColor() == Color.red &&
                    model.getRed19().getColor() == Color.red) {
                setText("红色赢了！");
                Win win = new Win();
                win.main(null);
            }

        }

    }

    public void next(int abc){
        if (abc==1) {
            ChessPiece piece = model.getChessPieceAt(getCancel());
            if (hasSelectedLocation()) {
                resetSelectedLocation();
                getAbolish().setSelected(!getAbolish().isSelected());
                getAbolish().repaint();
            }

            nextPlayer(getGo());
        }else {
            ;
        }
    }

    public void monitor(){
        String hu="";
        if (Open.getMode() == 2) {
            hu= "F:\\文档\\JAVA\\project\\5.26\\project ttt\\Temp\\Temp2.txt"; //修改了这里！
        }
        else if (Open.getMode() == 4) {
            hu = "F:\\文档\\JAVA\\project\\5.26\\project ttt\\Temp\\Temp4.txt";
        }
        else if(Open.getMode()==1){
            hu = "F:\\文档\\JAVA\\project\\5.26\\project ttt\\Temp\\Temp1.txt"; //还有这里！
        }
        try {
            FileReader in = new FileReader(hu);
            LineNumberReader reader = new LineNumberReader(in);
            reader.skip(Long.MAX_VALUE);
            int lines = reader.getLineNumber();
            if (Open.getMode() == 2||Open.getMode()==1){
                if (lines<39){
                    Erro.setErrotext("棋子数量不正确");
                    try {
                        for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                            if ("Nimbus".equals(info.getName())) {
                                javax.swing.UIManager.setLookAndFeel(info.getClassName());
                                break;
                            }
                        }
                    } catch (ClassNotFoundException ex) {
                        java.util.logging.Logger.getLogger(Erro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                    } catch (InstantiationException ex) {
                        java.util.logging.Logger.getLogger(Erro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                    } catch (IllegalAccessException ex) {
                        java.util.logging.Logger.getLogger(Erro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                        java.util.logging.Logger.getLogger(Erro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                    }
                    //</editor-fold>

                    /* Create and display the form */
                    java.awt.EventQueue.invokeLater(new Runnable() {
                        public void run() {
                            Erro erro = new Erro();
                            erro.setLocationRelativeTo(null);
                            erro.setVisible(true);
                        }
                    });
                }if (lines>39){
                    //System.out.print("棋子数量不正确");
                    Erro.setErrotext("玩家人数不正确");
                    try {
                        for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                            if ("Nimbus".equals(info.getName())) {
                                javax.swing.UIManager.setLookAndFeel(info.getClassName());
                                break;
                            }
                        }
                    } catch (ClassNotFoundException ex) {
                        java.util.logging.Logger.getLogger(Erro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                    } catch (InstantiationException ex) {
                        java.util.logging.Logger.getLogger(Erro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                    } catch (IllegalAccessException ex) {
                        java.util.logging.Logger.getLogger(Erro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                        java.util.logging.Logger.getLogger(Erro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                    }
                    //</editor-fold>

                    /* Create and display the form */
                    java.awt.EventQueue.invokeLater(new Runnable() {
                        public void run() {
                            Erro erro = new Erro();
                            erro.setLocationRelativeTo(null);
                            erro.setVisible(true);
                        }
                    });
                }
            }if (Open.getMode() == 4){
                if (lines<53){
                    //System.out.print("玩家人数不正确");
                    Erro.setErrotext("棋子数量不正确");
                    try {
                        for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                            if ("Nimbus".equals(info.getName())) {
                                javax.swing.UIManager.setLookAndFeel(info.getClassName());
                                break;
                            }
                        }
                    } catch (ClassNotFoundException ex) {
                        java.util.logging.Logger.getLogger(Erro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                    } catch (InstantiationException ex) {
                        java.util.logging.Logger.getLogger(Erro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                    } catch (IllegalAccessException ex) {
                        java.util.logging.Logger.getLogger(Erro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                        java.util.logging.Logger.getLogger(Erro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                    }
                    //</editor-fold>

                    /* Create and display the form */
                    java.awt.EventQueue.invokeLater(new Runnable() {
                        public void run() {
                            Erro erro = new Erro();
                            erro.setLocationRelativeTo(null);
                            erro.setVisible(true);
                        }
                    });
                }if (lines>53){
                    //System.out.print("棋子数量不正确");
                    Erro.setErrotext("玩家人数不正确");
                    try {
                        for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                            if ("Nimbus".equals(info.getName())) {
                                javax.swing.UIManager.setLookAndFeel(info.getClassName());
                                break;
                            }
                        }
                    } catch (ClassNotFoundException ex) {
                        java.util.logging.Logger.getLogger(Erro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                    } catch (InstantiationException ex) {
                        java.util.logging.Logger.getLogger(Erro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                    } catch (IllegalAccessException ex) {
                        java.util.logging.Logger.getLogger(Erro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                        java.util.logging.Logger.getLogger(Erro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                    }
                    //</editor-fold>

                    /* Create and display the form */
                    java.awt.EventQueue.invokeLater(new Runnable() {
                        public void run() {
                            Erro erro = new Erro();
                            erro.setLocationRelativeTo(null);
                            erro.setVisible(true);
                        }
                    });
                }
            }
            reader.close();

        }catch (Exception b){

        }


    }

    public void load(){
        monitor();
        String abc="";
        String name ="";
        try{
            if (Open.getMode() == 2) {
                name = "F:\\文档\\JAVA\\project\\5.26\\project ttt\\Temp\\Temp2.txt";
            }
            else if (Open.getMode() == 4) {
                name = "F:\\文档\\JAVA\\project\\5.26\\project ttt\\Temp\\Temp4.txt";
            }
            else if(Open.getMode()==1){ //记得新建一个Temp1.txt!
                name = "F:\\文档\\JAVA\\project\\5.26\\project ttt\\Temp\\Temp1.txt";
            }
            BufferedReader read= new BufferedReader
                    (new InputStreamReader
                            (new FileInputStream(name)));
            abc=read.readLine();//System.out.println(abc);
            model.setHong1(abc);
            abc=read.readLine();
            model.setHong2(abc);
            abc=read.readLine();//System.out.println(abc);
            model.setHong3(abc);
            abc=read.readLine();//System.out.println(abc);
            model.setHong4(abc);
            abc=read.readLine();//System.out.println(abc);
            model.setHong5(abc);
            abc=read.readLine();//System.out.println(abc);
            model.setHong6(abc);
            abc=read.readLine();//System.out.println(abc);
            model.setHong7(abc);
            abc=read.readLine();//System.out.println(abc);
            model.setHong8(abc);
            abc=read.readLine();//System.out.println(abc);
            model.setHong9(abc);
            abc=read.readLine();//System.out.println(abc);
            model.setHong10(abc);
            abc=read.readLine();//System.out.println(abc);
            model.setHong11(abc);
            abc=read.readLine();//System.out.println(abc);
            model.setHong12(abc);
            abc=read.readLine();//System.out.println(abc);
            model.setHong13(abc);
            if (getGo()==0){
            abc=read.readLine();//System.out.println(abc);
            model.setHong14(abc);
            abc=read.readLine();//System.out.println(abc);
            model.setHong15(abc);
            abc=read.readLine();//System.out.println(abc);
            model.setHong16(abc);
            abc=read.readLine();//System.out.println(abc);
            model.setHong17(abc);
            abc=read.readLine();//System.out.println(abc);
            model.setHong18(abc);
            abc=read.readLine();//System.out.println(abc);
            model.setHong19(abc);}
            abc=read.readLine();//System.out.println(abc);
            model.setLv1(abc);
            abc=read.readLine();//System.out.println(abc);
            model.setLv2(abc);
            abc=read.readLine();//System.out.println(abc);
            model.setLv3(abc);
            abc=read.readLine();//System.out.println(abc);
            model.setLv4(abc);
            abc=read.readLine();//System.out.println(abc);
            model.setLv5(abc);
            abc=read.readLine();//System.out.println(abc);
            model.setLv6(abc);
            abc=read.readLine();//System.out.println(abc);
            model.setLv7(abc);
            abc=read.readLine();//System.out.println(abc);
            model.setLv8(abc);
            abc=read.readLine();//System.out.println(abc);
            model.setLv9(abc);
            abc=read.readLine();//System.out.println(abc);
            model.setLv10(abc);
            abc=read.readLine();//System.out.println(abc);
            model.setLv11(abc);
            abc=read.readLine();//System.out.println(abc);
            model.setLv12(abc);
            abc=read.readLine();//System.out.println(abc);
            model.setLv13(abc);
            if (getGo()==0){
            abc=read.readLine();//System.out.println(abc);
            model.setLv14(abc);
            abc=read.readLine();//System.out.println(abc);
            model.setLv15(abc);
            abc=read.readLine();//System.out.println(abc);
            model.setLv16(abc);
            abc=read.readLine();//System.out.println(abc);
            model.setLv17(abc);
            abc=read.readLine();//System.out.println(abc);
            model.setLv18(abc);
            abc=read.readLine();//System.out.println(abc);
            model.setLv19(abc);}
            if (getGo()==1){
            abc=read.readLine();
            model.setHuang1(abc);//System.out.println(abc);
            abc=read.readLine();
            model.setHuang2(abc);//System.out.println(abc);
            abc=read.readLine();
            model.setHuang3(abc);//System.out.println(abc);
            abc=read.readLine();
            model.setHuang4(abc);//System.out.println(abc);
            abc=read.readLine();
            model.setHuang5(abc);//System.out.println(abc);
            abc=read.readLine();
            model.setHuang6(abc);//System.out.println(abc);
            abc=read.readLine();
            model.setHuang7(abc);//System.out.println(abc);
            abc=read.readLine();
            model.setHuang8(abc);//System.out.println(abc);
            abc=read.readLine();
            model.setHuang9(abc);//System.out.println(abc);
            abc=read.readLine();
            model.setHuang10(abc);//System.out.println(abc);
            abc=read.readLine();
            model.setHuang11(abc);
            abc=read.readLine();
            model.setHuang12(abc);
            abc=read.readLine();
            model.setHuang13(abc);
            abc=read.readLine();
            model.setLan1(abc);
            abc=read.readLine();
            model.setLan2(abc);
            abc=read.readLine();
            model.setLan3(abc);
            abc=read.readLine();
            model.setLan4(abc);
            abc=read.readLine();
            model.setLan5(abc);
            abc=read.readLine();
            model.setLan6(abc);
            abc=read.readLine();
            model.setLan7(abc);
            abc=read.readLine();
            model.setLan8(abc);
            abc=read.readLine();
            model.setLan9(abc);
            abc=read.readLine();
            model.setLan10(abc);
            abc=read.readLine();
            model.setLan11(abc);
            abc=read.readLine();
            model.setLan26(abc);
            abc=read.readLine();
            model.setLan13(abc);}
            //System.out.print("读取成功");
            abc=read.readLine();
            if (abc.equals("1")){
                nextPlayer(-10);
            }
            if (abc.equals("2")){
                nextPlayer(-20);
            }
            if (abc.equals("3")){
                nextPlayer(-30);
            }
            if (abc.equals("4")){
                nextPlayer(-40);
            }
            if (getGo()==0){
                if (Integer.parseInt(model.getHong1().substring(0,2))<0||
                        Integer.parseInt(model.getHong2().substring(0,2))<0||
                        Integer.parseInt(model.getHong3().substring(0,2))<0||
                        Integer.parseInt(model.getHong4().substring(0,2))<0||
                        Integer.parseInt(model.getHong5().substring(0,2))<0||
                        Integer.parseInt(model.getHong6().substring(0,2))<0||
                        Integer.parseInt(model.getHong7().substring(0,2))<0||
                        Integer.parseInt(model.getHong8().substring(0,2))<0||
                        Integer.parseInt(model.getHong9().substring(0,2))<0||
                        Integer.parseInt(model.getHong10().substring(0,2))<0||
                        Integer.parseInt(model.getHong11().substring(0,2))<0||
                        Integer.parseInt(model.getHong12().substring(0,2))<0||
                        Integer.parseInt(model.getHong13().substring(0,2))<0||
                        Integer.parseInt(model.getHong14().substring(0,2))<0||
                        Integer.parseInt(model.getHong15().substring(0,2))<0||
                        Integer.parseInt(model.getHong16().substring(0,2))<0||
                        Integer.parseInt(model.getHong17().substring(0,2))<0||
                        Integer.parseInt(model.getHong18().substring(0,2))<0||
                        Integer.parseInt(model.getHong19().substring(0,2))<0||
                        Integer.parseInt(model.getHong1().substring(2,4))<0||
                        Integer.parseInt(model.getHong2().substring(2,4))<0||
                        Integer.parseInt(model.getHong3().substring(2,4))<0||
                        Integer.parseInt(model.getHong4().substring(2,4))<0||
                        Integer.parseInt(model.getHong5().substring(2,4))<0||
                        Integer.parseInt(model.getHong6().substring(2,4))<0||
                        Integer.parseInt(model.getHong7().substring(2,4))<0||
                        Integer.parseInt(model.getHong8().substring(2,4))<0||
                        Integer.parseInt(model.getHong9().substring(2,4))<0||
                        Integer.parseInt(model.getHong10().substring(2,4))<0||
                        Integer.parseInt(model.getHong11().substring(2,4))<0||
                        Integer.parseInt(model.getHong12().substring(2,4))<0||
                        Integer.parseInt(model.getHong13().substring(2,4))<0||
                        Integer.parseInt(model.getHong14().substring(2,4))<0||
                        Integer.parseInt(model.getHong15().substring(2,4))<0||
                        Integer.parseInt(model.getHong16().substring(2,4))<0||
                        Integer.parseInt(model.getHong17().substring(2,4))<0||
                        Integer.parseInt(model.getHong18().substring(2,4))<0||
                        Integer.parseInt(model.getHong19().substring(2,4))<0||
                        Integer.parseInt(model.getLv1().substring(0,2))<0||
                        Integer.parseInt(model.getLv2().substring(0,2))<0||
                        Integer.parseInt(model.getLv3().substring(0,2))<0||
                        Integer.parseInt(model.getLv4().substring(0,2))<0||
                        Integer.parseInt(model.getLv5().substring(0,2))<0||
                        Integer.parseInt(model.getLv6().substring(0,2))<0||
                        Integer.parseInt(model.getLv7().substring(0,2))<0||
                        Integer.parseInt(model.getLv8().substring(0,2))<0||
                        Integer.parseInt(model.getLv9().substring(0,2))<0||
                        Integer.parseInt(model.getLv10().substring(0,2))<0||
                        Integer.parseInt(model.getLv11().substring(0,2))<0||
                        Integer.parseInt(model.getLv12().substring(0,2))<0||
                        Integer.parseInt(model.getLv13().substring(0,2))<0||
                        Integer.parseInt(model.getLv14().substring(0,2))<0||
                        Integer.parseInt(model.getLv15().substring(0,2))<0||
                        Integer.parseInt(model.getLv16().substring(0,2))<0||
                        Integer.parseInt(model.getLv17().substring(0,2))<0||
                        Integer.parseInt(model.getLv18().substring(0,2))<0||
                        Integer.parseInt(model.getLv19().substring(0,2))<0||
                        Integer.parseInt(model.getLv1().substring(2,4))<0||
                        Integer.parseInt(model.getLv2().substring(2,4))<0||
                        Integer.parseInt(model.getLv3().substring(2,4))<0||
                        Integer.parseInt(model.getLv4().substring(2,4))<0||
                        Integer.parseInt(model.getLv5().substring(2,4))<0||
                        Integer.parseInt(model.getLv6().substring(2,4))<0||
                        Integer.parseInt(model.getLv7().substring(2,4))<0||
                        Integer.parseInt(model.getLv8().substring(2,4))<0||
                        Integer.parseInt(model.getLv9().substring(2,4))<0||
                        Integer.parseInt(model.getLv10().substring(2,4))<0||
                        Integer.parseInt(model.getLv11().substring(2,4))<0||
                        Integer.parseInt(model.getLv12().substring(2,4))<0||
                        Integer.parseInt(model.getLv13().substring(2,4))<0||
                        Integer.parseInt(model.getLv14().substring(2,4))<0||
                        Integer.parseInt(model.getLv15().substring(2,4))<0||
                        Integer.parseInt(model.getLv16().substring(2,4))<0||
                        Integer.parseInt(model.getLv17().substring(2,4))<0||
                        Integer.parseInt(model.getLv18().substring(2,4))<0||
                        Integer.parseInt(model.getLv19().substring(2,4))<0||
                        Integer.parseInt(model.getHong1().substring(0,2))>15||
                        Integer.parseInt(model.getHong2().substring(0,2))>15||
                        Integer.parseInt(model.getHong3().substring(0,2))>15||
                        Integer.parseInt(model.getHong4().substring(0,2))>15||
                        Integer.parseInt(model.getHong5().substring(0,2))>15||
                        Integer.parseInt(model.getHong6().substring(0,2))>15||
                        Integer.parseInt(model.getHong7().substring(0,2))>15||
                        Integer.parseInt(model.getHong8().substring(0,2))>15||
                        Integer.parseInt(model.getHong9().substring(0,2))>15||
                        Integer.parseInt(model.getHong10().substring(0,2))>15||
                        Integer.parseInt(model.getHong11().substring(0,2))>15||
                        Integer.parseInt(model.getHong12().substring(0,2))>15||
                        Integer.parseInt(model.getHong13().substring(0,2))>15||
                        Integer.parseInt(model.getHong14().substring(0,2))>15||
                        Integer.parseInt(model.getHong15().substring(0,2))>15||
                        Integer.parseInt(model.getHong16().substring(0,2))>15||
                        Integer.parseInt(model.getHong17().substring(0,2))>15||
                        Integer.parseInt(model.getHong18().substring(0,2))>15||
                        Integer.parseInt(model.getHong19().substring(0,2))>15||
                        Integer.parseInt(model.getHong1().substring(2,4))>15||
                        Integer.parseInt(model.getHong2().substring(2,4))>15||
                        Integer.parseInt(model.getHong3().substring(2,4))>15||
                        Integer.parseInt(model.getHong4().substring(2,4))>15||
                        Integer.parseInt(model.getHong5().substring(2,4))>15||
                        Integer.parseInt(model.getHong6().substring(2,4))>15||
                        Integer.parseInt(model.getHong7().substring(2,4))>15||
                        Integer.parseInt(model.getHong8().substring(2,4))>15||
                        Integer.parseInt(model.getHong9().substring(2,4))>15||
                        Integer.parseInt(model.getHong10().substring(2,4))>15||
                        Integer.parseInt(model.getHong11().substring(2,4))>15||
                        Integer.parseInt(model.getHong12().substring(2,4))>15||
                        Integer.parseInt(model.getHong13().substring(2,4))>15||
                        Integer.parseInt(model.getHong14().substring(2,4))>15||
                        Integer.parseInt(model.getHong15().substring(2,4))>15||
                        Integer.parseInt(model.getHong16().substring(2,4))>15||
                        Integer.parseInt(model.getHong17().substring(2,4))>15||
                        Integer.parseInt(model.getHong18().substring(2,4))>15||
                        Integer.parseInt(model.getHong19().substring(2,4))>15||
                        Integer.parseInt(model.getLv1().substring(0,2))>15||
                        Integer.parseInt(model.getLv2().substring(0,2))>15||
                        Integer.parseInt(model.getLv3().substring(0,2))>15||
                        Integer.parseInt(model.getLv4().substring(0,2))>15||
                        Integer.parseInt(model.getLv5().substring(0,2))>15||
                        Integer.parseInt(model.getLv6().substring(0,2))>15||
                        Integer.parseInt(model.getLv7().substring(0,2))>15||
                        Integer.parseInt(model.getLv8().substring(0,2))>15||
                        Integer.parseInt(model.getLv9().substring(0,2))>15||
                        Integer.parseInt(model.getLv10().substring(0,2))>15||
                        Integer.parseInt(model.getLv11().substring(0,2))>15||
                        Integer.parseInt(model.getLv12().substring(0,2))>15||
                        Integer.parseInt(model.getLv13().substring(0,2))>15||
                        Integer.parseInt(model.getLv14().substring(0,2))>15||
                        Integer.parseInt(model.getLv15().substring(0,2))>15||
                        Integer.parseInt(model.getLv16().substring(0,2))>15||
                        Integer.parseInt(model.getLv17().substring(0,2))>15||
                        Integer.parseInt(model.getLv18().substring(0,2))>15||
                        Integer.parseInt(model.getLv19().substring(0,2))>15||
                        Integer.parseInt(model.getLv1().substring(2,4))>15||
                        Integer.parseInt(model.getLv2().substring(2,4))>15||
                        Integer.parseInt(model.getLv3().substring(2,4))>15||
                        Integer.parseInt(model.getLv4().substring(2,4))>15||
                        Integer.parseInt(model.getLv5().substring(2,4))>15||
                        Integer.parseInt(model.getLv6().substring(2,4))>15||
                        Integer.parseInt(model.getLv7().substring(2,4))>15||
                        Integer.parseInt(model.getLv8().substring(2,4))>15||
                        Integer.parseInt(model.getLv9().substring(2,4))>15||
                        Integer.parseInt(model.getLv10().substring(2,4))>15||
                        Integer.parseInt(model.getLv11().substring(2,4))>15||
                        Integer.parseInt(model.getLv12().substring(2,4))>15||
                        Integer.parseInt(model.getLv13().substring(2,4))>15||
                        Integer.parseInt(model.getLv14().substring(2,4))>15||
                        Integer.parseInt(model.getLv15().substring(2,4))>15||
                        Integer.parseInt(model.getLv16().substring(2,4))>15||
                        Integer.parseInt(model.getLv17().substring(2,4))>15||
                        Integer.parseInt(model.getLv18().substring(2,4))>15||
                        Integer.parseInt(model.getLv19().substring(2,4))>15){
                    //System.out.print("棋子越界！");
                    Erro.setErrotext("棋子越界！");
                    try {
                        for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                            if ("Nimbus".equals(info.getName())) {
                                javax.swing.UIManager.setLookAndFeel(info.getClassName());
                                break;
                            }
                        }
                    } catch (ClassNotFoundException ex) {
                        java.util.logging.Logger.getLogger(Erro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                    } catch (InstantiationException ex) {
                        java.util.logging.Logger.getLogger(Erro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                    } catch (IllegalAccessException ex) {
                        java.util.logging.Logger.getLogger(Erro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                        java.util.logging.Logger.getLogger(Erro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                    }
                    //</editor-fold>

                    /* Create and display the form */
                    java.awt.EventQueue.invokeLater(new Runnable() {
                        public void run() {
                            Erro erro = new Erro();
                            erro.setLocationRelativeTo(null);
                            erro.setVisible(true);
                        }
                    });
                }
            }if(getGo()==1){
                if (Integer.parseInt(model.getHong1().substring(0,2))<0||
                        Integer.parseInt(model.getHong2().substring(0,2))<0||
                        Integer.parseInt(model.getHong3().substring(0,2))<0||
                        Integer.parseInt(model.getHong4().substring(0,2))<0||
                        Integer.parseInt(model.getHong5().substring(0,2))<0||
                        Integer.parseInt(model.getHong6().substring(0,2))<0||
                        Integer.parseInt(model.getHong7().substring(0,2))<0||
                        Integer.parseInt(model.getHong8().substring(0,2))<0||
                        Integer.parseInt(model.getHong9().substring(0,2))<0||
                        Integer.parseInt(model.getHong10().substring(0,2))<0||
                        Integer.parseInt(model.getHong11().substring(0,2))<0||
                        Integer.parseInt(model.getHong12().substring(0,2))<0||
                        Integer.parseInt(model.getHong13().substring(0,2))<0||
                        Integer.parseInt(model.getHong1().substring(2,4))<0||
                        Integer.parseInt(model.getHong2().substring(2,4))<0||
                        Integer.parseInt(model.getHong3().substring(2,4))<0||
                        Integer.parseInt(model.getHong4().substring(2,4))<0||
                        Integer.parseInt(model.getHong5().substring(2,4))<0||
                        Integer.parseInt(model.getHong6().substring(2,4))<0||
                        Integer.parseInt(model.getHong7().substring(2,4))<0||
                        Integer.parseInt(model.getHong8().substring(2,4))<0||
                        Integer.parseInt(model.getHong9().substring(2,4))<0||
                        Integer.parseInt(model.getHong10().substring(2,4))<0||
                        Integer.parseInt(model.getHong11().substring(2,4))<0||
                        Integer.parseInt(model.getHong12().substring(2,4))<0||
                        Integer.parseInt(model.getHong13().substring(2,4))<0||
                        Integer.parseInt(model.getLv1().substring(0,2))<0||
                        Integer.parseInt(model.getLv2().substring(0,2))<0||
                        Integer.parseInt(model.getLv3().substring(0,2))<0||
                        Integer.parseInt(model.getLv4().substring(0,2))<0||
                        Integer.parseInt(model.getLv5().substring(0,2))<0||
                        Integer.parseInt(model.getLv6().substring(0,2))<0||
                        Integer.parseInt(model.getLv7().substring(0,2))<0||
                        Integer.parseInt(model.getLv8().substring(0,2))<0||
                        Integer.parseInt(model.getLv9().substring(0,2))<0||
                        Integer.parseInt(model.getLv10().substring(0,2))<0||
                        Integer.parseInt(model.getLv11().substring(0,2))<0||
                        Integer.parseInt(model.getLv12().substring(0,2))<0||
                        Integer.parseInt(model.getLv13().substring(0,2))<0||
                        Integer.parseInt(model.getLv1().substring(2,4))<0||
                        Integer.parseInt(model.getLv2().substring(2,4))<0||
                        Integer.parseInt(model.getLv3().substring(2,4))<0||
                        Integer.parseInt(model.getLv4().substring(2,4))<0||
                        Integer.parseInt(model.getLv5().substring(2,4))<0||
                        Integer.parseInt(model.getLv6().substring(2,4))<0||
                        Integer.parseInt(model.getLv7().substring(2,4))<0||
                        Integer.parseInt(model.getLv8().substring(2,4))<0||
                        Integer.parseInt(model.getLv9().substring(2,4))<0||
                        Integer.parseInt(model.getLv10().substring(2,4))<0||
                        Integer.parseInt(model.getLv11().substring(2,4))<0||
                        Integer.parseInt(model.getLv12().substring(2,4))<0||
                        Integer.parseInt(model.getLv13().substring(2,4))<0||
                        Integer.parseInt(model.getHong1().substring(0,2))>15||
                        Integer.parseInt(model.getHong2().substring(0,2))>15||
                        Integer.parseInt(model.getHong3().substring(0,2))>15||
                        Integer.parseInt(model.getHong4().substring(0,2))>15||
                        Integer.parseInt(model.getHong5().substring(0,2))>15||
                        Integer.parseInt(model.getHong6().substring(0,2))>15||
                        Integer.parseInt(model.getHong7().substring(0,2))>15||
                        Integer.parseInt(model.getHong8().substring(0,2))>15||
                        Integer.parseInt(model.getHong9().substring(0,2))>15||
                        Integer.parseInt(model.getHong10().substring(0,2))>15||
                        Integer.parseInt(model.getHong11().substring(0,2))>15||
                        Integer.parseInt(model.getHong12().substring(0,2))>15||
                        Integer.parseInt(model.getHong13().substring(0,2))>15||
                        Integer.parseInt(model.getHong1().substring(2,4))>15||
                        Integer.parseInt(model.getHong2().substring(2,4))>15||
                        Integer.parseInt(model.getHong3().substring(2,4))>15||
                        Integer.parseInt(model.getHong4().substring(2,4))>15||
                        Integer.parseInt(model.getHong5().substring(2,4))>15||
                        Integer.parseInt(model.getHong6().substring(2,4))>15||
                        Integer.parseInt(model.getHong7().substring(2,4))>15||
                        Integer.parseInt(model.getHong8().substring(2,4))>15||
                        Integer.parseInt(model.getHong9().substring(2,4))>15||
                        Integer.parseInt(model.getHong10().substring(2,4))>15||
                        Integer.parseInt(model.getHong11().substring(2,4))>15||
                        Integer.parseInt(model.getHong12().substring(2,4))>15||
                        Integer.parseInt(model.getHong13().substring(2,4))>15||
                        Integer.parseInt(model.getLv1().substring(0,2))>15||
                        Integer.parseInt(model.getLv2().substring(0,2))>15||
                        Integer.parseInt(model.getLv3().substring(0,2))>15||
                        Integer.parseInt(model.getLv4().substring(0,2))>15||
                        Integer.parseInt(model.getLv5().substring(0,2))>15||
                        Integer.parseInt(model.getLv6().substring(0,2))>15||
                        Integer.parseInt(model.getLv7().substring(0,2))>15||
                        Integer.parseInt(model.getLv8().substring(0,2))>15||
                        Integer.parseInt(model.getLv9().substring(0,2))>15||
                        Integer.parseInt(model.getLv10().substring(0,2))>15||
                        Integer.parseInt(model.getLv11().substring(0,2))>15||
                        Integer.parseInt(model.getLv12().substring(0,2))>15||
                        Integer.parseInt(model.getLv13().substring(0,2))>15||
                        Integer.parseInt(model.getLv1().substring(2,4))>15||
                        Integer.parseInt(model.getLv2().substring(2,4))>15||
                        Integer.parseInt(model.getLv3().substring(2,4))>15||
                        Integer.parseInt(model.getLv4().substring(2,4))>15||
                        Integer.parseInt(model.getLv5().substring(2,4))>15||
                        Integer.parseInt(model.getLv6().substring(2,4))>15||
                        Integer.parseInt(model.getLv7().substring(2,4))>15||
                        Integer.parseInt(model.getLv8().substring(2,4))>15||
                        Integer.parseInt(model.getLv9().substring(2,4))>15||
                        Integer.parseInt(model.getLv10().substring(2,4))>15||
                        Integer.parseInt(model.getLv11().substring(2,4))>15||
                        Integer.parseInt(model.getLv12().substring(2,4))>15||
                        Integer.parseInt(model.getLv13().substring(2,4))>15||
                        Integer.parseInt(model.getHuang1().substring(0,2))<0||
                        Integer.parseInt(model.getHuang2().substring(0,2))<0||
                        Integer.parseInt(model.getHuang3().substring(0,2))<0||
                        Integer.parseInt(model.getHuang4().substring(0,2))<0||
                        Integer.parseInt(model.getHuang5().substring(0,2))<0||
                        Integer.parseInt(model.getHuang6().substring(0,2))<0||
                        Integer.parseInt(model.getHuang7().substring(0,2))<0||
                        Integer.parseInt(model.getHuang8().substring(0,2))<0||
                        Integer.parseInt(model.getHuang9().substring(0,2))<0||
                        Integer.parseInt(model.getHuang10().substring(0,2))<0||
                        Integer.parseInt(model.getHuang11().substring(0,2))<0||
                        Integer.parseInt(model.getHuang12().substring(0,2))<0||
                        Integer.parseInt(model.getHuang13().substring(0,2))<0||
                        Integer.parseInt(model.getHuang1().substring(2,4))<0||
                        Integer.parseInt(model.getHuang2().substring(2,4))<0||
                        Integer.parseInt(model.getHuang3().substring(2,4))<0||
                        Integer.parseInt(model.getHuang4().substring(2,4))<0||
                        Integer.parseInt(model.getHuang5().substring(2,4))<0||
                        Integer.parseInt(model.getHuang6().substring(2,4))<0||
                        Integer.parseInt(model.getHuang7().substring(2,4))<0||
                        Integer.parseInt(model.getHuang8().substring(2,4))<0||
                        Integer.parseInt(model.getHuang9().substring(2,4))<0||
                        Integer.parseInt(model.getHuang10().substring(2,4))<0||
                        Integer.parseInt(model.getHuang11().substring(2,4))<0||
                        Integer.parseInt(model.getHuang12().substring(2,4))<0||
                        Integer.parseInt(model.getHuang13().substring(2,4))<0||
                        Integer.parseInt(model.getLan1().substring(0,2))<0||
                        Integer.parseInt(model.getLan2().substring(0,2))<0||
                        Integer.parseInt(model.getLan3().substring(0,2))<0||
                        Integer.parseInt(model.getLan4().substring(0,2))<0||
                        Integer.parseInt(model.getLan5().substring(0,2))<0||
                        Integer.parseInt(model.getLan6().substring(0,2))<0||
                        Integer.parseInt(model.getLan7().substring(0,2))<0||
                        Integer.parseInt(model.getLan8().substring(0,2))<0||
                        Integer.parseInt(model.getLan9().substring(0,2))<0||
                        Integer.parseInt(model.getLan10().substring(0,2))<0||
                        Integer.parseInt(model.getLan11().substring(0,2))<0||
                        Integer.parseInt(model.getLan26().substring(0,2))<0||
                        Integer.parseInt(model.getLan13().substring(0,2))<0||
                        Integer.parseInt(model.getLan1().substring(2,4))<0||
                        Integer.parseInt(model.getLan2().substring(2,4))<0||
                        Integer.parseInt(model.getLan3().substring(2,4))<0||
                        Integer.parseInt(model.getLan4().substring(2,4))<0||
                        Integer.parseInt(model.getLan5().substring(2,4))<0||
                        Integer.parseInt(model.getLan6().substring(2,4))<0||
                        Integer.parseInt(model.getLan7().substring(2,4))<0||
                        Integer.parseInt(model.getLan8().substring(2,4))<0||
                        Integer.parseInt(model.getLan9().substring(2,4))<0||
                        Integer.parseInt(model.getLan10().substring(2,4))<0||
                        Integer.parseInt(model.getLan11().substring(2,4))<0||
                        Integer.parseInt(model.getLan26().substring(2,4))<0||
                        Integer.parseInt(model.getLan13().substring(2,4))<0||
                        Integer.parseInt(model.getHuang1().substring(0,2))>15||
                        Integer.parseInt(model.getHuang2().substring(0,2))>15||
                        Integer.parseInt(model.getHuang3().substring(0,2))>15||
                        Integer.parseInt(model.getHuang4().substring(0,2))>15||
                        Integer.parseInt(model.getHuang5().substring(0,2))>15||
                        Integer.parseInt(model.getHuang6().substring(0,2))>15||
                        Integer.parseInt(model.getHuang7().substring(0,2))>15||
                        Integer.parseInt(model.getHuang8().substring(0,2))>15||
                        Integer.parseInt(model.getHuang9().substring(0,2))>15||
                        Integer.parseInt(model.getHuang10().substring(0,2))>15||
                        Integer.parseInt(model.getHuang11().substring(0,2))>15||
                        Integer.parseInt(model.getHuang12().substring(0,2))>15||
                        Integer.parseInt(model.getHuang13().substring(0,2))>15||
                        Integer.parseInt(model.getHuang1().substring(2,4))>15||
                        Integer.parseInt(model.getHuang2().substring(2,4))>15||
                        Integer.parseInt(model.getHuang3().substring(2,4))>15||
                        Integer.parseInt(model.getHuang4().substring(2,4))>15||
                        Integer.parseInt(model.getHuang5().substring(2,4))>15||
                        Integer.parseInt(model.getHuang6().substring(2,4))>15||
                        Integer.parseInt(model.getHuang7().substring(2,4))>15||
                        Integer.parseInt(model.getHuang8().substring(2,4))>15||
                        Integer.parseInt(model.getHuang9().substring(2,4))>15||
                        Integer.parseInt(model.getHuang10().substring(2,4))>15||
                        Integer.parseInt(model.getHuang11().substring(2,4))>15||
                        Integer.parseInt(model.getHuang12().substring(2,4))>15||
                        Integer.parseInt(model.getHuang13().substring(2,4))>15||
                        Integer.parseInt(model.getLan1().substring(0,2))>15||
                        Integer.parseInt(model.getLan2().substring(0,2))>15||
                        Integer.parseInt(model.getLan3().substring(0,2))>15||
                        Integer.parseInt(model.getLan4().substring(0,2))>15||
                        Integer.parseInt(model.getLan5().substring(0,2))>15||
                        Integer.parseInt(model.getLan6().substring(0,2))>15||
                        Integer.parseInt(model.getLan7().substring(0,2))>15||
                        Integer.parseInt(model.getLan8().substring(0,2))>15||
                        Integer.parseInt(model.getLan9().substring(0,2))>15||
                        Integer.parseInt(model.getLan10().substring(0,2))>15||
                        Integer.parseInt(model.getLan11().substring(0,2))>15||
                        Integer.parseInt(model.getLan26().substring(0,2))>15||
                        Integer.parseInt(model.getLan13().substring(0,2))>15||
                        Integer.parseInt(model.getLan1().substring(2,4))>15||
                        Integer.parseInt(model.getLan2().substring(2,4))>15||
                        Integer.parseInt(model.getLan3().substring(2,4))>15||
                        Integer.parseInt(model.getLan4().substring(2,4))>15||
                        Integer.parseInt(model.getLan5().substring(2,4))>15||
                        Integer.parseInt(model.getLan6().substring(2,4))>15||
                        Integer.parseInt(model.getLan7().substring(2,4))>15||
                        Integer.parseInt(model.getLan8().substring(2,4))>15||
                        Integer.parseInt(model.getLan9().substring(2,4))>15||
                        Integer.parseInt(model.getLan10().substring(2,4))>15||
                        Integer.parseInt(model.getLan11().substring(2,4))>15||
                        Integer.parseInt(model.getLan26().substring(2,4))>15||
                        Integer.parseInt(model.getLan13().substring(2,4))>15){
                    //System.out.print("棋子越界！");213
                    Erro.setErrotext("棋子越界！");
                    try {
                        for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                            if ("Nimbus".equals(info.getName())) {
                                javax.swing.UIManager.setLookAndFeel(info.getClassName());
                                break;
                            }
                        }
                    } catch (ClassNotFoundException ex) {
                        java.util.logging.Logger.getLogger(Erro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                    } catch (InstantiationException ex) {
                        java.util.logging.Logger.getLogger(Erro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                    } catch (IllegalAccessException ex) {
                        java.util.logging.Logger.getLogger(Erro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                        java.util.logging.Logger.getLogger(Erro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                    }
                    //</editor-fold>

                    /* Create and display the form */
                    java.awt.EventQueue.invokeLater(new Runnable() {
                        public void run() {
                            Erro erro = new Erro();
                            erro.setLocationRelativeTo(null);
                            erro.setVisible(true);
                        }
                    });
                }



            }

            model.loadD(getGo());

        }
        catch (Exception b){
            //System.out.print("文件读取失败");
        }

    }

    public void regret(){
        save(199);load();model.setInteresting(999);
        if (getGo()==1){
            if (model.getNextMove()==0){
        nextPlayer(getGo());nextPlayer(getGo());nextPlayer(getGo());}
        if (model.getNextMove()!=0){
            next(1);change();
            nextPlayer(getGo());nextPlayer(getGo());nextPlayer(getGo());
        }
        }
        else {
            if (model.getNextMove() == 0) {
                nextPlayer(getGo());
            }
            if (model.getNextMove()!=0){
                next(1);change();
                nextPlayer(getGo());
            }
        }
    }
    public void save(int abc){
        if (abc==0){
        if (model.getInteresting()==101){
            model.setHong1(model.getJudge());
        }
        if (model.getInteresting()==102){
            model.setHong2(model.getJudge());
        }
        if (model.getInteresting()==103){
            model.setHong3(model.getJudge());
        }
        if (model.getInteresting()==104){
            model.setHong4(model.getJudge());
        }
        if (model.getInteresting()==105){
            model.setHong5(model.getJudge());
        }
        if (model.getInteresting()==106){
            model.setHong6(model.getJudge());
        }
        if (model.getInteresting()==107){
            model.setHong7(model.getJudge());
        }
        if (model.getInteresting()==108){
            model.setHong8(model.getJudge());
        }
        if (model.getInteresting()==109){
            model.setHong9(model.getJudge());
        }
        if (model.getInteresting()==110){
            model.setHong10(model.getJudge());
        }
        if (model.getInteresting()==111){
            model.setHong11(model.getJudge());
        }
        if (model.getInteresting()==112){
            model.setHong12(model.getJudge());
        }
        if (model.getInteresting()==113){
            model.setHong13(model.getJudge());
        }
        if (model.getInteresting()==114){
            model.setHong14(model.getJudge());
        }
        if (model.getInteresting()==115){
            model.setHong15(model.getJudge());
        }
        if (model.getInteresting()==116){
            model.setHong16(model.getJudge());
        }
        if (model.getInteresting()==117){
            model.setHong17(model.getJudge());
        }
        if (model.getInteresting()==118){
            model.setHong18(model.getJudge());
        }
        if (model.getInteresting()==119){
            model.setHong19(model.getJudge());
        }
        if (model.getInteresting()==201){
            model.setLv1(model.getJudge());
        }
        if (model.getInteresting()==202){
            model.setLv2(model.getJudge());
        }
        if (model.getInteresting()==203){
            model.setLv3(model.getJudge());
        }
        if (model.getInteresting()==204){
            model.setLv4(model.getJudge());
        }
        if (model.getInteresting()==205){
            model.setLv5(model.getJudge());
        }
        if (model.getInteresting()==206){
            model.setLv6(model.getJudge());
        }
        if (model.getInteresting()==207){
            model.setLv7(model.getJudge());
        }
        if (model.getInteresting()==208){
            model.setLv8(model.getJudge());
        }
        if (model.getInteresting()==209){
            model.setLv9(model.getJudge());
        }
        if (model.getInteresting()==210){
            model.setLv10(model.getJudge());
        }
        if (model.getInteresting()==211){
            model.setLv11(model.getJudge());
        }
        if (model.getInteresting()==212){
            model.setLv12(model.getJudge());
        }
        if (model.getInteresting()==213){
            model.setLv13(model.getJudge());
        }
        if (model.getInteresting()==214){
            model.setLv14(model.getJudge());
        }
        if (model.getInteresting()==215){
            model.setLv15(model.getJudge());
        }
        if (model.getInteresting()==216){
            model.setLv16(model.getJudge());
        }
        if (model.getInteresting()==217){
            model.setLv17(model.getJudge());
        }
        if (model.getInteresting()==218){
            model.setLv18(model.getJudge());
        }
        if (model.getInteresting()==219){
            model.setLv19(model.getJudge());
        }
        if (model.getInteresting()==301){
            model.setHuang1(model.getJudge());
        }
        if (model.getInteresting()==302){
            model.setHuang2(model.getJudge());
        }
        if (model.getInteresting()==303){
            model.setHuang3(model.getJudge());
        }
        if (model.getInteresting()==304){
            model.setHuang4(model.getJudge());
        }
        if (model.getInteresting()==305){
            model.setHuang5(model.getJudge());
        }
        if (model.getInteresting()==306){
            model.setHuang6(model.getJudge());
        }
        if (model.getInteresting()==307){
            model.setHuang7(model.getJudge());
        }
        if (model.getInteresting()==308){
            model.setHuang8(model.getJudge());
        }
        if (model.getInteresting()==309){
            model.setHuang9(model.getJudge());
        }
        if (model.getInteresting()==310){
            model.setHuang10(model.getJudge());
        }
        if (model.getInteresting()==311){
            model.setHuang11(model.getJudge());
        }
        if (model.getInteresting()==312){
            model.setHuang12(model.getJudge());
        }
        if (model.getInteresting()==313){
            model.setHuang13(model.getJudge());
        }
        if (model.getInteresting()==401){
            model.setLan1(model.getJudge());
        }
        if (model.getInteresting()==402){
            model.setLan2(model.getJudge());
        }
        if (model.getInteresting()==403){
            model.setLan3(model.getJudge());
        }
        if (model.getInteresting()==404){
            model.setLan4(model.getJudge());
        }
        if (model.getInteresting()==405){
            model.setLan5(model.getJudge());
        }
        if (model.getInteresting()==406){
            model.setLan6(model.getJudge());
        }
        if (model.getInteresting()==407){
            model.setLan7(model.getJudge());
        }
        if (model.getInteresting()==408){
            model.setLan8(model.getJudge());
        }
        if (model.getInteresting()==409){
            model.setLan9(model.getJudge());
        }
        if (model.getInteresting()==410){
            model.setLan10(model.getJudge());
        }
        if (model.getInteresting()==411){
            model.setLan11(model.getJudge());
        }
        if (model.getInteresting()==412){
            model.setLan26(model.getJudge());
        }
        if (model.getInteresting()==413){
            model.setLan13(model.getJudge());
        }}

        FileWriter fileWriter = null;
        try {
            String name = "";
            if (Open.getMode() == 2) {
                name = "F:\\文档\\JAVA\\project\\5.26\\project ttt\\Temp\\Temp2.txt";
            }
            else if (Open.getMode() == 4) {
                name = "F:\\文档\\JAVA\\project\\5.26\\project ttt\\Temp\\Temp4.txt";
            }
            else if(Open.getMode()==1){
                name = "F:\\文档\\JAVA\\project\\5.26\\project ttt\\Temp\\Temp1.txt";
            }
            fileWriter = new FileWriter(name);//创建文本文件
            fileWriter.write(model.getHong1()+"\r\n");
            fileWriter.write(model.getHong2()+"\r\n");
            fileWriter.write(model.getHong3()+"\r\n");
            fileWriter.write(model.getHong4()+"\r\n");
            fileWriter.write(model.getHong5()+"\r\n");
            fileWriter.write(model.getHong6()+"\r\n");
            fileWriter.write(model.getHong7()+"\r\n");
            fileWriter.write(model.getHong8()+"\r\n");
            fileWriter.write(model.getHong9()+"\r\n");
            fileWriter.write(model.getHong10()+"\r\n");
            fileWriter.write(model.getHong11()+"\r\n");
            fileWriter.write(model.getHong12()+"\r\n");
            fileWriter.write(model.getHong13()+"\r\n");
            if (getGo()==0){
            fileWriter.write(model.getHong14()+"\r\n");
            fileWriter.write(model.getHong15()+"\r\n");
            fileWriter.write(model.getHong16()+"\r\n");
            fileWriter.write(model.getHong17()+"\r\n");
            fileWriter.write(model.getHong18()+"\r\n");
            fileWriter.write(model.getHong19()+"\r\n");}
            fileWriter.write(model.getLv1()+"\r\n");
            fileWriter.write(model.getLv2()+"\r\n");
            fileWriter.write(model.getLv3()+"\r\n");
            fileWriter.write(model.getLv4()+"\r\n");
            fileWriter.write(model.getLv5()+"\r\n");
            fileWriter.write(model.getLv6()+"\r\n");
            fileWriter.write(model.getLv7()+"\r\n");
            fileWriter.write(model.getLv8()+"\r\n");
            fileWriter.write(model.getLv9()+"\r\n");
            fileWriter.write(model.getLv10()+"\r\n");
            fileWriter.write(model.getLv11()+"\r\n");
            fileWriter.write(model.getLv12()+"\r\n");
            fileWriter.write(model.getLv13()+"\r\n");
            if (getGo()==0){
            fileWriter.write(model.getLv14()+"\r\n");
            fileWriter.write(model.getLv15()+"\r\n");
            fileWriter.write(model.getLv16()+"\r\n");
            fileWriter.write(model.getLv17()+"\r\n");
            fileWriter.write(model.getLv18()+"\r\n");
            fileWriter.write(model.getLv19()+"\r\n");}
            if (getGo()==1) {
                fileWriter.write(model.getHuang1() + "\r\n");
                fileWriter.write(model.getHuang2() + "\r\n");
                fileWriter.write(model.getHuang3() + "\r\n");
                fileWriter.write(model.getHuang4() + "\r\n");
                fileWriter.write(model.getHuang5() + "\r\n");
                fileWriter.write(model.getHuang6() + "\r\n");
                fileWriter.write(model.getHuang7() + "\r\n");
                fileWriter.write(model.getHuang8() + "\r\n");
                fileWriter.write(model.getHuang9() + "\r\n");
                fileWriter.write(model.getHuang10() + "\r\n");
                fileWriter.write(model.getHuang11() + "\r\n");
                fileWriter.write(model.getHuang12() + "\r\n");
                fileWriter.write(model.getHuang13() + "\r\n");
                fileWriter.write(model.getLan1() + "\r\n");
                fileWriter.write(model.getLan2() + "\r\n");
                fileWriter.write(model.getLan3() + "\r\n");
                fileWriter.write(model.getLan4() + "\r\n");
                fileWriter.write(model.getLan5() + "\r\n");
                fileWriter.write(model.getLan6() + "\r\n");
                fileWriter.write(model.getLan7() + "\r\n");
                fileWriter.write(model.getLan8() + "\r\n");
                fileWriter.write(model.getLan9() + "\r\n");
                fileWriter.write(model.getLan10() + "\r\n");
                fileWriter.write(model.getLan11() + "\r\n");
                fileWriter.write(model.getLan26() + "\r\n");
                fileWriter.write(model.getLan13() + "\r\n");
            }
                if (currentPlayer==Color.red){
                    fileWriter.write("1"+"\r\n");
                }
                if (currentPlayer==Color.GREEN){
                    fileWriter.write("2"+"\r\n");
                }
                if (currentPlayer==Color.yellow){
                    fileWriter.write("3"+"\r\n");
                }
                if (currentPlayer==Color.blue){
                    fileWriter.write("4"+"\r\n");
                }



            //fileWriter.write("共"+i+"条");
            fileWriter.flush();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void change(){
        model.setTest(0);
    }

    public void setGo(int go) {
        Go = go;
    }//为选择模式而添加

    public void setCancel(ChessBoardLocation cancel) {
        this.cancel = cancel;
    }

    public void setAbolish(ChessComponent abolish) {
        this.abolish = abolish;
    }

    public void setCancelPiece(ChessBoardLocation cancelPiece) {
        this.cancelPiece = cancelPiece;
    }

    public void setSelectPiece(ChessPiece selectPiece) {
        this.selectPiece = selectPiece;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(String b) {
        this.b = b;
    }

    public void setNan0(int nan0) {
        this.nan0 = nan0;
    }

    public void setNan1(int nan1) {
        this.nan1 = nan1;
    }

    public void setNan2(int nan2) {
        this.nan2 = nan2;
    }

    public void setNan3(int nan3) {
        this.nan3 = nan3;
    }

    public void setNan4(int nan4) {
        this.nan4 = nan4;
    }

    public void setNan5(int nan5) {
        this.nan5 = nan5;
    }

    public void setNan6(int nan6) {
        this.nan6 = nan6;
    }

    public void setNan7(int nan7) {
        this.nan7 = nan7;
    }

    public void setNan8(int nan8) {
        this.nan8 = nan8;
    }

    public void setNan9(int nan9) {
        this.nan9 = nan9;
    }

    public void setNan10(int nan10) {
        this.nan10 = nan10;
    }

    public void setNan11(int nan11) {
        this.nan11 = nan11;
    }

    public void setNan12(int nan12) {
        this.nan12 = nan12;
    }

    public void setNan13(int nan13) {
        this.nan13 = nan13;
    }

    public void setNan14(int nan14) {
        this.nan14 = nan14;
    }

    public void setNan15(int nan15) {
        this.nan15 = nan15;
    }

    public int getGo() {
        return Go;
    }//为选择模式而添加

    public ChessBoardLocation getCancel() {
        return cancel;
    }

    public ChessComponent getAbolish() {
        return abolish;
    }

    public ChessBoardLocation getCancelPiece() {
        return cancelPiece;
    }

    public ChessPiece getSelectPiece() {
        return selectPiece;
    }

    public int getMode() {
        return mode;
    }

    public void setMode(int mode) {
        this.mode = mode;
    }

    public void setBei0(int bei0) {
        this.bei0 = bei0;
    }

    public void setBei1(int bei1) {
        this.bei1 = bei1;
    }

    public void setBei2(int bei2) {
        this.bei2 = bei2;
    }

    public void setBei3(int bei3) {
        this.bei3 = bei3;
    }

    public void setBei4(int bei4) {
        this.bei4 = bei4;
    }

    public void setBei5(int bei5) {
        this.bei5 = bei5;
    }

    public void setBei6(int bei6) {
        this.bei6 = bei6;
    }

    public void setBei7(int bei7) {
        this.bei7 = bei7;
    }

    public void setBei8(int bei8) {
        this.bei8 = bei8;
    }

    public void setBei9(int bei9) {
        this.bei9 = bei9;
    }

    public void setBei10(int bei10) {
        this.bei10 = bei10;
    }

    public void setBei11(int bei11) {
        this.bei11 = bei11;
    }

    public void setBei12(int bei12) {
        this.bei12 = bei12;
    }

    public void setBei13(int bei13) {
        this.bei13 = bei13;
    }

    public void setBei14(int bei14) {
        this.bei14 = bei14;
    }

    public void setBei15(int bei15) {
        this.bei15 = bei15;
    }

    public int getA() {
        return a;
    }

    public String getB() {
        return b;
    }

    public String toString(Color color){
        ArrayList<String> list = new ArrayList<>();
        list.add("红色");
        list.add("绿色");
        list.add("蓝色");
        list.add("黄色");
        ArrayList<Color> colorArrayList = new ArrayList<>();
        colorArrayList.add(Color.RED);
        colorArrayList.add(Color.GREEN);
        colorArrayList.add(Color.blue);
        colorArrayList.add(Color.yellow);

        int i = colorArrayList.indexOf(color);
        return list.get(i);
    }
    public ArrayList<ChessBoardLocation> huodeweizhi(ChessBoardLocation chessBoardLocation){
        next(1);change();
        next(1);change();
        ArrayList<ChessBoardLocation> c=new ArrayList<>();
        c.add(chessBoardLocation);
        for (int i=0;i<16;i++){
            if (i==0){
                setNan0(i);
            }if (i==1){
                setNan1(i);
            }if (i==2){
                setNan2(i);
            }if (i==3){
                setNan3(i);
            }if (i==4){
                setNan4(i);
            }if (i==5){
                setNan5(i);
            }if (i==6){
                setNan6(i);
            }if (i==7){
                setNan7(i);
            }if (i==8){
                setNan8(i);
            }if (i==9){
                setNan9(i);
            }if (i==10){
                setNan10(i);
            }if (i==11){
                setNan11(i);
            }if (i==12){
                setNan12(i);
            }if (i==13){
                setNan13(i);
            }if (i==14){
                setNan14(i);
            }if (i==15){
                setNan15(i);
            }
            for (int j=0;j<16;j++) {
                if (i==0){
                    setBei0(i);
                }if (i==1){
                    setBei1(i);
                }if (i==2){
                    setBei2(i);
                }if (i==3){
                    setBei3(i);
                }if (i==4){
                    setBei4(i);
                }if (i==5){
                    setBei5(i);
                }if (i==6){
                    setBei6(i);
                }if (i==7){
                    setBei7(i);
                }if (i==8){
                    setBei8(i);
                }if (i==9){
                    setBei9(i);
                }if (i==10){
                    setBei10(i);
                }if (i==11){
                    setBei11(i);
                }if (i==12){
                    setBei12(i);
                }if (i==13){
                    setBei13(i);
                }if (i==14){
                    setBei14(i);
                }if (i==15){
                    setBei15(i);
                }

                if (model.isValidMove(chessBoardLocation,new ChessBoardLocation(i,j),0)==0){
                    c.add(new ChessBoardLocation(i,j));
                }
            }
        }
        next(1);change();
        next(1);change();
        return c;
    }

    public int getNan0() {
        return nan0;
    }

    public int getNan1() {
        return nan1;
    }

    public int getNan2() {
        return nan2;
    }

    public int getNan3() {
        return nan3;
    }

    public int getNan4() {
        return nan4;
    }

    public int getNan5() {
        return nan5;
    }

    public int getNan6() {
        return nan6;
    }

    public int getNan7() {
        return nan7;
    }

    public int getNan8() {
        return nan8;
    }

    public int getNan9() {
        return nan9;
    }

    public int getNan10() {
        return nan10;
    }

    public int getNan11() {
        return nan11;
    }

    public int getNan12() {
        return nan12;
    }

    public int getNan13() {
        return nan13;
    }

    public int getNan14() {
        return nan14;
    }

    public int getNan15() {
        return nan15;
    }

    public int getBei0() {
        return bei0;
    }

    public int getBei1() {
        return bei1;
    }

    public int getBei2() {
        return bei2;
    }

    public int getBei3() {
        return bei3;
    }

    public int getBei4() {
        return bei4;
    }

    public int getBei5() {
        return bei5;
    }

    public int getBei6() {
        return bei6;
    }

    public int getBei7() {
        return bei7;
    }

    public int getBei8() {
        return bei8;
    }

    public int getBei9() {
        return bei9;
    }

    public int getBei10() {
        return bei10;
    }

    public int getBei11() {
        return bei11;
    }

    public int getBei12() {
        return bei12;
    }

    public int getBei13() {
        return bei13;
    }

    public int getBei14() {
        return bei14;
    }

    public int getBei15() {
        return bei15;
    }
}
