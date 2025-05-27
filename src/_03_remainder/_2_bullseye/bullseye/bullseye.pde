
void setup() {
 
  // set the size of your sketch
  size(400,400);
  background(0,255,0,100);
  
}

void draw() {
  //Starting with the largest ellipse, use a for loop to draw a bullseye with ellipses.
  int i;
  for(i=0; i<=7; i++) {
    int x = 200-i*25;
    int y = 200-i*25;
    if(i % 2 == 0) {
      fill(255,0,0,500);
      
    }
    else {
      fill(0,0,0,500);
    }
    ellipse(200,200,x,y);
  }
  //Use an if statement and remainder to alternate the color of your rings.
  
  
}
