int y = 100; 
String  text = "ice cream";

void setup() {
    size(800, 800);
}

void draw() {
int i;
for(i=1; i<=4; i++ ) {
  if(i==4){
    text = "banana";
  }
  text( text, 250, y);
 y += 50;
}
 y = 100;
 text = "ice cream";
}
