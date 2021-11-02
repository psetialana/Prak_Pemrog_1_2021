def coba():
    print("coba function")

def penjumlahan(a, b):
    hasil = int(a) + int(b)
    print("hasil penjumlahan = " + str(hasil))

def perkalian(a, b):
    hasil = a*b
    return hasil

coba()
penjumlahan(1, 6)
print(perkalian(5, 6))
nilaiA = input("Masukan nilai A = ")
nilaiB = input("Masukan nilai B = ")
penjumlahan(nilaiA, nilaiB)