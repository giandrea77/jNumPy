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

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import com.google.gson.Gson;

import io.jnumpy.generator.Generator;
import io.jnumpy.generator.type.GeneratorInteger;
import io.jnumpy.utils.JNumPyConstants;

/**
 * @author : Andrea Girardi
 * @created : Dec, 2022
 */
class JmllMatrixTest {

    private static Logger logger = LogManager.getLogger(JmllMatrixTest.class);

    private final int row = 1000;
    private final int column = 1000;

    /**
     * Private method used to check the signs of the single values
     *
     * @param matrix
     * @param row
     * @param column
     * @param sign
     * @return
     */
    private boolean checkMatrix(Integer[][] matrix, int row, int column, JNumPyConstants.Sign sign) {

        for ( int index = 0; index < row; index++ ) {

            Integer found = Arrays.asList(matrix[index]).stream().filter(item ->  JNumPyConstants.Sign.checkSign(item) == sign).findAny().orElse(0);

            for ( int innerIndex = 0; innerIndex < column; innerIndex++ ) {
                if ( JNumPyConstants.Sign.checkSign(matrix[index][innerIndex]) != sign ) {
                    return false;
                }
            }

        }

        return true;

    }


    @Test
    @Order(0)
    void generateIntegerMatrix() {
        Generator<Integer> generatorInteger = new GeneratorInteger();
        Integer[][] matrix = generatorInteger.generateMatrix(row, column);
        logger.trace("Matrix: " + generatorInteger.prettify(matrix));
    }

    @Test
    @Order(2)
    void generatePositiveIntegerMatrix() {

        Generator<Integer> generatorInteger = new GeneratorInteger();
        Integer[][] matrixPositive = generatorInteger.generateMatrix(row, column, JNumPyConstants.Sign.POSITIVE);
        logger.trace("matrixPositive: " + generatorInteger.prettify(matrixPositive));

        assertTrue(checkMatrix(matrixPositive, row, column, JNumPyConstants.Sign.POSITIVE));

    }

    @Test
    @Order(3)
    void generateNegativeIntegerMatrix() {

        Generator<Integer> generatorInteger = new GeneratorInteger();
        Integer[][] matrixNegative = generatorInteger.generateMatrix(row, column, JNumPyConstants.Sign.NEGATIVE);
        logger.trace("matrixNegative: " + generatorInteger.prettify(matrixNegative));

        assertTrue(true == checkMatrix(matrixNegative, row, column, JNumPyConstants.Sign.NEGATIVE));

    }

    @Test
    @Order(4)
    void generateNeutralIntegerMatrixMinMax() {

        Generator<Integer> generatorInteger = new GeneratorInteger();
        Integer[][] matrixMinMax = generatorInteger.generateMatrix(row, column, JNumPyConstants.Sign.NEUTRAL, 100, 1000);
        logger.trace("matrixMinMax: " + generatorInteger.prettify(matrixMinMax));

    }

    @Test
    @Order(5)
    void descriptionOfNeutralIntegerMatrixMinMax() {

        Generator<Integer> generatorInteger = new GeneratorInteger();
        Integer[][] matrixMinMax = generatorInteger.generateMatrix(row, column, JNumPyConstants.Sign.NEUTRAL, 1, 50);
        logger.info("matrixMinMax: " + generatorInteger.prettify(matrixMinMax));

        logger.info("description [0]: " + new Gson().toJson(generatorInteger.describe(matrixMinMax[0])));
        logger.info("description [1]: " + new Gson().toJson(generatorInteger.describe(matrixMinMax[1])));
        logger.info("description [2]: " + new Gson().toJson(generatorInteger.describe(matrixMinMax[2])));

    }

}
