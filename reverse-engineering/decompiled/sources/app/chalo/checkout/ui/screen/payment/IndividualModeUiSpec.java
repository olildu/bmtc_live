package app.chalo.checkout.ui.screen.payment;

import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.UiArrangement;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/checkout/ui/screen/payment/IndividualModeUiSpec;", "", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class IndividualModeUiSpec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloColorToken f1514a = ChaloColorToken.White.f9870a;
    public final UiArrangement.HorizontalOrVertical b = UiArrangement.HorizontalOrVertical.Center.f9890a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IndividualModeUiSpec)) {
            return false;
        }
        IndividualModeUiSpec individualModeUiSpec = (IndividualModeUiSpec) obj;
        return Intrinsics.d(this.f1514a, individualModeUiSpec.f1514a) && Intrinsics.d(this.b, individualModeUiSpec.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f1514a.hashCode() * 31);
    }

    public final String toString() {
        return "IndividualModeUiSpec(backGroundColorToken=" + this.f1514a + ", verticalArrangement=" + this.b + ")";
    }
}
