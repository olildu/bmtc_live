package app.chalo.ticketvalidation;

import defpackage.nf1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ticketvalidation/TicketValidationInfo;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class TicketValidationInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TicketValidationType f9624a;
    public final String b;
    public final String c;
    public final TicketValidationMetaInfo d;
    public final QRValidationStatus e;

    public TicketValidationInfo(QRValidationStatus validationStatus, TicketValidationMetaInfo ticketValidationMetaInfo, TicketValidationType type, String code, String str) {
        Intrinsics.i(type, "type");
        Intrinsics.i(code, "code");
        Intrinsics.i(validationStatus, "validationStatus");
        this.f9624a = type;
        this.b = code;
        this.c = str;
        this.d = ticketValidationMetaInfo;
        this.e = validationStatus;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TicketValidationInfo)) {
            return false;
        }
        TicketValidationInfo ticketValidationInfo = (TicketValidationInfo) obj;
        return this.f9624a == ticketValidationInfo.f9624a && Intrinsics.d(this.b, ticketValidationInfo.b) && Intrinsics.d(this.c, ticketValidationInfo.c) && Intrinsics.d(this.d, ticketValidationInfo.d) && this.e == ticketValidationInfo.e;
    }

    public final int hashCode() {
        int iE = nf1.e(this.f9624a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int iHashCode = (iE + (str == null ? 0 : str.hashCode())) * 31;
        TicketValidationMetaInfo ticketValidationMetaInfo = this.d;
        return this.e.hashCode() + ((iHashCode + (ticketValidationMetaInfo != null ? ticketValidationMetaInfo.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "TicketValidationInfo(type=" + this.f9624a + ", code=" + this.b + ", ticketNumber=" + this.c + ", metaInfo=" + this.d + ", validationStatus=" + this.e + ")";
    }
}
