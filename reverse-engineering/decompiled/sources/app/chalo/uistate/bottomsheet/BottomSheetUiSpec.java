package app.chalo.uistate.bottomsheet;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.compose.theme.UIShape;
import app.chalo.uistate.base.ChaloColorToken;
import defpackage.z40;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/bottomsheet/BottomSheetUiSpec;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class BottomSheetUiSpec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UIShape f9906a;
    public final ChaloColorToken b;
    public final ChaloColorToken c;
    public final float d;

    public BottomSheetUiSpec(UIShape shape, ChaloColorToken chaloColorToken, ChaloColorToken chaloColorToken2, float f) {
        Intrinsics.i(shape, "shape");
        this.f9906a = shape;
        this.b = chaloColorToken;
        this.c = chaloColorToken2;
        this.d = f;
    }

    public static BottomSheetUiSpec a(BottomSheetUiSpec bottomSheetUiSpec, UIShape.Rectangle rectangle) {
        ChaloColorToken containerColor = bottomSheetUiSpec.b;
        ChaloColorToken scrimColor = bottomSheetUiSpec.c;
        float f = bottomSheetUiSpec.d;
        bottomSheetUiSpec.getClass();
        Intrinsics.i(containerColor, "containerColor");
        Intrinsics.i(scrimColor, "scrimColor");
        return new BottomSheetUiSpec(rectangle, containerColor, scrimColor, f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BottomSheetUiSpec)) {
            return false;
        }
        BottomSheetUiSpec bottomSheetUiSpec = (BottomSheetUiSpec) obj;
        return Intrinsics.d(this.f9906a, bottomSheetUiSpec.f9906a) && Intrinsics.d(this.b, bottomSheetUiSpec.b) && Intrinsics.d(this.c, bottomSheetUiSpec.c) && Dp.m7283equalsimpl0(this.d, bottomSheetUiSpec.d);
    }

    public final int hashCode() {
        return Dp.m7284hashCodeimpl(this.d) + z40.b(this.c, z40.b(this.b, this.f9906a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "BottomSheetUiSpec(shape=" + this.f9906a + ", containerColor=" + this.b + ", scrimColor=" + this.c + ", tonalElevation=" + Dp.m7289toStringimpl(this.d) + ")";
    }

    public BottomSheetUiSpec(UIShape uIShape, int i) {
        this((i & 1) != 0 ? new UIShape.Rectangle(ChaloThemeHelper.a().j, ChaloThemeHelper.a().j, 0.0f, 0.0f, 12) : uIShape, ChaloColorToken.White.f9870a, ChaloColorToken.Black_12.f9761a, Dp.m7278constructorimpl(1));
    }
}
