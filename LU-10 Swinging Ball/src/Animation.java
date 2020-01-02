/**
 * Created by student on 27.11.2019 г..
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Animation extends JApplet implements Runnable, ActionListener{
    int miFrameNumber= -1;
    int miTimeStep;Thread mAnimationThread;
    boolean mbIsPaused= false;
    Button mButton;
    Point mCenter;
    int miRadius;
    int miDX, miDY;

public void init(){
    miTimeStep=50;
    mCenter = new Point(getSize().width/2,getSize().height/2);
    miRadius = 15;
    miDX = 4;
    miDY = 3;
    mButton = new Button("Stop");
    getContentPane().add(mButton,"North");
    mButton.addActionListener(this);
    getContentPane().add(new JPanel(){
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawString("Frame" + miFrameNumber, getSize().width/2 - 40, getSize().height - 15);
        g.setColor(Color.red);
        g.fillOval(mCenter.x-miRadius, mCenter.y - miRadius, 2*miRadius, 2*miRadius);
     }
    },"Center");
  }
    public void start(){
     if(mbIsPaused){
     } else {
         if (mAnimationThread==null){
             mAnimationThread = new Thread(this);
         }
         mAnimationThread.start();
     }
    }
  public void stop(){
    mAnimationThread= null;
    }
    public void actionPerformed(ActionEvent e){
      if(mbIsPaused){
          mbIsPaused=false;
          mButton.setLabel("Stop");
          start();
      } else {
          mbIsPaused = true;
          mButton.setLabel("Start");
          stop();
      }
    }
    public void run(){
        Thread.currentThread().setPriority(Thread.MIN_PRIORITY);
        long startTime = System.currentTimeMillis();
        Thread currentTime = Thread.currentThread();
        while (currentTime == mAnimationThread) {
            miFrameNumber++;
            move();
            repaint();
            try{
                startTime +=miTimeStep;
                Thread.sleep(Math.max(0,startTime - System.currentTimeMillis()));
            }
            catch (InterruptedException e){
                break;
            }
        }
    }
    void move(){
        mCenter.x+=miDX;
        if(mCenter.x - miRadius < 0 || mCenter.x + miRadius > getSize().width){
            miDX = -miDX;
            mCenter.x += 2*miDX;
        }
        mCenter.y +=miDY;
        if(mCenter.y - miRadius < 0 || mCenter.y + miRadius > getSize().height){
            miDY = -miDY;
            mCenter.y += 2*miDY;
        }
     }
  }

