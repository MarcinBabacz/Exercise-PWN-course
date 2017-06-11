# -*- coding: utf-8 -*-

#P1
a = 1
b = 2.4
c = 'w1'
print(a,b,c)

#P2
a = 2.1
b = 'abc'
c = 0
print(a,b,c)

#P3
b = c
a = 13
print(a,b,c)

#P4
del a
del c
#c = c + 31.3
#print(a,b,c)

#P5
imie = 'Michał'
nazwisko = 'Kruczkowski'
rok_u = 1987
stanowisko = 'dev'
placa = 10000
print(imie, nazwisko, rok_u, stanowisko, placa)

#P6
a = 3.14
r = 2
pole = a * r * r
print(pole)

#P7
#and = 1
#print(and)

#P8
print(type(imie), type(nazwisko), type(rok_u), type(stanowisko), type(placa))

#P9
a = 1.2
print(type(a))
a = 1
print(type(a))

#P10
vat3 = 0.03
vat7 = 0.07
vat23 = 0.23

brutto = 10000
netto3 = brutto - (vat3 * brutto)
netto7 = brutto - (vat7 * brutto)
netto23 = brutto - (vat23 * brutto)
print(netto3, netto7, netto23)

#P11
chleb_cena = 1.99
mleko_cena = 2.50
cukierki_cena = 12.99

zamowienie = (2 * chleb_cena) + (0.5 * mleko_cena) + (0.3 * cukierki_cena)
print(zamowienie)

#P12
print((2+5j) + (4+6j))
print(4 - (4+6j))

#P13
a = 12
b = 1-1j
print(a*b)

#P14
print(0o45)

#P15
print(0x34)

#P16
print(bool(7))
print(bool({}))

#P17
print(bool(0),bool([]),bool(()),bool({}), bool(None))

#P18
print(3*'Miki')

#P19
txt = '9'
liczba = int(txt)
print(type(txt), type(liczba))

#P20
liczba = 140
txt = str(liczba)
print(type(liczba), type(txt))

#P21
i1 = 'Michał'
i2 = 'Krzyś'
i3 = 'Łucja'
print(i1,i2,i3)

#P22
imie = 'Michał'
naziwsko = 'Kruczkowski'
wiek = 30
stanowisko = 'deweloper'
pensja = 10000
print("Pan "+imie+" "+nazwisko+" (wiek: "+str(wiek)+" lat) pracuje na stanowisku "+stanowisko+" (pensja: "+str(pensja)+")")

#P23
print(2+6,3-6,2*5,5/3)

#P24
Pkw = 2*2
Otr = 3+4+6
Pko = 3.14*(3**2)
print("Pole kwadratu: "+str(Pkw))
print("Obwód trójkąta: "+str(Otr))
print("Pole koła: "+str(Pko))

#P25
stawka_b = 5500/168
vat = 0.23
stawna_n = stawka_b - (stawka_b*vat)
print("Stawka godzinowa brutto: "+str(round(stawka_b,2))+"zł, a netto: "+str(round(stawna_n,2))+"zł.")

#P26
p = True # False
q = False # True
print(not (p and q) == (not p or not q))

#P27
a = False
b = False
c = True
print((not a and not b and not c) or (not a and not b and c) or (not a and b and not c) or (a and not b and not c))

#P28
wynik = (17**(1/2)) * 1j
print(wynik, type(wynik))

#P29
print(((17%7)**2) + 3*(17%7))

#P30
print(10*str(1.2e+3+34.5)+";")

#P31
print(1>2, 2<3, 2==3, 5>=2, 4<=4, 4!=5)

#P32
napis1 = 'ala'
napis2 = 'Ala'
print(napis1 == napis2, napis1 <= napis2)

#P33
"""
Program porównujący napisy
@autor: Michał Kruczkowski
"""
#pierwszy napis
napis1 = 'ala'
#drugi napis
napis2 = 'Ala'
#wyświetlenie wyniku
print(napis1 == napis2, napis1 <= napis2)

#P34
print('\\','\"','\'','\a','\b','\f','\n','\r','\t','\v')

#P35
imie = input("Podaj imię ")
print("Witaj "+imie+" w kursie Back-end Developer")

#P36
napis = input("napisz coś ciekawego ")
print((napis+"\n")*30)

#P37
a = float(input("podaj długość boku trójkąta "))
h = float(input("podaj wysokość trójkąta "))
print("Pole trójkąta wynosi: "+str(0.5*a*h))

#P38
SPK = int(input("stan początkowy konta "))
N = int(input("liczba lat "))
P = 0.05
SK = round(SPK*((1+P)**N),2)
print("Stan konta za "+str(N)+" miesięcy wynosi: "+str(SK)+"zł")

#P39
Napisy = []
Liczby = []

Liczby.append(1)
Liczby.append(2)
Liczby.append(3)

Napisy.append('Adam')
Napisy.append('Ewa')
print(len(Napisy), len(Liczby))

#P40
imie = Liczby[1]
print(imie)

#P41
SpoArt = ['jaja', 'mleko', 'chleb', 'ciastka', 'jogurt']
print("Pierwszy element: " + str(SpoArt[0]))
print("Ostatni element: " + str(SpoArt[len(SpoArt)-1]))

#P42
Txt = ("Witaj ", "w ", "kursie ", "Python")
print(Txt[0:len(Txt)])

#P43
Data = ('01','01', '2018')
print("Data ważności: " + Data[0] + "-" + Data[1] + "-" + Data[2])

#P44
Converter = {'jeden':1, 'dwa':2, 'trzy':3, 'cztery':4}
i = str(input("Podaj liczbę słownie "))
print("Reprezentacja dziesiętna: "+ str(Converter[i]))

#P45
Converter1 = {1:"I", 2:"II", 3:"III", 4:"IV"}
i = int(input("Podaj liczbę dziesiętną "))
print("Reprezentacja dziesiętna: "+ str(Converter1[i]))

#46
Converter2 = {1:'jeden', 2:'dwa', 3:'trzy', 4:'cztery'}
i = int(input("Podaj liczbę słownie "))
print("Reprezentacja dziesiętna: "+ str(Converter2[i]))

#47
Converter3 = {"I":1, "II":2, "III":3, "IV":4}
i = str(input("Podaj liczbę rzymską "))
print("Reprezentacja dziesiętna: "+ str(Converter3[i]))

#48
Ceny = {1000:(0.77*1000),100:(0.77*100),2300:(0.77*2300)}
print(Ceny[1000])
print(Ceny[100])
print(Ceny[2300])

#49
from random import randint
A=set([])
while len(A)<6:
    A.add(randint(0,49))
print(A)

#50
LP = []
i = 1
while (i<99):
    if(i%2 == 0):
        LP.append(i)
    i += 1
print(LP[0:len(LP)])

#51
wsp=[]
for x in range(20):
    wsp.append((x,x*2))
    print(wsp)
    
#52
plansza = [[0 for col in range(8)] for row in range(8)]
plansza[4][3] = "biały"
plansza[3][1] = "czarny"
plansza[1][1] = "puste"

print (plansza)

#53
if (0 == True):
    print("0 jest true")
if (1 == True):
    print("1 jest true")
if (2 == True):
    print("2 jest true")
if (3 == True):
    print("3 jest true")
if (4 == True):
    print("4 jest true")                

#54
liczba = 4
if((liczba >=0 and liczba <= 9) == True):
    print("Liczba: " + str(liczba) + " jest w przedziale")

#55
Lista = [2,5,'miki']
spr = 5
if(spr == Lista[0]):
    print("Jest w pierwszym elemencie")
elif(spr == Lista[1]):
        print("Jest w drugim elemencie")
else:
    print("Nie występuje!")        

#56
a =13
print("Liczba parzysta") if (a%2 == 0) else print("Liczba nieparzysta")

#57
sklep_prod = {"PC":"Komputer stacjonarny" , "Laptop":"Komputer podręczny" , "Monitor":"Monitor 18\""}
sklep_zamowienie ={"Laptop":5}

for key in sklep_zamowienie:
    if((key in sklep_prod.keys())== True):
        print("Zamawiasz: " + str(sklep_prod[key]))
    else:
        print("Brak produktu")

#58
sklep_cena = {"PC":1300 , "Laptop":3200 , "Monitor":2000}
sklep_ilosc = {"PC":1 , "Laptop":3 , "Monitor":4}

for key in sklep_zamowienie:
    if((key in sklep_prod.keys())== True):
        print("Zamawiasz: " + str(sklep_prod[key]))
        print("Ilość: " + str(sklep_ilosc[key]))
        print("Cena suma: " + str(sklep_cena[key]*sklep_ilosc[key]))
    else:
        print("Brak produktu")

#59
sklep_prod = {"PC":"Komputer stacjonarny" , "Laptop":"Komputer podręczny" , "Monitor":"Monitor 18\""}
sklep_zamowienie ={"Laptop":5, "Monitor":3}
sklep_cena = {"PC":1300 , "Laptop":3200 , "Monitor":2000}
sklep_ilosc = {"PC":1 , "Laptop":3 , "Monitor":4}
sklep_stan = {"PC":11 , "Laptop":20 , "Monitor":40}

for key in sklep_zamowienie:
    if((key in sklep_prod.keys())== True):
        if(sklep_zamowienie[key] > sklep_stan[key]):
            print("Za mało towaru")
        else:
            sklep_stan[key] = sklep_stan[key]-sklep_zamowienie[key]
            print("Zamawiasz: " + str(sklep_prod[key]))
            print("Ilość: " + str(sklep_ilosc[key]))
            print("Cena suma: " + str(sklep_cena[key]*sklep_ilosc[key]))
            print("Stany zaktualizowane: " + str(sklep_stan[key]))
            print("***************************")
    else:
        print("Brak produktu")

#60
Conv = {1:'jeden', 2:'dwa', 3:'trzy', 4:'cztery'}
imie = str(input("Podaj ciąg cyfr "))
i = 0
while((i < len(imie)) == True):
    a = int(imie[i])
    print(Conv[a])
    i += 1

#61
x=1
for y in range(1,6):
    print("%5i%5i%5i%5i " %(x**y,(x+1)**y,(x+2)**y,(x+3)**y))

#62
for x in range (3,10):
    print("%5i" % x**2)

#63
tab = [9,8,7,6,5,4,3,2,1]
for x in tab:
    if((x%2) != 0):
        print("%5i" % x**2)

#64
tab = [1,3,4,5]
x = 3
if(x in tab):
    print(str(x)+ " jest na liście na pozycji: "+str(tab.index(x)))

#65
tab = [1, 2.3, "Michał", 'C']
print("%10i%10.2f%10s%10c" % (tab[0],tab[1],tab[2],tab[3])) 

#66
for x in range(1,6):  
    print("%5i%5i%5i" % (x,x**2,x**3)) 
    
#67
for x in range(-20,45,5):  
    print("%5i%5i" % (x,(0.01*x*212))) 
    
#68
oceny={1:"3",2:"3.5",3:"4",4:"4.5",5:"5"}
oceny_studenta=[]
x=True
while x:
    wartosc=input("Podaj ocene: ")
    if(wartosc in oceny.values()):
        oceny_studenta.append(float(wartosc))
    if wartosc=="":
        x=False
print(oceny_studenta)
suma=0
for x in oceny_studenta:
    suma+=x
print("Średnia wynosi "+str(suma/(len(oceny_studenta))))

#69
def nSilnia(n):
    wynik = 1
    i = 1
    while(i <= n):
        wynik = wynik*i
        i += 1
    print(wynik)

nSilnia(5)

#70
def Fib():
    suma=0
    liczba=0
    lista=[]
    wartosc=input("Podaj numer liczby fibonacciego: ")
    for x in range(int(wartosc)+1):
        if (x==0) or (x==1):
            lista.append(x)
            suma+=x
            liczba=x
        else:
            liczba=lista[x-1]+lista[x-2]
            lista.append(liczba)
            suma+=liczba
    print("liczba na "+wartosc+" miejscu, to " + str(liczba)+", a suma to "+str(suma))

Fib()

#71
import random
def Wyrazy(n=5):
    wyrazy = ["Ala","ma","kota","a","kot","ma","Ale"]
    i = 1
    while(i <= n):
        print(random.choice(wyrazy))
        i +=1
Wyrazy()
Wyrazy(3)

#72
import math
def Dist(x1,x2,y1,y2):
    d = round(math.sqrt(pow((x2-x1),2)+pow((y2-y1),2)),2)
    print(d)

Dist(4,3,5,1)

#73
import math
def Geo(a1,q,n):
    an = a1*pow(q,(n-1))
    print(an)

Geo(1,3,3)

#74
def suma(*arg):  
	sum=0  
	for x in arg:
		sum += x
		ave = sum/len(arg)
	return print(ave)

suma(2,3,4)

#75
class Zawodnik:
    nazwisko = None
    wzrost = None
    waga = None
    
    def obliczBMI(self):
        bmi = self.waga / (self.wzrost * self.wzrost)
        return bmi

z1 = Zawodnik()
z1.nazwisko = "Kamil Stoch"
z1.wzrost = 1.78
z1.waga = 75
print(z1.obliczBMI())

#76-77
class Student:
    nazwisko = None
    ocena = None
    Nazwiska = []
    Oceny = []
    
    def __init__(self, nazwisko, ocena):
        self.nazwisko = nazwisko
        self.ocena = ocena
    
    def dodaj(self):
        self.Nazwiska.append(self.nazwisko)
        self.Oceny.append(self.ocena)        
    
    def wypisz(self):
        i=0
        while (i <len(self.Oceny)):
            print(self.Nazwiska[i], self.Oceny[i])
            i += 1
    def srednia(self):           
        suma = 0
        sr = 0
        for i in self.Oceny:
            suma += i
        sr = suma/len(self.Oceny)
        print(sr)

s1 = Student("Kruczkowski", 5.0)
#print(s1.nazwisko)
#print(s1.ocena)
s1.dodaj()
s2 = Student("Kruk", 4.0)
s2.dodaj()
s3 = Student("Mik", 3.5)
s3.dodaj()
s3.wypisz()
s3.srednia()

#78-79
from random import randint
class Lotto:
    losowanie = ""
    A=set([])
    def __init__(self, losowanie):
        self.losowanie = losowanie
    
    def losuj(self):
        while len(self.A)<6:
            self.A.add(randint(0,49))
        print(self.losowanie, self.A)
    
    def sortuj(self):
        print("Posortowane")
        B = list(self.A)
        B.sort()
        print(self.losowanie, B)

los = Lotto("Losowanie1")
los.losuj()
los.sortuj()

#80
class Produkt:
        
    def __init__(self, nazwa, cena):
        self.nazwa = nazwa
        self.cena = cena
    
    def pokazInfo(self):
        print(self.nazwa)
        print(self.cena)
    
    def kalk(self, vat):
        cena_n = self.cena-(self.cena*vat)
        print("Cena netto: " + str(cena_n))
        
class Oprogramowanie(Produkt):
    
    def __init__(self, nazwa, cena, jezyk, system):
        super().__init__(nazwa, cena)
        self.jezyk = jezyk
        self.system = system
            
    def pokazInfo(self):
        print(self.nazwa)
        print(self.cena)
        print(self.jezyk)
        print(self.system)
    
s1 = Oprogramowanie("Proxy", 10000, "Python", "Windows")
s1.pokazInfo()
s1.kalk(0.50)

class Szkolenia(Oprogramowanie):
    
    def __init__(self, nazwa, cena, jezyk, system, termin):
        super().__init__(nazwa, cena, jezyk, system)
        self.termin = termin
        
    def pokazInfo(self):
        print(self.nazwa)
        print(self.cena)
        print(self.jezyk)
        print(self.system)  
        print(self.termin)
    
k1 = Szkolenia("Szkolenie Python", 10000, "Python", "Windows","2017-06-01")
k1.pokazInfo()

#81
import random
print(dir())

#82
class Student:
        imie = "Gal"
        nazwisko = "Anonim"
        grupa = 0
 
def NowiStudenci(ile_dotychczas):
        lista = []
        for x in range(ile_dotychczas):
                lista.append(Student()) # "zerowanie" tablicy liczbą studentow, którzy są już na liście
        nr = ile_dotychczas # zapisujemy sobie numer ostatniego studenta
        while True:
                s = input("Podaj imię studenta nr %i (ENTER = koniec): " % (nr+1))
                if not s: break
                lista.append(Student())
                lista[nr].imie = s
                lista[nr].nazwisko = input("Podaj nazwisko studenta nr %i: " % (nr+1))
                lista[nr].grupa = int(input("Podaj numer grupy studenta nr %i: " % (nr+1)))
                nr += 1
        return lista
print("Otwarcie pliku")
# próbujemy otworzyć plik
plik = open("lista.txt", "a+") 
# atrybut 'a' - dopisywanie do pliku
# ten atrybut tworzy też plik, jeżeli on nie istnieje
print("Plik 'lista.txt' otwarty poprawnie.")
# dopisanie kolejnych do listy
lista_nowych = NowiStudenci(len(plik.readlines()))
for nr, student in enumerate(lista_nowych):
        if student.nazwisko == "Anonim": continue
        plik.write("%03i. %s %s, grupa: %02i\n" % (nr+1, student.imie, student.nazwisko, student.grupa))
        plik.flush()
        print("Dopisano studenta...")
plik.close()

#P83
from os import *
import fnmatch
sciezka_glowna = input("Podaj ścieżkę bezwzględną do katalogu: ")
co = input("Podaj nazwę, którą chcesz znaleźć: ")
print("Szukam...")
for sciezka, podkatalogi, pliki in walk(sciezka_glowna):
    lista = [x for x in listdir(sciezka) if fnmatch.fnmatch(x, co)]
    if lista != []:
	print('W katalogu %s znaleziono pliki:\n\n%s\n\n' % (sciezka, str(lista)))

#P84
# coding=utf-8
from os import *
from time import ctime
 
print("Program znajdzie najstarszy i najdłuższy plik")
s = input("w katalogu (podaj bezwzględną sciężkę): ")
 
najstarszy = ["", 0.0, ""]
for sciezka, podkatalogi, pliki in walk(s):
        for x in pliki:
                wiek = path.getctime(x)
                if wiek < najstarszy[2]:
                        najstarszy[0] = x
                        najstarszy[1] = wiek
                        najstarszy[2] = sciezka
print("Najstarszy plik w tym katalogu to: %s/%s" % (najstarszy[2], najstarszy[0]))
print("Został on utworzony: %s" % (ctime(najstarszy[1])))
 
najdluzszy = ["", 0, ""]
for sciezka, podkatalogi, pliki in walk(s):
        for x in pliki:
                dlugosc = path.getsize(x)
                if dlugosc > najdluzszy[1]:
                        najdluzszy[0] = x
                        najdluzszy[1] = dlugosc
                        najdluzszy[2] = sciezka
print("Nadłuższy plik w tym katalogu to: %s/%s" % (najdluzszy[2], najdluzszy[0]))
print("Jego długość wynosi %i bajtów." % (najdluzszy[1]))

#P85
# coding=utf-8
from os import *
 
print("Program znajdzie wszystkie zdublowane pliki w katalogu")
katalog_nadrzedny = input("(podaj bezwzględną ściężkę): ")
 
pliki_nazwy = []
pliki_sciezki = []
for katalog, podkatalogi_w_katalogu, pliki_w_katalogu in walk(katalog_nadrzedny):
        for nazwa_pliku in pliki_w_katalogu:
                pliki_nazwy.append(nazwa_pliku)
                pliki_sciezki.append(katalog)
 
pliki_zdublowane_nazwy = []
pliki_zdublowane_sciezki = []
for numer, nazwa_pliku in enumerate(pliki_nazwy):
        ile_razy = pliki_nazwy.count(nazwa_pliku)
        if ile_razy > 1:
                nr = numer
                while True:
                        pliki_zdublowane_nazwy.append(nazwa_pliku)
                        pliki_zdublowane_sciezki.append(pliki_sciezki[nr])
                        pliki_nazwy.pop(nr)
                        pliki_sciezki.pop(nr)
                        if pliki_nazwy.count(nazwa_pliku) >= 1:
                                nr = pliki_nazwy.index(nazwa_pliku)
                        else:
                                break
                               
if len(pliki_zdublowane_nazwy) != 0:
        print("Znaleziono następujące zdublowane pliki:\n")
        for numer, nazwa_pliku in enumerate(pliki_zdublowane_nazwy):
                        print("%s/%s" % (pliki_zdublowane_sciezki[numer], nazwa_pliku))
else:
        print("Nie znaleziono żadnych zdublowanych plików.")

# 86-87
import pymysql

conn = pymysql.connect("localhost", "root", "miki123", "pracownicy") 
cursor = conn.cursor()
   
def wpisywanieDB(name, last, date, PESEL):
    sql1 = "INSERT INTO empl (name, last, date, PESEL) VALUES (%s,%s,%s,%s)"
    cursor.execute(sql1,(name, last, date, PESEL))
    conn.commit()
    print("Dane zapisano")

def odczytDB():  
    sql = "SELECT * FROM empl"    
    try:
	cursor.execute(sql)
        results = cursor.fetchall()
        print ("ID \t Name \t Surname \t Date \t PESEL" )
        for row in results:
	    lp = row[0]
	    name = row[1]
            last = row[2]
            date = row[3]
            PESEL = row[4]                  
            print ("%s \t %s \t %s \t %s \t %s" % (lp, name, last, date, PESEL))
    except:
	print("Błąd: Nie można wyświetlić danych")

def modyfikacjaDB(last_n, PESEL_n):
    sql3 = "update empl set last=%s where pesel=%s"
    cursor.execute(sql3,(last_n,PESEL_n))
    conn.commit()
    odczytDB()

def logowanieDB():
    login_n = str(input("Podaj login: "))
    haslo_n = str(input("Podaj haslo: "))

    sql4 = "SELECT * FROM log WHERE login=%s and pass=%s"
    cursor.execute(sql4,(login_n,haslo_n))
    if(cursor.rowcount == 1):
        print("Zalogowano poprawnie")
    else:
        print("Błąd logowania")
        logowanieDB()
  
#wpisywanieDB("Adam","Iwo", '2016-03-15',"87010607353")
#odczytDB()        
#modyfikacjaDB("Iwo", "87010607353")
logowanieDB()    
conn.close()   