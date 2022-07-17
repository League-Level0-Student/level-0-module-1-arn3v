PImage face; 

void setup() {
 face = loadImage("face.png");
size(500, 500);
}
void draw() {
face.resize(300, 300);
image(face, 100, 100);
ellipse(220, 200, 80, 80);
fill(0,0,0);
ellipse(220, 200, 20, 20);
ellipse(330, 200, 80, 80);
}
