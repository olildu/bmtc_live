package app.chalo.premiumbus;

import app.chalo.citydata.data.model.app.StopAppModel;
import app.chalo.data.StopBasedRouteSelectionFlowType;
import defpackage.pw0;
import defpackage.vo1;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00022\u00020\u0001:\u0005\u0003\u0004\u0005\u0006\u0002\u0082\u0001\u0004\u0007\b\t\n¨\u0006\u000b"}, d2 = {"Lapp/chalo/premiumbus/ProductBookingNavigation;", "", "Companion", "InstantTicket", "StopBasedPassFreshPurchase", "ONDCTicket", "OndcMetroBooking", "Lapp/chalo/premiumbus/ProductBookingNavigation$InstantTicket;", "Lapp/chalo/premiumbus/ProductBookingNavigation$ONDCTicket;", "Lapp/chalo/premiumbus/ProductBookingNavigation$OndcMetroBooking;", "Lapp/chalo/premiumbus/ProductBookingNavigation$StopBasedPassFreshPurchase;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public abstract class ProductBookingNavigation {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f6868a = LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new pw0(26));

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/premiumbus/ProductBookingNavigation$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/premiumbus/ProductBookingNavigation;", "serializer", "()Lkotlinx/serialization/KSerializer;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
        public final KSerializer<ProductBookingNavigation> serializer() {
            return (KSerializer) ProductBookingNavigation.f6868a.getValue();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001J\u0013\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lapp/chalo/premiumbus/ProductBookingNavigation$OndcMetroBooking;", "Lapp/chalo/premiumbus/ProductBookingNavigation;", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final class OndcMetroBooking extends ProductBookingNavigation {
        public static final OndcMetroBooking INSTANCE = new OndcMetroBooking();
        public static final /* synthetic */ Object b = LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new pw0(29));

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
        public final KSerializer<OndcMetroBooking> serializer() {
            return (KSerializer) b.getValue();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/premiumbus/ProductBookingNavigation$ONDCTicket;", "Lapp/chalo/premiumbus/ProductBookingNavigation;", "Companion", "$serializer", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class ONDCTicket extends ProductBookingNavigation {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public final StopAppModel b;
        public final StopAppModel c;

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/premiumbus/ProductBookingNavigation$ONDCTicket$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/premiumbus/ProductBookingNavigation$ONDCTicket;", "serializer", "()Lkotlinx/serialization/KSerializer;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer<ONDCTicket> serializer() {
                return ProductBookingNavigation$ONDCTicket$$serializer.f6870a;
            }
        }

        public /* synthetic */ ONDCTicket(int i, StopAppModel stopAppModel, StopAppModel stopAppModel2) {
            if ((i & 1) == 0) {
                this.b = null;
            } else {
                this.b = stopAppModel;
            }
            if ((i & 2) == 0) {
                this.c = null;
            } else {
                this.c = stopAppModel2;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ONDCTicket)) {
                return false;
            }
            ONDCTicket oNDCTicket = (ONDCTicket) obj;
            return Intrinsics.d(this.b, oNDCTicket.b) && Intrinsics.d(this.c, oNDCTicket.c);
        }

        public final int hashCode() {
            StopAppModel stopAppModel = this.b;
            int iHashCode = (stopAppModel == null ? 0 : stopAppModel.hashCode()) * 31;
            StopAppModel stopAppModel2 = this.c;
            return iHashCode + (stopAppModel2 != null ? stopAppModel2.hashCode() : 0);
        }

        public final String toString() {
            return "ONDCTicket(fromStop=" + this.b + ", toStop=" + this.c + ")";
        }

        public ONDCTicket(StopAppModel stopAppModel, StopAppModel stopAppModel2) {
            this.b = stopAppModel;
            this.c = stopAppModel2;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/premiumbus/ProductBookingNavigation$StopBasedPassFreshPurchase;", "Lapp/chalo/premiumbus/ProductBookingNavigation;", "Companion", "$serializer", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class StopBasedPassFreshPurchase extends ProductBookingNavigation {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public final String b;

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/premiumbus/ProductBookingNavigation$StopBasedPassFreshPurchase$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/premiumbus/ProductBookingNavigation$StopBasedPassFreshPurchase;", "serializer", "()Lkotlinx/serialization/KSerializer;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer<StopBasedPassFreshPurchase> serializer() {
                return ProductBookingNavigation$StopBasedPassFreshPurchase$$serializer.f6871a;
            }
        }

        public /* synthetic */ StopBasedPassFreshPurchase(int i, String str) {
            if (1 == (i & 1)) {
                this.b = str;
            } else {
                PluginExceptionsKt.b(ProductBookingNavigation$StopBasedPassFreshPurchase$$serializer.f6871a.getDescriptor(), i, 1);
                throw null;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof StopBasedPassFreshPurchase) && Intrinsics.d(this.b, ((StopBasedPassFreshPurchase) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return vo1.B("StopBasedPassFreshPurchase(productConfigId=", this.b, ")");
        }

        public StopBasedPassFreshPurchase(String productConfigId) {
            Intrinsics.i(productConfigId, "productConfigId");
            this.b = productConfigId;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002\u0082\u0001\u0001\u0004¨\u0006\u0005"}, d2 = {"Lapp/chalo/premiumbus/ProductBookingNavigation$InstantTicket;", "Lapp/chalo/premiumbus/ProductBookingNavigation;", "Companion", "FreshPurchase", "Lapp/chalo/premiumbus/ProductBookingNavigation$InstantTicket$FreshPurchase;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static abstract class InstantTicket extends ProductBookingNavigation {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public static final Object b = LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new pw0(27));

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/premiumbus/ProductBookingNavigation$InstantTicket$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/premiumbus/ProductBookingNavigation$InstantTicket;", "serializer", "()Lkotlinx/serialization/KSerializer;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
            public final KSerializer<InstantTicket> serializer() {
                return (KSerializer) InstantTicket.b.getValue();
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/premiumbus/ProductBookingNavigation$InstantTicket$FreshPurchase;", "Lapp/chalo/premiumbus/ProductBookingNavigation$InstantTicket;", "Companion", "$serializer", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        @Serializable
        public static final /* data */ class FreshPurchase extends InstantTicket {

            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion();
            public static final Lazy[] e;
            public final boolean c;
            public final StopBasedRouteSelectionFlowType d;

            /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
            @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/premiumbus/ProductBookingNavigation$InstantTicket$FreshPurchase$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/premiumbus/ProductBookingNavigation$InstantTicket$FreshPurchase;", "serializer", "()Lkotlinx/serialization/KSerializer;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final class Companion {
                public final KSerializer<FreshPurchase> serializer() {
                    return ProductBookingNavigation$InstantTicket$FreshPurchase$$serializer.f6869a;
                }
            }

            static {
                StopBasedRouteSelectionFlowType.Companion companion = StopBasedRouteSelectionFlowType.INSTANCE;
                e = new Lazy[]{null, LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new pw0(28))};
            }

            public /* synthetic */ FreshPurchase(int i, boolean z, StopBasedRouteSelectionFlowType stopBasedRouteSelectionFlowType) {
                if (1 != (i & 1)) {
                    PluginExceptionsKt.b(ProductBookingNavigation$InstantTicket$FreshPurchase$$serializer.f6869a.getDescriptor(), i, 1);
                    throw null;
                }
                this.c = z;
                if ((i & 2) == 0) {
                    this.d = StopBasedRouteSelectionFlowType.InstantTicket.INSTANCE;
                } else {
                    this.d = stopBasedRouteSelectionFlowType;
                }
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof FreshPurchase)) {
                    return false;
                }
                FreshPurchase freshPurchase = (FreshPurchase) obj;
                return this.c == freshPurchase.c && Intrinsics.d(this.d, freshPurchase.d);
            }

            public final int hashCode() {
                return this.d.hashCode() + ((this.c ? 1231 : 1237) * 31);
            }

            public final String toString() {
                return "FreshPurchase(isRouteBasedSelection=" + this.c + ", stopBasedRouteSelectionFlowType=" + this.d + ")";
            }

            public FreshPurchase(boolean z) {
                StopBasedRouteSelectionFlowType.InstantTicket stopBasedRouteSelectionFlowType = StopBasedRouteSelectionFlowType.InstantTicket.INSTANCE;
                Intrinsics.i(stopBasedRouteSelectionFlowType, "stopBasedRouteSelectionFlowType");
                this.c = z;
                this.d = stopBasedRouteSelectionFlowType;
            }
        }
    }
}
