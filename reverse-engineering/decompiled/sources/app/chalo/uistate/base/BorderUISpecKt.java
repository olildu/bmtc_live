package app.chalo.uistate.base;

import androidx.compose.foundation.BorderKt;
import androidx.compose.ui.Modifier;
import app.chalo.compose.theme.ChaloThemeKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"chalo-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class BorderUISpecKt {
    public static final Modifier a(Modifier modifier, BorderUISpec spec) {
        Intrinsics.i(modifier, "<this>");
        Intrinsics.i(spec, "spec");
        return BorderKt.m275borderxT4_qwU(modifier, spec.f9753a, ChaloColorTokenKt.c(spec.b), ChaloThemeKt.d(spec.c));
    }
}
