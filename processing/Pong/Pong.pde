  int xPosition = 200;
  int yPosition = 200;
  int ballSpeedX = 4;
  int ballSpeedY = 4;
  
  import ddf.minim.*; 
  Minim minim;       
  AudioSample sound; 
  
 void setup(){
  minim = new Minim (this);    
  sound = minim.loadSample("PongGameDeathSound.mp3", 128);

  size(400,600);
}

void draw(){
  background(200,169,220);
  
  ellipse(xPosition, yPosition, 20, 20);
    fill(255,255,255);
    stroke(255,255,255);
    
    
   if(xPosition<0){
     ballSpeedX=4;
     } 
   
   if(xPosition>width){
       ballSpeedX=-4; 
     } 
     
   if(yPosition<0){
     ballSpeedY=4;     
   }
     
   if(yPosition>600 && yPosition<610){  
      sound.trigger();
   }
     
     rect(mouseX, 500, 60, 15);
     
   xPosition= xPosition+ballSpeedX;
   yPosition= yPosition+ballSpeedY;
   
}
//boolean intersects still needs more work 
boolean intersects(int ballX, int ballY, int paddleX, int paddleY, int paddleLength) {
  if (ballY > paddleY && ballX > paddleX && ballX < paddleX + paddleLength)
  return true;
  else 
  return false;
  }
  
  

/*
Start with a new sketch that contains setup() and draw() methods. Ask your teacher if you don't know how to do this. The suggestions under each step should help you with your program.

1.Make a canvas for your game.
  size(width, height)      //in setup method
  background(red, green, blue)  //in draw method

2. Draw a ball on the screen.
  ellipse(x, y, width, height)  //in draw method
  fill(red, green, blue)    //in draw method
  stroke(red, green, blue)    //in draw method

3. Make the ball move across the screen (left to right).
  //make a variable for the ball's X position and change it in the draw method.

4. Change the speed of the ball.
  //make a variable for the speed of the ball in the X direction (from left to right).
  //changing this variable should change the speed of your ball

5. Bounce the ball off the walls.
  width
  println(output)
  
6. Do the same in the Y (up and down) direction.
  height

7. Make a sound when the ball falls on the ground.
  //drop the sound file onto your sketch

  import ddf.minim.*;       //at the very top of your sketch
  Minim minim;        //at the top of your sketch
  AudioSample sound;      //at the top of your sketch
  minim = new Minim (this);    //in the setup method
  sound = minim.loadSample("BD.mp3", 128);//in the setup method
  sound.trigger();        //in draw method (when the ball hits the bottom)

8. Add a background image for your game.
PImage backgroundImage;         //at the top of your sketch
backgroundImage = loadImage("image.jpg");  //in the setup method
image(backgroundImage, 0, 0);      //in draw method image(backgroundImage, 0, 0, width, height);    //if you want to resize

9. Draw a paddle at the bottom of the screen
  rect(x, y, width, height);

10. Make the paddle move over and back with the mouse.
  mouseX

11. Make the ball change Y direction when it hits the paddle. Figure it out by yourself, or use this method:
boolean intersects(int ballX, int ballY, int paddleX, int paddleY, int paddleLength) {
if (ballY > paddleY && ballX > paddleX && ballX < paddleX + paddleLength)
return true;
else 
return false;
}

*/
