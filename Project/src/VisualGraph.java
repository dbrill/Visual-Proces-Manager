/**
 * Created by jamesdraper on 11/29/16.
 */

//package com.zetcode;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import javax.swing.*;
import javax.xml.soap.Node;


//public class NodeProc

class VisualGraph extends NodeProc {

   // NodeProc myNode = new NodeProc();

    JFrame guiFrame = new JFrame();

    public VisualGraph() {

        initUI();
    }

    private void initUI() {

        NodeProc myNode = new NodeProc();
        NodeProc myNode2 = new NodeProc(1, 2, 3);

        


        //Float pid = myNode2.getPid();

        //System.out.print(pid);

        //ArrayList<JButton> nodes = new ArrayList<JButton>();

        //JPanel panel = new JPanel(new FlowLayout());

        //this.guiFrame.add(panel);

        String[][] array = {
                {"35", ".01", ".5"},
                {"21", ".03", ".75"},
                {"20", ".05", ".7"},
                {"150", ".02", ".3"}
        };
        JButton[] buttons = new JButton[4];

        /*String[][] array = {
                {"35", ".01", ".5"}
        };*/

        /*String[] array = {
                "35",
                "45"
        };*/


        int location = 400;

        for(int i = 0; i <= array.length; i++){

            //panel.add(new JButton("test2"));
            //this.guiFrame.setLocation(10,10);
            //JButton nodeBtn = new JButton(array[i].getCpu();


            //nodes.add(new JButton(array[i].getPID()));
            //ram = array[i].getRAM
            //buttons[i] = new JButton(pid);

            //Pid name on button
            Float pidF = myNode2.getPid();
            int pidI = Math.round(pidF);
            String pid = Integer.toString(pidI);


            JButton nodeBtn = new JButton(pid);

            //Button Size from ram
            Float ramF = myNode2.getCpuUsage();
            ramF = ramF * 100;
            int ram = Math.round(ramF);
            nodeBtn.setSize(ram,ram);

            //Button Color, not fleshed out
            nodeBtn.setBackground(Color.red);

            nodeBtn.setLocation(0, location);
            location = location - 100;

            createLayout(nodeBtn);


            //buttons[i] = new JButton(array[i][0]);

            /*String ramS = array[i][2];
            //System.out.print(ramHold);
            Float ramF = Float.parseFloat(ramS);

            ramF = ramF * 100;

            int ram = Math.round(ramF);

            //System.out.print(ram);
            buttons[i].setSize(ram,ram);

            buttons[i].setLocation(0,location);

            location = location + 100;*/


        }

        /*for(int j = 0; j < buttons.length; j++){
            createLayout(buttons[j]);
        }*/

        //panel.add(new JButton("test"));

        //panel.add(new JButton("test2"));

        JButton quitButton = new JButton("Quit");
        JButton nodeButton = new JButton("Node");

        quitButton.addActionListener((ActionEvent event) -> {
            System.exit(0);
        });

        nodeButton.addActionListener((ActionEvent event) -> {
            System.exit(0);
        });

        //createLayout(quitButton);
        //createLayout(nodeButton);

        guiFrame.setTitle("buttons");
        guiFrame.setSize(800, 800);
        guiFrame.setLocationRelativeTo(null);
        //guiFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void createLayout(JComponent... arg) {

        Container pane = guiFrame.getContentPane();
        GroupLayout gl = new GroupLayout(pane);
        pane.setLayout(gl);

        gl.setAutoCreateContainerGaps(true);

        gl.setHorizontalGroup(gl.createSequentialGroup()
                .addComponent(arg[0])
        );

        gl.setVerticalGroup(gl.createSequentialGroup()
                .addComponent(arg[0])
        );
    }

    public static void main(String[] args) {

        EventQueue.invokeLater(() -> {
            VisualGraph ex = new VisualGraph();
            ex.guiFrame.setVisible(true);
        });
    }
}



/*import javax.swing.*;

public class VisualGraph {
    private Arraylist<GraphNode> nodes;
    private Boolean addNode() {
        return true;
    }
    public void setNodeList(Arraylist<GraphNode> myNodes){
        this.nodes = myNodes;
        return;
    }
    private Boolean removeNode() {
        return true;

    }
}*/