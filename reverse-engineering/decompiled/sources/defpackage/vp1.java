package defpackage;

import android.app.Activity;
import android.content.Context;
import androidx.window.layout.WindowInfoTracker;
import androidx.window.layout.WindowInfoTrackerDecorator;
import androidx.window.layout.WindowLayoutInfo;
import java.util.List;
import kotlin.NotImplementedError;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public abstract /* synthetic */ class vp1 {
    static {
        WindowInfoTracker.Companion companion = WindowInfoTracker.INSTANCE;
    }

    public static WindowLayoutInfo a(WindowInfoTracker windowInfoTracker, Context context) {
        Intrinsics.i(context, "context");
        throw new NotImplementedError("Method was not implemented.");
    }

    public static List b(WindowInfoTracker windowInfoTracker) {
        throw new NotImplementedError("Method was not implemented.");
    }

    public static Flow c(WindowInfoTracker windowInfoTracker, Context context) {
        Intrinsics.i(context, "context");
        Activity activity = context instanceof Activity ? (Activity) context : null;
        Flow<WindowLayoutInfo> flowWindowLayoutInfo = activity != null ? windowInfoTracker.windowLayoutInfo(activity) : null;
        if (flowWindowLayoutInfo != null) {
            return flowWindowLayoutInfo;
        }
        throw new NotImplementedError("Must override windowLayoutInfo(context) and provide an implementation.");
    }

    public static WindowInfoTracker d(Context context) {
        return WindowInfoTracker.INSTANCE.getOrCreate(context);
    }

    public static void f(WindowInfoTrackerDecorator windowInfoTrackerDecorator) {
        WindowInfoTracker.INSTANCE.overrideDecorator(windowInfoTrackerDecorator);
    }

    public static void g() {
        WindowInfoTracker.INSTANCE.reset();
    }

    public static /* synthetic */ void e() {
    }
}
