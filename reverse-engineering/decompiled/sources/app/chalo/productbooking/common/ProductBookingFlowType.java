package app.chalo.productbooking.common;

import app.chalo.data.PremiumBusProductModificationReasonAppModel;
import app.chalo.data.StopBasedRouteSelectionFlowType;
import app.chalo.premiumbus.data.models.app.PBOriginDestinationAppModel;
import app.chalo.premiumbus.data.models.app.PBStopPlaceSelectedAppModel;
import app.chalo.premiumbus.ui.stopdetails.PBStopDetailsNavAppModel;
import defpackage.cb0;
import defpackage.pw0;
import defpackage.vo1;
import java.util.List;
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
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00022\u00020\u0001:\u0005\u0003\u0004\u0005\u0006\u0002\u0082\u0001\u0004\u0007\b\t\n¨\u0006\u000b"}, d2 = {"Lapp/chalo/productbooking/common/ProductBookingFlowType;", "", "Companion", "InstantTicket", "ONDCTicket", "StopBasedPassFreshPurchase", "PremiumBusProduct", "Lapp/chalo/productbooking/common/ProductBookingFlowType$InstantTicket;", "Lapp/chalo/productbooking/common/ProductBookingFlowType$ONDCTicket;", "Lapp/chalo/productbooking/common/ProductBookingFlowType$PremiumBusProduct;", "Lapp/chalo/productbooking/common/ProductBookingFlowType$StopBasedPassFreshPurchase;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public abstract class ProductBookingFlowType {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f8086a = LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new pw0(18));

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/productbooking/common/ProductBookingFlowType$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/productbooking/common/ProductBookingFlowType;", "serializer", "()Lkotlinx/serialization/KSerializer;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
        public final KSerializer<ProductBookingFlowType> serializer() {
            return (KSerializer) ProductBookingFlowType.f8086a.getValue();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002\u0082\u0001\u0001\u0004¨\u0006\u0005"}, d2 = {"Lapp/chalo/productbooking/common/ProductBookingFlowType$InstantTicket;", "Lapp/chalo/productbooking/common/ProductBookingFlowType;", "Companion", "FreshPurchase", "Lapp/chalo/productbooking/common/ProductBookingFlowType$InstantTicket$FreshPurchase;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static abstract class InstantTicket extends ProductBookingFlowType {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public static final Object b = LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new pw0(19));

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/productbooking/common/ProductBookingFlowType$InstantTicket$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/productbooking/common/ProductBookingFlowType$InstantTicket;", "serializer", "()Lkotlinx/serialization/KSerializer;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
            public final KSerializer<InstantTicket> serializer() {
                return (KSerializer) InstantTicket.b.getValue();
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/productbooking/common/ProductBookingFlowType$InstantTicket$FreshPurchase;", "Lapp/chalo/productbooking/common/ProductBookingFlowType$InstantTicket;", "Companion", "$serializer", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        @Serializable
        public static final /* data */ class FreshPurchase extends InstantTicket {

            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion();
            public static final Lazy[] e;
            public final boolean c;
            public final StopBasedRouteSelectionFlowType d;

            /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
            @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/productbooking/common/ProductBookingFlowType$InstantTicket$FreshPurchase$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/productbooking/common/ProductBookingFlowType$InstantTicket$FreshPurchase;", "serializer", "()Lkotlinx/serialization/KSerializer;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final class Companion {
                public final KSerializer<FreshPurchase> serializer() {
                    return ProductBookingFlowType$InstantTicket$FreshPurchase$$serializer.f8087a;
                }
            }

            static {
                StopBasedRouteSelectionFlowType.Companion companion = StopBasedRouteSelectionFlowType.INSTANCE;
                e = new Lazy[]{null, LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new pw0(20))};
            }

            public /* synthetic */ FreshPurchase(int i, boolean z, StopBasedRouteSelectionFlowType stopBasedRouteSelectionFlowType) {
                if (1 != (i & 1)) {
                    PluginExceptionsKt.b(ProductBookingFlowType$InstantTicket$FreshPurchase$$serializer.f8087a.getDescriptor(), i, 1);
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
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001J\u0013\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lapp/chalo/productbooking/common/ProductBookingFlowType$ONDCTicket;", "Lapp/chalo/productbooking/common/ProductBookingFlowType;", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final class ONDCTicket extends ProductBookingFlowType {
        public static final ONDCTicket INSTANCE = new ONDCTicket();
        public static final /* synthetic */ Object b = LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new pw0(21));

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
        public final KSerializer<ONDCTicket> serializer() {
            return (KSerializer) b.getValue();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00022\u00020\u0001:\u000b\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\u0002\u0082\u0001\n\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016¨\u0006\u0017"}, d2 = {"Lapp/chalo/productbooking/common/ProductBookingFlowType$PremiumBusProduct;", "Lapp/chalo/productbooking/common/ProductBookingFlowType;", "Companion", "PassPurchaseThroughAllRoutesScreen", "FreshPurchase", "SelectSlot", "PBAllRoutes", "StopDetails", "PassPurchaseFromAllProducts", "ReserveSeatThroughPass", "RepurchaseTicket", "RescheduleTicket", "FreshPurchaseThroughTripPlanner", "Lapp/chalo/productbooking/common/ProductBookingFlowType$PremiumBusProduct$FreshPurchase;", "Lapp/chalo/productbooking/common/ProductBookingFlowType$PremiumBusProduct$FreshPurchaseThroughTripPlanner;", "Lapp/chalo/productbooking/common/ProductBookingFlowType$PremiumBusProduct$PBAllRoutes;", "Lapp/chalo/productbooking/common/ProductBookingFlowType$PremiumBusProduct$PassPurchaseFromAllProducts;", "Lapp/chalo/productbooking/common/ProductBookingFlowType$PremiumBusProduct$PassPurchaseThroughAllRoutesScreen;", "Lapp/chalo/productbooking/common/ProductBookingFlowType$PremiumBusProduct$RepurchaseTicket;", "Lapp/chalo/productbooking/common/ProductBookingFlowType$PremiumBusProduct$RescheduleTicket;", "Lapp/chalo/productbooking/common/ProductBookingFlowType$PremiumBusProduct$ReserveSeatThroughPass;", "Lapp/chalo/productbooking/common/ProductBookingFlowType$PremiumBusProduct$SelectSlot;", "Lapp/chalo/productbooking/common/ProductBookingFlowType$PremiumBusProduct$StopDetails;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static abstract class PremiumBusProduct extends ProductBookingFlowType {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public static final Object b = LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new pw0(22));

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/productbooking/common/ProductBookingFlowType$PremiumBusProduct$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/productbooking/common/ProductBookingFlowType$PremiumBusProduct;", "serializer", "()Lkotlinx/serialization/KSerializer;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
            public final KSerializer<PremiumBusProduct> serializer() {
                return (KSerializer) PremiumBusProduct.b.getValue();
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/productbooking/common/ProductBookingFlowType$PremiumBusProduct$FreshPurchase;", "Lapp/chalo/productbooking/common/ProductBookingFlowType$PremiumBusProduct;", "Companion", "$serializer", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        @Serializable
        public static final /* data */ class FreshPurchase extends PremiumBusProduct {

            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion();
            public final boolean c;

            /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
            @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/productbooking/common/ProductBookingFlowType$PremiumBusProduct$FreshPurchase$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/productbooking/common/ProductBookingFlowType$PremiumBusProduct$FreshPurchase;", "serializer", "()Lkotlinx/serialization/KSerializer;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final class Companion {
                public final KSerializer<FreshPurchase> serializer() {
                    return ProductBookingFlowType$PremiumBusProduct$FreshPurchase$$serializer.f8088a;
                }
            }

            public /* synthetic */ FreshPurchase(int i, boolean z) {
                if ((i & 1) == 0) {
                    this.c = true;
                } else {
                    this.c = z;
                }
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof FreshPurchase) && this.c == ((FreshPurchase) obj).c;
            }

            public final int hashCode() {
                return this.c ? 1231 : 1237;
            }

            public final String toString() {
                return cb0.k("FreshPurchase(showLandingScreen=", ")", this.c);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/productbooking/common/ProductBookingFlowType$PremiumBusProduct$FreshPurchaseThroughTripPlanner;", "Lapp/chalo/productbooking/common/ProductBookingFlowType$PremiumBusProduct;", "Companion", "$serializer", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        @Serializable
        public static final /* data */ class FreshPurchaseThroughTripPlanner extends PremiumBusProduct {

            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion();
            public static final Lazy[] g = {LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new pw0(23)), null, null, null};
            public final List c;
            public final PBStopPlaceSelectedAppModel d;
            public final PBStopPlaceSelectedAppModel e;
            public final long f;

            /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
            @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/productbooking/common/ProductBookingFlowType$PremiumBusProduct$FreshPurchaseThroughTripPlanner$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/productbooking/common/ProductBookingFlowType$PremiumBusProduct$FreshPurchaseThroughTripPlanner;", "serializer", "()Lkotlinx/serialization/KSerializer;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final class Companion {
                public final KSerializer<FreshPurchaseThroughTripPlanner> serializer() {
                    return ProductBookingFlowType$PremiumBusProduct$FreshPurchaseThroughTripPlanner$$serializer.f8089a;
                }
            }

            public /* synthetic */ FreshPurchaseThroughTripPlanner(int i, List list, PBStopPlaceSelectedAppModel pBStopPlaceSelectedAppModel, PBStopPlaceSelectedAppModel pBStopPlaceSelectedAppModel2, long j) {
                if (15 != (i & 15)) {
                    PluginExceptionsKt.b(ProductBookingFlowType$PremiumBusProduct$FreshPurchaseThroughTripPlanner$$serializer.f8089a.getDescriptor(), i, 15);
                    throw null;
                }
                this.c = list;
                this.d = pBStopPlaceSelectedAppModel;
                this.e = pBStopPlaceSelectedAppModel2;
                this.f = j;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof FreshPurchaseThroughTripPlanner)) {
                    return false;
                }
                FreshPurchaseThroughTripPlanner freshPurchaseThroughTripPlanner = (FreshPurchaseThroughTripPlanner) obj;
                return Intrinsics.d(this.c, freshPurchaseThroughTripPlanner.c) && Intrinsics.d(this.d, freshPurchaseThroughTripPlanner.d) && Intrinsics.d(this.e, freshPurchaseThroughTripPlanner.e) && this.f == freshPurchaseThroughTripPlanner.f;
            }

            public final int hashCode() {
                int iHashCode = (this.e.hashCode() + ((this.d.hashCode() + (this.c.hashCode() * 31)) * 31)) * 31;
                long j = this.f;
                return iHashCode + ((int) (j ^ (j >>> 32)));
            }

            public final String toString() {
                return "FreshPurchaseThroughTripPlanner(routeIds=" + this.c + ", fromStopOrPlaceSelected=" + this.d + ", toStopOrPlaceSelected=" + this.e + ", timeInMillisForRepurchase=" + this.f + ")";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001J\u0013\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lapp/chalo/productbooking/common/ProductBookingFlowType$PremiumBusProduct$PBAllRoutes;", "Lapp/chalo/productbooking/common/ProductBookingFlowType$PremiumBusProduct;", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        @Serializable
        public static final class PBAllRoutes extends PremiumBusProduct {
            public static final PBAllRoutes INSTANCE = new PBAllRoutes();
            public static final /* synthetic */ Object c = LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new pw0(24));

            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
            public final KSerializer<PBAllRoutes> serializer() {
                return (KSerializer) c.getValue();
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/productbooking/common/ProductBookingFlowType$PremiumBusProduct$PassPurchaseFromAllProducts;", "Lapp/chalo/productbooking/common/ProductBookingFlowType$PremiumBusProduct;", "Companion", "$serializer", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        @Serializable
        public static final /* data */ class PassPurchaseFromAllProducts extends PremiumBusProduct {

            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion();
            public final String c;

            /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
            @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/productbooking/common/ProductBookingFlowType$PremiumBusProduct$PassPurchaseFromAllProducts$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/productbooking/common/ProductBookingFlowType$PremiumBusProduct$PassPurchaseFromAllProducts;", "serializer", "()Lkotlinx/serialization/KSerializer;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final class Companion {
                public final KSerializer<PassPurchaseFromAllProducts> serializer() {
                    return ProductBookingFlowType$PremiumBusProduct$PassPurchaseFromAllProducts$$serializer.f8090a;
                }
            }

            public /* synthetic */ PassPurchaseFromAllProducts(int i, String str) {
                if (1 == (i & 1)) {
                    this.c = str;
                } else {
                    PluginExceptionsKt.b(ProductBookingFlowType$PremiumBusProduct$PassPurchaseFromAllProducts$$serializer.f8090a.getDescriptor(), i, 1);
                    throw null;
                }
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof PassPurchaseFromAllProducts) && Intrinsics.d(this.c, ((PassPurchaseFromAllProducts) obj).c);
            }

            public final int hashCode() {
                return this.c.hashCode();
            }

            public final String toString() {
                return vo1.B("PassPurchaseFromAllProducts(configId=", this.c, ")");
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001J\u0013\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lapp/chalo/productbooking/common/ProductBookingFlowType$PremiumBusProduct$PassPurchaseThroughAllRoutesScreen;", "Lapp/chalo/productbooking/common/ProductBookingFlowType$PremiumBusProduct;", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        @Serializable
        public static final class PassPurchaseThroughAllRoutesScreen extends PremiumBusProduct {
            public static final PassPurchaseThroughAllRoutesScreen INSTANCE = new PassPurchaseThroughAllRoutesScreen();
            public static final /* synthetic */ Object c = LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new pw0(25));

            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
            public final KSerializer<PassPurchaseThroughAllRoutesScreen> serializer() {
                return (KSerializer) c.getValue();
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/productbooking/common/ProductBookingFlowType$PremiumBusProduct$RepurchaseTicket;", "Lapp/chalo/productbooking/common/ProductBookingFlowType$PremiumBusProduct;", "Companion", "$serializer", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        @Serializable
        public static final /* data */ class RepurchaseTicket extends PremiumBusProduct {

            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion();
            public final PBOriginDestinationAppModel c;

            /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
            @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/productbooking/common/ProductBookingFlowType$PremiumBusProduct$RepurchaseTicket$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/productbooking/common/ProductBookingFlowType$PremiumBusProduct$RepurchaseTicket;", "serializer", "()Lkotlinx/serialization/KSerializer;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final class Companion {
                public final KSerializer<RepurchaseTicket> serializer() {
                    return ProductBookingFlowType$PremiumBusProduct$RepurchaseTicket$$serializer.f8091a;
                }
            }

            public /* synthetic */ RepurchaseTicket(int i, PBOriginDestinationAppModel pBOriginDestinationAppModel) {
                if (1 == (i & 1)) {
                    this.c = pBOriginDestinationAppModel;
                } else {
                    PluginExceptionsKt.b(ProductBookingFlowType$PremiumBusProduct$RepurchaseTicket$$serializer.f8091a.getDescriptor(), i, 1);
                    throw null;
                }
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof RepurchaseTicket) && Intrinsics.d(this.c, ((RepurchaseTicket) obj).c);
            }

            public final int hashCode() {
                return this.c.hashCode();
            }

            public final String toString() {
                return "RepurchaseTicket(originDestinationAppModel=" + this.c + ")";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/productbooking/common/ProductBookingFlowType$PremiumBusProduct$RescheduleTicket;", "Lapp/chalo/productbooking/common/ProductBookingFlowType$PremiumBusProduct;", "Companion", "$serializer", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        @Serializable
        public static final /* data */ class RescheduleTicket extends PremiumBusProduct {

            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion();
            public final String c;
            public final PBOriginDestinationAppModel d;
            public final PremiumBusProductModificationReasonAppModel e;

            /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
            @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/productbooking/common/ProductBookingFlowType$PremiumBusProduct$RescheduleTicket$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/productbooking/common/ProductBookingFlowType$PremiumBusProduct$RescheduleTicket;", "serializer", "()Lkotlinx/serialization/KSerializer;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final class Companion {
                public final KSerializer<RescheduleTicket> serializer() {
                    return ProductBookingFlowType$PremiumBusProduct$RescheduleTicket$$serializer.f8092a;
                }
            }

            public /* synthetic */ RescheduleTicket(int i, String str, PBOriginDestinationAppModel pBOriginDestinationAppModel, PremiumBusProductModificationReasonAppModel premiumBusProductModificationReasonAppModel) {
                if (7 != (i & 7)) {
                    PluginExceptionsKt.b(ProductBookingFlowType$PremiumBusProduct$RescheduleTicket$$serializer.f8092a.getDescriptor(), i, 7);
                    throw null;
                }
                this.c = str;
                this.d = pBOriginDestinationAppModel;
                this.e = premiumBusProductModificationReasonAppModel;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof RescheduleTicket)) {
                    return false;
                }
                RescheduleTicket rescheduleTicket = (RescheduleTicket) obj;
                return Intrinsics.d(this.c, rescheduleTicket.c) && Intrinsics.d(this.d, rescheduleTicket.d) && Intrinsics.d(this.e, rescheduleTicket.e);
            }

            public final int hashCode() {
                return this.e.hashCode() + ((this.d.hashCode() + (this.c.hashCode() * 31)) * 31);
            }

            public final String toString() {
                return "RescheduleTicket(bookingId=" + this.c + ", originDestinationAppModel=" + this.d + ", reason=" + this.e + ")";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/productbooking/common/ProductBookingFlowType$PremiumBusProduct$ReserveSeatThroughPass;", "Lapp/chalo/productbooking/common/ProductBookingFlowType$PremiumBusProduct;", "Companion", "$serializer", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        @Serializable
        public static final /* data */ class ReserveSeatThroughPass extends PremiumBusProduct {

            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion();
            public final String c;
            public final PBOriginDestinationAppModel d;
            public final PBStopPlaceSelectedAppModel e;
            public final PBStopPlaceSelectedAppModel f;

            /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
            @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/productbooking/common/ProductBookingFlowType$PremiumBusProduct$ReserveSeatThroughPass$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/productbooking/common/ProductBookingFlowType$PremiumBusProduct$ReserveSeatThroughPass;", "serializer", "()Lkotlinx/serialization/KSerializer;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final class Companion {
                public final KSerializer<ReserveSeatThroughPass> serializer() {
                    return ProductBookingFlowType$PremiumBusProduct$ReserveSeatThroughPass$$serializer.f8093a;
                }
            }

            public /* synthetic */ ReserveSeatThroughPass(int i, String str, PBOriginDestinationAppModel pBOriginDestinationAppModel, PBStopPlaceSelectedAppModel pBStopPlaceSelectedAppModel, PBStopPlaceSelectedAppModel pBStopPlaceSelectedAppModel2) {
                if (3 != (i & 3)) {
                    PluginExceptionsKt.b(ProductBookingFlowType$PremiumBusProduct$ReserveSeatThroughPass$$serializer.f8093a.getDescriptor(), i, 3);
                    throw null;
                }
                this.c = str;
                this.d = pBOriginDestinationAppModel;
                if ((i & 4) == 0) {
                    this.e = null;
                } else {
                    this.e = pBStopPlaceSelectedAppModel;
                }
                if ((i & 8) == 0) {
                    this.f = null;
                } else {
                    this.f = pBStopPlaceSelectedAppModel2;
                }
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ReserveSeatThroughPass)) {
                    return false;
                }
                ReserveSeatThroughPass reserveSeatThroughPass = (ReserveSeatThroughPass) obj;
                return Intrinsics.d(this.c, reserveSeatThroughPass.c) && Intrinsics.d(this.d, reserveSeatThroughPass.d) && Intrinsics.d(this.e, reserveSeatThroughPass.e) && Intrinsics.d(this.f, reserveSeatThroughPass.f);
            }

            public final int hashCode() {
                int iHashCode = this.c.hashCode() * 31;
                PBOriginDestinationAppModel pBOriginDestinationAppModel = this.d;
                int iHashCode2 = (iHashCode + (pBOriginDestinationAppModel == null ? 0 : pBOriginDestinationAppModel.hashCode())) * 31;
                PBStopPlaceSelectedAppModel pBStopPlaceSelectedAppModel = this.e;
                int iHashCode3 = (iHashCode2 + (pBStopPlaceSelectedAppModel == null ? 0 : pBStopPlaceSelectedAppModel.hashCode())) * 31;
                PBStopPlaceSelectedAppModel pBStopPlaceSelectedAppModel2 = this.f;
                return iHashCode3 + (pBStopPlaceSelectedAppModel2 != null ? pBStopPlaceSelectedAppModel2.hashCode() : 0);
            }

            public final String toString() {
                return "ReserveSeatThroughPass(selectedPassId=" + this.c + ", originDestinationAppModel=" + this.d + ", fromStopOrPlaceSelected=" + this.e + ", toStopOrPlaceSelected=" + this.f + ")";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/productbooking/common/ProductBookingFlowType$PremiumBusProduct$SelectSlot;", "Lapp/chalo/productbooking/common/ProductBookingFlowType$PremiumBusProduct;", "Companion", "$serializer", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        @Serializable
        public static final /* data */ class SelectSlot extends PremiumBusProduct {

            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion();
            public final PBOriginDestinationAppModel c;
            public final PBStopPlaceSelectedAppModel d;
            public final PBStopPlaceSelectedAppModel e;

            /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
            @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/productbooking/common/ProductBookingFlowType$PremiumBusProduct$SelectSlot$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/productbooking/common/ProductBookingFlowType$PremiumBusProduct$SelectSlot;", "serializer", "()Lkotlinx/serialization/KSerializer;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final class Companion {
                public final KSerializer<SelectSlot> serializer() {
                    return ProductBookingFlowType$PremiumBusProduct$SelectSlot$$serializer.f8094a;
                }
            }

            public /* synthetic */ SelectSlot(int i, PBOriginDestinationAppModel pBOriginDestinationAppModel, PBStopPlaceSelectedAppModel pBStopPlaceSelectedAppModel, PBStopPlaceSelectedAppModel pBStopPlaceSelectedAppModel2) {
                if (7 != (i & 7)) {
                    PluginExceptionsKt.b(ProductBookingFlowType$PremiumBusProduct$SelectSlot$$serializer.f8094a.getDescriptor(), i, 7);
                    throw null;
                }
                this.c = pBOriginDestinationAppModel;
                this.d = pBStopPlaceSelectedAppModel;
                this.e = pBStopPlaceSelectedAppModel2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof SelectSlot)) {
                    return false;
                }
                SelectSlot selectSlot = (SelectSlot) obj;
                return Intrinsics.d(this.c, selectSlot.c) && Intrinsics.d(this.d, selectSlot.d) && Intrinsics.d(this.e, selectSlot.e);
            }

            public final int hashCode() {
                return this.e.hashCode() + ((this.d.hashCode() + (this.c.hashCode() * 31)) * 31);
            }

            public final String toString() {
                return "SelectSlot(originDestinationAppModel=" + this.c + ", fromStopOrPlaceSelected=" + this.d + ", toStopOrPlaceSelected=" + this.e + ")";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/productbooking/common/ProductBookingFlowType$PremiumBusProduct$StopDetails;", "Lapp/chalo/productbooking/common/ProductBookingFlowType$PremiumBusProduct;", "Companion", "$serializer", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        @Serializable
        public static final /* data */ class StopDetails extends PremiumBusProduct {

            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion();
            public final PBStopDetailsNavAppModel c;
            public final boolean d;

            /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
            @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/productbooking/common/ProductBookingFlowType$PremiumBusProduct$StopDetails$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/productbooking/common/ProductBookingFlowType$PremiumBusProduct$StopDetails;", "serializer", "()Lkotlinx/serialization/KSerializer;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final class Companion {
                public final KSerializer<StopDetails> serializer() {
                    return ProductBookingFlowType$PremiumBusProduct$StopDetails$$serializer.f8095a;
                }
            }

            public /* synthetic */ StopDetails(int i, PBStopDetailsNavAppModel pBStopDetailsNavAppModel, boolean z) {
                if (1 != (i & 1)) {
                    PluginExceptionsKt.b(ProductBookingFlowType$PremiumBusProduct$StopDetails$$serializer.f8095a.getDescriptor(), i, 1);
                    throw null;
                }
                this.c = pBStopDetailsNavAppModel;
                if ((i & 2) == 0) {
                    this.d = false;
                } else {
                    this.d = z;
                }
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof StopDetails)) {
                    return false;
                }
                StopDetails stopDetails = (StopDetails) obj;
                return Intrinsics.d(this.c, stopDetails.c) && this.d == stopDetails.d;
            }

            public final int hashCode() {
                return (this.c.hashCode() * 31) + (this.d ? 1231 : 1237);
            }

            public final String toString() {
                return "StopDetails(stopDetailsNavAppModel=" + this.c + ", isPreBookingFlow=" + this.d + ")";
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/productbooking/common/ProductBookingFlowType$StopBasedPassFreshPurchase;", "Lapp/chalo/productbooking/common/ProductBookingFlowType;", "Companion", "$serializer", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class StopBasedPassFreshPurchase extends ProductBookingFlowType {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public final String b;

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/productbooking/common/ProductBookingFlowType$StopBasedPassFreshPurchase$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/productbooking/common/ProductBookingFlowType$StopBasedPassFreshPurchase;", "serializer", "()Lkotlinx/serialization/KSerializer;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer<StopBasedPassFreshPurchase> serializer() {
                return ProductBookingFlowType$StopBasedPassFreshPurchase$$serializer.f8096a;
            }
        }

        public /* synthetic */ StopBasedPassFreshPurchase(int i, String str) {
            if (1 == (i & 1)) {
                this.b = str;
            } else {
                PluginExceptionsKt.b(ProductBookingFlowType$StopBasedPassFreshPurchase$$serializer.f8096a.getDescriptor(), i, 1);
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
    }
}
