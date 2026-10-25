package app.chalo.premiumbus.ui.faredetails.contract;

import defpackage.xs;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/faredetails/contract/PremiumBusFareDetailsError;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PremiumBusFareDetailsError {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7582a;
    public final boolean b;

    public PremiumBusFareDetailsError(String message, boolean z) {
        Intrinsics.i(message, "message");
        this.f7582a = message;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PremiumBusFareDetailsError)) {
            return false;
        }
        PremiumBusFareDetailsError premiumBusFareDetailsError = (PremiumBusFareDetailsError) obj;
        return Intrinsics.d(this.f7582a, premiumBusFareDetailsError.f7582a) && this.b == premiumBusFareDetailsError.b;
    }

    public final int hashCode() {
        return (this.f7582a.hashCode() * 31) + (this.b ? 1231 : 1237);
    }

    public final String toString() {
        return xs.k("PremiumBusFareDetailsError(message=", this.f7582a, ", isRetryable=", ")", this.b);
    }
}
