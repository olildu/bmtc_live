package app.chalo.android;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.activity.EdgeToEdge;
import androidx.activity.OnBackPressedCallback;
import androidx.activity.SystemBarStyle;
import androidx.activity.compose.ComponentActivityKt;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.core.os.LocaleListCompat;
import androidx.core.splashscreen.SplashScreen;
import androidx.core.view.ViewCompat;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.media3.extractor.text.ttml.TtmlNode;
import app.chalo.ads.ExitInterstitialAdAvailability;
import app.chalo.ads.ExitInterstitialAdConfig;
import app.chalo.ads.ExitInterstitialAdManager;
import app.chalo.ads.ExitInterstitialCapState;
import app.chalo.ads.ExitInterstitialCapStore;
import app.chalo.ads.ExitInterstitialConfigProvider;
import app.chalo.ads.ExitInterstitialDecision;
import app.chalo.ads.ExitInterstitialDecisionEngine;
import app.chalo.ads.ExitInterstitialDecisionReason;
import app.chalo.ads.ExitInterstitialLoadedAd;
import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.android.MainActivity;
import app.chalo.behaviour.policy.SdkIntegrationPolicyManager;
import app.chalo.ble_communication.feature.bluetoothsystem.ManualBluetoothTurnOnDelegateAndroid;
import app.chalo.ble_communication.feature.bluetoothsystem.ManualBluetoothTurnOnDelegateProvider;
import app.chalo.buildconfig.ChaloBuildConfig;
import app.chalo.checkout.domain.phonepe.CreatePhonePePaymentModeDataUseCase;
import app.chalo.checkout.paymentprovider.juspay.HyperServiceHolderSDKAndroid;
import app.chalo.checkout.paymentprovider.phonepe.PhonepeSdkAndroid;
import app.chalo.checkout.paymentprovider.phonepe.PhonepeSdkManager;
import app.chalo.checkout.paymentprovider.phonepe.PhonepeSdkSetter;
import app.chalo.checkout.paymentprovider.razorpay.RazorpaySdk;
import app.chalo.checkout.paymentprovider.razorpay.RazorpaySdkSetter;
import app.chalo.checkout.utility.InstalledUpiAppsHelperAndroid;
import app.chalo.checkout.utility.InstalledUpiAppsHelperSetter;
import app.chalo.compose.utils.CommonContext;
import app.chalo.contract.BasicInfoContract;
import app.chalo.core.navigation.DecomposeNavigationAdapter;
import app.chalo.core.navigation.DecomposeNavigationScreenTracker;
import app.chalo.core.navigation.root.RootComponent;
import app.chalo.crashlytics.CrashlyticsLogger;
import app.chalo.deeplink.DeepLinkNavigationHandler;
import app.chalo.deeplink.DeepLinkResolutionRequest;
import app.chalo.deeplink.DeepLinkResumeMonitor;
import app.chalo.deeplink.DeepLinkRuntime;
import app.chalo.features.foreground.ActiveSceneInStackResolver;
import app.chalo.features.language.LanguageFeature;
import app.chalo.features.language.data.Language;
import app.chalo.fileupload.picker.ImagePickerAndroid;
import app.chalo.fileupload.picker.ImagePickerSetter;
import app.chalo.home.manager.AppRatingProcessManagerAndroid;
import app.chalo.home.manager.AppRatingProcessManagerSetter;
import app.chalo.home.ui.base.HomeComponent;
import app.chalo.home.ui.base.HomeScreenFragmentViewState;
import app.chalo.homescreen.data.model.app.BottomNavTabAppModelKt;
import app.chalo.homescreen.data.model.app.BottomNavTabType;
import app.chalo.homescreen.data.model.app.NavigationTabAppModel;
import app.chalo.juspay.JuspayControllerHost;
import app.chalo.juspay.JuspayControllerProvider;
import app.chalo.juspay.JuspayControllerSetter;
import app.chalo.juspay.JuspayPlatformSdkFactory;
import app.chalo.login.phonenumberhint.AndroidPhoneNumberHintHandler;
import app.chalo.login.phonenumberhint.PhoneNumberHintHandlerSetter;
import app.chalo.login.phonenumberhint.PhoneNumberHintResult;
import app.chalo.login.truecaller.AndroidTruecallerSetupHandlerImpl;
import app.chalo.login.truecaller.TruecallerSetupHandler;
import app.chalo.login.truecaller.TruecallerSetupHandlerProvider;
import app.chalo.ncmc.uvik.UvikResult;
import app.chalo.ncmc.uvik.UvikSdkManagerAndroid;
import app.chalo.ncmc.uvik.UvikSdkManagerProvider;
import app.chalo.ncmc.uvik.UvikSdkManager_androidKt;
import app.chalo.network.config.ChaloJson;
import app.chalo.permissions.gps.GpsRequestHandlerAndroid;
import app.chalo.permissions.gps.GpsRequestHandlerSetter;
import app.chalo.permissions.handler.PermissionHandlerAndroid;
import app.chalo.permissions.handler.PermissionHandlerSetter;
import app.chalo.plotline.PlotlineTrackContext;
import app.chalo.plotline.PlotlineTrackContextProvider;
import app.chalo.providers.CoroutineContextProvider;
import app.chalo.providers.iconassetprovider.IconAssetProvider;
import app.chalo.providers.lottieassetprovider.LottieAssetProvider;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.scenes.ChaloNavigationManager;
import app.chalo.scenes.ChaloScenes;
import app.chalo.scenes.args.HomeArgs;
import app.chalo.scenes.args.SceneArgs;
import app.chalo.scenes.args.SplashArgs;
import app.chalo.security.root.GetRootCheckRemoteConfigUseCase;
import app.chalo.sos.feature.SosFeaturePlatformDelegateAndroid;
import app.chalo.sos.feature.SosFeaturePlatformDelegateProviderImpl;
import app.chalo.thoughtnudge.ThoughtNudgeContract;
import app.chalo.usecase.GetDeviceNFCStateUseCase;
import app.chalo.usecase.GetDistinctIdUseCase;
import app.chalo.utils.SystemHelper;
import app.chalo.validationsdk.blevalidation.nfc.DeviceNfcTapPaySuppressorAndroid;
import app.chalo.validationsdk.blevalidation.nfc.DeviceNfcTapPaySuppressorSetter;
import com.arkivanov.decompose.Cancellation;
import com.arkivanov.decompose.Child;
import com.arkivanov.decompose.DefaultComponentContext;
import com.arkivanov.decompose.GettingList;
import com.arkivanov.decompose.router.stack.ChildStack;
import com.arkivanov.decompose.value.Value;
import com.arkivanov.essenty.backhandler.AndroidBackHandlerKt;
import com.arkivanov.essenty.backhandler.BackCallbackKt;
import com.arkivanov.essenty.backhandler.BackCallbackKt$BackCallback$1;
import com.arkivanov.essenty.backhandler.BackHandler;
import com.arkivanov.essenty.backhandler.DefaultBackDispatcher;
import com.arkivanov.essenty.instancekeeper.AndroidExtKt$InstanceKeeper$1;
import com.arkivanov.essenty.instancekeeper.DefaultInstanceKeeperDispatcher;
import com.arkivanov.essenty.instancekeeper.InstanceKeeperViewModel;
import com.arkivanov.essenty.lifecycle.Lifecycle;
import com.arkivanov.essenty.statekeeper.AndroidExtKt;
import com.arkivanov.essenty.statekeeper.DefaultStateKeeperDispatcher;
import com.canhub.cropper.CropImageView;
import com.freshchat.consumer.sdk.beans.config.DefaultRefreshIntervals;
import com.google.android.gms.auth.api.identity.SignInClient;
import com.google.android.gms.common.api.ApiException;
import defpackage.a7;
import defpackage.cb0;
import defpackage.dd0;
import defpackage.f1;
import defpackage.h3;
import defpackage.nf1;
import defpackage.vo1;
import defpackage.yv;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.ClassReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.internal.AbstractSharedFlow;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.Json;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.android.ext.android.ComponentCallbackExtKt;
import org.koin.core.context.GlobalContext;
import org.koin.core.parameter.ParametersHolderKt;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lapp/chalo/android/MainActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "Companion", "androidApp_bmtcPrimaryRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class MainActivity extends AppCompatActivity {
    public static final AtomicInteger o1 = new AtomicInteger(0);
    public final Object A0;
    public final Object B0;
    public final Object C0;
    public final Object D0;
    public final ActivityResultContractsHolder E0;
    public final Lazy F0;
    public final Lazy G0;
    public final Lazy H0;
    public final Lazy I0;
    public final Lazy J0;
    public final Lazy K0;
    public final Lazy L0;
    public final Lazy M0;
    public final Lazy N0;
    public final Lazy O0;
    public final Lazy P0;
    public final Lazy Q0;
    public final Lazy R0;
    public final Object a0;
    public final Object b0;
    public final Object b1;
    public final Object c0;
    public final Object d0;
    public final Object e0;
    public final Object f0;
    public final Object f1;
    public final Object g0;
    public final Object g1;
    public final Object h0;
    public final Object h1;
    public final Object i0;
    public final Object i1;
    public final Object j0;
    public final Object j1;
    public final Object k0;
    public RootComponent k1;
    public final Object l0;
    public BackCallbackKt$BackCallback$1 l1;
    public final Object m0;
    public Cancellation m1;
    public final Object n0;
    public ExitInterstitialExitGate n1;
    public final Object o0;
    public final Object p0;
    public final Object q0;
    public final Object r0;
    public final Object s0;
    public final Object t0;
    public final Object u0;
    public final Object v0;
    public final Object w0;
    public final Object x0;
    public final Object y0;
    public final Object z0;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lapp/chalo/android/MainActivity$Companion;", "", "Ljava/util/concurrent/atomic/AtomicInteger;", "activeInstanceCount", "Ljava/util/concurrent/atomic/AtomicInteger;", "androidApp_bmtcPrimaryRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
    }

    /* JADX INFO: renamed from: app.chalo.android.MainActivity$onActivityResult$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    @DebugMetadata(c = "app.chalo.android.MainActivity$onActivityResult$1", f = "MainActivity.kt", l = {}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Intent $data;
        final /* synthetic */ int $requestCode;
        final /* synthetic */ int $resultCode;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(int i, int i2, Intent intent, Continuation continuation) {
            super(2, continuation);
            this.$requestCode = i;
            this.$resultCode = i2;
            this.$data = intent;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return MainActivity.this.new AnonymousClass1(this.$requestCode, this.$resultCode, this.$data, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = (AnonymousClass1) create((CoroutineScope) obj, (Continuation) obj2);
            Unit unit = Unit.f17538a;
            anonymousClass1.invokeSuspend(unit);
            return unit;
        }

        /* JADX WARN: Type inference failed for: r4v11, types: [java.lang.Object, kotlin.Lazy] */
        /* JADX WARN: Type inference failed for: r4v16, types: [java.lang.Object, kotlin.Lazy] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            JuspayControllerHost juspayControllerHostC;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            Lazy lazy = MainActivity.this.K0;
            if (lazy.isInitialized() && ((Number) ((AbstractSharedFlow) ((RazorpaySdk) lazy.getValue()).c).g().getValue()).intValue() >= 1) {
                ((RazorpaySdk) MainActivity.this.K0.getValue()).a().onActivityResult(this.$requestCode, this.$resultCode, this.$data);
            } else {
                Lazy lazy2 = MainActivity.this.F0;
                if (!lazy2.isInitialized() ? false : ((TruecallerSetupHandler) lazy2.getValue()).m()) {
                    ((TruecallerSetupHandler) MainActivity.this.F0.getValue()).h0(this.$requestCode, this.$resultCode, this.$data);
                } else {
                    JuspayControllerHost juspayControllerHostC2 = ((JuspayControllerSetter) MainActivity.this.n0.getValue()).c();
                    if ((juspayControllerHostC2 != null && juspayControllerHostC2.h()) && (juspayControllerHostC = ((JuspayControllerSetter) MainActivity.this.n0.getValue()).c()) != null) {
                        juspayControllerHostC.a(this.$requestCode, this.$resultCode, this.$data);
                    }
                }
            }
            return Unit.f17538a;
        }
    }

    /* JADX WARN: Type inference failed for: r10v0, types: [bh0] */
    /* JADX WARN: Type inference failed for: r11v0, types: [bh0] */
    /* JADX WARN: Type inference failed for: r12v0, types: [bh0] */
    /* JADX WARN: Type inference failed for: r13v0, types: [bh0] */
    /* JADX WARN: Type inference failed for: r14v0, types: [bh0] */
    /* JADX WARN: Type inference failed for: r6v0, types: [bh0] */
    /* JADX WARN: Type inference failed for: r7v0, types: [bh0] */
    /* JADX WARN: Type inference failed for: r8v0, types: [bh0] */
    /* JADX WARN: Type inference failed for: r9v0, types: [bh0] */
    public MainActivity() {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.SYNCHRONIZED;
        this.a0 = LazyKt.a(lazyThreadSafetyMode, new Function0<DeepLinkRuntime>() { // from class: app.chalo.android.MainActivity$special$$inlined$inject$default$1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AndroidKoinScopeExtKt.a(this.f905a).d(Reflection.a(DeepLinkRuntime.class), null, null);
            }
        });
        this.b0 = LazyKt.a(lazyThreadSafetyMode, new Function0<DeepLinkNavigationHandler>() { // from class: app.chalo.android.MainActivity$special$$inlined$inject$default$2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AndroidKoinScopeExtKt.a(this.f916a).d(Reflection.a(DeepLinkNavigationHandler.class), null, null);
            }
        });
        this.c0 = LazyKt.a(lazyThreadSafetyMode, new Function0<AnalyticsContract>() { // from class: app.chalo.android.MainActivity$special$$inlined$inject$default$3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AndroidKoinScopeExtKt.a(this.f927a).d(Reflection.a(AnalyticsContract.class), null, null);
            }
        });
        this.d0 = LazyKt.a(lazyThreadSafetyMode, new Function0<SdkIntegrationPolicyManager>() { // from class: app.chalo.android.MainActivity$special$$inlined$inject$default$4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AndroidKoinScopeExtKt.a(this.f935a).d(Reflection.a(SdkIntegrationPolicyManager.class), null, null);
            }
        });
        this.e0 = LazyKt.a(lazyThreadSafetyMode, new Function0<ExitInterstitialAdManager>() { // from class: app.chalo.android.MainActivity$special$$inlined$inject$default$5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AndroidKoinScopeExtKt.a(this.f936a).d(Reflection.a(ExitInterstitialAdManager.class), null, null);
            }
        });
        this.f0 = LazyKt.a(lazyThreadSafetyMode, new Function0<ExitInterstitialCapStore>() { // from class: app.chalo.android.MainActivity$special$$inlined$inject$default$6
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AndroidKoinScopeExtKt.a(this.f937a).d(Reflection.a(ExitInterstitialCapStore.class), null, null);
            }
        });
        this.g0 = LazyKt.a(lazyThreadSafetyMode, new Function0<ExitInterstitialConfigProvider>() { // from class: app.chalo.android.MainActivity$special$$inlined$inject$default$7
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AndroidKoinScopeExtKt.a(this.f938a).d(Reflection.a(ExitInterstitialConfigProvider.class), null, null);
            }
        });
        this.h0 = LazyKt.a(lazyThreadSafetyMode, new Function0<ExitInterstitialDecisionEngine>() { // from class: app.chalo.android.MainActivity$special$$inlined$inject$default$8
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AndroidKoinScopeExtKt.a(this.f939a).d(Reflection.a(ExitInterstitialDecisionEngine.class), null, null);
            }
        });
        this.i0 = LazyKt.a(lazyThreadSafetyMode, new Function0<AppRatingProcessManagerSetter>() { // from class: app.chalo.android.MainActivity$special$$inlined$inject$default$9
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AndroidKoinScopeExtKt.a(this.f940a).d(Reflection.a(AppRatingProcessManagerSetter.class), null, null);
            }
        });
        this.j0 = LazyKt.a(lazyThreadSafetyMode, new Function0<BasicInfoContract>() { // from class: app.chalo.android.MainActivity$special$$inlined$inject$default$10
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AndroidKoinScopeExtKt.a(this.f906a).d(Reflection.a(BasicInfoContract.class), null, null);
            }
        });
        this.k0 = LazyKt.a(lazyThreadSafetyMode, new Function0<CoroutineContextProvider>() { // from class: app.chalo.android.MainActivity$special$$inlined$inject$default$11
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AndroidKoinScopeExtKt.a(this.f907a).d(Reflection.a(CoroutineContextProvider.class), null, null);
            }
        });
        this.l0 = LazyKt.a(lazyThreadSafetyMode, new Function0<GetDeviceNFCStateUseCase>() { // from class: app.chalo.android.MainActivity$special$$inlined$inject$default$12
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AndroidKoinScopeExtKt.a(this.f908a).d(Reflection.a(GetDeviceNFCStateUseCase.class), null, null);
            }
        });
        this.m0 = LazyKt.a(lazyThreadSafetyMode, new Function0<GpsRequestHandlerSetter>() { // from class: app.chalo.android.MainActivity$special$$inlined$inject$default$13
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AndroidKoinScopeExtKt.a(this.f909a).d(Reflection.a(GpsRequestHandlerSetter.class), null, null);
            }
        });
        this.n0 = LazyKt.a(lazyThreadSafetyMode, new Function0<JuspayControllerSetter>() { // from class: app.chalo.android.MainActivity$special$$inlined$inject$default$14
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AndroidKoinScopeExtKt.a(this.f910a).d(Reflection.a(JuspayControllerSetter.class), null, null);
            }
        });
        this.o0 = LazyKt.a(lazyThreadSafetyMode, new Function0<JuspayControllerProvider>() { // from class: app.chalo.android.MainActivity$special$$inlined$inject$default$15
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AndroidKoinScopeExtKt.a(this.f911a).d(Reflection.a(JuspayControllerProvider.class), null, null);
            }
        });
        this.p0 = LazyKt.a(lazyThreadSafetyMode, new Function0<ImagePickerSetter>() { // from class: app.chalo.android.MainActivity$special$$inlined$inject$default$16
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AndroidKoinScopeExtKt.a(this.f912a).d(Reflection.a(ImagePickerSetter.class), null, null);
            }
        });
        this.q0 = LazyKt.a(lazyThreadSafetyMode, new Function0<InstalledUpiAppsHelperSetter>() { // from class: app.chalo.android.MainActivity$special$$inlined$inject$default$17
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AndroidKoinScopeExtKt.a(this.f913a).d(Reflection.a(InstalledUpiAppsHelperSetter.class), null, null);
            }
        });
        this.r0 = LazyKt.a(lazyThreadSafetyMode, new Function0<ManualBluetoothTurnOnDelegateProvider>() { // from class: app.chalo.android.MainActivity$special$$inlined$inject$default$18
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AndroidKoinScopeExtKt.a(this.f914a).d(Reflection.a(ManualBluetoothTurnOnDelegateProvider.class), null, null);
            }
        });
        this.s0 = LazyKt.a(lazyThreadSafetyMode, new Function0<PermissionHandlerSetter>() { // from class: app.chalo.android.MainActivity$special$$inlined$inject$default$19
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AndroidKoinScopeExtKt.a(this.f915a).d(Reflection.a(PermissionHandlerSetter.class), null, null);
            }
        });
        this.t0 = LazyKt.a(lazyThreadSafetyMode, new Function0<PhonepeSdkSetter>() { // from class: app.chalo.android.MainActivity$special$$inlined$inject$default$20
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AndroidKoinScopeExtKt.a(this.f917a).d(Reflection.a(PhonepeSdkSetter.class), null, null);
            }
        });
        this.u0 = LazyKt.a(lazyThreadSafetyMode, new Function0<PhonepeSdkManager>() { // from class: app.chalo.android.MainActivity$special$$inlined$inject$default$21
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AndroidKoinScopeExtKt.a(this.f918a).d(Reflection.a(PhonepeSdkManager.class), null, null);
            }
        });
        this.v0 = LazyKt.a(lazyThreadSafetyMode, new Function0<PhoneNumberHintHandlerSetter>() { // from class: app.chalo.android.MainActivity$special$$inlined$inject$default$22
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AndroidKoinScopeExtKt.a(this.f919a).d(Reflection.a(PhoneNumberHintHandlerSetter.class), null, null);
            }
        });
        this.w0 = LazyKt.a(lazyThreadSafetyMode, new Function0<RazorpaySdkSetter>() { // from class: app.chalo.android.MainActivity$special$$inlined$inject$default$23
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AndroidKoinScopeExtKt.a(this.f920a).d(Reflection.a(RazorpaySdkSetter.class), null, null);
            }
        });
        this.x0 = LazyKt.a(lazyThreadSafetyMode, new Function0<TruecallerSetupHandlerProvider>() { // from class: app.chalo.android.MainActivity$special$$inlined$inject$default$24
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AndroidKoinScopeExtKt.a(this.f921a).d(Reflection.a(TruecallerSetupHandlerProvider.class), null, null);
            }
        });
        this.y0 = LazyKt.a(lazyThreadSafetyMode, new Function0<UvikSdkManagerProvider>() { // from class: app.chalo.android.MainActivity$special$$inlined$inject$default$25
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AndroidKoinScopeExtKt.a(this.f922a).d(Reflection.a(UvikSdkManagerProvider.class), null, null);
            }
        });
        this.z0 = LazyKt.a(lazyThreadSafetyMode, new Function0<SosFeaturePlatformDelegateProviderImpl>() { // from class: app.chalo.android.MainActivity$special$$inlined$inject$default$26
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AndroidKoinScopeExtKt.a(this.f923a).d(Reflection.a(SosFeaturePlatformDelegateProviderImpl.class), null, null);
            }
        });
        this.A0 = LazyKt.a(lazyThreadSafetyMode, new Function0<GetRootCheckRemoteConfigUseCase>() { // from class: app.chalo.android.MainActivity$special$$inlined$inject$default$27
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AndroidKoinScopeExtKt.a(this.f924a).d(Reflection.a(GetRootCheckRemoteConfigUseCase.class), null, null);
            }
        });
        Lazy lazyA = LazyKt.a(lazyThreadSafetyMode, new Function0<CrashlyticsLogger>() { // from class: app.chalo.android.MainActivity$special$$inlined$inject$default$28
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AndroidKoinScopeExtKt.a(this.f925a).d(Reflection.a(CrashlyticsLogger.class), null, null);
            }
        });
        this.B0 = lazyA;
        this.C0 = LazyKt.a(lazyThreadSafetyMode, new Function0<ThoughtNudgeContract>() { // from class: app.chalo.android.MainActivity$special$$inlined$inject$default$29
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AndroidKoinScopeExtKt.a(this.f926a).d(Reflection.a(ThoughtNudgeContract.class), null, null);
            }
        });
        this.D0 = LazyKt.a(lazyThreadSafetyMode, new Function0<DeviceNfcTapPaySuppressorSetter>() { // from class: app.chalo.android.MainActivity$special$$inlined$inject$default$30
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AndroidKoinScopeExtKt.a(this.f928a).d(Reflection.a(DeviceNfcTapPaySuppressorSetter.class), null, null);
            }
        });
        CrashlyticsLogger crashlyticsLogger = (CrashlyticsLogger) lazyA.getValue();
        final int i = 0;
        ?? r6 = new ActivityResultCallback(this) { // from class: bh0
            public final /* synthetic */ MainActivity b;

            {
                this.b = this;
            }

            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                int i2 = i;
                MainActivity mainActivity = this.b;
                switch (i2) {
                    case 0:
                        ActivityResult it = (ActivityResult) obj;
                        AtomicInteger atomicInteger = MainActivity.o1;
                        Intrinsics.i(it, "it");
                        SharedFlowImpl sharedFlowImpl = ((UvikSdkManagerAndroid) mainActivity.J0.getValue()).f;
                        int resultCode = it.getResultCode();
                        Intent data = it.getData();
                        String message = "UvikSdkManagerAndroid: Activity result received: " + resultCode + " - " + (data != null ? data.getExtras() : null);
                        Intrinsics.i(message, "message");
                        try {
                            UvikResult uvikResultA = UvikSdkManager_androidKt.a(it);
                            String message2 = "UvikSdkManagerAndroid: uvikResult " + uvikResultA;
                            Intrinsics.i(message2, "message");
                            sharedFlowImpl.f(uvikResultA);
                        } catch (Exception e) {
                            sharedFlowImpl.f(new UvikResult.Failure.ResultUnavailable(e.getMessage()));
                            return;
                        }
                        break;
                    case 1:
                        ActivityResult it2 = (ActivityResult) obj;
                        AtomicInteger atomicInteger2 = MainActivity.o1;
                        Intrinsics.i(it2, "it");
                        ((InstalledUpiAppsHelperAndroid) mainActivity.L0.getValue()).f(it2);
                        break;
                    case 2:
                        ActivityResult it3 = (ActivityResult) obj;
                        AtomicInteger atomicInteger3 = MainActivity.o1;
                        Intrinsics.i(it3, "it");
                        ImagePickerAndroid imagePickerAndroid = (ImagePickerAndroid) mainActivity.H0.getValue();
                        imagePickerAndroid.getClass();
                        Function1 function1 = imagePickerAndroid.d;
                        if (function1 != null) {
                            function1.invoke(it3);
                        }
                        break;
                    case 3:
                        CropImageView.CropResult it4 = (CropImageView.CropResult) obj;
                        AtomicInteger atomicInteger4 = MainActivity.o1;
                        Intrinsics.i(it4, "it");
                        ImagePickerAndroid imagePickerAndroid2 = (ImagePickerAndroid) mainActivity.H0.getValue();
                        imagePickerAndroid2.getClass();
                        Function1 function2 = imagePickerAndroid2.e;
                        if (function2 != null) {
                            function2.invoke(it4);
                        }
                        break;
                    case 4:
                        ActivityResult it5 = (ActivityResult) obj;
                        AtomicInteger atomicInteger5 = MainActivity.o1;
                        Intrinsics.i(it5, "it");
                        AndroidPhoneNumberHintHandler androidPhoneNumberHintHandler = (AndroidPhoneNumberHintHandler) mainActivity.I0.getValue();
                        SharedFlowImpl sharedFlowImpl2 = androidPhoneNumberHintHandler.d;
                        try {
                            String phoneNumberFromIntent = ((SignInClient) androidPhoneNumberHintHandler.c.getValue()).getPhoneNumberFromIntent(it5.getData());
                            Intrinsics.h(phoneNumberFromIntent, "getPhoneNumberFromIntent(...)");
                            sharedFlowImpl2.f(new PhoneNumberHintResult.Success(phoneNumberFromIntent));
                        } catch (ApiException e2) {
                            sharedFlowImpl2.f(new PhoneNumberHintResult.NoValidPhoneNumber(e2.getMessage()));
                            return;
                        } catch (Exception e3) {
                            sharedFlowImpl2.f(new PhoneNumberHintResult.UnknownException(e3));
                            return;
                        }
                        break;
                    case 5:
                        Map it6 = (Map) obj;
                        AtomicInteger atomicInteger6 = MainActivity.o1;
                        Intrinsics.i(it6, "it");
                        ((PermissionHandlerAndroid) mainActivity.G0.getValue()).e(it6);
                        break;
                    case 6:
                        ActivityResult it7 = (ActivityResult) obj;
                        AtomicInteger atomicInteger7 = MainActivity.o1;
                        Intrinsics.i(it7, "it");
                        ((GpsRequestHandlerAndroid) mainActivity.O0.getValue()).b(it7);
                        break;
                    case 7:
                        ActivityResult it8 = (ActivityResult) obj;
                        AtomicInteger atomicInteger8 = MainActivity.o1;
                        Intrinsics.i(it8, "it");
                        ManualBluetoothTurnOnDelegateAndroid manualBluetoothTurnOnDelegateAndroid = (ManualBluetoothTurnOnDelegateAndroid) mainActivity.P0.getValue();
                        manualBluetoothTurnOnDelegateAndroid.getClass();
                        boolean z = it8.getResultCode() == 0;
                        Function1 function3 = manualBluetoothTurnOnDelegateAndroid.b;
                        if (function3 != null) {
                            function3.invoke(Boolean.valueOf(!z));
                        }
                        break;
                    default:
                        ActivityResult it9 = (ActivityResult) obj;
                        AtomicInteger atomicInteger9 = MainActivity.o1;
                        Intrinsics.i(it9, "it");
                        SosFeaturePlatformDelegateAndroid sosFeaturePlatformDelegateAndroid = (SosFeaturePlatformDelegateAndroid) mainActivity.Q0.getValue();
                        sosFeaturePlatformDelegateAndroid.getClass();
                        Function1 function4 = sosFeaturePlatformDelegateAndroid.d;
                        if (function4 != null) {
                            function4.invoke(it9);
                        }
                        break;
                }
            }
        };
        final int i2 = 1;
        ?? r7 = new ActivityResultCallback(this) { // from class: bh0
            public final /* synthetic */ MainActivity b;

            {
                this.b = this;
            }

            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                int i3 = i2;
                MainActivity mainActivity = this.b;
                switch (i3) {
                    case 0:
                        ActivityResult it = (ActivityResult) obj;
                        AtomicInteger atomicInteger = MainActivity.o1;
                        Intrinsics.i(it, "it");
                        SharedFlowImpl sharedFlowImpl = ((UvikSdkManagerAndroid) mainActivity.J0.getValue()).f;
                        int resultCode = it.getResultCode();
                        Intent data = it.getData();
                        String message = "UvikSdkManagerAndroid: Activity result received: " + resultCode + " - " + (data != null ? data.getExtras() : null);
                        Intrinsics.i(message, "message");
                        try {
                            UvikResult uvikResultA = UvikSdkManager_androidKt.a(it);
                            String message2 = "UvikSdkManagerAndroid: uvikResult " + uvikResultA;
                            Intrinsics.i(message2, "message");
                            sharedFlowImpl.f(uvikResultA);
                        } catch (Exception e) {
                            sharedFlowImpl.f(new UvikResult.Failure.ResultUnavailable(e.getMessage()));
                            return;
                        }
                        break;
                    case 1:
                        ActivityResult it2 = (ActivityResult) obj;
                        AtomicInteger atomicInteger2 = MainActivity.o1;
                        Intrinsics.i(it2, "it");
                        ((InstalledUpiAppsHelperAndroid) mainActivity.L0.getValue()).f(it2);
                        break;
                    case 2:
                        ActivityResult it3 = (ActivityResult) obj;
                        AtomicInteger atomicInteger3 = MainActivity.o1;
                        Intrinsics.i(it3, "it");
                        ImagePickerAndroid imagePickerAndroid = (ImagePickerAndroid) mainActivity.H0.getValue();
                        imagePickerAndroid.getClass();
                        Function1 function1 = imagePickerAndroid.d;
                        if (function1 != null) {
                            function1.invoke(it3);
                        }
                        break;
                    case 3:
                        CropImageView.CropResult it4 = (CropImageView.CropResult) obj;
                        AtomicInteger atomicInteger4 = MainActivity.o1;
                        Intrinsics.i(it4, "it");
                        ImagePickerAndroid imagePickerAndroid2 = (ImagePickerAndroid) mainActivity.H0.getValue();
                        imagePickerAndroid2.getClass();
                        Function1 function2 = imagePickerAndroid2.e;
                        if (function2 != null) {
                            function2.invoke(it4);
                        }
                        break;
                    case 4:
                        ActivityResult it5 = (ActivityResult) obj;
                        AtomicInteger atomicInteger5 = MainActivity.o1;
                        Intrinsics.i(it5, "it");
                        AndroidPhoneNumberHintHandler androidPhoneNumberHintHandler = (AndroidPhoneNumberHintHandler) mainActivity.I0.getValue();
                        SharedFlowImpl sharedFlowImpl2 = androidPhoneNumberHintHandler.d;
                        try {
                            String phoneNumberFromIntent = ((SignInClient) androidPhoneNumberHintHandler.c.getValue()).getPhoneNumberFromIntent(it5.getData());
                            Intrinsics.h(phoneNumberFromIntent, "getPhoneNumberFromIntent(...)");
                            sharedFlowImpl2.f(new PhoneNumberHintResult.Success(phoneNumberFromIntent));
                        } catch (ApiException e2) {
                            sharedFlowImpl2.f(new PhoneNumberHintResult.NoValidPhoneNumber(e2.getMessage()));
                            return;
                        } catch (Exception e3) {
                            sharedFlowImpl2.f(new PhoneNumberHintResult.UnknownException(e3));
                            return;
                        }
                        break;
                    case 5:
                        Map it6 = (Map) obj;
                        AtomicInteger atomicInteger6 = MainActivity.o1;
                        Intrinsics.i(it6, "it");
                        ((PermissionHandlerAndroid) mainActivity.G0.getValue()).e(it6);
                        break;
                    case 6:
                        ActivityResult it7 = (ActivityResult) obj;
                        AtomicInteger atomicInteger7 = MainActivity.o1;
                        Intrinsics.i(it7, "it");
                        ((GpsRequestHandlerAndroid) mainActivity.O0.getValue()).b(it7);
                        break;
                    case 7:
                        ActivityResult it8 = (ActivityResult) obj;
                        AtomicInteger atomicInteger8 = MainActivity.o1;
                        Intrinsics.i(it8, "it");
                        ManualBluetoothTurnOnDelegateAndroid manualBluetoothTurnOnDelegateAndroid = (ManualBluetoothTurnOnDelegateAndroid) mainActivity.P0.getValue();
                        manualBluetoothTurnOnDelegateAndroid.getClass();
                        boolean z = it8.getResultCode() == 0;
                        Function1 function3 = manualBluetoothTurnOnDelegateAndroid.b;
                        if (function3 != null) {
                            function3.invoke(Boolean.valueOf(!z));
                        }
                        break;
                    default:
                        ActivityResult it9 = (ActivityResult) obj;
                        AtomicInteger atomicInteger9 = MainActivity.o1;
                        Intrinsics.i(it9, "it");
                        SosFeaturePlatformDelegateAndroid sosFeaturePlatformDelegateAndroid = (SosFeaturePlatformDelegateAndroid) mainActivity.Q0.getValue();
                        sosFeaturePlatformDelegateAndroid.getClass();
                        Function1 function4 = sosFeaturePlatformDelegateAndroid.d;
                        if (function4 != null) {
                            function4.invoke(it9);
                        }
                        break;
                }
            }
        };
        final int i3 = 2;
        ?? r8 = new ActivityResultCallback(this) { // from class: bh0
            public final /* synthetic */ MainActivity b;

            {
                this.b = this;
            }

            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                int i4 = i3;
                MainActivity mainActivity = this.b;
                switch (i4) {
                    case 0:
                        ActivityResult it = (ActivityResult) obj;
                        AtomicInteger atomicInteger = MainActivity.o1;
                        Intrinsics.i(it, "it");
                        SharedFlowImpl sharedFlowImpl = ((UvikSdkManagerAndroid) mainActivity.J0.getValue()).f;
                        int resultCode = it.getResultCode();
                        Intent data = it.getData();
                        String message = "UvikSdkManagerAndroid: Activity result received: " + resultCode + " - " + (data != null ? data.getExtras() : null);
                        Intrinsics.i(message, "message");
                        try {
                            UvikResult uvikResultA = UvikSdkManager_androidKt.a(it);
                            String message2 = "UvikSdkManagerAndroid: uvikResult " + uvikResultA;
                            Intrinsics.i(message2, "message");
                            sharedFlowImpl.f(uvikResultA);
                        } catch (Exception e) {
                            sharedFlowImpl.f(new UvikResult.Failure.ResultUnavailable(e.getMessage()));
                            return;
                        }
                        break;
                    case 1:
                        ActivityResult it2 = (ActivityResult) obj;
                        AtomicInteger atomicInteger2 = MainActivity.o1;
                        Intrinsics.i(it2, "it");
                        ((InstalledUpiAppsHelperAndroid) mainActivity.L0.getValue()).f(it2);
                        break;
                    case 2:
                        ActivityResult it3 = (ActivityResult) obj;
                        AtomicInteger atomicInteger3 = MainActivity.o1;
                        Intrinsics.i(it3, "it");
                        ImagePickerAndroid imagePickerAndroid = (ImagePickerAndroid) mainActivity.H0.getValue();
                        imagePickerAndroid.getClass();
                        Function1 function1 = imagePickerAndroid.d;
                        if (function1 != null) {
                            function1.invoke(it3);
                        }
                        break;
                    case 3:
                        CropImageView.CropResult it4 = (CropImageView.CropResult) obj;
                        AtomicInteger atomicInteger4 = MainActivity.o1;
                        Intrinsics.i(it4, "it");
                        ImagePickerAndroid imagePickerAndroid2 = (ImagePickerAndroid) mainActivity.H0.getValue();
                        imagePickerAndroid2.getClass();
                        Function1 function2 = imagePickerAndroid2.e;
                        if (function2 != null) {
                            function2.invoke(it4);
                        }
                        break;
                    case 4:
                        ActivityResult it5 = (ActivityResult) obj;
                        AtomicInteger atomicInteger5 = MainActivity.o1;
                        Intrinsics.i(it5, "it");
                        AndroidPhoneNumberHintHandler androidPhoneNumberHintHandler = (AndroidPhoneNumberHintHandler) mainActivity.I0.getValue();
                        SharedFlowImpl sharedFlowImpl2 = androidPhoneNumberHintHandler.d;
                        try {
                            String phoneNumberFromIntent = ((SignInClient) androidPhoneNumberHintHandler.c.getValue()).getPhoneNumberFromIntent(it5.getData());
                            Intrinsics.h(phoneNumberFromIntent, "getPhoneNumberFromIntent(...)");
                            sharedFlowImpl2.f(new PhoneNumberHintResult.Success(phoneNumberFromIntent));
                        } catch (ApiException e2) {
                            sharedFlowImpl2.f(new PhoneNumberHintResult.NoValidPhoneNumber(e2.getMessage()));
                            return;
                        } catch (Exception e3) {
                            sharedFlowImpl2.f(new PhoneNumberHintResult.UnknownException(e3));
                            return;
                        }
                        break;
                    case 5:
                        Map it6 = (Map) obj;
                        AtomicInteger atomicInteger6 = MainActivity.o1;
                        Intrinsics.i(it6, "it");
                        ((PermissionHandlerAndroid) mainActivity.G0.getValue()).e(it6);
                        break;
                    case 6:
                        ActivityResult it7 = (ActivityResult) obj;
                        AtomicInteger atomicInteger7 = MainActivity.o1;
                        Intrinsics.i(it7, "it");
                        ((GpsRequestHandlerAndroid) mainActivity.O0.getValue()).b(it7);
                        break;
                    case 7:
                        ActivityResult it8 = (ActivityResult) obj;
                        AtomicInteger atomicInteger8 = MainActivity.o1;
                        Intrinsics.i(it8, "it");
                        ManualBluetoothTurnOnDelegateAndroid manualBluetoothTurnOnDelegateAndroid = (ManualBluetoothTurnOnDelegateAndroid) mainActivity.P0.getValue();
                        manualBluetoothTurnOnDelegateAndroid.getClass();
                        boolean z = it8.getResultCode() == 0;
                        Function1 function3 = manualBluetoothTurnOnDelegateAndroid.b;
                        if (function3 != null) {
                            function3.invoke(Boolean.valueOf(!z));
                        }
                        break;
                    default:
                        ActivityResult it9 = (ActivityResult) obj;
                        AtomicInteger atomicInteger9 = MainActivity.o1;
                        Intrinsics.i(it9, "it");
                        SosFeaturePlatformDelegateAndroid sosFeaturePlatformDelegateAndroid = (SosFeaturePlatformDelegateAndroid) mainActivity.Q0.getValue();
                        sosFeaturePlatformDelegateAndroid.getClass();
                        Function1 function4 = sosFeaturePlatformDelegateAndroid.d;
                        if (function4 != null) {
                            function4.invoke(it9);
                        }
                        break;
                }
            }
        };
        final int i4 = 3;
        ?? r9 = new ActivityResultCallback(this) { // from class: bh0
            public final /* synthetic */ MainActivity b;

            {
                this.b = this;
            }

            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                int i5 = i4;
                MainActivity mainActivity = this.b;
                switch (i5) {
                    case 0:
                        ActivityResult it = (ActivityResult) obj;
                        AtomicInteger atomicInteger = MainActivity.o1;
                        Intrinsics.i(it, "it");
                        SharedFlowImpl sharedFlowImpl = ((UvikSdkManagerAndroid) mainActivity.J0.getValue()).f;
                        int resultCode = it.getResultCode();
                        Intent data = it.getData();
                        String message = "UvikSdkManagerAndroid: Activity result received: " + resultCode + " - " + (data != null ? data.getExtras() : null);
                        Intrinsics.i(message, "message");
                        try {
                            UvikResult uvikResultA = UvikSdkManager_androidKt.a(it);
                            String message2 = "UvikSdkManagerAndroid: uvikResult " + uvikResultA;
                            Intrinsics.i(message2, "message");
                            sharedFlowImpl.f(uvikResultA);
                        } catch (Exception e) {
                            sharedFlowImpl.f(new UvikResult.Failure.ResultUnavailable(e.getMessage()));
                            return;
                        }
                        break;
                    case 1:
                        ActivityResult it2 = (ActivityResult) obj;
                        AtomicInteger atomicInteger2 = MainActivity.o1;
                        Intrinsics.i(it2, "it");
                        ((InstalledUpiAppsHelperAndroid) mainActivity.L0.getValue()).f(it2);
                        break;
                    case 2:
                        ActivityResult it3 = (ActivityResult) obj;
                        AtomicInteger atomicInteger3 = MainActivity.o1;
                        Intrinsics.i(it3, "it");
                        ImagePickerAndroid imagePickerAndroid = (ImagePickerAndroid) mainActivity.H0.getValue();
                        imagePickerAndroid.getClass();
                        Function1 function1 = imagePickerAndroid.d;
                        if (function1 != null) {
                            function1.invoke(it3);
                        }
                        break;
                    case 3:
                        CropImageView.CropResult it4 = (CropImageView.CropResult) obj;
                        AtomicInteger atomicInteger4 = MainActivity.o1;
                        Intrinsics.i(it4, "it");
                        ImagePickerAndroid imagePickerAndroid2 = (ImagePickerAndroid) mainActivity.H0.getValue();
                        imagePickerAndroid2.getClass();
                        Function1 function2 = imagePickerAndroid2.e;
                        if (function2 != null) {
                            function2.invoke(it4);
                        }
                        break;
                    case 4:
                        ActivityResult it5 = (ActivityResult) obj;
                        AtomicInteger atomicInteger5 = MainActivity.o1;
                        Intrinsics.i(it5, "it");
                        AndroidPhoneNumberHintHandler androidPhoneNumberHintHandler = (AndroidPhoneNumberHintHandler) mainActivity.I0.getValue();
                        SharedFlowImpl sharedFlowImpl2 = androidPhoneNumberHintHandler.d;
                        try {
                            String phoneNumberFromIntent = ((SignInClient) androidPhoneNumberHintHandler.c.getValue()).getPhoneNumberFromIntent(it5.getData());
                            Intrinsics.h(phoneNumberFromIntent, "getPhoneNumberFromIntent(...)");
                            sharedFlowImpl2.f(new PhoneNumberHintResult.Success(phoneNumberFromIntent));
                        } catch (ApiException e2) {
                            sharedFlowImpl2.f(new PhoneNumberHintResult.NoValidPhoneNumber(e2.getMessage()));
                            return;
                        } catch (Exception e3) {
                            sharedFlowImpl2.f(new PhoneNumberHintResult.UnknownException(e3));
                            return;
                        }
                        break;
                    case 5:
                        Map it6 = (Map) obj;
                        AtomicInteger atomicInteger6 = MainActivity.o1;
                        Intrinsics.i(it6, "it");
                        ((PermissionHandlerAndroid) mainActivity.G0.getValue()).e(it6);
                        break;
                    case 6:
                        ActivityResult it7 = (ActivityResult) obj;
                        AtomicInteger atomicInteger7 = MainActivity.o1;
                        Intrinsics.i(it7, "it");
                        ((GpsRequestHandlerAndroid) mainActivity.O0.getValue()).b(it7);
                        break;
                    case 7:
                        ActivityResult it8 = (ActivityResult) obj;
                        AtomicInteger atomicInteger8 = MainActivity.o1;
                        Intrinsics.i(it8, "it");
                        ManualBluetoothTurnOnDelegateAndroid manualBluetoothTurnOnDelegateAndroid = (ManualBluetoothTurnOnDelegateAndroid) mainActivity.P0.getValue();
                        manualBluetoothTurnOnDelegateAndroid.getClass();
                        boolean z = it8.getResultCode() == 0;
                        Function1 function3 = manualBluetoothTurnOnDelegateAndroid.b;
                        if (function3 != null) {
                            function3.invoke(Boolean.valueOf(!z));
                        }
                        break;
                    default:
                        ActivityResult it9 = (ActivityResult) obj;
                        AtomicInteger atomicInteger9 = MainActivity.o1;
                        Intrinsics.i(it9, "it");
                        SosFeaturePlatformDelegateAndroid sosFeaturePlatformDelegateAndroid = (SosFeaturePlatformDelegateAndroid) mainActivity.Q0.getValue();
                        sosFeaturePlatformDelegateAndroid.getClass();
                        Function1 function4 = sosFeaturePlatformDelegateAndroid.d;
                        if (function4 != null) {
                            function4.invoke(it9);
                        }
                        break;
                }
            }
        };
        final int i5 = 4;
        ?? r10 = new ActivityResultCallback(this) { // from class: bh0
            public final /* synthetic */ MainActivity b;

            {
                this.b = this;
            }

            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                int i6 = i5;
                MainActivity mainActivity = this.b;
                switch (i6) {
                    case 0:
                        ActivityResult it = (ActivityResult) obj;
                        AtomicInteger atomicInteger = MainActivity.o1;
                        Intrinsics.i(it, "it");
                        SharedFlowImpl sharedFlowImpl = ((UvikSdkManagerAndroid) mainActivity.J0.getValue()).f;
                        int resultCode = it.getResultCode();
                        Intent data = it.getData();
                        String message = "UvikSdkManagerAndroid: Activity result received: " + resultCode + " - " + (data != null ? data.getExtras() : null);
                        Intrinsics.i(message, "message");
                        try {
                            UvikResult uvikResultA = UvikSdkManager_androidKt.a(it);
                            String message2 = "UvikSdkManagerAndroid: uvikResult " + uvikResultA;
                            Intrinsics.i(message2, "message");
                            sharedFlowImpl.f(uvikResultA);
                        } catch (Exception e) {
                            sharedFlowImpl.f(new UvikResult.Failure.ResultUnavailable(e.getMessage()));
                            return;
                        }
                        break;
                    case 1:
                        ActivityResult it2 = (ActivityResult) obj;
                        AtomicInteger atomicInteger2 = MainActivity.o1;
                        Intrinsics.i(it2, "it");
                        ((InstalledUpiAppsHelperAndroid) mainActivity.L0.getValue()).f(it2);
                        break;
                    case 2:
                        ActivityResult it3 = (ActivityResult) obj;
                        AtomicInteger atomicInteger3 = MainActivity.o1;
                        Intrinsics.i(it3, "it");
                        ImagePickerAndroid imagePickerAndroid = (ImagePickerAndroid) mainActivity.H0.getValue();
                        imagePickerAndroid.getClass();
                        Function1 function1 = imagePickerAndroid.d;
                        if (function1 != null) {
                            function1.invoke(it3);
                        }
                        break;
                    case 3:
                        CropImageView.CropResult it4 = (CropImageView.CropResult) obj;
                        AtomicInteger atomicInteger4 = MainActivity.o1;
                        Intrinsics.i(it4, "it");
                        ImagePickerAndroid imagePickerAndroid2 = (ImagePickerAndroid) mainActivity.H0.getValue();
                        imagePickerAndroid2.getClass();
                        Function1 function2 = imagePickerAndroid2.e;
                        if (function2 != null) {
                            function2.invoke(it4);
                        }
                        break;
                    case 4:
                        ActivityResult it5 = (ActivityResult) obj;
                        AtomicInteger atomicInteger5 = MainActivity.o1;
                        Intrinsics.i(it5, "it");
                        AndroidPhoneNumberHintHandler androidPhoneNumberHintHandler = (AndroidPhoneNumberHintHandler) mainActivity.I0.getValue();
                        SharedFlowImpl sharedFlowImpl2 = androidPhoneNumberHintHandler.d;
                        try {
                            String phoneNumberFromIntent = ((SignInClient) androidPhoneNumberHintHandler.c.getValue()).getPhoneNumberFromIntent(it5.getData());
                            Intrinsics.h(phoneNumberFromIntent, "getPhoneNumberFromIntent(...)");
                            sharedFlowImpl2.f(new PhoneNumberHintResult.Success(phoneNumberFromIntent));
                        } catch (ApiException e2) {
                            sharedFlowImpl2.f(new PhoneNumberHintResult.NoValidPhoneNumber(e2.getMessage()));
                            return;
                        } catch (Exception e3) {
                            sharedFlowImpl2.f(new PhoneNumberHintResult.UnknownException(e3));
                            return;
                        }
                        break;
                    case 5:
                        Map it6 = (Map) obj;
                        AtomicInteger atomicInteger6 = MainActivity.o1;
                        Intrinsics.i(it6, "it");
                        ((PermissionHandlerAndroid) mainActivity.G0.getValue()).e(it6);
                        break;
                    case 6:
                        ActivityResult it7 = (ActivityResult) obj;
                        AtomicInteger atomicInteger7 = MainActivity.o1;
                        Intrinsics.i(it7, "it");
                        ((GpsRequestHandlerAndroid) mainActivity.O0.getValue()).b(it7);
                        break;
                    case 7:
                        ActivityResult it8 = (ActivityResult) obj;
                        AtomicInteger atomicInteger8 = MainActivity.o1;
                        Intrinsics.i(it8, "it");
                        ManualBluetoothTurnOnDelegateAndroid manualBluetoothTurnOnDelegateAndroid = (ManualBluetoothTurnOnDelegateAndroid) mainActivity.P0.getValue();
                        manualBluetoothTurnOnDelegateAndroid.getClass();
                        boolean z = it8.getResultCode() == 0;
                        Function1 function3 = manualBluetoothTurnOnDelegateAndroid.b;
                        if (function3 != null) {
                            function3.invoke(Boolean.valueOf(!z));
                        }
                        break;
                    default:
                        ActivityResult it9 = (ActivityResult) obj;
                        AtomicInteger atomicInteger9 = MainActivity.o1;
                        Intrinsics.i(it9, "it");
                        SosFeaturePlatformDelegateAndroid sosFeaturePlatformDelegateAndroid = (SosFeaturePlatformDelegateAndroid) mainActivity.Q0.getValue();
                        sosFeaturePlatformDelegateAndroid.getClass();
                        Function1 function4 = sosFeaturePlatformDelegateAndroid.d;
                        if (function4 != null) {
                            function4.invoke(it9);
                        }
                        break;
                }
            }
        };
        final int i6 = 5;
        ?? r11 = new ActivityResultCallback(this) { // from class: bh0
            public final /* synthetic */ MainActivity b;

            {
                this.b = this;
            }

            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                int i7 = i6;
                MainActivity mainActivity = this.b;
                switch (i7) {
                    case 0:
                        ActivityResult it = (ActivityResult) obj;
                        AtomicInteger atomicInteger = MainActivity.o1;
                        Intrinsics.i(it, "it");
                        SharedFlowImpl sharedFlowImpl = ((UvikSdkManagerAndroid) mainActivity.J0.getValue()).f;
                        int resultCode = it.getResultCode();
                        Intent data = it.getData();
                        String message = "UvikSdkManagerAndroid: Activity result received: " + resultCode + " - " + (data != null ? data.getExtras() : null);
                        Intrinsics.i(message, "message");
                        try {
                            UvikResult uvikResultA = UvikSdkManager_androidKt.a(it);
                            String message2 = "UvikSdkManagerAndroid: uvikResult " + uvikResultA;
                            Intrinsics.i(message2, "message");
                            sharedFlowImpl.f(uvikResultA);
                        } catch (Exception e) {
                            sharedFlowImpl.f(new UvikResult.Failure.ResultUnavailable(e.getMessage()));
                            return;
                        }
                        break;
                    case 1:
                        ActivityResult it2 = (ActivityResult) obj;
                        AtomicInteger atomicInteger2 = MainActivity.o1;
                        Intrinsics.i(it2, "it");
                        ((InstalledUpiAppsHelperAndroid) mainActivity.L0.getValue()).f(it2);
                        break;
                    case 2:
                        ActivityResult it3 = (ActivityResult) obj;
                        AtomicInteger atomicInteger3 = MainActivity.o1;
                        Intrinsics.i(it3, "it");
                        ImagePickerAndroid imagePickerAndroid = (ImagePickerAndroid) mainActivity.H0.getValue();
                        imagePickerAndroid.getClass();
                        Function1 function1 = imagePickerAndroid.d;
                        if (function1 != null) {
                            function1.invoke(it3);
                        }
                        break;
                    case 3:
                        CropImageView.CropResult it4 = (CropImageView.CropResult) obj;
                        AtomicInteger atomicInteger4 = MainActivity.o1;
                        Intrinsics.i(it4, "it");
                        ImagePickerAndroid imagePickerAndroid2 = (ImagePickerAndroid) mainActivity.H0.getValue();
                        imagePickerAndroid2.getClass();
                        Function1 function2 = imagePickerAndroid2.e;
                        if (function2 != null) {
                            function2.invoke(it4);
                        }
                        break;
                    case 4:
                        ActivityResult it5 = (ActivityResult) obj;
                        AtomicInteger atomicInteger5 = MainActivity.o1;
                        Intrinsics.i(it5, "it");
                        AndroidPhoneNumberHintHandler androidPhoneNumberHintHandler = (AndroidPhoneNumberHintHandler) mainActivity.I0.getValue();
                        SharedFlowImpl sharedFlowImpl2 = androidPhoneNumberHintHandler.d;
                        try {
                            String phoneNumberFromIntent = ((SignInClient) androidPhoneNumberHintHandler.c.getValue()).getPhoneNumberFromIntent(it5.getData());
                            Intrinsics.h(phoneNumberFromIntent, "getPhoneNumberFromIntent(...)");
                            sharedFlowImpl2.f(new PhoneNumberHintResult.Success(phoneNumberFromIntent));
                        } catch (ApiException e2) {
                            sharedFlowImpl2.f(new PhoneNumberHintResult.NoValidPhoneNumber(e2.getMessage()));
                            return;
                        } catch (Exception e3) {
                            sharedFlowImpl2.f(new PhoneNumberHintResult.UnknownException(e3));
                            return;
                        }
                        break;
                    case 5:
                        Map it6 = (Map) obj;
                        AtomicInteger atomicInteger6 = MainActivity.o1;
                        Intrinsics.i(it6, "it");
                        ((PermissionHandlerAndroid) mainActivity.G0.getValue()).e(it6);
                        break;
                    case 6:
                        ActivityResult it7 = (ActivityResult) obj;
                        AtomicInteger atomicInteger7 = MainActivity.o1;
                        Intrinsics.i(it7, "it");
                        ((GpsRequestHandlerAndroid) mainActivity.O0.getValue()).b(it7);
                        break;
                    case 7:
                        ActivityResult it8 = (ActivityResult) obj;
                        AtomicInteger atomicInteger8 = MainActivity.o1;
                        Intrinsics.i(it8, "it");
                        ManualBluetoothTurnOnDelegateAndroid manualBluetoothTurnOnDelegateAndroid = (ManualBluetoothTurnOnDelegateAndroid) mainActivity.P0.getValue();
                        manualBluetoothTurnOnDelegateAndroid.getClass();
                        boolean z = it8.getResultCode() == 0;
                        Function1 function3 = manualBluetoothTurnOnDelegateAndroid.b;
                        if (function3 != null) {
                            function3.invoke(Boolean.valueOf(!z));
                        }
                        break;
                    default:
                        ActivityResult it9 = (ActivityResult) obj;
                        AtomicInteger atomicInteger9 = MainActivity.o1;
                        Intrinsics.i(it9, "it");
                        SosFeaturePlatformDelegateAndroid sosFeaturePlatformDelegateAndroid = (SosFeaturePlatformDelegateAndroid) mainActivity.Q0.getValue();
                        sosFeaturePlatformDelegateAndroid.getClass();
                        Function1 function4 = sosFeaturePlatformDelegateAndroid.d;
                        if (function4 != null) {
                            function4.invoke(it9);
                        }
                        break;
                }
            }
        };
        final int i7 = 6;
        ?? r12 = new ActivityResultCallback(this) { // from class: bh0
            public final /* synthetic */ MainActivity b;

            {
                this.b = this;
            }

            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                int i8 = i7;
                MainActivity mainActivity = this.b;
                switch (i8) {
                    case 0:
                        ActivityResult it = (ActivityResult) obj;
                        AtomicInteger atomicInteger = MainActivity.o1;
                        Intrinsics.i(it, "it");
                        SharedFlowImpl sharedFlowImpl = ((UvikSdkManagerAndroid) mainActivity.J0.getValue()).f;
                        int resultCode = it.getResultCode();
                        Intent data = it.getData();
                        String message = "UvikSdkManagerAndroid: Activity result received: " + resultCode + " - " + (data != null ? data.getExtras() : null);
                        Intrinsics.i(message, "message");
                        try {
                            UvikResult uvikResultA = UvikSdkManager_androidKt.a(it);
                            String message2 = "UvikSdkManagerAndroid: uvikResult " + uvikResultA;
                            Intrinsics.i(message2, "message");
                            sharedFlowImpl.f(uvikResultA);
                        } catch (Exception e) {
                            sharedFlowImpl.f(new UvikResult.Failure.ResultUnavailable(e.getMessage()));
                            return;
                        }
                        break;
                    case 1:
                        ActivityResult it2 = (ActivityResult) obj;
                        AtomicInteger atomicInteger2 = MainActivity.o1;
                        Intrinsics.i(it2, "it");
                        ((InstalledUpiAppsHelperAndroid) mainActivity.L0.getValue()).f(it2);
                        break;
                    case 2:
                        ActivityResult it3 = (ActivityResult) obj;
                        AtomicInteger atomicInteger3 = MainActivity.o1;
                        Intrinsics.i(it3, "it");
                        ImagePickerAndroid imagePickerAndroid = (ImagePickerAndroid) mainActivity.H0.getValue();
                        imagePickerAndroid.getClass();
                        Function1 function1 = imagePickerAndroid.d;
                        if (function1 != null) {
                            function1.invoke(it3);
                        }
                        break;
                    case 3:
                        CropImageView.CropResult it4 = (CropImageView.CropResult) obj;
                        AtomicInteger atomicInteger4 = MainActivity.o1;
                        Intrinsics.i(it4, "it");
                        ImagePickerAndroid imagePickerAndroid2 = (ImagePickerAndroid) mainActivity.H0.getValue();
                        imagePickerAndroid2.getClass();
                        Function1 function2 = imagePickerAndroid2.e;
                        if (function2 != null) {
                            function2.invoke(it4);
                        }
                        break;
                    case 4:
                        ActivityResult it5 = (ActivityResult) obj;
                        AtomicInteger atomicInteger5 = MainActivity.o1;
                        Intrinsics.i(it5, "it");
                        AndroidPhoneNumberHintHandler androidPhoneNumberHintHandler = (AndroidPhoneNumberHintHandler) mainActivity.I0.getValue();
                        SharedFlowImpl sharedFlowImpl2 = androidPhoneNumberHintHandler.d;
                        try {
                            String phoneNumberFromIntent = ((SignInClient) androidPhoneNumberHintHandler.c.getValue()).getPhoneNumberFromIntent(it5.getData());
                            Intrinsics.h(phoneNumberFromIntent, "getPhoneNumberFromIntent(...)");
                            sharedFlowImpl2.f(new PhoneNumberHintResult.Success(phoneNumberFromIntent));
                        } catch (ApiException e2) {
                            sharedFlowImpl2.f(new PhoneNumberHintResult.NoValidPhoneNumber(e2.getMessage()));
                            return;
                        } catch (Exception e3) {
                            sharedFlowImpl2.f(new PhoneNumberHintResult.UnknownException(e3));
                            return;
                        }
                        break;
                    case 5:
                        Map it6 = (Map) obj;
                        AtomicInteger atomicInteger6 = MainActivity.o1;
                        Intrinsics.i(it6, "it");
                        ((PermissionHandlerAndroid) mainActivity.G0.getValue()).e(it6);
                        break;
                    case 6:
                        ActivityResult it7 = (ActivityResult) obj;
                        AtomicInteger atomicInteger7 = MainActivity.o1;
                        Intrinsics.i(it7, "it");
                        ((GpsRequestHandlerAndroid) mainActivity.O0.getValue()).b(it7);
                        break;
                    case 7:
                        ActivityResult it8 = (ActivityResult) obj;
                        AtomicInteger atomicInteger8 = MainActivity.o1;
                        Intrinsics.i(it8, "it");
                        ManualBluetoothTurnOnDelegateAndroid manualBluetoothTurnOnDelegateAndroid = (ManualBluetoothTurnOnDelegateAndroid) mainActivity.P0.getValue();
                        manualBluetoothTurnOnDelegateAndroid.getClass();
                        boolean z = it8.getResultCode() == 0;
                        Function1 function3 = manualBluetoothTurnOnDelegateAndroid.b;
                        if (function3 != null) {
                            function3.invoke(Boolean.valueOf(!z));
                        }
                        break;
                    default:
                        ActivityResult it9 = (ActivityResult) obj;
                        AtomicInteger atomicInteger9 = MainActivity.o1;
                        Intrinsics.i(it9, "it");
                        SosFeaturePlatformDelegateAndroid sosFeaturePlatformDelegateAndroid = (SosFeaturePlatformDelegateAndroid) mainActivity.Q0.getValue();
                        sosFeaturePlatformDelegateAndroid.getClass();
                        Function1 function4 = sosFeaturePlatformDelegateAndroid.d;
                        if (function4 != null) {
                            function4.invoke(it9);
                        }
                        break;
                }
            }
        };
        final int i8 = 7;
        ?? r13 = new ActivityResultCallback(this) { // from class: bh0
            public final /* synthetic */ MainActivity b;

            {
                this.b = this;
            }

            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                int i9 = i8;
                MainActivity mainActivity = this.b;
                switch (i9) {
                    case 0:
                        ActivityResult it = (ActivityResult) obj;
                        AtomicInteger atomicInteger = MainActivity.o1;
                        Intrinsics.i(it, "it");
                        SharedFlowImpl sharedFlowImpl = ((UvikSdkManagerAndroid) mainActivity.J0.getValue()).f;
                        int resultCode = it.getResultCode();
                        Intent data = it.getData();
                        String message = "UvikSdkManagerAndroid: Activity result received: " + resultCode + " - " + (data != null ? data.getExtras() : null);
                        Intrinsics.i(message, "message");
                        try {
                            UvikResult uvikResultA = UvikSdkManager_androidKt.a(it);
                            String message2 = "UvikSdkManagerAndroid: uvikResult " + uvikResultA;
                            Intrinsics.i(message2, "message");
                            sharedFlowImpl.f(uvikResultA);
                        } catch (Exception e) {
                            sharedFlowImpl.f(new UvikResult.Failure.ResultUnavailable(e.getMessage()));
                            return;
                        }
                        break;
                    case 1:
                        ActivityResult it2 = (ActivityResult) obj;
                        AtomicInteger atomicInteger2 = MainActivity.o1;
                        Intrinsics.i(it2, "it");
                        ((InstalledUpiAppsHelperAndroid) mainActivity.L0.getValue()).f(it2);
                        break;
                    case 2:
                        ActivityResult it3 = (ActivityResult) obj;
                        AtomicInteger atomicInteger3 = MainActivity.o1;
                        Intrinsics.i(it3, "it");
                        ImagePickerAndroid imagePickerAndroid = (ImagePickerAndroid) mainActivity.H0.getValue();
                        imagePickerAndroid.getClass();
                        Function1 function1 = imagePickerAndroid.d;
                        if (function1 != null) {
                            function1.invoke(it3);
                        }
                        break;
                    case 3:
                        CropImageView.CropResult it4 = (CropImageView.CropResult) obj;
                        AtomicInteger atomicInteger4 = MainActivity.o1;
                        Intrinsics.i(it4, "it");
                        ImagePickerAndroid imagePickerAndroid2 = (ImagePickerAndroid) mainActivity.H0.getValue();
                        imagePickerAndroid2.getClass();
                        Function1 function2 = imagePickerAndroid2.e;
                        if (function2 != null) {
                            function2.invoke(it4);
                        }
                        break;
                    case 4:
                        ActivityResult it5 = (ActivityResult) obj;
                        AtomicInteger atomicInteger5 = MainActivity.o1;
                        Intrinsics.i(it5, "it");
                        AndroidPhoneNumberHintHandler androidPhoneNumberHintHandler = (AndroidPhoneNumberHintHandler) mainActivity.I0.getValue();
                        SharedFlowImpl sharedFlowImpl2 = androidPhoneNumberHintHandler.d;
                        try {
                            String phoneNumberFromIntent = ((SignInClient) androidPhoneNumberHintHandler.c.getValue()).getPhoneNumberFromIntent(it5.getData());
                            Intrinsics.h(phoneNumberFromIntent, "getPhoneNumberFromIntent(...)");
                            sharedFlowImpl2.f(new PhoneNumberHintResult.Success(phoneNumberFromIntent));
                        } catch (ApiException e2) {
                            sharedFlowImpl2.f(new PhoneNumberHintResult.NoValidPhoneNumber(e2.getMessage()));
                            return;
                        } catch (Exception e3) {
                            sharedFlowImpl2.f(new PhoneNumberHintResult.UnknownException(e3));
                            return;
                        }
                        break;
                    case 5:
                        Map it6 = (Map) obj;
                        AtomicInteger atomicInteger6 = MainActivity.o1;
                        Intrinsics.i(it6, "it");
                        ((PermissionHandlerAndroid) mainActivity.G0.getValue()).e(it6);
                        break;
                    case 6:
                        ActivityResult it7 = (ActivityResult) obj;
                        AtomicInteger atomicInteger7 = MainActivity.o1;
                        Intrinsics.i(it7, "it");
                        ((GpsRequestHandlerAndroid) mainActivity.O0.getValue()).b(it7);
                        break;
                    case 7:
                        ActivityResult it8 = (ActivityResult) obj;
                        AtomicInteger atomicInteger8 = MainActivity.o1;
                        Intrinsics.i(it8, "it");
                        ManualBluetoothTurnOnDelegateAndroid manualBluetoothTurnOnDelegateAndroid = (ManualBluetoothTurnOnDelegateAndroid) mainActivity.P0.getValue();
                        manualBluetoothTurnOnDelegateAndroid.getClass();
                        boolean z = it8.getResultCode() == 0;
                        Function1 function3 = manualBluetoothTurnOnDelegateAndroid.b;
                        if (function3 != null) {
                            function3.invoke(Boolean.valueOf(!z));
                        }
                        break;
                    default:
                        ActivityResult it9 = (ActivityResult) obj;
                        AtomicInteger atomicInteger9 = MainActivity.o1;
                        Intrinsics.i(it9, "it");
                        SosFeaturePlatformDelegateAndroid sosFeaturePlatformDelegateAndroid = (SosFeaturePlatformDelegateAndroid) mainActivity.Q0.getValue();
                        sosFeaturePlatformDelegateAndroid.getClass();
                        Function1 function4 = sosFeaturePlatformDelegateAndroid.d;
                        if (function4 != null) {
                            function4.invoke(it9);
                        }
                        break;
                }
            }
        };
        final int i9 = 8;
        this.E0 = new ActivityResultContractsHolder(this, crashlyticsLogger, r6, r7, r8, r9, r10, r11, r12, r13, new ActivityResultCallback(this) { // from class: bh0
            public final /* synthetic */ MainActivity b;

            {
                this.b = this;
            }

            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                int i10 = i9;
                MainActivity mainActivity = this.b;
                switch (i10) {
                    case 0:
                        ActivityResult it = (ActivityResult) obj;
                        AtomicInteger atomicInteger = MainActivity.o1;
                        Intrinsics.i(it, "it");
                        SharedFlowImpl sharedFlowImpl = ((UvikSdkManagerAndroid) mainActivity.J0.getValue()).f;
                        int resultCode = it.getResultCode();
                        Intent data = it.getData();
                        String message = "UvikSdkManagerAndroid: Activity result received: " + resultCode + " - " + (data != null ? data.getExtras() : null);
                        Intrinsics.i(message, "message");
                        try {
                            UvikResult uvikResultA = UvikSdkManager_androidKt.a(it);
                            String message2 = "UvikSdkManagerAndroid: uvikResult " + uvikResultA;
                            Intrinsics.i(message2, "message");
                            sharedFlowImpl.f(uvikResultA);
                        } catch (Exception e) {
                            sharedFlowImpl.f(new UvikResult.Failure.ResultUnavailable(e.getMessage()));
                            return;
                        }
                        break;
                    case 1:
                        ActivityResult it2 = (ActivityResult) obj;
                        AtomicInteger atomicInteger2 = MainActivity.o1;
                        Intrinsics.i(it2, "it");
                        ((InstalledUpiAppsHelperAndroid) mainActivity.L0.getValue()).f(it2);
                        break;
                    case 2:
                        ActivityResult it3 = (ActivityResult) obj;
                        AtomicInteger atomicInteger3 = MainActivity.o1;
                        Intrinsics.i(it3, "it");
                        ImagePickerAndroid imagePickerAndroid = (ImagePickerAndroid) mainActivity.H0.getValue();
                        imagePickerAndroid.getClass();
                        Function1 function1 = imagePickerAndroid.d;
                        if (function1 != null) {
                            function1.invoke(it3);
                        }
                        break;
                    case 3:
                        CropImageView.CropResult it4 = (CropImageView.CropResult) obj;
                        AtomicInteger atomicInteger4 = MainActivity.o1;
                        Intrinsics.i(it4, "it");
                        ImagePickerAndroid imagePickerAndroid2 = (ImagePickerAndroid) mainActivity.H0.getValue();
                        imagePickerAndroid2.getClass();
                        Function1 function2 = imagePickerAndroid2.e;
                        if (function2 != null) {
                            function2.invoke(it4);
                        }
                        break;
                    case 4:
                        ActivityResult it5 = (ActivityResult) obj;
                        AtomicInteger atomicInteger5 = MainActivity.o1;
                        Intrinsics.i(it5, "it");
                        AndroidPhoneNumberHintHandler androidPhoneNumberHintHandler = (AndroidPhoneNumberHintHandler) mainActivity.I0.getValue();
                        SharedFlowImpl sharedFlowImpl2 = androidPhoneNumberHintHandler.d;
                        try {
                            String phoneNumberFromIntent = ((SignInClient) androidPhoneNumberHintHandler.c.getValue()).getPhoneNumberFromIntent(it5.getData());
                            Intrinsics.h(phoneNumberFromIntent, "getPhoneNumberFromIntent(...)");
                            sharedFlowImpl2.f(new PhoneNumberHintResult.Success(phoneNumberFromIntent));
                        } catch (ApiException e2) {
                            sharedFlowImpl2.f(new PhoneNumberHintResult.NoValidPhoneNumber(e2.getMessage()));
                            return;
                        } catch (Exception e3) {
                            sharedFlowImpl2.f(new PhoneNumberHintResult.UnknownException(e3));
                            return;
                        }
                        break;
                    case 5:
                        Map it6 = (Map) obj;
                        AtomicInteger atomicInteger6 = MainActivity.o1;
                        Intrinsics.i(it6, "it");
                        ((PermissionHandlerAndroid) mainActivity.G0.getValue()).e(it6);
                        break;
                    case 6:
                        ActivityResult it7 = (ActivityResult) obj;
                        AtomicInteger atomicInteger7 = MainActivity.o1;
                        Intrinsics.i(it7, "it");
                        ((GpsRequestHandlerAndroid) mainActivity.O0.getValue()).b(it7);
                        break;
                    case 7:
                        ActivityResult it8 = (ActivityResult) obj;
                        AtomicInteger atomicInteger8 = MainActivity.o1;
                        Intrinsics.i(it8, "it");
                        ManualBluetoothTurnOnDelegateAndroid manualBluetoothTurnOnDelegateAndroid = (ManualBluetoothTurnOnDelegateAndroid) mainActivity.P0.getValue();
                        manualBluetoothTurnOnDelegateAndroid.getClass();
                        boolean z = it8.getResultCode() == 0;
                        Function1 function3 = manualBluetoothTurnOnDelegateAndroid.b;
                        if (function3 != null) {
                            function3.invoke(Boolean.valueOf(!z));
                        }
                        break;
                    default:
                        ActivityResult it9 = (ActivityResult) obj;
                        AtomicInteger atomicInteger9 = MainActivity.o1;
                        Intrinsics.i(it9, "it");
                        SosFeaturePlatformDelegateAndroid sosFeaturePlatformDelegateAndroid = (SosFeaturePlatformDelegateAndroid) mainActivity.Q0.getValue();
                        sosFeaturePlatformDelegateAndroid.getClass();
                        Function1 function4 = sosFeaturePlatformDelegateAndroid.d;
                        if (function4 != null) {
                            function4.invoke(it9);
                        }
                        break;
                }
            }
        });
        final int i10 = 4;
        this.F0 = LazyKt.b(new Function0(this) { // from class: ch0
            public final /* synthetic */ MainActivity b;

            {
                this.b = this;
            }

            /* JADX WARN: Type inference failed for: r0v39, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i11 = i10;
                MainActivity mainActivity = this.b;
                switch (i11) {
                    case 0:
                        AtomicInteger atomicInteger = MainActivity.o1;
                        return new ManualBluetoothTurnOnDelegateAndroid(new eh0(mainActivity, 4));
                    case 1:
                        AtomicInteger atomicInteger2 = MainActivity.o1;
                        return new SosFeaturePlatformDelegateAndroid(mainActivity, (CrashlyticsLogger) AndroidKoinScopeExtKt.a(mainActivity).d(Reflection.a(CrashlyticsLogger.class), null, null), new eh0(mainActivity, 8));
                    case 2:
                        AtomicInteger atomicInteger3 = MainActivity.o1;
                        return new DeviceNfcTapPaySuppressorAndroid(mainActivity);
                    case 3:
                        AtomicInteger atomicInteger4 = MainActivity.o1;
                        return new PermissionHandlerAndroid(mainActivity, (CoroutineContextProvider) AndroidKoinScopeExtKt.a(mainActivity).d(Reflection.a(CoroutineContextProvider.class), null, null), new eh0(mainActivity, 2));
                    case 4:
                        AtomicInteger atomicInteger5 = MainActivity.o1;
                        return new AndroidTruecallerSetupHandlerImpl(new WeakReference(mainActivity), (CrashlyticsLogger) ComponentCallbackExtKt.a(mainActivity).c.d.d(Reflection.a(CrashlyticsLogger.class), null, null));
                    case 5:
                        AtomicInteger atomicInteger6 = MainActivity.o1;
                        return new ImagePickerAndroid(mainActivity, new eh0(mainActivity, 6), new eh0(mainActivity, 7));
                    case 6:
                        AtomicInteger atomicInteger7 = MainActivity.o1;
                        return new AndroidPhoneNumberHintHandler(mainActivity, new eh0(mainActivity, 1));
                    case 7:
                        return new UvikSdkManagerAndroid(mainActivity, (GetDeviceNFCStateUseCase) mainActivity.l0.getValue(), (BasicInfoContract) mainActivity.j0.getValue(), new eh0(mainActivity, 3));
                    case 8:
                        AtomicInteger atomicInteger8 = MainActivity.o1;
                        return new RazorpaySdk(mainActivity);
                    case 9:
                        AtomicInteger atomicInteger9 = MainActivity.o1;
                        MainActivity mainActivity2 = this.b;
                        return new InstalledUpiAppsHelperAndroid(mainActivity2, (CrashlyticsLogger) AndroidKoinScopeExtKt.a(mainActivity2).d(Reflection.a(CrashlyticsLogger.class), null, null), (AnalyticsContract) AndroidKoinScopeExtKt.a(mainActivity2).d(Reflection.a(AnalyticsContract.class), null, null), (SystemHelper) AndroidKoinScopeExtKt.a(mainActivity2).d(Reflection.a(SystemHelper.class), null, null), (CoroutineContextProvider) AndroidKoinScopeExtKt.a(mainActivity2).d(Reflection.a(CoroutineContextProvider.class), null, null), new eh0(mainActivity2, 5));
                    case 10:
                        AtomicInteger atomicInteger10 = MainActivity.o1;
                        MainActivity mainActivity3 = this.b;
                        return new PhonepeSdkAndroid(mainActivity3, (CrashlyticsLogger) AndroidKoinScopeExtKt.a(mainActivity3).d(Reflection.a(CrashlyticsLogger.class), null, null), (ChaloBuildConfig) AndroidKoinScopeExtKt.a(mainActivity3).d(Reflection.a(ChaloBuildConfig.class), null, null), (InstalledUpiAppsHelperAndroid) mainActivity3.L0.getValue(), (GetDistinctIdUseCase) AndroidKoinScopeExtKt.a(mainActivity3).d(Reflection.a(GetDistinctIdUseCase.class), null, null), (CreatePhonePePaymentModeDataUseCase) AndroidKoinScopeExtKt.a(mainActivity3).d(Reflection.a(CreatePhonePePaymentModeDataUseCase.class), null, null), (PhonepeSdkManager) mainActivity3.u0.getValue(), (CoroutineContextProvider) AndroidKoinScopeExtKt.a(mainActivity3).d(Reflection.a(CoroutineContextProvider.class), null, null));
                    case 11:
                        AtomicInteger atomicInteger11 = MainActivity.o1;
                        return new AppRatingProcessManagerAndroid(mainActivity, mainActivity, (AnalyticsContract) AndroidKoinScopeExtKt.a(mainActivity).d(Reflection.a(AnalyticsContract.class), null, null), (CrashlyticsLogger) AndroidKoinScopeExtKt.a(mainActivity).d(Reflection.a(CrashlyticsLogger.class), null, null));
                    default:
                        AtomicInteger atomicInteger12 = MainActivity.o1;
                        return new GpsRequestHandlerAndroid(new eh0(mainActivity, 0));
                }
            }
        });
        final int i11 = 3;
        this.G0 = LazyKt.b(new Function0(this) { // from class: ch0
            public final /* synthetic */ MainActivity b;

            {
                this.b = this;
            }

            /* JADX WARN: Type inference failed for: r0v39, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i12 = i11;
                MainActivity mainActivity = this.b;
                switch (i12) {
                    case 0:
                        AtomicInteger atomicInteger = MainActivity.o1;
                        return new ManualBluetoothTurnOnDelegateAndroid(new eh0(mainActivity, 4));
                    case 1:
                        AtomicInteger atomicInteger2 = MainActivity.o1;
                        return new SosFeaturePlatformDelegateAndroid(mainActivity, (CrashlyticsLogger) AndroidKoinScopeExtKt.a(mainActivity).d(Reflection.a(CrashlyticsLogger.class), null, null), new eh0(mainActivity, 8));
                    case 2:
                        AtomicInteger atomicInteger3 = MainActivity.o1;
                        return new DeviceNfcTapPaySuppressorAndroid(mainActivity);
                    case 3:
                        AtomicInteger atomicInteger4 = MainActivity.o1;
                        return new PermissionHandlerAndroid(mainActivity, (CoroutineContextProvider) AndroidKoinScopeExtKt.a(mainActivity).d(Reflection.a(CoroutineContextProvider.class), null, null), new eh0(mainActivity, 2));
                    case 4:
                        AtomicInteger atomicInteger5 = MainActivity.o1;
                        return new AndroidTruecallerSetupHandlerImpl(new WeakReference(mainActivity), (CrashlyticsLogger) ComponentCallbackExtKt.a(mainActivity).c.d.d(Reflection.a(CrashlyticsLogger.class), null, null));
                    case 5:
                        AtomicInteger atomicInteger6 = MainActivity.o1;
                        return new ImagePickerAndroid(mainActivity, new eh0(mainActivity, 6), new eh0(mainActivity, 7));
                    case 6:
                        AtomicInteger atomicInteger7 = MainActivity.o1;
                        return new AndroidPhoneNumberHintHandler(mainActivity, new eh0(mainActivity, 1));
                    case 7:
                        return new UvikSdkManagerAndroid(mainActivity, (GetDeviceNFCStateUseCase) mainActivity.l0.getValue(), (BasicInfoContract) mainActivity.j0.getValue(), new eh0(mainActivity, 3));
                    case 8:
                        AtomicInteger atomicInteger8 = MainActivity.o1;
                        return new RazorpaySdk(mainActivity);
                    case 9:
                        AtomicInteger atomicInteger9 = MainActivity.o1;
                        MainActivity mainActivity2 = this.b;
                        return new InstalledUpiAppsHelperAndroid(mainActivity2, (CrashlyticsLogger) AndroidKoinScopeExtKt.a(mainActivity2).d(Reflection.a(CrashlyticsLogger.class), null, null), (AnalyticsContract) AndroidKoinScopeExtKt.a(mainActivity2).d(Reflection.a(AnalyticsContract.class), null, null), (SystemHelper) AndroidKoinScopeExtKt.a(mainActivity2).d(Reflection.a(SystemHelper.class), null, null), (CoroutineContextProvider) AndroidKoinScopeExtKt.a(mainActivity2).d(Reflection.a(CoroutineContextProvider.class), null, null), new eh0(mainActivity2, 5));
                    case 10:
                        AtomicInteger atomicInteger10 = MainActivity.o1;
                        MainActivity mainActivity3 = this.b;
                        return new PhonepeSdkAndroid(mainActivity3, (CrashlyticsLogger) AndroidKoinScopeExtKt.a(mainActivity3).d(Reflection.a(CrashlyticsLogger.class), null, null), (ChaloBuildConfig) AndroidKoinScopeExtKt.a(mainActivity3).d(Reflection.a(ChaloBuildConfig.class), null, null), (InstalledUpiAppsHelperAndroid) mainActivity3.L0.getValue(), (GetDistinctIdUseCase) AndroidKoinScopeExtKt.a(mainActivity3).d(Reflection.a(GetDistinctIdUseCase.class), null, null), (CreatePhonePePaymentModeDataUseCase) AndroidKoinScopeExtKt.a(mainActivity3).d(Reflection.a(CreatePhonePePaymentModeDataUseCase.class), null, null), (PhonepeSdkManager) mainActivity3.u0.getValue(), (CoroutineContextProvider) AndroidKoinScopeExtKt.a(mainActivity3).d(Reflection.a(CoroutineContextProvider.class), null, null));
                    case 11:
                        AtomicInteger atomicInteger11 = MainActivity.o1;
                        return new AppRatingProcessManagerAndroid(mainActivity, mainActivity, (AnalyticsContract) AndroidKoinScopeExtKt.a(mainActivity).d(Reflection.a(AnalyticsContract.class), null, null), (CrashlyticsLogger) AndroidKoinScopeExtKt.a(mainActivity).d(Reflection.a(CrashlyticsLogger.class), null, null));
                    default:
                        AtomicInteger atomicInteger12 = MainActivity.o1;
                        return new GpsRequestHandlerAndroid(new eh0(mainActivity, 0));
                }
            }
        });
        final int i12 = 5;
        this.H0 = LazyKt.b(new Function0(this) { // from class: ch0
            public final /* synthetic */ MainActivity b;

            {
                this.b = this;
            }

            /* JADX WARN: Type inference failed for: r0v39, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i13 = i12;
                MainActivity mainActivity = this.b;
                switch (i13) {
                    case 0:
                        AtomicInteger atomicInteger = MainActivity.o1;
                        return new ManualBluetoothTurnOnDelegateAndroid(new eh0(mainActivity, 4));
                    case 1:
                        AtomicInteger atomicInteger2 = MainActivity.o1;
                        return new SosFeaturePlatformDelegateAndroid(mainActivity, (CrashlyticsLogger) AndroidKoinScopeExtKt.a(mainActivity).d(Reflection.a(CrashlyticsLogger.class), null, null), new eh0(mainActivity, 8));
                    case 2:
                        AtomicInteger atomicInteger3 = MainActivity.o1;
                        return new DeviceNfcTapPaySuppressorAndroid(mainActivity);
                    case 3:
                        AtomicInteger atomicInteger4 = MainActivity.o1;
                        return new PermissionHandlerAndroid(mainActivity, (CoroutineContextProvider) AndroidKoinScopeExtKt.a(mainActivity).d(Reflection.a(CoroutineContextProvider.class), null, null), new eh0(mainActivity, 2));
                    case 4:
                        AtomicInteger atomicInteger5 = MainActivity.o1;
                        return new AndroidTruecallerSetupHandlerImpl(new WeakReference(mainActivity), (CrashlyticsLogger) ComponentCallbackExtKt.a(mainActivity).c.d.d(Reflection.a(CrashlyticsLogger.class), null, null));
                    case 5:
                        AtomicInteger atomicInteger6 = MainActivity.o1;
                        return new ImagePickerAndroid(mainActivity, new eh0(mainActivity, 6), new eh0(mainActivity, 7));
                    case 6:
                        AtomicInteger atomicInteger7 = MainActivity.o1;
                        return new AndroidPhoneNumberHintHandler(mainActivity, new eh0(mainActivity, 1));
                    case 7:
                        return new UvikSdkManagerAndroid(mainActivity, (GetDeviceNFCStateUseCase) mainActivity.l0.getValue(), (BasicInfoContract) mainActivity.j0.getValue(), new eh0(mainActivity, 3));
                    case 8:
                        AtomicInteger atomicInteger8 = MainActivity.o1;
                        return new RazorpaySdk(mainActivity);
                    case 9:
                        AtomicInteger atomicInteger9 = MainActivity.o1;
                        MainActivity mainActivity2 = this.b;
                        return new InstalledUpiAppsHelperAndroid(mainActivity2, (CrashlyticsLogger) AndroidKoinScopeExtKt.a(mainActivity2).d(Reflection.a(CrashlyticsLogger.class), null, null), (AnalyticsContract) AndroidKoinScopeExtKt.a(mainActivity2).d(Reflection.a(AnalyticsContract.class), null, null), (SystemHelper) AndroidKoinScopeExtKt.a(mainActivity2).d(Reflection.a(SystemHelper.class), null, null), (CoroutineContextProvider) AndroidKoinScopeExtKt.a(mainActivity2).d(Reflection.a(CoroutineContextProvider.class), null, null), new eh0(mainActivity2, 5));
                    case 10:
                        AtomicInteger atomicInteger10 = MainActivity.o1;
                        MainActivity mainActivity3 = this.b;
                        return new PhonepeSdkAndroid(mainActivity3, (CrashlyticsLogger) AndroidKoinScopeExtKt.a(mainActivity3).d(Reflection.a(CrashlyticsLogger.class), null, null), (ChaloBuildConfig) AndroidKoinScopeExtKt.a(mainActivity3).d(Reflection.a(ChaloBuildConfig.class), null, null), (InstalledUpiAppsHelperAndroid) mainActivity3.L0.getValue(), (GetDistinctIdUseCase) AndroidKoinScopeExtKt.a(mainActivity3).d(Reflection.a(GetDistinctIdUseCase.class), null, null), (CreatePhonePePaymentModeDataUseCase) AndroidKoinScopeExtKt.a(mainActivity3).d(Reflection.a(CreatePhonePePaymentModeDataUseCase.class), null, null), (PhonepeSdkManager) mainActivity3.u0.getValue(), (CoroutineContextProvider) AndroidKoinScopeExtKt.a(mainActivity3).d(Reflection.a(CoroutineContextProvider.class), null, null));
                    case 11:
                        AtomicInteger atomicInteger11 = MainActivity.o1;
                        return new AppRatingProcessManagerAndroid(mainActivity, mainActivity, (AnalyticsContract) AndroidKoinScopeExtKt.a(mainActivity).d(Reflection.a(AnalyticsContract.class), null, null), (CrashlyticsLogger) AndroidKoinScopeExtKt.a(mainActivity).d(Reflection.a(CrashlyticsLogger.class), null, null));
                    default:
                        AtomicInteger atomicInteger12 = MainActivity.o1;
                        return new GpsRequestHandlerAndroid(new eh0(mainActivity, 0));
                }
            }
        });
        final int i13 = 6;
        this.I0 = LazyKt.b(new Function0(this) { // from class: ch0
            public final /* synthetic */ MainActivity b;

            {
                this.b = this;
            }

            /* JADX WARN: Type inference failed for: r0v39, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i14 = i13;
                MainActivity mainActivity = this.b;
                switch (i14) {
                    case 0:
                        AtomicInteger atomicInteger = MainActivity.o1;
                        return new ManualBluetoothTurnOnDelegateAndroid(new eh0(mainActivity, 4));
                    case 1:
                        AtomicInteger atomicInteger2 = MainActivity.o1;
                        return new SosFeaturePlatformDelegateAndroid(mainActivity, (CrashlyticsLogger) AndroidKoinScopeExtKt.a(mainActivity).d(Reflection.a(CrashlyticsLogger.class), null, null), new eh0(mainActivity, 8));
                    case 2:
                        AtomicInteger atomicInteger3 = MainActivity.o1;
                        return new DeviceNfcTapPaySuppressorAndroid(mainActivity);
                    case 3:
                        AtomicInteger atomicInteger4 = MainActivity.o1;
                        return new PermissionHandlerAndroid(mainActivity, (CoroutineContextProvider) AndroidKoinScopeExtKt.a(mainActivity).d(Reflection.a(CoroutineContextProvider.class), null, null), new eh0(mainActivity, 2));
                    case 4:
                        AtomicInteger atomicInteger5 = MainActivity.o1;
                        return new AndroidTruecallerSetupHandlerImpl(new WeakReference(mainActivity), (CrashlyticsLogger) ComponentCallbackExtKt.a(mainActivity).c.d.d(Reflection.a(CrashlyticsLogger.class), null, null));
                    case 5:
                        AtomicInteger atomicInteger6 = MainActivity.o1;
                        return new ImagePickerAndroid(mainActivity, new eh0(mainActivity, 6), new eh0(mainActivity, 7));
                    case 6:
                        AtomicInteger atomicInteger7 = MainActivity.o1;
                        return new AndroidPhoneNumberHintHandler(mainActivity, new eh0(mainActivity, 1));
                    case 7:
                        return new UvikSdkManagerAndroid(mainActivity, (GetDeviceNFCStateUseCase) mainActivity.l0.getValue(), (BasicInfoContract) mainActivity.j0.getValue(), new eh0(mainActivity, 3));
                    case 8:
                        AtomicInteger atomicInteger8 = MainActivity.o1;
                        return new RazorpaySdk(mainActivity);
                    case 9:
                        AtomicInteger atomicInteger9 = MainActivity.o1;
                        MainActivity mainActivity2 = this.b;
                        return new InstalledUpiAppsHelperAndroid(mainActivity2, (CrashlyticsLogger) AndroidKoinScopeExtKt.a(mainActivity2).d(Reflection.a(CrashlyticsLogger.class), null, null), (AnalyticsContract) AndroidKoinScopeExtKt.a(mainActivity2).d(Reflection.a(AnalyticsContract.class), null, null), (SystemHelper) AndroidKoinScopeExtKt.a(mainActivity2).d(Reflection.a(SystemHelper.class), null, null), (CoroutineContextProvider) AndroidKoinScopeExtKt.a(mainActivity2).d(Reflection.a(CoroutineContextProvider.class), null, null), new eh0(mainActivity2, 5));
                    case 10:
                        AtomicInteger atomicInteger10 = MainActivity.o1;
                        MainActivity mainActivity3 = this.b;
                        return new PhonepeSdkAndroid(mainActivity3, (CrashlyticsLogger) AndroidKoinScopeExtKt.a(mainActivity3).d(Reflection.a(CrashlyticsLogger.class), null, null), (ChaloBuildConfig) AndroidKoinScopeExtKt.a(mainActivity3).d(Reflection.a(ChaloBuildConfig.class), null, null), (InstalledUpiAppsHelperAndroid) mainActivity3.L0.getValue(), (GetDistinctIdUseCase) AndroidKoinScopeExtKt.a(mainActivity3).d(Reflection.a(GetDistinctIdUseCase.class), null, null), (CreatePhonePePaymentModeDataUseCase) AndroidKoinScopeExtKt.a(mainActivity3).d(Reflection.a(CreatePhonePePaymentModeDataUseCase.class), null, null), (PhonepeSdkManager) mainActivity3.u0.getValue(), (CoroutineContextProvider) AndroidKoinScopeExtKt.a(mainActivity3).d(Reflection.a(CoroutineContextProvider.class), null, null));
                    case 11:
                        AtomicInteger atomicInteger11 = MainActivity.o1;
                        return new AppRatingProcessManagerAndroid(mainActivity, mainActivity, (AnalyticsContract) AndroidKoinScopeExtKt.a(mainActivity).d(Reflection.a(AnalyticsContract.class), null, null), (CrashlyticsLogger) AndroidKoinScopeExtKt.a(mainActivity).d(Reflection.a(CrashlyticsLogger.class), null, null));
                    default:
                        AtomicInteger atomicInteger12 = MainActivity.o1;
                        return new GpsRequestHandlerAndroid(new eh0(mainActivity, 0));
                }
            }
        });
        final int i14 = 7;
        this.J0 = LazyKt.b(new Function0(this) { // from class: ch0
            public final /* synthetic */ MainActivity b;

            {
                this.b = this;
            }

            /* JADX WARN: Type inference failed for: r0v39, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i15 = i14;
                MainActivity mainActivity = this.b;
                switch (i15) {
                    case 0:
                        AtomicInteger atomicInteger = MainActivity.o1;
                        return new ManualBluetoothTurnOnDelegateAndroid(new eh0(mainActivity, 4));
                    case 1:
                        AtomicInteger atomicInteger2 = MainActivity.o1;
                        return new SosFeaturePlatformDelegateAndroid(mainActivity, (CrashlyticsLogger) AndroidKoinScopeExtKt.a(mainActivity).d(Reflection.a(CrashlyticsLogger.class), null, null), new eh0(mainActivity, 8));
                    case 2:
                        AtomicInteger atomicInteger3 = MainActivity.o1;
                        return new DeviceNfcTapPaySuppressorAndroid(mainActivity);
                    case 3:
                        AtomicInteger atomicInteger4 = MainActivity.o1;
                        return new PermissionHandlerAndroid(mainActivity, (CoroutineContextProvider) AndroidKoinScopeExtKt.a(mainActivity).d(Reflection.a(CoroutineContextProvider.class), null, null), new eh0(mainActivity, 2));
                    case 4:
                        AtomicInteger atomicInteger5 = MainActivity.o1;
                        return new AndroidTruecallerSetupHandlerImpl(new WeakReference(mainActivity), (CrashlyticsLogger) ComponentCallbackExtKt.a(mainActivity).c.d.d(Reflection.a(CrashlyticsLogger.class), null, null));
                    case 5:
                        AtomicInteger atomicInteger6 = MainActivity.o1;
                        return new ImagePickerAndroid(mainActivity, new eh0(mainActivity, 6), new eh0(mainActivity, 7));
                    case 6:
                        AtomicInteger atomicInteger7 = MainActivity.o1;
                        return new AndroidPhoneNumberHintHandler(mainActivity, new eh0(mainActivity, 1));
                    case 7:
                        return new UvikSdkManagerAndroid(mainActivity, (GetDeviceNFCStateUseCase) mainActivity.l0.getValue(), (BasicInfoContract) mainActivity.j0.getValue(), new eh0(mainActivity, 3));
                    case 8:
                        AtomicInteger atomicInteger8 = MainActivity.o1;
                        return new RazorpaySdk(mainActivity);
                    case 9:
                        AtomicInteger atomicInteger9 = MainActivity.o1;
                        MainActivity mainActivity2 = this.b;
                        return new InstalledUpiAppsHelperAndroid(mainActivity2, (CrashlyticsLogger) AndroidKoinScopeExtKt.a(mainActivity2).d(Reflection.a(CrashlyticsLogger.class), null, null), (AnalyticsContract) AndroidKoinScopeExtKt.a(mainActivity2).d(Reflection.a(AnalyticsContract.class), null, null), (SystemHelper) AndroidKoinScopeExtKt.a(mainActivity2).d(Reflection.a(SystemHelper.class), null, null), (CoroutineContextProvider) AndroidKoinScopeExtKt.a(mainActivity2).d(Reflection.a(CoroutineContextProvider.class), null, null), new eh0(mainActivity2, 5));
                    case 10:
                        AtomicInteger atomicInteger10 = MainActivity.o1;
                        MainActivity mainActivity3 = this.b;
                        return new PhonepeSdkAndroid(mainActivity3, (CrashlyticsLogger) AndroidKoinScopeExtKt.a(mainActivity3).d(Reflection.a(CrashlyticsLogger.class), null, null), (ChaloBuildConfig) AndroidKoinScopeExtKt.a(mainActivity3).d(Reflection.a(ChaloBuildConfig.class), null, null), (InstalledUpiAppsHelperAndroid) mainActivity3.L0.getValue(), (GetDistinctIdUseCase) AndroidKoinScopeExtKt.a(mainActivity3).d(Reflection.a(GetDistinctIdUseCase.class), null, null), (CreatePhonePePaymentModeDataUseCase) AndroidKoinScopeExtKt.a(mainActivity3).d(Reflection.a(CreatePhonePePaymentModeDataUseCase.class), null, null), (PhonepeSdkManager) mainActivity3.u0.getValue(), (CoroutineContextProvider) AndroidKoinScopeExtKt.a(mainActivity3).d(Reflection.a(CoroutineContextProvider.class), null, null));
                    case 11:
                        AtomicInteger atomicInteger11 = MainActivity.o1;
                        return new AppRatingProcessManagerAndroid(mainActivity, mainActivity, (AnalyticsContract) AndroidKoinScopeExtKt.a(mainActivity).d(Reflection.a(AnalyticsContract.class), null, null), (CrashlyticsLogger) AndroidKoinScopeExtKt.a(mainActivity).d(Reflection.a(CrashlyticsLogger.class), null, null));
                    default:
                        AtomicInteger atomicInteger12 = MainActivity.o1;
                        return new GpsRequestHandlerAndroid(new eh0(mainActivity, 0));
                }
            }
        });
        final int i15 = 8;
        this.K0 = LazyKt.b(new Function0(this) { // from class: ch0
            public final /* synthetic */ MainActivity b;

            {
                this.b = this;
            }

            /* JADX WARN: Type inference failed for: r0v39, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i16 = i15;
                MainActivity mainActivity = this.b;
                switch (i16) {
                    case 0:
                        AtomicInteger atomicInteger = MainActivity.o1;
                        return new ManualBluetoothTurnOnDelegateAndroid(new eh0(mainActivity, 4));
                    case 1:
                        AtomicInteger atomicInteger2 = MainActivity.o1;
                        return new SosFeaturePlatformDelegateAndroid(mainActivity, (CrashlyticsLogger) AndroidKoinScopeExtKt.a(mainActivity).d(Reflection.a(CrashlyticsLogger.class), null, null), new eh0(mainActivity, 8));
                    case 2:
                        AtomicInteger atomicInteger3 = MainActivity.o1;
                        return new DeviceNfcTapPaySuppressorAndroid(mainActivity);
                    case 3:
                        AtomicInteger atomicInteger4 = MainActivity.o1;
                        return new PermissionHandlerAndroid(mainActivity, (CoroutineContextProvider) AndroidKoinScopeExtKt.a(mainActivity).d(Reflection.a(CoroutineContextProvider.class), null, null), new eh0(mainActivity, 2));
                    case 4:
                        AtomicInteger atomicInteger5 = MainActivity.o1;
                        return new AndroidTruecallerSetupHandlerImpl(new WeakReference(mainActivity), (CrashlyticsLogger) ComponentCallbackExtKt.a(mainActivity).c.d.d(Reflection.a(CrashlyticsLogger.class), null, null));
                    case 5:
                        AtomicInteger atomicInteger6 = MainActivity.o1;
                        return new ImagePickerAndroid(mainActivity, new eh0(mainActivity, 6), new eh0(mainActivity, 7));
                    case 6:
                        AtomicInteger atomicInteger7 = MainActivity.o1;
                        return new AndroidPhoneNumberHintHandler(mainActivity, new eh0(mainActivity, 1));
                    case 7:
                        return new UvikSdkManagerAndroid(mainActivity, (GetDeviceNFCStateUseCase) mainActivity.l0.getValue(), (BasicInfoContract) mainActivity.j0.getValue(), new eh0(mainActivity, 3));
                    case 8:
                        AtomicInteger atomicInteger8 = MainActivity.o1;
                        return new RazorpaySdk(mainActivity);
                    case 9:
                        AtomicInteger atomicInteger9 = MainActivity.o1;
                        MainActivity mainActivity2 = this.b;
                        return new InstalledUpiAppsHelperAndroid(mainActivity2, (CrashlyticsLogger) AndroidKoinScopeExtKt.a(mainActivity2).d(Reflection.a(CrashlyticsLogger.class), null, null), (AnalyticsContract) AndroidKoinScopeExtKt.a(mainActivity2).d(Reflection.a(AnalyticsContract.class), null, null), (SystemHelper) AndroidKoinScopeExtKt.a(mainActivity2).d(Reflection.a(SystemHelper.class), null, null), (CoroutineContextProvider) AndroidKoinScopeExtKt.a(mainActivity2).d(Reflection.a(CoroutineContextProvider.class), null, null), new eh0(mainActivity2, 5));
                    case 10:
                        AtomicInteger atomicInteger10 = MainActivity.o1;
                        MainActivity mainActivity3 = this.b;
                        return new PhonepeSdkAndroid(mainActivity3, (CrashlyticsLogger) AndroidKoinScopeExtKt.a(mainActivity3).d(Reflection.a(CrashlyticsLogger.class), null, null), (ChaloBuildConfig) AndroidKoinScopeExtKt.a(mainActivity3).d(Reflection.a(ChaloBuildConfig.class), null, null), (InstalledUpiAppsHelperAndroid) mainActivity3.L0.getValue(), (GetDistinctIdUseCase) AndroidKoinScopeExtKt.a(mainActivity3).d(Reflection.a(GetDistinctIdUseCase.class), null, null), (CreatePhonePePaymentModeDataUseCase) AndroidKoinScopeExtKt.a(mainActivity3).d(Reflection.a(CreatePhonePePaymentModeDataUseCase.class), null, null), (PhonepeSdkManager) mainActivity3.u0.getValue(), (CoroutineContextProvider) AndroidKoinScopeExtKt.a(mainActivity3).d(Reflection.a(CoroutineContextProvider.class), null, null));
                    case 11:
                        AtomicInteger atomicInteger11 = MainActivity.o1;
                        return new AppRatingProcessManagerAndroid(mainActivity, mainActivity, (AnalyticsContract) AndroidKoinScopeExtKt.a(mainActivity).d(Reflection.a(AnalyticsContract.class), null, null), (CrashlyticsLogger) AndroidKoinScopeExtKt.a(mainActivity).d(Reflection.a(CrashlyticsLogger.class), null, null));
                    default:
                        AtomicInteger atomicInteger12 = MainActivity.o1;
                        return new GpsRequestHandlerAndroid(new eh0(mainActivity, 0));
                }
            }
        });
        final int i16 = 9;
        this.L0 = LazyKt.b(new Function0(this) { // from class: ch0
            public final /* synthetic */ MainActivity b;

            {
                this.b = this;
            }

            /* JADX WARN: Type inference failed for: r0v39, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i17 = i16;
                MainActivity mainActivity = this.b;
                switch (i17) {
                    case 0:
                        AtomicInteger atomicInteger = MainActivity.o1;
                        return new ManualBluetoothTurnOnDelegateAndroid(new eh0(mainActivity, 4));
                    case 1:
                        AtomicInteger atomicInteger2 = MainActivity.o1;
                        return new SosFeaturePlatformDelegateAndroid(mainActivity, (CrashlyticsLogger) AndroidKoinScopeExtKt.a(mainActivity).d(Reflection.a(CrashlyticsLogger.class), null, null), new eh0(mainActivity, 8));
                    case 2:
                        AtomicInteger atomicInteger3 = MainActivity.o1;
                        return new DeviceNfcTapPaySuppressorAndroid(mainActivity);
                    case 3:
                        AtomicInteger atomicInteger4 = MainActivity.o1;
                        return new PermissionHandlerAndroid(mainActivity, (CoroutineContextProvider) AndroidKoinScopeExtKt.a(mainActivity).d(Reflection.a(CoroutineContextProvider.class), null, null), new eh0(mainActivity, 2));
                    case 4:
                        AtomicInteger atomicInteger5 = MainActivity.o1;
                        return new AndroidTruecallerSetupHandlerImpl(new WeakReference(mainActivity), (CrashlyticsLogger) ComponentCallbackExtKt.a(mainActivity).c.d.d(Reflection.a(CrashlyticsLogger.class), null, null));
                    case 5:
                        AtomicInteger atomicInteger6 = MainActivity.o1;
                        return new ImagePickerAndroid(mainActivity, new eh0(mainActivity, 6), new eh0(mainActivity, 7));
                    case 6:
                        AtomicInteger atomicInteger7 = MainActivity.o1;
                        return new AndroidPhoneNumberHintHandler(mainActivity, new eh0(mainActivity, 1));
                    case 7:
                        return new UvikSdkManagerAndroid(mainActivity, (GetDeviceNFCStateUseCase) mainActivity.l0.getValue(), (BasicInfoContract) mainActivity.j0.getValue(), new eh0(mainActivity, 3));
                    case 8:
                        AtomicInteger atomicInteger8 = MainActivity.o1;
                        return new RazorpaySdk(mainActivity);
                    case 9:
                        AtomicInteger atomicInteger9 = MainActivity.o1;
                        MainActivity mainActivity2 = this.b;
                        return new InstalledUpiAppsHelperAndroid(mainActivity2, (CrashlyticsLogger) AndroidKoinScopeExtKt.a(mainActivity2).d(Reflection.a(CrashlyticsLogger.class), null, null), (AnalyticsContract) AndroidKoinScopeExtKt.a(mainActivity2).d(Reflection.a(AnalyticsContract.class), null, null), (SystemHelper) AndroidKoinScopeExtKt.a(mainActivity2).d(Reflection.a(SystemHelper.class), null, null), (CoroutineContextProvider) AndroidKoinScopeExtKt.a(mainActivity2).d(Reflection.a(CoroutineContextProvider.class), null, null), new eh0(mainActivity2, 5));
                    case 10:
                        AtomicInteger atomicInteger10 = MainActivity.o1;
                        MainActivity mainActivity3 = this.b;
                        return new PhonepeSdkAndroid(mainActivity3, (CrashlyticsLogger) AndroidKoinScopeExtKt.a(mainActivity3).d(Reflection.a(CrashlyticsLogger.class), null, null), (ChaloBuildConfig) AndroidKoinScopeExtKt.a(mainActivity3).d(Reflection.a(ChaloBuildConfig.class), null, null), (InstalledUpiAppsHelperAndroid) mainActivity3.L0.getValue(), (GetDistinctIdUseCase) AndroidKoinScopeExtKt.a(mainActivity3).d(Reflection.a(GetDistinctIdUseCase.class), null, null), (CreatePhonePePaymentModeDataUseCase) AndroidKoinScopeExtKt.a(mainActivity3).d(Reflection.a(CreatePhonePePaymentModeDataUseCase.class), null, null), (PhonepeSdkManager) mainActivity3.u0.getValue(), (CoroutineContextProvider) AndroidKoinScopeExtKt.a(mainActivity3).d(Reflection.a(CoroutineContextProvider.class), null, null));
                    case 11:
                        AtomicInteger atomicInteger11 = MainActivity.o1;
                        return new AppRatingProcessManagerAndroid(mainActivity, mainActivity, (AnalyticsContract) AndroidKoinScopeExtKt.a(mainActivity).d(Reflection.a(AnalyticsContract.class), null, null), (CrashlyticsLogger) AndroidKoinScopeExtKt.a(mainActivity).d(Reflection.a(CrashlyticsLogger.class), null, null));
                    default:
                        AtomicInteger atomicInteger12 = MainActivity.o1;
                        return new GpsRequestHandlerAndroid(new eh0(mainActivity, 0));
                }
            }
        });
        final int i17 = 10;
        this.M0 = LazyKt.b(new Function0(this) { // from class: ch0
            public final /* synthetic */ MainActivity b;

            {
                this.b = this;
            }

            /* JADX WARN: Type inference failed for: r0v39, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i18 = i17;
                MainActivity mainActivity = this.b;
                switch (i18) {
                    case 0:
                        AtomicInteger atomicInteger = MainActivity.o1;
                        return new ManualBluetoothTurnOnDelegateAndroid(new eh0(mainActivity, 4));
                    case 1:
                        AtomicInteger atomicInteger2 = MainActivity.o1;
                        return new SosFeaturePlatformDelegateAndroid(mainActivity, (CrashlyticsLogger) AndroidKoinScopeExtKt.a(mainActivity).d(Reflection.a(CrashlyticsLogger.class), null, null), new eh0(mainActivity, 8));
                    case 2:
                        AtomicInteger atomicInteger3 = MainActivity.o1;
                        return new DeviceNfcTapPaySuppressorAndroid(mainActivity);
                    case 3:
                        AtomicInteger atomicInteger4 = MainActivity.o1;
                        return new PermissionHandlerAndroid(mainActivity, (CoroutineContextProvider) AndroidKoinScopeExtKt.a(mainActivity).d(Reflection.a(CoroutineContextProvider.class), null, null), new eh0(mainActivity, 2));
                    case 4:
                        AtomicInteger atomicInteger5 = MainActivity.o1;
                        return new AndroidTruecallerSetupHandlerImpl(new WeakReference(mainActivity), (CrashlyticsLogger) ComponentCallbackExtKt.a(mainActivity).c.d.d(Reflection.a(CrashlyticsLogger.class), null, null));
                    case 5:
                        AtomicInteger atomicInteger6 = MainActivity.o1;
                        return new ImagePickerAndroid(mainActivity, new eh0(mainActivity, 6), new eh0(mainActivity, 7));
                    case 6:
                        AtomicInteger atomicInteger7 = MainActivity.o1;
                        return new AndroidPhoneNumberHintHandler(mainActivity, new eh0(mainActivity, 1));
                    case 7:
                        return new UvikSdkManagerAndroid(mainActivity, (GetDeviceNFCStateUseCase) mainActivity.l0.getValue(), (BasicInfoContract) mainActivity.j0.getValue(), new eh0(mainActivity, 3));
                    case 8:
                        AtomicInteger atomicInteger8 = MainActivity.o1;
                        return new RazorpaySdk(mainActivity);
                    case 9:
                        AtomicInteger atomicInteger9 = MainActivity.o1;
                        MainActivity mainActivity2 = this.b;
                        return new InstalledUpiAppsHelperAndroid(mainActivity2, (CrashlyticsLogger) AndroidKoinScopeExtKt.a(mainActivity2).d(Reflection.a(CrashlyticsLogger.class), null, null), (AnalyticsContract) AndroidKoinScopeExtKt.a(mainActivity2).d(Reflection.a(AnalyticsContract.class), null, null), (SystemHelper) AndroidKoinScopeExtKt.a(mainActivity2).d(Reflection.a(SystemHelper.class), null, null), (CoroutineContextProvider) AndroidKoinScopeExtKt.a(mainActivity2).d(Reflection.a(CoroutineContextProvider.class), null, null), new eh0(mainActivity2, 5));
                    case 10:
                        AtomicInteger atomicInteger10 = MainActivity.o1;
                        MainActivity mainActivity3 = this.b;
                        return new PhonepeSdkAndroid(mainActivity3, (CrashlyticsLogger) AndroidKoinScopeExtKt.a(mainActivity3).d(Reflection.a(CrashlyticsLogger.class), null, null), (ChaloBuildConfig) AndroidKoinScopeExtKt.a(mainActivity3).d(Reflection.a(ChaloBuildConfig.class), null, null), (InstalledUpiAppsHelperAndroid) mainActivity3.L0.getValue(), (GetDistinctIdUseCase) AndroidKoinScopeExtKt.a(mainActivity3).d(Reflection.a(GetDistinctIdUseCase.class), null, null), (CreatePhonePePaymentModeDataUseCase) AndroidKoinScopeExtKt.a(mainActivity3).d(Reflection.a(CreatePhonePePaymentModeDataUseCase.class), null, null), (PhonepeSdkManager) mainActivity3.u0.getValue(), (CoroutineContextProvider) AndroidKoinScopeExtKt.a(mainActivity3).d(Reflection.a(CoroutineContextProvider.class), null, null));
                    case 11:
                        AtomicInteger atomicInteger11 = MainActivity.o1;
                        return new AppRatingProcessManagerAndroid(mainActivity, mainActivity, (AnalyticsContract) AndroidKoinScopeExtKt.a(mainActivity).d(Reflection.a(AnalyticsContract.class), null, null), (CrashlyticsLogger) AndroidKoinScopeExtKt.a(mainActivity).d(Reflection.a(CrashlyticsLogger.class), null, null));
                    default:
                        AtomicInteger atomicInteger12 = MainActivity.o1;
                        return new GpsRequestHandlerAndroid(new eh0(mainActivity, 0));
                }
            }
        });
        final int i18 = 11;
        this.N0 = LazyKt.b(new Function0(this) { // from class: ch0
            public final /* synthetic */ MainActivity b;

            {
                this.b = this;
            }

            /* JADX WARN: Type inference failed for: r0v39, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i19 = i18;
                MainActivity mainActivity = this.b;
                switch (i19) {
                    case 0:
                        AtomicInteger atomicInteger = MainActivity.o1;
                        return new ManualBluetoothTurnOnDelegateAndroid(new eh0(mainActivity, 4));
                    case 1:
                        AtomicInteger atomicInteger2 = MainActivity.o1;
                        return new SosFeaturePlatformDelegateAndroid(mainActivity, (CrashlyticsLogger) AndroidKoinScopeExtKt.a(mainActivity).d(Reflection.a(CrashlyticsLogger.class), null, null), new eh0(mainActivity, 8));
                    case 2:
                        AtomicInteger atomicInteger3 = MainActivity.o1;
                        return new DeviceNfcTapPaySuppressorAndroid(mainActivity);
                    case 3:
                        AtomicInteger atomicInteger4 = MainActivity.o1;
                        return new PermissionHandlerAndroid(mainActivity, (CoroutineContextProvider) AndroidKoinScopeExtKt.a(mainActivity).d(Reflection.a(CoroutineContextProvider.class), null, null), new eh0(mainActivity, 2));
                    case 4:
                        AtomicInteger atomicInteger5 = MainActivity.o1;
                        return new AndroidTruecallerSetupHandlerImpl(new WeakReference(mainActivity), (CrashlyticsLogger) ComponentCallbackExtKt.a(mainActivity).c.d.d(Reflection.a(CrashlyticsLogger.class), null, null));
                    case 5:
                        AtomicInteger atomicInteger6 = MainActivity.o1;
                        return new ImagePickerAndroid(mainActivity, new eh0(mainActivity, 6), new eh0(mainActivity, 7));
                    case 6:
                        AtomicInteger atomicInteger7 = MainActivity.o1;
                        return new AndroidPhoneNumberHintHandler(mainActivity, new eh0(mainActivity, 1));
                    case 7:
                        return new UvikSdkManagerAndroid(mainActivity, (GetDeviceNFCStateUseCase) mainActivity.l0.getValue(), (BasicInfoContract) mainActivity.j0.getValue(), new eh0(mainActivity, 3));
                    case 8:
                        AtomicInteger atomicInteger8 = MainActivity.o1;
                        return new RazorpaySdk(mainActivity);
                    case 9:
                        AtomicInteger atomicInteger9 = MainActivity.o1;
                        MainActivity mainActivity2 = this.b;
                        return new InstalledUpiAppsHelperAndroid(mainActivity2, (CrashlyticsLogger) AndroidKoinScopeExtKt.a(mainActivity2).d(Reflection.a(CrashlyticsLogger.class), null, null), (AnalyticsContract) AndroidKoinScopeExtKt.a(mainActivity2).d(Reflection.a(AnalyticsContract.class), null, null), (SystemHelper) AndroidKoinScopeExtKt.a(mainActivity2).d(Reflection.a(SystemHelper.class), null, null), (CoroutineContextProvider) AndroidKoinScopeExtKt.a(mainActivity2).d(Reflection.a(CoroutineContextProvider.class), null, null), new eh0(mainActivity2, 5));
                    case 10:
                        AtomicInteger atomicInteger10 = MainActivity.o1;
                        MainActivity mainActivity3 = this.b;
                        return new PhonepeSdkAndroid(mainActivity3, (CrashlyticsLogger) AndroidKoinScopeExtKt.a(mainActivity3).d(Reflection.a(CrashlyticsLogger.class), null, null), (ChaloBuildConfig) AndroidKoinScopeExtKt.a(mainActivity3).d(Reflection.a(ChaloBuildConfig.class), null, null), (InstalledUpiAppsHelperAndroid) mainActivity3.L0.getValue(), (GetDistinctIdUseCase) AndroidKoinScopeExtKt.a(mainActivity3).d(Reflection.a(GetDistinctIdUseCase.class), null, null), (CreatePhonePePaymentModeDataUseCase) AndroidKoinScopeExtKt.a(mainActivity3).d(Reflection.a(CreatePhonePePaymentModeDataUseCase.class), null, null), (PhonepeSdkManager) mainActivity3.u0.getValue(), (CoroutineContextProvider) AndroidKoinScopeExtKt.a(mainActivity3).d(Reflection.a(CoroutineContextProvider.class), null, null));
                    case 11:
                        AtomicInteger atomicInteger11 = MainActivity.o1;
                        return new AppRatingProcessManagerAndroid(mainActivity, mainActivity, (AnalyticsContract) AndroidKoinScopeExtKt.a(mainActivity).d(Reflection.a(AnalyticsContract.class), null, null), (CrashlyticsLogger) AndroidKoinScopeExtKt.a(mainActivity).d(Reflection.a(CrashlyticsLogger.class), null, null));
                    default:
                        AtomicInteger atomicInteger12 = MainActivity.o1;
                        return new GpsRequestHandlerAndroid(new eh0(mainActivity, 0));
                }
            }
        });
        final int i19 = 12;
        this.O0 = LazyKt.b(new Function0(this) { // from class: ch0
            public final /* synthetic */ MainActivity b;

            {
                this.b = this;
            }

            /* JADX WARN: Type inference failed for: r0v39, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i110 = i19;
                MainActivity mainActivity = this.b;
                switch (i110) {
                    case 0:
                        AtomicInteger atomicInteger = MainActivity.o1;
                        return new ManualBluetoothTurnOnDelegateAndroid(new eh0(mainActivity, 4));
                    case 1:
                        AtomicInteger atomicInteger2 = MainActivity.o1;
                        return new SosFeaturePlatformDelegateAndroid(mainActivity, (CrashlyticsLogger) AndroidKoinScopeExtKt.a(mainActivity).d(Reflection.a(CrashlyticsLogger.class), null, null), new eh0(mainActivity, 8));
                    case 2:
                        AtomicInteger atomicInteger3 = MainActivity.o1;
                        return new DeviceNfcTapPaySuppressorAndroid(mainActivity);
                    case 3:
                        AtomicInteger atomicInteger4 = MainActivity.o1;
                        return new PermissionHandlerAndroid(mainActivity, (CoroutineContextProvider) AndroidKoinScopeExtKt.a(mainActivity).d(Reflection.a(CoroutineContextProvider.class), null, null), new eh0(mainActivity, 2));
                    case 4:
                        AtomicInteger atomicInteger5 = MainActivity.o1;
                        return new AndroidTruecallerSetupHandlerImpl(new WeakReference(mainActivity), (CrashlyticsLogger) ComponentCallbackExtKt.a(mainActivity).c.d.d(Reflection.a(CrashlyticsLogger.class), null, null));
                    case 5:
                        AtomicInteger atomicInteger6 = MainActivity.o1;
                        return new ImagePickerAndroid(mainActivity, new eh0(mainActivity, 6), new eh0(mainActivity, 7));
                    case 6:
                        AtomicInteger atomicInteger7 = MainActivity.o1;
                        return new AndroidPhoneNumberHintHandler(mainActivity, new eh0(mainActivity, 1));
                    case 7:
                        return new UvikSdkManagerAndroid(mainActivity, (GetDeviceNFCStateUseCase) mainActivity.l0.getValue(), (BasicInfoContract) mainActivity.j0.getValue(), new eh0(mainActivity, 3));
                    case 8:
                        AtomicInteger atomicInteger8 = MainActivity.o1;
                        return new RazorpaySdk(mainActivity);
                    case 9:
                        AtomicInteger atomicInteger9 = MainActivity.o1;
                        MainActivity mainActivity2 = this.b;
                        return new InstalledUpiAppsHelperAndroid(mainActivity2, (CrashlyticsLogger) AndroidKoinScopeExtKt.a(mainActivity2).d(Reflection.a(CrashlyticsLogger.class), null, null), (AnalyticsContract) AndroidKoinScopeExtKt.a(mainActivity2).d(Reflection.a(AnalyticsContract.class), null, null), (SystemHelper) AndroidKoinScopeExtKt.a(mainActivity2).d(Reflection.a(SystemHelper.class), null, null), (CoroutineContextProvider) AndroidKoinScopeExtKt.a(mainActivity2).d(Reflection.a(CoroutineContextProvider.class), null, null), new eh0(mainActivity2, 5));
                    case 10:
                        AtomicInteger atomicInteger10 = MainActivity.o1;
                        MainActivity mainActivity3 = this.b;
                        return new PhonepeSdkAndroid(mainActivity3, (CrashlyticsLogger) AndroidKoinScopeExtKt.a(mainActivity3).d(Reflection.a(CrashlyticsLogger.class), null, null), (ChaloBuildConfig) AndroidKoinScopeExtKt.a(mainActivity3).d(Reflection.a(ChaloBuildConfig.class), null, null), (InstalledUpiAppsHelperAndroid) mainActivity3.L0.getValue(), (GetDistinctIdUseCase) AndroidKoinScopeExtKt.a(mainActivity3).d(Reflection.a(GetDistinctIdUseCase.class), null, null), (CreatePhonePePaymentModeDataUseCase) AndroidKoinScopeExtKt.a(mainActivity3).d(Reflection.a(CreatePhonePePaymentModeDataUseCase.class), null, null), (PhonepeSdkManager) mainActivity3.u0.getValue(), (CoroutineContextProvider) AndroidKoinScopeExtKt.a(mainActivity3).d(Reflection.a(CoroutineContextProvider.class), null, null));
                    case 11:
                        AtomicInteger atomicInteger11 = MainActivity.o1;
                        return new AppRatingProcessManagerAndroid(mainActivity, mainActivity, (AnalyticsContract) AndroidKoinScopeExtKt.a(mainActivity).d(Reflection.a(AnalyticsContract.class), null, null), (CrashlyticsLogger) AndroidKoinScopeExtKt.a(mainActivity).d(Reflection.a(CrashlyticsLogger.class), null, null));
                    default:
                        AtomicInteger atomicInteger12 = MainActivity.o1;
                        return new GpsRequestHandlerAndroid(new eh0(mainActivity, 0));
                }
            }
        });
        final int i20 = 0;
        this.P0 = LazyKt.b(new Function0(this) { // from class: ch0
            public final /* synthetic */ MainActivity b;

            {
                this.b = this;
            }

            /* JADX WARN: Type inference failed for: r0v39, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i110 = i20;
                MainActivity mainActivity = this.b;
                switch (i110) {
                    case 0:
                        AtomicInteger atomicInteger = MainActivity.o1;
                        return new ManualBluetoothTurnOnDelegateAndroid(new eh0(mainActivity, 4));
                    case 1:
                        AtomicInteger atomicInteger2 = MainActivity.o1;
                        return new SosFeaturePlatformDelegateAndroid(mainActivity, (CrashlyticsLogger) AndroidKoinScopeExtKt.a(mainActivity).d(Reflection.a(CrashlyticsLogger.class), null, null), new eh0(mainActivity, 8));
                    case 2:
                        AtomicInteger atomicInteger3 = MainActivity.o1;
                        return new DeviceNfcTapPaySuppressorAndroid(mainActivity);
                    case 3:
                        AtomicInteger atomicInteger4 = MainActivity.o1;
                        return new PermissionHandlerAndroid(mainActivity, (CoroutineContextProvider) AndroidKoinScopeExtKt.a(mainActivity).d(Reflection.a(CoroutineContextProvider.class), null, null), new eh0(mainActivity, 2));
                    case 4:
                        AtomicInteger atomicInteger5 = MainActivity.o1;
                        return new AndroidTruecallerSetupHandlerImpl(new WeakReference(mainActivity), (CrashlyticsLogger) ComponentCallbackExtKt.a(mainActivity).c.d.d(Reflection.a(CrashlyticsLogger.class), null, null));
                    case 5:
                        AtomicInteger atomicInteger6 = MainActivity.o1;
                        return new ImagePickerAndroid(mainActivity, new eh0(mainActivity, 6), new eh0(mainActivity, 7));
                    case 6:
                        AtomicInteger atomicInteger7 = MainActivity.o1;
                        return new AndroidPhoneNumberHintHandler(mainActivity, new eh0(mainActivity, 1));
                    case 7:
                        return new UvikSdkManagerAndroid(mainActivity, (GetDeviceNFCStateUseCase) mainActivity.l0.getValue(), (BasicInfoContract) mainActivity.j0.getValue(), new eh0(mainActivity, 3));
                    case 8:
                        AtomicInteger atomicInteger8 = MainActivity.o1;
                        return new RazorpaySdk(mainActivity);
                    case 9:
                        AtomicInteger atomicInteger9 = MainActivity.o1;
                        MainActivity mainActivity2 = this.b;
                        return new InstalledUpiAppsHelperAndroid(mainActivity2, (CrashlyticsLogger) AndroidKoinScopeExtKt.a(mainActivity2).d(Reflection.a(CrashlyticsLogger.class), null, null), (AnalyticsContract) AndroidKoinScopeExtKt.a(mainActivity2).d(Reflection.a(AnalyticsContract.class), null, null), (SystemHelper) AndroidKoinScopeExtKt.a(mainActivity2).d(Reflection.a(SystemHelper.class), null, null), (CoroutineContextProvider) AndroidKoinScopeExtKt.a(mainActivity2).d(Reflection.a(CoroutineContextProvider.class), null, null), new eh0(mainActivity2, 5));
                    case 10:
                        AtomicInteger atomicInteger10 = MainActivity.o1;
                        MainActivity mainActivity3 = this.b;
                        return new PhonepeSdkAndroid(mainActivity3, (CrashlyticsLogger) AndroidKoinScopeExtKt.a(mainActivity3).d(Reflection.a(CrashlyticsLogger.class), null, null), (ChaloBuildConfig) AndroidKoinScopeExtKt.a(mainActivity3).d(Reflection.a(ChaloBuildConfig.class), null, null), (InstalledUpiAppsHelperAndroid) mainActivity3.L0.getValue(), (GetDistinctIdUseCase) AndroidKoinScopeExtKt.a(mainActivity3).d(Reflection.a(GetDistinctIdUseCase.class), null, null), (CreatePhonePePaymentModeDataUseCase) AndroidKoinScopeExtKt.a(mainActivity3).d(Reflection.a(CreatePhonePePaymentModeDataUseCase.class), null, null), (PhonepeSdkManager) mainActivity3.u0.getValue(), (CoroutineContextProvider) AndroidKoinScopeExtKt.a(mainActivity3).d(Reflection.a(CoroutineContextProvider.class), null, null));
                    case 11:
                        AtomicInteger atomicInteger11 = MainActivity.o1;
                        return new AppRatingProcessManagerAndroid(mainActivity, mainActivity, (AnalyticsContract) AndroidKoinScopeExtKt.a(mainActivity).d(Reflection.a(AnalyticsContract.class), null, null), (CrashlyticsLogger) AndroidKoinScopeExtKt.a(mainActivity).d(Reflection.a(CrashlyticsLogger.class), null, null));
                    default:
                        AtomicInteger atomicInteger12 = MainActivity.o1;
                        return new GpsRequestHandlerAndroid(new eh0(mainActivity, 0));
                }
            }
        });
        final int i21 = 1;
        this.Q0 = LazyKt.b(new Function0(this) { // from class: ch0
            public final /* synthetic */ MainActivity b;

            {
                this.b = this;
            }

            /* JADX WARN: Type inference failed for: r0v39, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i110 = i21;
                MainActivity mainActivity = this.b;
                switch (i110) {
                    case 0:
                        AtomicInteger atomicInteger = MainActivity.o1;
                        return new ManualBluetoothTurnOnDelegateAndroid(new eh0(mainActivity, 4));
                    case 1:
                        AtomicInteger atomicInteger2 = MainActivity.o1;
                        return new SosFeaturePlatformDelegateAndroid(mainActivity, (CrashlyticsLogger) AndroidKoinScopeExtKt.a(mainActivity).d(Reflection.a(CrashlyticsLogger.class), null, null), new eh0(mainActivity, 8));
                    case 2:
                        AtomicInteger atomicInteger3 = MainActivity.o1;
                        return new DeviceNfcTapPaySuppressorAndroid(mainActivity);
                    case 3:
                        AtomicInteger atomicInteger4 = MainActivity.o1;
                        return new PermissionHandlerAndroid(mainActivity, (CoroutineContextProvider) AndroidKoinScopeExtKt.a(mainActivity).d(Reflection.a(CoroutineContextProvider.class), null, null), new eh0(mainActivity, 2));
                    case 4:
                        AtomicInteger atomicInteger5 = MainActivity.o1;
                        return new AndroidTruecallerSetupHandlerImpl(new WeakReference(mainActivity), (CrashlyticsLogger) ComponentCallbackExtKt.a(mainActivity).c.d.d(Reflection.a(CrashlyticsLogger.class), null, null));
                    case 5:
                        AtomicInteger atomicInteger6 = MainActivity.o1;
                        return new ImagePickerAndroid(mainActivity, new eh0(mainActivity, 6), new eh0(mainActivity, 7));
                    case 6:
                        AtomicInteger atomicInteger7 = MainActivity.o1;
                        return new AndroidPhoneNumberHintHandler(mainActivity, new eh0(mainActivity, 1));
                    case 7:
                        return new UvikSdkManagerAndroid(mainActivity, (GetDeviceNFCStateUseCase) mainActivity.l0.getValue(), (BasicInfoContract) mainActivity.j0.getValue(), new eh0(mainActivity, 3));
                    case 8:
                        AtomicInteger atomicInteger8 = MainActivity.o1;
                        return new RazorpaySdk(mainActivity);
                    case 9:
                        AtomicInteger atomicInteger9 = MainActivity.o1;
                        MainActivity mainActivity2 = this.b;
                        return new InstalledUpiAppsHelperAndroid(mainActivity2, (CrashlyticsLogger) AndroidKoinScopeExtKt.a(mainActivity2).d(Reflection.a(CrashlyticsLogger.class), null, null), (AnalyticsContract) AndroidKoinScopeExtKt.a(mainActivity2).d(Reflection.a(AnalyticsContract.class), null, null), (SystemHelper) AndroidKoinScopeExtKt.a(mainActivity2).d(Reflection.a(SystemHelper.class), null, null), (CoroutineContextProvider) AndroidKoinScopeExtKt.a(mainActivity2).d(Reflection.a(CoroutineContextProvider.class), null, null), new eh0(mainActivity2, 5));
                    case 10:
                        AtomicInteger atomicInteger10 = MainActivity.o1;
                        MainActivity mainActivity3 = this.b;
                        return new PhonepeSdkAndroid(mainActivity3, (CrashlyticsLogger) AndroidKoinScopeExtKt.a(mainActivity3).d(Reflection.a(CrashlyticsLogger.class), null, null), (ChaloBuildConfig) AndroidKoinScopeExtKt.a(mainActivity3).d(Reflection.a(ChaloBuildConfig.class), null, null), (InstalledUpiAppsHelperAndroid) mainActivity3.L0.getValue(), (GetDistinctIdUseCase) AndroidKoinScopeExtKt.a(mainActivity3).d(Reflection.a(GetDistinctIdUseCase.class), null, null), (CreatePhonePePaymentModeDataUseCase) AndroidKoinScopeExtKt.a(mainActivity3).d(Reflection.a(CreatePhonePePaymentModeDataUseCase.class), null, null), (PhonepeSdkManager) mainActivity3.u0.getValue(), (CoroutineContextProvider) AndroidKoinScopeExtKt.a(mainActivity3).d(Reflection.a(CoroutineContextProvider.class), null, null));
                    case 11:
                        AtomicInteger atomicInteger11 = MainActivity.o1;
                        return new AppRatingProcessManagerAndroid(mainActivity, mainActivity, (AnalyticsContract) AndroidKoinScopeExtKt.a(mainActivity).d(Reflection.a(AnalyticsContract.class), null, null), (CrashlyticsLogger) AndroidKoinScopeExtKt.a(mainActivity).d(Reflection.a(CrashlyticsLogger.class), null, null));
                    default:
                        AtomicInteger atomicInteger12 = MainActivity.o1;
                        return new GpsRequestHandlerAndroid(new eh0(mainActivity, 0));
                }
            }
        });
        final int i22 = 2;
        this.R0 = LazyKt.b(new Function0(this) { // from class: ch0
            public final /* synthetic */ MainActivity b;

            {
                this.b = this;
            }

            /* JADX WARN: Type inference failed for: r0v39, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i110 = i22;
                MainActivity mainActivity = this.b;
                switch (i110) {
                    case 0:
                        AtomicInteger atomicInteger = MainActivity.o1;
                        return new ManualBluetoothTurnOnDelegateAndroid(new eh0(mainActivity, 4));
                    case 1:
                        AtomicInteger atomicInteger2 = MainActivity.o1;
                        return new SosFeaturePlatformDelegateAndroid(mainActivity, (CrashlyticsLogger) AndroidKoinScopeExtKt.a(mainActivity).d(Reflection.a(CrashlyticsLogger.class), null, null), new eh0(mainActivity, 8));
                    case 2:
                        AtomicInteger atomicInteger3 = MainActivity.o1;
                        return new DeviceNfcTapPaySuppressorAndroid(mainActivity);
                    case 3:
                        AtomicInteger atomicInteger4 = MainActivity.o1;
                        return new PermissionHandlerAndroid(mainActivity, (CoroutineContextProvider) AndroidKoinScopeExtKt.a(mainActivity).d(Reflection.a(CoroutineContextProvider.class), null, null), new eh0(mainActivity, 2));
                    case 4:
                        AtomicInteger atomicInteger5 = MainActivity.o1;
                        return new AndroidTruecallerSetupHandlerImpl(new WeakReference(mainActivity), (CrashlyticsLogger) ComponentCallbackExtKt.a(mainActivity).c.d.d(Reflection.a(CrashlyticsLogger.class), null, null));
                    case 5:
                        AtomicInteger atomicInteger6 = MainActivity.o1;
                        return new ImagePickerAndroid(mainActivity, new eh0(mainActivity, 6), new eh0(mainActivity, 7));
                    case 6:
                        AtomicInteger atomicInteger7 = MainActivity.o1;
                        return new AndroidPhoneNumberHintHandler(mainActivity, new eh0(mainActivity, 1));
                    case 7:
                        return new UvikSdkManagerAndroid(mainActivity, (GetDeviceNFCStateUseCase) mainActivity.l0.getValue(), (BasicInfoContract) mainActivity.j0.getValue(), new eh0(mainActivity, 3));
                    case 8:
                        AtomicInteger atomicInteger8 = MainActivity.o1;
                        return new RazorpaySdk(mainActivity);
                    case 9:
                        AtomicInteger atomicInteger9 = MainActivity.o1;
                        MainActivity mainActivity2 = this.b;
                        return new InstalledUpiAppsHelperAndroid(mainActivity2, (CrashlyticsLogger) AndroidKoinScopeExtKt.a(mainActivity2).d(Reflection.a(CrashlyticsLogger.class), null, null), (AnalyticsContract) AndroidKoinScopeExtKt.a(mainActivity2).d(Reflection.a(AnalyticsContract.class), null, null), (SystemHelper) AndroidKoinScopeExtKt.a(mainActivity2).d(Reflection.a(SystemHelper.class), null, null), (CoroutineContextProvider) AndroidKoinScopeExtKt.a(mainActivity2).d(Reflection.a(CoroutineContextProvider.class), null, null), new eh0(mainActivity2, 5));
                    case 10:
                        AtomicInteger atomicInteger10 = MainActivity.o1;
                        MainActivity mainActivity3 = this.b;
                        return new PhonepeSdkAndroid(mainActivity3, (CrashlyticsLogger) AndroidKoinScopeExtKt.a(mainActivity3).d(Reflection.a(CrashlyticsLogger.class), null, null), (ChaloBuildConfig) AndroidKoinScopeExtKt.a(mainActivity3).d(Reflection.a(ChaloBuildConfig.class), null, null), (InstalledUpiAppsHelperAndroid) mainActivity3.L0.getValue(), (GetDistinctIdUseCase) AndroidKoinScopeExtKt.a(mainActivity3).d(Reflection.a(GetDistinctIdUseCase.class), null, null), (CreatePhonePePaymentModeDataUseCase) AndroidKoinScopeExtKt.a(mainActivity3).d(Reflection.a(CreatePhonePePaymentModeDataUseCase.class), null, null), (PhonepeSdkManager) mainActivity3.u0.getValue(), (CoroutineContextProvider) AndroidKoinScopeExtKt.a(mainActivity3).d(Reflection.a(CoroutineContextProvider.class), null, null));
                    case 11:
                        AtomicInteger atomicInteger11 = MainActivity.o1;
                        return new AppRatingProcessManagerAndroid(mainActivity, mainActivity, (AnalyticsContract) AndroidKoinScopeExtKt.a(mainActivity).d(Reflection.a(AnalyticsContract.class), null, null), (CrashlyticsLogger) AndroidKoinScopeExtKt.a(mainActivity).d(Reflection.a(CrashlyticsLogger.class), null, null));
                    default:
                        AtomicInteger atomicInteger12 = MainActivity.o1;
                        return new GpsRequestHandlerAndroid(new eh0(mainActivity, 0));
                }
            }
        });
        this.b1 = LazyKt.a(lazyThreadSafetyMode, new Function0<PlotlineTrackContextProvider>() { // from class: app.chalo.android.MainActivity$special$$inlined$inject$default$31
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AndroidKoinScopeExtKt.a(this.f929a).d(Reflection.a(PlotlineTrackContextProvider.class), null, null);
            }
        });
        this.f1 = LazyKt.a(lazyThreadSafetyMode, new Function0<ChaloBuildConfig>() { // from class: app.chalo.android.MainActivity$special$$inlined$inject$default$32
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AndroidKoinScopeExtKt.a(this.f930a).d(Reflection.a(ChaloBuildConfig.class), null, null);
            }
        });
        this.g1 = LazyKt.a(lazyThreadSafetyMode, new Function0<LanguageFeature>() { // from class: app.chalo.android.MainActivity$special$$inlined$inject$default$33
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AndroidKoinScopeExtKt.a(this.f931a).d(Reflection.a(LanguageFeature.class), null, null);
            }
        });
        this.h1 = LazyKt.a(lazyThreadSafetyMode, new Function0<StringProvider>() { // from class: app.chalo.android.MainActivity$special$$inlined$inject$default$34
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AndroidKoinScopeExtKt.a(this.f932a).d(Reflection.a(StringProvider.class), null, null);
            }
        });
        this.i1 = LazyKt.a(lazyThreadSafetyMode, new Function0<IconAssetProvider>() { // from class: app.chalo.android.MainActivity$special$$inlined$inject$default$35
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AndroidKoinScopeExtKt.a(this.f933a).d(Reflection.a(IconAssetProvider.class), null, null);
            }
        });
        this.j1 = LazyKt.a(lazyThreadSafetyMode, new Function0<LottieAssetProvider>() { // from class: app.chalo.android.MainActivity$special$$inlined$inject$default$36
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AndroidKoinScopeExtKt.a(this.f934a).d(Reflection.a(LottieAssetProvider.class), null, null);
            }
        });
    }

    public static final String m(MainActivity mainActivity) {
        String string;
        BottomNavTabType bottomNavTabTypeA;
        BottomNavTabType bottomNavTabTypeA2;
        ChaloScenes chaloScenesC;
        ChaloScenes chaloScenesC2;
        RootComponent rootComponent = mainActivity.k1;
        if (rootComponent == null) {
            return "rootComponent=null";
        }
        ChildStack childStack = (ChildStack) rootComponent.g().a();
        GettingList gettingList = childStack.c;
        Child.Created created = childStack.f12382a;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = gettingList.iterator();
        while (true) {
            String strName = null;
            if (!it.hasNext()) {
                break;
            }
            Object obj = ((Child.Created) it.next()).f12283a;
            SceneArgs sceneArgs = obj instanceof SceneArgs ? (SceneArgs) obj : null;
            if (sceneArgs != null && (chaloScenesC2 = sceneArgs.c()) != null) {
                strName = chaloScenesC2.name();
            }
            if (strName != null) {
                arrayList.add(strName);
            }
        }
        Object obj2 = created.f12283a;
        SceneArgs sceneArgs2 = obj2 instanceof SceneArgs ? (SceneArgs) obj2 : null;
        String strP = vo1.p(nf1.p(arrayList.size(), "root(size=", ", active=", (sceneArgs2 == null || (chaloScenesC = sceneArgs2.c()) == null) ? null : chaloScenesC.name(), ", stack="), CollectionsKt.O(arrayList, " > ", null, null, null, 62), ")");
        RootComponent.Child child = (RootComponent.Child) created.b;
        if (child instanceof RootComponent.Child.Home) {
            HomeComponent homeComponent = ((RootComponent.Child.Home) child).f2225a;
            Value value = homeComponent.b1;
            GettingList gettingList2 = ((ChildStack) value.a()).c;
            ArrayList arrayList2 = new ArrayList(CollectionsKt.v(gettingList2, 10));
            Iterator<T> it2 = gettingList2.iterator();
            while (it2.hasNext()) {
                String strF = Reflection.a(((Child.Created) it2.next()).f12283a.getClass()).f();
                if (strF == null) {
                    strF = "Unknown";
                }
                arrayList2.add(strF);
            }
            String strF2 = Reflection.a(((ChildStack) value.a()).f12382a.f12283a.getClass()).f();
            NavigationTabAppModel navigationTabAppModel = ((HomeScreenFragmentViewState) homeComponent.t0().a()).f3225a;
            String strName2 = (navigationTabAppModel == null || (bottomNavTabTypeA2 = BottomNavTabAppModelKt.a(navigationTabAppModel)) == null) ? null : bottomNavTabTypeA2.name();
            NavigationTabAppModel navigationTabAppModel2 = ((HomeScreenFragmentViewState) homeComponent.t0().a()).b;
            String strName3 = (navigationTabAppModel2 == null || (bottomNavTabTypeA = BottomNavTabAppModelKt.a(navigationTabAppModel2)) == null) ? null : bottomNavTabTypeA.name();
            Object obj3 = created.f12283a;
            HomeArgs homeArgs = obj3 instanceof HomeArgs ? (HomeArgs) obj3 : null;
            boolean z = (homeArgs != null ? homeArgs.d : null) != null;
            int size = arrayList2.size();
            String strO = CollectionsKt.O(arrayList2, " > ", null, null, null, 62);
            StringBuilder sbP = nf1.p(size, " home(tabStackSize=", ", activeTab=", strF2, ", tabStack=");
            cb0.t(sbP, strO, ", selected=", strName2, ", start=");
            sbP.append(strName3);
            sbP.append(", homeRefreshToken=");
            sbP.append(z);
            sbP.append(")");
            string = sbP.toString();
        } else {
            string = "";
        }
        return vo1.A(strP, string);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        n(false);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
    public final void n(boolean z) {
        int iB = ((ChaloBuildConfig) this.f1.getValue()).b();
        ?? r3 = this.g1;
        if (iB >= 33) {
            if (z) {
                Language language = (Language) ((LanguageFeature) r3.getValue()).h().getValue();
                if (language == null) {
                    language = Language.ENGLISH;
                }
                LocaleListCompat localeListCompatForLanguageTags = LocaleListCompat.forLanguageTags(language.getLocale());
                Intrinsics.h(localeListCompatForLanguageTags, "forLanguageTags(...)");
                AppCompatDelegate.setApplicationLocales(localeListCompatForLanguageTags);
                return;
            }
            return;
        }
        if (z) {
            return;
        }
        Language language2 = (Language) ((LanguageFeature) r3.getValue()).h().getValue();
        if (language2 == null) {
            language2 = Language.ENGLISH;
        }
        LocaleListCompat localeListCompatForLanguageTags2 = LocaleListCompat.forLanguageTags(language2.getLocale());
        Intrinsics.h(localeListCompatForLanguageTags2, "forLanguageTags(...)");
        AppCompatDelegate.setApplicationLocales(localeListCompatForLanguageTags2);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    public final void o(Intent intent) {
        Pair pairC = ((ThoughtNudgeContract) this.C0.getValue()).c();
        ?? r1 = this.a0;
        DeepLinkResolutionRequest deepLinkResolutionRequest = null;
        if (pairC != null) {
            ((DeepLinkRuntime) r1.getValue()).a(new DeepLinkResolutionRequest((String) pairC.d(), null, null));
            return;
        }
        if (intent != null) {
            String dataString = intent.getDataString();
            if (dataString == null) {
                Uri data = intent.getData();
                dataString = data != null ? data.toString() : null;
            }
            if (dataString != null && !StringsKt.F(dataString)) {
                deepLinkResolutionRequest = new DeepLinkResolutionRequest(dataString, intent.getStringExtra("header"), intent.getStringExtra("source"));
            }
        }
        if (deepLinkResolutionRequest != null) {
            ((DeepLinkRuntime) r1.getValue()).a(deepLinkResolutionRequest);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        BuildersKt.d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new AnonymousClass1(i, i2, intent, null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x01b2  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v10, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v16, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v19, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v22, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v25, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v28, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v31, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v34, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v37, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v41, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v10, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v18, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v20, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v22, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v24, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v26, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v13, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v28, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v5, types: [dh0] */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) throws Exception {
        Object objB;
        List listR;
        SplashScreen.INSTANCE.installSplashScreen(this);
        super.onCreate(bundle);
        o1.incrementAndGet();
        SystemBarStyle.Companion companion = SystemBarStyle.INSTANCE;
        EdgeToEdge.enable(this, companion.dark(-16777216), companion.dark(-16777216));
        Window window = getWindow();
        Intrinsics.h(window, "getWindow(...)");
        View decorView = window.getDecorView();
        ViewGroup viewGroup = decorView instanceof ViewGroup ? (ViewGroup) decorView : null;
        boolean z = false;
        if (viewGroup != null) {
            View viewFindViewWithTag = viewGroup.findViewWithTag("edge_to_edge_status_scrim");
            View viewFindViewWithTag2 = viewGroup.findViewWithTag("edge_to_edge_nav_scrim");
            if (viewFindViewWithTag == null) {
                viewFindViewWithTag = new View(viewGroup.getContext());
                viewFindViewWithTag.setTag("edge_to_edge_status_scrim");
                viewFindViewWithTag.setBackgroundColor(-16777216);
                viewFindViewWithTag.setImportantForAccessibility(2);
                viewFindViewWithTag.setClickable(false);
                viewFindViewWithTag.setFocusable(false);
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, 0);
                layoutParams.gravity = 48;
                viewGroup.addView(viewFindViewWithTag, layoutParams);
            }
            if (viewFindViewWithTag2 == null) {
                viewFindViewWithTag2 = new View(viewGroup.getContext());
                viewFindViewWithTag2.setTag("edge_to_edge_nav_scrim");
                viewFindViewWithTag2.setBackgroundColor(-16777216);
                viewFindViewWithTag2.setImportantForAccessibility(2);
                viewFindViewWithTag2.setClickable(false);
                viewFindViewWithTag2.setFocusable(false);
                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, 0);
                layoutParams2.gravity = 80;
                viewGroup.addView(viewFindViewWithTag2, layoutParams2);
            }
            ViewCompat.setOnApplyWindowInsetsListener(viewGroup, new a7(21, viewFindViewWithTag, viewFindViewWithTag2));
        }
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.hide();
        }
        n(true);
        ((PermissionHandlerSetter) this.s0.getValue()).b(this.G0);
        ((ImagePickerSetter) this.p0.getValue()).a(this.H0);
        ((PhoneNumberHintHandlerSetter) this.v0.getValue()).a(this.I0);
        TruecallerSetupHandlerProvider truecallerSetupHandlerProvider = (TruecallerSetupHandlerProvider) this.x0.getValue();
        truecallerSetupHandlerProvider.getClass();
        Lazy handler = this.F0;
        Intrinsics.i(handler, "handler");
        truecallerSetupHandlerProvider.a(handler);
        ((RazorpaySdkSetter) this.w0.getValue()).a(this.K0);
        ((JuspayControllerSetter) this.n0.getValue()).b(new JuspayPlatformSdkFactory() { // from class: dh0
            @Override // app.chalo.juspay.JuspayPlatformSdkFactory
            public final HyperServiceHolderSDKAndroid a() {
                AtomicInteger atomicInteger = MainActivity.o1;
                return new HyperServiceHolderSDKAndroid(this.f15462a);
            }
        });
        ((PhonepeSdkSetter) this.t0.getValue()).a(this.M0);
        ((InstalledUpiAppsHelperSetter) this.q0.getValue()).a(this.L0);
        ((AppRatingProcessManagerSetter) this.i0.getValue()).a(this.N0);
        ((GpsRequestHandlerSetter) this.m0.getValue()).a(this.O0);
        ((ManualBluetoothTurnOnDelegateProvider) this.r0.getValue()).a(this.P0);
        ((UvikSdkManagerProvider) this.y0.getValue()).a(this.J0);
        ((SosFeaturePlatformDelegateProviderImpl) this.z0.getValue()).f9440a = this.Q0;
        ((PlotlineTrackContextProvider) this.b1.getValue()).a(new PlotlineTrackContext(new CommonContext(this)));
        ((DeviceNfcTapPaySuppressorSetter) this.D0.getValue()).a(this.R0);
        BuildersKt.d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new MainActivity$startRootDetection$1(this, null), 3);
        String stringExtra = getIntent().getStringExtra("notification_payload_meta_data");
        if (stringExtra != null) {
            try {
                Json json = ChaloJson.b;
                json.getClass();
                objB = json.b(stringExtra, new ArrayListSerializer(SceneArgs.INSTANCE.serializer()));
            } catch (Exception unused) {
                objB = null;
            }
            listR = (List) objB;
            if (listR == null) {
                listR = CollectionsKt.R(SplashArgs.INSTANCE);
            }
        } else {
            listR = CollectionsKt.R(SplashArgs.INSTANCE);
        }
        f1 f1Var = new f1(4);
        DefaultBackDispatcher defaultBackDispatcherA = AndroidBackHandlerKt.a(getOnBackPressedDispatcher());
        DefaultStateKeeperDispatcher defaultStateKeeperDispatcherA = AndroidExtKt.a(this, f1Var);
        StringSerializer stringSerializer = StringSerializer.f18170a;
        String str = (String) defaultStateKeeperDispatcherA.a("DefaultComponentContext_state_marker", stringSerializer);
        defaultStateKeeperDispatcherA.d("DefaultComponentContext_state_marker", stringSerializer, new yv(7));
        Lifecycle lifecycleA = com.arkivanov.essenty.lifecycle.AndroidExtKt.a(getLifecycle());
        boolean z2 = str == null;
        ViewModelStore viewModelStore = getViewModelStore();
        Intrinsics.i(viewModelStore, "viewModelStore");
        InstanceKeeperViewModel instanceKeeperViewModel = (InstanceKeeperViewModel) new ViewModelProvider(viewModelStore, new AndroidExtKt$InstanceKeeper$1(), null, 4, null).get(InstanceKeeperViewModel.class);
        if (z2) {
            instanceKeeperViewModel.f12399a.destroy();
            instanceKeeperViewModel.f12399a = new DefaultInstanceKeeperDispatcher();
        }
        DefaultComponentContext defaultComponentContext = new DefaultComponentContext(lifecycleA, defaultStateKeeperDispatcherA, instanceKeeperViewModel.f12399a, defaultBackDispatcherA);
        Scope scope = GlobalContext.f18817a.a().c.d;
        ClassReference classReferenceA = Reflection.a(RootComponent.class);
        scope.getClass();
        RootComponent rootComponent = (RootComponent) scope.d(classReferenceA, ParametersHolderKt.a(listR, defaultComponentContext), null);
        this.k1 = rootComponent;
        if (((SdkIntegrationPolicyManager) this.d0.getValue()).f1078a.e) {
            ExitInterstitialConfigProvider exitInterstitialConfigProvider = (ExitInterstitialConfigProvider) this.g0.getValue();
            ExitInterstitialCapStore exitInterstitialCapStore = (ExitInterstitialCapStore) this.f0.getValue();
            ExitInterstitialDecisionEngine exitInterstitialDecisionEngine = (ExitInterstitialDecisionEngine) this.h0.getValue();
            ExitInterstitialAdManager exitInterstitialAdManager = (ExitInterstitialAdManager) this.e0.getValue();
            AnalyticsContract analyticsContract = (AnalyticsContract) this.c0.getValue();
            LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(this);
            final ExitInterstitialExitGate exitInterstitialExitGate = new ExitInterstitialExitGate(exitInterstitialConfigProvider, exitInterstitialCapStore, exitInterstitialDecisionEngine, exitInterstitialAdManager, analyticsContract, lifecycleScope);
            this.n1 = exitInterstitialExitGate;
            if (exitInterstitialExitGate.k == null) {
                exitInterstitialConfigProvider.invalidate();
                exitInterstitialExitGate.e(TtmlNode.START, false);
                exitInterstitialExitGate.k = BuildersKt.d(lifecycleScope, null, null, new ExitInterstitialExitGate$start$1(exitInterstitialExitGate, null), 3);
            }
            ChildStack rootStack = (ChildStack) rootComponent.g().a();
            Intrinsics.i(rootStack, "rootStack");
            if (rootStack.c.size() == 1 && (rootStack.f12382a.b instanceof RootComponent.Child.Home)) {
                z = true;
            }
            BackCallbackKt$BackCallback$1 backCallbackKt$BackCallback$1A = BackCallbackKt.a(z, new Function0() { // from class: app.chalo.android.a
                /* JADX WARN: Code duplicated, block: B:64:0x0151  */
                /* JADX WARN: Code duplicated, block: B:65:0x0154  */
                /* JADX WARN: Code duplicated, block: B:68:0x01b1  */
                /* JADX WARN: Code duplicated, block: B:69:0x01c7  */
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    ExitInterstitialAdAvailability exitInterstitialAdAvailability;
                    ExitInterstitialLoadedAd exitInterstitialLoadedAd;
                    Long l;
                    long j;
                    ExitInterstitialDecision exitInterstitialDecision;
                    String analyticsValue;
                    ExitInterstitialExitGate exitInterstitialExitGate2 = exitInterstitialExitGate;
                    MainActivity mainActivity = this;
                    AtomicInteger atomicInteger = MainActivity.o1;
                    MainActivity$registerExitInterstitialExitGate$callback$1$1 mainActivity$registerExitInterstitialExitGate$callback$1$1 = new MainActivity$registerExitInterstitialExitGate$callback$1$1(0, mainActivity, MainActivity.class, "finish", "finish()V", 0);
                    if (!exitInterstitialExitGate2.i) {
                        if (exitInterstitialExitGate2.h) {
                            exitInterstitialExitGate2.h = false;
                            exitInterstitialExitGate2.d.i("explicit_exit", "explicit_exit_reset_loaded", "explicit_exit_reset_showing");
                            mainActivity$registerExitInterstitialExitGate$callback$1$1.invoke();
                        } else {
                            ExitInterstitialAdConfig exitInterstitialAdConfigB = exitInterstitialExitGate2.f903a.b();
                            if (!exitInterstitialExitGate2.m || exitInterstitialAdConfigB == null) {
                                ExitInterstitialDecisionReason exitInterstitialDecisionReason = ExitInterstitialDecisionReason.SUPPRESSED_NOT_READY;
                                exitInterstitialExitGate2.i = true;
                                BuildersKt.d(exitInterstitialExitGate2.f, null, null, new ExitInterstitialExitGate$handleSuppressedExit$1(exitInterstitialExitGate2, exitInterstitialDecisionReason, mainActivity$registerExitInterstitialExitGate$callback$1$1, "cache_warming_delegate", null), 3);
                            } else {
                                ExitInterstitialAdManager exitInterstitialAdManager2 = exitInterstitialExitGate2.d;
                                synchronized (exitInterstitialAdManager2.j) {
                                    try {
                                        if (exitInterstitialAdManager2.r == null || exitInterstitialAdManager2.o) {
                                            exitInterstitialAdAvailability = new ExitInterstitialAdAvailability(false, false);
                                        } else {
                                            Long l2 = exitInterstitialAdManager2.s;
                                            long jLongValue = ((Number) exitInterstitialAdManager2.f.invoke()).longValue() - (l2 != null ? l2.longValue() : 0L);
                                            if (jLongValue > DefaultRefreshIntervals.REMOTE_CONFIG_FETCH_INTERVAL) {
                                                exitInterstitialLoadedAd = exitInterstitialAdManager2.r;
                                                exitInterstitialAdManager2.r = null;
                                                exitInterstitialAdManager2.s = null;
                                                String message = "availability ready=false reason=expired ageMs=" + jLongValue;
                                                Intrinsics.i(message, "message");
                                                exitInterstitialAdAvailability = new ExitInterstitialAdAvailability(false, true);
                                            } else {
                                                String message2 = "availability ready=true ageMs=" + jLongValue;
                                                Intrinsics.i(message2, "message");
                                                exitInterstitialAdAvailability = new ExitInterstitialAdAvailability(true, false);
                                            }
                                        }
                                        exitInterstitialLoadedAd = null;
                                    } catch (Throwable th) {
                                        throw th;
                                    }
                                }
                                if (exitInterstitialLoadedAd != null) {
                                    ExitInterstitialAdManager.c(exitInterstitialLoadedAd, "expired");
                                }
                                ExitInterstitialCapState exitInterstitialCapState = exitInterstitialExitGate2.n;
                                long jLongValue2 = ((Number) exitInterstitialExitGate2.g.invoke()).longValue();
                                int i = exitInterstitialCapState.f778a + 1;
                                exitInterstitialExitGate2.c.getClass();
                                int i2 = exitInterstitialAdConfigB.e;
                                if (!exitInterstitialAdConfigB.d) {
                                    exitInterstitialDecision = new ExitInterstitialDecision(false, ExitInterstitialDecisionReason.SUPPRESSED_DISABLED);
                                } else if (exitInterstitialAdAvailability.b) {
                                    exitInterstitialDecision = new ExitInterstitialDecision(false, ExitInterstitialDecisionReason.SUPPRESSED_EXPIRED);
                                } else {
                                    if (exitInterstitialAdAvailability.f769a) {
                                        int i3 = i < 1 ? 1 : i;
                                        if (i2 == 0 || (l = exitInterstitialCapState.b) == null) {
                                            j = jLongValue2;
                                        } else {
                                            j = jLongValue2;
                                            if (j - l.longValue() < ((long) i2) * 60000) {
                                                exitInterstitialDecision = new ExitInterstitialDecision(false, ExitInterstitialDecisionReason.SUPPRESSED_COOLDOWN);
                                            }
                                        }
                                        int i4 = exitInterstitialAdConfigB.f;
                                        exitInterstitialDecision = (i4 == 0 || i3 % i4 == 0) ? new ExitInterstitialDecision(true, ExitInterstitialDecisionReason.SHOWN) : new ExitInterstitialDecision(false, ExitInterstitialDecisionReason.SUPPRESSED_NTH);
                                    } else {
                                        exitInterstitialDecision = new ExitInterstitialDecision(false, ExitInterstitialDecisionReason.SUPPRESSED_NOT_READY);
                                    }
                                    boolean z3 = exitInterstitialAdConfigB.d;
                                    int i5 = exitInterstitialAdConfigB.f;
                                    int i6 = exitInterstitialAdConfigB.e;
                                    boolean z4 = exitInterstitialAdAvailability.f769a;
                                    boolean z5 = exitInterstitialAdAvailability.b;
                                    int i7 = exitInterstitialCapState.f778a;
                                    Long l3 = exitInterstitialCapState.b;
                                    if (exitInterstitialDecision.f779a) {
                                        analyticsValue = "eligible";
                                    } else {
                                        analyticsValue = exitInterstitialDecision.b.getAnalyticsValue();
                                    }
                                    String message3 = "decision enabled=" + z3 + " nth=" + i5 + " cooldownMin=" + i6 + " ready=" + z4 + " expired=" + z5 + " currentExitCount=" + i7 + " nextExitCount=" + i + " lastShownAt=" + l3 + " reason=" + analyticsValue;
                                    Intrinsics.i(message3, "message");
                                    if (exitInterstitialDecision.f779a) {
                                        exitInterstitialExitGate2.i = true;
                                        BuildersKt.d(exitInterstitialExitGate2.f, null, null, new ExitInterstitialExitGate$requestExit$1(exitInterstitialExitGate2, mainActivity, mainActivity$registerExitInterstitialExitGate$callback$1$1, j, null), 3);
                                    } else {
                                        ExitInterstitialDecisionReason exitInterstitialDecisionReason2 = exitInterstitialDecision.b;
                                        exitInterstitialExitGate2.i = true;
                                        BuildersKt.d(exitInterstitialExitGate2.f, null, null, new ExitInterstitialExitGate$handleSuppressedExit$1(exitInterstitialExitGate2, exitInterstitialDecisionReason2, mainActivity$registerExitInterstitialExitGate$callback$1$1, "suppress_delegate", null), 3);
                                    }
                                }
                                j = jLongValue2;
                                boolean z6 = exitInterstitialAdConfigB.d;
                                int i8 = exitInterstitialAdConfigB.f;
                                int i9 = exitInterstitialAdConfigB.e;
                                boolean z7 = exitInterstitialAdAvailability.f769a;
                                boolean z8 = exitInterstitialAdAvailability.b;
                                int i10 = exitInterstitialCapState.f778a;
                                Long l4 = exitInterstitialCapState.b;
                                if (exitInterstitialDecision.f779a) {
                                    analyticsValue = "eligible";
                                } else {
                                    analyticsValue = exitInterstitialDecision.b.getAnalyticsValue();
                                }
                                String message4 = "decision enabled=" + z6 + " nth=" + i8 + " cooldownMin=" + i9 + " ready=" + z7 + " expired=" + z8 + " currentExitCount=" + i10 + " nextExitCount=" + i + " lastShownAt=" + l4 + " reason=" + analyticsValue;
                                Intrinsics.i(message4, "message");
                                if (exitInterstitialDecision.f779a) {
                                    ExitInterstitialDecisionReason exitInterstitialDecisionReason3 = exitInterstitialDecision.b;
                                    exitInterstitialExitGate2.i = true;
                                    BuildersKt.d(exitInterstitialExitGate2.f, null, null, new ExitInterstitialExitGate$handleSuppressedExit$1(exitInterstitialExitGate2, exitInterstitialDecisionReason3, mainActivity$registerExitInterstitialExitGate$callback$1$1, "suppress_delegate", null), 3);
                                } else {
                                    exitInterstitialExitGate2.i = true;
                                    BuildersKt.d(exitInterstitialExitGate2.f, null, null, new ExitInterstitialExitGate$requestExit$1(exitInterstitialExitGate2, mainActivity, mainActivity$registerExitInterstitialExitGate$callback$1$1, j, null), 3);
                                }
                            }
                        }
                    }
                    return Unit.f17538a;
                }
            }, Integer.MIN_VALUE, 28);
            this.l1 = backCallbackKt$BackCallback$1A;
            rootComponent.getD().a(backCallbackKt$BackCallback$1A);
            this.m1 = rootComponent.g().b(new dd0(backCallbackKt$BackCallback$1A, 22));
        }
        if (((ChaloBuildConfig) this.f1.getValue()).n()) {
            getOnBackPressedDispatcher().addCallback(this, new OnBackPressedCallback() { // from class: app.chalo.android.MainActivity$registerBackDebugLoggerIfNeeded$1
                {
                    super(true);
                }

                @Override // androidx.activity.OnBackPressedCallback
                public final void handleOnBackPressed() {
                    MainActivity mainActivity = this.f904a;
                    String message = "system back pressed | before=" + MainActivity.m(mainActivity);
                    Intrinsics.i(message, "message");
                    setEnabled(false);
                    try {
                        mainActivity.getOnBackPressedDispatcher().onBackPressed();
                        setEnabled(true);
                        vo1.x("system back handled | after=", MainActivity.m(mainActivity), "message");
                    } catch (Throwable th) {
                        setEnabled(true);
                        throw th;
                    }
                }
            });
        }
        new DecomposeNavigationAdapter(rootComponent, (ChaloNavigationManager) AndroidKoinScopeExtKt.a(this).d(Reflection.a(ChaloNavigationManager.class), null, null), (CoroutineContextProvider) this.k0.getValue());
        new DecomposeNavigationScreenTracker(rootComponent, (ActiveSceneInStackResolver) AndroidKoinScopeExtKt.a(this).d(Reflection.a(ActiveSceneInStackResolver.class), null, null));
        ComponentActivityKt.setContent$default(this, null, ComposableLambdaKt.composableLambdaInstance(-654008603, true, new h3(23, this, rootComponent)), 1, null);
        ((DeepLinkNavigationHandler) this.b0.getValue()).b();
        o(getIntent());
        ((JuspayControllerProvider) this.o0.getValue()).d();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v18, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v21, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v24, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v27, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v30, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v33, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v36, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v39, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Object, kotlin.Lazy] */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() throws Exception {
        Cancellation cancellation = this.m1;
        if (cancellation != null) {
            cancellation.cancel();
        }
        this.m1 = null;
        BackCallbackKt$BackCallback$1 backCallbackKt$BackCallback$1 = this.l1;
        if (backCallbackKt$BackCallback$1 != null) {
            RootComponent rootComponent = this.k1;
            BackHandler d = rootComponent != null ? rootComponent.getD() : null;
            if (d != null && d.c(backCallbackKt$BackCallback$1)) {
                d.d(backCallbackKt$BackCallback$1);
            }
        }
        ExitInterstitialExitGate exitInterstitialExitGate = this.n1;
        if (exitInterstitialExitGate != null) {
            Job job = exitInterstitialExitGate.k;
            if (job != null) {
                ((JobSupport) job).cancel(null);
            }
            exitInterstitialExitGate.k = null;
            Job job2 = exitInterstitialExitGate.l;
            if (job2 != null) {
                ((JobSupport) job2).cancel(null);
            }
            exitInterstitialExitGate.l = null;
            exitInterstitialExitGate.j = false;
            exitInterstitialExitGate.i = false;
            exitInterstitialExitGate.h = false;
        }
        this.n1 = null;
        this.l1 = null;
        super.onDestroy();
        AtomicInteger atomicInteger = o1;
        if (atomicInteger.decrementAndGet() <= 0) {
            atomicInteger.set(0);
            ((TruecallerSetupHandlerProvider) this.x0.getValue()).a(null);
            ((PhoneNumberHintHandlerSetter) this.v0.getValue()).b();
            ((PermissionHandlerSetter) this.s0.getValue()).a();
            ((ImagePickerSetter) this.p0.getValue()).b();
            ((RazorpaySdkSetter) this.w0.getValue()).b();
            ((JuspayControllerSetter) this.n0.getValue()).a();
            ((PhonepeSdkSetter) this.t0.getValue()).b();
            ((InstalledUpiAppsHelperSetter) this.q0.getValue()).remove();
            ((AppRatingProcessManagerSetter) this.i0.getValue()).c();
            ((GpsRequestHandlerSetter) this.m0.getValue()).b();
            ((SosFeaturePlatformDelegateProviderImpl) this.z0.getValue()).f9440a = null;
            ((PlotlineTrackContextProvider) this.b1.getValue()).a(null);
            DeepLinkNavigationHandler deepLinkNavigationHandler = (DeepLinkNavigationHandler) this.b0.getValue();
            Job job3 = deepLinkNavigationHandler.l;
            if (job3 != null) {
                ((JobSupport) job3).cancel(null);
            }
            deepLinkNavigationHandler.l = null;
            DeepLinkResumeMonitor deepLinkResumeMonitor = deepLinkNavigationHandler.m;
            Job job4 = deepLinkResumeMonitor.c;
            if (job4 != null) {
                ((JobSupport) job4).cancel(null);
            }
            deepLinkResumeMonitor.c = null;
            deepLinkResumeMonitor.d = false;
            ((DeviceNfcTapPaySuppressorSetter) this.D0.getValue()).remove();
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onNewIntent(Intent intent) {
        Intrinsics.i(intent, "intent");
        super.onNewIntent(intent);
        o(intent);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
        ExitInterstitialExitGate exitInterstitialExitGate = this.n1;
        if (exitInterstitialExitGate != null) {
            exitInterstitialExitGate.b("host_resume_missing_close");
        }
    }
}
