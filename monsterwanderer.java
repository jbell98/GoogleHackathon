import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class monsterWander extends Applet implements ActionListener, MouseListener, MouseMotionListener{
    
    Player player;
    Monster monster;
    int xposR;
    int yposR;
    int monsterx;
    int monstery;
    int monsterBoundsx;
    int mosnterBoundsy;
    int MAX_DISTANCE = 50;
    int direction = (int) (Math.random() * 360) % 360;
    int distance = (int) (Math.random() * MAX_DISTANCE) % MAX_DISTANCE;

    public void init()
    {
        addMouseListener(this);
        addMouseMotionListener(this);
        player = new Player(10, 10);
        monster = new Monster(200, 100);
        monsterx = 175;
        monstery = 75;
        monsterBoundsx = 50;
        monsterBoundsy = 50;


    }
    public void paint(Graphics g)
    {
        player.display(g);
        monster.display(g);

    }
    public void actionPerformed(ActionEvent ev)
    {}
    public void mousePressed(MouseEvent e)
    {}
    public void mouseReleased(MouseEvent e)
    {}
    public void mouseEntered(MouseEvent e)
    {}
    public void mouseExited(MouseEvent e)
    {}
    public void mouseMoved(MouseEvent e)
    {
    }
    public void mouseClicked(MouseEvent e)
    {}
    public void mouseDragged(MouseEvent e)
    {
        dog.setLocation(xposR, yposR);
        if (xposR > sheepx&& xposR < sheepx+sheepBoundsx && yposR > sheepy
                && yposR < sheepy+sheepBoundsy){
            sheep.setLocation(xposR + 50, yposR + 50);
        }

        xposR = e.getX();
        yposR = e.getY();
        repaint();

    }
}

class Player 
{
    int xpos;
    int ypos;
    int circleWidth = 30;
    int circleHeight = 30;

    public Player(int x, int y)
    {
        xpos = x;
        ypos = y;

    }

    public void setLocation(int lx, int ly)
    {
        xpos = lx;
        ypos = ly;
    }

    public void display(Graphics g)
    {
        g.setColor(Color.blue);
        g.fillOval(xpos, ypos, circleWidth, circleHeight);
    }       
}
class Monster
{
    int xpos;
    int ypos;
    int circleWidth = 10;
    int circleHeight = 10;

    public Monster(int x, int y)
    {
        xpos = x;
        ypos = y;

    }

    public void setLocation(int lx, int ly)
    {
        xpos = lx;
        ypos = ly;
    }

    public void display(Graphics g)
    {
        g.setColor(Color.green);
        g.fillOval(xpos , ypos, circleWidth, circleHeight);
    }


}
