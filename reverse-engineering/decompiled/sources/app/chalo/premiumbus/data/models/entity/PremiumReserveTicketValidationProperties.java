package app.chalo.premiumbus.data.models.entity;

import defpackage.dd;
import defpackage.nf1;
import defpackage.pk0;
import defpackage.xs;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/data/models/entity/PremiumReserveTicketValidationProperties;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PremiumReserveTicketValidationProperties {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7140a;
    public final String b;
    public final long c;
    public final long d;
    public final Long e;

    public PremiumReserveTicketValidationProperties(String str, String str2, long j, long j2, Long l) {
        this.f7140a = str;
        this.b = str2;
        this.c = j;
        this.d = j2;
        this.e = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PremiumReserveTicketValidationProperties)) {
            return false;
        }
        PremiumReserveTicketValidationProperties premiumReserveTicketValidationProperties = (PremiumReserveTicketValidationProperties) obj;
        return Intrinsics.d(this.f7140a, premiumReserveTicketValidationProperties.f7140a) && Intrinsics.d(this.b, premiumReserveTicketValidationProperties.b) && this.c == premiumReserveTicketValidationProperties.c && this.d == premiumReserveTicketValidationProperties.d && Intrinsics.d(this.e, premiumReserveTicketValidationProperties.e);
    }

    public final int hashCode() {
        int iE = nf1.e(this.f7140a.hashCode() * 31, 31, this.b);
        long j = this.c;
        int i = (iE + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.d;
        int i2 = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        Long l = this.e;
        return i2 + (l == null ? 0 : l.hashCode());
    }

    public final String toString() {
        StringBuilder sbE = dd.e("PremiumReserveTicketValidationProperties(tone=", this.f7140a, ", qrCode=", this.b, ", expiryTime=");
        sbE.append(this.c);
        xs.r(this.d, ", validationStartTime=", ", punchTime=", sbE);
        return pk0.l(sbE, this.e, ")");
    }
}
