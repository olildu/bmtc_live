package app.chalo.instantticket.ui.faredetails;

import defpackage.a30;
import defpackage.cb0;
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
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0002\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lapp/chalo/instantticket/ui/faredetails/FareDetailsScreenType;", "", "Companion", "InstantTicket", "ONDCTicket", "Lapp/chalo/instantticket/ui/faredetails/FareDetailsScreenType$InstantTicket;", "Lapp/chalo/instantticket/ui/faredetails/FareDetailsScreenType$ONDCTicket;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public abstract class FareDetailsScreenType {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Object b = LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new a30(5));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3908a;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/instantticket/ui/faredetails/FareDetailsScreenType$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/instantticket/ui/faredetails/FareDetailsScreenType;", "serializer", "()Lkotlinx/serialization/KSerializer;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
        public final KSerializer<FareDetailsScreenType> serializer() {
            return (KSerializer) FareDetailsScreenType.b.getValue();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001J\u0013\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lapp/chalo/instantticket/ui/faredetails/FareDetailsScreenType$InstantTicket;", "Lapp/chalo/instantticket/ui/faredetails/FareDetailsScreenType;", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final class InstantTicket extends FareDetailsScreenType {
        public static final InstantTicket INSTANCE = new InstantTicket("instantTicket", 0);
        public static final /* synthetic */ Object c = LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new a30(6));

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
        public final KSerializer<InstantTicket> serializer() {
            return (KSerializer) c.getValue();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/instantticket/ui/faredetails/FareDetailsScreenType$ONDCTicket;", "Lapp/chalo/instantticket/ui/faredetails/FareDetailsScreenType;", "Companion", "$serializer", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class ONDCTicket extends FareDetailsScreenType {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public final String c;
        public final String d;
        public final String e;
        public final String f;
        public final String g;

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/instantticket/ui/faredetails/FareDetailsScreenType$ONDCTicket$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/instantticket/ui/faredetails/FareDetailsScreenType$ONDCTicket;", "serializer", "()Lkotlinx/serialization/KSerializer;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer<ONDCTicket> serializer() {
                return FareDetailsScreenType$ONDCTicket$$serializer.f3909a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ ONDCTicket(String str, String str2, String str3, String str4, int i, String str5, String str6) {
            super(str);
            if (63 != (i & 63)) {
                PluginExceptionsKt.b(FareDetailsScreenType$ONDCTicket$$serializer.f3909a.getDescriptor(), i, 63);
                throw null;
            }
            this.c = str2;
            this.d = str3;
            this.e = str4;
            this.f = str5;
            this.g = str6;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ONDCTicket)) {
                return false;
            }
            ONDCTicket oNDCTicket = (ONDCTicket) obj;
            return Intrinsics.d(this.c, oNDCTicket.c) && Intrinsics.d(this.d, oNDCTicket.d) && Intrinsics.d(this.e, oNDCTicket.e) && Intrinsics.d(this.f, oNDCTicket.f) && Intrinsics.d(this.g, oNDCTicket.g);
        }

        public final int hashCode() {
            return this.g.hashCode() + nf1.e(nf1.e(nf1.e(this.c.hashCode() * 31, 31, this.d), 31, this.e), 31, this.f);
        }

        public final String toString() {
            StringBuilder sbE = dd.e("ONDCTicket(providerId=", this.c, ", configId=", this.d, ", agency=");
            cb0.t(sbE, this.e, ", transactionFlowId=", this.f, ", fulfillmentId=");
            return vo1.p(sbE, this.g, ")");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ONDCTicket(String providerId, String configId, String agency, String transactionFlowId, String str) {
            super("ondcTicket", 0);
            Intrinsics.i(providerId, "providerId");
            Intrinsics.i(configId, "configId");
            Intrinsics.i(agency, "agency");
            Intrinsics.i(transactionFlowId, "transactionFlowId");
            this.c = providerId;
            this.d = configId;
            this.e = agency;
            this.f = transactionFlowId;
            this.g = str;
        }
    }

    public /* synthetic */ FareDetailsScreenType(String str) {
        this.f3908a = str;
    }

    public FareDetailsScreenType(String str, int i) {
        this.f3908a = str;
    }
}
