package app.chalo.ads;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.lifecycle.LifecycleOwner;
import app.chalo.crashlytics.CrashlyticsLog;
import com.adster.sdk.mediation.AdError;
import com.adster.sdk.mediation.AdEventsListener;
import com.adster.sdk.mediation.AdRequestConfiguration;
import com.adster.sdk.mediation.AdSterAdLoader;
import com.adster.sdk.mediation.MediationAdListener;
import com.adster.sdk.mediation.MediationBannerAd;
import com.adster.sdk.mediation.MediationBannerVideoAd;
import com.adster.sdk.mediation.MediationNativeAd;
import com.adster.sdk.mediation.MediationNativeCustomFormatAd;
import defpackage.c2;
import defpackage.m2;
import defpackage.n2;
import defpackage.pk0;
import defpackage.q2;
import defpackage.vo1;
import defpackage.xj1;
import defpackage.z40;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import kotlinx.coroutines.scheduling.DefaultScheduler;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.ads.AdsterUnifiedAd_androidKt$AdsterUnifiedAdContent$4$1", f = "AdsterUnifiedAd.android.kt", l = {TypedValues.PositionType.TYPE_SIZE_PERCENT, TypedValues.PositionType.TYPE_CURVE_FIT}, m = "invokeSuspend", v = 1)
final class AdsterUnifiedAd_androidKt$AdsterUnifiedAdContent$4$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MutableIntState $activeRequestToken$delegate;
    final /* synthetic */ Activity $activity;
    final /* synthetic */ AdsterUnifiedDimens $adDimens;
    final /* synthetic */ UnifiedBannerUiSpec $bannerUiSpec;
    final /* synthetic */ FrameLayout $container;
    final /* synthetic */ Context $context;
    final /* synthetic */ MutableState<Object> $currentAd$delegate;
    final /* synthetic */ MutableState<UnifiedAdCreativeType> $currentCreativeType$delegate;
    final /* synthetic */ UnifiedAdDebugFixtureSelection $debugFixtureSelection;
    final /* synthetic */ UnifiedAdFailureReporter $failureReporter;
    final /* synthetic */ MutableState<Boolean> $hasRendered$delegate;
    final /* synthetic */ State<AdsterSdkInitState> $initState$delegate;
    final /* synthetic */ AtomicBoolean $isDisposed;
    final /* synthetic */ MutableState<Boolean> $isTerminalFailure$delegate;
    final /* synthetic */ State<Function1<Integer, Unit>> $latestOnAdFailedToLoad$delegate;
    final /* synthetic */ State<Function2<Integer, Integer, Unit>> $latestOnAdLoadedSize$delegate;
    final /* synthetic */ State<Function0<Unit>> $latestOnAdRendered$delegate;
    final /* synthetic */ State<Function1<CrashlyticsLog, Unit>> $latestOnCrashLoggingRequired$delegate;
    final /* synthetic */ UnifiedAdLifecycleContext $lifecycleContext;
    final /* synthetic */ LifecycleOwner $lifecycleOwner;
    final /* synthetic */ UnifiedAdLifecycleReporter $lifecycleReporter;
    final /* synthetic */ String $logContext;
    final /* synthetic */ String $placementName;
    final /* synthetic */ MutableIntState $renderedHeightDp$delegate;
    final /* synthetic */ UnifiedAdSlot $slot;
    final /* synthetic */ UnifiedAdSlotSpec $spec;
    final /* synthetic */ AdsterUnifiedAdTargetingHelper $targetingHelper;
    int I$0;
    int label;

    /* JADX INFO: renamed from: app.chalo.ads.AdsterUnifiedAd_androidKt$AdsterUnifiedAdContent$4$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "app.chalo.ads.AdsterUnifiedAd_androidKt$AdsterUnifiedAdContent$4$1$1", f = "AdsterUnifiedAd.android.kt", l = {}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ MutableIntState $activeRequestToken$delegate;
        final /* synthetic */ Activity $activity;
        final /* synthetic */ AdsterUnifiedDimens $adDimens;
        final /* synthetic */ UnifiedBannerUiSpec $bannerUiSpec;
        final /* synthetic */ FrameLayout $container;
        final /* synthetic */ Context $context;
        final /* synthetic */ MutableState<Object> $currentAd$delegate;
        final /* synthetic */ MutableState<UnifiedAdCreativeType> $currentCreativeType$delegate;
        final /* synthetic */ UnifiedAdFailureReporter $failureReporter;
        final /* synthetic */ MutableState<Boolean> $hasRendered$delegate;
        final /* synthetic */ AtomicBoolean $isDisposed;
        final /* synthetic */ MutableState<Boolean> $isTerminalFailure$delegate;
        final /* synthetic */ State<Function1<Integer, Unit>> $latestOnAdFailedToLoad$delegate;
        final /* synthetic */ State<Function2<Integer, Integer, Unit>> $latestOnAdLoadedSize$delegate;
        final /* synthetic */ State<Function0<Unit>> $latestOnAdRendered$delegate;
        final /* synthetic */ State<Function1<CrashlyticsLog, Unit>> $latestOnCrashLoggingRequired$delegate;
        final /* synthetic */ UnifiedAdLifecycleContext $lifecycleContext;
        final /* synthetic */ LifecycleOwner $lifecycleOwner;
        final /* synthetic */ UnifiedAdLifecycleReporter $lifecycleReporter;
        final /* synthetic */ String $logContext;
        final /* synthetic */ String $placementName;
        final /* synthetic */ MutableIntState $renderedHeightDp$delegate;
        final /* synthetic */ long $requestStartedAt;
        final /* synthetic */ int $requestToken;
        final /* synthetic */ UnifiedAdSlot $slot;
        final /* synthetic */ UnifiedAdSlotSpec $spec;
        final /* synthetic */ Map<String, String> $targeting;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Context context, String str, Map map, UnifiedAdLifecycleReporter unifiedAdLifecycleReporter, UnifiedAdLifecycleContext unifiedAdLifecycleContext, String str2, int i, UnifiedAdFailureReporter unifiedAdFailureReporter, FrameLayout frameLayout, UnifiedAdSlot unifiedAdSlot, UnifiedBannerUiSpec unifiedBannerUiSpec, long j, AtomicBoolean atomicBoolean, MutableIntState mutableIntState, Activity activity, LifecycleOwner lifecycleOwner, UnifiedAdSlotSpec unifiedAdSlotSpec, MutableState mutableState, State state, MutableState mutableState2, State state2, MutableIntState mutableIntState2, State state3, MutableState mutableState3, MutableState mutableState4, State state4, AdsterUnifiedDimens adsterUnifiedDimens, Continuation continuation) {
            super(2, continuation);
            this.$context = context;
            this.$placementName = str;
            this.$targeting = map;
            this.$lifecycleReporter = unifiedAdLifecycleReporter;
            this.$lifecycleContext = unifiedAdLifecycleContext;
            this.$logContext = str2;
            this.$requestToken = i;
            this.$failureReporter = unifiedAdFailureReporter;
            this.$container = frameLayout;
            this.$slot = unifiedAdSlot;
            this.$bannerUiSpec = unifiedBannerUiSpec;
            this.$requestStartedAt = j;
            this.$isDisposed = atomicBoolean;
            this.$activeRequestToken$delegate = mutableIntState;
            this.$activity = activity;
            this.$lifecycleOwner = lifecycleOwner;
            this.$spec = unifiedAdSlotSpec;
            this.$currentCreativeType$delegate = mutableState;
            this.$latestOnCrashLoggingRequired$delegate = state;
            this.$currentAd$delegate = mutableState2;
            this.$latestOnAdFailedToLoad$delegate = state2;
            this.$renderedHeightDp$delegate = mutableIntState2;
            this.$latestOnAdLoadedSize$delegate = state3;
            this.$isTerminalFailure$delegate = mutableState3;
            this.$hasRendered$delegate = mutableState4;
            this.$latestOnAdRendered$delegate = state4;
            this.$adDimens = adsterUnifiedDimens;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.$context, this.$placementName, this.$targeting, this.$lifecycleReporter, this.$lifecycleContext, this.$logContext, this.$requestToken, this.$failureReporter, this.$container, this.$slot, this.$bannerUiSpec, this.$requestStartedAt, this.$isDisposed, this.$activeRequestToken$delegate, this.$activity, this.$lifecycleOwner, this.$spec, this.$currentCreativeType$delegate, this.$latestOnCrashLoggingRequired$delegate, this.$currentAd$delegate, this.$latestOnAdFailedToLoad$delegate, this.$renderedHeightDp$delegate, this.$latestOnAdLoadedSize$delegate, this.$isTerminalFailure$delegate, this.$hasRendered$delegate, this.$latestOnAdRendered$delegate, this.$adDimens, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = (AnonymousClass1) create((CoroutineScope) obj, (Continuation) obj2);
            Unit unit = Unit.f17538a;
            anonymousClass1.invokeSuspend(unit);
            return unit;
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
            final int i = this.$requestToken;
            final UnifiedAdFailureReporter unifiedAdFailureReporter = this.$failureReporter;
            final String str = this.$logContext;
            final FrameLayout frameLayout = this.$container;
            final UnifiedAdSlot unifiedAdSlot = this.$slot;
            final String str2 = this.$placementName;
            final UnifiedBannerUiSpec unifiedBannerUiSpec = this.$bannerUiSpec;
            final Context context = this.$context;
            final long j = this.$requestStartedAt;
            final UnifiedAdLifecycleReporter unifiedAdLifecycleReporter = this.$lifecycleReporter;
            final UnifiedAdLifecycleContext unifiedAdLifecycleContext = this.$lifecycleContext;
            final AtomicBoolean atomicBoolean = this.$isDisposed;
            final MutableIntState mutableIntState = this.$activeRequestToken$delegate;
            final Activity activity = this.$activity;
            final LifecycleOwner lifecycleOwner = this.$lifecycleOwner;
            final UnifiedAdSlotSpec unifiedAdSlotSpec = this.$spec;
            final MutableState<UnifiedAdCreativeType> mutableState = this.$currentCreativeType$delegate;
            final State<Function1<CrashlyticsLog, Unit>> state = this.$latestOnCrashLoggingRequired$delegate;
            final MutableState<Object> mutableState2 = this.$currentAd$delegate;
            final State<Function1<Integer, Unit>> state2 = this.$latestOnAdFailedToLoad$delegate;
            final MutableIntState mutableIntState2 = this.$renderedHeightDp$delegate;
            final State<Function2<Integer, Integer, Unit>> state3 = this.$latestOnAdLoadedSize$delegate;
            final MutableState<Boolean> mutableState3 = this.$isTerminalFailure$delegate;
            final MutableState<Boolean> mutableState4 = this.$hasRendered$delegate;
            final State<Function0<Unit>> state4 = this.$latestOnAdRendered$delegate;
            final AdsterUnifiedDimens adsterUnifiedDimens = this.$adDimens;
            AdSterAdLoader.Builder builderWithAdsListener = builder2.withAdsListener(new MediationAdListener() { // from class: app.chalo.ads.AdsterUnifiedAd_androidKt$AdsterUnifiedAdContent$4$1$1$loader$1
                @Override // com.adster.sdk.mediation.MediationAdListener, com.adster.sdk.mediation.AdListener
                public final void onBannerAdLoaded(final MediationBannerAd ad) {
                    Intrinsics.i(ad, "ad");
                    super.onBannerAdLoaded(ad);
                    if (!AdsterUnifiedAd_androidKt.d(atomicBoolean, mutableIntState, activity, lifecycleOwner, frameLayout, i, false)) {
                        try {
                            ad.destroy();
                            return;
                        } catch (Throwable th) {
                            ResultKt.a(th);
                            return;
                        }
                    }
                    UnifiedAdCreativeType unifiedAdCreativeType = UnifiedAdCreativeType.BANNER;
                    final int i2 = 0;
                    if (AdsterUnifiedAd_androidKt.h(unifiedAdSlotSpec, unifiedAdFailureReporter, str, frameLayout, unifiedAdSlot, str2, mutableState, state, mutableState2, state2, unifiedAdCreativeType, new Function0(this) { // from class: r2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Object objA;
                            Object objA2;
                            switch (i2) {
                                case 0:
                                    try {
                                        ad.destroy();
                                        objA = Unit.f17538a;
                                        break;
                                    } catch (Throwable th2) {
                                        objA = ResultKt.a(th2);
                                    }
                                    return new Result(objA);
                                default:
                                    try {
                                        ad.destroy();
                                        objA2 = Unit.f17538a;
                                        break;
                                    } catch (Throwable th3) {
                                        objA2 = ResultKt.a(th3);
                                    }
                                    return new Result(objA2);
                            }
                        }
                    })) {
                        View view = ad.getView();
                        MutableState mutableState5 = mutableState2;
                        if (view == null) {
                            final int i3 = 1;
                            AdsterUnifiedAd_androidKt.p(unifiedAdFailureReporter, (Function1) state.getValue(), str, frameLayout, new c2(mutableState5, mutableState, 6), unifiedAdSlot, str2, -2, "loaded_null_view", unifiedAdCreativeType.getAnalyticsValue(), (Function1) state2.getValue(), new Function0(this) { // from class: r2
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    Object objA;
                                    Object objA2;
                                    switch (i3) {
                                        case 0:
                                            try {
                                                ad.destroy();
                                                objA = Unit.f17538a;
                                                break;
                                            } catch (Throwable th2) {
                                                objA = ResultKt.a(th2);
                                            }
                                            return new Result(objA);
                                        default:
                                            try {
                                                ad.destroy();
                                                objA2 = Unit.f17538a;
                                                break;
                                            } catch (Throwable th3) {
                                                objA2 = ResultKt.a(th3);
                                            }
                                            return new Result(objA2);
                                    }
                                }
                            });
                            return;
                        }
                        FrameLayout frameLayout2 = frameLayout;
                        UnifiedBannerUiSpec unifiedBannerUiSpec2 = unifiedBannerUiSpec;
                        String str3 = str;
                        AdsterUnifiedAd_androidKt.m(frameLayout2, view, unifiedBannerUiSpec2, str3);
                        int i4 = unifiedBannerUiSpec2.f856a;
                        boolean z = unifiedBannerUiSpec2.b;
                        State state5 = state3;
                        MutableIntState mutableIntState3 = mutableIntState2;
                        if (z) {
                            int i5 = unifiedBannerUiSpec2.f856a;
                            Integer numL = AdsterUnifiedAd_androidKt.l(view, context);
                            int iIntValue = numL != null ? numL.intValue() : i5;
                            mutableIntState3.setIntValue(iIntValue);
                            Function2 function2 = (Function2) state5.getValue();
                            if (function2 != null) {
                                function2.invoke(0, Integer.valueOf(iIntValue));
                            }
                            AdsterUnifiedAd_androidKt.k(view, new m2(i, view, context, i5, str, atomicBoolean, mutableIntState, activity, lifecycleOwner, frameLayout, mutableIntState2, state3, 0));
                        } else {
                            mutableIntState3.setIntValue(i4);
                            Function2 function3 = (Function2) state5.getValue();
                            if (function3 != null) {
                                function3.invoke(0, Integer.valueOf(i4));
                            }
                        }
                        int i6 = i;
                        UnifiedAdLifecycleReporter unifiedAdLifecycleReporter2 = unifiedAdLifecycleReporter;
                        UnifiedAdLifecycleContext unifiedAdLifecycleContext2 = unifiedAdLifecycleContext;
                        AtomicBoolean atomicBoolean2 = atomicBoolean;
                        MutableIntState mutableIntState4 = mutableIntState;
                        Activity activity2 = activity;
                        LifecycleOwner lifecycleOwner2 = lifecycleOwner;
                        FrameLayout frameLayout3 = frameLayout;
                        AdsterUnifiedAd_androidKt.k(frameLayout3, new n2(i6, unifiedAdLifecycleReporter2, unifiedAdLifecycleContext2, unifiedAdCreativeType, atomicBoolean2, mutableIntState4, activity2, lifecycleOwner2, frameLayout3, mutableState3, mutableState4, state4, 0));
                        long jCurrentTimeMillis = System.currentTimeMillis() - j;
                        unifiedAdLifecycleReporter.a(unifiedAdLifecycleContext, new UnifiedAdLifecycleEvent.Loaded(unifiedAdCreativeType, jCurrentTimeMillis), new xj1(26));
                        mutableState5.setValue(ad);
                        String message = str3 + " banner loaded loadTimeMs=" + jCurrentTimeMillis;
                        Intrinsics.i(message, "message");
                    }
                }

                @Override // com.adster.sdk.mediation.MediationAdListener, com.adster.sdk.mediation.AdListener
                public final void onBannerVideoAdLoaded(final MediationBannerVideoAd ad) {
                    Intrinsics.i(ad, "ad");
                    super.onBannerVideoAdLoaded(ad);
                    if (!AdsterUnifiedAd_androidKt.d(atomicBoolean, mutableIntState, activity, lifecycleOwner, frameLayout, i, false)) {
                        try {
                            ad.destroy();
                            return;
                        } catch (Throwable th) {
                            ResultKt.a(th);
                            return;
                        }
                    }
                    UnifiedAdCreativeType unifiedAdCreativeType = UnifiedAdCreativeType.BANNER_VIDEO;
                    final int i2 = 0;
                    if (AdsterUnifiedAd_androidKt.h(unifiedAdSlotSpec, unifiedAdFailureReporter, str, frameLayout, unifiedAdSlot, str2, mutableState, state, mutableState2, state2, unifiedAdCreativeType, new Function0(this) { // from class: o2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Object objA;
                            Object objA2;
                            switch (i2) {
                                case 0:
                                    try {
                                        ad.destroy();
                                        objA = Unit.f17538a;
                                        break;
                                    } catch (Throwable th2) {
                                        objA = ResultKt.a(th2);
                                    }
                                    return new Result(objA);
                                default:
                                    try {
                                        ad.destroy();
                                        objA2 = Unit.f17538a;
                                        break;
                                    } catch (Throwable th3) {
                                        objA2 = ResultKt.a(th3);
                                    }
                                    return new Result(objA2);
                            }
                        }
                    })) {
                        View view = ad.getView();
                        MutableState mutableState5 = mutableState2;
                        if (view == null) {
                            final int i3 = 1;
                            AdsterUnifiedAd_androidKt.p(unifiedAdFailureReporter, (Function1) state.getValue(), str, frameLayout, new c2(mutableState5, mutableState, 1), unifiedAdSlot, str2, -3, "loaded_null_banner_video_view", unifiedAdCreativeType.getAnalyticsValue(), (Function1) state2.getValue(), new Function0(this) { // from class: o2
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    Object objA;
                                    Object objA2;
                                    switch (i3) {
                                        case 0:
                                            try {
                                                ad.destroy();
                                                objA = Unit.f17538a;
                                                break;
                                            } catch (Throwable th2) {
                                                objA = ResultKt.a(th2);
                                            }
                                            return new Result(objA);
                                        default:
                                            try {
                                                ad.destroy();
                                                objA2 = Unit.f17538a;
                                                break;
                                            } catch (Throwable th3) {
                                                objA2 = ResultKt.a(th3);
                                            }
                                            return new Result(objA2);
                                    }
                                }
                            });
                            return;
                        }
                        StringBuilder sb = new StringBuilder();
                        String str3 = str;
                        sb.append(str3);
                        sb.append(" bannerVideo");
                        String string = sb.toString();
                        FrameLayout frameLayout2 = frameLayout;
                        UnifiedBannerUiSpec unifiedBannerUiSpec2 = unifiedBannerUiSpec;
                        AdsterUnifiedAd_androidKt.m(frameLayout2, view, unifiedBannerUiSpec2, string);
                        int i4 = unifiedBannerUiSpec2.f856a;
                        boolean z = unifiedBannerUiSpec2.b;
                        State state5 = state3;
                        MutableIntState mutableIntState3 = mutableIntState2;
                        if (z) {
                            int i5 = unifiedBannerUiSpec2.f856a;
                            Integer numL = AdsterUnifiedAd_androidKt.l(view, context);
                            int iIntValue = numL != null ? numL.intValue() : i5;
                            mutableIntState3.setIntValue(iIntValue);
                            Function2 function2 = (Function2) state5.getValue();
                            if (function2 != null) {
                                function2.invoke(0, Integer.valueOf(iIntValue));
                            }
                            AdsterUnifiedAd_androidKt.k(view, new m2(i, view, context, i5, str, atomicBoolean, mutableIntState, activity, lifecycleOwner, frameLayout, mutableIntState2, state3, 1));
                        } else {
                            mutableIntState3.setIntValue(i4);
                            Function2 function3 = (Function2) state5.getValue();
                            if (function3 != null) {
                                function3.invoke(0, Integer.valueOf(i4));
                            }
                        }
                        int i6 = i;
                        UnifiedAdLifecycleReporter unifiedAdLifecycleReporter2 = unifiedAdLifecycleReporter;
                        UnifiedAdLifecycleContext unifiedAdLifecycleContext2 = unifiedAdLifecycleContext;
                        AtomicBoolean atomicBoolean2 = atomicBoolean;
                        MutableIntState mutableIntState4 = mutableIntState;
                        Activity activity2 = activity;
                        LifecycleOwner lifecycleOwner2 = lifecycleOwner;
                        FrameLayout frameLayout3 = frameLayout;
                        AdsterUnifiedAd_androidKt.k(frameLayout3, new n2(i6, unifiedAdLifecycleReporter2, unifiedAdLifecycleContext2, unifiedAdCreativeType, atomicBoolean2, mutableIntState4, activity2, lifecycleOwner2, frameLayout3, mutableState3, mutableState4, state4, 1));
                        long jCurrentTimeMillis = System.currentTimeMillis() - j;
                        unifiedAdLifecycleReporter.a(unifiedAdLifecycleContext, new UnifiedAdLifecycleEvent.Loaded(unifiedAdCreativeType, jCurrentTimeMillis), new xj1(26));
                        mutableState5.setValue(ad);
                        String message = str3 + " bannerVideo loaded loadTimeMs=" + jCurrentTimeMillis;
                        Intrinsics.i(message, "message");
                    }
                }

                @Override // com.adster.sdk.mediation.AdListener
                public final void onFailure(AdError adError) {
                    Intrinsics.i(adError, "adError");
                    if (AdsterUnifiedAd_androidKt.d(atomicBoolean, mutableIntState, activity, lifecycleOwner, frameLayout, i, false)) {
                        int errorCode = adError.getErrorCode();
                        String errorMessage = adError.getErrorMessage();
                        if (errorMessage == null) {
                            errorMessage = "";
                        }
                        String str3 = errorMessage;
                        Function1 function1 = (Function1) state2.getValue();
                        State state5 = state;
                        Function1 onCrashLoggingRequired = (Function1) state5.getValue();
                        UnifiedAdFailureReporter failureReporter = unifiedAdFailureReporter;
                        Intrinsics.i(failureReporter, "failureReporter");
                        UnifiedAdSlot slot = unifiedAdSlot;
                        Intrinsics.i(slot, "slot");
                        String placementName = str2;
                        Intrinsics.i(placementName, "placementName");
                        String logContext = str;
                        Intrinsics.i(logContext, "logContext");
                        Intrinsics.i(onCrashLoggingRequired, "onCrashLoggingRequired");
                        MutableState mutableState5 = mutableState2;
                        AdsterUnifiedAd_androidKt.n(mutableState5.getValue(), (Function1) state5.getValue());
                        mutableState5.setValue(null);
                        mutableState.setValue(null);
                        frameLayout.removeAllViews();
                        AdsterUnifiedAd_androidKt.f(mutableState3, true);
                        AdsterUnifiedAd_androidKt.g(mutableState4, false);
                        mutableIntState2.setIntValue(0);
                        failureReporter.a(new UnifiedAdTerminalFailureReport(placementName, UnifiedAdFailureReportingKt.a(slot), errorCode, str3, "unified", logContext + " failed: code=" + errorCode + " message=" + str3, pk0.g(errorCode, "terminal_failure:", ":", str3), null, 1536), function1, onCrashLoggingRequired);
                    }
                }

                @Override // com.adster.sdk.mediation.MediationAdListener, com.adster.sdk.mediation.AdListener
                public final void onNativeAdLoaded(final MediationNativeAd ad) {
                    Object objA;
                    Intrinsics.i(ad, "ad");
                    super.onNativeAdLoaded(ad);
                    if (!AdsterUnifiedAd_androidKt.d(atomicBoolean, mutableIntState, activity, lifecycleOwner, frameLayout, i, true)) {
                        try {
                            ad.destroy();
                            return;
                        } catch (Throwable th) {
                            ResultKt.a(th);
                            return;
                        }
                    }
                    UnifiedAdCreativeType unifiedAdCreativeType = UnifiedAdCreativeType.NATIVE;
                    final int i2 = 0;
                    if (AdsterUnifiedAd_androidKt.h(unifiedAdSlotSpec, unifiedAdFailureReporter, str, frameLayout, unifiedAdSlot, str2, mutableState, state, mutableState2, state2, unifiedAdCreativeType, new Function0(this) { // from class: p2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Object objA2;
                            Object objA3;
                            Object objA4;
                            switch (i2) {
                                case 0:
                                    try {
                                        ad.destroy();
                                        objA2 = Unit.f17538a;
                                        break;
                                    } catch (Throwable th2) {
                                        objA2 = ResultKt.a(th2);
                                    }
                                    return new Result(objA2);
                                case 1:
                                    try {
                                        ad.destroy();
                                        objA3 = Unit.f17538a;
                                        break;
                                    } catch (Throwable th3) {
                                        objA3 = ResultKt.a(th3);
                                    }
                                    return new Result(objA3);
                                default:
                                    try {
                                        ad.destroy();
                                        objA4 = Unit.f17538a;
                                        break;
                                    } catch (Throwable th4) {
                                        objA4 = ResultKt.a(th4);
                                    }
                                    return new Result(objA4);
                            }
                        }
                    })) {
                        Context context2 = context;
                        FrameLayout frameLayout2 = frameLayout;
                        try {
                            objA = AdsterUnifiedAd_androidKt.i(context2, frameLayout2, ad, str, unifiedAdSlot, adsterUnifiedDimens, new q2(i, atomicBoolean, mutableIntState, activity, lifecycleOwner, frameLayout2, 0));
                        } catch (Throwable th2) {
                            objA = ResultKt.a(th2);
                        }
                        Throwable thA = Result.a(objA);
                        State state5 = state2;
                        MutableState mutableState5 = mutableState;
                        State state6 = state;
                        MutableState mutableState6 = mutableState2;
                        if (thA != null) {
                            Function1 function1 = (Function1) state6.getValue();
                            c2 c2Var = new c2(mutableState6, mutableState5, 2);
                            String strF = Reflection.a(thA.getClass()).f();
                            String message = thA.getMessage();
                            if (message == null) {
                                message = "";
                            }
                            final int i3 = 1;
                            AdsterUnifiedAd_androidKt.p(unifiedAdFailureReporter, function1, str, frameLayout, c2Var, unifiedAdSlot, str2, -4, z40.g("native_bind_failed:", strF, ":", message), unifiedAdCreativeType.getAnalyticsValue(), (Function1) state5.getValue(), new Function0(this) { // from class: p2
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    Object objA2;
                                    Object objA3;
                                    Object objA4;
                                    switch (i3) {
                                        case 0:
                                            try {
                                                ad.destroy();
                                                objA2 = Unit.f17538a;
                                                break;
                                            } catch (Throwable th3) {
                                                objA2 = ResultKt.a(th3);
                                            }
                                            return new Result(objA2);
                                        case 1:
                                            try {
                                                ad.destroy();
                                                objA3 = Unit.f17538a;
                                                break;
                                            } catch (Throwable th4) {
                                                objA3 = ResultKt.a(th4);
                                            }
                                            return new Result(objA3);
                                        default:
                                            try {
                                                ad.destroy();
                                                objA4 = Unit.f17538a;
                                                break;
                                            } catch (Throwable th5) {
                                                objA4 = ResultKt.a(th5);
                                            }
                                            return new Result(objA4);
                                    }
                                }
                            });
                            return;
                        }
                        NativeBindingResult nativeBindingResult = (NativeBindingResult) objA;
                        int i4 = nativeBindingResult.b;
                        boolean z = nativeBindingResult.f803a;
                        String str3 = str;
                        if (!z) {
                            if (nativeBindingResult.c != NativeBindingFailureReason.HOST_INVALID) {
                                Function1 function2 = (Function1) state6.getValue();
                                c2 c2Var2 = new c2(mutableState6, mutableState5, 3);
                                String analyticsValue = unifiedAdCreativeType.getAnalyticsValue();
                                Function1 function3 = (Function1) state5.getValue();
                                final int i5 = 2;
                                AdsterUnifiedAd_androidKt.p(unifiedAdFailureReporter, function2, str, frameLayout, c2Var2, unifiedAdSlot, str2, -5, "native_missing_required_fields", analyticsValue, function3, new Function0(this) { // from class: p2
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        Object objA2;
                                        Object objA3;
                                        Object objA4;
                                        switch (i5) {
                                            case 0:
                                                try {
                                                    ad.destroy();
                                                    objA2 = Unit.f17538a;
                                                    break;
                                                } catch (Throwable th3) {
                                                    objA2 = ResultKt.a(th3);
                                                }
                                                return new Result(objA2);
                                            case 1:
                                                try {
                                                    ad.destroy();
                                                    objA3 = Unit.f17538a;
                                                    break;
                                                } catch (Throwable th4) {
                                                    objA3 = ResultKt.a(th4);
                                                }
                                                return new Result(objA3);
                                            default:
                                                try {
                                                    ad.destroy();
                                                    objA4 = Unit.f17538a;
                                                    break;
                                                } catch (Throwable th5) {
                                                    objA4 = ResultKt.a(th5);
                                                }
                                                return new Result(objA4);
                                        }
                                    }
                                });
                                return;
                            }
                            try {
                                ad.destroy();
                            } catch (Throwable th3) {
                                ResultKt.a(th3);
                            }
                            String message2 = str3 + " native dropped host invalid";
                            Intrinsics.i(message2, "message");
                            return;
                        }
                        long jCurrentTimeMillis = System.currentTimeMillis() - j;
                        unifiedAdLifecycleReporter.a(unifiedAdLifecycleContext, new UnifiedAdLifecycleEvent.Loaded(unifiedAdCreativeType, jCurrentTimeMillis), new xj1(26));
                        mutableState6.setValue(ad);
                        mutableIntState2.setIntValue(i4);
                        Function2 function4 = (Function2) state3.getValue();
                        if (function4 != null) {
                            function4.invoke(0, Integer.valueOf(i4));
                        }
                        int i6 = i;
                        UnifiedAdLifecycleReporter unifiedAdLifecycleReporter2 = unifiedAdLifecycleReporter;
                        UnifiedAdLifecycleContext unifiedAdLifecycleContext2 = unifiedAdLifecycleContext;
                        AtomicBoolean atomicBoolean2 = atomicBoolean;
                        MutableIntState mutableIntState3 = mutableIntState;
                        Activity activity2 = activity;
                        LifecycleOwner lifecycleOwner2 = lifecycleOwner;
                        FrameLayout frameLayout3 = frameLayout;
                        AdsterUnifiedAd_androidKt.k(frameLayout3, new n2(i6, unifiedAdLifecycleReporter2, unifiedAdLifecycleContext2, unifiedAdCreativeType, atomicBoolean2, mutableIntState3, activity2, lifecycleOwner2, frameLayout3, mutableState3, mutableState4, state4, 2));
                        String message3 = str3 + " native loaded loadTimeMs=" + jCurrentTimeMillis;
                        Intrinsics.i(message3, "message");
                    }
                }

                @Override // com.adster.sdk.mediation.MediationAdListener, com.adster.sdk.mediation.AdListener
                public final void onNativeCustomFormatAdLoaded(final MediationNativeCustomFormatAd ad) {
                    Object objA;
                    Intrinsics.i(ad, "ad");
                    super.onNativeCustomFormatAdLoaded(ad);
                    if (!AdsterUnifiedAd_androidKt.d(atomicBoolean, mutableIntState, activity, lifecycleOwner, frameLayout, i, true)) {
                        try {
                            ad.destroy();
                            return;
                        } catch (Throwable th) {
                            ResultKt.a(th);
                            return;
                        }
                    }
                    UnifiedAdCreativeType unifiedAdCreativeType = UnifiedAdCreativeType.CUSTOM_NATIVE;
                    final int i2 = 0;
                    if (AdsterUnifiedAd_androidKt.h(unifiedAdSlotSpec, unifiedAdFailureReporter, str, frameLayout, unifiedAdSlot, str2, mutableState, state, mutableState2, state2, unifiedAdCreativeType, new Function0(this) { // from class: l2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Object objA2;
                            Object objA3;
                            Object objA4;
                            switch (i2) {
                                case 0:
                                    try {
                                        ad.destroy();
                                        objA2 = Unit.f17538a;
                                        break;
                                    } catch (Throwable th2) {
                                        objA2 = ResultKt.a(th2);
                                    }
                                    return new Result(objA2);
                                case 1:
                                    try {
                                        ad.destroy();
                                        objA3 = Unit.f17538a;
                                        break;
                                    } catch (Throwable th3) {
                                        objA3 = ResultKt.a(th3);
                                    }
                                    return new Result(objA3);
                                default:
                                    try {
                                        ad.destroy();
                                        objA4 = Unit.f17538a;
                                        break;
                                    } catch (Throwable th4) {
                                        objA4 = ResultKt.a(th4);
                                    }
                                    return new Result(objA4);
                            }
                        }
                    })) {
                        Context context2 = context;
                        FrameLayout frameLayout2 = frameLayout;
                        try {
                            objA = AdsterUnifiedAd_androidKt.j(context2, frameLayout2, ad, str, unifiedAdSlot, adsterUnifiedDimens, new q2(i, atomicBoolean, mutableIntState, activity, lifecycleOwner, frameLayout2, 1));
                        } catch (Throwable th2) {
                            objA = ResultKt.a(th2);
                        }
                        Throwable thA = Result.a(objA);
                        State state5 = state2;
                        MutableState mutableState5 = mutableState;
                        State state6 = state;
                        MutableState mutableState6 = mutableState2;
                        if (thA != null) {
                            Function1 function1 = (Function1) state6.getValue();
                            c2 c2Var = new c2(mutableState6, mutableState5, 4);
                            String strF = Reflection.a(thA.getClass()).f();
                            String message = thA.getMessage();
                            if (message == null) {
                                message = "";
                            }
                            final int i3 = 1;
                            AdsterUnifiedAd_androidKt.p(unifiedAdFailureReporter, function1, str, frameLayout, c2Var, unifiedAdSlot, str2, -6, z40.g("custom_native_bind_failed:", strF, ":", message), unifiedAdCreativeType.getAnalyticsValue(), (Function1) state5.getValue(), new Function0(this) { // from class: l2
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    Object objA2;
                                    Object objA3;
                                    Object objA4;
                                    switch (i3) {
                                        case 0:
                                            try {
                                                ad.destroy();
                                                objA2 = Unit.f17538a;
                                                break;
                                            } catch (Throwable th3) {
                                                objA2 = ResultKt.a(th3);
                                            }
                                            return new Result(objA2);
                                        case 1:
                                            try {
                                                ad.destroy();
                                                objA3 = Unit.f17538a;
                                                break;
                                            } catch (Throwable th4) {
                                                objA3 = ResultKt.a(th4);
                                            }
                                            return new Result(objA3);
                                        default:
                                            try {
                                                ad.destroy();
                                                objA4 = Unit.f17538a;
                                                break;
                                            } catch (Throwable th5) {
                                                objA4 = ResultKt.a(th5);
                                            }
                                            return new Result(objA4);
                                    }
                                }
                            });
                            return;
                        }
                        NativeBindingResult nativeBindingResult = (NativeBindingResult) objA;
                        int i4 = nativeBindingResult.b;
                        boolean z = nativeBindingResult.f803a;
                        String str3 = str;
                        if (!z) {
                            if (nativeBindingResult.c != NativeBindingFailureReason.HOST_INVALID) {
                                Function1 function2 = (Function1) state6.getValue();
                                c2 c2Var2 = new c2(mutableState6, mutableState5, 5);
                                String analyticsValue = unifiedAdCreativeType.getAnalyticsValue();
                                Function1 function3 = (Function1) state5.getValue();
                                final int i5 = 2;
                                AdsterUnifiedAd_androidKt.p(unifiedAdFailureReporter, function2, str, frameLayout, c2Var2, unifiedAdSlot, str2, -7, "custom_native_missing_required_fields", analyticsValue, function3, new Function0(this) { // from class: l2
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        Object objA2;
                                        Object objA3;
                                        Object objA4;
                                        switch (i5) {
                                            case 0:
                                                try {
                                                    ad.destroy();
                                                    objA2 = Unit.f17538a;
                                                    break;
                                                } catch (Throwable th3) {
                                                    objA2 = ResultKt.a(th3);
                                                }
                                                return new Result(objA2);
                                            case 1:
                                                try {
                                                    ad.destroy();
                                                    objA3 = Unit.f17538a;
                                                    break;
                                                } catch (Throwable th4) {
                                                    objA3 = ResultKt.a(th4);
                                                }
                                                return new Result(objA3);
                                            default:
                                                try {
                                                    ad.destroy();
                                                    objA4 = Unit.f17538a;
                                                    break;
                                                } catch (Throwable th5) {
                                                    objA4 = ResultKt.a(th5);
                                                }
                                                return new Result(objA4);
                                        }
                                    }
                                });
                                return;
                            }
                            try {
                                ad.destroy();
                            } catch (Throwable th3) {
                                ResultKt.a(th3);
                            }
                            String message2 = str3 + " custom native dropped host invalid";
                            Intrinsics.i(message2, "message");
                            return;
                        }
                        long jCurrentTimeMillis = System.currentTimeMillis() - j;
                        unifiedAdLifecycleReporter.a(unifiedAdLifecycleContext, new UnifiedAdLifecycleEvent.Loaded(unifiedAdCreativeType, jCurrentTimeMillis), new xj1(26));
                        mutableState6.setValue(ad);
                        mutableIntState2.setIntValue(i4);
                        Function2 function4 = (Function2) state3.getValue();
                        if (function4 != null) {
                            function4.invoke(0, Integer.valueOf(i4));
                        }
                        int i6 = i;
                        UnifiedAdLifecycleReporter unifiedAdLifecycleReporter2 = unifiedAdLifecycleReporter;
                        UnifiedAdLifecycleContext unifiedAdLifecycleContext2 = unifiedAdLifecycleContext;
                        AtomicBoolean atomicBoolean2 = atomicBoolean;
                        MutableIntState mutableIntState3 = mutableIntState;
                        Activity activity2 = activity;
                        LifecycleOwner lifecycleOwner2 = lifecycleOwner;
                        FrameLayout frameLayout3 = frameLayout;
                        AdsterUnifiedAd_androidKt.k(frameLayout3, new n2(i6, unifiedAdLifecycleReporter2, unifiedAdLifecycleContext2, unifiedAdCreativeType, atomicBoolean2, mutableIntState3, activity2, lifecycleOwner2, frameLayout3, mutableState3, mutableState4, state4, 3));
                        String message3 = str3 + " custom native loaded loadTimeMs=" + jCurrentTimeMillis;
                        Intrinsics.i(message3, "message");
                    }
                }
            });
            final int i2 = this.$requestToken;
            final UnifiedAdLifecycleReporter unifiedAdLifecycleReporter2 = this.$lifecycleReporter;
            final UnifiedAdLifecycleContext unifiedAdLifecycleContext2 = this.$lifecycleContext;
            final String str3 = this.$logContext;
            final AtomicBoolean atomicBoolean2 = this.$isDisposed;
            final MutableIntState mutableIntState3 = this.$activeRequestToken$delegate;
            final Activity activity2 = this.$activity;
            final LifecycleOwner lifecycleOwner2 = this.$lifecycleOwner;
            final FrameLayout frameLayout2 = this.$container;
            final MutableState<UnifiedAdCreativeType> mutableState5 = this.$currentCreativeType$delegate;
            AdSterAdLoader adSterAdLoaderBuild = builderWithAdsListener.withAdsEventsListener(new AdEventsListener() { // from class: app.chalo.ads.AdsterUnifiedAd_androidKt$AdsterUnifiedAdContent$4$1$1$loader$2
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.adster.sdk.mediation.AdEventsListener
                public final void onAdClicked() {
                    if (AdsterUnifiedAd_androidKt.d(atomicBoolean2, mutableIntState3, activity2, lifecycleOwner2, frameLayout2, i2, false)) {
                        UnifiedAdCreativeType unifiedAdCreativeType = (UnifiedAdCreativeType) mutableState5.getValue();
                        if (unifiedAdCreativeType == null) {
                            unifiedAdCreativeType = UnifiedAdCreativeType.UNIFIED;
                        }
                        unifiedAdLifecycleReporter2.a(unifiedAdLifecycleContext2, new UnifiedAdLifecycleEvent.Click(unifiedAdCreativeType), new xj1(26));
                        String message = str3 + " clicked";
                        Intrinsics.i(message, "message");
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.adster.sdk.mediation.AdEventsListener
                public final void onAdImpression() {
                    if (AdsterUnifiedAd_androidKt.d(atomicBoolean2, mutableIntState3, activity2, lifecycleOwner2, frameLayout2, i2, false)) {
                        UnifiedAdCreativeType unifiedAdCreativeType = (UnifiedAdCreativeType) mutableState5.getValue();
                        if (unifiedAdCreativeType == null) {
                            unifiedAdCreativeType = UnifiedAdCreativeType.UNIFIED;
                        }
                        unifiedAdLifecycleReporter2.a(unifiedAdLifecycleContext2, new UnifiedAdLifecycleEvent.Impression(unifiedAdCreativeType), new xj1(26));
                        String message = str3 + " impression";
                        Intrinsics.i(message, "message");
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.adster.sdk.mediation.AdEventsListener
                public final void onAdRevenuePaid(double d, String adUnitId, String network) {
                    Intrinsics.i(adUnitId, "adUnitId");
                    Intrinsics.i(network, "network");
                    if (AdsterUnifiedAd_androidKt.d(atomicBoolean2, mutableIntState3, activity2, lifecycleOwner2, frameLayout2, i2, false)) {
                        UnifiedAdCreativeType unifiedAdCreativeType = (UnifiedAdCreativeType) mutableState5.getValue();
                        if (unifiedAdCreativeType == null) {
                            unifiedAdCreativeType = UnifiedAdCreativeType.UNIFIED;
                        }
                        unifiedAdLifecycleReporter2.a(unifiedAdLifecycleContext2, new UnifiedAdLifecycleEvent.PaidImpression(unifiedAdCreativeType, d, network), new xj1(26));
                    }
                }
            }).build();
            this.$lifecycleReporter.a(this.$lifecycleContext, UnifiedAdLifecycleEvent.Requested.f850a, new xj1(26));
            String message = this.$logContext + " requested";
            Intrinsics.i(message, "message");
            adSterAdLoaderBuild.loadAd(builder.build());
            return Unit.f17538a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdsterUnifiedAd_androidKt$AdsterUnifiedAdContent$4$1(UnifiedAdDebugFixtureSelection unifiedAdDebugFixtureSelection, FrameLayout frameLayout, UnifiedAdFailureReporter unifiedAdFailureReporter, UnifiedAdSlot unifiedAdSlot, String str, String str2, MutableIntState mutableIntState, State state, MutableState mutableState, MutableIntState mutableIntState2, MutableState mutableState2, MutableState mutableState3, State state2, MutableState mutableState4, State state3, Activity activity, LifecycleOwner lifecycleOwner, AdsterUnifiedAdTargetingHelper adsterUnifiedAdTargetingHelper, Context context, UnifiedAdLifecycleReporter unifiedAdLifecycleReporter, UnifiedAdLifecycleContext unifiedAdLifecycleContext, UnifiedBannerUiSpec unifiedBannerUiSpec, AtomicBoolean atomicBoolean, UnifiedAdSlotSpec unifiedAdSlotSpec, State state4, State state5, AdsterUnifiedDimens adsterUnifiedDimens, Continuation continuation) {
        super(2, continuation);
        this.$debugFixtureSelection = unifiedAdDebugFixtureSelection;
        this.$container = frameLayout;
        this.$failureReporter = unifiedAdFailureReporter;
        this.$slot = unifiedAdSlot;
        this.$placementName = str;
        this.$logContext = str2;
        this.$activeRequestToken$delegate = mutableIntState;
        this.$initState$delegate = state;
        this.$isTerminalFailure$delegate = mutableState;
        this.$renderedHeightDp$delegate = mutableIntState2;
        this.$hasRendered$delegate = mutableState2;
        this.$currentAd$delegate = mutableState3;
        this.$latestOnCrashLoggingRequired$delegate = state2;
        this.$currentCreativeType$delegate = mutableState4;
        this.$latestOnAdFailedToLoad$delegate = state3;
        this.$activity = activity;
        this.$lifecycleOwner = lifecycleOwner;
        this.$targetingHelper = adsterUnifiedAdTargetingHelper;
        this.$context = context;
        this.$lifecycleReporter = unifiedAdLifecycleReporter;
        this.$lifecycleContext = unifiedAdLifecycleContext;
        this.$bannerUiSpec = unifiedBannerUiSpec;
        this.$isDisposed = atomicBoolean;
        this.$spec = unifiedAdSlotSpec;
        this.$latestOnAdLoadedSize$delegate = state4;
        this.$latestOnAdRendered$delegate = state5;
        this.$adDimens = adsterUnifiedDimens;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AdsterUnifiedAd_androidKt$AdsterUnifiedAdContent$4$1(this.$debugFixtureSelection, this.$container, this.$failureReporter, this.$slot, this.$placementName, this.$logContext, this.$activeRequestToken$delegate, this.$initState$delegate, this.$isTerminalFailure$delegate, this.$renderedHeightDp$delegate, this.$hasRendered$delegate, this.$currentAd$delegate, this.$latestOnCrashLoggingRequired$delegate, this.$currentCreativeType$delegate, this.$latestOnAdFailedToLoad$delegate, this.$activity, this.$lifecycleOwner, this.$targetingHelper, this.$context, this.$lifecycleReporter, this.$lifecycleContext, this.$bannerUiSpec, this.$isDisposed, this.$spec, this.$latestOnAdLoadedSize$delegate, this.$latestOnAdRendered$delegate, this.$adDimens, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((AdsterUnifiedAd_androidKt$AdsterUnifiedAdContent$4$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        int intValue;
        Object objG;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        Unit unit = Unit.f17538a;
        if (i == 0) {
            ResultKt.b(obj);
            if (this.$debugFixtureSelection instanceof UnifiedAdDebugFixtureSelection.Off) {
                MutableIntState mutableIntState = this.$activeRequestToken$delegate;
                mutableIntState.setIntValue(mutableIntState.getIntValue() + 1);
                intValue = this.$activeRequestToken$delegate.getIntValue();
                AdsterSdkInitState value = this.$initState$delegate.getValue();
                if (value instanceof AdsterSdkInitState.Initialized) {
                    AdsterUnifiedAd_androidKt.f(this.$isTerminalFailure$delegate, false);
                    this.$renderedHeightDp$delegate.setIntValue(0);
                    AdsterUnifiedAd_androidKt.g(this.$hasRendered$delegate, false);
                    this.$container.removeAllViews();
                    AdsterUnifiedAd_androidKt.n(this.$currentAd$delegate.getValue(), this.$latestOnCrashLoggingRequired$delegate.getValue());
                    this.$currentAd$delegate.setValue(null);
                    this.$currentCreativeType$delegate.setValue(null);
                    UnifiedAdHostState unifiedAdHostStateC = AdsterUnifiedAd_androidKt.c(this.$activity, this.$lifecycleOwner, this.$container);
                    if (unifiedAdHostStateC.f841a && unifiedAdHostStateC.b) {
                        DefaultScheduler defaultScheduler = Dispatchers.f17721a;
                        AdsterUnifiedAd_androidKt$AdsterUnifiedAdContent$4$1$targeting$1 adsterUnifiedAd_androidKt$AdsterUnifiedAdContent$4$1$targeting$1 = new AdsterUnifiedAd_androidKt$AdsterUnifiedAdContent$4$1$targeting$1(this.$targetingHelper, null);
                        this.I$0 = intValue;
                        this.label = 1;
                        objG = BuildersKt.g(defaultScheduler, adsterUnifiedAd_androidKt$AdsterUnifiedAdContent$4$1$targeting$1, this);
                        if (objG != coroutineSingletons) {
                        }
                    }
                    String message = this.$logContext + " suppressed load hostState=" + unifiedAdHostStateC;
                    Intrinsics.i(message, "message");
                    return unit;
                }
                if (!(value instanceof AdsterSdkInitState.Failed)) {
                    String message2 = this.$logContext + " waiting initState=" + Reflection.a(this.$initState$delegate.getValue().getClass()).f();
                    Intrinsics.i(message2, "message");
                    return unit;
                }
                AdsterSdkInitState value2 = this.$initState$delegate.getValue();
                Intrinsics.g(value2, "null cannot be cast to non-null type app.chalo.ads.AdsterSdkInitState.Failed");
                Throwable th = ((AdsterSdkInitState.Failed) value2).f723a;
                AdsterUnifiedAd_androidKt.f(this.$isTerminalFailure$delegate, true);
                this.$renderedHeightDp$delegate.setIntValue(0);
                AdsterUnifiedAd_androidKt.g(this.$hasRendered$delegate, false);
                AdsterUnifiedAd_androidKt.n(this.$currentAd$delegate.getValue(), this.$latestOnCrashLoggingRequired$delegate.getValue());
                this.$currentAd$delegate.setValue(null);
                this.$currentCreativeType$delegate.setValue(null);
                this.$container.removeAllViews();
                UnifiedAdFailureReporter failureReporter = this.$failureReporter;
                UnifiedAdSlot slot = this.$slot;
                String placementName = this.$placementName;
                String logContext = this.$logContext;
                Function1<Integer, Unit> value3 = this.$latestOnAdFailedToLoad$delegate.getValue();
                Function1<CrashlyticsLog, Unit> onCrashLoggingRequired = this.$latestOnCrashLoggingRequired$delegate.getValue();
                Intrinsics.i(failureReporter, "failureReporter");
                Intrinsics.i(slot, "slot");
                Intrinsics.i(placementName, "placementName");
                Intrinsics.i(logContext, "logContext");
                Intrinsics.i(onCrashLoggingRequired, "onCrashLoggingRequired");
                String strF = Reflection.a(th.getClass()).f();
                String message3 = th.getMessage();
                if (message3 == null) {
                    message3 = "";
                }
                String strG = z40.g("init_failed:", strF, ":", message3);
                failureReporter.a(new UnifiedAdTerminalFailureReport(placementName, UnifiedAdFailureReportingKt.a(slot), -1, strG, "unified", vo1.n(logContext, " init failed errorMessage=", strG), vo1.m("terminal_failure:", strG), th, 1024), value3, onCrashLoggingRequired);
                return unit;
            }
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            return unit;
        }
        intValue = this.I$0;
        ResultKt.b(obj);
        objG = obj;
        int i2 = intValue;
        long jCurrentTimeMillis = System.currentTimeMillis();
        DefaultScheduler defaultScheduler2 = Dispatchers.f17721a;
        MainCoroutineDispatcher mainCoroutineDispatcherG = MainDispatcherLoader.f17879a.g();
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$context, this.$placementName, (Map) objG, this.$lifecycleReporter, this.$lifecycleContext, this.$logContext, i2, this.$failureReporter, this.$container, this.$slot, this.$bannerUiSpec, jCurrentTimeMillis, this.$isDisposed, this.$activeRequestToken$delegate, this.$activity, this.$lifecycleOwner, this.$spec, this.$currentCreativeType$delegate, this.$latestOnCrashLoggingRequired$delegate, this.$currentAd$delegate, this.$latestOnAdFailedToLoad$delegate, this.$renderedHeightDp$delegate, this.$latestOnAdLoadedSize$delegate, this.$isTerminalFailure$delegate, this.$hasRendered$delegate, this.$latestOnAdRendered$delegate, this.$adDimens, null);
        this.label = 2;
        return BuildersKt.g(mainCoroutineDispatcherG, anonymousClass1, this) == coroutineSingletons ? coroutineSingletons : unit;
    }
}
