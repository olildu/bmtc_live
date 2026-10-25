package app.chalo.ads;

import android.content.Context;
import android.content.res.Configuration;
import android.view.ViewTreeObserver;
import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.ExitTransition;
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
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.LifecycleEffectKt;
import androidx.lifecycle.compose.LifecyclePauseOrDisposeEffectResult;
import androidx.lifecycle.compose.LifecycleResumePauseEffectScope;
import app.chalo.R;
import app.chalo.ads.InlineAdaptiveBannerAd_androidKt;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.admanager.AdManagerAdView;
import defpackage.la0;
import defpackage.r00;
import defpackage.ya0;
import defpackage.za0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0003¨\u0006\u0003²\u0006\u000e\u0010\u0001\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0002\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002"}, d2 = {"", "isAdLoaded", "hasRendered", "chalo-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class InlineAdaptiveBannerAd_androidKt {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f793a;

        static {
            int[] iArr = new int[BannerAdSlot.values().length];
            try {
                iArr[BannerAdSlot.HOME_SCREEN_INLINE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BannerAdSlot.REGULAR_BUS_SCREEN_INLINE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f793a = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(final BannerAdSlot slot, final Modifier modifier, final Integer num, final int i, final Function0 function0, final Function1 function1, final Function1 onCrashLoggingRequired, Composer composer, final int i2) {
        int i3;
        Modifier modifier2;
        Function1 function2;
        BannerAdSlot bannerAdSlot;
        int i4;
        Function1 function3;
        Composer composer2;
        String string;
        int i5;
        Object obj;
        MutableState mutableState;
        int i6;
        final BannerAdAnalyticsHelper bannerAdAnalyticsHelper;
        final MutableState mutableState2;
        Intrinsics.i(slot, "slot");
        Intrinsics.i(onCrashLoggingRequired, "onCrashLoggingRequired");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1041925685);
        if ((i2 & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(slot.ordinal()) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            modifier2 = modifier;
            i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
        } else {
            modifier2 = modifier;
        }
        if ((i2 & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(num) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= composerStartRestartGroup.changed(i) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function0) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            function2 = function1;
            i3 |= composerStartRestartGroup.changedInstance(function2) ? 131072 : 65536;
        } else {
            function2 = function1;
        }
        if ((i2 & 1572864) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onCrashLoggingRequired) ? 1048576 : 524288;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 599187) != 599186, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1041925685, i3, -1, "app.chalo.ads.InlineAdaptiveBannerAd (InlineAdaptiveBannerAd.android.kt:52)");
            }
            if (!AdsPolicyKt.a(composerStartRestartGroup)) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    final int i7 = 0;
                    final Modifier modifier3 = modifier2;
                    final Function1 function4 = function2;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: xa0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj2, Object obj3) {
                            switch (i7) {
                                case 0:
                                    ((Integer) obj3).getClass();
                                    InlineAdaptiveBannerAd_androidKt.a(slot, modifier3, num, i, function0, function4, onCrashLoggingRequired, (Composer) obj2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                                    break;
                                default:
                                    ((Integer) obj3).getClass();
                                    InlineAdaptiveBannerAd_androidKt.a(slot, modifier3, num, i, function0, function4, onCrashLoggingRequired, (Composer) obj2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                                    break;
                            }
                            return Unit.f17538a;
                        }
                    });
                    return;
                }
                return;
            }
            i4 = i;
            function3 = onCrashLoggingRequired;
            Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            int i8 = i3 & 14;
            boolean zChanged = composerStartRestartGroup.changed(context) | (i8 == 4);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                int i9 = WhenMappings.f793a[slot.ordinal()];
                if (i9 == 1) {
                    string = context.getString(R.string.home_screen_inline_banner_ad_unit_id);
                    Intrinsics.h(string, "getString(...)");
                } else {
                    if (i9 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    string = context.getString(R.string.home_screen_inline_banner_ad_unit_id);
                    Intrinsics.h(string, "getString(...)");
                }
                objRememberedValue = string;
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final String str = (String) objRememberedValue;
            int iIntValue = ((Configuration) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalConfiguration())).screenWidthDp;
            if (num != null) {
                iIntValue = num.intValue();
            }
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue2 == companion.getEmpty()) {
                i5 = 2;
                objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            } else {
                i5 = 2;
            }
            MutableState mutableState3 = (MutableState) objRememberedValue2;
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, i5, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            MutableState mutableState4 = (MutableState) objRememberedValue3;
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = new BannerAdAnalyticsHelper();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            BannerAdAnalyticsHelper bannerAdAnalyticsHelper2 = (BannerAdAnalyticsHelper) objRememberedValue4;
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue5 == companion.getEmpty()) {
                objRememberedValue5 = new BannerAdTargetingHelper();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            BannerAdTargetingHelper bannerAdTargetingHelper = (BannerAdTargetingHelper) objRememberedValue5;
            boolean zChanged2 = composerStartRestartGroup.changed(context) | composerStartRestartGroup.changed(str) | composerStartRestartGroup.changed(iIntValue) | ((i3 & 7168) == 2048);
            Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue6 == companion.getEmpty()) {
                obj = objRememberedValue6;
                AdManagerAdView adManagerAdView = new AdManagerAdView(context);
                adManagerAdView.setAdUnitId(str);
                adManagerAdView.setDescendantFocusability(393216);
                adManagerAdView.setAdSize(AdSize.getInlineAdaptiveBannerAdSize(iIntValue, i4));
                String message = "Created AdManagerAdView with adUnitId=" + str + ", width=" + iIntValue + ", maxHeight=" + i4;
                Intrinsics.i(message, "message");
                composerStartRestartGroup.updateRememberedValue(adManagerAdView);
                obj = adManagerAdView;
            }
            obj = objRememberedValue6;
            final AdManagerAdView adManagerAdView2 = (AdManagerAdView) obj;
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(bannerAdTargetingHelper) | composerStartRestartGroup.changedInstance(adManagerAdView2) | composerStartRestartGroup.changedInstance(bannerAdAnalyticsHelper2) | composerStartRestartGroup.changed(str) | (i8 == 4) | ((57344 & i3) == 16384) | ((458752 & i3) == 131072);
            Object objRememberedValue7 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue7 == companion.getEmpty()) {
                mutableState = mutableState4;
                i6 = 0;
                bannerAdAnalyticsHelper = bannerAdAnalyticsHelper2;
                InlineAdaptiveBannerAd_androidKt$InlineAdaptiveBannerAd$2$1 inlineAdaptiveBannerAd_androidKt$InlineAdaptiveBannerAd$2$1 = new InlineAdaptiveBannerAd_androidKt$InlineAdaptiveBannerAd$2$1(bannerAdTargetingHelper, adManagerAdView2, bannerAdAnalyticsHelper, str, slot, mutableState3, mutableState, function0, function1, null);
                adManagerAdView2 = adManagerAdView2;
                mutableState2 = mutableState3;
                composerStartRestartGroup.updateRememberedValue(inlineAdaptiveBannerAd_androidKt$InlineAdaptiveBannerAd$2$1);
                objRememberedValue7 = inlineAdaptiveBannerAd_androidKt$InlineAdaptiveBannerAd$2$1;
            } else {
                mutableState2 = mutableState3;
                mutableState = mutableState4;
                bannerAdAnalyticsHelper = bannerAdAnalyticsHelper2;
                i6 = 0;
            }
            EffectsKt.LaunchedEffect(adManagerAdView2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue7, composerStartRestartGroup, i6);
            Boolean bool = (Boolean) mutableState2.getValue();
            bool.getClass();
            int i10 = (composerStartRestartGroup.changedInstance(adManagerAdView2) ? 1 : 0) | (composerStartRestartGroup.changedInstance(bannerAdAnalyticsHelper) ? 1 : 0) | (composerStartRestartGroup.changed(str) ? 1 : 0) | (i8 == 4 ? 1 : i6);
            Object objRememberedValue8 = composerStartRestartGroup.rememberedValue();
            if (i10 != 0 || objRememberedValue8 == companion.getEmpty()) {
                final MutableState mutableState5 = mutableState;
                Function1 function5 = new Function1() { // from class: app.chalo.ads.d
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r0v1, types: [android.view.ViewTreeObserver$OnDrawListener, app.chalo.ads.InlineAdaptiveBannerAd_androidKt$InlineAdaptiveBannerAd$3$1$onDrawListener$1] */
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        DisposableEffectScope DisposableEffect = (DisposableEffectScope) obj2;
                        Intrinsics.i(DisposableEffect, "$this$DisposableEffect");
                        if (!((Boolean) mutableState2.getValue()).booleanValue()) {
                            return new InlineAdaptiveBannerAd_androidKt$InlineAdaptiveBannerAd$lambda$12$0$$inlined$onDispose$1();
                        }
                        final AdManagerAdView adManagerAdView3 = adManagerAdView2;
                        ViewTreeObserver viewTreeObserver = adManagerAdView3.getViewTreeObserver();
                        final BannerAdAnalyticsHelper bannerAdAnalyticsHelper3 = bannerAdAnalyticsHelper;
                        final String str2 = str;
                        final BannerAdSlot bannerAdSlot2 = slot;
                        final MutableState mutableState6 = mutableState5;
                        final ?? r0 = new ViewTreeObserver.OnDrawListener() { // from class: app.chalo.ads.InlineAdaptiveBannerAd_androidKt$InlineAdaptiveBannerAd$3$1$onDrawListener$1
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // android.view.ViewTreeObserver.OnDrawListener
                            public final void onDraw() {
                                MutableState mutableState7 = mutableState6;
                                if (((Boolean) mutableState7.getValue()).booleanValue()) {
                                    return;
                                }
                                mutableState7.setValue(Boolean.TRUE);
                                BannerAdAnalyticsHelper bannerAdAnalyticsHelper4 = bannerAdAnalyticsHelper3;
                                bannerAdAnalyticsHelper4.getClass();
                                String adUnitId = str2;
                                Intrinsics.i(adUnitId, "adUnitId");
                                BannerAdSlot slot2 = bannerAdSlot2;
                                Intrinsics.i(slot2, "slot");
                                bannerAdAnalyticsHelper4.a("ad rendered", new BannerAdAnalyticsMetadata(adUnitId, slot2), MapsKt.d());
                                AdManagerAdView adManagerAdView4 = adManagerAdView3;
                                adManagerAdView4.post(new r00(14, adManagerAdView4, this));
                            }
                        };
                        if (viewTreeObserver.isAlive()) {
                            viewTreeObserver.addOnDrawListener(r0);
                        }
                        return new DisposableEffectResult() { // from class: app.chalo.ads.InlineAdaptiveBannerAd_androidKt$InlineAdaptiveBannerAd$lambda$12$0$$inlined$onDispose$2
                            @Override // androidx.compose.runtime.DisposableEffectResult
                            public final void dispose() {
                                ViewTreeObserver viewTreeObserver2 = adManagerAdView3.getViewTreeObserver();
                                if (viewTreeObserver2.isAlive()) {
                                    viewTreeObserver2.removeOnDrawListener(r0);
                                }
                            }
                        };
                    }
                };
                bannerAdSlot = slot;
                composerStartRestartGroup.updateRememberedValue(function5);
                objRememberedValue8 = function5;
            } else {
                bannerAdSlot = slot;
            }
            EffectsKt.DisposableEffect(adManagerAdView2, bool, (Function1) objRememberedValue8, composerStartRestartGroup, i6);
            composerStartRestartGroup.startMovableGroup(-563056808, adManagerAdView2);
            AdManagerAdView adManagerAdView3 = adManagerAdView2;
            int i11 = 1;
            Composer composer3 = composerStartRestartGroup;
            AnimatedVisibilityKt.AnimatedVisibility(((Boolean) mutableState2.getValue()).booleanValue(), modifier, EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null), (ExitTransition) null, (String) null, ComposableLambdaKt.rememberComposableLambda(-365230576, true, new la0(adManagerAdView2, 1), composerStartRestartGroup, 54), composer3, (i3 & 112) | 196992, 24);
            boolean zChangedInstance2 = composer3.changedInstance(adManagerAdView3);
            Object objRememberedValue9 = composer3.rememberedValue();
            if (zChangedInstance2 || objRememberedValue9 == companion.getEmpty()) {
                objRememberedValue9 = new ya0(adManagerAdView3, 0);
                composer3.updateRememberedValue(objRememberedValue9);
            }
            LifecycleEffectKt.LifecycleResumeEffect(adManagerAdView3, (LifecycleOwner) null, (Function1<? super LifecycleResumePauseEffectScope, ? extends LifecyclePauseOrDisposeEffectResult>) objRememberedValue9, composer3, 0, 2);
            int i12 = (i8 == 4 ? 1 : i6) | (composer3.changedInstance(adManagerAdView3) ? 1 : 0);
            if ((i3 & 3670016) != 1048576) {
                i11 = i6;
            }
            int i13 = (i12 == true ? 1 : 0) | i11;
            Object objRememberedValue10 = composer3.rememberedValue();
            if (i13 != 0 || objRememberedValue10 == companion.getEmpty()) {
                objRememberedValue10 = new za0(0, bannerAdSlot, adManagerAdView3, function3);
                composer3.updateRememberedValue(objRememberedValue10);
            }
            EffectsKt.DisposableEffect(adManagerAdView3, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue10, composer3, i6);
            composer3.endMovableGroup();
            composer2 = composer3;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                composer2 = composer3;
            }
        } else {
            bannerAdSlot = slot;
            i4 = i;
            function3 = onCrashLoggingRequired;
            Composer composer4 = composerStartRestartGroup;
            composer4.skipToGroupEnd();
            composer2 = composer4;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup2 != null) {
            final int i14 = 1;
            final BannerAdSlot bannerAdSlot2 = bannerAdSlot;
            final int i15 = i4;
            final Function1 function6 = function3;
            scopeUpdateScopeEndRestartGroup2.updateScope(new Function2() { // from class: xa0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    switch (i14) {
                        case 0:
                            ((Integer) obj3).getClass();
                            InlineAdaptiveBannerAd_androidKt.a(bannerAdSlot2, modifier, num, i15, function0, function1, function6, (Composer) obj2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                            break;
                        default:
                            ((Integer) obj3).getClass();
                            InlineAdaptiveBannerAd_androidKt.a(bannerAdSlot2, modifier, num, i15, function0, function1, function6, (Composer) obj2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                            break;
                    }
                    return Unit.f17538a;
                }
            });
        }
    }
}
