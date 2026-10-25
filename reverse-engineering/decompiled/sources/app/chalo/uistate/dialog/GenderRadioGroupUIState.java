package app.chalo.uistate.dialog;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.uistate.base.UiEventHandler$Companion$fromLambda$1;
import app.chalo.uistate.text.TextUIState;
import defpackage.gf;
import defpackage.r30;
import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/dialog/GenderRadioGroupUIState;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class GenderRadioGroupUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f9999a;
    public final TextUIState.ChaloTextUIState b;
    public final UiEventHandler$Companion$fromLambda$1 c;
    public final ChaloPadding d;
    public final float e;

    public GenderRadioGroupUIState(boolean z, TextUIState.ChaloTextUIState chaloTextUIState, UiEventHandler$Companion$fromLambda$1 uiEventHandler$Companion$fromLambda$1) {
        ChaloPadding chaloPadding = new ChaloPadding(ChaloThemeHelper.a().d, ChaloThemeHelper.a().d, ChaloThemeHelper.a().e, ChaloThemeHelper.a().d);
        float f = ChaloThemeHelper.a().f;
        this.f9999a = z;
        this.b = chaloTextUIState;
        this.c = uiEventHandler$Companion$fromLambda$1;
        this.d = chaloPadding;
        this.e = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GenderRadioGroupUIState)) {
            return false;
        }
        GenderRadioGroupUIState genderRadioGroupUIState = (GenderRadioGroupUIState) obj;
        return this.f9999a == genderRadioGroupUIState.f9999a && Intrinsics.d(this.b, genderRadioGroupUIState.b) && Intrinsics.d(this.c, genderRadioGroupUIState.c) && Intrinsics.d(this.d, genderRadioGroupUIState.d) && Dp.m7283equalsimpl0(this.e, genderRadioGroupUIState.e);
    }

    public final int hashCode() {
        return Dp.m7284hashCodeimpl(this.e) + r30.c(this.d, gf.a(this.c, r30.f(this.b, (this.f9999a ? 1231 : 1237) * 31, 31), 31), 31);
    }

    public final String toString() {
        String strM7289toStringimpl = Dp.m7289toStringimpl(this.e);
        StringBuilder sb = new StringBuilder("GenderRadioGroupUIState(isSelected=");
        sb.append(this.f9999a);
        sb.append(", text=");
        sb.append(this.b);
        sb.append(", eventHandler=");
        sb.append(this.c);
        sb.append(", paddingAround=");
        sb.append(this.d);
        sb.append(", spaceBetween=");
        return vo1.p(sb, strM7289toStringimpl, ")");
    }
}
