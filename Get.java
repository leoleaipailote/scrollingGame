//Gets are entities that the player wants to collide with, as they increase
//their ammunition, but does not award points.
//RareGets do not have this function.
public class Get extends Entity implements Consumable, Scrollable {
     
    //Location of image file to be drawn for a Get
    private static final String GET_IMAGE_FILE = "assets/dragonballs.png";
    //Dimensions of the Get  
    private static final int GET_WIDTH = 65;
    private static final int GET_HEIGHT = 65;
    //Speed that the Get moves (in pixels) each time the game scrolls
    private static final int GET_SCROLL_SPEED = 5;
    //Amount of points received when player collides with a Get
    private static final int GET_POINT_VALUE = 20;

    
    public Get(){
        this(0, 0);        
    }
    
    public Get(int x, int y){
        super(x, y, GET_WIDTH, GET_HEIGHT, GET_IMAGE_FILE);  
    }
    
    public Get(int x, int y, String imageFileName){
        super(x, y, GET_WIDTH, GET_HEIGHT, imageFileName);
    }
    
    public int getScrollSpeed(){
        return GET_SCROLL_SPEED;
    }
    
    //Move the Get left by its scroll speed
    public void scroll(){
        setX(getX() - GET_SCROLL_SPEED);
    }
    
    //Colliding with a Get increases the player's score by the specified amount
    public int getPointsValue(){
        return GET_POINT_VALUE;
    }
    
    //Colliding with a Get does not affect the player's HP
    public int getDamageValue(){
        return 0;
    }
    
    public int getReload(){
    	return 2;
    }
   
}
