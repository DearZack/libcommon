package com.serenegiant.widget;
/*
 * libcommon
 * utility/helper classes for myself
 *
 * Copyright (c) 2014-2019 saki t_saki@serenegiant.com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
*/

import android.content.Context;
import android.util.AttributeSet;

import com.serenegiant.glutils.IRendererHolder;
import com.serenegiant.glutils.RendererHolder;

import androidx.annotation.NonNull;

/**
 * Sub class of GLSurfaceView to display camera preview and write video frame to capturing surface
 */
public final class CameraGLView extends AbstractCameraGLView {

	private static final boolean DEBUG = false; // TODO set false on release
	private static final String TAG = CameraGLView.class.getSimpleName();

	public CameraGLView(final Context context) {
		this(context, null, 0);
	}

	public CameraGLView(final Context context, final AttributeSet attrs) {
		this(context, attrs, 0);
	}

	public CameraGLView(final Context context, final AttributeSet attrs, final int defStyle) {
		super(context, attrs, defStyle);
	}

	@NonNull
	@Override
	protected IRendererHolder createRendererHolder(final int width, final int height,
		final IRendererHolder.RenderHolderCallback callback) {

		return new RendererHolder(width, height, callback);
	}

}
