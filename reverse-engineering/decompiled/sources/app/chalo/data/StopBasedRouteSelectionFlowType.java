package app.chalo.data;

import defpackage.ra1;
import defpackage.vo1;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00022\u00020\u0001:\u0004\u0003\u0004\u0005\u0002\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"}, d2 = {"Lapp/chalo/data/StopBasedRouteSelectionFlowType;", "", "Companion", "InstantTicket", "PassPurchase", "ONDC", "Lapp/chalo/data/StopBasedRouteSelectionFlowType$InstantTicket;", "Lapp/chalo/data/StopBasedRouteSelectionFlowType$ONDC;", "Lapp/chalo/data/StopBasedRouteSelectionFlowType$PassPurchase;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public abstract class StopBasedRouteSelectionFlowType {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Object c = LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new ra1(9));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2400a;
    public final String b;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/data/StopBasedRouteSelectionFlowType$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/data/StopBasedRouteSelectionFlowType;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
        public final KSerializer<StopBasedRouteSelectionFlowType> serializer() {
            return (KSerializer) StopBasedRouteSelectionFlowType.c.getValue();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001J\u0013\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lapp/chalo/data/StopBasedRouteSelectionFlowType$InstantTicket;", "Lapp/chalo/data/StopBasedRouteSelectionFlowType;", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class InstantTicket extends StopBasedRouteSelectionFlowType {
        public static final InstantTicket INSTANCE = new InstantTicket(null, null);
        public static final /* synthetic */ Object d = LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new ra1(10));

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof InstantTicket);
        }

        public final int hashCode() {
            return -661280045;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
        public final KSerializer<InstantTicket> serializer() {
            return (KSerializer) d.getValue();
        }

        public final String toString() {
            return "InstantTicket";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/data/StopBasedRouteSelectionFlowType$ONDC;", "Lapp/chalo/data/StopBasedRouteSelectionFlowType;", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class ONDC extends StopBasedRouteSelectionFlowType {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public final String d;
        public final String e;

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/data/StopBasedRouteSelectionFlowType$ONDC$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/data/StopBasedRouteSelectionFlowType$ONDC;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer<ONDC> serializer() {
                return StopBasedRouteSelectionFlowType$ONDC$$serializer.f2401a;
            }
        }

        public /* synthetic */ ONDC(int i, String str, String str2, String str3, String str4) {
            super(i, str, str2);
            if ((i & 4) == 0) {
                this.d = null;
            } else {
                this.d = str3;
            }
            if ((i & 8) == 0) {
                this.e = null;
            } else {
                this.e = str4;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ONDC)) {
                return false;
            }
            ONDC ondc = (ONDC) obj;
            return Intrinsics.d(this.d, ondc.d) && Intrinsics.d(this.e, ondc.e);
        }

        public final int hashCode() {
            String str = this.d;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.e;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            return vo1.o("ONDC(fromStopData=", this.d, ", toStopData=", this.e, ")");
        }

        public ONDC(String str, String str2) {
            super(str, str2);
            this.d = str;
            this.e = str2;
        }
    }

    public /* synthetic */ StopBasedRouteSelectionFlowType(int i, String str, String str2) {
        if ((i & 1) == 0) {
            this.f2400a = null;
        } else {
            this.f2400a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
    }

    public static final /* synthetic */ void a(StopBasedRouteSelectionFlowType stopBasedRouteSelectionFlowType, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || stopBasedRouteSelectionFlowType.f2400a != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.f18170a, stopBasedRouteSelectionFlowType.f2400a);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && stopBasedRouteSelectionFlowType.b == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.f18170a, stopBasedRouteSelectionFlowType.b);
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/data/StopBasedRouteSelectionFlowType$PassPurchase;", "Lapp/chalo/data/StopBasedRouteSelectionFlowType;", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class PassPurchase extends StopBasedRouteSelectionFlowType {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public final String d;

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/data/StopBasedRouteSelectionFlowType$PassPurchase$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/data/StopBasedRouteSelectionFlowType$PassPurchase;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer<PassPurchase> serializer() {
                return StopBasedRouteSelectionFlowType$PassPurchase$$serializer.f2402a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PassPurchase(String productConfigId) {
            super(null, null);
            Intrinsics.i(productConfigId, "productConfigId");
            this.d = productConfigId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PassPurchase) && Intrinsics.d(this.d, ((PassPurchase) obj).d);
        }

        public final int hashCode() {
            return this.d.hashCode();
        }

        public final String toString() {
            return vo1.B("PassPurchase(productConfigId=", this.d, ")");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ PassPurchase(int i, String str, String str2, String str3) {
            super(i, str, str2);
            if (4 != (i & 4)) {
                PluginExceptionsKt.b(StopBasedRouteSelectionFlowType$PassPurchase$$serializer.f2402a.getDescriptor(), i, 4);
                throw null;
            }
            this.d = str3;
        }
    }

    public StopBasedRouteSelectionFlowType(String str, String str2) {
        this.f2400a = str;
        this.b = str2;
    }
}
