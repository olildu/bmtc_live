package app.chalo.productpurchase.passpurchase.ui.proofoverview;

import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productpurchase/passpurchase/ui/proofoverview/SuperPassProofOverviewUISpec;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SuperPassProofOverviewUISpec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloPadding f8483a;
    public final ChaloPadding b;

    public SuperPassProofOverviewUISpec() {
        ChaloPadding chaloPadding = new ChaloPadding(ChaloThemeHelper.a().h, 0.0f, 0.0f, 0.0f, 14);
        ChaloPadding chaloPadding2 = new ChaloPadding(ChaloThemeHelper.a().h, 0.0f, 2);
        this.f8483a = chaloPadding;
        this.b = chaloPadding2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuperPassProofOverviewUISpec)) {
            return false;
        }
        SuperPassProofOverviewUISpec superPassProofOverviewUISpec = (SuperPassProofOverviewUISpec) obj;
        return Intrinsics.d(this.f8483a, superPassProofOverviewUISpec.f8483a) && Intrinsics.d(this.b, superPassProofOverviewUISpec.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f8483a.hashCode() * 31);
    }

    public final String toString() {
        return "SuperPassProofOverviewUISpec(paddingAroundNextBtn=" + this.f8483a + ", paddingAroundList=" + this.b + ")";
    }
}
