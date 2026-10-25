package app.chalo.uistate.multimodal;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.UiAlignment;
import defpackage.pk0;
import defpackage.r30;
import defpackage.uf0;
import defpackage.z40;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/multimodal/FromAndToStopUISpecs;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class FromAndToStopUISpecs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloPadding f10039a;
    public final ChaloPadding b;
    public final UiAlignment.Vertical c;
    public final float d;
    public final ChaloColorToken e;
    public final float f;

    public FromAndToStopUISpecs(ChaloColorToken separatorColor, int i) {
        ChaloPadding chaloPadding = new ChaloPadding(0.0f, Dp.m7278constructorimpl((float) 5.5d), 0.0f, 0.0f, 13);
        ChaloPadding chaloPadding2 = new ChaloPadding(0.0f, ChaloThemeHelper.a().h, 0.0f, 0.0f, 13);
        float f = ChaloThemeHelper.a().d;
        separatorColor = (i & 16) != 0 ? ChaloColorToken.ShadyGray.f9851a : separatorColor;
        float f2 = ChaloThemeHelper.a().b;
        Intrinsics.i(separatorColor, "separatorColor");
        this.f10039a = chaloPadding;
        this.b = chaloPadding2;
        this.c = UiAlignment.Vertical.Center.f9888a;
        this.d = f;
        this.e = separatorColor;
        this.f = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FromAndToStopUISpecs)) {
            return false;
        }
        FromAndToStopUISpecs fromAndToStopUISpecs = (FromAndToStopUISpecs) obj;
        return Intrinsics.d(this.f10039a, fromAndToStopUISpecs.f10039a) && Intrinsics.d(this.b, fromAndToStopUISpecs.b) && Intrinsics.d(this.c, fromAndToStopUISpecs.c) && Dp.m7283equalsimpl0(this.d, fromAndToStopUISpecs.d) && Intrinsics.d(this.e, fromAndToStopUISpecs.e) && Dp.m7283equalsimpl0(this.f, fromAndToStopUISpecs.f);
    }

    public final int hashCode() {
        return Dp.m7284hashCodeimpl(this.f) + z40.b(this.e, uf0.a(this.d, uf0.e(this.c, r30.c(this.b, this.f10039a.hashCode() * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        String strM7289toStringimpl = Dp.m7289toStringimpl(this.d);
        String strM7289toStringimpl2 = Dp.m7289toStringimpl(this.f);
        StringBuilder sbM = pk0.m("FromAndToStopUISpecs(rowPadding=", this.f10039a, ", textColumnPadding=", this.b, ", rowVerticalAlignment=");
        sbM.append(this.c);
        sbM.append(", fromToStopTextSeparation=");
        sbM.append(strM7289toStringimpl);
        sbM.append(", separatorColor=");
        sbM.append(this.e);
        sbM.append(", separatorWidth=");
        sbM.append(strM7289toStringimpl2);
        sbM.append(")");
        return sbM.toString();
    }
}
