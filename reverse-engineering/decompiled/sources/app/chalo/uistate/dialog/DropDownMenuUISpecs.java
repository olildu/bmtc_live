package app.chalo.uistate.dialog;

import androidx.compose.ui.unit.Dp;
import app.chalo.uistate.base.ChaloColorToken;
import defpackage.uf0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/dialog/DropDownMenuUISpecs;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class DropDownMenuUISpecs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloColorToken f9994a;
    public final float b;
    public final Dp c;

    public DropDownMenuUISpecs(ChaloColorToken background, float f, Dp dp) {
        Intrinsics.i(background, "background");
        this.f9994a = background;
        this.b = f;
        this.c = dp;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DropDownMenuUISpecs)) {
            return false;
        }
        DropDownMenuUISpecs dropDownMenuUISpecs = (DropDownMenuUISpecs) obj;
        return Intrinsics.d(this.f9994a, dropDownMenuUISpecs.f9994a) && Dp.m7283equalsimpl0(this.b, dropDownMenuUISpecs.b) && Intrinsics.d(this.c, dropDownMenuUISpecs.c);
    }

    public final int hashCode() {
        int iA = uf0.a(this.b, this.f9994a.hashCode() * 31, 31);
        Dp dp = this.c;
        return iA + (dp == null ? 0 : Dp.m7284hashCodeimpl(dp.m7292unboximpl()));
    }

    public final String toString() {
        return "DropDownMenuUISpecs(background=" + this.f9994a + ", spaceAfterItems=" + Dp.m7289toStringimpl(this.b) + ", width=" + this.c + ")";
    }
}
