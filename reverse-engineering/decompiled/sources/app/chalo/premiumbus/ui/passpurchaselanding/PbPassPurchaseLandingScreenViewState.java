package app.chalo.premiumbus.ui.passpurchaselanding;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/passpurchaselanding/PbPassPurchaseLandingScreenViewState;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PbPassPurchaseLandingScreenViewState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PbPassPurchaseLandingScreenUiSpecs f7674a = new PbPassPurchaseLandingScreenUiSpecs();
    public final PbPassPurchaseLandingScreenType b;

    public PbPassPurchaseLandingScreenViewState(PbPassPurchaseLandingScreenType pbPassPurchaseLandingScreenType) {
        this.b = pbPassPurchaseLandingScreenType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PbPassPurchaseLandingScreenViewState)) {
            return false;
        }
        PbPassPurchaseLandingScreenViewState pbPassPurchaseLandingScreenViewState = (PbPassPurchaseLandingScreenViewState) obj;
        return Intrinsics.d(this.f7674a, pbPassPurchaseLandingScreenViewState.f7674a) && Intrinsics.d(this.b, pbPassPurchaseLandingScreenViewState.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f7674a.hashCode() * 31);
    }

    public final String toString() {
        return "PbPassPurchaseLandingScreenViewState(spec=" + this.f7674a + ", pbPassPurchaseLandingScreenUIState=" + this.b + ")";
    }
}
