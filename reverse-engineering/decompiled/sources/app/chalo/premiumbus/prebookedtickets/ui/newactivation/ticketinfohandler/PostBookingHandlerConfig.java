package app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler;

import defpackage.b3;
import defpackage.nf1;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/prebookedtickets/ui/newactivation/ticketinfohandler/PostBookingHandlerConfig;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PostBookingHandlerConfig {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f7412a;
    public final boolean b;
    public final boolean c;

    public PostBookingHandlerConfig(boolean z, boolean z2, boolean z3) {
        this.f7412a = z;
        this.b = z2;
        this.c = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PostBookingHandlerConfig)) {
            return false;
        }
        PostBookingHandlerConfig postBookingHandlerConfig = (PostBookingHandlerConfig) obj;
        return this.f7412a == postBookingHandlerConfig.f7412a && this.b == postBookingHandlerConfig.b && this.c == postBookingHandlerConfig.c;
    }

    public final int hashCode() {
        return ((((this.f7412a ? 1231 : 1237) * 31) + (this.b ? 1231 : 1237)) * 31) + (this.c ? 1231 : 1237);
    }

    public final String toString() {
        return b3.g(")", nf1.r("PostBookingHandlerConfig(shouldUpdateLocalRouteData=", ", trackRoute=", ", fetchStopImages=", this.f7412a, this.b), this.c);
    }
}
