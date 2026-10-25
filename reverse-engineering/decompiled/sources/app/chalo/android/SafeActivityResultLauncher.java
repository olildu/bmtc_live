package app.chalo.android;

import androidx.activity.result.ActivityResultLauncher;
import app.chalo.crashlytics.CrashlyticsLogger;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/android/SafeActivityResultLauncher;", "T", "", "androidApp_bmtcPrimaryRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SafeActivityResultLauncher<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MainActivity f941a;
    public final CrashlyticsLogger b;
    public final ActivityResultLauncher c;

    public SafeActivityResultLauncher(MainActivity mainActivity, CrashlyticsLogger crashlyticsLogger, ActivityResultLauncher launcher) {
        Intrinsics.i(crashlyticsLogger, "crashlyticsLogger");
        Intrinsics.i(launcher, "launcher");
        this.f941a = mainActivity;
        this.b = crashlyticsLogger;
        this.c = launcher;
    }

    public final void a(Object obj) {
        MainActivity mainActivity = this.f941a;
        if (!mainActivity.isFinishing() && !mainActivity.isDestroyed()) {
            this.c.launch(obj);
            return;
        }
        String msg = "ResultLauncher called when activity isFinishing: " + mainActivity.isFinishing() + " & isDestroyed: " + mainActivity.isDestroyed();
        Intrinsics.i(msg, "msg");
        this.b.i(new IllegalResultLauncherStateException(msg));
    }
}
