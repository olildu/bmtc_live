package app.chalo.compose.components;

import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import defpackage.xj;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"chalo-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class PlotlineComposeWidgetKt {
    public static Modifier a(Modifier modifier, String label) {
        Intrinsics.i(modifier, "<this>");
        Intrinsics.i(label, "label");
        return ComposedModifierKt.composed$default(modifier, null, new xj(label, 5), 1, null);
    }

    public static final Modifier b(Modifier modifier, String str) {
        Intrinsics.i(modifier, "<this>");
        return ComposedModifierKt.composed$default(modifier, null, new xj(str, 6), 1, null);
    }
}
