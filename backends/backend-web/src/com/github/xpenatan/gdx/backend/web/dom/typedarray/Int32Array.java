// Generated by esidl 0.4.0.

package com.github.xpenatan.gdx.backend.web.dom.typedarray;

public interface Int32Array extends ArrayBufferView {
	// Int32Array
	public static final int BYTES_PER_ELEMENT = 4;

	public int getLength();

	public int get(int index);

	public void set(int index, int value);

	public void set(Int32Array array);

	public void set(Int32Array array, int offset);

	public void set(LongArray array);

	public void set(LongArray array, int offset);

	public Int32Array subarray(int start, int end);
}