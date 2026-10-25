package app.chalo.kyc.min.ui.minkycdetails;

import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.UiArrangement;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/kyc/min/ui/minkycdetails/MinKycDetailsUISpecs;", "", "kyc_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class MinKycDetailsUISpecs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloColorToken f4128a = ChaloColorToken.White.f9870a;
    public final UiArrangement.HorizontalOrVertical b = UiArrangement.HorizontalOrVertical.SpaceBetween.f9892a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MinKycDetailsUISpecs)) {
            return false;
        }
        MinKycDetailsUISpecs minKycDetailsUISpecs = (MinKycDetailsUISpecs) obj;
        return Intrinsics.d(this.f4128a, minKycDetailsUISpecs.f4128a) && Intrinsics.d(this.b, minKycDetailsUISpecs.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f4128a.hashCode() * 31);
    }

    public final String toString() {
        return "MinKycDetailsUISpecs(backgroundColor=" + this.f4128a + ", verticalArrangement=" + this.b + ")";
    }
}
