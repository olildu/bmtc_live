package app.chalo.productpurchase.passpurchase.ui.verificationstatus;

import app.chalo.productpurchase.passpurchase.domain.MPassVerificationTimingDetails;
import app.chalo.superpass.data.models.entities.SuperPassApplication;
import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productpurchase/passpurchase/ui/verificationstatus/SuperPassVerificationStatusDataState;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SuperPassVerificationStatusDataState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SuperPassApplication f8515a;
    public final MPassVerificationTimingDetails b;
    public final String c;

    public SuperPassVerificationStatusDataState(SuperPassApplication superPassApplication, MPassVerificationTimingDetails timingDetails, String source) {
        Intrinsics.i(timingDetails, "timingDetails");
        Intrinsics.i(source, "source");
        this.f8515a = superPassApplication;
        this.b = timingDetails;
        this.c = source;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuperPassVerificationStatusDataState)) {
            return false;
        }
        SuperPassVerificationStatusDataState superPassVerificationStatusDataState = (SuperPassVerificationStatusDataState) obj;
        return Intrinsics.d(this.f8515a, superPassVerificationStatusDataState.f8515a) && Intrinsics.d(this.b, superPassVerificationStatusDataState.b) && Intrinsics.d(this.c, superPassVerificationStatusDataState.c);
    }

    public final int hashCode() {
        SuperPassApplication superPassApplication = this.f8515a;
        return this.c.hashCode() + ((this.b.hashCode() + ((superPassApplication == null ? 0 : superPassApplication.hashCode()) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SuperPassVerificationStatusDataState(passApplication=");
        sb.append(this.f8515a);
        sb.append(", timingDetails=");
        sb.append(this.b);
        sb.append(", source=");
        return vo1.p(sb, this.c, ")");
    }
}
