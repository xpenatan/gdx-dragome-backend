/*******************************************************************************
 * Copyright 2016 Natan Guilherme.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/

package com.github.xpenatan.gdx.backends.dragome;

import com.badlogic.gdx.utils.Clipboard;

/** Ported from GWT backend
 * @author xpenatan */
public class DragomeClipboard implements Clipboard {

	private String content = "";

	@Override
	public String getContents () {
		return content;
	}

	@Override
	public void setContents (String content) {
		this.content = content;
	}

	@Override
	public boolean hasContents () {
		// TODO Auto-generated method stub
		return false;
	}
}
