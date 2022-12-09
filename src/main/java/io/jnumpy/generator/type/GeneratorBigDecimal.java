/* MIT License

Copyright (c) 2022 Andrea Girardi - www.andreagirardi.it

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NON-INFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
*/
package io.jnumpy.generator.type;

import java.math.BigDecimal;
import java.util.HashMap;

import io.jnumpy.generator.Generator;
import io.jnumpy.utils.JNumPyConstants;

/**
 * @author andrea
 * @since 08/12/22
 */
public class GeneratorBigDecimal extends Generator<BigDecimal> {

	@Override
	public BigDecimal[] generateArray(int size) {
		return new BigDecimal[0];
	}

	@Override
	public BigDecimal[] generateArray(int size, JNumPyConstants.Sign sign) {
		return new BigDecimal[0];
	}

	@Override
	public BigDecimal[] generateArray(int size, BigDecimal min, BigDecimal max, JNumPyConstants.Sign sign) {
		return new BigDecimal[0];
	}

	@Override
	public HashMap<String, Number> describe(BigDecimal[] array) {
		return null;
	}

	@Override
	public BigDecimal[][] generateMatrix(int rows, int columns) {
		return new BigDecimal[0][];
	}

	@Override
	public BigDecimal[][] generateMatrix(int rows, int columns, JNumPyConstants.Sign sign) {
		return new BigDecimal[0][];
	}

	@Override
	public BigDecimal[][] generateMatrix(int rows, int columns, JNumPyConstants.Sign sign, BigDecimal min, BigDecimal max) {
		return new BigDecimal[0][];
	}

	@Override
	public String prettify(BigDecimal[] array) {
		return null;
	}

	@Override
	public String prettify(BigDecimal[][] matrix) {
		return null;
	}
}
