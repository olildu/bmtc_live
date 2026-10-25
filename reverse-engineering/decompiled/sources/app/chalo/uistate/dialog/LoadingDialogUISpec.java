package app.chalo.uistate.dialog;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.UiAlignment;
import defpackage.py;
import defpackage.r30;
import defpackage.uf0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/dialog/LoadingDialogUISpec;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class LoadingDialogUISpec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloColorToken f10005a;
    public final ChaloPadding b;
    public final float c;
    public final UiAlignment.Vertical d;

    public LoadingDialogUISpec() {
        float f = ChaloThemeHelper.a().j;
        float fM7278constructorimpl = Dp.m7278constructorimpl(ChaloThemeHelper.a().j + ChaloThemeHelper.a().i);
        ChaloPadding chaloPadding = new ChaloPadding(f, fM7278constructorimpl, fM7278constructorimpl, f);
        float f2 = ChaloThemeHelper.a().k;
        this.f10005a = ChaloColorToken.White.f9870a;
        this.b = chaloPadding;
        this.c = f2;
        this.d = UiAlignment.Vertical.Center.f9888a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LoadingDialogUISpec)) {
            return false;
        }
        LoadingDialogUISpec loadingDialogUISpec = (LoadingDialogUISpec) obj;
        return Intrinsics.d(this.f10005a, loadingDialogUISpec.f10005a) && Intrinsics.d(this.b, loadingDialogUISpec.b) && Dp.m7283equalsimpl0(this.c, loadingDialogUISpec.c) && Intrinsics.d(this.d, loadingDialogUISpec.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + uf0.a(this.c, r30.c(this.b, this.f10005a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        String strM7289toStringimpl = Dp.m7289toStringimpl(this.c);
        StringBuilder sbI = py.i(this.b, this.f10005a, "LoadingDialogUISpec(backgroundColor=", ", internalPadding=", ", progressAndTextBetweenSpace=");
        sbI.append(strM7289toStringimpl);
        sbI.append(", verticalAlignment=");
        sbI.append(this.d);
        sbI.append(")");
        return sbI.toString();
    }
}
