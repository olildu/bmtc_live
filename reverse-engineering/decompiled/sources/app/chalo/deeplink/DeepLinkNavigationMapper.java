package app.chalo.deeplink;

import app.chalo.constants.Source;
import app.chalo.scenes.ChaloNavigationRequest;
import app.chalo.scenes.args.HomeArgs;
import app.chalo.scenes.args.SceneArgs;
import app.chalo.scenes.args.TicketPurchaseArgs;
import app.chalo.scenes.args.WalletAllTransactionsArgs;
import app.chalo.scenes.args.WalletBalanceArgs;
import app.chalo.scenes.args.WalletLoadMoneyArgs;
import defpackage.cb0;
import defpackage.dd;
import defpackage.gf;
import defpackage.hq0;
import defpackage.n21;
import defpackage.nf1;
import defpackage.z40;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.collections.builders.ListBuilder;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lapp/chalo/deeplink/DeepLinkNavigationMapper;", "", "RouteDetailsPayload", "TrackingAdditionalFeaturesPayload", "Companion", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DeepLinkNavigationMapper {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0082\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0004¨\u0006\t"}, d2 = {"Lapp/chalo/deeplink/DeepLinkNavigationMapper$Companion;", "", "", "ROUTE_DETAILS_DEEPLINK", "Ljava/lang/String;", "PRODUCT_FLOW_WALLET_BALANCE", "DESTINATION_TAB_REGULAR_BUS", "DESTINATION_TAB_CHALO_BUS", "DESTINATION_TAB_MY_TICKETS", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f2458a;
        public static final /* synthetic */ int[] b;
        public static final /* synthetic */ int[] c;

        static {
            int[] iArr = new int[DeepLinkWalletDestination.values().length];
            try {
                iArr[DeepLinkWalletDestination.WALLET_BALANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DeepLinkWalletDestination.WALLET_LOAD_MONEY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DeepLinkWalletDestination.ALL_TRANSACTIONS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[DeepLinkWalletDestination.QUICK_PAY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[DeepLinkWalletDestination.PAY_FOR_TICKET.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[DeepLinkWalletDestination.TRANSACTION_SUMMARY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f2458a = iArr;
            int[] iArr2 = new int[DeepLinkPremiumBusDestination.values().length];
            try {
                iArr2[DeepLinkPremiumBusDestination.BOOKING.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[DeepLinkPremiumBusDestination.PASS.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            b = iArr2;
            int[] iArr3 = new int[DeepLinkHomeTab.values().length];
            try {
                iArr3[DeepLinkHomeTab.HOME.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[DeepLinkHomeTab.REGULAR_BUS.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[DeepLinkHomeTab.CHALO_BUS.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[DeepLinkHomeTab.MY_TICKETS.ordinal()] = 4;
            } catch (NoSuchFieldError unused12) {
            }
            c = iArr3;
        }
    }

    public static ChaloNavigationRequest.BuildStack a(HomeArgs homeArgs, SceneArgs... sceneArgsArr) {
        ListBuilder listBuilder = new ListBuilder(sceneArgsArr.length + 1);
        listBuilder.add(homeArgs);
        CollectionsKt.k(listBuilder, sceneArgsArr);
        return new ChaloNavigationRequest.BuildStack(listBuilder.g());
    }

    public static ChaloNavigationRequest.BuildStack b(DeepLinkWalletDestination deepLinkWalletDestination) {
        SceneArgs walletBalanceArgs;
        int i = 7;
        switch (WhenMappings.f2458a[deepLinkWalletDestination.ordinal()]) {
            case 1:
                walletBalanceArgs = new WalletBalanceArgs();
                break;
            case 2:
                walletBalanceArgs = new WalletLoadMoneyArgs(i);
                break;
            case 3:
                walletBalanceArgs = new WalletAllTransactionsArgs(false);
                break;
            case 4:
                walletBalanceArgs = new TicketPurchaseArgs.QuickPayArgs(Source.DEEPLINK_PRODUCT);
                break;
            case 5:
                walletBalanceArgs = new TicketPurchaseArgs.PayForTicketArgs(Source.DEEPLINK_PRODUCT, (String) null, 2);
                break;
            case 6:
                return null;
            default:
                throw new NoWhenBranchMatchedException();
        }
        return a(new HomeArgs((String) null, (String) null, 7), walletBalanceArgs);
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0083\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/deeplink/DeepLinkNavigationMapper$RouteDetailsPayload;", "", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class RouteDetailsPayload {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f2454a;
        public final String b;
        public final String c;
        public final String d;
        public final String e;
        public final Boolean f;
        public final boolean g;
        public final TrackingAdditionalFeaturesPayload h;

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/deeplink/DeepLinkNavigationMapper$RouteDetailsPayload$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/deeplink/DeepLinkNavigationMapper$RouteDetailsPayload;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer<RouteDetailsPayload> serializer() {
                return DeepLinkNavigationMapper$RouteDetailsPayload$$serializer.f2455a;
            }
        }

        public /* synthetic */ RouteDetailsPayload(int i, String str, String str2, String str3, String str4, String str5, Boolean bool, boolean z, TrackingAdditionalFeaturesPayload trackingAdditionalFeaturesPayload) {
            if (17 != (i & 17)) {
                PluginExceptionsKt.b(DeepLinkNavigationMapper$RouteDetailsPayload$$serializer.f2455a.getDescriptor(), i, 17);
                throw null;
            }
            this.f2454a = str;
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
            this.e = str5;
            if ((i & 32) == 0) {
                this.f = null;
            } else {
                this.f = bool;
            }
            if ((i & 64) == 0) {
                this.g = false;
            } else {
                this.g = z;
            }
            if ((i & 128) == 0) {
                this.h = new TrackingAdditionalFeaturesPayload(4095, null, false);
            } else {
                this.h = trackingAdditionalFeaturesPayload;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RouteDetailsPayload)) {
                return false;
            }
            RouteDetailsPayload routeDetailsPayload = (RouteDetailsPayload) obj;
            return Intrinsics.d(this.f2454a, routeDetailsPayload.f2454a) && Intrinsics.d(this.b, routeDetailsPayload.b) && Intrinsics.d(this.c, routeDetailsPayload.c) && Intrinsics.d(this.d, routeDetailsPayload.d) && Intrinsics.d(this.e, routeDetailsPayload.e) && Intrinsics.d(this.f, routeDetailsPayload.f) && this.g == routeDetailsPayload.g && Intrinsics.d(this.h, routeDetailsPayload.h);
        }

        public final int hashCode() {
            int iHashCode = this.f2454a.hashCode() * 31;
            String str = this.b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.c;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.d;
            int iE = nf1.e((iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.e);
            Boolean bool = this.f;
            return ((((iE + (bool != null ? bool.hashCode() : 0)) * 31) + (this.g ? 1231 : 1237)) * 31) + this.h.hashCode();
        }

        public final String toString() {
            StringBuilder sbE = dd.e("RouteDetailsPayload(routeId=", this.f2454a, ", startStopId=", this.b, ", endStopId=");
            cb0.t(sbE, this.c, ", triggerStopId=", this.d, ", origin=");
            gf.v(this.f, this.e, ", isBoardingStopBasedOnLocation=", ", premiumBusTrackingFlow=", sbE);
            sbE.append(this.g);
            sbE.append(", additionalFeatures=");
            sbE.append(this.h);
            sbE.append(")");
            return sbE.toString();
        }

        public RouteDetailsPayload(String str, String str2, TrackingAdditionalFeaturesPayload trackingAdditionalFeaturesPayload) {
            this.f2454a = str;
            this.b = null;
            this.c = null;
            this.d = str2;
            this.e = "deeplink route details";
            this.f = null;
            this.g = false;
            this.h = trackingAdditionalFeaturesPayload;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0083\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/deeplink/DeepLinkNavigationMapper$TrackingAdditionalFeaturesPayload;", "", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class TrackingAdditionalFeaturesPayload {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public static final Lazy[] m = {null, null, null, null, null, LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new a()), null, null, null, null, null, null};

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f2456a;
        public final boolean b;
        public final Long c;
        public final Long d;
        public final boolean e;
        public final List f;
        public final boolean g;
        public final boolean h;
        public final boolean i;
        public final boolean j;
        public final boolean k;
        public final boolean l;

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/deeplink/DeepLinkNavigationMapper$TrackingAdditionalFeaturesPayload$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/deeplink/DeepLinkNavigationMapper$TrackingAdditionalFeaturesPayload;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer<TrackingAdditionalFeaturesPayload> serializer() {
                return DeepLinkNavigationMapper$TrackingAdditionalFeaturesPayload$$serializer.f2457a;
            }
        }

        public TrackingAdditionalFeaturesPayload(int i, List list, boolean z) {
            list = (i & 32) != 0 ? null : list;
            z = (i & 2048) != 0 ? true : z;
            this.f2456a = false;
            this.b = false;
            this.c = null;
            this.d = null;
            this.e = true;
            this.f = list;
            this.g = true;
            this.h = false;
            this.i = true;
            this.j = true;
            this.k = true;
            this.l = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TrackingAdditionalFeaturesPayload)) {
                return false;
            }
            TrackingAdditionalFeaturesPayload trackingAdditionalFeaturesPayload = (TrackingAdditionalFeaturesPayload) obj;
            return this.f2456a == trackingAdditionalFeaturesPayload.f2456a && this.b == trackingAdditionalFeaturesPayload.b && Intrinsics.d(this.c, trackingAdditionalFeaturesPayload.c) && Intrinsics.d(this.d, trackingAdditionalFeaturesPayload.d) && this.e == trackingAdditionalFeaturesPayload.e && Intrinsics.d(this.f, trackingAdditionalFeaturesPayload.f) && this.g == trackingAdditionalFeaturesPayload.g && this.h == trackingAdditionalFeaturesPayload.h && this.i == trackingAdditionalFeaturesPayload.i && this.j == trackingAdditionalFeaturesPayload.j && this.k == trackingAdditionalFeaturesPayload.k && this.l == trackingAdditionalFeaturesPayload.l;
        }

        public final int hashCode() {
            int i = (((this.f2456a ? 1231 : 1237) * 31) + (this.b ? 1231 : 1237)) * 31;
            Long l = this.c;
            int iHashCode = (i + (l == null ? 0 : l.hashCode())) * 31;
            Long l2 = this.d;
            int iHashCode2 = (((iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31) + (this.e ? 1231 : 1237)) * 31;
            List list = this.f;
            return ((((((((((((iHashCode2 + (list != null ? list.hashCode() : 0)) * 31) + (this.g ? 1231 : 1237)) * 31) + (this.h ? 1231 : 1237)) * 31) + (this.i ? 1231 : 1237)) * 31) + (this.j ? 1231 : 1237)) * 31) + (this.k ? 1231 : 1237)) * 31) + (this.l ? 1231 : 1237);
        }

        public final String toString() {
            StringBuilder sbR = nf1.r("TrackingAdditionalFeaturesPayload(handleBusPassedStop=", ", handleLiveTrackingNotAvailable=", ", scheduledTimeForStartStop=", this.f2456a, this.b);
            nf1.w(sbR, this.c, ", scheduledTimeForTripStart=", this.d, ", showTimetableButton=");
            hq0.w(sbR, this.e, ", vehicleNumbersToTrack=", this.f, ", showRouteBookingType=");
            z40.r(sbR, this.g, ", preSelectStartStopForShowingEtaOnMap=", this.h, ", showMyLocationButtonOnMap=");
            z40.r(sbR, this.i, ", showNextBusHeadingForEta=", this.j, ", showBusIconForEta=");
            return n21.h(sbR, this.k, ", showNearestStopTagForTriggerStop=", this.l, ")");
        }

        public /* synthetic */ TrackingAdditionalFeaturesPayload(int i, boolean z, boolean z2, Long l, Long l2, boolean z3, List list, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9) {
            if ((i & 1) == 0) {
                this.f2456a = false;
            } else {
                this.f2456a = z;
            }
            if ((i & 2) == 0) {
                this.b = false;
            } else {
                this.b = z2;
            }
            if ((i & 4) == 0) {
                this.c = null;
            } else {
                this.c = l;
            }
            if ((i & 8) == 0) {
                this.d = null;
            } else {
                this.d = l2;
            }
            if ((i & 16) == 0) {
                this.e = true;
            } else {
                this.e = z3;
            }
            if ((i & 32) == 0) {
                this.f = null;
            } else {
                this.f = list;
            }
            if ((i & 64) == 0) {
                this.g = true;
            } else {
                this.g = z4;
            }
            if ((i & 128) == 0) {
                this.h = false;
            } else {
                this.h = z5;
            }
            if ((i & 256) == 0) {
                this.i = true;
            } else {
                this.i = z6;
            }
            if ((i & 512) == 0) {
                this.j = true;
            } else {
                this.j = z7;
            }
            if ((i & 1024) == 0) {
                this.k = true;
            } else {
                this.k = z8;
            }
            if ((i & 2048) == 0) {
                this.l = true;
            } else {
                this.l = z9;
            }
        }
    }
}
