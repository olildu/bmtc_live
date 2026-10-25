package app.chalo.models.mticketing;

import defpackage.cb0;
import defpackage.nf1;
import defpackage.t10;
import defpackage.vo1;
import defpackage.xs;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/models/mticketing/MTicketTripReceipt;", "", "Companion", "$serializer", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class MTicketTripReceipt {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5623a;
    public final long b;
    public final long c;
    public final String d;
    public final String e;
    public final String f;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/models/mticketing/MTicketTripReceipt$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/models/mticketing/MTicketTripReceipt;", "serializer", "()Lkotlinx/serialization/KSerializer;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<MTicketTripReceipt> serializer() {
            return MTicketTripReceipt$$serializer.f5624a;
        }
    }

    public /* synthetic */ MTicketTripReceipt(int i, String str, long j, long j2, String str2, String str3, String str4) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.b(MTicketTripReceipt$$serializer.f5624a.getDescriptor(), i, 3);
            throw null;
        }
        this.f5623a = str;
        this.b = j;
        if ((i & 4) == 0) {
            this.c = -1L;
        } else {
            this.c = j2;
        }
        if ((i & 8) == 0) {
            this.d = "";
        } else {
            this.d = str2;
        }
        if ((i & 16) == 0) {
            this.e = "";
        } else {
            this.e = str3;
        }
        if ((i & 32) == 0) {
            this.f = "";
        } else {
            this.f = str4;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MTicketTripReceipt)) {
            return false;
        }
        MTicketTripReceipt mTicketTripReceipt = (MTicketTripReceipt) obj;
        return Intrinsics.d(this.f5623a, mTicketTripReceipt.f5623a) && this.b == mTicketTripReceipt.b && this.c == mTicketTripReceipt.c && Intrinsics.d(this.d, mTicketTripReceipt.d) && Intrinsics.d(this.e, mTicketTripReceipt.e) && Intrinsics.d(this.f, mTicketTripReceipt.f);
    }

    public final int hashCode() {
        int iHashCode = this.f5623a.hashCode() * 31;
        long j = this.b;
        int i = (iHashCode + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.c;
        return this.f.hashCode() + nf1.e(nf1.e((i + ((int) (j2 ^ (j2 >>> 32)))) * 31, 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sbM = t10.m(this.b, "MTicketTripReceipt(ticketId=", this.f5623a, ", activationTimeStamp=");
        xs.r(this.c, ", punchTimeStamp=", ", vehicleNo=", sbM);
        cb0.t(sbM, this.d, ", conductorId=", this.e, ", endStopId=");
        return vo1.p(sbM, this.f, ")");
    }

    public MTicketTripReceipt(String ticketId, long j, long j2, String vehicleNo, String conductorId, String endStopId) {
        Intrinsics.i(ticketId, "ticketId");
        Intrinsics.i(vehicleNo, "vehicleNo");
        Intrinsics.i(conductorId, "conductorId");
        Intrinsics.i(endStopId, "endStopId");
        this.f5623a = ticketId;
        this.b = j;
        this.c = j2;
        this.d = vehicleNo;
        this.e = conductorId;
        this.f = endStopId;
    }
}
