umur = input("Masukan umur Anda = ")
umur = int(umur)
if (umur >= 0 and umur <=5):
    print("Anda balita")
    umur_orangtua = input("Masukan umur Orang Tua Anda = ")
    if (int(umur_orangtua)<15):
        print("Orang tua Anda perlu pengasuh")
    else:
        print("Anda dapat mengasuh anak Anda sendiri")
elif (umur > 5 and umur <= 19):
    print("Anda remaja")
else:
    print("Umur anda tidak valid")