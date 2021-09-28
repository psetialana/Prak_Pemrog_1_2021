umur = input("Masukan umur Anda = ")
umur = int(umur)
if (umur >= 0 and umur <=5):
    print("Anda balita")
elif (umur > 5 and umur <= 19):
    print("Anda remaja")
else:
    print("Umur anda tidak valid")