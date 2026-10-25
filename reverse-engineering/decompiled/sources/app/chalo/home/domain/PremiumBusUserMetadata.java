package app.chalo.home.domain;

import defpackage.cb0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/domain/PremiumBusUserMetadata;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PremiumBusUserMetadata {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f3063a;
    public final boolean b;

    public PremiumBusUserMetadata(boolean z) {
        this.f3063a = z;
        this.b = !z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PremiumBusUserMetadata) && this.f3063a == ((PremiumBusUserMetadata) obj).f3063a;
    }

    public final int hashCode() {
        return this.f3063a ? 1231 : 1237;
    }

    public final String toString() {
        return cb0.k("PremiumBusUserMetadata(hasAnyPremiumBooking=", ")", this.f3063a);
    }
}
