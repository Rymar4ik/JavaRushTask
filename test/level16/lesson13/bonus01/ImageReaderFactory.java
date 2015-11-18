package com.javarush.test.level16.lesson13.bonus01;

import com.javarush.test.level16.lesson13.bonus01.common.ImageReader;
import com.javarush.test.level16.lesson13.bonus01.common.ImageTypes;
import com.javarush.test.level16.lesson13.bonus01.common.BmpReader;
import com.javarush.test.level16.lesson13.bonus01.common.JpgReader;
import com.javarush.test.level16.lesson13.bonus01.common.PngReader;

/**
 * Created by Станислав on 18.10.2015.
 */
public class ImageReaderFactory {

    public static ImageReader getReader (ImageTypes t){
            if(t == ImageTypes.BMP)
                return new BmpReader();
            else if(t == ImageTypes.JPG)
                return new JpgReader();
            else if(t == ImageTypes.PNG)
                return new PngReader();
            else
                throw new IllegalArgumentException("Неизвестный тип картинки");
    }
}
