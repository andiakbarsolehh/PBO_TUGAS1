import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(500, 400, 1); 
        prepare();
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        flight flight = new flight();
        addObject(flight,83,360);
        bola bola = new bola();
        addObject(bola,176,135);
        bola bola2 = new bola();
        addObject(bola2,104,137);
        bola bola3 = new bola();
        addObject(bola3,58,188);
        bola bola4 = new bola();
        addObject(bola4,105,253);
        bola bola5 = new bola();
        addObject(bola5,191,333);
        bola bola6 = new bola();
        addObject(bola6,303,253);
        bola bola7 = new bola();
        addObject(bola7,348,185);
        bola bola8 = new bola();
        addObject(bola8,296,136);
        bola bola9 = new bola();
        addObject(bola9,211,196);
        bola.setLocation(169,168);
        bola8.setLocation(271,146);
        bola2.setLocation(87,144);
        bola2.setLocation(106,137);
        bola9.setLocation(201,204);
        bola.setLocation(163,172);
        bola8.setLocation(276,144);
    }
}
