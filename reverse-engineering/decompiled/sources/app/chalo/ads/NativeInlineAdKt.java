package app.chalo.ads;

import android.content.Context;
import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.ExitTransition;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.unit.IntSize;
import app.chalo.R;
import app.chalo.ads.NativeInlineAdKt;
import app.chalo.compose.components.ChaloRoundedCardKt;
import com.google.android.gms.ads.nativead.NativeAd;
import defpackage.g5;
import defpackage.hl0;
import defpackage.hq0;
import defpackage.pk0;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002¨\u0006\u000e²\u0006\u0010\u0010\u0001\u001a\u0004\u0018\u00010\u00008\n@\nX\u008a\u008e\u0002²\u0006\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u00028\n@\nX\u008a\u008e\u0002²\u0006\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u00048\n@\nX\u008a\u008e\u0002²\u0006\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u00068\n@\nX\u008a\u008e\u0002²\u0006\u0010\u0010\t\u001a\u0004\u0018\u00010\b8\n@\nX\u008a\u008e\u0002²\u0006\u0010\u0010\u000b\u001a\u0004\u0018\u00010\n8\n@\nX\u008a\u008e\u0002²\u0006\u0010\u0010\r\u001a\u0004\u0018\u00010\f8\n@\nX\u008a\u008e\u0002"}, d2 = {"Lapp/chalo/ads/NativeInlineAdRenderState;", "renderState", "Lapp/chalo/ads/LoadRequestMarker;", "requestMarker", "Lapp/chalo/ads/NativeAdLayoutCache$Key;", "cacheKey", "Lapp/chalo/ads/MediaDebugInfo;", "mediaDebugInfo", "Lcom/google/android/gms/ads/nativead/NativeAdView;", "nativeAdViewRef", "Lcom/google/android/gms/ads/nativead/MediaView;", "mediaViewRef", "Landroidx/compose/ui/unit/IntSize;", "lastReadySize", "chalo-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class NativeInlineAdKt {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f811a;
        public static final /* synthetic */ int[] b;
        public static final /* synthetic */ int[] c;

        static {
            int[] iArr = new int[NativeInlineContentLayout.values().length];
            try {
                iArr[NativeInlineContentLayout.Hero.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[NativeInlineContentLayout.Card.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f811a = iArr;
            int[] iArr2 = new int[NativeInlineAdSlot.values().length];
            try {
                iArr2[NativeInlineAdSlot.ROUTE_DETAILS.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[NativeInlineAdSlot.CHECKOUT_PAYMENT_METHODS.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            b = iArr2;
            int[] iArr3 = new int[NativeMediaAspectRatioCategory.values().length];
            try {
                iArr3[NativeMediaAspectRatioCategory.LandScape.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr3[NativeMediaAspectRatioCategory.SquareImage.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[NativeMediaAspectRatioCategory.PortraitImage.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[NativeMediaAspectRatioCategory.Unknown.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            c = iArr3;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(final String adUnitId, final NativeInlineAdSlot slot, final Modifier modifier, final Map map, final Function2 function2, final Function2 function3, Composer composer, final int i) {
        int i2;
        Modifier modifier2;
        Function2 function4;
        Composer composer2;
        Object nativeInlineAdKt$NativeInlineAd$4$1;
        LoadRequestKey loadRequestKey;
        MutableState mutableState;
        MutableState mutableState2;
        MutableState mutableState3;
        final NativeInlineAdAnalyticsHelper nativeInlineAdAnalyticsHelper;
        final MutableState mutableState4;
        Intrinsics.i(adUnitId, "adUnitId");
        Intrinsics.i(slot, "slot");
        Composer composerStartRestartGroup = composer.startRestartGroup(1205510811);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(adUnitId) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(slot.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            modifier2 = modifier;
            i2 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
        } else {
            modifier2 = modifier;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(map) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            function4 = function2;
            i2 |= composerStartRestartGroup.changedInstance(function4) ? 16384 : 8192;
        } else {
            function4 = function2;
        }
        if ((196608 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function3) ? 131072 : 65536;
        }
        if (composerStartRestartGroup.shouldExecute((74899 & i2) != 74898, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1205510811, i2, -1, "app.chalo.ads.NativeInlineAd (NativeInlineAd.kt:55)");
            }
            if (!AdsPolicyKt.a(composerStartRestartGroup)) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    final int i3 = 0;
                    final Modifier modifier3 = modifier2;
                    final Function2 function5 = function4;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: il0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            switch (i3) {
                                case 0:
                                    ((Integer) obj2).getClass();
                                    NativeInlineAdKt.a(adUnitId, slot, modifier3, map, function5, function3, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                                    break;
                                default:
                                    ((Integer) obj2).getClass();
                                    NativeInlineAdKt.a(adUnitId, slot, modifier3, map, function5, function3, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                                    break;
                            }
                            return Unit.f17538a;
                        }
                    });
                    return;
                }
                return;
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = new NativeInlineAdAnalyticsHelper();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            NativeInlineAdAnalyticsHelper nativeInlineAdAnalyticsHelper2 = (NativeInlineAdAnalyticsHelper) objRememberedValue;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new NativeInlineAdPrefetchDependencies();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            final NativeInlineAdPrefetchDependencies nativeInlineAdPrefetchDependencies = (NativeInlineAdPrefetchDependencies) objRememberedValue2;
            Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.f17583a, composerStartRestartGroup);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            CoroutineScope coroutineScope = (CoroutineScope) objRememberedValue3;
            boolean zChanged = composerStartRestartGroup.changed(map);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = MapsKt.r(map);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            Map map2 = (Map) objRememberedValue4;
            int i4 = i2 & 14;
            boolean zChanged2 = (i4 == 4) | composerStartRestartGroup.changed(map2);
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue5 == companion.getEmpty()) {
                objRememberedValue5 = new LoadRequestKey(adUnitId, map2);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            LoadRequestKey loadRequestKey2 = (LoadRequestKey) objRememberedValue5;
            Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue6 == companion.getEmpty()) {
                objRememberedValue6 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
            }
            MutableState mutableState5 = (MutableState) objRememberedValue6;
            Object objRememberedValue7 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue7 == companion.getEmpty()) {
                objRememberedValue7 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
            }
            MutableState mutableState6 = (MutableState) objRememberedValue7;
            Object objRememberedValue8 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue8 == companion.getEmpty()) {
                objRememberedValue8 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
            }
            MutableState mutableState7 = (MutableState) objRememberedValue8;
            Object objRememberedValue9 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue9 == companion.getEmpty()) {
                objRememberedValue9 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
            }
            MutableState mutableState8 = (MutableState) objRememberedValue9;
            Object objRememberedValue10 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue10 == companion.getEmpty()) {
                objRememberedValue10 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue10);
            }
            final MutableState mutableState9 = (MutableState) objRememberedValue10;
            Object objRememberedValue11 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue11 == companion.getEmpty()) {
                objRememberedValue11 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue11);
            }
            final MutableState mutableState10 = (MutableState) objRememberedValue11;
            Object objRememberedValue12 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue12 == companion.getEmpty()) {
                objRememberedValue12 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue12);
            }
            MutableState mutableState11 = (MutableState) objRememberedValue12;
            Object objRememberedValue13 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue13 == companion.getEmpty()) {
                objRememberedValue13 = new g5(mutableState6, 25);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue13);
            }
            EffectsKt.DisposableEffect(Unit.f17538a, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue13, composerStartRestartGroup, 54);
            NativeInlineAdRenderState nativeInlineAdRenderState = (NativeInlineAdRenderState) mutableState5.getValue();
            final NativeAd nativeAd = nativeInlineAdRenderState != null ? nativeInlineAdRenderState.d : null;
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(nativeAd) | composerStartRestartGroup.changedInstance(nativeInlineAdPrefetchDependencies);
            Object objRememberedValue14 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue14 == companion.getEmpty()) {
                objRememberedValue14 = new Function1() { // from class: app.chalo.ads.f
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        DisposableEffectScope DisposableEffect = (DisposableEffectScope) obj;
                        Intrinsics.i(DisposableEffect, "$this$DisposableEffect");
                        return new DisposableEffectResult(DisposableEffect, nativeInlineAdPrefetchDependencies) { // from class: app.chalo.ads.NativeInlineAdKt$NativeInlineAd$lambda$27$0$$inlined$onDispose$1
                            public final /* synthetic */ NativeInlineAdPrefetchDependencies b;

                            {
                                this.b = nativeInlineAdPrefetchDependencies;
                            }

                            @Override // androidx.compose.runtime.DisposableEffectResult
                            public final void dispose() {
                                NativeAd nativeAd2 = this.f810a;
                                if (nativeAd2 != null) {
                                    this.b.a().d(nativeAd2, null);
                                }
                                if (nativeAd2 != null) {
                                    try {
                                        nativeAd2.destroy();
                                    } catch (Throwable th) {
                                        ResultKt.a(th);
                                    }
                                }
                            }
                        };
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue14);
            }
            EffectsKt.DisposableEffect(nativeAd, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue14, composerStartRestartGroup, 0);
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(nativeInlineAdPrefetchDependencies) | composerStartRestartGroup.changedInstance(loadRequestKey2) | composerStartRestartGroup.changedInstance(map2) | (i4 == 4) | ((i2 & 112) == 32) | composerStartRestartGroup.changedInstance(nativeInlineAdAnalyticsHelper2) | ((458752 & i2) == 131072) | composerStartRestartGroup.changedInstance(coroutineScope) | ((57344 & i2) == 16384) | composerStartRestartGroup.changedInstance(context);
            Object objRememberedValue15 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || objRememberedValue15 == companion.getEmpty()) {
                loadRequestKey = loadRequestKey2;
                mutableState = mutableState5;
                mutableState2 = mutableState7;
                mutableState3 = mutableState8;
                nativeInlineAdKt$NativeInlineAd$4$1 = new NativeInlineAdKt$NativeInlineAd$4$1(loadRequestKey, adUnitId, slot, map2, nativeInlineAdAnalyticsHelper2, nativeInlineAdPrefetchDependencies, context, mutableState6, mutableState, mutableState3, mutableState9, mutableState10, mutableState11, mutableState2, function3, coroutineScope, function2, null);
                nativeInlineAdAnalyticsHelper = nativeInlineAdAnalyticsHelper2;
                mutableState4 = mutableState11;
                composer2 = composerStartRestartGroup;
                composer2.updateRememberedValue(nativeInlineAdKt$NativeInlineAd$4$1);
            } else {
                nativeInlineAdKt$NativeInlineAd$4$1 = objRememberedValue15;
                nativeInlineAdAnalyticsHelper = nativeInlineAdAnalyticsHelper2;
                composer2 = composerStartRestartGroup;
                loadRequestKey = loadRequestKey2;
                mutableState = mutableState5;
                mutableState2 = mutableState7;
                mutableState3 = mutableState8;
                mutableState4 = mutableState11;
            }
            EffectsKt.LaunchedEffect(loadRequestKey, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) nativeInlineAdKt$NativeInlineAd$4$1, composer2, 0);
            final MutableState mutableState12 = mutableState;
            final MutableState mutableState13 = mutableState3;
            final MutableState mutableState14 = mutableState2;
            AnimatedVisibilityKt.AnimatedVisibility(((NativeInlineAdRenderState) mutableState.getValue()) != null, (Modifier) null, EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween$default(300, 0, null, 6, null), 0.0f, 2, null), (ExitTransition) null, (String) null, ComposableLambdaKt.rememberComposableLambda(-286635661, true, new Function3() { // from class: app.chalo.ads.g
                /* JADX WARN: Multi-variable type inference failed */
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    AnimatedVisibilityScope AnimatedVisibility = (AnimatedVisibilityScope) obj;
                    Composer composer3 = (Composer) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    Intrinsics.i(AnimatedVisibility, "$this$AnimatedVisibility");
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-286635661, iIntValue, -1, "app.chalo.ads.NativeInlineAd.<anonymous> (NativeInlineAd.kt:592)");
                    }
                    final NativeInlineAdRenderState nativeInlineAdRenderState2 = (NativeInlineAdRenderState) mutableState12.getValue();
                    if (nativeInlineAdRenderState2 == null) {
                        composer3.startReplaceGroup(-767849647);
                    } else {
                        NativeAd nativeAd2 = nativeInlineAdRenderState2.d;
                        NativeAdLayoutCache.CachedSize cachedSize = nativeInlineAdRenderState2.h;
                        composer3.startReplaceGroup(-767849646);
                        boolean zChangedInstance3 = composer3.changedInstance(nativeInlineAdRenderState2);
                        final String str = adUnitId;
                        boolean zChanged3 = zChangedInstance3 | composer3.changed(str);
                        final NativeInlineAdSlot nativeInlineAdSlot = slot;
                        boolean zChanged4 = zChanged3 | composer3.changed(nativeInlineAdSlot.ordinal());
                        NativeInlineAdAnalyticsHelper nativeInlineAdAnalyticsHelper3 = nativeInlineAdAnalyticsHelper;
                        boolean zChangedInstance4 = zChanged4 | composer3.changedInstance(nativeInlineAdAnalyticsHelper3);
                        Object objRememberedValue16 = composer3.rememberedValue();
                        if (zChangedInstance4 || objRememberedValue16 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue16 = new NativeInlineAdKt$NativeInlineAd$5$1$1$1(nativeInlineAdRenderState2, str, nativeInlineAdSlot, nativeInlineAdAnalyticsHelper3, null);
                            composer3.updateRememberedValue(objRememberedValue16);
                        }
                        EffectsKt.LaunchedEffect(nativeAd2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue16, composer3, 0);
                        boolean zChangedInstance5 = composer3.changedInstance(nativeInlineAdRenderState2) | composer3.changed(str) | composer3.changed(nativeInlineAdSlot.ordinal());
                        Object objRememberedValue17 = composer3.rememberedValue();
                        final MutableState mutableState15 = mutableState13;
                        if (zChangedInstance5 || objRememberedValue17 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue17 = new Function1() { // from class: app.chalo.ads.h
                                /* JADX WARN: Multi-variable type inference failed */
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj4) {
                                    MediaBoxSpec spec = (MediaBoxSpec) obj4;
                                    Intrinsics.i(spec, "spec");
                                    MutableState mutableState16 = mutableState15;
                                    MediaDebugInfo mediaDebugInfo = (MediaDebugInfo) mutableState16.getValue();
                                    if (mediaDebugInfo == null) {
                                        mediaDebugInfo = new MediaDebugInfo(0, 0, 0, 0);
                                    }
                                    mutableState16.setValue(MediaDebugInfo.a(mediaDebugInfo, spec.f796a, spec.b, 0, 0, 12));
                                    NativeInlineAdRenderState nativeInlineAdRenderState3 = nativeInlineAdRenderState2;
                                    NativeInlineAdKt.c("render_target", nativeInlineAdRenderState3.f817a, str, nativeInlineAdSlot, "ui", nativeInlineAdRenderState3.d, "layout=" + nativeInlineAdRenderState3.f + " targetPx=" + spec.f796a + "x" + spec.b + " aspect=" + nativeInlineAdRenderState3.i + " category=" + nativeInlineAdRenderState3.e, 64);
                                    return Unit.f17538a;
                                }
                            };
                            composer3.updateRememberedValue(objRememberedValue17);
                        }
                        Function1 function1 = (Function1) objRememberedValue17;
                        boolean zChangedInstance6 = composer3.changedInstance(nativeInlineAdRenderState2) | composer3.changed(str) | composer3.changed(nativeInlineAdSlot.ordinal());
                        Object objRememberedValue18 = composer3.rememberedValue();
                        if (zChangedInstance6 || objRememberedValue18 == Composer.INSTANCE.getEmpty()) {
                            final MutableState mutableState16 = mutableState14;
                            final MutableState mutableState17 = mutableState4;
                            Function2 function6 = new Function2() { // from class: app.chalo.ads.e
                                /* JADX WARN: Multi-variable type inference failed */
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj4, Object obj5) {
                                    NativeInlineAdRenderState nativeInlineAdRenderState3 = nativeInlineAdRenderState2;
                                    String str2 = str;
                                    NativeInlineAdSlot nativeInlineAdSlot2 = nativeInlineAdSlot;
                                    MutableState mutableState18 = mutableState15;
                                    MutableState mutableState19 = mutableState16;
                                    MutableState mutableState20 = mutableState17;
                                    int iIntValue2 = ((Integer) obj4).intValue();
                                    int iIntValue3 = ((Integer) obj5).intValue();
                                    MediaDebugInfo mediaDebugInfo = (MediaDebugInfo) mutableState18.getValue();
                                    if (mediaDebugInfo == null) {
                                        mediaDebugInfo = new MediaDebugInfo(0, 0, 0, 0);
                                    }
                                    mutableState18.setValue(MediaDebugInfo.a(mediaDebugInfo, 0, 0, iIntValue2, iIntValue3, 3));
                                    NativeAdLayoutCache.Key key = (NativeAdLayoutCache.Key) mutableState19.getValue();
                                    if (key != null) {
                                        NativeAdLayoutCache nativeAdLayoutCache = NativeAdLayoutCache.f798a;
                                        if (nativeAdLayoutCache.a(key) == null) {
                                            synchronized (nativeAdLayoutCache) {
                                                LinkedHashMap linkedHashMap = NativeAdLayoutCache.b;
                                                NativeAdLayoutCache.CachedSize cachedSize2 = new NativeAdLayoutCache.CachedSize();
                                                cachedSize2.f799a = iIntValue2;
                                                cachedSize2.b = iIntValue3;
                                                linkedHashMap.put(key, cachedSize2);
                                            }
                                        } else {
                                            nativeAdLayoutCache.b(key, iIntValue2, iIntValue3);
                                        }
                                    }
                                    IntSize intSize = (IntSize) mutableState20.getValue();
                                    if (intSize == null || ((int) (intSize.m7449unboximpl() >> 32)) != iIntValue2 || ((int) (intSize.m7449unboximpl() & BodyPartID.bodyIdMax)) != iIntValue3) {
                                        mutableState20.setValue(IntSize.m7437boximpl(IntSize.m7440constructorimpl((((long) iIntValue2) << 32) | (BodyPartID.bodyIdMax & ((long) iIntValue3)))));
                                        MediaDebugInfo mediaDebugInfo2 = (MediaDebugInfo) mutableState18.getValue();
                                        long j = nativeInlineAdRenderState3.f817a;
                                        NativeAd nativeAd3 = nativeInlineAdRenderState3.d;
                                        Integer numValueOf = mediaDebugInfo2 != null ? Integer.valueOf(mediaDebugInfo2.f797a) : null;
                                        Integer numValueOf2 = mediaDebugInfo2 != null ? Integer.valueOf(mediaDebugInfo2.b) : null;
                                        NativeAdLayoutCache.Key key2 = (NativeAdLayoutCache.Key) mutableState19.getValue();
                                        StringBuilder sb = new StringBuilder("targetPx=");
                                        sb.append(numValueOf);
                                        sb.append("x");
                                        sb.append(numValueOf2);
                                        sb.append(" actual=");
                                        hq0.p(iIntValue2, iIntValue3, "x", " cacheKey=", sb);
                                        sb.append(key2);
                                        NativeInlineAdKt.c("media_ready", j, str2, nativeInlineAdSlot2, "ui", nativeAd3, sb.toString(), 64);
                                    }
                                    return Unit.f17538a;
                                }
                            };
                            composer3.updateRememberedValue(function6);
                            objRememberedValue18 = function6;
                        }
                        Function2 function7 = (Function2) objRememberedValue18;
                        int i5 = NativeInlineAdKt.WhenMappings.f811a[nativeInlineAdRenderState2.f.ordinal()];
                        Modifier modifier4 = modifier;
                        MutableState mutableState18 = mutableState9;
                        MutableState mutableState19 = mutableState10;
                        if (i5 == 1) {
                            composer3.startReplaceGroup(-1181069691);
                            float f = nativeInlineAdRenderState2.i;
                            Integer numValueOf = cachedSize != null ? Integer.valueOf(cachedSize.f799a) : null;
                            Object objRememberedValue19 = composer3.rememberedValue();
                            Composer.Companion companion2 = Composer.INSTANCE;
                            if (objRememberedValue19 == companion2.getEmpty()) {
                                objRememberedValue19 = new g5(mutableState18, 21);
                                composer3.updateRememberedValue(objRememberedValue19);
                            }
                            Function1 function8 = (Function1) objRememberedValue19;
                            Object objRememberedValue20 = composer3.rememberedValue();
                            if (objRememberedValue20 == companion2.getEmpty()) {
                                objRememberedValue20 = new g5(mutableState19, 22);
                                composer3.updateRememberedValue(objRememberedValue20);
                            }
                            NativeInlineAdTemplatesKt.d(nativeAd2, f, numValueOf, function8, (Function1) objRememberedValue20, function1, function7, SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null), composer3, 27648);
                            composer3.endReplaceGroup();
                        } else {
                            if (i5 != 2) {
                                throw pk0.p(composer3, -1181071330);
                            }
                            composer3.startReplaceGroup(-1181051163);
                            float f2 = nativeInlineAdRenderState2.i;
                            Integer numValueOf2 = cachedSize != null ? Integer.valueOf(cachedSize.f799a) : null;
                            Object objRememberedValue21 = composer3.rememberedValue();
                            Composer.Companion companion3 = Composer.INSTANCE;
                            if (objRememberedValue21 == companion3.getEmpty()) {
                                objRememberedValue21 = new g5(mutableState18, 23);
                                composer3.updateRememberedValue(objRememberedValue21);
                            }
                            Function1 function9 = (Function1) objRememberedValue21;
                            Object objRememberedValue22 = composer3.rememberedValue();
                            if (objRememberedValue22 == companion3.getEmpty()) {
                                objRememberedValue22 = new g5(mutableState19, 24);
                                composer3.updateRememberedValue(objRememberedValue22);
                            }
                            NativeInlineAdTemplatesKt.c(nativeAd2, f2, numValueOf2, function9, (Function1) objRememberedValue22, function1, function7, SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null), composer3, 27648);
                            composer3.endReplaceGroup();
                        }
                    }
                    composer3.endReplaceGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    return Unit.f17538a;
                }
            }, composer2, 54), composer2, 196992, 26);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup2 != null) {
            final int i5 = 1;
            scopeUpdateScopeEndRestartGroup2.updateScope(new Function2() { // from class: il0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    switch (i5) {
                        case 0:
                            ((Integer) obj2).getClass();
                            NativeInlineAdKt.a(adUnitId, slot, modifier, map, function2, function3, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                            break;
                        default:
                            ((Integer) obj2).getClass();
                            NativeInlineAdKt.a(adUnitId, slot, modifier, map, function2, function3, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                            break;
                    }
                    return Unit.f17538a;
                }
            });
        }
    }

    public static final void b(final NativeInlineAdSlot slot, final Modifier modifier, final Map map, final Function3 function3, final Function2 function2, Composer composer, final int i) {
        int i2;
        final Function2 function4;
        Composer composer2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Function2<? super Composer, ? super Integer, Unit> function5;
        String string;
        Intrinsics.i(slot, "slot");
        Composer composerStartRestartGroup = composer.startRestartGroup(-2073996714);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(slot.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(map) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function3) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            function4 = function2;
            i2 |= composerStartRestartGroup.changedInstance(function4) ? 16384 : 8192;
        } else {
            function4 = function2;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 9363) != 9362, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2073996714, i2, -1, "app.chalo.ads.NativeInlineAdComposable (NativeInlineAd.kt:680)");
            }
            if (AdsPolicyKt.a(composerStartRestartGroup)) {
                Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                boolean z = (i2 & 14) == 4;
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    int i3 = WhenMappings.b[slot.ordinal()];
                    if (i3 == 1) {
                        string = context.getString(R.string.live_tracking_inline_ad_unit_id);
                        Intrinsics.h(string, "getString(...)");
                    } else {
                        if (i3 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        string = context.getString(R.string.checkout_payment_methods_ad_unit_id);
                        Intrinsics.h(string, "getString(...)");
                    }
                    objRememberedValue = string;
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composer2 = composerStartRestartGroup;
                ChaloRoundedCardKt.b(null, null, 0.0f, 0.0f, ComposableLambdaKt.rememberComposableLambda(-1647003753, true, new hl0((String) objRememberedValue, slot, modifier, map, function3, function2), composerStartRestartGroup, 54), composer2, 24576, 15);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                final int i4 = 0;
                function5 = new Function2() { // from class: gl0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        switch (i4) {
                            case 0:
                                ((Integer) obj2).getClass();
                                NativeInlineAdKt.b(slot, modifier, map, function3, function4, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                                break;
                            default:
                                ((Integer) obj2).getClass();
                                NativeInlineAdKt.b(slot, modifier, map, function3, function4, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                                break;
                        }
                        return Unit.f17538a;
                    }
                };
            }
            scopeUpdateScopeEndRestartGroup.updateScope(function5);
        }
        composer2 = composerStartRestartGroup;
        composer2.skipToGroupEnd();
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final int i5 = 1;
            function5 = new Function2() { // from class: gl0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    switch (i5) {
                        case 0:
                            ((Integer) obj2).getClass();
                            NativeInlineAdKt.b(slot, modifier, map, function3, function2, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                            break;
                        default:
                            ((Integer) obj2).getClass();
                            NativeInlineAdKt.b(slot, modifier, map, function3, function2, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                            break;
                    }
                    return Unit.f17538a;
                }
            };
            scopeUpdateScopeEndRestartGroup.updateScope(function5);
        }
    }

    public static void c(String str, long j, String str2, NativeInlineAdSlot nativeInlineAdSlot, String str3, NativeAd nativeAd, String str4, int i) {
        if ((i & 16) != 0) {
            str3 = null;
        }
        if ((i & 32) != 0) {
            nativeAd = null;
        }
        boolean z = (i & 64) == 0;
        if ((i & 128) != 0) {
            str4 = null;
        }
        if (z) {
            NativeInlineAdTelemetry.c(str, Long.valueOf(j), str2, nativeInlineAdSlot, str3, nativeAd, str4, 1);
        } else {
            NativeInlineAdTelemetry.a(str, Long.valueOf(j), str2, nativeInlineAdSlot, str3, nativeAd, str4, 1);
        }
    }
}
