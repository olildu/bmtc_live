package app.chalo.uistate.base;

import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"chalo-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ChaloColorToken_androidKt {
    public static final long a(Color.Companion fromHex, String hex, long j) {
        Intrinsics.i(fromHex, "$this$fromHex");
        Intrinsics.i(hex, "hex");
        try {
            return hex.length() == 0 ? Color.INSTANCE.m4640getTransparent0d7_KjU() : ColorKt.Color(android.graphics.Color.parseColor(hex));
        } catch (Exception unused) {
            return j;
        }
    }
}
