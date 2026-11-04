// create data visualisation of my cats meows and the context surroudning them
// perhaps visualise as simplified cat sketches or have the data draw out her
// or represent in circles/ shapes of different colour and size

float  headW;
float  headH;
float  headX;
float  headY;
float earL1X1 ;
float earL1Y1 ;
float earL1X2 ;
float earL1Y2 ;
float earL2X1 ;
float earL2Y1 ;
float earL2X2 ;
float earL2Y2 ;
float earR1X1 ;
float earR1Y1 ;
float earR1X2;
float earR1Y2 ;
float earR2X1 ;
float earR2Y1 ;
float earR2X2 ;
float earR2Y2 ;
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
  size(1000, 1000);
  fill(#FFFFFF);

  headW = 60;
  headH = 50;
  headX = 40;
  headY = 60;

  earL1X1 = 14 ;
  earL1Y1 = 46 ;
  earL1X2 = 26 ;
  earL1Y2 = 20;

  earL2X1 =26 ;
  earL2Y1 =20 ;
  earL2X2 = 36 ;
  earL2Y2 =35 ;

  earR1X1= 66 ;
  earR1Y1=46 ;
  earR1X2= 54 ;
  earR1Y2 =20;

  earR2X1 = 54;
  earR2Y1=20 ;
  earR2X2=44 ;
  earR2Y2 =35;
}

void draw()
{
  ellipse(headX, headY, headW, headH);
  line(earL1X1, earL1Y1, earL1X2, earL1Y2 );
  line(earL2X1, earL2Y1, earL2X2, earL2Y2 );
  line(earR1X1, earR1Y1, earR1X2, earR1Y2 );
  line(earR2X1, earR2Y1, earR2X2, earR2Y2 );
}
