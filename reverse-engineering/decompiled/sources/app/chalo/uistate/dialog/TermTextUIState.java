package app.chalo.uistate.dialog;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.uistate.text.TextUIState;
import defpackage.r30;
import defpackage.t10;
import defpackage.uf0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/dialog/TermTextUIState;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class TermTextUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloPadding f10012a;
    public final float b;
    public final TextUIState.ChaloTextUIState c;
    public final TextUIState.ChaloTextUIState d;

    public TermTextUIState(TextUIState.ChaloTextUIState chaloTextUIState, TextUIState.ChaloTextUIState chaloTextUIState2) {
        float f = ChaloThemeHelper.a().d;
        ChaloPadding chaloPadding = new ChaloPadding(f, f, f, f);
        float f2 = ChaloThemeHelper.a().f;
        this.f10012a = chaloPadding;
        this.b = f2;
        this.c = chaloTextUIState;
        this.d = chaloTextUIState2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TermTextUIState)) {
            return false;
        }
        TermTextUIState termTextUIState = (TermTextUIState) obj;
        return Intrinsics.d(this.f10012a, termTextUIState.f10012a) && Dp.m7283equalsimpl0(this.b, termTextUIState.b) && Intrinsics.d(this.c, termTextUIState.c) && Intrinsics.d(this.d, termTextUIState.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + r30.f(this.c, uf0.a(this.b, this.f10012a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sbN = t10.n("TermTextUIState(padding=", this.f10012a, ", horizontalSpacing=", Dp.m7289toStringimpl(this.b), ", termNumber=");
        sbN.append(this.c);
        sbN.append(", term=");
        sbN.append(this.d);
        sbN.append(")");
        return sbN.toString();
    }
}
