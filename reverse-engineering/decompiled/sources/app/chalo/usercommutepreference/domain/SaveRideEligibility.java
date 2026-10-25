package app.chalo.usercommutepreference.domain;

import defpackage.nf1;
import defpackage.pk0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/usercommutepreference/domain/SaveRideEligibility;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SaveRideEligibility {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f10294a;
    public final boolean b;
    public final Long c;

    public SaveRideEligibility(boolean z, boolean z2, Long l) {
        this.f10294a = z;
        this.b = z2;
        this.c = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SaveRideEligibility)) {
            return false;
        }
        SaveRideEligibility saveRideEligibility = (SaveRideEligibility) obj;
        return this.f10294a == saveRideEligibility.f10294a && this.b == saveRideEligibility.b && Intrinsics.d(this.c, saveRideEligibility.c);
    }

    public final int hashCode() {
        int i = (((this.f10294a ? 1231 : 1237) * 31) + (this.b ? 1231 : 1237)) * 31;
        Long l = this.c;
        return i + (l == null ? 0 : l.hashCode());
    }

    public final String toString() {
        return pk0.l(nf1.r("SaveRideEligibility(isEligible=", ", isSavedAlready=", ", suggestedTime=", this.f10294a, this.b), this.c, ")");
    }
}
