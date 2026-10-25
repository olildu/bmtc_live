package app.chalo.productpurchase.passpurchase.ui.confirmation;

import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.uistate.text.TextUIState;
import defpackage.py;
import defpackage.r30;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productpurchase/passpurchase/ui/confirmation/SuperPassTncSectionUIState;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SuperPassTncSectionUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextUIState.ChaloTextUIState f8400a;
    public final TextUIState b;
    public final TextUIState.StyledTextUIState c;
    public final ChaloPadding d;
    public final ChaloPadding e;

    public SuperPassTncSectionUIState(TextUIState.ChaloTextUIState chaloTextUIState, TextUIState.StyledTextUIState styledTextUIState, TextUIState.StyledTextUIState styledTextUIState2) {
        float f = ChaloThemeHelper.a().i;
        float f2 = ChaloThemeHelper.a().h;
        ChaloPadding chaloPadding = new ChaloPadding(f, f2, f2, f);
        ChaloPadding chaloPadding2 = new ChaloPadding(ChaloThemeHelper.a().d, 0.0f, 0.0f, 0.0f, 14);
        this.f8400a = chaloTextUIState;
        this.b = styledTextUIState;
        this.c = styledTextUIState2;
        this.d = chaloPadding;
        this.e = chaloPadding2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuperPassTncSectionUIState)) {
            return false;
        }
        SuperPassTncSectionUIState superPassTncSectionUIState = (SuperPassTncSectionUIState) obj;
        return Intrinsics.d(this.f8400a, superPassTncSectionUIState.f8400a) && Intrinsics.d(this.b, superPassTncSectionUIState.b) && Intrinsics.d(this.c, superPassTncSectionUIState.c) && Intrinsics.d(this.d, superPassTncSectionUIState.d) && Intrinsics.d(this.e, superPassTncSectionUIState.e);
    }

    public final int hashCode() {
        int iHashCode = this.f8400a.hashCode() * 31;
        TextUIState textUIState = this.b;
        return this.e.hashCode() + r30.c(this.d, (this.c.hashCode() + ((iHashCode + (textUIState == null ? 0 : textUIState.hashCode())) * 31)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SuperPassTncSectionUIState(title=");
        sb.append(this.f8400a);
        sb.append(", highlightedTnc=");
        sb.append(this.b);
        sb.append(", detailedTnc=");
        sb.append(this.c);
        sb.append(", internalPadding=");
        sb.append(this.d);
        sb.append(", paddingAroundDetailedTnc=");
        return py.e(sb, this.e, ")");
    }
}
