package app.chalo.core.di;

import app.chalo.analytics.firebase.FirebaseAnalyticsDelegate;
import app.chalo.buildconfig.ChaloBuildConfig;
import app.chalo.capacitorDataMigration.dataFetcher.CapacitorDataFetcher;
import app.chalo.checkout.paymentprovider.inai.InaiSdkCreator;
import app.chalo.compose.components.chalomap.ChaloMapMarkerInfoWindowProvider;
import app.chalo.compose.components.chalomap.LatLngBoundsUtils;
import app.chalo.compose.components.chalomap.iconprovider.ChaloMapLiveBusMarkerHelper;
import app.chalo.features.adjust.AdjustSdkDelegate;
import app.chalo.features.foreground.ApplicationForegroundManager;
import app.chalo.features.freshchat.FreshChatInitManager;
import app.chalo.features.freshchat.FreshchatUserInteractionContract;
import app.chalo.features.network.KConnectivityManager;
import app.chalo.helper.HtmlTextUIHelper;
import app.chalo.home.helper.NearbyBusMarkerIconHelper;
import app.chalo.home.nearbytrips.ui.mapscreen.NearbyStopsMapMarkerIconHelper;
import app.chalo.livetracking.frameworklivetracking.chalosocket.ChaloSocket;
import app.chalo.livetracking.ui.routedetailsscreen.routemap.RouteMapLiveVehicleIconHelper;
import app.chalo.notification.core.NotificationPlatformNativeDelegate;
import app.chalo.security.encryption.utils.AESCryptoUtils;
import app.chalo.security.encryption.utils.KeyEncrypter;
import app.chalo.security.encryption.utils.KeyStoreUtils;
import app.chalo.security.encryption.utils.RSACryptoUtils;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002:\u0017\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u0082\u0001\u0017\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+,-./0¨\u00061"}, d2 = {"Lapp/chalo/core/di/PlatformDependencyRequest;", "CREATES", "", "BuildInfo", "KeyEncrypterDependencyRequest", "AESCryptoUtilsRequest", "RSACryptoUtilsRequest", "KeyStoreUtilsRequest", "InaiSdkCreatorRequest", "ChaloSocketRequest", "ConnectivityManagerRequest", "ForegroundManager", "MapInfoWindowProvider", "RouteMapLiveVehicleHelper", "LLBUtils", "ProjectionUtils", "NearbyBusMarkerIconHelperRequest", "ChaloLiveBusMarkerHelper", "HtmlTextHelper", "NearbyStopsMapMarkerHelper", "FreshChatInitManagerHelper", "FreshchatUserInteractionContractHelper", "AdjustDelegate", "FirebaseAnalytics", "NotificationPlatformDelegate", "CapacitorDataFetchRequest", "Lapp/chalo/core/di/PlatformDependencyRequest$AESCryptoUtilsRequest;", "Lapp/chalo/core/di/PlatformDependencyRequest$AdjustDelegate;", "Lapp/chalo/core/di/PlatformDependencyRequest$BuildInfo;", "Lapp/chalo/core/di/PlatformDependencyRequest$CapacitorDataFetchRequest;", "Lapp/chalo/core/di/PlatformDependencyRequest$ChaloLiveBusMarkerHelper;", "Lapp/chalo/core/di/PlatformDependencyRequest$ChaloSocketRequest;", "Lapp/chalo/core/di/PlatformDependencyRequest$ConnectivityManagerRequest;", "Lapp/chalo/core/di/PlatformDependencyRequest$FirebaseAnalytics;", "Lapp/chalo/core/di/PlatformDependencyRequest$ForegroundManager;", "Lapp/chalo/core/di/PlatformDependencyRequest$FreshChatInitManagerHelper;", "Lapp/chalo/core/di/PlatformDependencyRequest$FreshchatUserInteractionContractHelper;", "Lapp/chalo/core/di/PlatformDependencyRequest$HtmlTextHelper;", "Lapp/chalo/core/di/PlatformDependencyRequest$InaiSdkCreatorRequest;", "Lapp/chalo/core/di/PlatformDependencyRequest$KeyEncrypterDependencyRequest;", "Lapp/chalo/core/di/PlatformDependencyRequest$KeyStoreUtilsRequest;", "Lapp/chalo/core/di/PlatformDependencyRequest$LLBUtils;", "Lapp/chalo/core/di/PlatformDependencyRequest$MapInfoWindowProvider;", "Lapp/chalo/core/di/PlatformDependencyRequest$NearbyBusMarkerIconHelperRequest;", "Lapp/chalo/core/di/PlatformDependencyRequest$NearbyStopsMapMarkerHelper;", "Lapp/chalo/core/di/PlatformDependencyRequest$NotificationPlatformDelegate;", "Lapp/chalo/core/di/PlatformDependencyRequest$ProjectionUtils;", "Lapp/chalo/core/di/PlatformDependencyRequest$RSACryptoUtilsRequest;", "Lapp/chalo/core/di/PlatformDependencyRequest$RouteMapLiveVehicleHelper;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class PlatformDependencyRequest<CREATES> {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lapp/chalo/core/di/PlatformDependencyRequest$AESCryptoUtilsRequest;", "Lapp/chalo/core/di/PlatformDependencyRequest;", "Lapp/chalo/security/encryption/utils/AESCryptoUtils;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class AESCryptoUtilsRequest extends PlatformDependencyRequest<AESCryptoUtils> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final AESCryptoUtilsRequest f2125a = new AESCryptoUtilsRequest();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof AESCryptoUtilsRequest);
        }

        public final int hashCode() {
            return -796466245;
        }

        public final String toString() {
            return "AESCryptoUtilsRequest";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lapp/chalo/core/di/PlatformDependencyRequest$AdjustDelegate;", "Lapp/chalo/core/di/PlatformDependencyRequest;", "Lapp/chalo/features/adjust/AdjustSdkDelegate;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class AdjustDelegate extends PlatformDependencyRequest<AdjustSdkDelegate> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final AdjustDelegate f2126a = new AdjustDelegate();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof AdjustDelegate);
        }

        public final int hashCode() {
            return 1602671175;
        }

        public final String toString() {
            return "AdjustDelegate";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lapp/chalo/core/di/PlatformDependencyRequest$BuildInfo;", "Lapp/chalo/core/di/PlatformDependencyRequest;", "Lapp/chalo/buildconfig/ChaloBuildConfig;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class BuildInfo extends PlatformDependencyRequest<ChaloBuildConfig> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final BuildInfo f2127a = new BuildInfo();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof BuildInfo);
        }

        public final int hashCode() {
            return -630759351;
        }

        public final String toString() {
            return "BuildInfo";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lapp/chalo/core/di/PlatformDependencyRequest$CapacitorDataFetchRequest;", "Lapp/chalo/core/di/PlatformDependencyRequest;", "Lapp/chalo/capacitorDataMigration/dataFetcher/CapacitorDataFetcher;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CapacitorDataFetchRequest extends PlatformDependencyRequest<CapacitorDataFetcher> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final CapacitorDataFetchRequest f2128a = new CapacitorDataFetchRequest();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof CapacitorDataFetchRequest);
        }

        public final int hashCode() {
            return -266837202;
        }

        public final String toString() {
            return "CapacitorDataFetchRequest";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lapp/chalo/core/di/PlatformDependencyRequest$ChaloLiveBusMarkerHelper;", "Lapp/chalo/core/di/PlatformDependencyRequest;", "Lapp/chalo/compose/components/chalomap/iconprovider/ChaloMapLiveBusMarkerHelper;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ChaloLiveBusMarkerHelper extends PlatformDependencyRequest<ChaloMapLiveBusMarkerHelper> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ChaloLiveBusMarkerHelper f2129a = new ChaloLiveBusMarkerHelper();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ChaloLiveBusMarkerHelper);
        }

        public final int hashCode() {
            return 100975440;
        }

        public final String toString() {
            return "ChaloLiveBusMarkerHelper";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lapp/chalo/core/di/PlatformDependencyRequest$ChaloSocketRequest;", "Lapp/chalo/core/di/PlatformDependencyRequest;", "Lapp/chalo/livetracking/frameworklivetracking/chalosocket/ChaloSocket;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ChaloSocketRequest extends PlatformDependencyRequest<ChaloSocket> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ChaloSocketRequest f2130a = new ChaloSocketRequest();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ChaloSocketRequest);
        }

        public final int hashCode() {
            return 1867246928;
        }

        public final String toString() {
            return "ChaloSocketRequest";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lapp/chalo/core/di/PlatformDependencyRequest$ConnectivityManagerRequest;", "Lapp/chalo/core/di/PlatformDependencyRequest;", "Lapp/chalo/features/network/KConnectivityManager;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ConnectivityManagerRequest extends PlatformDependencyRequest<KConnectivityManager> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ConnectivityManagerRequest f2131a = new ConnectivityManagerRequest();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ConnectivityManagerRequest);
        }

        public final int hashCode() {
            return 218245964;
        }

        public final String toString() {
            return "ConnectivityManagerRequest";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lapp/chalo/core/di/PlatformDependencyRequest$FirebaseAnalytics;", "Lapp/chalo/core/di/PlatformDependencyRequest;", "Lapp/chalo/analytics/firebase/FirebaseAnalyticsDelegate;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class FirebaseAnalytics extends PlatformDependencyRequest<FirebaseAnalyticsDelegate> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final FirebaseAnalytics f2132a = new FirebaseAnalytics();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof FirebaseAnalytics);
        }

        public final int hashCode() {
            return -1196528564;
        }

        public final String toString() {
            return "FirebaseAnalytics";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lapp/chalo/core/di/PlatformDependencyRequest$ForegroundManager;", "Lapp/chalo/core/di/PlatformDependencyRequest;", "Lapp/chalo/features/foreground/ApplicationForegroundManager;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ForegroundManager extends PlatformDependencyRequest<ApplicationForegroundManager> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ForegroundManager f2133a = new ForegroundManager();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ForegroundManager);
        }

        public final int hashCode() {
            return -363911177;
        }

        public final String toString() {
            return "ForegroundManager";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lapp/chalo/core/di/PlatformDependencyRequest$FreshChatInitManagerHelper;", "Lapp/chalo/core/di/PlatformDependencyRequest;", "Lapp/chalo/features/freshchat/FreshChatInitManager;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class FreshChatInitManagerHelper extends PlatformDependencyRequest<FreshChatInitManager> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final FreshChatInitManagerHelper f2134a = new FreshChatInitManagerHelper();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof FreshChatInitManagerHelper);
        }

        public final int hashCode() {
            return -315312872;
        }

        public final String toString() {
            return "FreshChatInitManagerHelper";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lapp/chalo/core/di/PlatformDependencyRequest$FreshchatUserInteractionContractHelper;", "Lapp/chalo/core/di/PlatformDependencyRequest;", "Lapp/chalo/features/freshchat/FreshchatUserInteractionContract;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class FreshchatUserInteractionContractHelper extends PlatformDependencyRequest<FreshchatUserInteractionContract> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final FreshchatUserInteractionContractHelper f2135a = new FreshchatUserInteractionContractHelper();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof FreshchatUserInteractionContractHelper);
        }

        public final int hashCode() {
            return 971454388;
        }

        public final String toString() {
            return "FreshchatUserInteractionContractHelper";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lapp/chalo/core/di/PlatformDependencyRequest$HtmlTextHelper;", "Lapp/chalo/core/di/PlatformDependencyRequest;", "Lapp/chalo/helper/HtmlTextUIHelper;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class HtmlTextHelper extends PlatformDependencyRequest<HtmlTextUIHelper> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final HtmlTextHelper f2136a = new HtmlTextHelper();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof HtmlTextHelper);
        }

        public final int hashCode() {
            return 12176729;
        }

        public final String toString() {
            return "HtmlTextHelper";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lapp/chalo/core/di/PlatformDependencyRequest$InaiSdkCreatorRequest;", "Lapp/chalo/core/di/PlatformDependencyRequest;", "Lapp/chalo/checkout/paymentprovider/inai/InaiSdkCreator;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class InaiSdkCreatorRequest extends PlatformDependencyRequest<InaiSdkCreator> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final InaiSdkCreatorRequest f2137a = new InaiSdkCreatorRequest();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof InaiSdkCreatorRequest);
        }

        public final int hashCode() {
            return -2035601507;
        }

        public final String toString() {
            return "InaiSdkCreatorRequest";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lapp/chalo/core/di/PlatformDependencyRequest$KeyEncrypterDependencyRequest;", "Lapp/chalo/core/di/PlatformDependencyRequest;", "Lapp/chalo/security/encryption/utils/KeyEncrypter;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class KeyEncrypterDependencyRequest extends PlatformDependencyRequest<KeyEncrypter> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final KeyEncrypterDependencyRequest f2138a = new KeyEncrypterDependencyRequest();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof KeyEncrypterDependencyRequest);
        }

        public final int hashCode() {
            return -29937058;
        }

        public final String toString() {
            return "KeyEncrypterDependencyRequest";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lapp/chalo/core/di/PlatformDependencyRequest$KeyStoreUtilsRequest;", "Lapp/chalo/core/di/PlatformDependencyRequest;", "Lapp/chalo/security/encryption/utils/KeyStoreUtils;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class KeyStoreUtilsRequest extends PlatformDependencyRequest<KeyStoreUtils> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final KeyStoreUtilsRequest f2139a = new KeyStoreUtilsRequest();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof KeyStoreUtilsRequest);
        }

        public final int hashCode() {
            return -1218605741;
        }

        public final String toString() {
            return "KeyStoreUtilsRequest";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lapp/chalo/core/di/PlatformDependencyRequest$LLBUtils;", "Lapp/chalo/core/di/PlatformDependencyRequest;", "Lapp/chalo/compose/components/chalomap/LatLngBoundsUtils;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class LLBUtils extends PlatformDependencyRequest<LatLngBoundsUtils> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final LLBUtils f2140a = new LLBUtils();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof LLBUtils);
        }

        public final int hashCode() {
            return -1413275326;
        }

        public final String toString() {
            return "LLBUtils";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lapp/chalo/core/di/PlatformDependencyRequest$MapInfoWindowProvider;", "Lapp/chalo/core/di/PlatformDependencyRequest;", "Lapp/chalo/compose/components/chalomap/ChaloMapMarkerInfoWindowProvider;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class MapInfoWindowProvider extends PlatformDependencyRequest<ChaloMapMarkerInfoWindowProvider> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final MapInfoWindowProvider f2141a = new MapInfoWindowProvider();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof MapInfoWindowProvider);
        }

        public final int hashCode() {
            return 580713816;
        }

        public final String toString() {
            return "MapInfoWindowProvider";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lapp/chalo/core/di/PlatformDependencyRequest$NearbyBusMarkerIconHelperRequest;", "Lapp/chalo/core/di/PlatformDependencyRequest;", "Lapp/chalo/home/helper/NearbyBusMarkerIconHelper;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class NearbyBusMarkerIconHelperRequest extends PlatformDependencyRequest<NearbyBusMarkerIconHelper> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final NearbyBusMarkerIconHelperRequest f2142a = new NearbyBusMarkerIconHelperRequest();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof NearbyBusMarkerIconHelperRequest);
        }

        public final int hashCode() {
            return -332694912;
        }

        public final String toString() {
            return "NearbyBusMarkerIconHelperRequest";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lapp/chalo/core/di/PlatformDependencyRequest$NearbyStopsMapMarkerHelper;", "Lapp/chalo/core/di/PlatformDependencyRequest;", "Lapp/chalo/home/nearbytrips/ui/mapscreen/NearbyStopsMapMarkerIconHelper;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class NearbyStopsMapMarkerHelper extends PlatformDependencyRequest<NearbyStopsMapMarkerIconHelper> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final NearbyStopsMapMarkerHelper f2143a = new NearbyStopsMapMarkerHelper();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof NearbyStopsMapMarkerHelper);
        }

        public final int hashCode() {
            return 261943237;
        }

        public final String toString() {
            return "NearbyStopsMapMarkerHelper";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lapp/chalo/core/di/PlatformDependencyRequest$NotificationPlatformDelegate;", "Lapp/chalo/core/di/PlatformDependencyRequest;", "Lapp/chalo/notification/core/NotificationPlatformNativeDelegate;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class NotificationPlatformDelegate extends PlatformDependencyRequest<NotificationPlatformNativeDelegate> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final NotificationPlatformDelegate f2144a = new NotificationPlatformDelegate();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof NotificationPlatformDelegate);
        }

        public final int hashCode() {
            return 658135286;
        }

        public final String toString() {
            return "NotificationPlatformDelegate";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lapp/chalo/core/di/PlatformDependencyRequest$ProjectionUtils;", "Lapp/chalo/core/di/PlatformDependencyRequest;", "Lapp/chalo/compose/components/chalomap/ProjectionUtils;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ProjectionUtils extends PlatformDependencyRequest<app.chalo.compose.components.chalomap.ProjectionUtils> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ProjectionUtils f2145a = new ProjectionUtils();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ProjectionUtils);
        }

        public final int hashCode() {
            return 1062017519;
        }

        public final String toString() {
            return "ProjectionUtils";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lapp/chalo/core/di/PlatformDependencyRequest$RSACryptoUtilsRequest;", "Lapp/chalo/core/di/PlatformDependencyRequest;", "Lapp/chalo/security/encryption/utils/RSACryptoUtils;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class RSACryptoUtilsRequest extends PlatformDependencyRequest<RSACryptoUtils> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final RSACryptoUtilsRequest f2146a = new RSACryptoUtilsRequest();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof RSACryptoUtilsRequest);
        }

        public final int hashCode() {
            return -611448084;
        }

        public final String toString() {
            return "RSACryptoUtilsRequest";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lapp/chalo/core/di/PlatformDependencyRequest$RouteMapLiveVehicleHelper;", "Lapp/chalo/core/di/PlatformDependencyRequest;", "Lapp/chalo/livetracking/ui/routedetailsscreen/routemap/RouteMapLiveVehicleIconHelper;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class RouteMapLiveVehicleHelper extends PlatformDependencyRequest<RouteMapLiveVehicleIconHelper> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final RouteMapLiveVehicleHelper f2147a = new RouteMapLiveVehicleHelper();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof RouteMapLiveVehicleHelper);
        }

        public final int hashCode() {
            return 923479144;
        }

        public final String toString() {
            return "RouteMapLiveVehicleHelper";
        }
    }
}
