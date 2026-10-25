package app.chalo.uistate.error;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.uistate.base.UiAlignment;
import app.chalo.uistate.base.UiArrangement;
import defpackage.cb0;
import defpackage.t10;
import defpackage.uf0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/error/ErrorWithMsgAndRetryUISpecs;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ErrorWithMsgAndRetryUISpecs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloPadding f10021a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final UiAlignment.Horizontal f;
    public final UiArrangement.HorizontalOrVertical g;
    public final boolean h;

    public ErrorWithMsgAndRetryUISpecs(ChaloPadding contentPadding, float f, float f2, float f3, float f4, UiAlignment.Horizontal horizontal, UiArrangement.HorizontalOrVertical horizontalOrVertical, boolean z) {
        Intrinsics.i(contentPadding, "contentPadding");
        this.f10021a = contentPadding;
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = f4;
        this.f = horizontal;
        this.g = horizontalOrVertical;
        this.h = z;
    }

    public static ErrorWithMsgAndRetryUISpecs a(ErrorWithMsgAndRetryUISpecs errorWithMsgAndRetryUISpecs, ChaloPadding chaloPadding, boolean z, int i) {
        if ((i & 1) != 0) {
            chaloPadding = errorWithMsgAndRetryUISpecs.f10021a;
        }
        ChaloPadding contentPadding = chaloPadding;
        float f = errorWithMsgAndRetryUISpecs.b;
        float f2 = errorWithMsgAndRetryUISpecs.c;
        float f3 = errorWithMsgAndRetryUISpecs.d;
        float f4 = errorWithMsgAndRetryUISpecs.e;
        UiAlignment.Horizontal horizontalAlignment = errorWithMsgAndRetryUISpecs.f;
        UiArrangement.HorizontalOrVertical verticalArrangement = errorWithMsgAndRetryUISpecs.g;
        Intrinsics.i(contentPadding, "contentPadding");
        Intrinsics.i(horizontalAlignment, "horizontalAlignment");
        Intrinsics.i(verticalArrangement, "verticalArrangement");
        return new ErrorWithMsgAndRetryUISpecs(contentPadding, f, f2, f3, f4, horizontalAlignment, verticalArrangement, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ErrorWithMsgAndRetryUISpecs)) {
            return false;
        }
        ErrorWithMsgAndRetryUISpecs errorWithMsgAndRetryUISpecs = (ErrorWithMsgAndRetryUISpecs) obj;
        return Intrinsics.d(this.f10021a, errorWithMsgAndRetryUISpecs.f10021a) && Dp.m7283equalsimpl0(this.b, errorWithMsgAndRetryUISpecs.b) && Dp.m7283equalsimpl0(this.c, errorWithMsgAndRetryUISpecs.c) && Dp.m7283equalsimpl0(this.d, errorWithMsgAndRetryUISpecs.d) && Dp.m7283equalsimpl0(this.e, errorWithMsgAndRetryUISpecs.e) && Intrinsics.d(this.f, errorWithMsgAndRetryUISpecs.f) && Intrinsics.d(this.g, errorWithMsgAndRetryUISpecs.g) && this.h == errorWithMsgAndRetryUISpecs.h;
    }

    public final int hashCode() {
        return ((this.g.hashCode() + uf0.d(this.f, uf0.a(this.e, uf0.a(this.d, uf0.a(this.c, uf0.a(this.b, this.f10021a.hashCode() * 31, 31), 31), 31), 31), 31)) * 31) + (this.h ? 1231 : 1237);
    }

    public final String toString() {
        String strM7289toStringimpl = Dp.m7289toStringimpl(this.b);
        String strM7289toStringimpl2 = Dp.m7289toStringimpl(this.c);
        String strM7289toStringimpl3 = Dp.m7289toStringimpl(this.d);
        String strM7289toStringimpl4 = Dp.m7289toStringimpl(this.e);
        StringBuilder sbN = t10.n("ErrorWithMsgAndRetryUISpecs(contentPadding=", this.f10021a, ", spaceBetweenImgAndTitle=", strM7289toStringimpl, ", spaceBetweenTitleAndMsg=");
        cb0.t(sbN, strM7289toStringimpl2, ", spaceBetweenTitleAndBtn=", strM7289toStringimpl3, ", spaceBetweenButtons=");
        sbN.append(strM7289toStringimpl4);
        sbN.append(", horizontalAlignment=");
        sbN.append(this.f);
        sbN.append(", verticalArrangement=");
        sbN.append(this.g);
        sbN.append(", shouldButtonsOccupyMaxWidth=");
        sbN.append(this.h);
        sbN.append(")");
        return sbN.toString();
    }

    public ErrorWithMsgAndRetryUISpecs(ChaloPadding chaloPadding, float f, float f2, float f3, int i) {
        this((i & 1) != 0 ? new ChaloPadding(ChaloThemeHelper.a().h, 0.0f, 2) : chaloPadding, (i & 2) != 0 ? ChaloThemeHelper.a().i : f, (i & 4) != 0 ? ChaloThemeHelper.a().g : f2, (i & 8) != 0 ? ChaloThemeHelper.a().i : f3, ChaloThemeHelper.a().h, UiAlignment.Horizontal.Center.f9884a, UiArrangement.HorizontalOrVertical.Center.f9890a, (i & 128) == 0);
    }
}
