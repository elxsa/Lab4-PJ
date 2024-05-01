RO: Programare Java - laborator 4, cerințe de rezolvat: 



O firmă comercializează echipamente electronice. Fiecare echipament este înregistrat cu o denumire, un număr de inventar nr_inv, are un preţ pret şi este plasat într-o anumită zonă din magazie zona_mag. Orice echipament poate fi într-una din situaţiile:

- achiziţionat;

- expus;

- vândut.

Firma comercializează următoarele tipuri de echipamente: imprimante, copiatoare şi sisteme de calcul. Imprimantele sunt caracterizate numărul de pagini scrise pe minut ppm, rezoluţie (număr de puncte per inch dpi) şi număr de pagini/cartuş p_car şi modul de tipărire (color sau alb negru). Copiatoarele sunt caracterizate de numărul de pagini/toner p_ton şi formatul de copiere (A3 sau A4).  Sistemele de calcul au un monitor de un anumit tip tip_mon, un procesor de o anumită viteză vit_proc, o capacitate a HDD c_hdd şi li se poate instala unul din sistemele de operare Windows sau Linux.

Să se realizeze ierarhia de clase corespunzătoare modelului prezentat, utilizând tipul enumerare pentru câmpurile potrivite. Să se documenteze clasele şi metodele. Să se creeze o singură colecţie de obiecte de tip List în care să fie preluate datele din fişierul de intrare electronice.txt. Se va dezvolta un meniu care va oferi următoarele facilităţi:

- afişarea tuturor echipamentelor;

- afişarea imprimantelor;

- afişarea copiatoarelor; 

- afişarea sistemelor de calcul;

- modificarea stării în care se află un echipament

- setarea unui anumit mod de scriere pentru o imprimantă;

- setarea unui format de copiere pentru copiatoare; 

- instalarea unui anumit sistem de operare pe un sistem de calcul;

- afişarea echipamentelor vândute;

Să se realizeze două metode statice pentru serializarea / deserializarea colecției de obiecte în fișierul echip.bin. 

Sure, here’s the text translated into English:

EN: Java Programming - Lab 4, tasks to be solved:

A company sells electronic equipment. Each piece of equipment is registered with a name, an inventory number nr_inv, has a price pret, and is placed in a specific area of the warehouse zona_mag. Any piece of equipment can be in one of the following states:

- acquired;
  
- displayed;
  
- sold.

The company sells the following types of equipment: printers, copiers, and computing systems. Printers are characterized by the number of pages per minute ppm, resolution (number of dots per inch dpi) and number of pages per cartridge p_car, and printing mode (color or black and white). Copiers are characterized by the number of pages per toner p_ton and the copying format (A3 or A4). Computing systems have a monitor of a certain type tip_mon, a processor of a certain speed vit_proc, an HDD capacity c_hdd, and can have either Windows or Linux operating systems installed.

Create a class hierarchy corresponding to the model presented, using the enumeration type for suitable fields. Document the classes and methods. Create a single collection of objects of type List that will retrieve data from the input file electronice.txt. Develop a menu that will offer the following features:

- displaying all equipment;
  
- displaying the printers;
  
- displaying the copiers;
  
- displaying the computing systems;
  
- changing the state of a piece of equipment;
  
- setting a specific writing mode for a printer;
  
- setting a copying format for copiers;
  
- installing a specific operating system on a computing system;
  
- displaying the sold equipment;

Develop two static methods for serializing/deserializing the collection of objects in the file echip.bin.
