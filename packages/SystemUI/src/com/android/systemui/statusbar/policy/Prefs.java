/*
 * Copyright (C) 2010 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.android.systemui.statusbar.policy;

import android.content.Context;
import android.content.SharedPreferences;

public class Prefs {
    private static final String SHARED_PREFS_NAME = "status_bar";

    public static final String SHOWN_COMPAT_MODE_HELP = "shown_compat_mode_help";
    public static final String SHOWN_QUICK_SETTINGS_HELP = "shown_quick_settings_help";

    public static final String HIDING_NAVIGATION_CONFIRMED = "hiding_navigation_confirmed";

    public static SharedPreferences read(Context context) {
        return context.getSharedPreferences(Prefs.SHARED_PREFS_NAME, Context.MODE_PRIVATE);
    }

    public static SharedPreferences.Editor edit(Context context) {
        return context.getSharedPreferences(Prefs.SHARED_PREFS_NAME, Context.MODE_PRIVATE).edit();
    }
}
