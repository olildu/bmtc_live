package app.chalo.ads;

import androidx.compose.runtime.MutableState;
import app.chalo.utils.chalologger.ChaloLog;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.admanager.AdManagerAdRequest;
import com.google.android.gms.ads.admanager.AdManagerAdView;
import defpackage.pk0;
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
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.ads.InlineAdaptiveBannerAd_androidKt$InlineAdaptiveBannerAd$2$1", f = "InlineAdaptiveBannerAd.android.kt", l = {78}, m = "invokeSuspend", v = 1)
final class InlineAdaptiveBannerAd_androidKt$InlineAdaptiveBannerAd$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $adUnitId;
    final /* synthetic */ AdManagerAdView $adView;
    final /* synthetic */ BannerAdAnalyticsHelper $analyticsHelper;
    final /* synthetic */ MutableState<Boolean> $hasRendered$delegate;
    final /* synthetic */ MutableState<Boolean> $isAdLoaded$delegate;
    final /* synthetic */ Function1<Integer, Unit> $onAdFailedToLoad;
    final /* synthetic */ Function0<Unit> $onAdLoaded;
    final /* synthetic */ BannerAdSlot $slot;
    final /* synthetic */ BannerAdTargetingHelper $targetingHelper;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InlineAdaptiveBannerAd_androidKt$InlineAdaptiveBannerAd$2$1(BannerAdTargetingHelper bannerAdTargetingHelper, AdManagerAdView adManagerAdView, BannerAdAnalyticsHelper bannerAdAnalyticsHelper, String str, BannerAdSlot bannerAdSlot, MutableState mutableState, MutableState mutableState2, Function0 function0, Function1 function1, Continuation continuation) {
        super(2, continuation);
        this.$targetingHelper = bannerAdTargetingHelper;
        this.$adView = adManagerAdView;
        this.$analyticsHelper = bannerAdAnalyticsHelper;
        this.$adUnitId = str;
        this.$slot = bannerAdSlot;
        this.$isAdLoaded$delegate = mutableState;
        this.$hasRendered$delegate = mutableState2;
        this.$onAdLoaded = function0;
        this.$onAdFailedToLoad = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new InlineAdaptiveBannerAd_androidKt$InlineAdaptiveBannerAd$2$1(this.$targetingHelper, this.$adView, this.$analyticsHelper, this.$adUnitId, this.$slot, this.$isAdLoaded$delegate, this.$hasRendered$delegate, this.$onAdLoaded, this.$onAdFailedToLoad, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((InlineAdaptiveBannerAd_androidKt$InlineAdaptiveBannerAd$2$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            MutableState<Boolean> mutableState = this.$isAdLoaded$delegate;
            Boolean bool = Boolean.FALSE;
            mutableState.setValue(bool);
            this.$hasRendered$delegate.setValue(bool);
            BannerAdTargetingHelper bannerAdTargetingHelper = this.$targetingHelper;
            this.label = 1;
            obj = bannerAdTargetingHelper.a(this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        Map map = (Map) obj;
        AdManagerAdView adManagerAdView = this.$adView;
        adManagerAdView.setOnPaidEventListener(new c(this.$analyticsHelper, this.$adUnitId, this.$slot, adManagerAdView, 1));
        final long jCurrentTimeMillis = System.currentTimeMillis();
        AdManagerAdView adManagerAdView2 = this.$adView;
        final BannerAdSlot bannerAdSlot = this.$slot;
        final BannerAdAnalyticsHelper bannerAdAnalyticsHelper = this.$analyticsHelper;
        final String str = this.$adUnitId;
        final Function0<Unit> function0 = this.$onAdLoaded;
        final MutableState<Boolean> mutableState2 = this.$isAdLoaded$delegate;
        final Function1<Integer, Unit> function1 = this.$onAdFailedToLoad;
        adManagerAdView2.setAdListener(new AdListener() { // from class: app.chalo.ads.InlineAdaptiveBannerAd_androidKt$InlineAdaptiveBannerAd$2$1.2
            @Override // com.google.android.gms.ads.AdListener
            public final void onAdClicked() {
                StringBuilder sb = new StringBuilder("Banner ad clicked for slot=");
                BannerAdSlot slot = bannerAdSlot;
                sb.append(slot);
                String message = sb.toString();
                Intrinsics.i(message, "message");
                BannerAdAnalyticsHelper bannerAdAnalyticsHelper2 = bannerAdAnalyticsHelper;
                bannerAdAnalyticsHelper2.getClass();
                String adUnitId = str;
                Intrinsics.i(adUnitId, "adUnitId");
                Intrinsics.i(slot, "slot");
                bannerAdAnalyticsHelper2.a("ad clicked", new BannerAdAnalyticsMetadata(adUnitId, slot), MapsKt.d());
            }

            @Override // com.google.android.gms.ads.AdListener
            public final void onAdFailedToLoad(LoadAdError error) {
                Intrinsics.i(error, "error");
                ChaloLog.c("InlineAdaptiveBannerAd", pk0.g(error.getCode(), "Banner ad failed to load: code=", ", message=", error.getMessage()), null);
                int code = error.getCode();
                String message = error.getMessage();
                Intrinsics.h(message, "getMessage(...)");
                BannerAdAnalyticsHelper bannerAdAnalyticsHelper2 = bannerAdAnalyticsHelper;
                bannerAdAnalyticsHelper2.getClass();
                String adUnitId = str;
                Intrinsics.i(adUnitId, "adUnitId");
                BannerAdSlot slot = bannerAdSlot;
                Intrinsics.i(slot, "slot");
                bannerAdAnalyticsHelper2.a("ad load failed", new BannerAdAnalyticsMetadata(adUnitId, slot), MapsKt.i(new Pair("errorCode", Integer.valueOf(code)), new Pair("errorMessage", message)));
                mutableState2.setValue(Boolean.FALSE);
                Function1 function2 = function1;
                if (function2 != null) {
                    function2.invoke(Integer.valueOf(error.getCode()));
                }
            }

            @Override // com.google.android.gms.ads.AdListener
            public final void onAdImpression() {
                StringBuilder sb = new StringBuilder("Banner ad recorded impression for slot=");
                BannerAdSlot slot = bannerAdSlot;
                sb.append(slot);
                String message = sb.toString();
                Intrinsics.i(message, "message");
                BannerAdAnalyticsHelper bannerAdAnalyticsHelper2 = bannerAdAnalyticsHelper;
                bannerAdAnalyticsHelper2.getClass();
                String adUnitId = str;
                Intrinsics.i(adUnitId, "adUnitId");
                Intrinsics.i(slot, "slot");
                bannerAdAnalyticsHelper2.a("ad impression", new BannerAdAnalyticsMetadata(adUnitId, slot), MapsKt.d());
            }

            @Override // com.google.android.gms.ads.AdListener
            public final void onAdLoaded() {
                long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                StringBuilder sb = new StringBuilder("Banner ad loaded for slot=");
                BannerAdSlot slot = bannerAdSlot;
                sb.append(slot);
                sb.append(" in ");
                sb.append(jCurrentTimeMillis2);
                sb.append("ms");
                String message = sb.toString();
                Intrinsics.i(message, "message");
                BannerAdAnalyticsHelper bannerAdAnalyticsHelper2 = bannerAdAnalyticsHelper;
                bannerAdAnalyticsHelper2.getClass();
                String adUnitId = str;
                Intrinsics.i(adUnitId, "adUnitId");
                Intrinsics.i(slot, "slot");
                bannerAdAnalyticsHelper2.a("ad loaded", new BannerAdAnalyticsMetadata(adUnitId, slot), MapsKt.h(new Pair("adLoadTime", Long.valueOf(jCurrentTimeMillis2))));
                mutableState2.setValue(Boolean.TRUE);
                Function0 function2 = function0;
                if (function2 != null) {
                    function2.invoke();
                }
            }
        });
        BannerAdAnalyticsHelper bannerAdAnalyticsHelper2 = this.$analyticsHelper;
        String adUnitId = this.$adUnitId;
        BannerAdSlot slot = this.$slot;
        bannerAdAnalyticsHelper2.getClass();
        Intrinsics.i(adUnitId, "adUnitId");
        Intrinsics.i(slot, "slot");
        bannerAdAnalyticsHelper2.a("ad requested", new BannerAdAnalyticsMetadata(adUnitId, slot), MapsKt.d());
        AdManagerAdRequest.Builder builder = new AdManagerAdRequest.Builder();
        AdRequestExtensionsKt.a(builder, map);
        AdManagerAdRequest adManagerAdRequestBuild = builder.build();
        Intrinsics.h(adManagerAdRequestBuild, "build(...)");
        this.$adView.loadAd(adManagerAdRequestBuild);
        BannerAdSlot bannerAdSlot2 = this.$slot;
        boolean zIsEmpty = map.isEmpty();
        Object obj2 = map;
        if (zIsEmpty) {
            obj2 = "{}";
        }
        String message = "Loading banner ad for slot=" + bannerAdSlot2 + " with targeting=" + obj2;
        Intrinsics.i(message, "message");
        return Unit.f17538a;
    }
}
