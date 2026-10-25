package app.chalo.productpurchase.passpurchase.ui.proofoverview;

import app.chalo.uistate.base.UiEventHandler$Companion$fromLambda$1;
import app.chalo.uistate.text.TextUIState;
import defpackage.gf;
import defpackage.r30;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productpurchase/passpurchase/ui/proofoverview/SuperPassProofOverviewConsentUIState;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SuperPassProofOverviewConsentUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f8465a;
    public final TextUIState.ChaloTextUIState b;
    public final UiEventHandler$Companion$fromLambda$1 c;
    public final SuperPassProofOverviewConsentUISpec d;

    public SuperPassProofOverviewConsentUIState(boolean z, TextUIState.ChaloTextUIState chaloTextUIState, UiEventHandler$Companion$fromLambda$1 uiEventHandler$Companion$fromLambda$1) {
        SuperPassProofOverviewConsentUISpec superPassProofOverviewConsentUISpec = new SuperPassProofOverviewConsentUISpec();
        this.f8465a = z;
        this.b = chaloTextUIState;
        this.c = uiEventHandler$Companion$fromLambda$1;
        this.d = superPassProofOverviewConsentUISpec;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuperPassProofOverviewConsentUIState)) {
            return false;
        }
        SuperPassProofOverviewConsentUIState superPassProofOverviewConsentUIState = (SuperPassProofOverviewConsentUIState) obj;
        return this.f8465a == superPassProofOverviewConsentUIState.f8465a && Intrinsics.d(this.b, superPassProofOverviewConsentUIState.b) && Intrinsics.d(this.c, superPassProofOverviewConsentUIState.c) && Intrinsics.d(this.d, superPassProofOverviewConsentUIState.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + gf.a(this.c, r30.f(this.b, (this.f8465a ? 1231 : 1237) * 31, 31), 31);
    }

    public final String toString() {
        return "SuperPassProofOverviewConsentUIState(isChecked=" + this.f8465a + ", title=" + this.b + ", eventHandler=" + this.c + ", spec=" + this.d + ")";
    }
}
