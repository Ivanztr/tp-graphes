import pytest
import fonctions as f

# Q3.1
def test_1():
    assert f.puissance(2, 3) == 8
    assert f.puissance(2, 2) == 4

# Q3.3
def test_2():
    assert f.puissance(-1, 2) == 1
    assert f.puissance(-1, 3) == -1
    assert f.puissance(-1, -1) == -1
    assert f.puissance(-1, -2) == 1
    assert f.puissance(-2, -1) == -0.5

# Q4.6 : Cas limites
def test_limites():
    assert f.puissance(0, 5) == 0
    assert f.puissance(5, 0) == 1

# Q4.6 : Test de l'exception pour le cas indéfini
def test_exc_zero_negatif():
    with pytest.raises(Exception):
        f.puissance(0, -1)
