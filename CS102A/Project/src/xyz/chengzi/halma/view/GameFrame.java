package xyz.chengzi.halma.view;

import xyz.chengzi.halma.MusicPlayer;
import xyz.chengzi.halma.controller.GameController;
import xyz.chengzi.halma.model.ChessBoard;

import javax.swing.*;
import java.applet.Applet;
import java.awt.*;
import java.net.MalformedURLException;
import java.util.ArrayList;

public class GameFrame extends JFrame {

    // 新增：Variables declaration - do not modify
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;

    public JLabel getStatusLabela() {
        return statusLabela;
    }

    public void setStatusLabela(JLabel statusLabela) {
        this.statusLabela = statusLabela;
    }

    JLabel statusLabela;

    static MusicPlayer mac;

    public static MusicPlayer getMac() {
        return mac;
    }

    public static void setMac(MusicPlayer mac) {
        GameFrame.mac = mac;
    }

    private static String text;

    public static String getText() {
        return text;
    }

    public static void setText(String text) {
        GameFrame.text = text;
    }


    private static javax.swing.JLabel jLable;

    public static JLabel getjLable() {
        return jLable;
    }

    public static void setjLable(JLabel jLable) {
        GameFrame.jLable = jLable;
    }

    // End of variables declaration
    public GameFrame(int Mode) {

        //以下时的新增菜单栏：
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenu1.setText("File");

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, 0));
        jMenuItem2.setText("Restart");

        jMenu1.add(jMenuItem2);

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("Save");


        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);


        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 279, Short.MAX_VALUE)
        );

        pack();
        //新增片段完毕。

        setTitle("2020 CS102A Project Demo");
        setSize(720, 760);
        setLocationRelativeTo(null); // Center the window
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(null);


            ChessBoardComponent chessBoardComponent = new ChessBoardComponent(660, 16);
        ChessBoard chessBoard = new ChessBoard(16);
        GameController controller = new GameController(chessBoardComponent, chessBoard, Mode);
        add(chessBoardComponent);



        JButton button = new JButton("静音");
        //以下是修改部分
        mac = new MusicPlayer();
        try {
            mac.setAudioClip(Applet.newAudioClip((new
                    java.io.File("F:\\文档\\JAVA\\project\\5.26\\project ttt\\Halma\\src\\META-INF\\Ap.wav")).toURL()));

        } catch (MalformedURLException malformedURLException) {
            malformedURLException.printStackTrace();
        }catch(Exception e){
            System.out.print("异常");
        }
        mac.loop();
        int[] count = {0};
        button.addActionListener((e) ->
        {
            //JOptionPane.showMessageDialog(this, "Button clicked!");
            count[0]++;
            if (count[0] % 2 == 1) {
                mac.stop();
                button.setText("取消静音");
                count[0] -= 2;
            } else {
                button.setText("静音");
                mac.loop();
            }

        });//填写你自己的文件路径
        button.setLocation(240, 660);
        button.setSize(77, 28);
        add(button);

        JButton btnRestart = new JButton("restart");
        btnRestart.addActionListener(e -> {
            controller.reStart(controller.getGo());
        });
        btnRestart.setLocation(540, 660);
        btnRestart.setSize(70, 28);
        //add(btnRestart);

        jMenuItem2.addActionListener(e -> {
            controller.reStart(controller.getGo());
        });

        JButton btnNextPlay = new JButton("next");
        btnNextPlay.addActionListener(e -> {
            controller.next(chessBoard.getTest());
            controller.change();
        });
        btnNextPlay.setLocation(440, 660);
        btnNextPlay.setSize(70, 28);
        add(btnNextPlay);

        JButton btnRetract = new JButton("save");
        btnRetract.addActionListener(e -> {
            controller.save(0);
        });
        btnRetract.setLocation(640, 660);
        btnRetract.setSize(70, 28);
        //add(btnRetract);

        jMenuItem1.addActionListener(e -> {
            controller.save(0);
        });

        JButton btnLoad = new JButton("load");
        btnLoad.addActionListener(e -> {
            controller.load();
        });
        btnLoad.setLocation(350, 660);
        btnLoad.setSize(70, 28);
        add(btnLoad);

        JButton btnRegret = new JButton("regret");
        btnRegret.addActionListener(e -> {
            controller.regret();
        });
        btnRegret.setLocation(150, 660);
        btnRegret.setSize(70, 28);
        add(btnRegret);

        //以下是标签未完成部分，请勿修改
        String text = GameController.getText();
        //System.out.println(text);
        statusLabela = new JLabel(text);
        statusLabela.setLocation(10, 660);
        statusLabela.setSize(200, 18);
        Font f1= new Font("宋体",Font.BOLD,18);
        statusLabela.setFont(f1);
        add(statusLabela);


        //System.out.println(Mode);

    }


}
