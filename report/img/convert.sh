for i in *.tiff;
do
    sips -s format png $i --out "$i.png"
done
rm *.tiff
rename -S .tiff.png .png *.tiff.png
