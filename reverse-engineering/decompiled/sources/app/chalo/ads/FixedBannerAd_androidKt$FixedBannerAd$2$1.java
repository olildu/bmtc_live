package app.chalo.ads;

import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import app.chalo.utils.chalologger.ChaloLog;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.admanager.AdManagerAdView;
import defpackage.pk0;
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
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.ads.FixedBannerAd_androidKt$FixedBannerAd$2$1", f = "FixedBannerAd.android.kt", l = {91}, m = "invokeSuspend", v = 1)
final class FixedBannerAd_androidKt$FixedBannerAd$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $adUnitId;
    final /* synthetic */ AdManagerAdView $adView;
    final /* synthetic */ FixedBannerAdAnalyticsHelper $analyticsHelper;
    final /* synthetic */ int $effectiveWidth;
    final /* synthetic */ MutableState<Boolean> $hasRendered$delegate;
    final /* synthetic */ MutableState<Boolean> $isAdLoaded$delegate;
    final /* synthetic */ Function1<Integer, Unit> $onAdFailedToLoad;
    final /* synthetic */ Function2<Integer, Integer, Unit> $onAdLoadedSize;
    final /* synthetic */ MutableIntState $reservedHeightDp$delegate;
    final /* synthetic */ BannerAdSlot $slot;
    final /* synthetic */ FixedBannerAdTargetingHelper $targetingHelper;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FixedBannerAd_androidKt$FixedBannerAd$2$1(FixedBannerAdTargetingHelper fixedBannerAdTargetingHelper, AdManagerAdView adManagerAdView, FixedBannerAdAnalyticsHelper fixedBannerAdAnalyticsHelper, String str, BannerAdSlot bannerAdSlot, MutableState mutableState, MutableState mutableState2, MutableIntState mutableIntState, int i, Function2 function2, Function1 function1, Continuation continuation) {
        super(2, continuation);
        this.$targetingHelper = fixedBannerAdTargetingHelper;
        this.$adView = adManagerAdView;
        this.$analyticsHelper = fixedBannerAdAnalyticsHelper;
        this.$adUnitId = str;
        this.$slot = bannerAdSlot;
        this.$isAdLoaded$delegate = mutableState;
        this.$hasRendered$delegate = mutableState2;
        this.$reservedHeightDp$delegate = mutableIntState;
        this.$effectiveWidth = i;
        this.$onAdLoadedSize = function2;
        this.$onAdFailedToLoad = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new FixedBannerAd_androidKt$FixedBannerAd$2$1(this.$targetingHelper, this.$adView, this.$analyticsHelper, this.$adUnitId, this.$slot, this.$isAdLoaded$delegate, this.$hasRendered$delegate, this.$reservedHeightDp$delegate, this.$effectiveWidth, this.$onAdLoadedSize, this.$onAdFailedToLoad, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((FixedBannerAd_androidKt$FixedBannerAd$2$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objA;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            MutableState<Boolean> mutableState = this.$isAdLoaded$delegate;
            Boolean bool = Boolean.FALSE;
            mutableState.setValue(bool);
            this.$hasRendered$delegate.setValue(bool);
            this.$reservedHeightDp$delegate.setIntValue(50);
            FixedBannerAdTargetingHelper fixedBannerAdTargetingHelper = this.$targetingHelper;
            this.label = 1;
            objA = fixedBannerAdTargetingHelper.a(this);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            objA = obj;
        }
        AdManagerAdView adManagerAdView = this.$adView;
        adManagerAdView.setOnPaidEventListener(new c(this.$analyticsHelper, this.$adUnitId, this.$slot, adManagerAdView, 0));
        long jCurrentTimeMillis = System.currentTimeMillis();
        AdManagerAdView adManagerAdView2 = this.$adView;
        adManagerAdView2.setAdListener(new AdListener(jCurrentTimeMillis, this.$slot, this.$analyticsHelper, this.$adUnitId, adManagerAdView2, this.$effectiveWidth, this.$onAdLoadedSize, this.$isAdLoaded$delegate, this.$hasRendered$delegate, this.$reservedHeightDp$delegate, this.$onAdFailedToLoad) { // from class: app.chalo.ads.FixedBannerAd_androidKt$FixedBannerAd$2$1.2
            public final /* synthetic */ long c;
            public final /* synthetic */ BannerAdSlot d;
            public final /* synthetic */ FixedBannerAdAnalyticsHelper e;
            public final /* synthetic */ String f;
            public final /* synthetic */ Function2 g;
            public final /* synthetic */ MutableState h;
            public final /* synthetic */ MutableState i;
            public final /* synthetic */ MutableIntState j;
            public final /* synthetic */ Function1 k;

            {
                this.g = function2;
                this.h = mutableState;
                this.i = mutableState;
                this.j = mutableIntState;
                this.k = function1;
            }

            @Override // com.google.android.gms.ads.AdListener
            public final void onAdClicked() {
                StringBuilder sb = new StringBuilder("Fixed banner ad clicked for slot=");
                BannerAdSlot slot = this.d;
                sb.append(slot);
                String message = sb.toString();
                Intrinsics.i(message, "message");
                FixedBannerAdAnalyticsHelper fixedBannerAdAnalyticsHelper = this.e;
                fixedBannerAdAnalyticsHelper.getClass();
                String adUnitId = this.f;
                Intrinsics.i(adUnitId, "adUnitId");
                Intrinsics.i(slot, "slot");
                FixedBannerAdAnalyticsHelper.b(fixedBannerAdAnalyticsHelper, new FixedBannerAdAnalyticsMetadata(adUnitId, slot));
                throw null;
            }

            @Override // com.google.android.gms.ads.AdListener
            public final void onAdFailedToLoad(LoadAdError error) {
                Intrinsics.i(error, "error");
                ChaloLog.c("FixedBannerAd", pk0.g(error.getCode(), "Fixed banner ad failed to load: code=", ", message=", error.getMessage()), null);
                int code = error.getCode();
                String message = error.getMessage();
                Intrinsics.h(message, "getMessage(...)");
                this.e.getClass();
                String adUnitId = this.f;
                Intrinsics.i(adUnitId, "adUnitId");
                BannerAdSlot slot = this.d;
                Intrinsics.i(slot, "slot");
                FixedBannerAdAnalyticsHelper.a(new FixedBannerAdAnalyticsMetadata(adUnitId, slot), MapsKt.i(new Pair("errorCode", Integer.valueOf(code)), new Pair("errorMessage", message)));
                throw null;
            }

            @Override // com.google.android.gms.ads.AdListener
            public final void onAdImpression() {
                StringBuilder sb = new StringBuilder("Fixed banner ad recorded impression for slot=");
                BannerAdSlot slot = this.d;
                sb.append(slot);
                String message = sb.toString();
                Intrinsics.i(message, "message");
                FixedBannerAdAnalyticsHelper fixedBannerAdAnalyticsHelper = this.e;
                fixedBannerAdAnalyticsHelper.getClass();
                String adUnitId = this.f;
                Intrinsics.i(adUnitId, "adUnitId");
                Intrinsics.i(slot, "slot");
                FixedBannerAdAnalyticsHelper.b(fixedBannerAdAnalyticsHelper, new FixedBannerAdAnalyticsMetadata(adUnitId, slot));
                throw null;
            }

            @Override // com.google.android.gms.ads.AdListener
            public final void onAdLoaded() {
                long jCurrentTimeMillis2 = System.currentTimeMillis() - this.c;
                StringBuilder sb = new StringBuilder("Fixed banner ad loaded for slot=");
                BannerAdSlot slot = this.d;
                sb.append(slot);
                sb.append(" in ");
                sb.append(jCurrentTimeMillis2);
                sb.append("ms");
                String message = sb.toString();
                Intrinsics.i(message, "message");
                this.e.getClass();
                String adUnitId = this.f;
                Intrinsics.i(adUnitId, "adUnitId");
                Intrinsics.i(slot, "slot");
                FixedBannerAdAnalyticsHelper.a(new FixedBannerAdAnalyticsMetadata(adUnitId, slot), MapsKt.h(new Pair("adLoadTime", Long.valueOf(jCurrentTimeMillis2))));
                throw null;
            }
        });
        FixedBannerAdAnalyticsHelper fixedBannerAdAnalyticsHelper = this.$analyticsHelper;
        String adUnitId = this.$adUnitId;
        BannerAdSlot slot = this.$slot;
        fixedBannerAdAnalyticsHelper.getClass();
        Intrinsics.i(adUnitId, "adUnitId");
        Intrinsics.i(slot, "slot");
        FixedBannerAdAnalyticsHelper.b(fixedBannerAdAnalyticsHelper, new FixedBannerAdAnalyticsMetadata(adUnitId, slot));
        throw null;
    }
}
