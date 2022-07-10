
void setup() {
    size(500, 500);
}
void draw() {
    fill(212,155,23);
ellipse(250, 250, 300, 300);
fill(238,58,67);
ellipse(250, 250, 265, 265);
fill(255,166,0);
ellipse(250, 250, 245, 245);

PImage pepperoni;
pepperoni = loadImage("pepperoni.png");
pepperoni.resize(50, 50);
image(pepperoni,200,200);
image(pepperoni,150,186);
image(pepperoni,250,317);
image(pepperoni,230,200);
image(pepperoni,260,230);
image(pepperoni,180,260);
image(pepperoni,240,250);
image(pepperoni,270,240);
image(pepperoni,270,150);
image(pepperoni,265,170);
image(pepperoni,220,250);
}
