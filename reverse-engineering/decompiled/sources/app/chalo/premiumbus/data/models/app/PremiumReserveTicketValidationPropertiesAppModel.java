package app.chalo.premiumbus.data.models.app;

import defpackage.dd;
import defpackage.nf1;
import defpackage.pk0;
import defpackage.xs;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/data/models/app/PremiumReserveTicketValidationPropertiesAppModel;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PremiumReserveTicketValidationPropertiesAppModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7118a;
    public final String b;
    public final long c;
    public final long d;
    public final Long e;

    public PremiumReserveTicketValidationPropertiesAppModel(String str, String str2, long j, long j2, Long l) {
        this.f7118a = str;
        this.b = str2;
        this.c = j;
        this.d = j2;
        this.e = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PremiumReserveTicketValidationPropertiesAppModel)) {
            return false;
        }
        PremiumReserveTicketValidationPropertiesAppModel premiumReserveTicketValidationPropertiesAppModel = (PremiumReserveTicketValidationPropertiesAppModel) obj;
        return Intrinsics.d(this.f7118a, premiumReserveTicketValidationPropertiesAppModel.f7118a) && Intrinsics.d(this.b, premiumReserveTicketValidationPropertiesAppModel.b) && this.c == premiumReserveTicketValidationPropertiesAppModel.c && this.d == premiumReserveTicketValidationPropertiesAppModel.d && Intrinsics.d(this.e, premiumReserveTicketValidationPropertiesAppModel.e);
    }

    public final int hashCode() {
        int iE = nf1.e(this.f7118a.hashCode() * 31, 31, this.b);
        long j = this.c;
        int i = (iE + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.d;
        int i2 = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        Long l = this.e;
        return i2 + (l == null ? 0 : l.hashCode());
    }

    public final String toString() {
        StringBuilder sbE = dd.e("PremiumReserveTicketValidationPropertiesAppModel(tone=", this.f7118a, ", qrCode=", this.b, ", expiryTime=");
        sbE.append(this.c);
        xs.r(this.d, ", validationStartTime=", ", punchTime=", sbE);
        return pk0.l(sbE, this.e, ")");
    }
}
