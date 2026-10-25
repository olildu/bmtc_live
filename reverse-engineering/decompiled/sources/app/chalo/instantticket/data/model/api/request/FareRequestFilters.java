package app.chalo.instantticket.data.model.api.request;

import defpackage.a30;
import defpackage.dd;
import defpackage.nf1;
import defpackage.vo1;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00022\u00020\u0001:\u0004\u0003\u0004\u0005\u0002\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"}, d2 = {"Lapp/chalo/instantticket/data/model/api/request/FareRequestFilters;", "", "Companion", "InstantTicketFilter", "PremiumReserveTicketFilter", "OndcTicketFilter", "Lapp/chalo/instantticket/data/model/api/request/FareRequestFilters$InstantTicketFilter;", "Lapp/chalo/instantticket/data/model/api/request/FareRequestFilters$OndcTicketFilter;", "Lapp/chalo/instantticket/data/model/api/request/FareRequestFilters$PremiumReserveTicketFilter;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public abstract class FareRequestFilters {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f3845a = LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new a30(10));

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/instantticket/data/model/api/request/FareRequestFilters$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/instantticket/data/model/api/request/FareRequestFilters;", "serializer", "()Lkotlinx/serialization/KSerializer;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
        public final KSerializer<FareRequestFilters> serializer() {
            return (KSerializer) FareRequestFilters.f3845a.getValue();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/instantticket/data/model/api/request/FareRequestFilters$InstantTicketFilter;", "Lapp/chalo/instantticket/data/model/api/request/FareRequestFilters;", "Companion", "$serializer", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class InstantTicketFilter extends FareRequestFilters {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public final String b;

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/instantticket/data/model/api/request/FareRequestFilters$InstantTicketFilter$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/instantticket/data/model/api/request/FareRequestFilters$InstantTicketFilter;", "serializer", "()Lkotlinx/serialization/KSerializer;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer<InstantTicketFilter> serializer() {
                return FareRequestFilters$InstantTicketFilter$$serializer.f3846a;
            }
        }

        public /* synthetic */ InstantTicketFilter(int i, String str) {
            if (1 == (i & 1)) {
                this.b = str;
            } else {
                PluginExceptionsKt.b(FareRequestFilters$InstantTicketFilter$$serializer.f3846a.getDescriptor(), i, 1);
                throw null;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof InstantTicketFilter) && Intrinsics.d(this.b, ((InstantTicketFilter) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return vo1.B("InstantTicketFilter(configurationId=", this.b, ")");
        }

        public InstantTicketFilter(String configurationId) {
            Intrinsics.i(configurationId, "configurationId");
            this.b = configurationId;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/instantticket/data/model/api/request/FareRequestFilters$OndcTicketFilter;", "Lapp/chalo/instantticket/data/model/api/request/FareRequestFilters;", "Companion", "$serializer", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class OndcTicketFilter extends FareRequestFilters {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public final String b;
        public final String c;
        public final String d;

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/instantticket/data/model/api/request/FareRequestFilters$OndcTicketFilter$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/instantticket/data/model/api/request/FareRequestFilters$OndcTicketFilter;", "serializer", "()Lkotlinx/serialization/KSerializer;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer<OndcTicketFilter> serializer() {
                return FareRequestFilters$OndcTicketFilter$$serializer.f3847a;
            }
        }

        public /* synthetic */ OndcTicketFilter(int i, String str, String str2, String str3) {
            if (7 != (i & 7)) {
                PluginExceptionsKt.b(FareRequestFilters$OndcTicketFilter$$serializer.f3847a.getDescriptor(), i, 7);
                throw null;
            }
            this.b = str;
            this.c = str2;
            this.d = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OndcTicketFilter)) {
                return false;
            }
            OndcTicketFilter ondcTicketFilter = (OndcTicketFilter) obj;
            return Intrinsics.d(this.b, ondcTicketFilter.b) && Intrinsics.d(this.c, ondcTicketFilter.c) && Intrinsics.d(this.d, ondcTicketFilter.d);
        }

        public final int hashCode() {
            int iE = nf1.e(this.b.hashCode() * 31, 31, this.c);
            String str = this.d;
            return iE + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return vo1.p(dd.e("OndcTicketFilter(providerId=", this.b, ", fulfillmentId=", this.c, ", transactionId="), this.d, ")");
        }

        public OndcTicketFilter(String providerId, String fulfillmentId, String str) {
            Intrinsics.i(providerId, "providerId");
            Intrinsics.i(fulfillmentId, "fulfillmentId");
            this.b = providerId;
            this.c = fulfillmentId;
            this.d = str;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/instantticket/data/model/api/request/FareRequestFilters$PremiumReserveTicketFilter;", "Lapp/chalo/instantticket/data/model/api/request/FareRequestFilters;", "Companion", "$serializer", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class PremiumReserveTicketFilter extends FareRequestFilters {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public final String b;
        public final String c;
        public final String d;

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/instantticket/data/model/api/request/FareRequestFilters$PremiumReserveTicketFilter$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/instantticket/data/model/api/request/FareRequestFilters$PremiumReserveTicketFilter;", "serializer", "()Lkotlinx/serialization/KSerializer;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer<PremiumReserveTicketFilter> serializer() {
                return FareRequestFilters$PremiumReserveTicketFilter$$serializer.f3848a;
            }
        }

        public /* synthetic */ PremiumReserveTicketFilter(int i, String str, String str2, String str3) {
            if (7 != (i & 7)) {
                PluginExceptionsKt.b(FareRequestFilters$PremiumReserveTicketFilter$$serializer.f3848a.getDescriptor(), i, 7);
                throw null;
            }
            this.b = str;
            this.c = str2;
            this.d = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PremiumReserveTicketFilter)) {
                return false;
            }
            PremiumReserveTicketFilter premiumReserveTicketFilter = (PremiumReserveTicketFilter) obj;
            return Intrinsics.d(this.b, premiumReserveTicketFilter.b) && Intrinsics.d(this.c, premiumReserveTicketFilter.c) && Intrinsics.d(this.d, premiumReserveTicketFilter.d);
        }

        public final int hashCode() {
            int iE = nf1.e(this.b.hashCode() * 31, 31, this.c);
            String str = this.d;
            return iE + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return vo1.p(dd.e("PremiumReserveTicketFilter(configurationId=", this.b, ", tripId=", this.c, ", couponId="), this.d, ")");
        }

        public PremiumReserveTicketFilter(String configurationId, String tripId) {
            Intrinsics.i(configurationId, "configurationId");
            Intrinsics.i(tripId, "tripId");
            this.b = configurationId;
            this.c = tripId;
            this.d = null;
        }
    }
}
