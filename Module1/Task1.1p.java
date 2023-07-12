// C++ code
// two sensors in the form of LEDs are used and a slideswitch is used as the actuator
int LED1 = 13;
int LED2 = 7;
int SlideSwitch = 12;
void setup()
{
  pinMode(LED1, OUTPUT);
  pinMode(LED2, OUTPUT);
  pinMode(SlideSwitch, INPUT);
  Serial.begin(9600);
}

void loop()
{
  // if the slideswitch is on, the LED1 is turned on and the LED2 is off
  if (digitalRead(SlideSwitch)){
    digitalWrite(LED1, HIGH);
    digitalWrite(LED2, LOW);
    Serial.println("SwitchON : LED1 is ON");
    Serial.println();
  }
  else {
    // if the slideswitch is off, the LED2 is turned on and the LED1 is off
    digitalWrite(LED1, LOW);
    digitalWrite(LED2, HIGH);
    Serial.println("SwitchOFF : LED2 is ON");
    Serial.println();
  }
  
  
  delay(500);
}