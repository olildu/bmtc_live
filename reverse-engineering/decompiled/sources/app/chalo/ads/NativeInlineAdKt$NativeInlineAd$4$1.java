package app.chalo.ads;

import android.content.Context;
import android.os.Bundle;
import android.view.ViewGroup;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.unit.IntSize;
import app.chalo.analytics.AnalyticsContractImplKt;
import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.constants.Source;
import app.chalo.data.MiscellaneousCityWiseConfigForCity;
import app.chalo.usecase.GetMiscellaneousCityWiseFlagsConfigUseCase;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdLoader;
import com.google.android.gms.ads.AdValue;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.MediaContent;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.ads.admanager.AdManagerAdRequest;
import com.google.android.gms.ads.nativead.MediaView;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.nativead.NativeAdOptions;
import com.google.android.gms.ads.nativead.NativeAdView;
import com.google.android.gms.fido.fido2.api.common.DevicePublicKeyStringDef;
import defpackage.nf1;
import defpackage.pk0;
import in.juspay.hyper.constants.Labels;
import in.juspay.hypersdk.analytics.LogConstants;
import in.juspay.hypersdk.core.PaymentConstants;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.TimeoutKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.ads.NativeInlineAdKt$NativeInlineAd$4$1", f = "NativeInlineAd.kt", l = {90, 462, 491}, m = "invokeSuspend", v = 1)
final class NativeInlineAdKt$NativeInlineAd$4$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $adUnitId;
    final /* synthetic */ NativeInlineAdAnalyticsHelper $analyticsHelper;
    final /* synthetic */ MutableState<NativeAdLayoutCache.Key> $cacheKey$delegate;
    final /* synthetic */ Context $context;
    final /* synthetic */ MutableState<IntSize> $lastReadySize$delegate;
    final /* synthetic */ MutableState<MediaDebugInfo> $mediaDebugInfo$delegate;
    final /* synthetic */ MutableState<MediaView> $mediaViewRef$delegate;
    final /* synthetic */ MutableState<NativeAdView> $nativeAdViewRef$delegate;
    final /* synthetic */ Map<String, String> $normalizedTargeting;
    final /* synthetic */ Function2<Integer, BindNativeAdResult.Failed, Unit> $onAdFailedToLoad;
    final /* synthetic */ Function2<BindNativeAdResult.Success, Long, Unit> $onAdLoaded;
    final /* synthetic */ NativeInlineAdPrefetchDependencies $prefetchDependencies;
    final /* synthetic */ CoroutineScope $prefetchScheduleScope;
    final /* synthetic */ MutableState<NativeInlineAdRenderState> $renderState$delegate;
    final /* synthetic */ LoadRequestKey $requestKey;
    final /* synthetic */ MutableState<LoadRequestMarker> $requestMarker$delegate;
    final /* synthetic */ NativeInlineAdSlot $slot;
    long J$0;
    long J$1;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    boolean Z$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeInlineAdKt$NativeInlineAd$4$1(LoadRequestKey loadRequestKey, String str, NativeInlineAdSlot nativeInlineAdSlot, Map map, NativeInlineAdAnalyticsHelper nativeInlineAdAnalyticsHelper, NativeInlineAdPrefetchDependencies nativeInlineAdPrefetchDependencies, Context context, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, MutableState mutableState5, MutableState mutableState6, MutableState mutableState7, Function2 function2, CoroutineScope coroutineScope, Function2 function3, Continuation continuation) {
        super(2, continuation);
        this.$requestKey = loadRequestKey;
        this.$adUnitId = str;
        this.$slot = nativeInlineAdSlot;
        this.$normalizedTargeting = map;
        this.$analyticsHelper = nativeInlineAdAnalyticsHelper;
        this.$prefetchDependencies = nativeInlineAdPrefetchDependencies;
        this.$context = context;
        this.$requestMarker$delegate = mutableState;
        this.$renderState$delegate = mutableState2;
        this.$mediaDebugInfo$delegate = mutableState3;
        this.$nativeAdViewRef$delegate = mutableState4;
        this.$mediaViewRef$delegate = mutableState5;
        this.$lastReadySize$delegate = mutableState6;
        this.$cacheKey$delegate = mutableState7;
        this.$onAdFailedToLoad = function2;
        this.$prefetchScheduleScope = coroutineScope;
        this.$onAdLoaded = function3;
    }

    public static final void h(String str, NativeInlineAdSlot nativeInlineAdSlot, NativeInlineAdAnalyticsHelper nativeInlineAdAnalyticsHelper, String str2, NativeInlineAdRenderState nativeInlineAdRenderState) {
        NativeInlineAdLifecycleFlags nativeInlineAdLifecycleFlags = nativeInlineAdRenderState.c;
        if (nativeInlineAdLifecycleFlags.c) {
            return;
        }
        nativeInlineAdLifecycleFlags.c = true;
        NativeInlineAdKt.c("clicked", nativeInlineAdRenderState.f817a, str, nativeInlineAdSlot, str2, nativeInlineAdRenderState.d, null, 192);
        NativeInlineAdAnalyticsMetadata nativeInlineAdAnalyticsMetadata = nativeInlineAdRenderState.k;
        nativeInlineAdAnalyticsHelper.getClass();
        nativeInlineAdAnalyticsHelper.a("ad clicked", nativeInlineAdAnalyticsMetadata, MapsKt.d());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void l(String str, NativeInlineAdSlot nativeInlineAdSlot, NativeInlineAdAnalyticsHelper nativeInlineAdAnalyticsHelper, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, String str2, NativeInlineAdRenderState nativeInlineAdRenderState) {
        String strF;
        NativeInlineAdLifecycleFlags nativeInlineAdLifecycleFlags = nativeInlineAdRenderState.c;
        if (nativeInlineAdLifecycleFlags.b) {
            return;
        }
        nativeInlineAdLifecycleFlags.b = true;
        MediaView mediaView = (MediaView) mutableState.getValue();
        NativeAdView nativeAdView = (NativeAdView) mutableState2.getValue();
        MediaDebugInfo mediaDebugInfo = (MediaDebugInfo) mutableState3.getValue();
        long j = nativeInlineAdRenderState.f817a;
        NativeAd nativeAd = nativeInlineAdRenderState.d;
        Integer numValueOf = nativeAdView != null ? Integer.valueOf(nativeAdView.getWidth()) : null;
        Integer numValueOf2 = nativeAdView != null ? Integer.valueOf(nativeAdView.getHeight()) : null;
        Integer numValueOf3 = mediaView != null ? Integer.valueOf(mediaView.getWidth()) : null;
        Integer numValueOf4 = mediaView != null ? Integer.valueOf(mediaView.getHeight()) : null;
        Integer numValueOf5 = mediaDebugInfo != null ? Integer.valueOf(mediaDebugInfo.f797a) : null;
        Integer numValueOf6 = mediaDebugInfo != null ? Integer.valueOf(mediaDebugInfo.b) : null;
        ViewGroup.LayoutParams layoutParams = mediaView != null ? mediaView.getLayoutParams() : null;
        if (layoutParams == null || (strF = pk0.f(layoutParams.width, layoutParams.height, "LayoutParams(w=", ",h=", ")")) == null) {
            strF = "lp=null";
        }
        StringBuilder sb = new StringBuilder("nativeView=");
        sb.append(numValueOf);
        sb.append("x");
        sb.append(numValueOf2);
        sb.append(" mediaSize=");
        pk0.y(sb, numValueOf3, "x", numValueOf4, " target=");
        pk0.y(sb, numValueOf5, "x", numValueOf6, " lp=");
        sb.append(strF);
        NativeInlineAdKt.c("impression", j, str, nativeInlineAdSlot, str2, nativeAd, sb.toString(), 64);
        NativeInlineAdAnalyticsMetadata nativeInlineAdAnalyticsMetadata = nativeInlineAdRenderState.k;
        nativeInlineAdAnalyticsHelper.getClass();
        nativeInlineAdAnalyticsHelper.a("ad impression", nativeInlineAdAnalyticsMetadata, MapsKt.d());
    }

    /* JADX WARN: Code duplicated, block: B:53:0x00fd  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v9, types: [app.chalo.ads.NativeInlineAdKt$NativeInlineAd$4$1$bindLoadedAd$6] */
    public static final void n(final long j, final String str, final NativeInlineAdSlot nativeInlineAdSlot, LoadRequestKey loadRequestKey, Map map, Function2 function2, NativeInlineAdPrefetchDependencies nativeInlineAdPrefetchDependencies, Ref.LongRef longRef, boolean z, CoroutineScope coroutineScope, Function2 function3, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, final NativeInlineAdAnalyticsHelper nativeInlineAdAnalyticsHelper, final MutableState mutableState4, final MutableState mutableState5, final MutableState mutableState6, final NativeAd nativeAd, boolean z2, boolean z3) {
        int i;
        float fFloatValue;
        NativeMediaAspectRatioCategory nativeMediaAspectRatioCategory;
        NativeInlineContentLayout nativeInlineContentLayout;
        BindNativeAdResult.Failed failed;
        NativeAd nativeAd2;
        Bundle responseExtras;
        String responseId;
        final NativeInlineAdLoadSource nativeInlineAdLoadSource = z3 ? NativeInlineAdLoadSource.Prefetch : NativeInlineAdLoadSource.Direct;
        NativeInlineAdKt.c("bind_start", j, str, nativeInlineAdSlot, nativeInlineAdLoadSource.getLogValue(), nativeAd, null, 192);
        LoadRequestMarker loadRequestMarker = (LoadRequestMarker) mutableState.getValue();
        if (!Intrinsics.d(loadRequestMarker != null ? loadRequestMarker.f795a : null, loadRequestKey) || loadRequestMarker.b != LoadStatus.LOADING) {
            NativeInlineAdKt.c("bind_ignored_stale", j, str, nativeInlineAdSlot, nativeInlineAdLoadSource.getLogValue(), nativeAd, null, 192);
            try {
                nativeAd.destroy();
                return;
            } catch (Throwable th) {
                ResultKt.a(th);
                return;
            }
        }
        MediaContent mediaContent = nativeAd.getMediaContent();
        boolean z4 = mediaContent != null && mediaContent.hasVideoContent();
        if (z4) {
            VideoController videoController = mediaContent != null ? mediaContent.getVideoController() : null;
            i = 1;
            VideoController videoController2 = videoController;
            NativeInlineAdKt.c("video_asset_detected", j, str, nativeInlineAdSlot, nativeInlineAdLoadSource.getLogValue(), nativeAd, "controller=" + (videoController != null) + " isCustomControlsEnabled=" + (videoController != null ? Boolean.valueOf(videoController.isCustomControlsEnabled()) : null) + " isClickToExpandEnabled=" + (videoController != null ? Boolean.valueOf(videoController.isClickToExpandEnabled()) : null), 64);
            if (videoController2 != null) {
                videoController2.setVideoLifecycleCallbacks(new VideoController.VideoLifecycleCallbacks() { // from class: app.chalo.ads.NativeInlineAdKt$NativeInlineAd$4$1$bindLoadedAd$2
                    @Override // com.google.android.gms.ads.VideoController.VideoLifecycleCallbacks
                    public final void onVideoEnd() {
                        NativeInlineAdKt.c("video_lifecycle_end", j, str, nativeInlineAdSlot, nativeInlineAdLoadSource.getLogValue(), nativeAd, null, 192);
                    }

                    @Override // com.google.android.gms.ads.VideoController.VideoLifecycleCallbacks
                    public final void onVideoMute(boolean z5) {
                        NativeInlineAdKt.c("video_lifecycle_mute", j, str, nativeInlineAdSlot, nativeInlineAdLoadSource.getLogValue(), nativeAd, "isMuted=" + z5, 64);
                    }

                    @Override // com.google.android.gms.ads.VideoController.VideoLifecycleCallbacks
                    public final void onVideoPause() {
                        NativeInlineAdKt.c("video_lifecycle_pause", j, str, nativeInlineAdSlot, nativeInlineAdLoadSource.getLogValue(), nativeAd, null, 192);
                    }

                    @Override // com.google.android.gms.ads.VideoController.VideoLifecycleCallbacks
                    public final void onVideoPlay() {
                        NativeInlineAdKt.c("video_lifecycle_play", j, str, nativeInlineAdSlot, nativeInlineAdLoadSource.getLogValue(), nativeAd, null, 192);
                    }

                    @Override // com.google.android.gms.ads.VideoController.VideoLifecycleCallbacks
                    public final void onVideoStart() {
                        NativeInlineAdKt.c("video_lifecycle_start", j, str, nativeInlineAdSlot, nativeInlineAdLoadSource.getLogValue(), nativeAd, null, 192);
                    }
                });
            }
            if (videoController2 != null) {
                NativeInlineAdKt.c("video_mute_requested", j, str, nativeInlineAdSlot, nativeInlineAdLoadSource.getLogValue(), nativeAd, "muted=true", 64);
                try {
                    videoController2.mute(true);
                } catch (Throwable th2) {
                    ResultKt.a(th2);
                }
            }
        } else {
            i = 1;
        }
        if (mediaContent != null) {
            float aspectRatio = mediaContent.getAspectRatio();
            Float fValueOf = Float.valueOf(aspectRatio);
            if (aspectRatio <= 0.0f) {
                fValueOf = null;
            }
            if (fValueOf != null) {
                fFloatValue = fValueOf.floatValue();
            } else {
                fFloatValue = 1.7777778f;
            }
        } else {
            fFloatValue = 1.7777778f;
        }
        float f = fFloatValue;
        NativeMediaAspectRatioCategory.INSTANCE.getClass();
        if (f >= 1.6f) {
            nativeMediaAspectRatioCategory = NativeMediaAspectRatioCategory.LandScape;
        } else if (0.7f > f || f > 0.9f) {
            nativeMediaAspectRatioCategory = (f <= 0.9f || f > 1.1f) ? NativeMediaAspectRatioCategory.Unknown : NativeMediaAspectRatioCategory.SquareImage;
        } else {
            nativeMediaAspectRatioCategory = NativeMediaAspectRatioCategory.PortraitImage;
        }
        NativeMediaAspectRatioCategory nativeMediaAspectRatioCategory2 = nativeMediaAspectRatioCategory;
        int i2 = NativeInlineAdKt.WhenMappings.c[nativeMediaAspectRatioCategory2.ordinal()];
        if (i2 == i) {
            nativeInlineContentLayout = NativeInlineContentLayout.Hero;
        } else {
            if (i2 != 2 && i2 != 3 && i2 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            nativeInlineContentLayout = NativeInlineContentLayout.Card;
        }
        NativeAdLayoutCache.Key key = new NativeAdLayoutCache.Key(str, map, nativeMediaAspectRatioCategory2);
        mutableState2.setValue(key);
        NativeAdLayoutCache.CachedSize cachedSizeA = NativeAdLayoutCache.f798a.a(key);
        if (mediaContent == null) {
            failed = BindNativeAdResult.Failed.NoAdMediaContent.b;
        } else {
            String headline = nativeAd.getHeadline();
            failed = (headline == null || StringsKt.F(headline)) ? BindNativeAdResult.Failed.NoAdHeadlineAvailable.b : null;
        }
        if (failed != null) {
            String str2 = failed.f753a;
            Object obj = failed;
            NativeInlineAdTelemetry.c("bind_failed", Long.valueOf(j), str, nativeInlineAdSlot, nativeInlineAdLoadSource.getLogValue(), nativeAd, "reason=".concat(str2), 1);
            try {
                nativeAd.destroy();
            } catch (Throwable th3) {
                ResultKt.a(th3);
            }
            mutableState.setValue(null);
            mutableState3.setValue(null);
            if (!z2) {
                NativeInlineAdKt.c("bind_failed_suppressed", j, str, nativeInlineAdSlot, nativeInlineAdLoadSource.getLogValue(), null, "reason=".concat(str2), 96);
                return;
            } else {
                if (function2 != null) {
                    function2.invoke(-1, obj);
                    return;
                }
                return;
            }
        }
        NativeInlineAdLifecycleFlags nativeInlineAdLifecycleFlags = new NativeInlineAdLifecycleFlags();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String advertiser = nativeAd.getAdvertiser();
        if (advertiser != null) {
        }
        String store = nativeAd.getStore();
        if (store != null) {
        }
        String price = nativeAd.getPrice();
        if (price != null) {
        }
        Double starRating = nativeAd.getStarRating();
        if (starRating != null) {
        }
        ResponseInfo responseInfo = nativeAd.getResponseInfo();
        if (responseInfo != null && (responseId = responseInfo.getResponseId()) != null) {
        }
        ResponseInfo responseInfo2 = nativeAd.getResponseInfo();
        if (responseInfo2 != null && (responseExtras = responseInfo2.getResponseExtras()) != null) {
            String string = responseExtras.getString("creative_id");
            if (string != null) {
            }
            String string2 = responseExtras.getString("line_item_id");
            if (string2 != null) {
                linkedHashMap.put("line_item_id", string2);
            }
        }
        NativeInlineContentLayout nativeInlineContentLayout2 = nativeInlineContentLayout;
        final NativeInlineAdRenderState nativeInlineAdRenderState = new NativeInlineAdRenderState(j, nativeInlineAdLoadSource, nativeInlineAdLifecycleFlags, nativeAd, nativeMediaAspectRatioCategory2, nativeInlineContentLayout2, key, cachedSizeA, f, linkedHashMap, new NativeInlineAdAnalyticsMetadata(str, nativeInlineAdSlot, z4, nativeInlineAdLoadSource.getLogValue(), nativeMediaAspectRatioCategory2, f));
        mutableState3.setValue(nativeInlineAdRenderState);
        nativeAd.setOnPaidEventListener(new OnPaidEventListener() { // from class: app.chalo.ads.j
            @Override // com.google.android.gms.ads.OnPaidEventListener
            public final void onPaidEvent(AdValue adValue) {
                String responseId2;
                NativeInlineAdRenderState nativeInlineAdRenderState2 = nativeInlineAdRenderState;
                NativeAd nativeAd3 = nativeInlineAdRenderState2.d;
                ResponseInfo responseInfo3 = nativeAd.getResponseInfo();
                NativeInlineAdLifecycleFlags nativeInlineAdLifecycleFlags2 = nativeInlineAdRenderState2.c;
                NativeInlineAdAnalyticsMetadata nativeInlineAdAnalyticsMetadata = nativeInlineAdRenderState2.k;
                if (nativeInlineAdLifecycleFlags2.d) {
                    return;
                }
                nativeInlineAdLifecycleFlags2.d = true;
                long j2 = nativeInlineAdRenderState2.f817a;
                String logValue = nativeInlineAdRenderState2.b.getLogValue();
                String str3 = "micros=" + (adValue != null ? Long.valueOf(adValue.getValueMicros()) : null) + " currency=" + (adValue != null ? adValue.getCurrencyCode() : null) + " precision=" + (adValue != null ? Integer.valueOf(adValue.getPrecisionType()) : null) + " responseId=" + (responseInfo3 != null ? responseInfo3.getResponseId() : null);
                String str4 = str;
                NativeInlineAdSlot nativeInlineAdSlot2 = nativeInlineAdSlot;
                NativeInlineAdKt.c("paid_impression", j2, str4, nativeInlineAdSlot2, logValue, nativeAd3, str3, 64);
                NativeInlineAdAnalyticsHelper nativeInlineAdAnalyticsHelper2 = nativeInlineAdAnalyticsHelper;
                nativeInlineAdAnalyticsHelper2.getClass();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                if (adValue != null) {
                    linkedHashMap2.put("valueMicros", Long.valueOf(adValue.getValueMicros()));
                    String currencyCode = adValue.getCurrencyCode();
                    if (currencyCode == null) {
                        currencyCode = "";
                    }
                    linkedHashMap2.put("currencyCode", currencyCode);
                    linkedHashMap2.put("precision", Integer.valueOf(adValue.getPrecisionType()));
                }
                if (responseInfo3 != null && (responseId2 = responseInfo3.getResponseId()) != null) {
                    linkedHashMap2.put("responseId", responseId2);
                }
                nativeInlineAdAnalyticsHelper2.a("ad paid impression", nativeInlineAdAnalyticsMetadata, linkedHashMap2);
                if (nativeInlineAdLifecycleFlags2.b) {
                    return;
                }
                nativeInlineAdLifecycleFlags2.b = true;
                NativeInlineAdKt.c("impression", nativeInlineAdRenderState2.f817a, str4, nativeInlineAdSlot2, "paid_event", nativeAd3, null, 192);
                nativeInlineAdAnalyticsHelper2.a("ad impression", nativeInlineAdAnalyticsMetadata, MapsKt.d());
            }
        });
        if (z3) {
            nativeAd2 = nativeAd;
            nativeInlineAdPrefetchDependencies.a().d(nativeAd2, new AndroidNativeInlineAdPrefetcher.InteractionListener() { // from class: app.chalo.ads.NativeInlineAdKt$NativeInlineAd$4$1$bindLoadedAd$6
                @Override // app.chalo.ads.AndroidNativeInlineAdPrefetcher.InteractionListener
                public final void a() {
                    NativeInlineAdKt$NativeInlineAd$4$1.h(str, nativeInlineAdSlot, nativeInlineAdAnalyticsHelper, Labels.HyperSdk.PREFETCH, nativeInlineAdRenderState);
                }

                @Override // app.chalo.ads.AndroidNativeInlineAdPrefetcher.InteractionListener
                public final void b() {
                    NativeInlineAdKt$NativeInlineAd$4$1.l(str, nativeInlineAdSlot, nativeInlineAdAnalyticsHelper, mutableState4, mutableState5, mutableState6, Labels.HyperSdk.PREFETCH, nativeInlineAdRenderState);
                }
            });
        } else {
            nativeAd2 = nativeAd;
        }
        mutableState.setValue(new LoadRequestMarker(loadRequestKey, LoadStatus.LOADED));
        long jCurrentTimeMillis = System.currentTimeMillis() - longRef.element;
        NativeInlineAdKt.c("loaded", j, str, nativeInlineAdSlot, r15.getLogValue(), nativeAd2, "loadTimeMs=" + jCurrentTimeMillis + " layout=" + nativeInlineContentLayout2 + " aspect=" + nativeMediaAspectRatioCategory2 + " cache=" + cachedSizeA, 64);
        if (z) {
            BuildersKt.d(coroutineScope, null, null, new NativeInlineAdKt$NativeInlineAd$4$1$bindLoadedAd$7(j, str, nativeInlineAdSlot, map, nativeInlineAdPrefetchDependencies, null), 3);
        }
        if (function3 != null) {
            function3.invoke(new BindNativeAdResult.Success(linkedHashMap, f, nativeInlineAdLoadSource.getLogValue()), Long.valueOf(jCurrentTimeMillis));
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        NativeInlineAdKt$NativeInlineAd$4$1 nativeInlineAdKt$NativeInlineAd$4$1 = new NativeInlineAdKt$NativeInlineAd$4$1(this.$requestKey, this.$adUnitId, this.$slot, this.$normalizedTargeting, this.$analyticsHelper, this.$prefetchDependencies, this.$context, this.$requestMarker$delegate, this.$renderState$delegate, this.$mediaDebugInfo$delegate, this.$nativeAdViewRef$delegate, this.$mediaViewRef$delegate, this.$lastReadySize$delegate, this.$cacheKey$delegate, this.$onAdFailedToLoad, this.$prefetchScheduleScope, this.$onAdLoaded, continuation);
        nativeInlineAdKt$NativeInlineAd$4$1.L$0 = obj;
        return nativeInlineAdKt$NativeInlineAd$4$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((NativeInlineAdKt$NativeInlineAd$4$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code duplicated, block: B:110:0x0397  */
    /* JADX WARN: Code duplicated, block: B:112:0x039b  */
    /* JADX WARN: Code duplicated, block: B:115:0x03a2  */
    /* JADX WARN: Code duplicated, block: B:117:0x0419  */
    /* JADX WARN: Code duplicated, block: B:118:0x041c  */
    /* JADX WARN: Code duplicated, block: B:121:0x0425  */
    /* JADX WARN: Code duplicated, block: B:125:0x043c  */
    /* JADX WARN: Code duplicated, block: B:127:0x0446  */
    /* JADX WARN: Code duplicated, block: B:131:0x045c  */
    /* JADX WARN: Code duplicated, block: B:134:0x0471  */
    /* JADX WARN: Code duplicated, block: B:137:0x047a  */
    /* JADX WARN: Code duplicated, block: B:139:0x0481  */
    /* JADX WARN: Code duplicated, block: B:143:0x0506  */
    /* JADX WARN: Code duplicated, block: B:144:0x0509  */
    /* JADX WARN: Code duplicated, block: B:147:0x0512  */
    /* JADX WARN: Instruction removed from duplicated block: B:115:0x03a2, please report this as an issue */
    /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        long j;
        long jCurrentTimeMillis;
        CoroutineScope coroutineScope;
        long j2;
        Object objA;
        Object objA2;
        long j3;
        long j4;
        int i;
        AdManagerAdRequest adManagerAdRequestBuild;
        Unit unit;
        Source source;
        Ref.LongRef longRef;
        boolean z;
        long j5;
        String str;
        boolean z2;
        CoroutineScope coroutineScope2;
        String str2;
        CoroutineScope coroutineScope3;
        Object obj2;
        Ref.LongRef longRef2;
        CoroutineScope coroutineScope4;
        Object objC;
        LoadRequestKey loadRequestKey;
        Object objA3;
        long jMax;
        Ref.LongRef longRef3;
        long j6;
        Ref.LongRef longRef4;
        long j7;
        boolean z3;
        long j8;
        Ref.LongRef longRef5;
        Throwable thA;
        NativeAd nativeAd;
        LoadRequestMarker value;
        LoadRequestKey loadRequestKey2;
        final boolean z4;
        NativeAd nativeAdA;
        LoadRequestMarker value2;
        LoadRequestKey loadRequestKey3;
        Unit unit2 = Unit.f17538a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 == 0) {
            j = 500;
            ResultKt.b(obj);
            CoroutineScope coroutineScope5 = (CoroutineScope) this.L$0;
            jCurrentTimeMillis = System.currentTimeMillis();
            try {
                GetMiscellaneousCityWiseFlagsConfigUseCase getMiscellaneousCityWiseFlagsConfigUseCase = (GetMiscellaneousCityWiseFlagsConfigUseCase) this.$prefetchDependencies.f813a.getValue();
                this.L$0 = coroutineScope5;
                this.J$0 = jCurrentTimeMillis;
                this.J$1 = jCurrentTimeMillis;
                this.label = 1;
                objA = getMiscellaneousCityWiseFlagsConfigUseCase.a(this);
                if (objA != coroutineSingletons) {
                    coroutineScope = coroutineScope5;
                    j2 = jCurrentTimeMillis;
                }
            } catch (Throwable th) {
                th = th;
                coroutineScope = coroutineScope5;
                j2 = jCurrentTimeMillis;
                objA2 = ResultKt.a(th);
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            j = 500;
            j2 = this.J$1;
            jCurrentTimeMillis = this.J$0;
            coroutineScope = (CoroutineScope) this.L$0;
            try {
                ResultKt.b(obj);
                objA = obj;
            } catch (Throwable th2) {
                th = th2;
                objA2 = ResultKt.a(th);
            }
        } else {
            if (i2 == 2) {
                z = this.Z$0;
                j5 = this.J$1;
                j3 = this.J$0;
                longRef2 = (Ref.LongRef) this.L$2;
                AdManagerAdRequest adManagerAdRequest = (AdManagerAdRequest) this.L$1;
                coroutineScope4 = (CoroutineScope) this.L$0;
                try {
                    ResultKt.b(obj);
                    objC = obj;
                    unit = unit2;
                    j4 = 500;
                    i = 3;
                    adManagerAdRequestBuild = adManagerAdRequest;
                    str2 = "targetingKeys=";
                    obj2 = null;
                    try {
                        objA3 = (NativeAd) objC;
                    } catch (Throwable th3) {
                        th = th3;
                        objA3 = ResultKt.a(th);
                    }
                } catch (Throwable th4) {
                    th = th4;
                    unit = unit2;
                    j4 = 500;
                    i = 3;
                    adManagerAdRequestBuild = adManagerAdRequest;
                    str2 = "targetingKeys=";
                    obj2 = null;
                    objA3 = ResultKt.a(th);
                    z3 = z;
                    j8 = j5;
                    longRef5 = longRef2;
                    CoroutineScope coroutineScope6 = coroutineScope4;
                    thA = Result.a(objA3);
                    if (thA != null) {
                        if (!(thA instanceof CancellationException)) {
                            throw thA;
                        }
                        objA3 = obj2;
                    }
                    nativeAd = (NativeAd) objA3;
                    if (nativeAd != null) {
                        str = str2;
                        NativeInlineAdKt.c("prefetch_await_then_consume", j8, this.$adUnitId, this.$slot, "hit", null, str + this.$normalizedTargeting.keySet(), 96);
                        n(j8, this.$adUnitId, this.$slot, this.$requestKey, this.$normalizedTargeting, this.$onAdFailedToLoad, this.$prefetchDependencies, longRef5, z3, this.$prefetchScheduleScope, this.$onAdLoaded, this.$requestMarker$delegate, this.$cacheKey$delegate, this.$renderState$delegate, this.$analyticsHelper, this.$mediaViewRef$delegate, this.$nativeAdViewRef$delegate, this.$mediaDebugInfo$delegate, nativeAd, false, true);
                        value = this.$requestMarker$delegate.getValue();
                        if (value != null) {
                            loadRequestKey2 = value.f795a;
                        } else {
                            loadRequestKey2 = null;
                        }
                        if (!Intrinsics.d(loadRequestKey2, this.$requestKey)) {
                        }
                        this.$requestMarker$delegate.setValue(new LoadRequestMarker(this.$requestKey, LoadStatus.LOADING));
                    } else {
                        str = str2;
                    }
                    coroutineScope2 = coroutineScope6;
                    j5 = j8;
                    longRef = longRef5;
                    z2 = z3;
                    jMax = Math.max(0L, j4 - (System.currentTimeMillis() - j3));
                    if (jMax > 0) {
                        this.L$0 = coroutineScope2;
                        this.L$1 = adManagerAdRequestBuild;
                        this.L$2 = longRef;
                        this.J$0 = j5;
                        this.Z$0 = z2;
                        this.label = i;
                        if (DelayKt.b(jMax, this) != coroutineSingletons) {
                            longRef4 = longRef;
                            j7 = j5;
                            j6 = j7;
                            longRef3 = longRef4;
                        }
                        return coroutineSingletons;
                    }
                    longRef3 = longRef;
                    j6 = j5;
                    z4 = z2;
                    if (z4) {
                        NativeInlineAdKt.c("prefetch_consume", j6, this.$adUnitId, this.$slot, "late_hit", null, str + this.$normalizedTargeting.keySet(), 96);
                        long j9 = j6;
                        n(j9, this.$adUnitId, this.$slot, this.$requestKey, this.$normalizedTargeting, this.$onAdFailedToLoad, this.$prefetchDependencies, longRef3, z4, this.$prefetchScheduleScope, this.$onAdLoaded, this.$requestMarker$delegate, this.$cacheKey$delegate, this.$renderState$delegate, this.$analyticsHelper, this.$mediaViewRef$delegate, this.$nativeAdViewRef$delegate, this.$mediaDebugInfo$delegate, nativeAdA, false, true);
                        j6 = j9;
                        value2 = this.$requestMarker$delegate.getValue();
                        if (value2 != null) {
                            loadRequestKey3 = value2.f795a;
                        } else {
                            loadRequestKey3 = null;
                        }
                        if (!Intrinsics.d(loadRequestKey3, this.$requestKey)) {
                        }
                        this.$requestMarker$delegate.setValue(new LoadRequestMarker(this.$requestKey, LoadStatus.LOADING));
                    }
                    NativeInlineAdKt.c("direct_load_start", j6, this.$adUnitId, this.$slot, null, null, str + this.$normalizedTargeting.keySet(), 112);
                    AdLoader.Builder builderWithNativeAdOptions = new AdLoader.Builder(this.$context, this.$adUnitId).withNativeAdOptions(new NativeAdOptions.Builder().setVideoOptions(new VideoOptions.Builder().setStartMuted(true).build()).build());
                    final String str3 = this.$adUnitId;
                    final NativeInlineAdSlot nativeInlineAdSlot = this.$slot;
                    final LoadRequestKey loadRequestKey4 = this.$requestKey;
                    final Map<String, String> map = this.$normalizedTargeting;
                    final Function2<Integer, BindNativeAdResult.Failed, Unit> function2 = this.$onAdFailedToLoad;
                    final NativeInlineAdPrefetchDependencies nativeInlineAdPrefetchDependencies = this.$prefetchDependencies;
                    final CoroutineScope coroutineScope7 = this.$prefetchScheduleScope;
                    final Function2<BindNativeAdResult.Success, Long, Unit> function3 = this.$onAdLoaded;
                    final MutableState<LoadRequestMarker> mutableState = this.$requestMarker$delegate;
                    final MutableState<NativeAdLayoutCache.Key> mutableState2 = this.$cacheKey$delegate;
                    final MutableState<NativeInlineAdRenderState> mutableState3 = this.$renderState$delegate;
                    final NativeInlineAdAnalyticsHelper nativeInlineAdAnalyticsHelper = this.$analyticsHelper;
                    final MutableState<MediaView> mutableState4 = this.$mediaViewRef$delegate;
                    final MutableState<NativeAdView> mutableState5 = this.$nativeAdViewRef$delegate;
                    final MutableState<MediaDebugInfo> mutableState6 = this.$mediaDebugInfo$delegate;
                    final CoroutineScope coroutineScope8 = coroutineScope2;
                    final Ref.LongRef longRef6 = longRef3;
                    final long j10 = j6;
                    AdLoader.Builder builderForNativeAd = builderWithNativeAdOptions.forNativeAd(new NativeAd.OnNativeAdLoadedListener() { // from class: app.chalo.ads.i
                        @Override // com.google.android.gms.ads.nativead.NativeAd.OnNativeAdLoadedListener
                        public final void onNativeAdLoaded(NativeAd nativeAd2) {
                            String logValue = NativeInlineAdLoadSource.Direct.getLogValue();
                            long j11 = j10;
                            String str4 = str3;
                            NativeInlineAdSlot nativeInlineAdSlot2 = nativeInlineAdSlot;
                            NativeInlineAdKt.c("sdk_native_loaded", j11, str4, nativeInlineAdSlot2, logValue, nativeAd2, null, 192);
                            Intrinsics.f(nativeAd2);
                            NativeInlineAdKt$NativeInlineAd$4$1.n(j11, str4, nativeInlineAdSlot2, loadRequestKey4, map, function2, nativeInlineAdPrefetchDependencies, longRef6, z4, coroutineScope7, function3, mutableState, mutableState2, mutableState3, nativeInlineAdAnalyticsHelper, mutableState4, mutableState5, mutableState6, nativeAd2, true, false);
                        }
                    });
                    final String str4 = this.$adUnitId;
                    final NativeInlineAdSlot nativeInlineAdSlot2 = this.$slot;
                    final MutableState<NativeInlineAdRenderState> mutableState7 = this.$renderState$delegate;
                    final NativeInlineAdAnalyticsHelper nativeInlineAdAnalyticsHelper2 = this.$analyticsHelper;
                    final LoadRequestKey loadRequestKey5 = this.$requestKey;
                    final Function2<Integer, BindNativeAdResult.Failed, Unit> function4 = this.$onAdFailedToLoad;
                    final MutableState<LoadRequestMarker> mutableState8 = this.$requestMarker$delegate;
                    final MutableState<NativeAdLayoutCache.Key> mutableState9 = this.$cacheKey$delegate;
                    final MutableState<MediaView> mutableState10 = this.$mediaViewRef$delegate;
                    final MutableState<NativeAdView> mutableState11 = this.$nativeAdViewRef$delegate;
                    final MutableState<MediaDebugInfo> mutableState12 = this.$mediaDebugInfo$delegate;
                    builderForNativeAd.withAdListener(new AdListener() { // from class: app.chalo.ads.NativeInlineAdKt$NativeInlineAd$4$1.3
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // com.google.android.gms.ads.AdListener
                        public final void onAdClicked() {
                            NativeInlineAdRenderState nativeInlineAdRenderState = (NativeInlineAdRenderState) mutableState7.getValue();
                            if (nativeInlineAdRenderState != null && nativeInlineAdRenderState.f817a == j10 && nativeInlineAdRenderState.b == NativeInlineAdLoadSource.Direct) {
                                NativeInlineAdKt$NativeInlineAd$4$1.h(str4, nativeInlineAdSlot2, nativeInlineAdAnalyticsHelper2, DevicePublicKeyStringDef.DIRECT, nativeInlineAdRenderState);
                            }
                        }

                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // com.google.android.gms.ads.AdListener
                        public final void onAdFailedToLoad(LoadAdError adError) {
                            Intrinsics.i(adError, "adError");
                            long j11 = j10;
                            String str5 = str4;
                            NativeInlineAdSlot nativeInlineAdSlot3 = nativeInlineAdSlot2;
                            String logValue = NativeInlineAdLoadSource.Direct.getLogValue();
                            int code = adError.getCode();
                            String message = adError.getMessage();
                            ResponseInfo responseInfo = adError.getResponseInfo();
                            StringBuilder sbP = nf1.p(code, "code=", " message=", message, " responseInfo=");
                            sbP.append(responseInfo);
                            NativeInlineAdKt.c("load_failed", j11, str5, nativeInlineAdSlot3, logValue, null, sbP.toString(), 32);
                            MutableState mutableState13 = mutableState8;
                            LoadRequestMarker loadRequestMarker = (LoadRequestMarker) mutableState13.getValue();
                            if (loadRequestMarker != null && Intrinsics.d(loadRequestMarker.f795a, loadRequestKey5)) {
                                NativeAdLayoutCache.Key key = (NativeAdLayoutCache.Key) mutableState9.getValue();
                                if (key != null) {
                                    synchronized (NativeAdLayoutCache.f798a) {
                                        NativeAdLayoutCache.b.remove(key);
                                    }
                                }
                                mutableState7.setValue(null);
                                mutableState13.setValue(null);
                            }
                            Function2 function5 = function4;
                            if (function5 != null) {
                                function5.invoke(Integer.valueOf(adError.getCode()), new BindNativeAdResult.Failed.SDKLoadAdError(adError.getMessage()));
                            }
                        }

                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // com.google.android.gms.ads.AdListener
                        public final void onAdImpression() {
                            NativeInlineAdRenderState nativeInlineAdRenderState = (NativeInlineAdRenderState) mutableState7.getValue();
                            if (nativeInlineAdRenderState != null && nativeInlineAdRenderState.f817a == j10 && nativeInlineAdRenderState.b == NativeInlineAdLoadSource.Direct) {
                                NativeInlineAdKt$NativeInlineAd$4$1.l(str4, nativeInlineAdSlot2, nativeInlineAdAnalyticsHelper2, mutableState10, mutableState11, mutableState12, DevicePublicKeyStringDef.DIRECT, nativeInlineAdRenderState);
                            }
                        }

                        @Override // com.google.android.gms.ads.AdListener
                        public final void onAdLoaded() {
                            NativeInlineAdKt.c("sdk_adlistener_loaded", j10, str4, nativeInlineAdSlot2, NativeInlineAdLoadSource.Direct.getLogValue(), null, null, 224);
                        }
                    }).build().loadAd(adManagerAdRequestBuild);
                    return unit;
                }
                z3 = z;
                j8 = j5;
                longRef5 = longRef2;
                CoroutineScope coroutineScope9 = coroutineScope4;
                thA = Result.a(objA3);
                if (thA != null) {
                    if (!(thA instanceof CancellationException)) {
                        throw thA;
                    }
                    objA3 = obj2;
                }
                nativeAd = (NativeAd) objA3;
                if (nativeAd != null) {
                    str = str2;
                    NativeInlineAdKt.c("prefetch_await_then_consume", j8, this.$adUnitId, this.$slot, "hit", null, str + this.$normalizedTargeting.keySet(), 96);
                    n(j8, this.$adUnitId, this.$slot, this.$requestKey, this.$normalizedTargeting, this.$onAdFailedToLoad, this.$prefetchDependencies, longRef5, z3, this.$prefetchScheduleScope, this.$onAdLoaded, this.$requestMarker$delegate, this.$cacheKey$delegate, this.$renderState$delegate, this.$analyticsHelper, this.$mediaViewRef$delegate, this.$nativeAdViewRef$delegate, this.$mediaDebugInfo$delegate, nativeAd, false, true);
                    value = this.$requestMarker$delegate.getValue();
                    if (value != null) {
                        loadRequestKey2 = value.f795a;
                    } else {
                        loadRequestKey2 = null;
                    }
                    if (!Intrinsics.d(loadRequestKey2, this.$requestKey) && value.b == LoadStatus.LOADED) {
                        return unit;
                    }
                    this.$requestMarker$delegate.setValue(new LoadRequestMarker(this.$requestKey, LoadStatus.LOADING));
                } else {
                    str = str2;
                }
                coroutineScope2 = coroutineScope9;
                j5 = j8;
                longRef = longRef5;
                z2 = z3;
                jMax = Math.max(0L, j4 - (System.currentTimeMillis() - j3));
                if (jMax > 0) {
                    this.L$0 = coroutineScope2;
                    this.L$1 = adManagerAdRequestBuild;
                    this.L$2 = longRef;
                    this.J$0 = j5;
                    this.Z$0 = z2;
                    this.label = i;
                    if (DelayKt.b(jMax, this) != coroutineSingletons) {
                        longRef4 = longRef;
                        j7 = j5;
                    }
                    return coroutineSingletons;
                }
                longRef3 = longRef;
                j6 = j5;
                z4 = z2;
                if (z4 && (nativeAdA = this.$prefetchDependencies.a().a(this.$adUnitId, this.$normalizedTargeting)) != null) {
                    NativeInlineAdKt.c("prefetch_consume", j6, this.$adUnitId, this.$slot, "late_hit", null, str + this.$normalizedTargeting.keySet(), 96);
                    long j11 = j6;
                    n(j11, this.$adUnitId, this.$slot, this.$requestKey, this.$normalizedTargeting, this.$onAdFailedToLoad, this.$prefetchDependencies, longRef3, z4, this.$prefetchScheduleScope, this.$onAdLoaded, this.$requestMarker$delegate, this.$cacheKey$delegate, this.$renderState$delegate, this.$analyticsHelper, this.$mediaViewRef$delegate, this.$nativeAdViewRef$delegate, this.$mediaDebugInfo$delegate, nativeAdA, false, true);
                    j6 = j11;
                    value2 = this.$requestMarker$delegate.getValue();
                    if (value2 != null) {
                        loadRequestKey3 = value2.f795a;
                    } else {
                        loadRequestKey3 = null;
                    }
                    if (!Intrinsics.d(loadRequestKey3, this.$requestKey) && value2.b == LoadStatus.LOADED) {
                        return unit;
                    }
                    this.$requestMarker$delegate.setValue(new LoadRequestMarker(this.$requestKey, LoadStatus.LOADING));
                }
                NativeInlineAdKt.c("direct_load_start", j6, this.$adUnitId, this.$slot, null, null, str + this.$normalizedTargeting.keySet(), 112);
                AdLoader.Builder builderWithNativeAdOptions2 = new AdLoader.Builder(this.$context, this.$adUnitId).withNativeAdOptions(new NativeAdOptions.Builder().setVideoOptions(new VideoOptions.Builder().setStartMuted(true).build()).build());
                final String str5 = this.$adUnitId;
                final NativeInlineAdSlot nativeInlineAdSlot3 = this.$slot;
                final LoadRequestKey loadRequestKey6 = this.$requestKey;
                final Map map2 = this.$normalizedTargeting;
                final Function2 function5 = this.$onAdFailedToLoad;
                final NativeInlineAdPrefetchDependencies nativeInlineAdPrefetchDependencies2 = this.$prefetchDependencies;
                final CoroutineScope coroutineScope10 = this.$prefetchScheduleScope;
                final Function2 function6 = this.$onAdLoaded;
                final MutableState mutableState13 = this.$requestMarker$delegate;
                final MutableState mutableState14 = this.$cacheKey$delegate;
                final MutableState mutableState15 = this.$renderState$delegate;
                final NativeInlineAdAnalyticsHelper nativeInlineAdAnalyticsHelper3 = this.$analyticsHelper;
                final MutableState mutableState16 = this.$mediaViewRef$delegate;
                final MutableState mutableState17 = this.$nativeAdViewRef$delegate;
                final MutableState mutableState18 = this.$mediaDebugInfo$delegate;
                final CoroutineScope coroutineScope11 = coroutineScope2;
                final Ref.LongRef longRef7 = longRef3;
                final long j12 = j6;
                AdLoader.Builder builderForNativeAd2 = builderWithNativeAdOptions2.forNativeAd(new NativeAd.OnNativeAdLoadedListener() { // from class: app.chalo.ads.i
                    @Override // com.google.android.gms.ads.nativead.NativeAd.OnNativeAdLoadedListener
                    public final void onNativeAdLoaded(NativeAd nativeAd2) {
                        String logValue = NativeInlineAdLoadSource.Direct.getLogValue();
                        long j13 = j12;
                        String str6 = str5;
                        NativeInlineAdSlot nativeInlineAdSlot4 = nativeInlineAdSlot3;
                        NativeInlineAdKt.c("sdk_native_loaded", j13, str6, nativeInlineAdSlot4, logValue, nativeAd2, null, 192);
                        Intrinsics.f(nativeAd2);
                        NativeInlineAdKt$NativeInlineAd$4$1.n(j13, str6, nativeInlineAdSlot4, loadRequestKey6, map2, function5, nativeInlineAdPrefetchDependencies2, longRef7, z4, coroutineScope10, function6, mutableState13, mutableState14, mutableState15, nativeInlineAdAnalyticsHelper3, mutableState16, mutableState17, mutableState18, nativeAd2, true, false);
                    }
                });
                final String str6 = this.$adUnitId;
                final NativeInlineAdSlot nativeInlineAdSlot4 = this.$slot;
                final MutableState mutableState19 = this.$renderState$delegate;
                final NativeInlineAdAnalyticsHelper nativeInlineAdAnalyticsHelper4 = this.$analyticsHelper;
                final LoadRequestKey loadRequestKey7 = this.$requestKey;
                final Function2 function7 = this.$onAdFailedToLoad;
                final MutableState mutableState20 = this.$requestMarker$delegate;
                final MutableState mutableState21 = this.$cacheKey$delegate;
                final MutableState mutableState110 = this.$mediaViewRef$delegate;
                final MutableState mutableState111 = this.$nativeAdViewRef$delegate;
                final MutableState mutableState112 = this.$mediaDebugInfo$delegate;
                builderForNativeAd2.withAdListener(new AdListener() { // from class: app.chalo.ads.NativeInlineAdKt$NativeInlineAd$4$1.3
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // com.google.android.gms.ads.AdListener
                    public final void onAdClicked() {
                        NativeInlineAdRenderState nativeInlineAdRenderState = (NativeInlineAdRenderState) mutableState19.getValue();
                        if (nativeInlineAdRenderState != null && nativeInlineAdRenderState.f817a == j12 && nativeInlineAdRenderState.b == NativeInlineAdLoadSource.Direct) {
                            NativeInlineAdKt$NativeInlineAd$4$1.h(str6, nativeInlineAdSlot4, nativeInlineAdAnalyticsHelper4, DevicePublicKeyStringDef.DIRECT, nativeInlineAdRenderState);
                        }
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // com.google.android.gms.ads.AdListener
                    public final void onAdFailedToLoad(LoadAdError adError) {
                        Intrinsics.i(adError, "adError");
                        long j13 = j12;
                        String str7 = str6;
                        NativeInlineAdSlot nativeInlineAdSlot5 = nativeInlineAdSlot4;
                        String logValue = NativeInlineAdLoadSource.Direct.getLogValue();
                        int code = adError.getCode();
                        String message = adError.getMessage();
                        ResponseInfo responseInfo = adError.getResponseInfo();
                        StringBuilder sbP = nf1.p(code, "code=", " message=", message, " responseInfo=");
                        sbP.append(responseInfo);
                        NativeInlineAdKt.c("load_failed", j13, str7, nativeInlineAdSlot5, logValue, null, sbP.toString(), 32);
                        MutableState mutableState113 = mutableState20;
                        LoadRequestMarker loadRequestMarker = (LoadRequestMarker) mutableState113.getValue();
                        if (loadRequestMarker != null && Intrinsics.d(loadRequestMarker.f795a, loadRequestKey7)) {
                            NativeAdLayoutCache.Key key = (NativeAdLayoutCache.Key) mutableState21.getValue();
                            if (key != null) {
                                synchronized (NativeAdLayoutCache.f798a) {
                                    NativeAdLayoutCache.b.remove(key);
                                }
                            }
                            mutableState19.setValue(null);
                            mutableState113.setValue(null);
                        }
                        Function2 function8 = function7;
                        if (function8 != null) {
                            function8.invoke(Integer.valueOf(adError.getCode()), new BindNativeAdResult.Failed.SDKLoadAdError(adError.getMessage()));
                        }
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // com.google.android.gms.ads.AdListener
                    public final void onAdImpression() {
                        NativeInlineAdRenderState nativeInlineAdRenderState = (NativeInlineAdRenderState) mutableState19.getValue();
                        if (nativeInlineAdRenderState != null && nativeInlineAdRenderState.f817a == j12 && nativeInlineAdRenderState.b == NativeInlineAdLoadSource.Direct) {
                            NativeInlineAdKt$NativeInlineAd$4$1.l(str6, nativeInlineAdSlot4, nativeInlineAdAnalyticsHelper4, mutableState110, mutableState111, mutableState112, DevicePublicKeyStringDef.DIRECT, nativeInlineAdRenderState);
                        }
                    }

                    @Override // com.google.android.gms.ads.AdListener
                    public final void onAdLoaded() {
                        NativeInlineAdKt.c("sdk_adlistener_loaded", j12, str6, nativeInlineAdSlot4, NativeInlineAdLoadSource.Direct.getLogValue(), null, null, 224);
                    }
                }).build().loadAd(adManagerAdRequestBuild);
                return unit;
            }
            if (i2 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z2 = this.Z$0;
            j7 = this.J$0;
            longRef4 = (Ref.LongRef) this.L$2;
            adManagerAdRequestBuild = (AdManagerAdRequest) this.L$1;
            coroutineScope2 = (CoroutineScope) this.L$0;
            ResultKt.b(obj);
            str = "targetingKeys=";
            unit = unit2;
        }
        j6 = j7;
        longRef3 = longRef4;
        z4 = z2;
        if (z4) {
            NativeInlineAdKt.c("prefetch_consume", j6, this.$adUnitId, this.$slot, "late_hit", null, str + this.$normalizedTargeting.keySet(), 96);
            long j13 = j6;
            n(j13, this.$adUnitId, this.$slot, this.$requestKey, this.$normalizedTargeting, this.$onAdFailedToLoad, this.$prefetchDependencies, longRef3, z4, this.$prefetchScheduleScope, this.$onAdLoaded, this.$requestMarker$delegate, this.$cacheKey$delegate, this.$renderState$delegate, this.$analyticsHelper, this.$mediaViewRef$delegate, this.$nativeAdViewRef$delegate, this.$mediaDebugInfo$delegate, nativeAdA, false, true);
            j6 = j13;
            value2 = this.$requestMarker$delegate.getValue();
            if (value2 != null) {
                loadRequestKey3 = value2.f795a;
            } else {
                loadRequestKey3 = null;
            }
            if (!Intrinsics.d(loadRequestKey3, this.$requestKey)) {
            }
            this.$requestMarker$delegate.setValue(new LoadRequestMarker(this.$requestKey, LoadStatus.LOADING));
        }
        NativeInlineAdKt.c("direct_load_start", j6, this.$adUnitId, this.$slot, null, null, str + this.$normalizedTargeting.keySet(), 112);
        AdLoader.Builder builderWithNativeAdOptions3 = new AdLoader.Builder(this.$context, this.$adUnitId).withNativeAdOptions(new NativeAdOptions.Builder().setVideoOptions(new VideoOptions.Builder().setStartMuted(true).build()).build());
        final String str7 = this.$adUnitId;
        final NativeInlineAdSlot nativeInlineAdSlot5 = this.$slot;
        final LoadRequestKey loadRequestKey8 = this.$requestKey;
        final Map map3 = this.$normalizedTargeting;
        final Function2 function8 = this.$onAdFailedToLoad;
        final NativeInlineAdPrefetchDependencies nativeInlineAdPrefetchDependencies3 = this.$prefetchDependencies;
        final CoroutineScope coroutineScope12 = this.$prefetchScheduleScope;
        final Function2 function9 = this.$onAdLoaded;
        final MutableState mutableState113 = this.$requestMarker$delegate;
        final MutableState mutableState114 = this.$cacheKey$delegate;
        final MutableState mutableState115 = this.$renderState$delegate;
        final NativeInlineAdAnalyticsHelper nativeInlineAdAnalyticsHelper5 = this.$analyticsHelper;
        final MutableState mutableState116 = this.$mediaViewRef$delegate;
        final MutableState mutableState117 = this.$nativeAdViewRef$delegate;
        final MutableState mutableState118 = this.$mediaDebugInfo$delegate;
        final CoroutineScope coroutineScope13 = coroutineScope2;
        final Ref.LongRef longRef8 = longRef3;
        final long j14 = j6;
        AdLoader.Builder builderForNativeAd3 = builderWithNativeAdOptions3.forNativeAd(new NativeAd.OnNativeAdLoadedListener() { // from class: app.chalo.ads.i
            @Override // com.google.android.gms.ads.nativead.NativeAd.OnNativeAdLoadedListener
            public final void onNativeAdLoaded(NativeAd nativeAd2) {
                String logValue = NativeInlineAdLoadSource.Direct.getLogValue();
                long j15 = j14;
                String str8 = str7;
                NativeInlineAdSlot nativeInlineAdSlot6 = nativeInlineAdSlot5;
                NativeInlineAdKt.c("sdk_native_loaded", j15, str8, nativeInlineAdSlot6, logValue, nativeAd2, null, 192);
                Intrinsics.f(nativeAd2);
                NativeInlineAdKt$NativeInlineAd$4$1.n(j15, str8, nativeInlineAdSlot6, loadRequestKey8, map3, function8, nativeInlineAdPrefetchDependencies3, longRef8, z4, coroutineScope12, function9, mutableState113, mutableState114, mutableState115, nativeInlineAdAnalyticsHelper5, mutableState116, mutableState117, mutableState118, nativeAd2, true, false);
            }
        });
        final String str8 = this.$adUnitId;
        final NativeInlineAdSlot nativeInlineAdSlot6 = this.$slot;
        final MutableState mutableState119 = this.$renderState$delegate;
        final NativeInlineAdAnalyticsHelper nativeInlineAdAnalyticsHelper6 = this.$analyticsHelper;
        final LoadRequestKey loadRequestKey9 = this.$requestKey;
        final Function2 function10 = this.$onAdFailedToLoad;
        final MutableState mutableState22 = this.$requestMarker$delegate;
        final MutableState mutableState23 = this.$cacheKey$delegate;
        final MutableState mutableState1110 = this.$mediaViewRef$delegate;
        final MutableState mutableState1111 = this.$nativeAdViewRef$delegate;
        final MutableState mutableState1112 = this.$mediaDebugInfo$delegate;
        builderForNativeAd3.withAdListener(new AdListener() { // from class: app.chalo.ads.NativeInlineAdKt$NativeInlineAd$4$1.3
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.ads.AdListener
            public final void onAdClicked() {
                NativeInlineAdRenderState nativeInlineAdRenderState = (NativeInlineAdRenderState) mutableState119.getValue();
                if (nativeInlineAdRenderState != null && nativeInlineAdRenderState.f817a == j14 && nativeInlineAdRenderState.b == NativeInlineAdLoadSource.Direct) {
                    NativeInlineAdKt$NativeInlineAd$4$1.h(str8, nativeInlineAdSlot6, nativeInlineAdAnalyticsHelper6, DevicePublicKeyStringDef.DIRECT, nativeInlineAdRenderState);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.ads.AdListener
            public final void onAdFailedToLoad(LoadAdError adError) {
                Intrinsics.i(adError, "adError");
                long j15 = j14;
                String str9 = str8;
                NativeInlineAdSlot nativeInlineAdSlot7 = nativeInlineAdSlot6;
                String logValue = NativeInlineAdLoadSource.Direct.getLogValue();
                int code = adError.getCode();
                String message = adError.getMessage();
                ResponseInfo responseInfo = adError.getResponseInfo();
                StringBuilder sbP = nf1.p(code, "code=", " message=", message, " responseInfo=");
                sbP.append(responseInfo);
                NativeInlineAdKt.c("load_failed", j15, str9, nativeInlineAdSlot7, logValue, null, sbP.toString(), 32);
                MutableState mutableState1113 = mutableState22;
                LoadRequestMarker loadRequestMarker = (LoadRequestMarker) mutableState1113.getValue();
                if (loadRequestMarker != null && Intrinsics.d(loadRequestMarker.f795a, loadRequestKey9)) {
                    NativeAdLayoutCache.Key key = (NativeAdLayoutCache.Key) mutableState23.getValue();
                    if (key != null) {
                        synchronized (NativeAdLayoutCache.f798a) {
                            NativeAdLayoutCache.b.remove(key);
                        }
                    }
                    mutableState119.setValue(null);
                    mutableState1113.setValue(null);
                }
                Function2 function11 = function10;
                if (function11 != null) {
                    function11.invoke(Integer.valueOf(adError.getCode()), new BindNativeAdResult.Failed.SDKLoadAdError(adError.getMessage()));
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.ads.AdListener
            public final void onAdImpression() {
                NativeInlineAdRenderState nativeInlineAdRenderState = (NativeInlineAdRenderState) mutableState119.getValue();
                if (nativeInlineAdRenderState != null && nativeInlineAdRenderState.f817a == j14 && nativeInlineAdRenderState.b == NativeInlineAdLoadSource.Direct) {
                    NativeInlineAdKt$NativeInlineAd$4$1.l(str8, nativeInlineAdSlot6, nativeInlineAdAnalyticsHelper6, mutableState1110, mutableState1111, mutableState1112, DevicePublicKeyStringDef.DIRECT, nativeInlineAdRenderState);
                }
            }

            @Override // com.google.android.gms.ads.AdListener
            public final void onAdLoaded() {
                NativeInlineAdKt.c("sdk_adlistener_loaded", j14, str8, nativeInlineAdSlot6, NativeInlineAdLoadSource.Direct.getLogValue(), null, null, 224);
            }
        }).build().loadAd(adManagerAdRequestBuild);
        return unit;
        objA2 = Boolean.valueOf(((MiscellaneousCityWiseConfigForCity) objA).d);
        long j15 = j2;
        j3 = jCurrentTimeMillis;
        CoroutineScope coroutineScope14 = coroutineScope;
        Throwable thA2 = Result.a(objA2);
        if (thA2 != null) {
            if (thA2 instanceof CancellationException) {
                throw thA2;
            }
            objA2 = Boolean.FALSE;
        }
        boolean zBooleanValue = ((Boolean) objA2).booleanValue();
        if (!JobKt.h(getB())) {
            return unit2;
        }
        LoadRequestMarker value3 = this.$requestMarker$delegate.getValue();
        j4 = j;
        this.$renderState$delegate.setValue(null);
        this.$mediaDebugInfo$delegate.setValue(null);
        this.$nativeAdViewRef$delegate.setValue(null);
        this.$mediaViewRef$delegate.setValue(null);
        this.$lastReadySize$delegate.setValue(null);
        NativeAdLayoutCache.Key value4 = this.$cacheKey$delegate.getValue();
        i = 3;
        if ((value3 != null ? value3.b : null) == LoadStatus.LOADED && !Intrinsics.d(value3.f795a, this.$requestKey) && value4 != null) {
            synchronized (NativeAdLayoutCache.f798a) {
                NativeAdLayoutCache.b.remove(value4);
            }
        }
        this.$cacheKey$delegate.setValue(null);
        AdManagerAdRequest.Builder builder = new AdManagerAdRequest.Builder();
        for (Map.Entry<String, String> entry : this.$normalizedTargeting.entrySet()) {
            builder.addCustomTargeting(entry.getKey(), entry.getValue());
        }
        adManagerAdRequestBuild = builder.build();
        Intrinsics.h(adManagerAdRequestBuild, "build(...)");
        Ref.LongRef longRef9 = new Ref.LongRef();
        longRef9.element = System.currentTimeMillis();
        MutableState<LoadRequestMarker> mutableState24 = this.$requestMarker$delegate;
        LoadRequestKey loadRequestKey10 = this.$requestKey;
        LoadStatus loadStatus = LoadStatus.LOADING;
        mutableState24.setValue(new LoadRequestMarker(loadRequestKey10, loadStatus));
        NativeInlineAdKt.c("requested", j15, this.$adUnitId, this.$slot, null, null, "prefetchEnabled=" + zBooleanValue + " targetingKeys=" + this.$normalizedTargeting.keySet(), 112);
        NativeInlineAdAnalyticsHelper nativeInlineAdAnalyticsHelper7 = this.$analyticsHelper;
        String adUnitId = this.$adUnitId;
        NativeInlineAdSlot slot = this.$slot;
        nativeInlineAdAnalyticsHelper7.getClass();
        Intrinsics.i(adUnitId, "adUnitId");
        Intrinsics.i(slot, "slot");
        unit = unit2;
        LinkedHashMap linkedHashMapK = MapsKt.k(new Pair("adUnitId", adUnitId), new Pair("placement", LogConstants.DEFAULT_CHANNEL), new Pair(PaymentConstants.Event.SCREEN, NativeInlineAdSlotKt.a(slot)), new Pair("adSdk", "gam"), new Pair("adType", "native"));
        AnalyticsContract analyticsContract = (AnalyticsContract) nativeInlineAdAnalyticsHelper7.f804a.getValue();
        int i3 = NativeInlineAdKt.WhenMappings.b[slot.ordinal()];
        if (i3 == 1) {
            source = Source.ROUTE_DETAILS;
        } else {
            if (i3 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            source = Source.CHECKOUT_PAYMENT_ACTIVITY;
        }
        AnalyticsContractImplKt.b(analyticsContract, "ad requested", source, linkedHashMapK, false, 8);
        if (zBooleanValue) {
            NativeAd nativeAdA2 = this.$prefetchDependencies.a().a(this.$adUnitId, this.$normalizedTargeting);
            if (nativeAdA2 != null) {
                NativeInlineAdKt.c("prefetch_consume", j15, this.$adUnitId, this.$slot, "hit", null, "targetingKeys=" + this.$normalizedTargeting.keySet(), 96);
                n(j15, this.$adUnitId, this.$slot, this.$requestKey, this.$normalizedTargeting, this.$onAdFailedToLoad, this.$prefetchDependencies, longRef9, zBooleanValue, this.$prefetchScheduleScope, this.$onAdLoaded, this.$requestMarker$delegate, this.$cacheKey$delegate, this.$renderState$delegate, this.$analyticsHelper, this.$mediaViewRef$delegate, this.$nativeAdViewRef$delegate, this.$mediaDebugInfo$delegate, nativeAdA2, false, true);
                longRef = longRef9;
                z = zBooleanValue;
                LoadRequestMarker value5 = this.$requestMarker$delegate.getValue();
                if (value5 != null) {
                    j15 = j15;
                    loadRequestKey = value5.f795a;
                } else {
                    j15 = j15;
                    loadRequestKey = null;
                }
                if (Intrinsics.d(loadRequestKey, this.$requestKey) && value5.b == LoadStatus.LOADED) {
                    return unit;
                }
                this.$requestMarker$delegate.setValue(new LoadRequestMarker(this.$requestKey, loadStatus));
            } else {
                longRef = longRef9;
                z = zBooleanValue;
                NativeInlineAdKt.c("prefetch_consume", j15, this.$adUnitId, this.$slot, "miss", null, "targetingKeys=" + this.$normalizedTargeting.keySet(), 96);
            }
        } else {
            longRef = longRef9;
            z = zBooleanValue;
        }
        j5 = j15;
        if (!z) {
            str = "targetingKeys=";
            z2 = z;
            coroutineScope2 = coroutineScope14;
            jMax = Math.max(0L, j4 - (System.currentTimeMillis() - j3));
            if (jMax > 0) {
                this.L$0 = coroutineScope2;
                this.L$1 = adManagerAdRequestBuild;
                this.L$2 = longRef;
                this.J$0 = j5;
                this.Z$0 = z2;
                this.label = i;
                if (DelayKt.b(jMax, this) != coroutineSingletons) {
                    longRef4 = longRef;
                    j7 = j5;
                    j6 = j7;
                    longRef3 = longRef4;
                }
            } else {
                longRef3 = longRef;
                j6 = j5;
            }
            z4 = z2;
            if (z4) {
                NativeInlineAdKt.c("prefetch_consume", j6, this.$adUnitId, this.$slot, "late_hit", null, str + this.$normalizedTargeting.keySet(), 96);
                long j16 = j6;
                n(j16, this.$adUnitId, this.$slot, this.$requestKey, this.$normalizedTargeting, this.$onAdFailedToLoad, this.$prefetchDependencies, longRef3, z4, this.$prefetchScheduleScope, this.$onAdLoaded, this.$requestMarker$delegate, this.$cacheKey$delegate, this.$renderState$delegate, this.$analyticsHelper, this.$mediaViewRef$delegate, this.$nativeAdViewRef$delegate, this.$mediaDebugInfo$delegate, nativeAdA, false, true);
                j6 = j16;
                value2 = this.$requestMarker$delegate.getValue();
                if (value2 != null) {
                    loadRequestKey3 = value2.f795a;
                } else {
                    loadRequestKey3 = null;
                }
                if (!Intrinsics.d(loadRequestKey3, this.$requestKey)) {
                }
                this.$requestMarker$delegate.setValue(new LoadRequestMarker(this.$requestKey, LoadStatus.LOADING));
            }
            NativeInlineAdKt.c("direct_load_start", j6, this.$adUnitId, this.$slot, null, null, str + this.$normalizedTargeting.keySet(), 112);
            AdLoader.Builder builderWithNativeAdOptions4 = new AdLoader.Builder(this.$context, this.$adUnitId).withNativeAdOptions(new NativeAdOptions.Builder().setVideoOptions(new VideoOptions.Builder().setStartMuted(true).build()).build());
            final String str9 = this.$adUnitId;
            final NativeInlineAdSlot nativeInlineAdSlot7 = this.$slot;
            final LoadRequestKey loadRequestKey11 = this.$requestKey;
            final Map map4 = this.$normalizedTargeting;
            final Function2 function11 = this.$onAdFailedToLoad;
            final NativeInlineAdPrefetchDependencies nativeInlineAdPrefetchDependencies4 = this.$prefetchDependencies;
            final CoroutineScope coroutineScope15 = this.$prefetchScheduleScope;
            final Function2 function12 = this.$onAdLoaded;
            final MutableState mutableState1113 = this.$requestMarker$delegate;
            final MutableState mutableState1114 = this.$cacheKey$delegate;
            final MutableState mutableState1115 = this.$renderState$delegate;
            final NativeInlineAdAnalyticsHelper nativeInlineAdAnalyticsHelper8 = this.$analyticsHelper;
            final MutableState mutableState1116 = this.$mediaViewRef$delegate;
            final MutableState mutableState1117 = this.$nativeAdViewRef$delegate;
            final MutableState mutableState1118 = this.$mediaDebugInfo$delegate;
            final CoroutineScope coroutineScope16 = coroutineScope2;
            final Ref.LongRef longRef10 = longRef3;
            final long j17 = j6;
            AdLoader.Builder builderForNativeAd4 = builderWithNativeAdOptions4.forNativeAd(new NativeAd.OnNativeAdLoadedListener() { // from class: app.chalo.ads.i
                @Override // com.google.android.gms.ads.nativead.NativeAd.OnNativeAdLoadedListener
                public final void onNativeAdLoaded(NativeAd nativeAd2) {
                    String logValue = NativeInlineAdLoadSource.Direct.getLogValue();
                    long j18 = j17;
                    String str10 = str9;
                    NativeInlineAdSlot nativeInlineAdSlot8 = nativeInlineAdSlot7;
                    NativeInlineAdKt.c("sdk_native_loaded", j18, str10, nativeInlineAdSlot8, logValue, nativeAd2, null, 192);
                    Intrinsics.f(nativeAd2);
                    NativeInlineAdKt$NativeInlineAd$4$1.n(j18, str10, nativeInlineAdSlot8, loadRequestKey11, map4, function11, nativeInlineAdPrefetchDependencies4, longRef10, z4, coroutineScope15, function12, mutableState1113, mutableState1114, mutableState1115, nativeInlineAdAnalyticsHelper8, mutableState1116, mutableState1117, mutableState1118, nativeAd2, true, false);
                }
            });
            final String str10 = this.$adUnitId;
            final NativeInlineAdSlot nativeInlineAdSlot8 = this.$slot;
            final MutableState mutableState1119 = this.$renderState$delegate;
            final NativeInlineAdAnalyticsHelper nativeInlineAdAnalyticsHelper9 = this.$analyticsHelper;
            final LoadRequestKey loadRequestKey12 = this.$requestKey;
            final Function2 function13 = this.$onAdFailedToLoad;
            final MutableState mutableState25 = this.$requestMarker$delegate;
            final MutableState mutableState26 = this.$cacheKey$delegate;
            final MutableState mutableState11110 = this.$mediaViewRef$delegate;
            final MutableState mutableState11111 = this.$nativeAdViewRef$delegate;
            final MutableState mutableState11112 = this.$mediaDebugInfo$delegate;
            builderForNativeAd4.withAdListener(new AdListener() { // from class: app.chalo.ads.NativeInlineAdKt$NativeInlineAd$4$1.3
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.google.android.gms.ads.AdListener
                public final void onAdClicked() {
                    NativeInlineAdRenderState nativeInlineAdRenderState = (NativeInlineAdRenderState) mutableState1119.getValue();
                    if (nativeInlineAdRenderState != null && nativeInlineAdRenderState.f817a == j17 && nativeInlineAdRenderState.b == NativeInlineAdLoadSource.Direct) {
                        NativeInlineAdKt$NativeInlineAd$4$1.h(str10, nativeInlineAdSlot8, nativeInlineAdAnalyticsHelper9, DevicePublicKeyStringDef.DIRECT, nativeInlineAdRenderState);
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.google.android.gms.ads.AdListener
                public final void onAdFailedToLoad(LoadAdError adError) {
                    Intrinsics.i(adError, "adError");
                    long j18 = j17;
                    String str11 = str10;
                    NativeInlineAdSlot nativeInlineAdSlot9 = nativeInlineAdSlot8;
                    String logValue = NativeInlineAdLoadSource.Direct.getLogValue();
                    int code = adError.getCode();
                    String message = adError.getMessage();
                    ResponseInfo responseInfo = adError.getResponseInfo();
                    StringBuilder sbP = nf1.p(code, "code=", " message=", message, " responseInfo=");
                    sbP.append(responseInfo);
                    NativeInlineAdKt.c("load_failed", j18, str11, nativeInlineAdSlot9, logValue, null, sbP.toString(), 32);
                    MutableState mutableState11113 = mutableState25;
                    LoadRequestMarker loadRequestMarker = (LoadRequestMarker) mutableState11113.getValue();
                    if (loadRequestMarker != null && Intrinsics.d(loadRequestMarker.f795a, loadRequestKey12)) {
                        NativeAdLayoutCache.Key key = (NativeAdLayoutCache.Key) mutableState26.getValue();
                        if (key != null) {
                            synchronized (NativeAdLayoutCache.f798a) {
                                NativeAdLayoutCache.b.remove(key);
                            }
                        }
                        mutableState1119.setValue(null);
                        mutableState11113.setValue(null);
                    }
                    Function2 function14 = function13;
                    if (function14 != null) {
                        function14.invoke(Integer.valueOf(adError.getCode()), new BindNativeAdResult.Failed.SDKLoadAdError(adError.getMessage()));
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.google.android.gms.ads.AdListener
                public final void onAdImpression() {
                    NativeInlineAdRenderState nativeInlineAdRenderState = (NativeInlineAdRenderState) mutableState1119.getValue();
                    if (nativeInlineAdRenderState != null && nativeInlineAdRenderState.f817a == j17 && nativeInlineAdRenderState.b == NativeInlineAdLoadSource.Direct) {
                        NativeInlineAdKt$NativeInlineAd$4$1.l(str10, nativeInlineAdSlot8, nativeInlineAdAnalyticsHelper9, mutableState11110, mutableState11111, mutableState11112, DevicePublicKeyStringDef.DIRECT, nativeInlineAdRenderState);
                    }
                }

                @Override // com.google.android.gms.ads.AdListener
                public final void onAdLoaded() {
                    NativeInlineAdKt.c("sdk_adlistener_loaded", j17, str10, nativeInlineAdSlot8, NativeInlineAdLoadSource.Direct.getLogValue(), null, null, 224);
                }
            }).build().loadAd(adManagerAdRequestBuild);
            return unit;
        }
        long jMax2 = Math.max(0L, j4 - (System.currentTimeMillis() - j3));
        try {
            str2 = "targetingKeys=";
            obj2 = null;
            try {
                NativeInlineAdKt$NativeInlineAd$4$1$awaited$1$1 nativeInlineAdKt$NativeInlineAd$4$1$awaited$1$1 = new NativeInlineAdKt$NativeInlineAd$4$1$awaited$1$1(this.$prefetchDependencies, this.$adUnitId, this.$normalizedTargeting, null);
                coroutineScope3 = coroutineScope14;
                try {
                    this.L$0 = coroutineScope3;
                    this.L$1 = adManagerAdRequestBuild;
                    this.L$2 = longRef;
                    this.J$0 = j3;
                    this.J$1 = j5;
                    this.Z$0 = z;
                    this.label = 2;
                    objC = TimeoutKt.c(jMax2, nativeInlineAdKt$NativeInlineAd$4$1$awaited$1$1, this);
                    if (objC != coroutineSingletons) {
                        longRef2 = longRef;
                        coroutineScope4 = coroutineScope3;
                        objA3 = (NativeAd) objC;
                        z3 = z;
                        j8 = j5;
                        longRef5 = longRef2;
                        CoroutineScope coroutineScope17 = coroutineScope4;
                        thA = Result.a(objA3);
                        if (thA != null) {
                            if (!(thA instanceof CancellationException)) {
                                throw thA;
                            }
                            objA3 = obj2;
                        }
                        nativeAd = (NativeAd) objA3;
                        if (nativeAd != null) {
                            str = str2;
                            NativeInlineAdKt.c("prefetch_await_then_consume", j8, this.$adUnitId, this.$slot, "hit", null, str + this.$normalizedTargeting.keySet(), 96);
                            n(j8, this.$adUnitId, this.$slot, this.$requestKey, this.$normalizedTargeting, this.$onAdFailedToLoad, this.$prefetchDependencies, longRef5, z3, this.$prefetchScheduleScope, this.$onAdLoaded, this.$requestMarker$delegate, this.$cacheKey$delegate, this.$renderState$delegate, this.$analyticsHelper, this.$mediaViewRef$delegate, this.$nativeAdViewRef$delegate, this.$mediaDebugInfo$delegate, nativeAd, false, true);
                            value = this.$requestMarker$delegate.getValue();
                            if (value != null) {
                                loadRequestKey2 = value.f795a;
                            } else {
                                loadRequestKey2 = null;
                            }
                            if (!Intrinsics.d(loadRequestKey2, this.$requestKey)) {
                            }
                            this.$requestMarker$delegate.setValue(new LoadRequestMarker(this.$requestKey, LoadStatus.LOADING));
                        } else {
                            str = str2;
                        }
                        coroutineScope2 = coroutineScope17;
                        j5 = j8;
                        longRef = longRef5;
                        z2 = z3;
                        jMax = Math.max(0L, j4 - (System.currentTimeMillis() - j3));
                        if (jMax > 0) {
                            this.L$0 = coroutineScope2;
                            this.L$1 = adManagerAdRequestBuild;
                            this.L$2 = longRef;
                            this.J$0 = j5;
                            this.Z$0 = z2;
                            this.label = i;
                            if (DelayKt.b(jMax, this) != coroutineSingletons) {
                                longRef4 = longRef;
                                j7 = j5;
                                j6 = j7;
                                longRef3 = longRef4;
                            }
                        } else {
                            longRef3 = longRef;
                            j6 = j5;
                        }
                        z4 = z2;
                        if (z4) {
                            NativeInlineAdKt.c("prefetch_consume", j6, this.$adUnitId, this.$slot, "late_hit", null, str + this.$normalizedTargeting.keySet(), 96);
                            long j18 = j6;
                            n(j18, this.$adUnitId, this.$slot, this.$requestKey, this.$normalizedTargeting, this.$onAdFailedToLoad, this.$prefetchDependencies, longRef3, z4, this.$prefetchScheduleScope, this.$onAdLoaded, this.$requestMarker$delegate, this.$cacheKey$delegate, this.$renderState$delegate, this.$analyticsHelper, this.$mediaViewRef$delegate, this.$nativeAdViewRef$delegate, this.$mediaDebugInfo$delegate, nativeAdA, false, true);
                            j6 = j18;
                            value2 = this.$requestMarker$delegate.getValue();
                            if (value2 != null) {
                                loadRequestKey3 = value2.f795a;
                            } else {
                                loadRequestKey3 = null;
                            }
                            if (!Intrinsics.d(loadRequestKey3, this.$requestKey)) {
                            }
                            this.$requestMarker$delegate.setValue(new LoadRequestMarker(this.$requestKey, LoadStatus.LOADING));
                        }
                        NativeInlineAdKt.c("direct_load_start", j6, this.$adUnitId, this.$slot, null, null, str + this.$normalizedTargeting.keySet(), 112);
                        AdLoader.Builder builderWithNativeAdOptions5 = new AdLoader.Builder(this.$context, this.$adUnitId).withNativeAdOptions(new NativeAdOptions.Builder().setVideoOptions(new VideoOptions.Builder().setStartMuted(true).build()).build());
                        final String str11 = this.$adUnitId;
                        final NativeInlineAdSlot nativeInlineAdSlot9 = this.$slot;
                        final LoadRequestKey loadRequestKey13 = this.$requestKey;
                        final Map map5 = this.$normalizedTargeting;
                        final Function2 function14 = this.$onAdFailedToLoad;
                        final NativeInlineAdPrefetchDependencies nativeInlineAdPrefetchDependencies5 = this.$prefetchDependencies;
                        final CoroutineScope coroutineScope18 = this.$prefetchScheduleScope;
                        final Function2 function15 = this.$onAdLoaded;
                        final MutableState mutableState11113 = this.$requestMarker$delegate;
                        final MutableState mutableState11114 = this.$cacheKey$delegate;
                        final MutableState mutableState11115 = this.$renderState$delegate;
                        final NativeInlineAdAnalyticsHelper nativeInlineAdAnalyticsHelper10 = this.$analyticsHelper;
                        final MutableState mutableState11116 = this.$mediaViewRef$delegate;
                        final MutableState mutableState11117 = this.$nativeAdViewRef$delegate;
                        final MutableState mutableState11118 = this.$mediaDebugInfo$delegate;
                        final CoroutineScope coroutineScope19 = coroutineScope2;
                        final Ref.LongRef longRef11 = longRef3;
                        final long j19 = j6;
                        AdLoader.Builder builderForNativeAd5 = builderWithNativeAdOptions5.forNativeAd(new NativeAd.OnNativeAdLoadedListener() { // from class: app.chalo.ads.i
                            @Override // com.google.android.gms.ads.nativead.NativeAd.OnNativeAdLoadedListener
                            public final void onNativeAdLoaded(NativeAd nativeAd2) {
                                String logValue = NativeInlineAdLoadSource.Direct.getLogValue();
                                long j110 = j19;
                                String str12 = str11;
                                NativeInlineAdSlot nativeInlineAdSlot10 = nativeInlineAdSlot9;
                                NativeInlineAdKt.c("sdk_native_loaded", j110, str12, nativeInlineAdSlot10, logValue, nativeAd2, null, 192);
                                Intrinsics.f(nativeAd2);
                                NativeInlineAdKt$NativeInlineAd$4$1.n(j110, str12, nativeInlineAdSlot10, loadRequestKey13, map5, function14, nativeInlineAdPrefetchDependencies5, longRef11, z4, coroutineScope18, function15, mutableState11113, mutableState11114, mutableState11115, nativeInlineAdAnalyticsHelper10, mutableState11116, mutableState11117, mutableState11118, nativeAd2, true, false);
                            }
                        });
                        final String str12 = this.$adUnitId;
                        final NativeInlineAdSlot nativeInlineAdSlot10 = this.$slot;
                        final MutableState mutableState11119 = this.$renderState$delegate;
                        final NativeInlineAdAnalyticsHelper nativeInlineAdAnalyticsHelper11 = this.$analyticsHelper;
                        final LoadRequestKey loadRequestKey14 = this.$requestKey;
                        final Function2 function16 = this.$onAdFailedToLoad;
                        final MutableState mutableState27 = this.$requestMarker$delegate;
                        final MutableState mutableState28 = this.$cacheKey$delegate;
                        final MutableState mutableState111110 = this.$mediaViewRef$delegate;
                        final MutableState mutableState111111 = this.$nativeAdViewRef$delegate;
                        final MutableState mutableState111112 = this.$mediaDebugInfo$delegate;
                        builderForNativeAd5.withAdListener(new AdListener() { // from class: app.chalo.ads.NativeInlineAdKt$NativeInlineAd$4$1.3
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // com.google.android.gms.ads.AdListener
                            public final void onAdClicked() {
                                NativeInlineAdRenderState nativeInlineAdRenderState = (NativeInlineAdRenderState) mutableState11119.getValue();
                                if (nativeInlineAdRenderState != null && nativeInlineAdRenderState.f817a == j19 && nativeInlineAdRenderState.b == NativeInlineAdLoadSource.Direct) {
                                    NativeInlineAdKt$NativeInlineAd$4$1.h(str12, nativeInlineAdSlot10, nativeInlineAdAnalyticsHelper11, DevicePublicKeyStringDef.DIRECT, nativeInlineAdRenderState);
                                }
                            }

                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // com.google.android.gms.ads.AdListener
                            public final void onAdFailedToLoad(LoadAdError adError) {
                                Intrinsics.i(adError, "adError");
                                long j110 = j19;
                                String str13 = str12;
                                NativeInlineAdSlot nativeInlineAdSlot11 = nativeInlineAdSlot10;
                                String logValue = NativeInlineAdLoadSource.Direct.getLogValue();
                                int code = adError.getCode();
                                String message = adError.getMessage();
                                ResponseInfo responseInfo = adError.getResponseInfo();
                                StringBuilder sbP = nf1.p(code, "code=", " message=", message, " responseInfo=");
                                sbP.append(responseInfo);
                                NativeInlineAdKt.c("load_failed", j110, str13, nativeInlineAdSlot11, logValue, null, sbP.toString(), 32);
                                MutableState mutableState111113 = mutableState27;
                                LoadRequestMarker loadRequestMarker = (LoadRequestMarker) mutableState111113.getValue();
                                if (loadRequestMarker != null && Intrinsics.d(loadRequestMarker.f795a, loadRequestKey14)) {
                                    NativeAdLayoutCache.Key key = (NativeAdLayoutCache.Key) mutableState28.getValue();
                                    if (key != null) {
                                        synchronized (NativeAdLayoutCache.f798a) {
                                            NativeAdLayoutCache.b.remove(key);
                                        }
                                    }
                                    mutableState11119.setValue(null);
                                    mutableState111113.setValue(null);
                                }
                                Function2 function17 = function16;
                                if (function17 != null) {
                                    function17.invoke(Integer.valueOf(adError.getCode()), new BindNativeAdResult.Failed.SDKLoadAdError(adError.getMessage()));
                                }
                            }

                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // com.google.android.gms.ads.AdListener
                            public final void onAdImpression() {
                                NativeInlineAdRenderState nativeInlineAdRenderState = (NativeInlineAdRenderState) mutableState11119.getValue();
                                if (nativeInlineAdRenderState != null && nativeInlineAdRenderState.f817a == j19 && nativeInlineAdRenderState.b == NativeInlineAdLoadSource.Direct) {
                                    NativeInlineAdKt$NativeInlineAd$4$1.l(str12, nativeInlineAdSlot10, nativeInlineAdAnalyticsHelper11, mutableState111110, mutableState111111, mutableState111112, DevicePublicKeyStringDef.DIRECT, nativeInlineAdRenderState);
                                }
                            }

                            @Override // com.google.android.gms.ads.AdListener
                            public final void onAdLoaded() {
                                NativeInlineAdKt.c("sdk_adlistener_loaded", j19, str12, nativeInlineAdSlot10, NativeInlineAdLoadSource.Direct.getLogValue(), null, null, 224);
                            }
                        }).build().loadAd(adManagerAdRequestBuild);
                        return unit;
                    }
                } catch (Throwable th5) {
                    th = th5;
                    longRef2 = longRef;
                    coroutineScope4 = coroutineScope3;
                    objA3 = ResultKt.a(th);
                    z3 = z;
                    j8 = j5;
                    longRef5 = longRef2;
                    CoroutineScope coroutineScope110 = coroutineScope4;
                    thA = Result.a(objA3);
                    if (thA != null) {
                        if (!(thA instanceof CancellationException)) {
                            throw thA;
                        }
                        objA3 = obj2;
                    }
                    nativeAd = (NativeAd) objA3;
                    if (nativeAd != null) {
                        str = str2;
                        NativeInlineAdKt.c("prefetch_await_then_consume", j8, this.$adUnitId, this.$slot, "hit", null, str + this.$normalizedTargeting.keySet(), 96);
                        n(j8, this.$adUnitId, this.$slot, this.$requestKey, this.$normalizedTargeting, this.$onAdFailedToLoad, this.$prefetchDependencies, longRef5, z3, this.$prefetchScheduleScope, this.$onAdLoaded, this.$requestMarker$delegate, this.$cacheKey$delegate, this.$renderState$delegate, this.$analyticsHelper, this.$mediaViewRef$delegate, this.$nativeAdViewRef$delegate, this.$mediaDebugInfo$delegate, nativeAd, false, true);
                        value = this.$requestMarker$delegate.getValue();
                        if (value != null) {
                            loadRequestKey2 = value.f795a;
                        } else {
                            loadRequestKey2 = null;
                        }
                        if (!Intrinsics.d(loadRequestKey2, this.$requestKey)) {
                        }
                        this.$requestMarker$delegate.setValue(new LoadRequestMarker(this.$requestKey, LoadStatus.LOADING));
                    } else {
                        str = str2;
                    }
                    coroutineScope2 = coroutineScope110;
                    j5 = j8;
                    longRef = longRef5;
                    z2 = z3;
                    jMax = Math.max(0L, j4 - (System.currentTimeMillis() - j3));
                    if (jMax > 0) {
                        this.L$0 = coroutineScope2;
                        this.L$1 = adManagerAdRequestBuild;
                        this.L$2 = longRef;
                        this.J$0 = j5;
                        this.Z$0 = z2;
                        this.label = i;
                        if (DelayKt.b(jMax, this) != coroutineSingletons) {
                            longRef4 = longRef;
                            j7 = j5;
                            j6 = j7;
                            longRef3 = longRef4;
                        }
                        return coroutineSingletons;
                    }
                    longRef3 = longRef;
                    j6 = j5;
                    z4 = z2;
                    if (z4) {
                        NativeInlineAdKt.c("prefetch_consume", j6, this.$adUnitId, this.$slot, "late_hit", null, str + this.$normalizedTargeting.keySet(), 96);
                        long j110 = j6;
                        n(j110, this.$adUnitId, this.$slot, this.$requestKey, this.$normalizedTargeting, this.$onAdFailedToLoad, this.$prefetchDependencies, longRef3, z4, this.$prefetchScheduleScope, this.$onAdLoaded, this.$requestMarker$delegate, this.$cacheKey$delegate, this.$renderState$delegate, this.$analyticsHelper, this.$mediaViewRef$delegate, this.$nativeAdViewRef$delegate, this.$mediaDebugInfo$delegate, nativeAdA, false, true);
                        j6 = j110;
                        value2 = this.$requestMarker$delegate.getValue();
                        if (value2 != null) {
                            loadRequestKey3 = value2.f795a;
                        } else {
                            loadRequestKey3 = null;
                        }
                        if (!Intrinsics.d(loadRequestKey3, this.$requestKey)) {
                        }
                        this.$requestMarker$delegate.setValue(new LoadRequestMarker(this.$requestKey, LoadStatus.LOADING));
                    }
                    NativeInlineAdKt.c("direct_load_start", j6, this.$adUnitId, this.$slot, null, null, str + this.$normalizedTargeting.keySet(), 112);
                    AdLoader.Builder builderWithNativeAdOptions6 = new AdLoader.Builder(this.$context, this.$adUnitId).withNativeAdOptions(new NativeAdOptions.Builder().setVideoOptions(new VideoOptions.Builder().setStartMuted(true).build()).build());
                    final String str13 = this.$adUnitId;
                    final NativeInlineAdSlot nativeInlineAdSlot11 = this.$slot;
                    final LoadRequestKey loadRequestKey15 = this.$requestKey;
                    final Map map6 = this.$normalizedTargeting;
                    final Function2 function17 = this.$onAdFailedToLoad;
                    final NativeInlineAdPrefetchDependencies nativeInlineAdPrefetchDependencies6 = this.$prefetchDependencies;
                    final CoroutineScope coroutineScope111 = this.$prefetchScheduleScope;
                    final Function2 function18 = this.$onAdLoaded;
                    final MutableState mutableState111113 = this.$requestMarker$delegate;
                    final MutableState mutableState111114 = this.$cacheKey$delegate;
                    final MutableState mutableState111115 = this.$renderState$delegate;
                    final NativeInlineAdAnalyticsHelper nativeInlineAdAnalyticsHelper12 = this.$analyticsHelper;
                    final MutableState mutableState111116 = this.$mediaViewRef$delegate;
                    final MutableState mutableState111117 = this.$nativeAdViewRef$delegate;
                    final MutableState mutableState111118 = this.$mediaDebugInfo$delegate;
                    final CoroutineScope coroutineScope112 = coroutineScope2;
                    final Ref.LongRef longRef12 = longRef3;
                    final long j111 = j6;
                    AdLoader.Builder builderForNativeAd6 = builderWithNativeAdOptions6.forNativeAd(new NativeAd.OnNativeAdLoadedListener() { // from class: app.chalo.ads.i
                        @Override // com.google.android.gms.ads.nativead.NativeAd.OnNativeAdLoadedListener
                        public final void onNativeAdLoaded(NativeAd nativeAd2) {
                            String logValue = NativeInlineAdLoadSource.Direct.getLogValue();
                            long j112 = j111;
                            String str14 = str13;
                            NativeInlineAdSlot nativeInlineAdSlot12 = nativeInlineAdSlot11;
                            NativeInlineAdKt.c("sdk_native_loaded", j112, str14, nativeInlineAdSlot12, logValue, nativeAd2, null, 192);
                            Intrinsics.f(nativeAd2);
                            NativeInlineAdKt$NativeInlineAd$4$1.n(j112, str14, nativeInlineAdSlot12, loadRequestKey15, map6, function17, nativeInlineAdPrefetchDependencies6, longRef12, z4, coroutineScope111, function18, mutableState111113, mutableState111114, mutableState111115, nativeInlineAdAnalyticsHelper12, mutableState111116, mutableState111117, mutableState111118, nativeAd2, true, false);
                        }
                    });
                    final String str14 = this.$adUnitId;
                    final NativeInlineAdSlot nativeInlineAdSlot12 = this.$slot;
                    final MutableState mutableState111119 = this.$renderState$delegate;
                    final NativeInlineAdAnalyticsHelper nativeInlineAdAnalyticsHelper13 = this.$analyticsHelper;
                    final LoadRequestKey loadRequestKey16 = this.$requestKey;
                    final Function2 function19 = this.$onAdFailedToLoad;
                    final MutableState mutableState29 = this.$requestMarker$delegate;
                    final MutableState mutableState210 = this.$cacheKey$delegate;
                    final MutableState mutableState1111110 = this.$mediaViewRef$delegate;
                    final MutableState mutableState1111111 = this.$nativeAdViewRef$delegate;
                    final MutableState mutableState1111112 = this.$mediaDebugInfo$delegate;
                    builderForNativeAd6.withAdListener(new AdListener() { // from class: app.chalo.ads.NativeInlineAdKt$NativeInlineAd$4$1.3
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // com.google.android.gms.ads.AdListener
                        public final void onAdClicked() {
                            NativeInlineAdRenderState nativeInlineAdRenderState = (NativeInlineAdRenderState) mutableState111119.getValue();
                            if (nativeInlineAdRenderState != null && nativeInlineAdRenderState.f817a == j111 && nativeInlineAdRenderState.b == NativeInlineAdLoadSource.Direct) {
                                NativeInlineAdKt$NativeInlineAd$4$1.h(str14, nativeInlineAdSlot12, nativeInlineAdAnalyticsHelper13, DevicePublicKeyStringDef.DIRECT, nativeInlineAdRenderState);
                            }
                        }

                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // com.google.android.gms.ads.AdListener
                        public final void onAdFailedToLoad(LoadAdError adError) {
                            Intrinsics.i(adError, "adError");
                            long j112 = j111;
                            String str15 = str14;
                            NativeInlineAdSlot nativeInlineAdSlot13 = nativeInlineAdSlot12;
                            String logValue = NativeInlineAdLoadSource.Direct.getLogValue();
                            int code = adError.getCode();
                            String message = adError.getMessage();
                            ResponseInfo responseInfo = adError.getResponseInfo();
                            StringBuilder sbP = nf1.p(code, "code=", " message=", message, " responseInfo=");
                            sbP.append(responseInfo);
                            NativeInlineAdKt.c("load_failed", j112, str15, nativeInlineAdSlot13, logValue, null, sbP.toString(), 32);
                            MutableState mutableState1111113 = mutableState29;
                            LoadRequestMarker loadRequestMarker = (LoadRequestMarker) mutableState1111113.getValue();
                            if (loadRequestMarker != null && Intrinsics.d(loadRequestMarker.f795a, loadRequestKey16)) {
                                NativeAdLayoutCache.Key key = (NativeAdLayoutCache.Key) mutableState210.getValue();
                                if (key != null) {
                                    synchronized (NativeAdLayoutCache.f798a) {
                                        NativeAdLayoutCache.b.remove(key);
                                    }
                                }
                                mutableState111119.setValue(null);
                                mutableState1111113.setValue(null);
                            }
                            Function2 function110 = function19;
                            if (function110 != null) {
                                function110.invoke(Integer.valueOf(adError.getCode()), new BindNativeAdResult.Failed.SDKLoadAdError(adError.getMessage()));
                            }
                        }

                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // com.google.android.gms.ads.AdListener
                        public final void onAdImpression() {
                            NativeInlineAdRenderState nativeInlineAdRenderState = (NativeInlineAdRenderState) mutableState111119.getValue();
                            if (nativeInlineAdRenderState != null && nativeInlineAdRenderState.f817a == j111 && nativeInlineAdRenderState.b == NativeInlineAdLoadSource.Direct) {
                                NativeInlineAdKt$NativeInlineAd$4$1.l(str14, nativeInlineAdSlot12, nativeInlineAdAnalyticsHelper13, mutableState1111110, mutableState1111111, mutableState1111112, DevicePublicKeyStringDef.DIRECT, nativeInlineAdRenderState);
                            }
                        }

                        @Override // com.google.android.gms.ads.AdListener
                        public final void onAdLoaded() {
                            NativeInlineAdKt.c("sdk_adlistener_loaded", j111, str14, nativeInlineAdSlot12, NativeInlineAdLoadSource.Direct.getLogValue(), null, null, 224);
                        }
                    }).build().loadAd(adManagerAdRequestBuild);
                    return unit;
                }
            } catch (Throwable th6) {
                th = th6;
                coroutineScope3 = coroutineScope14;
            }
        } catch (Throwable th7) {
            th = th7;
            str2 = "targetingKeys=";
            coroutineScope3 = coroutineScope14;
            obj2 = null;
        }
        return coroutineSingletons;
    }
}
