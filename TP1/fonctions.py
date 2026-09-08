def puissance(a, b):
    if not type(a) is int or not type(b) is int:
        raise TypeError("Only integers are allowed")
    
    # Q4.6 : Gestion du cas indéfini (0 à une puissance négative)
    if a == 0 and b < 0:
        raise Exception("Operation indefinie : 0 puissance negative")
        
    return a ** b
