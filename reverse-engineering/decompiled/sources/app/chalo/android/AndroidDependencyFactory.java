package app.chalo.android;

import android.content.Context;
import app.chalo.analytics.firebase.FirebaseAnalyticsDelegate;
import app.chalo.analytics.firebase.FirebaseAnalyticsDelegateAndroid;
import app.chalo.android.AndroidDependencyFactory;
import app.chalo.android.adjust.AdjustSdkDelegateAndroid;
import app.chalo.behaviour.policy.SdkIntegrationPolicyManager;
import app.chalo.capacitorDataMigration.CapacitorDataFetcherAndroid;
import app.chalo.checkout.paymentprovider.inai.InaiSdkCreator;
import app.chalo.compose.components.chalomap.ChaloMapLiveBusMarkerHelperAndroid;
import app.chalo.compose.components.chalomap.LatLngBoundsUtilsAndroid;
import app.chalo.compose.components.chalomap.ProjectionUtilsAndroid;
import app.chalo.contract.BasicInfoContract;
import app.chalo.core.chalomap.ChaloMapMarkerInfoWindowProviderAndroid;
import app.chalo.core.di.PlatformDependencyFactory;
import app.chalo.core.di.PlatformDependencyRequest;
import app.chalo.crashlytics.CrashlyticsLogger;
import app.chalo.features.foreground.ApplicationForegroundManagerAndroid;
import app.chalo.features.freshchat.FreshChatInitManagerAndroid;
import app.chalo.features.freshchat.FreshchatRestoreIdDataMigration;
import app.chalo.features.freshchat.FreshchatUserDataHandler;
import app.chalo.features.freshchat.FreshchatUserInteractionContractAndroid;
import app.chalo.features.network.KConnectivityManagerAndroid;
import app.chalo.helper.HtmlTextUIHelperAndroid;
import app.chalo.home.helper.NearbyBusMarkerIconHelperAndroid;
import app.chalo.livetracking.frameworklivetracking.chalosocket.ChaloSocketAndroidImpl;
import app.chalo.livetracking.routedetails.ui.routedetailsscreen.compose.routemap.RouteMapLiveVehicleIconHelperAndroid;
import app.chalo.nearbytrips.ui.mapscreen.NearbyStopsMapMarkerIconHelperAndroid;
import app.chalo.notification.core.NotificationPlatformNativeDelegate;
import app.chalo.providers.CoroutineContextProvider;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.security.encryption.utils.AESCryptoUtilsAndroid;
import app.chalo.security.encryption.utils.KeyEncrypterAndroid;
import app.chalo.security.encryption.utils.KeyStoreUtilsAndroid;
import app.chalo.security.encryption.utils.RSACryptoUtilsAndroid;
import app.chalo.usecase.GetDistinctIdUseCase;
import defpackage.f1;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.context.GlobalContext;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/android/AndroidDependencyFactory;", "Lapp/chalo/core/di/PlatformDependencyFactory;", "Lorg/koin/core/component/KoinComponent;", "androidApp_bmtcPrimaryRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AndroidDependencyFactory implements PlatformDependencyFactory, KoinComponent {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f884a;
    public final Lazy b = LazyKt.b(new f1(15));
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;
    public final Object i;
    public final Object j;
    public final Object k;
    public final Object l;
    public final Object m;
    public final Object n;
    public final Object o;
    public final Lazy p;
    public final Lazy q;
    public final Lazy r;

    public AndroidDependencyFactory(Context context) {
        this.f884a = context;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.SYNCHRONIZED;
        this.c = LazyKt.a(lazyThreadSafetyMode, new Function0<KeyEncrypterAndroid>() { // from class: app.chalo.android.AndroidDependencyFactory$special$$inlined$inject$default$1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                PlatformDependencyFactory platformDependencyFactory = this.f886a;
                return (platformDependencyFactory instanceof KoinScopeComponent ? ((KoinScopeComponent) platformDependencyFactory).getF18811a() : GlobalContext.f18817a.a().c.d).d(Reflection.a(KeyEncrypterAndroid.class), null, null);
            }
        });
        this.d = LazyKt.a(lazyThreadSafetyMode, new Function0<AESCryptoUtilsAndroid>() { // from class: app.chalo.android.AndroidDependencyFactory$special$$inlined$inject$default$2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                PlatformDependencyFactory platformDependencyFactory = this.f891a;
                return (platformDependencyFactory instanceof KoinScopeComponent ? ((KoinScopeComponent) platformDependencyFactory).getF18811a() : GlobalContext.f18817a.a().c.d).d(Reflection.a(AESCryptoUtilsAndroid.class), null, null);
            }
        });
        this.e = LazyKt.a(lazyThreadSafetyMode, new Function0<RSACryptoUtilsAndroid>() { // from class: app.chalo.android.AndroidDependencyFactory$special$$inlined$inject$default$3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                PlatformDependencyFactory platformDependencyFactory = this.f892a;
                return (platformDependencyFactory instanceof KoinScopeComponent ? ((KoinScopeComponent) platformDependencyFactory).getF18811a() : GlobalContext.f18817a.a().c.d).d(Reflection.a(RSACryptoUtilsAndroid.class), null, null);
            }
        });
        this.f = LazyKt.a(lazyThreadSafetyMode, new Function0<KeyStoreUtilsAndroid>() { // from class: app.chalo.android.AndroidDependencyFactory$special$$inlined$inject$default$4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                PlatformDependencyFactory platformDependencyFactory = this.f893a;
                return (platformDependencyFactory instanceof KoinScopeComponent ? ((KoinScopeComponent) platformDependencyFactory).getF18811a() : GlobalContext.f18817a.a().c.d).d(Reflection.a(KeyStoreUtilsAndroid.class), null, null);
            }
        });
        this.g = LazyKt.a(lazyThreadSafetyMode, new Function0<InaiSdkCreator>() { // from class: app.chalo.android.AndroidDependencyFactory$special$$inlined$inject$default$5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                PlatformDependencyFactory platformDependencyFactory = this.f894a;
                return (platformDependencyFactory instanceof KoinScopeComponent ? ((KoinScopeComponent) platformDependencyFactory).getF18811a() : GlobalContext.f18817a.a().c.d).d(Reflection.a(InaiSdkCreator.class), null, null);
            }
        });
        this.h = LazyKt.a(lazyThreadSafetyMode, new Function0<CoroutineContextProvider>() { // from class: app.chalo.android.AndroidDependencyFactory$special$$inlined$inject$default$6
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                PlatformDependencyFactory platformDependencyFactory = this.f895a;
                return (platformDependencyFactory instanceof KoinScopeComponent ? ((KoinScopeComponent) platformDependencyFactory).getF18811a() : GlobalContext.f18817a.a().c.d).d(Reflection.a(CoroutineContextProvider.class), null, null);
            }
        });
        this.i = LazyKt.a(lazyThreadSafetyMode, new Function0<StringProvider>() { // from class: app.chalo.android.AndroidDependencyFactory$special$$inlined$inject$default$7
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                PlatformDependencyFactory platformDependencyFactory = this.f896a;
                return (platformDependencyFactory instanceof KoinScopeComponent ? ((KoinScopeComponent) platformDependencyFactory).getF18811a() : GlobalContext.f18817a.a().c.d).d(Reflection.a(StringProvider.class), null, null);
            }
        });
        this.j = LazyKt.a(lazyThreadSafetyMode, new Function0<BasicInfoContract>() { // from class: app.chalo.android.AndroidDependencyFactory$special$$inlined$inject$default$8
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                PlatformDependencyFactory platformDependencyFactory = this.f897a;
                return (platformDependencyFactory instanceof KoinScopeComponent ? ((KoinScopeComponent) platformDependencyFactory).getF18811a() : GlobalContext.f18817a.a().c.d).d(Reflection.a(BasicInfoContract.class), null, null);
            }
        });
        this.k = LazyKt.a(lazyThreadSafetyMode, new Function0<CrashlyticsLogger>() { // from class: app.chalo.android.AndroidDependencyFactory$special$$inlined$inject$default$9
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                PlatformDependencyFactory platformDependencyFactory = this.f898a;
                return (platformDependencyFactory instanceof KoinScopeComponent ? ((KoinScopeComponent) platformDependencyFactory).getF18811a() : GlobalContext.f18817a.a().c.d).d(Reflection.a(CrashlyticsLogger.class), null, null);
            }
        });
        this.l = LazyKt.a(lazyThreadSafetyMode, new Function0<GetDistinctIdUseCase>() { // from class: app.chalo.android.AndroidDependencyFactory$special$$inlined$inject$default$10
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                PlatformDependencyFactory platformDependencyFactory = this.f887a;
                return (platformDependencyFactory instanceof KoinScopeComponent ? ((KoinScopeComponent) platformDependencyFactory).getF18811a() : GlobalContext.f18817a.a().c.d).d(Reflection.a(GetDistinctIdUseCase.class), null, null);
            }
        });
        this.m = LazyKt.a(lazyThreadSafetyMode, new Function0<FreshchatUserDataHandler>() { // from class: app.chalo.android.AndroidDependencyFactory$special$$inlined$inject$default$11
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                PlatformDependencyFactory platformDependencyFactory = this.f888a;
                return (platformDependencyFactory instanceof KoinScopeComponent ? ((KoinScopeComponent) platformDependencyFactory).getF18811a() : GlobalContext.f18817a.a().c.d).d(Reflection.a(FreshchatUserDataHandler.class), null, null);
            }
        });
        this.n = LazyKt.a(lazyThreadSafetyMode, new Function0<FreshchatRestoreIdDataMigration>() { // from class: app.chalo.android.AndroidDependencyFactory$special$$inlined$inject$default$12
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                PlatformDependencyFactory platformDependencyFactory = this.f889a;
                return (platformDependencyFactory instanceof KoinScopeComponent ? ((KoinScopeComponent) platformDependencyFactory).getF18811a() : GlobalContext.f18817a.a().c.d).d(Reflection.a(FreshchatRestoreIdDataMigration.class), null, null);
            }
        });
        this.o = LazyKt.a(lazyThreadSafetyMode, new Function0<SdkIntegrationPolicyManager>() { // from class: app.chalo.android.AndroidDependencyFactory$special$$inlined$inject$default$13
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                PlatformDependencyFactory platformDependencyFactory = this.f890a;
                return (platformDependencyFactory instanceof KoinScopeComponent ? ((KoinScopeComponent) platformDependencyFactory).getF18811a() : GlobalContext.f18817a.a().c.d).d(Reflection.a(SdkIntegrationPolicyManager.class), null, null);
            }
        });
        final int i = 0;
        this.p = LazyKt.b(new Function0(this) { // from class: y3
            public final /* synthetic */ AndroidDependencyFactory b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return new ApplicationForegroundManagerAndroid(this.b.f884a);
                    default:
                        return new FirebaseAnalyticsDelegateAndroid(this.b.f884a);
                }
            }
        });
        final int i2 = 1;
        this.q = LazyKt.b(new Function0(this) { // from class: y3
            public final /* synthetic */ AndroidDependencyFactory b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return new ApplicationForegroundManagerAndroid(this.b.f884a);
                    default:
                        return new FirebaseAnalyticsDelegateAndroid(this.b.f884a);
                }
            }
        });
        this.r = LazyKt.b(new f1(16));
    }

    @Override // org.koin.core.component.KoinComponent
    public final Koin L() {
        return GlobalContext.f18817a.a();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r8v11, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r8v13, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r8v15, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r8v21, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r8v34, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r8v37, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r8v40, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r8v43, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r8v46, types: [java.lang.Object, kotlin.Lazy] */
    @Override // app.chalo.core.di.PlatformDependencyFactory
    public final Object a(PlatformDependencyRequest request) {
        Intrinsics.i(request, "request");
        if (request.equals(PlatformDependencyRequest.BuildInfo.f2127a)) {
            return (AndroidDependencyFactory$chaloBuildConfig$2$1) this.b.getValue();
        }
        if (request.equals(PlatformDependencyRequest.KeyEncrypterDependencyRequest.f2138a)) {
            return (KeyEncrypterAndroid) this.c.getValue();
        }
        if (request.equals(PlatformDependencyRequest.AESCryptoUtilsRequest.f2125a)) {
            return (AESCryptoUtilsAndroid) this.d.getValue();
        }
        if (request.equals(PlatformDependencyRequest.KeyStoreUtilsRequest.f2139a)) {
            return (RSACryptoUtilsAndroid) this.e.getValue();
        }
        if (request.equals(PlatformDependencyRequest.RSACryptoUtilsRequest.f2146a)) {
            return (KeyStoreUtilsAndroid) this.f.getValue();
        }
        if (request.equals(PlatformDependencyRequest.InaiSdkCreatorRequest.f2137a)) {
            return (InaiSdkCreator) this.g.getValue();
        }
        if (request.equals(PlatformDependencyRequest.ChaloSocketRequest.f2130a)) {
            return new ChaloSocketAndroidImpl();
        }
        boolean zEquals = request.equals(PlatformDependencyRequest.ConnectivityManagerRequest.f2131a);
        Context context = this.f884a;
        if (zEquals) {
            return new KConnectivityManagerAndroid(context);
        }
        if (request.equals(PlatformDependencyRequest.ForegroundManager.f2133a)) {
            return (ApplicationForegroundManagerAndroid) this.p.getValue();
        }
        if (request.equals(PlatformDependencyRequest.MapInfoWindowProvider.f2141a)) {
            return new ChaloMapMarkerInfoWindowProviderAndroid();
        }
        boolean zEquals2 = request.equals(PlatformDependencyRequest.RouteMapLiveVehicleHelper.f2147a);
        ?? r1 = this.i;
        ?? r3 = this.h;
        if (zEquals2) {
            return new RouteMapLiveVehicleIconHelperAndroid(context, (CoroutineContextProvider) r3.getValue(), (StringProvider) r1.getValue());
        }
        if (request.equals(PlatformDependencyRequest.LLBUtils.f2140a)) {
            return new LatLngBoundsUtilsAndroid();
        }
        if (request.equals(PlatformDependencyRequest.ProjectionUtils.f2145a)) {
            return new ProjectionUtilsAndroid();
        }
        if (request.equals(PlatformDependencyRequest.HtmlTextHelper.f2136a)) {
            return new HtmlTextUIHelperAndroid();
        }
        if (request.equals(PlatformDependencyRequest.NearbyBusMarkerIconHelperRequest.f2142a)) {
            return new NearbyBusMarkerIconHelperAndroid(context, (CoroutineContextProvider) r3.getValue(), (CrashlyticsLogger) this.k.getValue());
        }
        if (request.equals(PlatformDependencyRequest.ChaloLiveBusMarkerHelper.f2129a)) {
            return new ChaloMapLiveBusMarkerHelperAndroid(context, (StringProvider) r1.getValue());
        }
        if (request.equals(PlatformDependencyRequest.NearbyStopsMapMarkerHelper.f2143a)) {
            return new NearbyStopsMapMarkerIconHelperAndroid(context, (CoroutineContextProvider) r3.getValue());
        }
        boolean zEquals3 = request.equals(PlatformDependencyRequest.FreshChatInitManagerHelper.f2134a);
        ?? r2 = this.o;
        if (zEquals3) {
            return new FreshChatInitManagerAndroid(context, (SdkIntegrationPolicyManager) r2.getValue());
        }
        if (request.equals(PlatformDependencyRequest.FreshchatUserInteractionContractHelper.f2135a)) {
            return new FreshchatUserInteractionContractAndroid(context, (GetDistinctIdUseCase) this.l.getValue(), (FreshchatUserDataHandler) this.m.getValue(), (FreshchatRestoreIdDataMigration) this.n.getValue(), (SdkIntegrationPolicyManager) r2.getValue());
        }
        if (request.equals(PlatformDependencyRequest.AdjustDelegate.f2126a)) {
            return new AdjustSdkDelegateAndroid(context);
        }
        if (request.equals(PlatformDependencyRequest.FirebaseAnalytics.f2132a)) {
            return (FirebaseAnalyticsDelegate) this.q.getValue();
        }
        if (request.equals(PlatformDependencyRequest.NotificationPlatformDelegate.f2144a)) {
            return (NotificationPlatformNativeDelegate) this.r.getValue();
        }
        if (request.equals(PlatformDependencyRequest.CapacitorDataFetchRequest.f2128a)) {
            return new CapacitorDataFetcherAndroid();
        }
        throw new NoWhenBranchMatchedException();
    }
}
