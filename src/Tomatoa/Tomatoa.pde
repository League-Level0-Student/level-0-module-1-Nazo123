void setup() {
    size(500, 500);
}
void draw() {
    background(200, 200, 200);
   
    noStroke();
    fill(#FF1F0A);
    ellipse(150, 200, 150, 150);
    
    ellipse(212, 200, 150, 150);
    fill(#24D139);
    rect(176, 103, 12, 32);
     if (mousePressed){fill(200,200,200);ellipse(100, 200, 150, 150);}
    
}