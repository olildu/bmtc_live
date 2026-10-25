package app.chalo.premiumbus.domain;

import app.chalo.premiumbus.data.models.app.PremiumStopDetailsAppModel;
import defpackage.dd;
import defpackage.nf1;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/premiumbus/domain/PremiumBusRecentProductsPurchased;", "", "PreBookTicket", "Lapp/chalo/premiumbus/domain/PremiumBusRecentProductsPurchased$PreBookTicket;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class PremiumBusRecentProductsPurchased {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f7221a;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/domain/PremiumBusRecentProductsPurchased$PreBookTicket;", "Lapp/chalo/premiumbus/domain/PremiumBusRecentProductsPurchased;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PreBookTicket extends PremiumBusRecentProductsPurchased {
        public final String b;
        public final String c;
        public final long d;
        public final String e;
        public final String f;
        public final PremiumStopDetailsAppModel g;
        public final PremiumStopDetailsAppModel h;
        public final long i;
        public final List j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PreBookTicket(String str, String str2, long j, String productType, String productSubType, PremiumStopDetailsAppModel premiumStopDetailsAppModel, PremiumStopDetailsAppModel premiumStopDetailsAppModel2, long j2, List passengerDetails) {
            super(j);
            Intrinsics.i(productType, "productType");
            Intrinsics.i(productSubType, "productSubType");
            Intrinsics.i(passengerDetails, "passengerDetails");
            this.b = str;
            this.c = str2;
            this.d = j;
            this.e = productType;
            this.f = productSubType;
            this.g = premiumStopDetailsAppModel;
            this.h = premiumStopDetailsAppModel2;
            this.i = j2;
            this.j = passengerDetails;
        }

        @Override // app.chalo.premiumbus.domain.PremiumBusRecentProductsPurchased
        /* JADX INFO: renamed from: a, reason: from getter */
        public final long getF7221a() {
            return this.d;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PreBookTicket)) {
                return false;
            }
            PreBookTicket preBookTicket = (PreBookTicket) obj;
            return Intrinsics.d(this.b, preBookTicket.b) && Intrinsics.d(this.c, preBookTicket.c) && this.d == preBookTicket.d && Intrinsics.d(this.e, preBookTicket.e) && Intrinsics.d(this.f, preBookTicket.f) && Intrinsics.d(this.g, preBookTicket.g) && Intrinsics.d(this.h, preBookTicket.h) && this.i == preBookTicket.i && Intrinsics.d(this.j, preBookTicket.j);
        }

        public final int hashCode() {
            int iE = nf1.e(this.b.hashCode() * 31, 31, this.c);
            long j = this.d;
            int iHashCode = (this.h.hashCode() + ((this.g.hashCode() + nf1.e(nf1.e((iE + ((int) (j ^ (j >>> 32)))) * 31, 31, this.e), 31, this.f)) * 31)) * 31;
            long j2 = this.i;
            return this.j.hashCode() + ((iHashCode + ((int) (j2 ^ (j2 >>> 32)))) * 31);
        }

        public final String toString() {
            StringBuilder sbE = dd.e("PreBookTicket(bookingId=", this.b, ", productConfigId=", this.c, ", bookingTime=");
            dd.k(this.d, ", productType=", this.e, sbE);
            sbE.append(", productSubType=");
            sbE.append(this.f);
            sbE.append(", fromStopDetailsInfo=");
            sbE.append(this.g);
            sbE.append(", toStopDetailsInfo=");
            sbE.append(this.h);
            sbE.append(", amount=");
            sbE.append(this.i);
            sbE.append(", passengerDetails=");
            sbE.append(this.j);
            sbE.append(")");
            return sbE.toString();
        }
    }

    public PremiumBusRecentProductsPurchased(long j) {
        this.f7221a = j;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public long getF7221a() {
        return this.f7221a;
    }
}
