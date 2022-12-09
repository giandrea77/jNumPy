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

import java.math.BigInteger;
import java.util.HashMap;

import io.jnumpy.generator.Generator;
import io.jnumpy.utils.JNumPyConstants;

/**
 * @author andrea
 * @since 08/12/22
 */
public class GeneratorBigInteger extends Generator<BigInteger> {

	@Override
	public BigInteger[] generateArray(int size) {
		return new BigInteger[0];
	}

	@Override
	public BigInteger[] generateArray(int size, JNumPyConstants.Sign sign) {
		return new BigInteger[0];
	}

	@Override
	public BigInteger[] generateArray(int size, BigInteger min, BigInteger max, JNumPyConstants.Sign sign) {
		return new BigInteger[0];
	}

	@Override
	public HashMap<String, Number> describe(BigInteger[] array) {
		return null;
	}

	@Override
	public BigInteger[][] generateMatrix(int rows, int columns) {
		return new BigInteger[0][];
	}

	@Override
	public BigInteger[][] generateMatrix(int rows, int columns, JNumPyConstants.Sign sign) {
		return new BigInteger[0][];
	}

	@Override
	public BigInteger[][] generateMatrix(int rows, int columns, JNumPyConstants.Sign sign, BigInteger min, BigInteger max) {
		return new BigInteger[0][];
	}

	@Override
	public String prettify(BigInteger[] array) {
		return null;
	}

	@Override
	public String prettify(BigInteger[][] matrix) {
		return null;
	}
}
