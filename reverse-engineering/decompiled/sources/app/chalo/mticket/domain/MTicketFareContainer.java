package app.chalo.mticket.domain;

import app.chalo.models.mticketing.MTicket;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/mticket/domain/MTicketFareContainer;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class MTicketFareContainer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MTicket f5726a;

    public MTicketFareContainer(MTicket mTicket) {
        this.f5726a = mTicket;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MTicketFareContainer) && Intrinsics.d(this.f5726a, ((MTicketFareContainer) obj).f5726a);
    }

    public final int hashCode() {
        return this.f5726a.hashCode();
    }

    public final String toString() {
        return "MTicketFareContainer(mTicket=" + this.f5726a + ")";
    }
}
