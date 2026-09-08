def puissance(a, b):
    # Vérification des types
    if not type(a) is int or not type(b) is int:
        raise TypeError("Only integers are allowed")
    
    # Gestion du cas indéfini (0 à une puissance négative)
    if a == 0 and b < 0:
        raise Exception("Operation indefinie : 0 puissance negative")
        
    # Cas particulier : toute valeur à la puissance 0 vaut 1
    if b == 0:
        return 1
        
    # Calcul avec boucle for
    res = 1
    for _ in range(abs(b)):
        res = res * a
        
    # Si la puissance était négative, on retourne l'inverse (ex: 2^-1 = 1/2)
    if b < 0:
        return 1 / res
        
    return res
