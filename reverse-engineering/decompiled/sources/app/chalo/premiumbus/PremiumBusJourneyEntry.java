package app.chalo.premiumbus;

import app.chalo.constants.Source;
import app.chalo.premiumbus.ui.seatselection.PremiumBusSeatSelectionFlowType;
import app.chalo.premiumbus.ui.stopdetails.PBStopDetailsNavAppModel;
import app.chalo.scenes.args.PassLandingFlowType;
import defpackage.hq0;
import defpackage.nf1;
import defpackage.nt0;
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
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00022\u00020\u0001:\u0007\u0003\u0004\u0005\u0006\u0007\b\u0002\u0082\u0001\u0006\t\n\u000b\f\r\u000e¨\u0006\u000f"}, d2 = {"Lapp/chalo/premiumbus/PremiumBusJourneyEntry;", "", "Companion", "NavigateToPassPurchaseLandingScreen", "NavigateToStopSelectionScreen", "NavigateToSlotSelectionScreen", "NavigateToStopDetailsScreen", "NavigateToSeatSelectionScreen", "NavigateToProductSelectionScreen", "Lapp/chalo/premiumbus/PremiumBusJourneyEntry$NavigateToPassPurchaseLandingScreen;", "Lapp/chalo/premiumbus/PremiumBusJourneyEntry$NavigateToProductSelectionScreen;", "Lapp/chalo/premiumbus/PremiumBusJourneyEntry$NavigateToSeatSelectionScreen;", "Lapp/chalo/premiumbus/PremiumBusJourneyEntry$NavigateToSlotSelectionScreen;", "Lapp/chalo/premiumbus/PremiumBusJourneyEntry$NavigateToStopDetailsScreen;", "Lapp/chalo/premiumbus/PremiumBusJourneyEntry$NavigateToStopSelectionScreen;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public abstract class PremiumBusJourneyEntry {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f6851a = LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new nt0(5));

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/premiumbus/PremiumBusJourneyEntry$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/premiumbus/PremiumBusJourneyEntry;", "serializer", "()Lkotlinx/serialization/KSerializer;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
        public final KSerializer<PremiumBusJourneyEntry> serializer() {
            return (KSerializer) PremiumBusJourneyEntry.f6851a.getValue();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/premiumbus/PremiumBusJourneyEntry$NavigateToProductSelectionScreen;", "Lapp/chalo/premiumbus/PremiumBusJourneyEntry;", "Companion", "$serializer", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class NavigateToProductSelectionScreen extends PremiumBusJourneyEntry {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public static final Lazy[] c = {LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new nt0(8))};
        public final PremiumBusProductPurchaseFlowType b;

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/premiumbus/PremiumBusJourneyEntry$NavigateToProductSelectionScreen$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/premiumbus/PremiumBusJourneyEntry$NavigateToProductSelectionScreen;", "serializer", "()Lkotlinx/serialization/KSerializer;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer<NavigateToProductSelectionScreen> serializer() {
                return PremiumBusJourneyEntry$NavigateToProductSelectionScreen$$serializer.f6853a;
            }
        }

        public /* synthetic */ NavigateToProductSelectionScreen(int i, PremiumBusProductPurchaseFlowType premiumBusProductPurchaseFlowType) {
            if (1 == (i & 1)) {
                this.b = premiumBusProductPurchaseFlowType;
            } else {
                PluginExceptionsKt.b(PremiumBusJourneyEntry$NavigateToProductSelectionScreen$$serializer.f6853a.getDescriptor(), i, 1);
                throw null;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof NavigateToProductSelectionScreen) && Intrinsics.d(this.b, ((NavigateToProductSelectionScreen) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "NavigateToProductSelectionScreen(premiumBusProductPurchaseFlowType=" + this.b + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/premiumbus/PremiumBusJourneyEntry$NavigateToSeatSelectionScreen;", "Lapp/chalo/premiumbus/PremiumBusJourneyEntry;", "Companion", "$serializer", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class NavigateToSeatSelectionScreen extends PremiumBusJourneyEntry {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public static final Lazy[] d = {LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new nt0(9)), null};
        public final PremiumBusSeatSelectionFlowType b;
        public final String c;

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/premiumbus/PremiumBusJourneyEntry$NavigateToSeatSelectionScreen$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/premiumbus/PremiumBusJourneyEntry$NavigateToSeatSelectionScreen;", "serializer", "()Lkotlinx/serialization/KSerializer;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer<NavigateToSeatSelectionScreen> serializer() {
                return PremiumBusJourneyEntry$NavigateToSeatSelectionScreen$$serializer.f6854a;
            }
        }

        public /* synthetic */ NavigateToSeatSelectionScreen(int i, PremiumBusSeatSelectionFlowType premiumBusSeatSelectionFlowType, String str) {
            if (1 != (i & 1)) {
                PluginExceptionsKt.b(PremiumBusJourneyEntry$NavigateToSeatSelectionScreen$$serializer.f6854a.getDescriptor(), i, 1);
                throw null;
            }
            this.b = premiumBusSeatSelectionFlowType;
            if ((i & 2) == 0) {
                this.c = null;
            } else {
                this.c = str;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NavigateToSeatSelectionScreen)) {
                return false;
            }
            NavigateToSeatSelectionScreen navigateToSeatSelectionScreen = (NavigateToSeatSelectionScreen) obj;
            return Intrinsics.d(this.b, navigateToSeatSelectionScreen.b) && Intrinsics.d(this.c, navigateToSeatSelectionScreen.c);
        }

        public final int hashCode() {
            int iHashCode = this.b.hashCode() * 31;
            String str = this.c;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return "NavigateToSeatSelectionScreen(flow=" + this.b + ", deeplinkAttribution=" + this.c + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/premiumbus/PremiumBusJourneyEntry$NavigateToSlotSelectionScreen;", "Lapp/chalo/premiumbus/PremiumBusJourneyEntry;", "Companion", "$serializer", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class NavigateToSlotSelectionScreen extends PremiumBusJourneyEntry {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public static final Lazy[] d = {LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new nt0(10)), null};
        public final PremiumBusProductPurchaseFlowType b;
        public final String c;

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/premiumbus/PremiumBusJourneyEntry$NavigateToSlotSelectionScreen$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/premiumbus/PremiumBusJourneyEntry$NavigateToSlotSelectionScreen;", "serializer", "()Lkotlinx/serialization/KSerializer;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer<NavigateToSlotSelectionScreen> serializer() {
                return PremiumBusJourneyEntry$NavigateToSlotSelectionScreen$$serializer.f6855a;
            }
        }

        public /* synthetic */ NavigateToSlotSelectionScreen(int i, PremiumBusProductPurchaseFlowType premiumBusProductPurchaseFlowType, String str) {
            if (1 != (i & 1)) {
                PluginExceptionsKt.b(PremiumBusJourneyEntry$NavigateToSlotSelectionScreen$$serializer.f6855a.getDescriptor(), i, 1);
                throw null;
            }
            this.b = premiumBusProductPurchaseFlowType;
            if ((i & 2) == 0) {
                this.c = null;
            } else {
                this.c = str;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NavigateToSlotSelectionScreen)) {
                return false;
            }
            NavigateToSlotSelectionScreen navigateToSlotSelectionScreen = (NavigateToSlotSelectionScreen) obj;
            return Intrinsics.d(this.b, navigateToSlotSelectionScreen.b) && Intrinsics.d(this.c, navigateToSlotSelectionScreen.c);
        }

        public final int hashCode() {
            int iHashCode = this.b.hashCode() * 31;
            String str = this.c;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return "NavigateToSlotSelectionScreen(premiumBusProductPurchaseFlowType=" + this.b + ", deeplinkAttribution=" + this.c + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/premiumbus/PremiumBusJourneyEntry$NavigateToStopDetailsScreen;", "Lapp/chalo/premiumbus/PremiumBusJourneyEntry;", "Companion", "$serializer", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class NavigateToStopDetailsScreen extends PremiumBusJourneyEntry {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public final PBStopDetailsNavAppModel b;
        public final boolean c;
        public final String d;

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/premiumbus/PremiumBusJourneyEntry$NavigateToStopDetailsScreen$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/premiumbus/PremiumBusJourneyEntry$NavigateToStopDetailsScreen;", "serializer", "()Lkotlinx/serialization/KSerializer;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer<NavigateToStopDetailsScreen> serializer() {
                return PremiumBusJourneyEntry$NavigateToStopDetailsScreen$$serializer.f6856a;
            }
        }

        public /* synthetic */ NavigateToStopDetailsScreen(int i, PBStopDetailsNavAppModel pBStopDetailsNavAppModel, boolean z, String str) {
            if (1 != (i & 1)) {
                PluginExceptionsKt.b(PremiumBusJourneyEntry$NavigateToStopDetailsScreen$$serializer.f6856a.getDescriptor(), i, 1);
                throw null;
            }
            this.b = pBStopDetailsNavAppModel;
            if ((i & 2) == 0) {
                this.c = false;
            } else {
                this.c = z;
            }
            if ((i & 4) == 0) {
                this.d = null;
            } else {
                this.d = str;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NavigateToStopDetailsScreen)) {
                return false;
            }
            NavigateToStopDetailsScreen navigateToStopDetailsScreen = (NavigateToStopDetailsScreen) obj;
            return Intrinsics.d(this.b, navigateToStopDetailsScreen.b) && this.c == navigateToStopDetailsScreen.c && Intrinsics.d(this.d, navigateToStopDetailsScreen.d);
        }

        public final int hashCode() {
            int iHashCode = ((this.b.hashCode() * 31) + (this.c ? 1231 : 1237)) * 31;
            String str = this.d;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("NavigateToStopDetailsScreen(stopDetailsNavAppModel=");
            sb.append(this.b);
            sb.append(", isPreBookingFlow=");
            sb.append(this.c);
            sb.append(", deeplinkAttribution=");
            return vo1.p(sb, this.d, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/premiumbus/PremiumBusJourneyEntry$NavigateToStopSelectionScreen;", "Lapp/chalo/premiumbus/PremiumBusJourneyEntry;", "Companion", "$serializer", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class NavigateToStopSelectionScreen extends PremiumBusJourneyEntry {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public final String b;
        public final boolean c;
        public final boolean d;
        public final String e;

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/premiumbus/PremiumBusJourneyEntry$NavigateToStopSelectionScreen$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/premiumbus/PremiumBusJourneyEntry$NavigateToStopSelectionScreen;", "serializer", "()Lkotlinx/serialization/KSerializer;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer<NavigateToStopSelectionScreen> serializer() {
                return PremiumBusJourneyEntry$NavigateToStopSelectionScreen$$serializer.f6857a;
            }
        }

        public /* synthetic */ NavigateToStopSelectionScreen(String str, int i, String str2, boolean z, boolean z2) {
            if ((i & 1) == 0) {
                this.b = null;
            } else {
                this.b = str;
            }
            if ((i & 2) == 0) {
                this.c = false;
            } else {
                this.c = z;
            }
            if ((i & 4) == 0) {
                this.d = true;
            } else {
                this.d = z2;
            }
            if ((i & 8) == 0) {
                this.e = null;
            } else {
                this.e = str2;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NavigateToStopSelectionScreen)) {
                return false;
            }
            NavigateToStopSelectionScreen navigateToStopSelectionScreen = (NavigateToStopSelectionScreen) obj;
            return Intrinsics.d(this.b, navigateToStopSelectionScreen.b) && this.c == navigateToStopSelectionScreen.c && this.d == navigateToStopSelectionScreen.d && Intrinsics.d(this.e, navigateToStopSelectionScreen.e);
        }

        public final int hashCode() {
            String str = this.b;
            int iHashCode = (((((str == null ? 0 : str.hashCode()) * 31) + (this.c ? 1231 : 1237)) * 31) + (this.d ? 1231 : 1237)) * 31;
            String str2 = this.e;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbM = hq0.m("NavigateToStopSelectionScreen(configId=", this.b, ", isPassPurchaseFromAllProducts=", ", showLandingScreen=", this.c);
            sbM.append(this.d);
            sbM.append(", deeplinkAttribution=");
            sbM.append(this.e);
            sbM.append(")");
            return sbM.toString();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/premiumbus/PremiumBusJourneyEntry$NavigateToPassPurchaseLandingScreen;", "Lapp/chalo/premiumbus/PremiumBusJourneyEntry;", "Companion", "$serializer", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class NavigateToPassPurchaseLandingScreen extends PremiumBusJourneyEntry {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public static final Lazy[] f;
        public final PassLandingFlowType b;
        public final Source c;
        public final boolean d;
        public final String e;

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/premiumbus/PremiumBusJourneyEntry$NavigateToPassPurchaseLandingScreen$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/premiumbus/PremiumBusJourneyEntry$NavigateToPassPurchaseLandingScreen;", "serializer", "()Lkotlinx/serialization/KSerializer;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer<NavigateToPassPurchaseLandingScreen> serializer() {
                return PremiumBusJourneyEntry$NavigateToPassPurchaseLandingScreen$$serializer.f6852a;
            }
        }

        static {
            PassLandingFlowType.Companion companion = PassLandingFlowType.INSTANCE;
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
            f = new Lazy[]{LazyKt.a(lazyThreadSafetyMode, new nt0(6)), LazyKt.a(lazyThreadSafetyMode, new nt0(7)), null, null};
        }

        public /* synthetic */ NavigateToPassPurchaseLandingScreen(int i, PassLandingFlowType passLandingFlowType, Source source, boolean z, String str) {
            if (3 != (i & 3)) {
                PluginExceptionsKt.b(PremiumBusJourneyEntry$NavigateToPassPurchaseLandingScreen$$serializer.f6852a.getDescriptor(), i, 3);
                throw null;
            }
            this.b = passLandingFlowType;
            this.c = source;
            if ((i & 4) == 0) {
                this.d = false;
            } else {
                this.d = z;
            }
            if ((i & 8) == 0) {
                this.e = null;
            } else {
                this.e = str;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NavigateToPassPurchaseLandingScreen)) {
                return false;
            }
            NavigateToPassPurchaseLandingScreen navigateToPassPurchaseLandingScreen = (NavigateToPassPurchaseLandingScreen) obj;
            return Intrinsics.d(this.b, navigateToPassPurchaseLandingScreen.b) && this.c == navigateToPassPurchaseLandingScreen.c && this.d == navigateToPassPurchaseLandingScreen.d && Intrinsics.d(this.e, navigateToPassPurchaseLandingScreen.e);
        }

        public final int hashCode() {
            int iF = (nf1.f(this.c, this.b.hashCode() * 31, 31) + (this.d ? 1231 : 1237)) * 31;
            String str = this.e;
            return iF + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return "NavigateToPassPurchaseLandingScreen(flowType=" + this.b + ", source=" + this.c + ", isRouteBasedPass=" + this.d + ", deeplinkAttribution=" + this.e + ")";
        }

        public NavigateToPassPurchaseLandingScreen(PassLandingFlowType flowType, Source source, boolean z, String str) {
            Intrinsics.i(flowType, "flowType");
            Intrinsics.i(source, "source");
            this.b = flowType;
            this.c = source;
            this.d = z;
            this.e = str;
        }
    }
}
