public class JavaCz1{

public static void main(String[] args) {
//J1
System.out.print("Ernest ");
System.out.print("Damian ");
System.out.print("Krystian");
//lub
System.out.print("Ernest Damian Krystian");

//J2
System.out.println(„SQL");
System.out.print(„Python");
System.out.print(„Front-end");
System.out.print(„Java");
//J3
System.out.println("###Program1###");
System.out.println("Ernest Damian Krystian");
System.out.println("###Program2###");
System.out.println("SQL");
System.out.println("Python");
System.out.println("Front-end");
System.out.println("Java");
System.out.println("############");
//J4
/* Jest to prosty progam wprowadzający*/
System.out.println("###Program1###"); //to jest linia wyświetlająca ###Program1###
System.out.println("Ernest Damian Krystian");
System.out.println("###Program2###");
System.out.println("SQL");
System.out.println("Python");
System.out.println("Front-end");
System.out.println("Java");
System.out.println("############");
//J5
System.out.println("   J   a   v     v   a");
System.out.println("   J  aa   v     v   aa");
System.out.println("J J  aaaaa   V  V   aaaaaa");
System.out.println("JJ  a    a   V     a     a");
//J6
System.out.println("Cześć Jan, słyszałem, że masz " + 25 + " lat i uczysz się programowania, czy to prawda?");
System.out.println(true);
System.out.println("Czy twoje inicjały to " + 'J' + 'K' + " ?");
System.out.println("Tak, " + true);
//J7
final float PI = 3.14f;
int x = 0;
float g = 0.1f;
boolean toBeOrNotToBe = true;
String film = "Zycie jest piękne";
char znak = 'J';
System.out.println("To jest int " + x);
System.out.println("To jest float " + g);
System.out.println("To jest boolean " + toBeOrNotToBe);
System.out.println("Film który lubie " + film);
System.out.println("To jest znak " + znak);
System.out.println(PI);
//J8
String a = "Ala ";
String b= "ma ";
String c = a+b;
String d = c +"kota";
System.out.println(c.toUpperCase());
System.out.println(d.toLowerCase());
//J9
String a = "Ala ";
String b= "ma ";
String c = a+b;
String d = c +"kota";
System.out.println("Zmienna d ma dlugosć: " + d.length());
System.out.println(" 3 i 6 znak w trzecim ciągu to: "+ c.charAt(2) +" "+ c.charAt(5));
System.out.println("piąty znak od końca czwartego ciągu to: " + d.charAt(d.length()-3));
//J10
System.out.println("Pierwszy i drugi wyraz zmiennej d to: " + d.substring(0,a.length()) +" "+ d.substring(a.length(),a.length()+b.length()));
//J11
float q = 4.6f;
float x = 3.5f;
System.out.print((int)(q/x));
//J12
int a = 20;
int b = 30;
int c = a+b; 
System.out.println("To jest suma: " + c);
int d = a-b;
System.out.println("To jest różnica: " + d);
int e = a*b;
System.out.println("To jest iloczyn: " + e);
float f = (float)a/b;
System.out.println("To jest iloraz: " + f);
int g = b%a;
System.out.println("To jest reszta z dzelenia(modulo): " + g);
//J13
System.out.println("-5+8*6 = " + (-5+8*6));
System.out.println("(55+9)%9 = " +((55+9)%9));
System.out.println("20+-3*5/8 = " + (20+((-3*5)/8)));
System.out.println("5 + 15 / 3 * 2 - 8 % 3 = " + (5 + 15 / 3 * 2 - 8 % 3));
//J14
System.out.println("Pierwsza liczba: " + (1*5));
System.out.println("Pierwsza liczba: " + (2*5));
System.out.println("Pierwsza liczba: " + (3*5));
System.out.println("Pierwsza liczba: " + (4*5));
System.out.println("Pierwsza liczba: " + (5*5));
System.out.println("Pierwsza liczba: " + (6*5));
System.out.println("Pierwsza liczba: " + (7*5));
System.out.println("Pierwsza liczba: " + (8*5));
System.out.println("Pierwsza liczba: " + (9*5));
//J15
System.out.println("Wynik: " + (((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5))));
System.out.println("Wynik: " + (4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11))));
//J16
Random gen = new Random();
int x = gen.nextInt(10);
int y = gen.nextInt(10);
System.out.println("Liczba x =" + x + " liczba y =" + y);
System.out.println("Czy x jest większe od y?: " + (x>y));
System.out.println("Czy x pomnożone przez 2 jest większe od y?: " + (2*x>y));
System.out.println("Czy y jest mniejsze od sumy x+3 i jednocześnie większe od x pomniejszonego o 2?: " + ((y<x+3)&&(y>x-2)));
System.out.println("Czy iloczyn liczb x i y jest parzysty?: " + (x%y==0));
//J17
BigInteger firstBig = new BigInteger("43325657687687687898796780");
BigInteger secondBig = new BigInteger("43696789053802384982340432543545");
BigInteger tempBig = new BigInteger("0");
tempBig = firstBig.add(secondBig);
System.out.println(tempBig.toString());
tempBig = firstBig.subtract(secondBig);
System.out.println(tempBig.toString());
tempBig = firstBig.multiply(secondBig);
System.out.println(tempBig.toString());
tempBig = secondBig.divide(firstBig);
System.out.println(tempBig.toString());
//J18
int a = 5;
float b = 7f;
System.out.println(a+b);
System.out.println(a-b);
System.out.println(a*b);
System.out.println(b/a);
//J19
Scanner rl = new Scanner(System.in);
System.out.print("Podaj swoje Imie: ");
String wyraz1 = rl.nextLine();
rl.useLocale(Locale.US);
System.out.print("Witaj " + wyraz1 + " na kursie Java!");
rl.close();
//J20
Scanner rl = new Scanner(System.in);
double x = 0, y = 0;
x = rl.nextDouble();
rl.nextLine();
x += rl.nextDouble();
rl.nextLine();
x += rl.nextDouble();
rl.nextLine();
System.out.println("Średnia z trzech liczb : " + x/3);
rl.close();
//J21
Scanner rl = new Scanner(System.in);
double x = 0, y = 0;
System.out.println("Podaj x");
x = rl.nextDouble();
rl.nextLine();
System.out.println("Podaj y");
y = rl.nextDouble();
rl.nextLine();
System.out.println("x==y: " + (x==y));
System.out.println("x>y: " + (x>y));
System.out.println("x>=y: " + (x>=y));
System.out.println("x<=y: " + (x<=y));
System.out.println("x>y: " + (x<y));
System.out.println("x!=y: " + (x!=y));
rl.close();
//J22
Scanner rl = new Scanner(System.in);
double x = 0, y = 0;
System.out.println("Podaj bok sześciokata");
x = rl.nextDouble();
rl.nextLine();
x = (3*pow(x,2)*sqrt(3))/2;
System.out.println("Pole sześciokąta foremnego to: " + x);
rl.close();
//J23
final double oneDegreeLenght = 111;
Scanner rl = new Scanner(System.in);
System.out.println("Podaj pierwszą współrzedną pierwszego punktu x1: ");
double x1 = rl.nextFloat();
rl.nextLine();
System.out.println("Podaj drugą współrzędną pierwszego punktu x2: ");
double x2 = rl.nextFloat();
rl.nextLine();
System.out.println("Podaj pierwszą współrzedną drugiego punktu y1: ");
double y1 = rl.nextFloat();
rl.nextLine();
System.out.println("Podaj drugą współrzędną drugiego punktu y2: ");
double y2 = rl.nextFloat();
rl.nextLine();
double dist = oneDegreeLenght * sqrt(pow((x1-y1),2)+pow((cos((x1*PI)/180)*(x2-y2)), 2));
System.out.println("Odległość między dwoma punktami na ziemi to : " + dist);
//J24
Scanner rl = new Scanner(System.in);
String wyraz;
System.out.println("Podaj jakiś ciąg znaków ");
wyraz = rl.nextLine();
StringBuffer bufor = new StringBuffer(wyraz);
System.out.println("Ciąg znaków odwrotnie to: " + bufor.reverse().toString());
rl.close();
//J25
Scanner rl = new Scanner(System.in);
String wyraz;
System.out.println("Podaj jakiś ciąg znaków ");
wyraz = rl.nextLine();
System.out.println("W troim ciągu jest " + wyraz.length() + " znaków");
rl.close();
//J25 następne
Scanner rl = new Scanner(System.in);
System.out.print("Wprowadz pierwszą liczbę \"x: " );
float x = rl.nextFloat();
rl.nextLine();
System.out.print("Wprowadz znak działania matemtycznego ktore chcesz wykonać: " );
String znak = rl.nextLine();
System.out.print("Wprowadz drugą liczbę y: " );
float y = rl.nextFloat();
rl.nextLine();
if(znak.equals("/")){
System.out.println("Wynik x/y=" + (x/y));
}
else if (znak.equals("*")) {
System.out.println("Wynik x*y=" + (x*y));
}
else if (znak.equals("+")) {
System.out.println("Wynik x+y=" + (x+y));
}
else if (znak.equals("-")) {
System.out.println("Wynik x-y=" + (x-y));
}
else
System.out.println("Wprowadziles zly znak");
rl.close();
//J26
Scanner rl = new Scanner(System.in);
System.out.println("Wprowadz liczbę");
rl.useLocale(Locale.US);
float number = rl.nextFloat();
if(number > 0 && number <1){
System.out.println("Liczba z przedzialu <0,1>");
}
else{
System.out.println("Liczba z poza przedziału <0,1>");
}

//J27
Scanner rl = new Scanner(System.in);
System.out.print("Wprowadz  liczbę \"x\": " );
int num = rl.nextInt();
rl.nextLine();
Random generator = new Random();
int f1 = generator.nextInt(50);
System.out.println("Pierwsza losowa liczba f1: " + f1);
int f2 = generator.nextInt(50);
System.out.println("Druga losowa liczba f2: " + f2);
int f3 = generator.nextInt(50);
System.out.println("Trzecia losowa liczba f3: " + f3);
int f4 = generator.nextInt(50);
System.out.println("Czwarta losowa liczba f4: " + f4);
int f5 = generator.nextInt(50);
System.out.println("Piąta losowa liczba f5: " + f5);
if(f1>num){
System.out.println("f1 > wprowadzonej liczby");
}
else if(f1<num){
System.out.println("f1 < wprowadzonej liczby");
}
else{
System.out.println("f1 = wprowadzonej liczbie");
}
if(f2>num){
System.out.println("f2 > wprowadzonej liczby");
}
else if(f2<num){
System.out.println("f2 < wprowadzonej liczby");
}
else{
System.out.println("f2 = wprowadzonej liczbie");
}
if(f3>num){
System.out.println("f3 > wprowadzonej liczby");
}
else if(f3<num){
System.out.println("f3 < wprowadzonej liczby");
}
else{
System.out.println("f3 = wprowadzonej liczbie");
}
if(f4>num){
System.out.println("f4 > wprowadzonej liczby");
}
else if(f4<num){
System.out.println("f4 < wprowadzonej liczby");
}
else{
System.out.println("f4 = wprowadzonej liczbie");
}
if(f5>num){
System.out.println("f5 > wprowadzonej liczby");
}
else if(f5<num){
System.out.println("f5 < wprowadzonej liczby");
}
else{
System.out.println("f5 = wprowadzonej liczbie");
}
//J28
Scanner rl = new Scanner(System.in);
System.out.println("Wprowadz liczbę od 1 do 3 aby wybrać który program ma być uruchomiony");
System.out.println("Czy liczba jest z przedziału <0,1> WYBIERZ 1");
System.out.println("Prosty kalkulator WYBIERZ 2");
System.out.println("5 losowych wart INT większych równych podanej wartości WYBIERZ 3");

switch (rl.nextLine()){
case "1":
System.out.println("Wprowadz liczbę");
rl.useLocale(Locale.US);
float number = rl.nextFloat();
if(number > 0 && number <1){
System.out.println("Liczba z przedzialu <0,1>");
}
else{
System.out.println("Liczba z poza przedziału <0,1>");
}
break;
case "2":
System.out.print("Wprowadz pierwszą liczbę \"x\": " );
float x = rl.nextFloat();
rl.nextLine();
System.out.print("Wprowadz znak działania matemtycznego ktore chcesz wykonać: " );
String znak = rl.nextLine();
System.out.print("Wprowadz drugą liczbę \"y\": " );
float y = rl.nextFloat();
rl.nextLine();
if(znak.equals("/")){
System.out.println("Wynik x/y=" + (x/y));
}
else if (znak.equals("*")) {
System.out.println("Wynik x*y=" + (x*y));
}
else if (znak.equals("+")) {
System.out.println("Wynik x+y=" + (x+y));
}
else if (znak.equals("-")) {
System.out.println("Wynik x-y=" + (x-y));
}
else
System.out.println("Wprowadziles zly znak");
break;
case "3":
System.out.print("Wprowadz  liczbę \"x\": " );
int num = rl.nextInt();
rl.nextLine();
Random generator = new Random();
int f1 = generator.nextInt(50);
System.out.println("Pierwsza losowa liczba f1: " + f1);
int f2 = generator.nextInt(50);
System.out.println("Druga losowa liczba f2: " + f2);
int f3 = generator.nextInt(50);
System.out.println("Trzecia losowa liczba f3: " + f3);
int f4 = generator.nextInt(50);
System.out.println("Czwarta losowa liczba f4: " + f4);
int f5 = generator.nextInt(50);
System.out.println("Piąta losowa liczba f5: " + f5);
if(f1>num){
System.out.println("f1 > wprowadzonej liczby");
}
else if(f1<num){
System.out.println("f1 < wprowadzonej liczby");
}
else{
System.out.println("f1 = wprowadzonej liczbie");
}
if(f2>num){
System.out.println("f2 > wprowadzonej liczby");
}
else if(f2<num){
System.out.println("f2 < wprowadzonej liczby");
}
else{
System.out.println("f2 = wprowadzonej liczbie");
}
if(f3>num){
System.out.println("f3 > wprowadzonej liczby");
}
else if(f3<num){
System.out.println("f3 < wprowadzonej liczby");
}
else{
System.out.println("f3 = wprowadzonej liczbie");
}
if(f4>num){
System.out.println("f4 > wprowadzonej liczby");
}
else if(f4<num){
System.out.println("f4 < wprowadzonej liczby");
}
else{
System.out.println("f4 = wprowadzonej liczbie");
}
if(f5>num){
System.out.println("f5 > wprowadzonej liczby");
}
else if(f5<num){
System.out.println("f5 < wprowadzonej liczby");
}
else{
System.out.println("f5 = wprowadzonej liczbie");
}
break;
default:
System.out.println("Zly wybór");
break;
}
rl.close();
//J29
Scanner rl = new Scanner(System.in);
System.out.print("Wpisz liczbę całkowitą: " );
int number = rl.nextInt();
for (int i = 1; i<number; i++){
if(i%2 != 0){
System.out.println(i);
}
else{
continue;
}
}
rl.close();
//J30
Scanner rl = new Scanner(System.in);
System.out.print("Podaj ciąg znaków : ");
String d = rl.nextLine();
System.out.print("Podaj drugi ciąg znaków : ");
String g  = rl.nextLine();
String o = String.valueOf(g.charAt(g.length()-3));
System.out.println(o);
for(String i : d.split(o)){
System.out.println(i);
}
//J31
Scanner rl = new Scanner(System.in);
System.out.print("Podaj wiek : ");
int d = rl.nextInt();
if(d>18){
	System.out.print("Możesz głosować!");
}
else{
	System.out.print("Nie możesz głosować!");
}
//J32


//J33
Scanner rl = new Scanner(System.in);
boolean done = false;
while(!done){
System.out.println("Podaj liczbę całkowitą A: ");
int a = rl.nextInt();
rl.nextLine();
System.out.println("Podaj liczbę całkowitą B: ");
int b = rl.nextInt();
rl.nextLine();
int sum = 0;
int i = 0;
if(a<b){
for (i = a; i<=b;i++){
sum +=i;
}
System.out.println("Suma wykonana prz pomocy pentli for: wynik="+sum);
sum = 0;
i = a;
while(i<=b){
sum +=i; 
i++;
}
System.out.println("Suma wykonana prz pomocy pentli while: wynik="+sum);
sum = 0;
i = a;
do{
sum +=i; 
i++;
}while(i<=b);
System.out.println("Suma wykonana prz pomocy pentli do while: wynik="+sum);
done = true;
}
else{
System.out.println("A nie jest mniejsze od B");
}
}
//J34
Scanner rl = new Scanner(System.in);
System.out.println("Podaj wykładnik do którego ma byc wyświetlony ciąg potęg 2");
int wykl = rl.nextInt();
rl.nextLine();
for (int i=0; i<= wykl; i++){
System.out.println("Potęga 2 do "+ i + " wynosi " + (int)pow(2,i));
}
//J35
Scanner rl = new Scanner(System.in);
System.out.println("Podaj wszystki liczby kótre chcesz zsumować: ");
int lineNumber = 0;
int sumNumber = 0;
boolean hasZERO = false;
do{ 
if(rl.hasNextInt()){
lineNumber = rl.nextInt();
if(lineNumber != 0 ){
sumNumber+=lineNumber;
}
else{
hasZERO = true;
}
}
else{
System.out.println("Podaj poprawnie liczbę całkowitą: ");
}

}while(!hasZERO);
System.out.println("Suma wszystkich podanych liczb nie równych zero = " +sumNumber);
rl.close();

----- inne

Scanner rl = new Scanner(System.in);
System.out.println("Podaj wszystki liczby kótre chcesz zsumować: ");
int lineNumber = 0;
int sumNumber = 0;
while(true){ 
if(rl.hasNextInt()){
lineNumber = rl.nextInt();
if(lineNumber != 0 ){
sumNumber+=lineNumber;
}
else{
break;
}
}
else{
System.out.println("Podaj poprawnie liczbę całkowitą: ");
}

}
System.out.println("Suma wszystkich podanych liczb nie równych zero = " +sumNumber);
rl.close();

//J36
Scanner rl = new Scanner(System.in);
System.out.println("Podaj ciąg liczb całkowitych:");
int tempMin = 0;
int tempMax = 0;
boolean isOver = false;
while(!isOver){
String ciagZnakow = rl.nextLine();
Scanner cl = new Scanner(ciagZnakow);
while(true){
if(cl.hasNextInt()){
int g = cl.nextInt();
if(g !=0 ){
if(tempMin>g || tempMin == 0){
tempMin = g;
}
if(tempMax<g || tempMin == 0){
tempMax = g;
}
}
else{
isOver = true;
break;
}
}
else{
break;
}
}
cl.close();
}
System.out.println("Największa liczba to : " + tempMax);
System.out.println("Najmniejsza liczba to : " + tempMin);

System.out.println("Suma największej oraz najmniejszej liczby to : " + (tempMax + tempMin));
System.out.println("Średnia arytmeryczna największej oraz najmniejszej liczby to : " + ((tempMax + tempMin)/2));
rl.close();
//J37
Scanner rl = new Scanner(System.in);
boolean playAgain = false;
int range = 0;
int retryCounter = 0;
do{
int counter = retryCounter;
System.out.println("Podaj z jakiego przedziału ma być losowana liczba");
range = rl.nextInt();
rl.nextLine();
System.out.println("Podaj ile chesz mieć prób");
retryCounter = rl.nextInt();
rl.nextLine();
Random generator = new Random();
int randomNumber = (int)generator.nextInt(range);
do{
if(counter != retryCounter){
System.out.print("Spróbuj jeszcze raz!!!: ");
}
else{
System.out.print("Liczba została wylosowana zgadnij jaka to liczba: ");
}
int podanaLiczba = rl.nextInt();
rl.nextLine();
if(podanaLiczba>randomNumber){
System.out.println("Podana przez Ciebie liczba jest większa od wylosowanej!!!");
}
else if(podanaLiczba<randomNumber){
System.out.println("Podana przez Ciebie liczba jest mniejsza od wylosowanej!!!");
}
else{
System.out.println("Wygrałeś BRAWO to jest ta liczba");
break;
}
counter--;
}while(counter > 0);
if(counter == 0 ){
System.out.println("Niestety nie udało Ci sie odgadnąć liczby w " + retryCounter + " próbach Przegrałeś!!!");
}
System.out.println("Chcesz spróbowac jeszcze raz wprowadz \"y\" i zatwierdz? ");
playAgain = rl.nextLine().contains("y");
}while(playAgain);
rl.close();

//J38
Scanner rl = new Scanner(System.in);
System.out.println("Wpisz pozycje początkową prostokąta (x,y): ");
String pozPocz = rl.nextLine();
int pozPoczX =0;
int pozPoczY =0;
if(pozPocz.contains("(") && pozPocz.contains(")") && pozPocz.contains(",")){
pozPoczX = Integer.parseInt(pozPocz.substring(pozPocz.indexOf("(")+1, pozPocz.indexOf(",")));
pozPoczY = Integer.parseInt(pozPocz.substring(pozPocz.indexOf(",")+1, pozPocz.indexOf(")")));
}
System.out.println("Podaj znak wypełnienia: ");
char znakWyp = rl.nextLine().charAt(0);
System.out.println("Podaj dlugość prostokąta a: ");
int a = rl.nextInt(); 
rl.nextLine();
System.out.println("Podaj wysokość prostokąta b: ");
int b = rl.nextInt(); 
rl.nextLine();
System.out.print("Twoj prostokąt wyglada tak ");

for(int i = 0; i<pozPoczY; i++){
System.out.println();
}
for(int i = 0; i<b; i++){
for(int j = 0; j<pozPoczX; j++){
System.out.print(" ");
}
for(int j = 0; j<a; j++){
System.out.print(znakWyp);
}
System.out.print("\n");
}
//J39
Scanner rl = new Scanner(System.in);
System.out.println("Podaj wysokość choinki: ");
int wysChoi = rl.nextInt();
rl.nextLine();
for(int w = 0; w<wysChoi; w++){
	for(int i = 1; i<wysChoi-w; i++){
	System.out.print(" ");
	}
	for(int j = wysChoi+1; j > wysChoi-2*w; j--){
	System.out.print("*");
	}
System.out.println();
}
//J40
Scanner rl = new Scanner(System.in);
System.out.println("Podaj jaką liczbe całkowitą większą od zera");
long liczba = rl.nextLong();
rl.nextLine();

System.out.println("Liczba " + liczba + " jest podzielna przez: ");
if(liczba >0){
for (int i = 1; i<liczba+1; i++){
if(liczba%i == 0 ){
System.out.println(i);
}
}
}
else{
System.out.println("Liczba mniejsza od zera");
}

//J41
int[] tabl1 = {1,2,3};
int[] tabl2 = {10,20,30};
int sum = 0;
for (int i = 0; i<tabl1.length; i++){
sum += tabl1[i];
}
for (int i = 0; i<tabl2.length; i++){
sum += tabl2[i];
}
System.out.println("Suma tablic to : " + sum);

//J42
int[] randomeInt = new int[10];
Random generator = new Random();
int tempMax = 0;
int tempMin = 0;
int sum = 0;
for(int i = 0; i<randomeInt.length; i++){
randomeInt[i] = generator.nextInt(20)-10;
}
System.out.println("Elementy tablicy: ");
for(int i = 0; i<randomeInt.length;i++){
System.out.println(randomeInt[i]);
sum+=randomeInt[i];
if(tempMax<randomeInt[i]){
tempMax = randomeInt[i];
}
if(tempMin > randomeInt[i]){
tempMin = randomeInt[i];
}
}
System.out.println("Największy element tablicy: " + tempMax);
System.out.println("Najmniejszy element tablicy: " + tempMin);
System.out.println("Suma elementów tablicy to: " + sum);
float avgTable = (float)sum/randomeInt.length;
System.out.println("Średnia z elementów tablicy: " + avgTable);
int counterLess = 0;
int counterAbove = 0;
System.out.println("Elementy w kolejności odwrotnej: ");
for(int i = 0; i<randomeInt.length;i++){
System.out.println(randomeInt[randomeInt.length-i-1]);
if(avgTable<(float)randomeInt[i]){
counterAbove++;
}
if(avgTable >(float)randomeInt[i]){
counterLess++;
}
}
System.out.println("Powyżej średniej jest " + counterAbove + "elementów");
System.out.println("Poniżej średniej jest " + counterLess + "elementów");
//J43
int[] randomeInt = new int[20];
Random generator = new Random();
for(int i = 0; i<randomeInt.length; i++){
randomeInt[i] = generator.nextInt(10)+1;
}
System.out.println("Elementy tablicy: ");
for(int i = 0; i<randomeInt.length;i++){
System.out.println(randomeInt[i]);
}
System.out.println();
for(int i = 1; i<11; i++){
int counter = 0;
for(int j = 0; j< randomeInt.length; j++){
if(randomeInt[j] == i){
counter++;
}
}
System.out.println(i +" powtarza się w tablicy " + counter + " razy");
}

//J44
int[][] tabl = new int[5][5];
int tempMin = 0;
int tempMax = 0;
int[][] maxMin = new int[2][tabl[0].length];
Random generator = new Random();
for(int i = 0; i<tabl.length; i++){
for(int j = 0; j<tabl[i].length; j++){
tabl[i][j] = generator.nextInt(11)-5;
}
}
for(int i = 0; i<tabl.length; i++){
for(int j = 0; j<tabl[i].length; j++){
System.out.print("\t" + tabl[i][j]);
}
System.out.println();
}
for(int j = 0; j<tabl.length; j++){
for(int i = 0; i<tabl[j].length; i++){
//System.out.print(tabl[i][j]);
if(tempMin>tabl[i][j]){
tempMin = tabl[i][j];
}
if(tempMax<tabl[i][j]){
tempMax = tabl[i][j];
}
}
//System.out.println();
maxMin[0][j] = tempMax;
maxMin[1][j] = tempMin;
tempMax = 0;
tempMin = 0;
}
System.out.println();
for(int i = 0; i<maxMin.length; i++){
for(int j = 0; j<maxMin[i].length; j++){
System.out.print("\t"+ maxMin[i][j]);
}
System.out.println();
}
//J45
System.out.println("Podaj liczbę do przekształcenia na kod binarny: ");
Scanner rl = new Scanner(System.in);
int liczba = rl.nextInt();
int counter = 1;
rl.nextLine();
int[] tabl = new int[32];
do{
switch (liczba%2){
case 0:
liczba /=2;
tabl[counter++] = 0;
break;
case 1:
liczba -= 1;
liczba /=2;
tabl[counter++] = 1;
break;
}
}while(liczba > 0);
System.out.println("Twoja liczba binarnie to: ");
for(int i = tabl.length-1; i >0 ; i-- ){
if(counter>=i){
System.out.print(tabl[i]);
}
else{
System.out.print(0);
}
}
rl.close();
//J46
int[][] tabl1 = new int[3][3];
int[][] tabl2 = new int[3][3];
int[][] tablFinal = new int[3][3];
for(int i =0; i<3; i++){
for(int j = 0; j<3; j++){
if(i==j){
tabl1[i][j] = 1;
tabl2[i][j] = 1;
}
}
}
for(int i =0; i<3; i++){
for(int j = 0; j<3; j++){
tablFinal[i][j] = tabl1[i][j]+tabl2[i][j];
System.out.print("\t" + tablFinal[i][j]);
}
System.out.println();
}
//J47
int[][] multiplicationTable = new int[9][9];
for(int i = 0; i<9; i++){
for(int j = 0; j<9; j++){
multiplicationTable[i][j] = (i+1)*(j+1);
System.out.print(multiplicationTable[i][j] + "\t");
}
System.out.print("\n");
}
//J48
Scanner rl = new Scanner(System.in);
System.out.println("Wpisuj kolejne słowa jak chesz skończyć wpisz \"end\"");
ArrayList<String> arrList = new ArrayList<>();
while(true){
String rr = rl.nextLine();
if(!rr.equals("end")){
arrList.add(rr);
}
else{
System.out.println("Twoje słowa to: " + arrList);
break;
}

}
//J49
Scanner rl = new Scanner(System.in);
HashMap<String, Integer> mapa = new HashMap<>();
mapa.put("chleb", 1);
mapa.put("mleko", 2);
mapa.put("jaja", 3);
mapa.put("mąka", 3);
mapa.put("cukier", 3);
mapa.put("bułki", 3);
mapa.put("pomidory", 3);
mapa.put("woda", 3);
mapa.put("pomarańcze", 3);
mapa.put("ser", 3);
int summ = 0;
boolean poprawna = true;
while(true){
if(poprawna){
System.out.println("Podaj nazwe prodktu aby zakończyć wpisz \"koniec\"");
}
else{
System.out.println("Podaj poprawną nazwe prodktu lub aby zakończyć wpisz \"koniec\"");
}
String rr = rl.nextLine();
if(!rr.equals("koniec")){
if(mapa.containsKey(rr)){
summ += mapa.get(rr);
poprawna = true;
}else{
poprawna = false;
continue;
}
}
else{
System.out.println("Cena za twoje zakupy: " + summ + "zł");
break;
}
}
//J50
Scanner rl = new Scanner(System.in);
HashMap<String, Integer> mapa = new HashMap<>();
mapa.put("chleb", 1);
mapa.put("mleko", 2);
mapa.put("jaja", 3);
mapa.put("mąka", 3);
mapa.put("cukier", 3);
mapa.put("bułki", 3);
mapa.put("pomidory", 3);
mapa.put("woda", 3);
mapa.put("pomarańcze", 3);
mapa.put("ser", 3);
HashSet<String> zbior = new HashSet<>();
int summ = 0;
boolean poprawna = true;
while(true){
if(poprawna){
System.out.println("Podaj nazwe prodktu aby zakończyć wpisz \"koniec\"");
}
else{
System.out.println("Podaj poprawną nazwe prodktu lub aby zakończyć wpisz \"koniec\"");
}
String rr = rl.nextLine();
if(!rr.equals("koniec")){
if(mapa.containsKey(rr)){
if(!zbior.contains(rr)){
zbior.add(rr);
summ += mapa.get(rr);
}else{
System.out.println("Ten produkt jest już w koszyku czy napewno chesz go dodać? t/n");
String temp = rl.nextLine();
if(temp.equals("t")){
zbior.add(rr);
summ += mapa.get(rr);
}
else{
continue;
}
}
poprawna = true;

}else{
poprawna = false;
continue;
}
}
else{
System.out.println("Cena za twoje zakupy: " + summ + "zł");
break;
}
}




}
}
