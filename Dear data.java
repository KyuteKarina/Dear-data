// create data visualisation of my cats meows and the context surroudning them
// perhaps visualise as simplified cat sketches or have the data draw out her
// or represent in circles/ shapes of different colour and size

float  headW;
float  headH;
float  headX;
float  headY;
 float earL1L ;
 float earL2l ;
  float earL1R ;
 float earL2R ;
  float earR1L ;
 float earR2L ;
  float earR1R ;
 float earR2R ;
 float eyeLD ;
 float eyeLX ;
 float eyeLY ;
 float eyeRD  ;
 float eyeRX  ;
 float eyeRY ;
 float irisLD ;
 float irisLX ;
 float irisLY ;
 float irisRD ;
 float irisRX ;
 float irisRY ;
 float noseX1 ;
 float noseY1 ;
 float noseX2 ;
 float noseY2 ;
 float noseX3 ;
 float noseY3 ;

void setup()
{
  size(1000,1000);
  fill(#FFFFFF);

headW = 30;
headH = 25;
headX = 20;
headY = 30;

}
 
void draw()
{
  ellipse(headX, headY, headW, headH);
  
}