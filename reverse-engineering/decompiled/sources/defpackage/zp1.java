package defpackage;

import android.content.Context;
import androidx.window.layout.WindowMetrics;
import androidx.window.layout.WindowMetricsCalculator;
import androidx.window.layout.WindowMetricsCalculatorDecorator;
import kotlin.NotImplementedError;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public abstract /* synthetic */ class zp1 {
    static {
        WindowMetricsCalculator.Companion companion = WindowMetricsCalculator.INSTANCE;
    }

    public static WindowMetrics a(WindowMetricsCalculator windowMetricsCalculator, Context context) {
        Intrinsics.i(context, "context");
        throw new NotImplementedError("Must override computeCurrentWindowMetrics(context) and provide an implementation.");
    }

    public static WindowMetrics b(WindowMetricsCalculator windowMetricsCalculator, Context context) {
        Intrinsics.i(context, "context");
        throw new NotImplementedError("Must override computeMaximumWindowMetrics(context) and provide an implementation.");
    }

    public static WindowMetricsCalculator c() {
        return WindowMetricsCalculator.INSTANCE.getOrCreate();
    }

    public static void d(WindowMetricsCalculatorDecorator windowMetricsCalculatorDecorator) {
        WindowMetricsCalculator.INSTANCE.overrideDecorator(windowMetricsCalculatorDecorator);
    }

    public static void e() {
        WindowMetricsCalculator.INSTANCE.reset();
    }
}
