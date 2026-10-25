package app.chalo.uistate.components;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.compose.theme.UIShape;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.UiAlignment;
import defpackage.pk0;
import defpackage.t10;
import defpackage.uf0;
import defpackage.vo1;
import defpackage.z40;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/components/StopSelectionUISpec;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class StopSelectionUISpec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloPadding f9953a;
    public final float b;
    public final UiAlignment.Vertical c;
    public final ChaloColorToken d;
    public final UIShape e;
    public final ChaloColorToken f;
    public final float g;

    public StopSelectionUISpec(ChaloPadding chaloPadding, int i) {
        if ((i & 1) != 0) {
            float f = ChaloThemeHelper.a().f1916a;
            float f2 = ChaloThemeHelper.a().h;
            chaloPadding = new ChaloPadding(f, f2, f2, f);
        }
        float f3 = ChaloThemeHelper.a().d;
        UIShape.Rectangle backgroundShape = UIShape.e;
        float f4 = ChaloThemeHelper.a().b;
        Intrinsics.i(backgroundShape, "backgroundShape");
        this.f9953a = chaloPadding;
        this.b = f3;
        this.c = UiAlignment.Vertical.Center.f9888a;
        this.d = ChaloColorToken.White.f9870a;
        this.e = backgroundShape;
        this.f = ChaloColorToken.Gray85.f9798a;
        this.g = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StopSelectionUISpec)) {
            return false;
        }
        StopSelectionUISpec stopSelectionUISpec = (StopSelectionUISpec) obj;
        return Intrinsics.d(this.f9953a, stopSelectionUISpec.f9953a) && Dp.m7283equalsimpl0(this.b, stopSelectionUISpec.b) && Intrinsics.d(this.c, stopSelectionUISpec.c) && Intrinsics.d(this.d, stopSelectionUISpec.d) && Intrinsics.d(this.e, stopSelectionUISpec.e) && Intrinsics.d(this.f, stopSelectionUISpec.f) && Dp.m7283equalsimpl0(this.g, stopSelectionUISpec.g);
    }

    public final int hashCode() {
        int iB = pk0.b(this.e, z40.b(this.d, uf0.e(this.c, uf0.a(this.b, this.f9953a.hashCode() * 31, 31), 31), 31), 31);
        ChaloColorToken chaloColorToken = this.f;
        return Dp.m7284hashCodeimpl(this.g) + ((iB + (chaloColorToken == null ? 0 : chaloColorToken.hashCode())) * 31);
    }

    public final String toString() {
        String strM7289toStringimpl = Dp.m7289toStringimpl(this.b);
        String strM7289toStringimpl2 = Dp.m7289toStringimpl(this.g);
        StringBuilder sbN = t10.n("StopSelectionUISpec(contentPadding=", this.f9953a, ", leadingImageAndPlaceHolderSpacing=", strM7289toStringimpl, ", verticalAlignment=");
        sbN.append(this.c);
        sbN.append(", backgroundColor=");
        sbN.append(this.d);
        sbN.append(", backgroundShape=");
        sbN.append(this.e);
        sbN.append(", borderColor=");
        sbN.append(this.f);
        sbN.append(", borderWidth=");
        return vo1.p(sbN, strM7289toStringimpl2, ")");
    }
}
