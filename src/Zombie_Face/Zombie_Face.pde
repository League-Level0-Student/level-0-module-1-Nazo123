void setup(){
PImage face = loadImage("face.jpg");


size(500, 500);

face.resize(500, 500);
image(face, 0, 0);

}
void draw(){
  fill(mouseX,mouseY,100);
  ellipse(150,250,100,100);
  
   fill(mouseX,mouseY,100);
  ellipse(350,250,100,100);
  
  
  
  
}