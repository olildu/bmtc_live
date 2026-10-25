package app.chalo.productbooking.common.uistate;

import app.chalo.uistate.text.TextUIState;
import defpackage.n21;
import defpackage.r30;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productbooking/common/uistate/FareLineUiState;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class FareLineUiState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextUIState.ChaloTextUIState f8270a;
    public final TextUIState.ChaloTextUIState b;
    public final FareLineUiSpec c;

    public FareLineUiState(TextUIState.ChaloTextUIState chaloTextUIState, TextUIState.ChaloTextUIState chaloTextUIState2) {
        FareLineUiSpec fareLineUiSpec = new FareLineUiSpec();
        this.f8270a = chaloTextUIState;
        this.b = chaloTextUIState2;
        this.c = fareLineUiSpec;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FareLineUiState)) {
            return false;
        }
        FareLineUiState fareLineUiState = (FareLineUiState) obj;
        return Intrinsics.d(this.f8270a, fareLineUiState.f8270a) && Intrinsics.d(this.b, fareLineUiState.b) && Intrinsics.d(this.c, fareLineUiState.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + r30.f(this.b, this.f8270a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sbJ = n21.j("FareLineUiState(label=", this.f8270a, ", value=", this.b, ", uiSpec=");
        sbJ.append(this.c);
        sbJ.append(")");
        return sbJ.toString();
    }
}
