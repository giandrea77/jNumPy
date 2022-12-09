/* MIT License
-----------

Copyright (c) 2021 Andrea Girardi (https://www.andreagirardi.it)
Permission is hereby granted, free of charge, to any person
obtaining a copy of this software and associated documentation
files (the "Software"), to deal in the Software without
restriction, including without limitation the rights to use,
copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the
Software is furnished to do so, subject to the following
conditions:

The above copyright notice and this permission notice shall be
included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES
OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT
HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY,
WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING
FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR
OTHER DEALINGS IN THE SOFTWARE. */

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;

import io.jnumpy.generator.Generator;
import io.jnumpy.generator.type.GeneratorDouble;
import io.jnumpy.generator.type.GeneratorInteger;
import io.jnumpy.utils.JNumPyConstants;

/**
 * @author : Andrea Girardi
 * @created : Dec, 2022
 */
public class JmllArrayTest {

    private final int ARRAY_SIZE = 100;
    private Integer randomNumber;

    private static Logger logger = LogManager.getLogger(JmllArrayTest.class);

    @Test
    void arrayOfIntegers() {

        Generator<Integer> generator = new GeneratorInteger();

        assertEquals(ARRAY_SIZE, generator.generateArray(ARRAY_SIZE).length);
        assertEquals(ARRAY_SIZE, generator.generateArray(ARRAY_SIZE, JNumPyConstants.Sign.POSITIVE).length);
        assertEquals(ARRAY_SIZE, generator.generateArray(ARRAY_SIZE, JNumPyConstants.Sign.NEGATIVE).length);
        assertEquals(ARRAY_SIZE, generator.generateArray(ARRAY_SIZE, JNumPyConstants.Sign.NEUTRAL).length);
        assertEquals(ARRAY_SIZE, generator.generateArray(ARRAY_SIZE, 0, 10, JNumPyConstants.Sign.POSITIVE).length);
    }

    @Test
    void arrayOfDoubles() {
        Generator<Double> generator = new GeneratorDouble();
        assertEquals(ARRAY_SIZE, generator.generateArray(ARRAY_SIZE).length);
        assertEquals(ARRAY_SIZE, generator.generateArray(ARRAY_SIZE, JNumPyConstants.Sign.POSITIVE).length);
        assertEquals(ARRAY_SIZE, generator.generateArray(ARRAY_SIZE, JNumPyConstants.Sign.NEGATIVE).length);
        assertEquals(ARRAY_SIZE, generator.generateArray(ARRAY_SIZE, JNumPyConstants.Sign.NEUTRAL).length);
        assertEquals(ARRAY_SIZE, generator.generateArray(ARRAY_SIZE, 0D, 10D, JNumPyConstants.Sign.POSITIVE).length);
    }


    @Test
    void describeIntegerArray() {

        Generator<Integer> generator = new GeneratorInteger();
        Integer[] array = generator.generateArray(10, -10, 10, JNumPyConstants.Sign.NEUTRAL);
        logger.debug(generator.prettify(array));
        logger.debug(generator.describe(array));

    }

    @Test
    void describeDoubleArray() {

        Generator<Double> generator = new GeneratorDouble();
        Double[] array = generator.generateArray(10, -10D, 10D, JNumPyConstants.Sign.NEUTRAL);
        logger.debug(generator.prettify(array));
        logger.debug(generator.describe(array));

    }

}
