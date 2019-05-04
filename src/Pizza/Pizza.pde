import ddf.minim.*;     //at the top of the sketch
Minim minim;     //at the top of the sketch
AudioPlayer sound;    //at the top of the sketch


void setup(){
size(500, 500);
fill(#C4BB67);
ellipse(250,250,300,300);
fill(#F7340C);
ellipse(250,250,280,280);
fill(#E9FF03);
ellipse(250,250,260,260);
minim = new Minim(this);      //in the setup method
sound = minim.loadFile("sound.wav");

}
void draw(){
  
  size(500, 500);
fill(#C4BB67);
ellipse(250,250,300,300);
fill(#F7340C);
ellipse(250,250,280,280);
fill(#E9FF03);
ellipse(250,250,260,260);

 PImage pepperoni = loadImage("download.png");
pepperoni.resize(40,40);

if (mousePressed && (mouseButton == RIGHT)) {
  sound.play();
sound.rewind();
image(pepperoni, 200, 200); 

image(pepperoni, 300, 240); 
image(pepperoni, 150, 200); 

}

  
  
  
}
