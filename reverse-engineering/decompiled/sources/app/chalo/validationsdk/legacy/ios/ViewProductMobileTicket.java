package app.chalo.validationsdk.legacy.ios;

import defpackage.cb0;
import defpackage.dd;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Deprecated
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/validationsdk/legacy/ios/ViewProductMobileTicket;", "", "Companion", "$serializer", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class ViewProductMobileTicket {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10675a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final Long h;
    public final Boolean i;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/validationsdk/legacy/ios/ViewProductMobileTicket$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/validationsdk/legacy/ios/ViewProductMobileTicket;", "serializer", "()Lkotlinx/serialization/KSerializer;", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<ViewProductMobileTicket> serializer() {
            return ViewProductMobileTicket$$serializer.f10676a;
        }
    }

    public /* synthetic */ ViewProductMobileTicket(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, Long l, Boolean bool) {
        if ((i & 1) == 0) {
            this.f10675a = null;
        } else {
            this.f10675a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str3;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str4;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str5;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = str6;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = str7;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = l;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = bool;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ViewProductMobileTicket)) {
            return false;
        }
        ViewProductMobileTicket viewProductMobileTicket = (ViewProductMobileTicket) obj;
        return Intrinsics.d(this.f10675a, viewProductMobileTicket.f10675a) && Intrinsics.d(this.b, viewProductMobileTicket.b) && Intrinsics.d(this.c, viewProductMobileTicket.c) && Intrinsics.d(this.d, viewProductMobileTicket.d) && Intrinsics.d(this.e, viewProductMobileTicket.e) && Intrinsics.d(this.f, viewProductMobileTicket.f) && Intrinsics.d(this.g, viewProductMobileTicket.g) && Intrinsics.d(this.h, viewProductMobileTicket.h) && Intrinsics.d(this.i, viewProductMobileTicket.i);
    }

    public final int hashCode() {
        String str = this.f10675a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.d;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.e;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.g;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Long l = this.h;
        int iHashCode8 = (iHashCode7 + (l == null ? 0 : l.hashCode())) * 31;
        Boolean bool = this.i;
        return iHashCode8 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("ViewProductMobileTicket(productName=", this.f10675a, ", ticketNumber=", this.b, ", transactionId=");
        cb0.t(sbE, this.c, ", routeNumber=", this.d, ", originStopName=");
        cb0.t(sbE, this.e, ", destinationStopName=", this.f, ", totalTickets=");
        cb0.r(this.h, this.g, ", expiryDate=", ", isPremium=", sbE);
        sbE.append(this.i);
        sbE.append(")");
        return sbE.toString();
    }
}
