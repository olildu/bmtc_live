package app.chalo.premiumbus.data.models.app;

import app.chalo.premiumbus.data.models.entity.PremiumReserveTicketStatus;
import app.chalo.userprofile.Gender;
import defpackage.n21;
import defpackage.r30;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/data/models/app/WomenAdjacencyPromiseState;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class WomenAdjacencyPromiseState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f7129a;
    public final List b;
    public final PremiumReserveTicketStatus c;
    public final Gender d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;

    /* JADX WARN: Code duplicated, block: B:16:0x0050 A[EDGE_INSN: B:16:0x0050->B:17:0x0051 BREAK  A[LOOP:0: B:11:0x003c->B:30:?]] */
    public WomenAdjacencyPromiseState(boolean z, List seats, PremiumReserveTicketStatus premiumReserveTicketStatus, Gender userGender, boolean z2, boolean z3) {
        boolean z4;
        Intrinsics.i(seats, "seats");
        Intrinsics.i(userGender, "userGender");
        this.f7129a = z;
        this.b = seats;
        this.c = premiumReserveTicketStatus;
        this.d = userGender;
        this.e = z2;
        this.f = z3;
        boolean z5 = false;
        if (!seats.isEmpty() && z) {
            List list = seats;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z4 = false;
                        break;
                    } else if (((SeatInfoAppModel) it.next()).e == ReservationType.GENERAL) {
                        z4 = true;
                        break;
                    }
                }
            } else {
                z4 = false;
                break;
            }
        } else {
            z4 = false;
            break;
        }
        this.g = z4;
        if (!this.e && this.d == Gender.FEMALE && this.f && this.f7129a) {
            z5 = true;
        }
        this.h = z5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WomenAdjacencyPromiseState)) {
            return false;
        }
        WomenAdjacencyPromiseState womenAdjacencyPromiseState = (WomenAdjacencyPromiseState) obj;
        return this.f7129a == womenAdjacencyPromiseState.f7129a && Intrinsics.d(this.b, womenAdjacencyPromiseState.b) && this.c == womenAdjacencyPromiseState.c && this.d == womenAdjacencyPromiseState.d && this.e == womenAdjacencyPromiseState.e && this.f == womenAdjacencyPromiseState.f;
    }

    public final int hashCode() {
        int iB = r30.b((this.f7129a ? 1231 : 1237) * 31, 31, this.b);
        PremiumReserveTicketStatus premiumReserveTicketStatus = this.c;
        return ((((this.d.hashCode() + ((iB + (premiumReserveTicketStatus == null ? 0 : premiumReserveTicketStatus.hashCode())) * 31)) * 31) + (this.e ? 1231 : 1237)) * 31) + (this.f ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WomenAdjacencyPromiseState(womenAdjacencyPromisedWhileBooking=");
        sb.append(this.f7129a);
        sb.append(", seats=");
        sb.append(this.b);
        sb.append(", ticketStatus=");
        sb.append(this.c);
        sb.append(", userGender=");
        sb.append(this.d);
        sb.append(", isBannerClearedByUser=");
        return n21.h(sb, this.e, ", isSystemRescheduled=", this.f, ")");
    }

    public WomenAdjacencyPromiseState() {
        this(false, EmptyList.f17557a, null, Gender.MALE, true, false);
    }
}
