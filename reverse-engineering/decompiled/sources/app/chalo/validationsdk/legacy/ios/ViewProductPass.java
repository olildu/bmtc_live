package app.chalo.validationsdk.legacy.ios;

import defpackage.dd;
import defpackage.pk0;
import defpackage.py;
import defpackage.vo1;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Deprecated
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0002¨\u0006\u0005"}, d2 = {"Lapp/chalo/validationsdk/legacy/ios/ViewProductPass;", "", "Companion", "Passenger", "$serializer", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class ViewProductPass {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10677a;
    public final Passenger b;
    public final Integer c;
    public final Integer d;
    public final Long e;
    public final String f;
    public final String g;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/validationsdk/legacy/ios/ViewProductPass$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/validationsdk/legacy/ios/ViewProductPass;", "serializer", "()Lkotlinx/serialization/KSerializer;", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<ViewProductPass> serializer() {
            return ViewProductPass$$serializer.f10678a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/validationsdk/legacy/ios/ViewProductPass$Passenger;", "", "Companion", "$serializer", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    @Deprecated
    public static final /* data */ class Passenger {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f10679a;
        public final String b;
        public final Long c;
        public final String d;

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/validationsdk/legacy/ios/ViewProductPass$Passenger$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/validationsdk/legacy/ios/ViewProductPass$Passenger;", "serializer", "()Lkotlinx/serialization/KSerializer;", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer<Passenger> serializer() {
                return ViewProductPass$Passenger$$serializer.f10680a;
            }
        }

        public /* synthetic */ Passenger(int i, Long l, String str, String str2, String str3) {
            if ((i & 1) == 0) {
                this.f10679a = null;
            } else {
                this.f10679a = str;
            }
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = str2;
            }
            if ((i & 4) == 0) {
                this.c = null;
            } else {
                this.c = l;
            }
            if ((i & 8) == 0) {
                this.d = null;
            } else {
                this.d = str3;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Passenger)) {
                return false;
            }
            Passenger passenger = (Passenger) obj;
            return Intrinsics.d(this.f10679a, passenger.f10679a) && Intrinsics.d(this.b, passenger.b) && Intrinsics.d(this.c, passenger.c) && Intrinsics.d(this.d, passenger.d);
        }

        public final int hashCode() {
            String str = this.f10679a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.b;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            Long l = this.c;
            int iHashCode3 = (iHashCode2 + (l == null ? 0 : l.hashCode())) * 31;
            String str3 = this.d;
            return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbE = dd.e("Passenger(profilePhoto=", this.f10679a, ", name=", this.b, ", dobInSeconds=");
            sbE.append(this.c);
            sbE.append(", gender=");
            sbE.append(this.d);
            sbE.append(")");
            return sbE.toString();
        }
    }

    public /* synthetic */ ViewProductPass(int i, String str, Passenger passenger, Integer num, Integer num2, Long l, String str2, String str3) {
        if ((i & 1) == 0) {
            this.f10677a = null;
        } else {
            this.f10677a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = passenger;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = num;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = num2;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = l;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = str2;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = str3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ViewProductPass)) {
            return false;
        }
        ViewProductPass viewProductPass = (ViewProductPass) obj;
        return Intrinsics.d(this.f10677a, viewProductPass.f10677a) && Intrinsics.d(this.b, viewProductPass.b) && Intrinsics.d(this.c, viewProductPass.c) && Intrinsics.d(this.d, viewProductPass.d) && Intrinsics.d(this.e, viewProductPass.e) && Intrinsics.d(this.f, viewProductPass.f) && Intrinsics.d(this.g, viewProductPass.g);
    }

    public final int hashCode() {
        String str = this.f10677a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Passenger passenger = this.b;
        int iHashCode2 = (iHashCode + (passenger == null ? 0 : passenger.hashCode())) * 31;
        Integer num = this.c;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.d;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Long l = this.e;
        int iHashCode5 = (iHashCode4 + (l == null ? 0 : l.hashCode())) * 31;
        String str2 = this.f;
        int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.g;
        return iHashCode6 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ViewProductPass(productName=");
        sb.append(this.f10677a);
        sb.append(", passenger=");
        sb.append(this.b);
        sb.append(", tripsLeft=");
        pk0.y(sb, this.c, ", ticketFare=", this.d, ", expiryDate=");
        py.t(this.e, ", passNumber=", this.f, ", transactionId=", sb);
        return vo1.p(sb, this.g, ")");
    }
}
