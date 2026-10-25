package app.chalo.ads;

import android.content.Context;
import android.widget.FrameLayout;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import app.chalo.crashlytics.CrashlyticsLog;
import app.chalo.utils.chalologger.ChaloLog;
import defpackage.v21;
import defpackage.xj1;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
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
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.ads.AdsterUnifiedAd_androidKt$AdsterUnifiedAdContent$3$1", f = "AdsterUnifiedAd.android.kt", l = {}, m = "invokeSuspend", v = 1)
final class AdsterUnifiedAd_androidKt$AdsterUnifiedAdContent$3$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MutableIntState $activeRequestToken$delegate;
    final /* synthetic */ AdsterUnifiedDimens $adDimens;
    final /* synthetic */ FrameLayout $container;
    final /* synthetic */ Context $context;
    final /* synthetic */ MutableState<Object> $currentAd$delegate;
    final /* synthetic */ MutableState<UnifiedAdCreativeType> $currentCreativeType$delegate;
    final /* synthetic */ UnifiedAdDebugFixtureLifecycleTracker $debugFixtureLifecycleTracker;
    final /* synthetic */ UnifiedAdDebugFixtureRequest $debugFixtureRequest;
    final /* synthetic */ UnifiedAdDebugFixtureSelection $debugFixtureSelection;
    final /* synthetic */ MutableState<Boolean> $hasRendered$delegate;
    final /* synthetic */ AtomicBoolean $isDisposed;
    final /* synthetic */ MutableState<Boolean> $isTerminalFailure$delegate;
    final /* synthetic */ State<Function1<Integer, Unit>> $latestOnAdFailedToLoad$delegate;
    final /* synthetic */ State<Function2<Integer, Integer, Unit>> $latestOnAdLoadedSize$delegate;
    final /* synthetic */ State<Function0<Unit>> $latestOnAdRendered$delegate;
    final /* synthetic */ State<Function1<CrashlyticsLog, Unit>> $latestOnCrashLoggingRequired$delegate;
    final /* synthetic */ String $logContext;
    final /* synthetic */ MutableIntState $renderedHeightDp$delegate;
    final /* synthetic */ UnifiedAdSlot $slot;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdsterUnifiedAd_androidKt$AdsterUnifiedAdContent$3$1(UnifiedAdDebugFixtureRequest unifiedAdDebugFixtureRequest, UnifiedAdDebugFixtureLifecycleTracker unifiedAdDebugFixtureLifecycleTracker, FrameLayout frameLayout, UnifiedAdDebugFixtureSelection unifiedAdDebugFixtureSelection, String str, Context context, UnifiedAdSlot unifiedAdSlot, AdsterUnifiedDimens adsterUnifiedDimens, AtomicBoolean atomicBoolean, MutableIntState mutableIntState, MutableState mutableState, MutableIntState mutableIntState2, MutableState mutableState2, MutableState mutableState3, State state, MutableState mutableState4, State state2, State state3, State state4, Continuation continuation) {
        super(2, continuation);
        this.$debugFixtureRequest = unifiedAdDebugFixtureRequest;
        this.$debugFixtureLifecycleTracker = unifiedAdDebugFixtureLifecycleTracker;
        this.$container = frameLayout;
        this.$debugFixtureSelection = unifiedAdDebugFixtureSelection;
        this.$logContext = str;
        this.$context = context;
        this.$slot = unifiedAdSlot;
        this.$adDimens = adsterUnifiedDimens;
        this.$isDisposed = atomicBoolean;
        this.$activeRequestToken$delegate = mutableIntState;
        this.$isTerminalFailure$delegate = mutableState;
        this.$renderedHeightDp$delegate = mutableIntState2;
        this.$hasRendered$delegate = mutableState2;
        this.$currentAd$delegate = mutableState3;
        this.$latestOnCrashLoggingRequired$delegate = state;
        this.$currentCreativeType$delegate = mutableState4;
        this.$latestOnAdFailedToLoad$delegate = state2;
        this.$latestOnAdLoadedSize$delegate = state3;
        this.$latestOnAdRendered$delegate = state4;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AdsterUnifiedAd_androidKt$AdsterUnifiedAdContent$3$1(this.$debugFixtureRequest, this.$debugFixtureLifecycleTracker, this.$container, this.$debugFixtureSelection, this.$logContext, this.$context, this.$slot, this.$adDimens, this.$isDisposed, this.$activeRequestToken$delegate, this.$isTerminalFailure$delegate, this.$renderedHeightDp$delegate, this.$hasRendered$delegate, this.$currentAd$delegate, this.$latestOnCrashLoggingRequired$delegate, this.$currentCreativeType$delegate, this.$latestOnAdFailedToLoad$delegate, this.$latestOnAdLoadedSize$delegate, this.$latestOnAdRendered$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        AdsterUnifiedAd_androidKt$AdsterUnifiedAdContent$3$1 adsterUnifiedAd_androidKt$AdsterUnifiedAdContent$3$1 = (AdsterUnifiedAd_androidKt$AdsterUnifiedAdContent$3$1) create((CoroutineScope) obj, (Continuation) obj2);
        Unit unit = Unit.f17538a;
        adsterUnifiedAd_androidKt$AdsterUnifiedAdContent$3$1.invokeSuspend(unit);
        return unit;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str;
        Object objA;
        NativeBindingResult nativeBindingResult;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj);
        UnifiedAdDebugFixtureRequest unifiedAdDebugFixtureRequest = this.$debugFixtureRequest;
        Unit unit = Unit.f17538a;
        if (unifiedAdDebugFixtureRequest == null) {
            UnifiedAdDebugFixtureLifecycleTracker unifiedAdDebugFixtureLifecycleTracker = this.$debugFixtureLifecycleTracker;
            unifiedAdDebugFixtureLifecycleTracker.f829a = null;
            unifiedAdDebugFixtureLifecycleTracker.b = false;
            return unit;
        }
        UnifiedAdDebugFixtureLifecycleTracker unifiedAdDebugFixtureLifecycleTracker2 = this.$debugFixtureLifecycleTracker;
        unifiedAdDebugFixtureLifecycleTracker2.getClass();
        if (!Intrinsics.d(unifiedAdDebugFixtureLifecycleTracker2.f829a, unifiedAdDebugFixtureRequest)) {
            unifiedAdDebugFixtureLifecycleTracker2.f829a = unifiedAdDebugFixtureRequest;
            unifiedAdDebugFixtureLifecycleTracker2.b = false;
            MutableIntState mutableIntState = this.$activeRequestToken$delegate;
            mutableIntState.setIntValue(mutableIntState.getIntValue() + 1);
            int intValue = this.$activeRequestToken$delegate.getIntValue();
            AdsterUnifiedAd_androidKt.f(this.$isTerminalFailure$delegate, false);
            this.$renderedHeightDp$delegate.setIntValue(0);
            AdsterUnifiedAd_androidKt.g(this.$hasRendered$delegate, false);
            AdsterUnifiedAd_androidKt.n(this.$currentAd$delegate.getValue(), this.$latestOnCrashLoggingRequired$delegate.getValue());
            this.$currentAd$delegate.setValue(null);
            this.$currentCreativeType$delegate.setValue(null);
            this.$container.removeAllViews();
            UnifiedAdDebugFixtureSelection unifiedAdDebugFixtureSelection = this.$debugFixtureSelection;
            if (unifiedAdDebugFixtureSelection instanceof UnifiedAdDebugFixtureSelection.ForceFailure) {
                UnifiedAdDebugFixtureLifecycleTracker unifiedAdDebugFixtureLifecycleTracker3 = this.$debugFixtureLifecycleTracker;
                if (unifiedAdDebugFixtureLifecycleTracker3.b) {
                    return unit;
                }
                unifiedAdDebugFixtureLifecycleTracker3.b = true;
                AdsterUnifiedAd_androidKt.f(this.$isTerminalFailure$delegate, true);
                Function1<Integer, Unit> value = this.$latestOnAdFailedToLoad$delegate.getValue();
                if (value != null) {
                    value.invoke(new Integer(((UnifiedAdDebugFixtureSelection.ForceFailure) this.$debugFixtureSelection).f832a));
                }
                String message = this.$logContext + " debug fixture forced failure errorCode=" + ((UnifiedAdDebugFixtureSelection.ForceFailure) this.$debugFixtureSelection).f832a;
                Intrinsics.i(message, "message");
                return unit;
            }
            if (unifiedAdDebugFixtureSelection instanceof UnifiedAdDebugFixtureSelection.ForceRendered) {
                Context context = this.$context;
                FrameLayout container = this.$container;
                UnifiedAdSlot slot = this.$slot;
                UnifiedAdDebugRenderedContent fixture = ((UnifiedAdDebugFixtureSelection.ForceRendered) unifiedAdDebugFixtureSelection).f833a;
                AdsterUnifiedDimens adDimens = this.$adDimens;
                String logContext = this.$logContext;
                Intrinsics.i(context, "context");
                Intrinsics.i(container, "container");
                Intrinsics.i(slot, "slot");
                Intrinsics.i(fixture, "fixture");
                Intrinsics.i(adDimens, "adDimens");
                Intrinsics.i(logContext, "logContext");
                HomeInlineTemplateLayoutConfig homeInlineTemplateLayoutConfigR = AdsterUnifiedAd_androidKt.r(slot, fixture.f, adDimens);
                try {
                    str = logContext;
                    try {
                        objA = HomeInlineNativeTemplateBinder_androidKt.c(context, container, homeInlineTemplateLayoutConfigR, new HomeInlineTemplateContent(fixture.f838a, fixture.b, fixture.c, fixture.d, fixture.e), new xj1(24), new xj1(25), new v21(context, homeInlineTemplateLayoutConfigR, fixture, logContext));
                    } catch (Throwable th) {
                        th = th;
                        objA = ResultKt.a(th);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    str = logContext;
                }
                Throwable thA = Result.a(objA);
                if (thA == null) {
                    HomeInlineTemplateBindResult homeInlineTemplateBindResult = (HomeInlineTemplateBindResult) objA;
                    if (homeInlineTemplateBindResult.f785a) {
                        container.setVisibility(0);
                        nativeBindingResult = new NativeBindingResult(true, homeInlineTemplateBindResult.e, null);
                    } else {
                        ChaloLog.c("AdsterUnifiedAd", str.concat(" debug fixture layout bind returned false"), null);
                        nativeBindingResult = new NativeBindingResult(false, 0, null);
                    }
                } else {
                    ChaloLog.c("AdsterUnifiedAd", str.concat(" debug fixture bind failed"), thA);
                    nativeBindingResult = new NativeBindingResult(false, 0, null);
                }
                if (!nativeBindingResult.f803a) {
                    UnifiedAdDebugFixtureLifecycleTracker unifiedAdDebugFixtureLifecycleTracker4 = this.$debugFixtureLifecycleTracker;
                    if (unifiedAdDebugFixtureLifecycleTracker4.b) {
                        return unit;
                    }
                    unifiedAdDebugFixtureLifecycleTracker4.b = true;
                    AdsterUnifiedAd_androidKt.f(this.$isTerminalFailure$delegate, true);
                    Function1<Integer, Unit> value2 = this.$latestOnAdFailedToLoad$delegate.getValue();
                    if (value2 != null) {
                        value2.invoke(new Integer(-101));
                    }
                    ChaloLog.c("AdsterUnifiedAd", this.$logContext + " debug fixture render failed; falling back to failure callback", null);
                    return unit;
                }
                UnifiedAdDebugFixtureLifecycleTracker unifiedAdDebugFixtureLifecycleTracker5 = this.$debugFixtureLifecycleTracker;
                if (!unifiedAdDebugFixtureLifecycleTracker5.b) {
                    unifiedAdDebugFixtureLifecycleTracker5.b = true;
                    MutableIntState mutableIntState2 = this.$renderedHeightDp$delegate;
                    int i = nativeBindingResult.b;
                    mutableIntState2.setIntValue(i);
                    Function2<Integer, Integer, Unit> value3 = this.$latestOnAdLoadedSize$delegate.getValue();
                    if (value3 != null) {
                        value3.invoke(new Integer(0), new Integer(i));
                    }
                    if (!this.$isDisposed.get() && intValue == this.$activeRequestToken$delegate.getIntValue() && !this.$hasRendered$delegate.getValue().booleanValue()) {
                        AdsterUnifiedAd_androidKt.g(this.$hasRendered$delegate, true);
                        Function0<Unit> value4 = this.$latestOnAdRendered$delegate.getValue();
                        if (value4 != null) {
                            value4.invoke();
                        }
                    }
                    String message2 = this.$logContext + " debug fixture rendered heightDp=" + i + " scenario=" + ((UnifiedAdDebugFixtureSelection.ForceRendered) this.$debugFixtureSelection).b.name();
                    Intrinsics.i(message2, "message");
                    return unit;
                }
            } else if (!Intrinsics.d(unifiedAdDebugFixtureSelection, UnifiedAdDebugFixtureSelection.Off.f834a)) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return unit;
    }
}
