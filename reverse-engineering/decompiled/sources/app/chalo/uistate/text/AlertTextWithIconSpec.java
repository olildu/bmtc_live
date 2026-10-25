package app.chalo.uistate.text;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.uistate.base.UiAlignment;
import defpackage.r30;
import defpackage.uf0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/text/AlertTextWithIconSpec;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class AlertTextWithIconSpec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloPadding f10075a;
    public final UiAlignment b;
    public final float c;
    public final float d;

    public AlertTextWithIconSpec(float f, int i) {
        ChaloPadding chaloPadding = new ChaloPadding(0.0f, 0.0f, 3);
        f = (i & 4) != 0 ? ChaloThemeHelper.a().e : f;
        float f2 = ChaloThemeHelper.a().f1916a;
        this.f10075a = chaloPadding;
        this.b = UiAlignment.Vertical.Center.f9888a;
        this.c = f;
        this.d = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AlertTextWithIconSpec)) {
            return false;
        }
        AlertTextWithIconSpec alertTextWithIconSpec = (AlertTextWithIconSpec) obj;
        return Intrinsics.d(this.f10075a, alertTextWithIconSpec.f10075a) && Intrinsics.d(this.b, alertTextWithIconSpec.b) && Dp.m7283equalsimpl0(this.c, alertTextWithIconSpec.c) && Dp.m7283equalsimpl0(this.d, alertTextWithIconSpec.d);
    }

    public final int hashCode() {
        return Dp.m7284hashCodeimpl(this.d) + uf0.a(this.c, (this.b.hashCode() + (this.f10075a.hashCode() * 31)) * 31, 31);
    }

    public final String toString() {
        String strM7289toStringimpl = Dp.m7289toStringimpl(this.c);
        String strM7289toStringimpl2 = Dp.m7289toStringimpl(this.d);
        StringBuilder sb = new StringBuilder("AlertTextWithIconSpec(contentPadding=");
        sb.append(this.f10075a);
        sb.append(", alignment=");
        sb.append(this.b);
        sb.append(", iconAndTextSpacing=");
        return r30.i(sb, strM7289toStringimpl, ", iconTopSpacing=", strM7289toStringimpl2, ")");
    }
}
