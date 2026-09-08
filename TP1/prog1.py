import fonctions as f

# Q2.5 : On force l'erreur en envoyant un nombre à virgule
print("Test de la Q2.5 :")
# f.puissance(2.5, 3)

# Q2.1 et Q2.3 : La boucle infinie (while True)
while True:
    try:
        val_a = input("Entrez un nombre a (ou CTRL-C pour quitter) : ")
        val_b = input("Entrez la puissance b : ")
        
        a = int(val_a)
        b = int(val_b)
        
        res = f.puissance(a, b)
        print(f"Résultat : {res}\n")
        
    except KeyboardInterrupt:
        print("\nArrêt du programme. Bye !")
        break
