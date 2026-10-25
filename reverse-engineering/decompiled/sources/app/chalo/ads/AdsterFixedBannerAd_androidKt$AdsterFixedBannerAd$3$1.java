package app.chalo.ads;

import android.content.Context;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import app.chalo.crashlytics.CrashlyticsLog;
import com.adster.sdk.mediation.AdError;
import com.adster.sdk.mediation.AdEventsListener;
import com.adster.sdk.mediation.AdRequestConfiguration;
import com.adster.sdk.mediation.AdSterAdLoader;
import com.adster.sdk.mediation.MediationAdListener;
import com.adster.sdk.mediation.MediationBannerAd;
import defpackage.vo1;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.math.MathKt;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import kotlinx.coroutines.scheduling.DefaultScheduler;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.ads.AdsterFixedBannerAd_androidKt$AdsterFixedBannerAd$3$1", f = "AdsterFixedBannerAd.android.kt", l = {141, 146}, m = "invokeSuspend", v = 1)
final class AdsterFixedBannerAd_androidKt$AdsterFixedBannerAd$3$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ AdsterFixedBannerAnalyticsHelper $analyticsHelper;
    final /* synthetic */ FrameLayout $container;
    final /* synthetic */ Context $context;
    final /* synthetic */ MutableState<MediationBannerAd> $currentAd$delegate;
    final /* synthetic */ MutableState<Boolean> $hasRendered$delegate;
    final /* synthetic */ State<AdsterSdkInitState> $initState$delegate;
    final /* synthetic */ MutableState<Boolean> $isTerminalFailure$delegate;
    final /* synthetic */ String $logContext;
    final /* synthetic */ Function1<Integer, Unit> $onAdFailedToLoad;
    final /* synthetic */ Function2<Integer, Integer, Unit> $onAdLoadedSize;
    final /* synthetic */ Function1<CrashlyticsLog, Unit> $onCrashLoggingRequired;
    final /* synthetic */ String $placementName;
    final /* synthetic */ MutableIntState $reservedHeightDp$delegate;
    final /* synthetic */ BannerAdSlot $slot;
    final /* synthetic */ AdsterFixedBannerTargetingHelper $targetingHelper;
    int label;

    /* JADX INFO: renamed from: app.chalo.ads.AdsterFixedBannerAd_androidKt$AdsterFixedBannerAd$3$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "app.chalo.ads.AdsterFixedBannerAd_androidKt$AdsterFixedBannerAd$3$1$1", f = "AdsterFixedBannerAd.android.kt", l = {}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ AdsterFixedBannerAnalyticsHelper $analyticsHelper;
        final /* synthetic */ FrameLayout $container;
        final /* synthetic */ Context $context;
        final /* synthetic */ MutableState<MediationBannerAd> $currentAd$delegate;
        final /* synthetic */ MutableState<Boolean> $hasRendered$delegate;
        final /* synthetic */ MutableState<Boolean> $isTerminalFailure$delegate;
        final /* synthetic */ String $logContext;
        final /* synthetic */ Function1<Integer, Unit> $onAdFailedToLoad;
        final /* synthetic */ Function2<Integer, Integer, Unit> $onAdLoadedSize;
        final /* synthetic */ String $placementName;
        final /* synthetic */ long $requestStartedAt;
        final /* synthetic */ MutableIntState $reservedHeightDp$delegate;
        final /* synthetic */ BannerAdSlot $slot;
        final /* synthetic */ Map<String, String> $targeting;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Context context, String str, Map map, String str2, AdsterFixedBannerAnalyticsHelper adsterFixedBannerAnalyticsHelper, BannerAdSlot bannerAdSlot, FrameLayout frameLayout, Function1 function1, long j, MutableState mutableState, MutableState mutableState2, MutableIntState mutableIntState, MutableState mutableState3, Function2 function2, Continuation continuation) {
            super(2, continuation);
            this.$context = context;
            this.$placementName = str;
            this.$targeting = map;
            this.$logContext = str2;
            this.$analyticsHelper = adsterFixedBannerAnalyticsHelper;
            this.$slot = bannerAdSlot;
            this.$container = frameLayout;
            this.$onAdFailedToLoad = function1;
            this.$requestStartedAt = j;
            this.$isTerminalFailure$delegate = mutableState;
            this.$hasRendered$delegate = mutableState2;
            this.$reservedHeightDp$delegate = mutableIntState;
            this.$currentAd$delegate = mutableState3;
            this.$onAdLoadedSize = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.$context, this.$placementName, this.$targeting, this.$logContext, this.$analyticsHelper, this.$slot, this.$container, this.$onAdFailedToLoad, this.$requestStartedAt, this.$isTerminalFailure$delegate, this.$hasRendered$delegate, this.$reservedHeightDp$delegate, this.$currentAd$delegate, this.$onAdLoadedSize, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            ((AnonymousClass1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            AdRequestConfiguration.Builder builder = AdRequestConfiguration.INSTANCE.builder(this.$context, this.$placementName);
            for (Map.Entry<String, String> entry : this.$targeting.entrySet()) {
                builder.addCustomTargetingValue(entry.getKey(), entry.getValue());
            }
            AdSterAdLoader.Builder builder2 = AdSterAdLoader.INSTANCE.builder();
            final FrameLayout frameLayout = this.$container;
            final AdsterFixedBannerAnalyticsHelper adsterFixedBannerAnalyticsHelper = this.$analyticsHelper;
            final String str = this.$placementName;
            final BannerAdSlot bannerAdSlot = this.$slot;
            final Function1<Integer, Unit> function1 = this.$onAdFailedToLoad;
            final String str2 = this.$logContext;
            final long j = this.$requestStartedAt;
            final Context context = this.$context;
            final MutableState<Boolean> mutableState = this.$isTerminalFailure$delegate;
            final MutableState<Boolean> mutableState2 = this.$hasRendered$delegate;
            final MutableIntState mutableIntState = this.$reservedHeightDp$delegate;
            final MutableState<MediationBannerAd> mutableState3 = this.$currentAd$delegate;
            final Function2<Integer, Integer, Unit> function2 = this.$onAdLoadedSize;
            AdSterAdLoader.Builder builderWithAdsListener = builder2.withAdsListener(new MediationAdListener() { // from class: app.chalo.ads.AdsterFixedBannerAd_androidKt$AdsterFixedBannerAd$3$1$1$loader$1
                @Override // com.adster.sdk.mediation.MediationAdListener, com.adster.sdk.mediation.AdListener
                public final void onBannerAdLoaded(MediationBannerAd ad) {
                    Intrinsics.i(ad, "ad");
                    super.onBannerAdLoaded(ad);
                    final View view = ad.getView();
                    BannerAdSlot slot = bannerAdSlot;
                    String adUnitId = str;
                    AdsterFixedBannerAnalyticsHelper adsterFixedBannerAnalyticsHelper2 = adsterFixedBannerAnalyticsHelper;
                    FrameLayout frameLayout2 = frameLayout;
                    if (view == null) {
                        Boolean bool = Boolean.TRUE;
                        mutableState.setValue(bool);
                        mutableState2.setValue(bool);
                        mutableIntState.setIntValue(0);
                        mutableState3.setValue(null);
                        frameLayout2.removeAllViews();
                        try {
                            ad.destroy();
                        } catch (Throwable unused) {
                        }
                        adsterFixedBannerAnalyticsHelper2.a(adUnitId, slot, -2, "loaded_null_view");
                        throw null;
                    }
                    long jCurrentTimeMillis = System.currentTimeMillis() - j;
                    AdsterFixedBannerAnalyticsHelper adsterFixedBannerAnalyticsHelper3 = adsterFixedBannerAnalyticsHelper;
                    String str3 = str;
                    BannerAdSlot bannerAdSlot2 = bannerAdSlot;
                    String str4 = str2;
                    final a aVar = new a(adsterFixedBannerAnalyticsHelper3, str3, bannerAdSlot2, str4, function2, mutableState2, mutableIntState);
                    frameLayout2.removeAllViews();
                    frameLayout2.addView(view, new FrameLayout.LayoutParams(-1, -2));
                    String message = str4 + " viewAttached class=" + view.getClass().getSimpleName();
                    Intrinsics.i(message, "message");
                    final float f = context.getResources().getDisplayMetrics().density;
                    ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                    ViewTreeObserver.OnDrawListener onDrawListener = new ViewTreeObserver.OnDrawListener() { // from class: app.chalo.ads.AdsterFixedBannerAd_androidKt$attachBannerView$onDrawListener$1
                        @Override // android.view.ViewTreeObserver.OnDrawListener
                        public final void onDraw() {
                            View view2 = view;
                            int measuredWidth = view2.getMeasuredWidth();
                            int measuredHeight = view2.getMeasuredHeight();
                            if (measuredWidth <= 0 || measuredHeight <= 0) {
                                return;
                            }
                            float f2 = f;
                            aVar.invoke(Integer.valueOf(MathKt.f(measuredWidth / f2)), Integer.valueOf(MathKt.f(measuredHeight / f2)));
                            view2.post(new defpackage.b(3, view2, this));
                        }
                    };
                    if (viewTreeObserver.isAlive()) {
                        viewTreeObserver.addOnDrawListener(onDrawListener);
                    }
                    adsterFixedBannerAnalyticsHelper2.getClass();
                    Intrinsics.i(adUnitId, "adUnitId");
                    Intrinsics.i(slot, "slot");
                    AdsterFixedBannerAnalyticsHelper.b(adUnitId, slot, MapsKt.h(new Pair("adLoadTime", Long.valueOf(jCurrentTimeMillis))));
                    throw null;
                }

                @Override // com.adster.sdk.mediation.AdListener
                public final void onFailure(AdError adError) {
                    Intrinsics.i(adError, "adError");
                    int errorCode = adError.getErrorCode();
                    String errorMessage = adError.getErrorMessage();
                    if (errorMessage == null) {
                        errorMessage = "";
                    }
                    adsterFixedBannerAnalyticsHelper.a(str, bannerAdSlot, errorCode, errorMessage);
                    throw null;
                }
            });
            final AdsterFixedBannerAnalyticsHelper adsterFixedBannerAnalyticsHelper2 = this.$analyticsHelper;
            final String str3 = this.$placementName;
            final BannerAdSlot bannerAdSlot2 = this.$slot;
            final String str4 = this.$logContext;
            builderWithAdsListener.withAdsEventsListener(new AdEventsListener(str3, bannerAdSlot2, str4) { // from class: app.chalo.ads.AdsterFixedBannerAd_androidKt$AdsterFixedBannerAd$3$1$1$loader$2
                public final /* synthetic */ String b;
                public final /* synthetic */ BannerAdSlot c;

                @Override // com.adster.sdk.mediation.AdEventsListener
                public final void onAdClicked() {
                    AdsterFixedBannerAnalyticsHelper adsterFixedBannerAnalyticsHelper3 = this.f721a;
                    adsterFixedBannerAnalyticsHelper3.getClass();
                    String adUnitId = this.b;
                    Intrinsics.i(adUnitId, "adUnitId");
                    BannerAdSlot slot = this.c;
                    Intrinsics.i(slot, "slot");
                    AdsterFixedBannerAnalyticsHelper.c(adsterFixedBannerAnalyticsHelper3, adUnitId, slot);
                    throw null;
                }

                @Override // com.adster.sdk.mediation.AdEventsListener
                public final void onAdImpression() {
                    AdsterFixedBannerAnalyticsHelper adsterFixedBannerAnalyticsHelper3 = this.f721a;
                    adsterFixedBannerAnalyticsHelper3.getClass();
                    String adUnitId = this.b;
                    Intrinsics.i(adUnitId, "adUnitId");
                    BannerAdSlot slot = this.c;
                    Intrinsics.i(slot, "slot");
                    AdsterFixedBannerAnalyticsHelper.c(adsterFixedBannerAnalyticsHelper3, adUnitId, slot);
                    throw null;
                }

                @Override // com.adster.sdk.mediation.AdEventsListener
                public final void onAdRevenuePaid(double d, String adUnitId, String network) {
                    Intrinsics.i(adUnitId, "adUnitId");
                    Intrinsics.i(network, "network");
                    if (StringsKt.F(adUnitId)) {
                        adUnitId = this.b;
                    }
                    this.f721a.getClass();
                    Intrinsics.i(adUnitId, "adUnitId");
                    BannerAdSlot slot = this.c;
                    Intrinsics.i(slot, "slot");
                    AdsterFixedBannerAnalyticsHelper.b(adUnitId, slot, MapsKt.i(new Pair("valueMicros", Long.valueOf(MathKt.g(d * 1000000.0d))), new Pair("currencyCode", "USD"), new Pair("network", network)));
                    throw null;
                }
            }).build();
            String message = this.$logContext + " requested";
            Intrinsics.i(message, "message");
            AdsterFixedBannerAnalyticsHelper adsterFixedBannerAnalyticsHelper3 = this.$analyticsHelper;
            String adUnitId = this.$placementName;
            BannerAdSlot slot = this.$slot;
            adsterFixedBannerAnalyticsHelper3.getClass();
            Intrinsics.i(adUnitId, "adUnitId");
            Intrinsics.i(slot, "slot");
            AdsterFixedBannerAnalyticsHelper.c(adsterFixedBannerAnalyticsHelper3, adUnitId, slot);
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdsterFixedBannerAd_androidKt$AdsterFixedBannerAd$3$1(FrameLayout frameLayout, AdsterFixedBannerAnalyticsHelper adsterFixedBannerAnalyticsHelper, String str, BannerAdSlot bannerAdSlot, Function1 function1, String str2, Function1 function2, AdsterFixedBannerTargetingHelper adsterFixedBannerTargetingHelper, State state, MutableState mutableState, MutableState mutableState2, MutableIntState mutableIntState, MutableState mutableState3, Context context, Function2 function3, Continuation continuation) {
        super(2, continuation);
        this.$container = frameLayout;
        this.$analyticsHelper = adsterFixedBannerAnalyticsHelper;
        this.$placementName = str;
        this.$slot = bannerAdSlot;
        this.$onAdFailedToLoad = function1;
        this.$logContext = str2;
        this.$onCrashLoggingRequired = function2;
        this.$targetingHelper = adsterFixedBannerTargetingHelper;
        this.$initState$delegate = state;
        this.$isTerminalFailure$delegate = mutableState;
        this.$hasRendered$delegate = mutableState2;
        this.$reservedHeightDp$delegate = mutableIntState;
        this.$currentAd$delegate = mutableState3;
        this.$context = context;
        this.$onAdLoadedSize = function3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AdsterFixedBannerAd_androidKt$AdsterFixedBannerAd$3$1(this.$container, this.$analyticsHelper, this.$placementName, this.$slot, this.$onAdFailedToLoad, this.$logContext, this.$onCrashLoggingRequired, this.$targetingHelper, this.$initState$delegate, this.$isTerminalFailure$delegate, this.$hasRendered$delegate, this.$reservedHeightDp$delegate, this.$currentAd$delegate, this.$context, this.$onAdLoadedSize, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((AdsterFixedBannerAd_androidKt$AdsterFixedBannerAd$3$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objA;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        Unit unit = Unit.f17538a;
        if (i == 0) {
            ResultKt.b(obj);
            AdsterSdkInitState value = this.$initState$delegate.getValue();
            if (value instanceof AdsterSdkInitState.Initialized) {
                MutableState<Boolean> mutableState = this.$hasRendered$delegate;
                Boolean bool = Boolean.FALSE;
                mutableState.setValue(bool);
                this.$isTerminalFailure$delegate.setValue(bool);
                this.$reservedHeightDp$delegate.setIntValue(50);
                this.$container.removeAllViews();
                MediationBannerAd value2 = this.$currentAd$delegate.getValue();
                this.$currentAd$delegate.setValue(null);
                if (value2 != null) {
                    try {
                        value2.destroy();
                    } catch (Throwable th) {
                        Function1<CrashlyticsLog, Unit> function1 = this.$onCrashLoggingRequired;
                        String strF = Reflection.a(th.getClass()).f();
                        String message = th.getMessage();
                        function1.invoke(new CrashlyticsLog("AdsterFixedBannerAd reset", vo1.n(strF, ":", message != null ? message : "")));
                    }
                }
                AdsterFixedBannerTargetingHelper adsterFixedBannerTargetingHelper = this.$targetingHelper;
                this.label = 1;
                objA = adsterFixedBannerTargetingHelper.a(this);
                if (objA != coroutineSingletons) {
                }
            }
            if (!(value instanceof AdsterSdkInitState.Failed)) {
                String message2 = this.$logContext + " waiting initState=" + Reflection.a(this.$initState$delegate.getValue().getClass()).f();
                Intrinsics.i(message2, "message");
                return unit;
            }
            AdsterSdkInitState value3 = this.$initState$delegate.getValue();
            Intrinsics.g(value3, "null cannot be cast to non-null type app.chalo.ads.AdsterSdkInitState.Failed");
            Throwable th2 = ((AdsterSdkInitState.Failed) value3).f723a;
            MutableState<Boolean> mutableState2 = this.$isTerminalFailure$delegate;
            Boolean bool2 = Boolean.TRUE;
            mutableState2.setValue(bool2);
            this.$hasRendered$delegate.setValue(bool2);
            this.$reservedHeightDp$delegate.setIntValue(0);
            MediationBannerAd value4 = this.$currentAd$delegate.getValue();
            if (value4 != null) {
                value4.destroy();
            }
            this.$currentAd$delegate.setValue(null);
            this.$container.removeAllViews();
            String strF2 = Reflection.a(th2.getClass()).f();
            String message3 = th2.getMessage();
            this.$analyticsHelper.a(this.$placementName, this.$slot, -1, vo1.m("init_failed:", vo1.n(strF2, ":", message3 != null ? message3 : "")));
            throw null;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            return unit;
        }
        ResultKt.b(obj);
        objA = obj;
        Map map = (Map) objA;
        String message4 = this.$logContext + " load start targetingKeys=" + map.keySet().size();
        Intrinsics.i(message4, "message");
        long jCurrentTimeMillis = System.currentTimeMillis();
        DefaultScheduler defaultScheduler = Dispatchers.f17721a;
        MainCoroutineDispatcher mainCoroutineDispatcherG = MainDispatcherLoader.f17879a.g();
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$context, this.$placementName, map, this.$logContext, this.$analyticsHelper, this.$slot, this.$container, this.$onAdFailedToLoad, jCurrentTimeMillis, this.$isTerminalFailure$delegate, this.$hasRendered$delegate, this.$reservedHeightDp$delegate, this.$currentAd$delegate, this.$onAdLoadedSize, null);
        this.label = 2;
        return BuildersKt.g(mainCoroutineDispatcherG, anonymousClass1, this) == coroutineSingletons ? coroutineSingletons : unit;
    }
}
