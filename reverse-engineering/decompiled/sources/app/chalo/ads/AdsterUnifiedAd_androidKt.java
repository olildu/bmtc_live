package app.chalo.ads;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.LifecycleEffectKt;
import androidx.lifecycle.compose.LifecyclePauseOrDisposeEffectResult;
import androidx.lifecycle.compose.LifecycleResumePauseEffectScope;
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.webkit.ProxyConfig;
import app.chalo.R;
import app.chalo.ads.AdsterUnifiedAd_androidKt;
import app.chalo.ads.UnifiedAdDebugFixtureLifecycleTracker;
import app.chalo.crashlytics.CrashlyticsLog;
import app.chalo.utils.chalologger.ChaloLog;
import com.adster.sdk.mediation.MediationBannerAd;
import com.adster.sdk.mediation.MediationBannerVideoAd;
import com.adster.sdk.mediation.MediationNativeAd;
import com.adster.sdk.mediation.MediationNativeAdView;
import com.adster.sdk.mediation.MediationNativeCustomFormatAd;
import com.google.ads.mediation.inmobi.InMobiNetworkValues;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.MediaContent;
import com.google.android.gms.ads.admanager.AdManagerAdView;
import com.google.android.gms.ads.nativead.MediaView;
import com.google.android.gms.ads.nativead.NativeAd;
import defpackage.b2;
import defpackage.c2;
import defpackage.cb0;
import defpackage.g2;
import defpackage.i2;
import defpackage.j2;
import defpackage.k2;
import defpackage.pk0;
import defpackage.q2;
import defpackage.t;
import defpackage.vo1;
import defpackage.z40;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.math.MathKt;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002¨\u0006\u001b²\u0006>\u0010\u0007\u001a4\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00008\nX\u008a\u0084\u0002²\u0006)\u0010\n\u001a\u001f\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\u0006\u0018\u00010\b8\nX\u008a\u0084\u0002²\u0006\u0014\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000b8\nX\u008a\u0084\u0002²\u0006\u0018\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00060\b8\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u000f\u001a\u00020\u00018\n@\nX\u008a\u008e\u0002²\u0006\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u00108\n@\nX\u008a\u008e\u0002²\u0006\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u00128\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0015\u001a\u00020\u00148\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0016\u001a\u00020\u00148\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0017\u001a\u00020\u00018\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0018\u001a\u00020\u00018\n@\nX\u008a\u008e\u0002²\u0006\f\u0010\u001a\u001a\u00020\u00198\nX\u008a\u0084\u0002"}, d2 = {"Lkotlin/Function2;", "", "Lkotlin/ParameterName;", "name", "widthDp", "heightDp", "", "latestOnAdLoadedSize", "Lkotlin/Function1;", "errorCode", "latestOnAdFailedToLoad", "Lkotlin/Function0;", "latestOnAdRendered", "Lapp/chalo/crashlytics/CrashlyticsLog;", "latestOnCrashLoggingRequired", "renderedHeightDp", "", "currentAd", "Lapp/chalo/ads/UnifiedAdCreativeType;", "currentCreativeType", "", "isTerminalFailure", "hasRendered", "activeRequestToken", "lifecycleGeneration", "Lapp/chalo/ads/AdsterSdkInitState;", "initState", "chalo-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class AdsterUnifiedAd_androidKt {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f737a;
        public static final /* synthetic */ int[] b;
        public static final /* synthetic */ int[] c;
        public static final /* synthetic */ int[] d;

        static {
            int[] iArr = new int[UnifiedAdSlot.values().length];
            try {
                iArr[UnifiedAdSlot.LIVE_TRACKING_ANCHORED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[UnifiedAdSlot.HOME_TAB_UNIFIED_INLINE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[UnifiedAdSlot.REGULAR_BUS_TAB_UNIFIED_INLINE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[UnifiedAdSlot.REGULAR_BUS_INLINE_ADAPTIVE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[UnifiedAdSlot.STOP_TRIP_DETAILS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[UnifiedAdSlot.BUSES_AROUND_YOU_MEDIUM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[UnifiedAdSlot.TRIP_PLANNER_RESULTS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f737a = iArr;
            int[] iArr2 = new int[Lifecycle.Event.values().length];
            try {
                iArr2[Lifecycle.Event.ON_START.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[Lifecycle.Event.ON_STOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[Lifecycle.Event.ON_DESTROY.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            b = iArr2;
            int[] iArr3 = new int[NativeHomeLayoutVariant.values().length];
            try {
                iArr3[NativeHomeLayoutVariant.WIDE_MEDIA.ordinal()] = 1;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[NativeHomeLayoutVariant.SPLIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused12) {
            }
            c = iArr3;
            int[] iArr4 = new int[UnifiedAdVisualTreatment.values().length];
            try {
                iArr4[UnifiedAdVisualTreatment.SHORT_STRIP.ordinal()] = 1;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr4[UnifiedAdVisualTreatment.ADAPTIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr4[UnifiedAdVisualTreatment.MEDIUM_FIXED_HEIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused15) {
            }
            d = iArr4;
        }
    }

    public static final void a(final UnifiedAdRenderConfig config, Object obj, final Modifier modifier, final Function2 function2, final Function1 function1, final Function0 function0, final Function1 onCrashLoggingRequired, Composer composer, final int i, final int i2) {
        int i3;
        final Function1 function3;
        Function0 function4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Function2<? super Composer, ? super Integer, Unit> function5;
        Intrinsics.i(config, "config");
        Intrinsics.i(onCrashLoggingRequired, "onCrashLoggingRequired");
        Composer composerStartRestartGroup = composer.startRestartGroup(1402591593);
        if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(config) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(obj) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            function3 = function1;
            i3 |= composerStartRestartGroup.changedInstance(function3) ? 16384 : 8192;
        } else {
            function3 = function1;
        }
        if ((196608 & i) == 0) {
            function4 = function0;
            i3 |= composerStartRestartGroup.changedInstance(function4) ? 131072 : 65536;
        } else {
            function4 = function0;
        }
        if ((1572864 & i) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onCrashLoggingRequired) ? 1048576 : 524288;
        }
        if (composerStartRestartGroup.shouldExecute((599187 & i3) != 599186, i3 & 1)) {
            if (i4 != 0) {
                obj = null;
            }
            final Object obj2 = obj;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1402591593, i3, -1, "app.chalo.ads.AdsterUnifiedAd (AdsterUnifiedAd.android.kt:215)");
            }
            if (AdsPolicyKt.a(composerStartRestartGroup)) {
                obj = obj2;
                composerStartRestartGroup.startMovableGroup(-729198051, composerStartRestartGroup.joinKey(config.f851a, obj));
                int i5 = i3 & 14;
                int i6 = i3 >> 3;
                b(config, modifier, function2, function1, function0, onCrashLoggingRequired, composerStartRestartGroup, i5 | (i6 & 112) | (i6 & 896) | (i6 & 7168) | (57344 & i6) | (i6 & 458752));
                composerStartRestartGroup.endMovableGroup();
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
                final int i7 = 0;
                final Function0 function6 = function4;
                function5 = new Function2() { // from class: d2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj3, Object obj4) {
                        switch (i7) {
                            case 0:
                                ((Integer) obj4).getClass();
                                AdsterUnifiedAd_androidKt.a(config, obj2, modifier, function2, function3, function6, onCrashLoggingRequired, (Composer) obj3, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                                break;
                            default:
                                ((Integer) obj4).getClass();
                                AdsterUnifiedAd_androidKt.a(config, obj2, modifier, function2, function3, function6, onCrashLoggingRequired, (Composer) obj3, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                                break;
                        }
                        return Unit.f17538a;
                    }
                };
            }
            scopeUpdateScopeEndRestartGroup.updateScope(function5);
        }
        composerStartRestartGroup.skipToGroupEnd();
        final Object obj3 = obj;
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final int i8 = 1;
            function5 = new Function2() { // from class: d2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj4, Object obj5) {
                    switch (i8) {
                        case 0:
                            ((Integer) obj5).getClass();
                            AdsterUnifiedAd_androidKt.a(config, obj3, modifier, function2, function1, function0, onCrashLoggingRequired, (Composer) obj4, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                            break;
                        default:
                            ((Integer) obj5).getClass();
                            AdsterUnifiedAd_androidKt.a(config, obj3, modifier, function2, function1, function0, onCrashLoggingRequired, (Composer) obj4, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                            break;
                    }
                    return Unit.f17538a;
                }
            };
            scopeUpdateScopeEndRestartGroup.updateScope(function5);
        }
    }

    /* JADX WARN: Type inference failed for: r0v149, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v56, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v27, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r8v55, types: [java.lang.Object, kotlin.Lazy] */
    public static final void b(UnifiedAdRenderConfig unifiedAdRenderConfig, Modifier modifier, Function2 function2, Function1 function1, Function0 function0, Function1 function3, Composer composer, int i) {
        int i2;
        Modifier modifier2;
        String string;
        Object objA;
        int i3;
        Object obj;
        UnifiedBannerUiSpec unifiedBannerUiSpec;
        CoroutineContext coroutineContext;
        LifecycleOwner lifecycleOwner;
        FrameLayout frameLayout;
        String str;
        State state;
        MutableState mutableState;
        Context context;
        UnifiedAdDebugFixtureSelection unifiedAdDebugFixtureSelection;
        String str2;
        AdsterUnifiedDimens adsterUnifiedDimens;
        MutableState mutableState2;
        MutableIntState mutableIntState;
        MutableState mutableState3;
        State state2;
        MutableState mutableState4;
        FrameLayout frameLayout2;
        FrameLayout frameLayout3;
        String str3;
        MutableState mutableState5;
        MutableState mutableState6;
        MutableState mutableState7;
        State state3;
        AtomicBoolean atomicBoolean;
        MutableState mutableState8;
        FrameLayout frameLayout4;
        Composer composerStartRestartGroup = composer.startRestartGroup(-705283402);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(unifiedAdRenderConfig) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function3) ? 131072 : 65536;
        }
        if (composerStartRestartGroup.shouldExecute((74899 & i2) != 74898, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-705283402, i2, -1, "app.chalo.ads.AdsterUnifiedAdContent (AdsterUnifiedAd.android.kt:238)");
            }
            UnifiedAdSlotSpec unifiedAdSlotSpec = unifiedAdRenderConfig.f851a;
            UnifiedAdSlot unifiedAdSlot = unifiedAdSlotSpec.f852a;
            Context context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            final LifecycleOwner lifecycleOwner2 = (LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
            boolean zChanged = composerStartRestartGroup.changed(context2);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Context baseContext = context2;
                while (true) {
                    if (!(baseContext instanceof Activity)) {
                        if (!(baseContext instanceof ContextWrapper)) {
                            objRememberedValue = null;
                            break;
                        } else {
                            baseContext = ((ContextWrapper) baseContext).getBaseContext();
                            Intrinsics.h(baseContext, "getBaseContext(...)");
                        }
                    } else {
                        objRememberedValue = (Activity) baseContext;
                        break;
                    }
                }
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            Activity activity = (Activity) objRememberedValue;
            boolean zChanged2 = composerStartRestartGroup.changed(context2) | composerStartRestartGroup.changed(unifiedAdSlotSpec);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                Intrinsics.i(context2, "context");
                switch (WhenMappings.f737a[unifiedAdSlotSpec.f852a.ordinal()]) {
                    case 1:
                        string = context2.getString(R.string.live_tracking_anchored_adster_placement_name);
                        break;
                    case 2:
                        string = context2.getString(R.string.home_tab_unified_adster_placement_name);
                        break;
                    case 3:
                        string = context2.getString(R.string.regular_bus_tab_unified_adster_placement_name);
                        break;
                    case 4:
                        string = context2.getString(R.string.regular_bus_inline_adaptive_adster_placement_name);
                        break;
                    case 5:
                        string = context2.getString(R.string.stop_trip_details_unified_adster_placement_name);
                        break;
                    case 6:
                        string = context2.getString(R.string.bau_unified_medium_adster_placement_name);
                        break;
                    case 7:
                        string = context2.getString(R.string.trip_planner_results_unified_adster_placement_name);
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                Intrinsics.f(string);
                objRememberedValue2 = StringsKt.u0(string).toString();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            String str4 = (String) objRememberedValue2;
            State stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(function2, composerStartRestartGroup, (i2 >> 6) & 14);
            State stateRememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(function1, composerStartRestartGroup, (i2 >> 9) & 14);
            State stateRememberUpdatedState3 = SnapshotStateKt.rememberUpdatedState(function0, composerStartRestartGroup, (i2 >> 12) & 14);
            final State stateRememberUpdatedState4 = SnapshotStateKt.rememberUpdatedState(function3, composerStartRestartGroup, (i2 >> 15) & 14);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = (UnifiedAdLifecycleReporter) new AdsterUnifiedAdLifecycleReporterAccessor().f729a.getValue();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            UnifiedAdLifecycleReporter unifiedAdLifecycleReporter = (UnifiedAdLifecycleReporter) objRememberedValue3;
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            int i4 = i2;
            if (objRememberedValue4 == companion.getEmpty()) {
                try {
                    objA = (UnifiedAdFailureReporter) UnifiedAdFailureReporterHelper.f839a.getValue();
                } catch (Throwable th) {
                    objA = ResultKt.a(th);
                }
                Throwable thA = Result.a(objA);
                if (thA != null) {
                    String strF = Reflection.a(thA.getClass()).f();
                    String message = thA.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    ChaloLog.c("UnifiedAdFailureReporter", z40.g("reporter_resolution_failed:", strF, ":", message), thA);
                    objA = FallbackUnifiedAdFailureReporter.f782a;
                }
                objRememberedValue4 = (UnifiedAdFailureReporter) objA;
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            } else {
                unifiedAdLifecycleReporter = unifiedAdLifecycleReporter;
                unifiedAdSlot = unifiedAdSlot;
            }
            UnifiedAdFailureReporter unifiedAdFailureReporter = (UnifiedAdFailureReporter) objRememberedValue4;
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion2 = Composer.INSTANCE;
            if (objRememberedValue5 == companion2.getEmpty()) {
                objRememberedValue5 = new AdsterUnifiedAdTargetingHelper();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            AdsterUnifiedAdTargetingHelper adsterUnifiedAdTargetingHelper = (AdsterUnifiedAdTargetingHelper) objRememberedValue5;
            Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue6 == companion2.getEmpty()) {
                objRememberedValue6 = (AdsterSdkInitializer) new AdsterUnifiedInitAccessor().f742a.getValue();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
            }
            AdsterSdkInitializer adsterSdkInitializer = (AdsterSdkInitializer) objRememberedValue6;
            Object objRememberedValue7 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue7 == companion2.getEmpty()) {
                objRememberedValue7 = (UnifiedAdDebugFixtureResolver) new AdsterUnifiedDebugFixtureResolverAccessor().f739a.getValue();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
            }
            UnifiedAdDebugFixtureResolver unifiedAdDebugFixtureResolver = (UnifiedAdDebugFixtureResolver) objRememberedValue7;
            Object objRememberedValue8 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue8 == companion2.getEmpty()) {
                objRememberedValue8 = new AtomicBoolean(false);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
            }
            AtomicBoolean atomicBoolean2 = (AtomicBoolean) objRememberedValue8;
            int i5 = i4 & 14;
            boolean zChanged3 = (i5 == 4) | composerStartRestartGroup.changed(unifiedAdDebugFixtureResolver);
            Object objRememberedValue9 = composerStartRestartGroup.rememberedValue();
            if (zChanged3 || objRememberedValue9 == companion2.getEmpty()) {
                objRememberedValue9 = unifiedAdDebugFixtureResolver.a(unifiedAdRenderConfig);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
            }
            UnifiedAdDebugFixtureSelection unifiedAdDebugFixtureSelection2 = (UnifiedAdDebugFixtureSelection) objRememberedValue9;
            boolean zChanged4 = composerStartRestartGroup.changed(str4) | (i5 == 4) | composerStartRestartGroup.changed(unifiedAdDebugFixtureSelection2);
            Object objRememberedValue10 = composerStartRestartGroup.rememberedValue();
            if (zChanged4 || objRememberedValue10 == companion2.getEmpty()) {
                UnifiedAdDebugFixtureRequest unifiedAdDebugFixtureRequest = Intrinsics.d(unifiedAdDebugFixtureSelection2, UnifiedAdDebugFixtureSelection.Off.f834a) ? null : new UnifiedAdDebugFixtureRequest(str4, unifiedAdRenderConfig, unifiedAdDebugFixtureSelection2);
                composerStartRestartGroup.updateRememberedValue(unifiedAdDebugFixtureRequest);
                objRememberedValue10 = unifiedAdDebugFixtureRequest;
            }
            UnifiedAdDebugFixtureRequest unifiedAdDebugFixtureRequest2 = (UnifiedAdDebugFixtureRequest) objRememberedValue10;
            boolean zChanged5 = composerStartRestartGroup.changed(unifiedAdSlot.ordinal()) | composerStartRestartGroup.changed(str4);
            Object objRememberedValue11 = composerStartRestartGroup.rememberedValue();
            if (zChanged5 || objRememberedValue11 == companion2.getEmpty()) {
                objRememberedValue11 = SnapshotIntStateKt.mutableIntStateOf(0);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue11);
            }
            final MutableIntState mutableIntState2 = (MutableIntState) objRememberedValue11;
            Object objRememberedValue12 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue12 == companion2.getEmpty()) {
                MutableState mutableStateMutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(mutableStateMutableStateOf$default);
                objRememberedValue12 = mutableStateMutableStateOf$default;
            }
            final MutableState mutableState9 = (MutableState) objRememberedValue12;
            boolean zChanged6 = composerStartRestartGroup.changed(unifiedAdSlot.ordinal()) | composerStartRestartGroup.changed(str4);
            Object objRememberedValue13 = composerStartRestartGroup.rememberedValue();
            if (zChanged6 || objRememberedValue13 == companion2.getEmpty()) {
                MutableState mutableStateMutableStateOf$default2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(mutableStateMutableStateOf$default2);
                objRememberedValue13 = mutableStateMutableStateOf$default2;
            }
            final MutableState mutableState10 = (MutableState) objRememberedValue13;
            boolean zChanged7 = composerStartRestartGroup.changed(unifiedAdSlot.ordinal()) | composerStartRestartGroup.changed(str4);
            Object objRememberedValue14 = composerStartRestartGroup.rememberedValue();
            if (zChanged7 || objRememberedValue14 == companion2.getEmpty()) {
                MutableState mutableStateMutableStateOf$default3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(mutableStateMutableStateOf$default3);
                objRememberedValue14 = mutableStateMutableStateOf$default3;
            }
            final MutableState mutableState11 = (MutableState) objRememberedValue14;
            boolean zChanged8 = composerStartRestartGroup.changed(unifiedAdSlot.ordinal()) | composerStartRestartGroup.changed(str4);
            Object objRememberedValue15 = composerStartRestartGroup.rememberedValue();
            if (zChanged8 || objRememberedValue15 == companion2.getEmpty()) {
                MutableState mutableStateMutableStateOf$default4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(mutableStateMutableStateOf$default4);
                objRememberedValue15 = mutableStateMutableStateOf$default4;
            }
            final MutableState mutableState12 = (MutableState) objRememberedValue15;
            Object objRememberedValue16 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue16 == companion2.getEmpty()) {
                i3 = 0;
                objRememberedValue16 = SnapshotIntStateKt.mutableIntStateOf(0);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue16);
            } else {
                i3 = 0;
            }
            final MutableIntState mutableIntState3 = (MutableIntState) objRememberedValue16;
            Object objRememberedValue17 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue17 == companion2.getEmpty()) {
                objRememberedValue17 = SnapshotIntStateKt.mutableIntStateOf(i3);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue17);
            }
            final MutableIntState mutableIntState4 = (MutableIntState) objRememberedValue17;
            boolean zChanged9 = composerStartRestartGroup.changed(unifiedAdSlot.ordinal()) | composerStartRestartGroup.changed(str4);
            Object objRememberedValue18 = composerStartRestartGroup.rememberedValue();
            if (zChanged9 || objRememberedValue18 == companion2.getEmpty()) {
                objRememberedValue18 = new UnifiedAdDebugFixtureLifecycleTracker();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue18);
            }
            final UnifiedAdDebugFixtureLifecycleTracker unifiedAdDebugFixtureLifecycleTracker = (UnifiedAdDebugFixtureLifecycleTracker) objRememberedValue18;
            boolean zChanged10 = composerStartRestartGroup.changed(context2);
            Object objRememberedValue19 = composerStartRestartGroup.rememberedValue();
            if (zChanged10 || objRememberedValue19 == companion2.getEmpty()) {
                obj = objRememberedValue19;
                FrameLayout frameLayout5 = new FrameLayout(context2);
                frameLayout5.setClipChildren(true);
                frameLayout5.setClipToPadding(true);
                frameLayout5.setDescendantFocusability(393216);
                composerStartRestartGroup.updateRememberedValue(frameLayout5);
                obj = frameLayout5;
            }
            obj = objRememberedValue19;
            final FrameLayout frameLayout6 = (FrameLayout) obj;
            boolean zChanged11 = composerStartRestartGroup.changed(unifiedAdSlot.ordinal()) | composerStartRestartGroup.changed(str4);
            Object objRememberedValue20 = composerStartRestartGroup.rememberedValue();
            if (zChanged11 || objRememberedValue20 == companion2.getEmpty()) {
                objRememberedValue20 = "adster unified slot=" + unifiedAdSlot.name() + " placement=" + str4;
                composerStartRestartGroup.updateRememberedValue(objRememberedValue20);
            }
            String str5 = (String) objRememberedValue20;
            boolean zChanged12 = composerStartRestartGroup.changed(unifiedAdSlot.ordinal()) | composerStartRestartGroup.changed(str4) | composerStartRestartGroup.changed(str5);
            Object objRememberedValue21 = composerStartRestartGroup.rememberedValue();
            if (zChanged12 || objRememberedValue21 == companion2.getEmpty()) {
                objRememberedValue21 = new UnifiedAdLifecycleContext(str4, UnifiedAdFailureReportingKt.a(unifiedAdSlot), str5);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue21);
            }
            UnifiedAdLifecycleContext unifiedAdLifecycleContext = (UnifiedAdLifecycleContext) objRememberedValue21;
            boolean zChanged13 = composerStartRestartGroup.changed(context2);
            Object objRememberedValue22 = composerStartRestartGroup.rememberedValue();
            if (zChanged13 || objRememberedValue22 == companion2.getEmpty()) {
                Intrinsics.i(context2, "<this>");
                objRememberedValue22 = new AdsterUnifiedDimens(o(context2, R.dimen.adster_unified_anchored_height), o(context2, R.dimen.adster_unified_home_inline_banner_height), o(context2, R.dimen.adster_unified_home_inline_native_wide_media_height), o(context2, R.dimen.adster_unified_home_inline_native_split_media_height), o(context2, R.dimen.adster_unified_home_inline_native_split_height), o(context2, R.dimen.adster_unified_home_inline_native_wide_height), o(context2, R.dimen.adster_unified_medium_fixed_height), o(context2, R.dimen.adster_unified_medium_fixed_height_media_height));
                composerStartRestartGroup.updateRememberedValue(objRememberedValue22);
            }
            AdsterUnifiedDimens adDimens = (AdsterUnifiedDimens) objRememberedValue22;
            boolean zChanged14 = composerStartRestartGroup.changed(unifiedAdSlot.ordinal()) | composerStartRestartGroup.changed(adDimens);
            Object objRememberedValue23 = composerStartRestartGroup.rememberedValue();
            if (zChanged14 || objRememberedValue23 == companion2.getEmpty()) {
                Intrinsics.i(adDimens, "adDimens");
                int i6 = adDimens.b;
                int i7 = adDimens.f741a;
                switch (WhenMappings.f737a[unifiedAdSlot.ordinal()]) {
                    case 1:
                        str5 = str5;
                        context2 = context2;
                        objRememberedValue23 = new UnifiedBannerUiSpec(i7, 17, false, true);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue23);
                        break;
                    case 2:
                        unifiedBannerUiSpec = new UnifiedBannerUiSpec(i6, 49, true, false);
                        objRememberedValue23 = unifiedBannerUiSpec;
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue23);
                        break;
                    case 3:
                    case 4:
                        unifiedBannerUiSpec = new UnifiedBannerUiSpec(i6, 49, true, false);
                        objRememberedValue23 = unifiedBannerUiSpec;
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue23);
                        break;
                    case 5:
                    case 6:
                        str5 = str5;
                        context2 = context2;
                        objRememberedValue23 = new UnifiedBannerUiSpec(i7, 17, true, true);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue23);
                        break;
                    case 7:
                        str5 = str5;
                        context2 = context2;
                        objRememberedValue23 = new UnifiedBannerUiSpec(i7, 17, false, true);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue23);
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            } else {
                str5 = str5;
                context2 = context2;
            }
            UnifiedBannerUiSpec unifiedBannerUiSpec2 = (UnifiedBannerUiSpec) objRememberedValue23;
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(unifiedAdDebugFixtureSelection2) | composerStartRestartGroup.changedInstance(adsterSdkInitializer);
            Object objRememberedValue24 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue24 == companion2.getEmpty()) {
                coroutineContext = null;
                objRememberedValue24 = new AdsterUnifiedAd_androidKt$AdsterUnifiedAdContent$1$1(unifiedAdDebugFixtureSelection2, adsterSdkInitializer, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue24);
            } else {
                coroutineContext = null;
            }
            EffectsKt.LaunchedEffect(adsterSdkInitializer, unifiedAdDebugFixtureSelection2, (Function2) objRememberedValue24, composerStartRestartGroup, 0);
            State stateCollectAsState = SnapshotStateKt.collectAsState(adsterSdkInitializer.f, coroutineContext, composerStartRestartGroup, 0, 1);
            final String str6 = str5;
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(lifecycleOwner2) | composerStartRestartGroup.changed(mutableIntState2) | composerStartRestartGroup.changed(mutableState12) | composerStartRestartGroup.changed(mutableState11) | composerStartRestartGroup.changedInstance(frameLayout6) | composerStartRestartGroup.changed(stateRememberUpdatedState4) | composerStartRestartGroup.changed(mutableState10) | composerStartRestartGroup.changedInstance(unifiedAdDebugFixtureLifecycleTracker) | composerStartRestartGroup.changed(str6);
            Object objRememberedValue25 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || objRememberedValue25 == companion2.getEmpty()) {
                objRememberedValue25 = new Function1() { // from class: e2
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.LifecycleObserver, h2] */
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        DisposableEffectScope DisposableEffect = (DisposableEffectScope) obj2;
                        Intrinsics.i(DisposableEffect, "$this$DisposableEffect");
                        final Lifecycle lifecycle = lifecycleOwner2.getLifecycle();
                        final MutableIntState mutableIntState5 = mutableIntState4;
                        final FrameLayout frameLayout7 = frameLayout6;
                        final UnifiedAdDebugFixtureLifecycleTracker unifiedAdDebugFixtureLifecycleTracker2 = unifiedAdDebugFixtureLifecycleTracker;
                        final String str7 = str6;
                        final MutableIntState mutableIntState6 = mutableIntState3;
                        final MutableIntState mutableIntState7 = mutableIntState2;
                        final MutableState mutableState13 = mutableState12;
                        final MutableState mutableState14 = mutableState11;
                        final MutableState mutableState15 = mutableState9;
                        final State state4 = stateRememberUpdatedState4;
                        final MutableState mutableState16 = mutableState10;
                        final ?? r0 = new LifecycleEventObserver() { // from class: h2
                            @Override // androidx.lifecycle.LifecycleEventObserver
                            public final void onStateChanged(LifecycleOwner lifecycleOwner3, Lifecycle.Event event) {
                                Intrinsics.i(lifecycleOwner3, "<unused var>");
                                Intrinsics.i(event, "event");
                                int i8 = AdsterUnifiedAd_androidKt.WhenMappings.b[event.ordinal()];
                                if (i8 == 1) {
                                    MutableIntState mutableIntState8 = mutableIntState5;
                                    mutableIntState8.setIntValue(mutableIntState8.getIntValue() + 1);
                                    return;
                                }
                                if (i8 == 2 || i8 == 3) {
                                    String strName = event.name();
                                    MutableIntState mutableIntState9 = mutableIntState6;
                                    mutableIntState9.setIntValue(mutableIntState9.getIntValue() + 1);
                                    mutableIntState7.setIntValue(0);
                                    AdsterUnifiedAd_androidKt.g(mutableState13, false);
                                    AdsterUnifiedAd_androidKt.f(mutableState14, false);
                                    frameLayout7.removeAllViews();
                                    MutableState mutableState17 = mutableState15;
                                    AdsterUnifiedAd_androidKt.n(mutableState17.getValue(), (Function1) state4.getValue());
                                    mutableState17.setValue(null);
                                    mutableState16.setValue(null);
                                    UnifiedAdDebugFixtureLifecycleTracker unifiedAdDebugFixtureLifecycleTracker3 = unifiedAdDebugFixtureLifecycleTracker2;
                                    unifiedAdDebugFixtureLifecycleTracker3.f829a = null;
                                    unifiedAdDebugFixtureLifecycleTracker3.b = false;
                                    String message2 = str7 + " host invalidated reason=" + strName;
                                    Intrinsics.i(message2, "message");
                                }
                            }
                        };
                        lifecycle.addObserver(r0);
                        return new DisposableEffectResult() { // from class: app.chalo.ads.AdsterUnifiedAd_androidKt$AdsterUnifiedAdContent$lambda$44$0$$inlined$onDispose$1
                            @Override // androidx.compose.runtime.DisposableEffectResult
                            public final void dispose() {
                                lifecycle.removeObserver(r0);
                            }
                        };
                    }
                };
                lifecycleOwner = lifecycleOwner2;
                frameLayout = frameLayout6;
                str = str6;
                mutableIntState3 = mutableIntState3;
                state = stateRememberUpdatedState4;
                mutableState = mutableState10;
                composerStartRestartGroup.updateRememberedValue(objRememberedValue25);
            } else {
                frameLayout = frameLayout6;
                mutableState = mutableState10;
                lifecycleOwner = lifecycleOwner2;
                str = str6;
                state = stateRememberUpdatedState4;
            }
            EffectsKt.DisposableEffect(lifecycleOwner, frameLayout, (Function1) objRememberedValue25, composerStartRestartGroup, 0);
            Integer numValueOf = Integer.valueOf(mutableIntState4.getIntValue());
            MutableState mutableState13 = mutableState;
            boolean zChangedInstance3 = composerStartRestartGroup.changedInstance(unifiedAdDebugFixtureRequest2) | composerStartRestartGroup.changedInstance(unifiedAdDebugFixtureLifecycleTracker) | composerStartRestartGroup.changed(mutableState11) | composerStartRestartGroup.changed(mutableIntState2) | composerStartRestartGroup.changed(mutableState12) | composerStartRestartGroup.changed(state) | composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changedInstance(frameLayout) | composerStartRestartGroup.changedInstance(unifiedAdDebugFixtureSelection2) | composerStartRestartGroup.changed(stateRememberUpdatedState2) | composerStartRestartGroup.changed(str) | composerStartRestartGroup.changedInstance(context2) | composerStartRestartGroup.changed(unifiedAdSlot.ordinal()) | composerStartRestartGroup.changed(adDimens) | composerStartRestartGroup.changed(stateRememberUpdatedState) | composerStartRestartGroup.changedInstance(atomicBoolean2) | composerStartRestartGroup.changed(stateRememberUpdatedState3);
            Object objRememberedValue26 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance3 || objRememberedValue26 == companion2.getEmpty()) {
                context = context2;
                State state4 = state;
                FrameLayout frameLayout7 = frameLayout;
                String str7 = str;
                UnifiedAdSlot unifiedAdSlot2 = unifiedAdSlot;
                MutableIntState mutableIntState5 = mutableIntState3;
                objRememberedValue26 = new AdsterUnifiedAd_androidKt$AdsterUnifiedAdContent$3$1(unifiedAdDebugFixtureRequest2, unifiedAdDebugFixtureLifecycleTracker, frameLayout7, unifiedAdDebugFixtureSelection2, str7, context, unifiedAdSlot2, adDimens, atomicBoolean2, mutableIntState5, mutableState11, mutableIntState2, mutableState12, mutableState9, state4, mutableState13, stateRememberUpdatedState2, stateRememberUpdatedState, stateRememberUpdatedState3, null);
                unifiedAdDebugFixtureSelection = unifiedAdDebugFixtureSelection2;
                str2 = str7;
                adsterUnifiedDimens = adDimens;
                mutableIntState3 = mutableIntState5;
                mutableState2 = mutableState11;
                mutableIntState = mutableIntState2;
                mutableState3 = mutableState12;
                mutableState9 = mutableState9;
                state2 = state4;
                mutableState4 = mutableState13;
                frameLayout2 = frameLayout7;
                unifiedAdSlot = unifiedAdSlot2;
                atomicBoolean2 = atomicBoolean2;
                composerStartRestartGroup.updateRememberedValue(objRememberedValue26);
            } else {
                mutableState2 = mutableState11;
                str2 = str;
                mutableState4 = mutableState13;
                adsterUnifiedDimens = adDimens;
                context = context2;
                frameLayout2 = frameLayout;
                mutableIntState = mutableIntState2;
                unifiedAdDebugFixtureSelection = unifiedAdDebugFixtureSelection2;
                state2 = state;
                mutableState3 = mutableState12;
            }
            Context context3 = context;
            EffectsKt.LaunchedEffect(unifiedAdDebugFixtureRequest2, numValueOf, (Function2) objRememberedValue26, composerStartRestartGroup, 0);
            Object[] objArr = {(AdsterSdkInitState) stateCollectAsState.getValue(), str4, unifiedAdRenderConfig, unifiedAdDebugFixtureSelection, Integer.valueOf(mutableIntState4.getIntValue())};
            boolean zChangedInstance4 = composerStartRestartGroup.changedInstance(unifiedAdDebugFixtureSelection) | composerStartRestartGroup.changed(stateCollectAsState) | composerStartRestartGroup.changed(mutableState2) | composerStartRestartGroup.changed(mutableIntState) | composerStartRestartGroup.changed(mutableState3) | composerStartRestartGroup.changed(state2) | composerStartRestartGroup.changed(mutableState4) | composerStartRestartGroup.changedInstance(frameLayout2) | composerStartRestartGroup.changedInstance(unifiedAdFailureReporter) | composerStartRestartGroup.changed(unifiedAdSlot.ordinal()) | composerStartRestartGroup.changed(str4) | composerStartRestartGroup.changed(str2) | composerStartRestartGroup.changed(r33) | composerStartRestartGroup.changedInstance(activity) | composerStartRestartGroup.changedInstance(lifecycleOwner) | composerStartRestartGroup.changedInstance(adsterUnifiedAdTargetingHelper);
            LifecycleOwner lifecycleOwner3 = lifecycleOwner;
            UnifiedAdLifecycleReporter unifiedAdLifecycleReporter2 = unifiedAdLifecycleReporter;
            AdsterUnifiedDimens adsterUnifiedDimens2 = adsterUnifiedDimens;
            boolean zChangedInstance5 = zChangedInstance4 | composerStartRestartGroup.changedInstance(context3) | composerStartRestartGroup.changedInstance(atomicBoolean2) | composerStartRestartGroup.changed(unifiedAdSlotSpec) | composerStartRestartGroup.changed(unifiedBannerUiSpec2) | composerStartRestartGroup.changed(stateRememberUpdatedState) | composerStartRestartGroup.changedInstance(unifiedAdLifecycleReporter2) | composerStartRestartGroup.changedInstance(unifiedAdLifecycleContext) | composerStartRestartGroup.changed(stateRememberUpdatedState3) | composerStartRestartGroup.changed(adsterUnifiedDimens2);
            Object objRememberedValue27 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance5 || objRememberedValue27 == companion2.getEmpty()) {
                MutableState mutableState14 = mutableState3;
                MutableState mutableState15 = mutableState2;
                String str8 = str2;
                FrameLayout frameLayout8 = frameLayout2;
                MutableIntState mutableIntState6 = mutableIntState3;
                MutableState mutableState16 = mutableState9;
                UnifiedAdSlot unifiedAdSlot3 = unifiedAdSlot;
                State state5 = state2;
                AtomicBoolean atomicBoolean3 = atomicBoolean2;
                objRememberedValue27 = new AdsterUnifiedAd_androidKt$AdsterUnifiedAdContent$4$1(unifiedAdDebugFixtureSelection, frameLayout8, unifiedAdFailureReporter, unifiedAdSlot3, str4, str8, mutableIntState6, stateCollectAsState, mutableState15, mutableIntState, mutableState14, mutableState16, state5, mutableState4, stateRememberUpdatedState2, activity, lifecycleOwner3, adsterUnifiedAdTargetingHelper, context3, unifiedAdLifecycleReporter2, unifiedAdLifecycleContext, unifiedBannerUiSpec2, atomicBoolean3, unifiedAdSlotSpec, stateRememberUpdatedState, stateRememberUpdatedState3, adsterUnifiedDimens2, null);
                frameLayout3 = frameLayout8;
                str3 = str8;
                mutableIntState3 = mutableIntState6;
                mutableState5 = mutableState15;
                mutableState6 = mutableState14;
                mutableState7 = mutableState16;
                state3 = state5;
                atomicBoolean = atomicBoolean3;
                composerStartRestartGroup.updateRememberedValue(objRememberedValue27);
            } else {
                mutableState6 = mutableState3;
                state3 = state2;
                str3 = str2;
                frameLayout3 = frameLayout2;
                mutableState7 = mutableState9;
                mutableState5 = mutableState2;
                atomicBoolean = atomicBoolean2;
            }
            EffectsKt.LaunchedEffect(objArr, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue27, composerStartRestartGroup, 0);
            modifier2 = modifier;
            Modifier modifierClipToBounds = ClipKt.clipToBounds(SizeKt.m814height3ABfNKs(SizeKt.fillMaxWidth$default(modifier2, 0.0f, 1, null), Dp.m7278constructorimpl(mutableIntState.getIntValue())));
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            MutableState mutableState17 = mutableState7;
            int i8 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierClipToBounds);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3915constructorimpl = Updater.m3915constructorimpl(composerStartRestartGroup);
            pk0.v(companion3, composerM3915constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl, Integer.valueOf(i8), composerM3915constructorimpl));
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            boolean zChangedInstance6 = composerStartRestartGroup.changedInstance(frameLayout3);
            Object objRememberedValue28 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance6 || objRememberedValue28 == companion2.getEmpty()) {
                objRememberedValue28 = new defpackage.g(frameLayout3, 2);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue28);
            }
            Function1 function4 = (Function1) objRememberedValue28;
            boolean zChanged15 = composerStartRestartGroup.changed(mutableIntState) | composerStartRestartGroup.changed(mutableState5);
            Object objRememberedValue29 = composerStartRestartGroup.rememberedValue();
            if (zChanged15 || objRememberedValue29 == companion2.getEmpty()) {
                objRememberedValue29 = new defpackage.f(1, mutableIntState, mutableState5);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue29);
            }
            AndroidView_androidKt.AndroidView(function4, modifierFillMaxWidth$default, (Function1) objRememberedValue29, composerStartRestartGroup, 48, 0);
            composerStartRestartGroup.endNode();
            T value = mutableState17.getValue();
            boolean zChanged16 = composerStartRestartGroup.changed(state3);
            Object objRememberedValue30 = composerStartRestartGroup.rememberedValue();
            if (zChanged16 || objRememberedValue30 == companion2.getEmpty()) {
                mutableState8 = mutableState17;
                objRememberedValue30 = new defpackage.f(2, mutableState8, state3);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue30);
            } else {
                mutableState8 = mutableState17;
            }
            LifecycleEffectKt.LifecycleResumeEffect(value, (LifecycleOwner) null, (Function1<? super LifecycleResumePauseEffectScope, ? extends LifecyclePauseOrDisposeEffectResult>) objRememberedValue30, composerStartRestartGroup, 0, 2);
            boolean zChangedInstance7 = composerStartRestartGroup.changedInstance(atomicBoolean) | composerStartRestartGroup.changed(mutableIntState) | composerStartRestartGroup.changed(mutableState6) | composerStartRestartGroup.changed(str3) | composerStartRestartGroup.changedInstance(frameLayout3) | composerStartRestartGroup.changed(state3) | composerStartRestartGroup.changed(mutableState4);
            Object objRememberedValue31 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance7 || objRememberedValue31 == companion2.getEmpty()) {
                final MutableState mutableState18 = mutableState8;
                final FrameLayout frameLayout9 = frameLayout3;
                final State state6 = state3;
                final MutableState mutableState19 = mutableState6;
                final MutableState mutableState20 = mutableState4;
                final AtomicBoolean atomicBoolean4 = atomicBoolean;
                final String str9 = str3;
                final MutableIntState mutableIntState7 = mutableIntState;
                objRememberedValue31 = new Function1() { // from class: f2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        DisposableEffectScope DisposableEffect = (DisposableEffectScope) obj2;
                        Intrinsics.i(DisposableEffect, "$this$DisposableEffect");
                        final AtomicBoolean atomicBoolean5 = atomicBoolean4;
                        atomicBoolean5.set(false);
                        final String str10 = str9;
                        final FrameLayout frameLayout10 = frameLayout9;
                        final MutableIntState mutableIntState8 = mutableIntState3;
                        final MutableIntState mutableIntState9 = mutableIntState7;
                        final MutableState mutableState21 = mutableState19;
                        final MutableState mutableState22 = mutableState18;
                        final State state7 = state6;
                        final MutableState mutableState23 = mutableState20;
                        return new DisposableEffectResult() { // from class: app.chalo.ads.AdsterUnifiedAd_androidKt$AdsterUnifiedAdContent$lambda$49$0$$inlined$onDispose$1
                            @Override // androidx.compose.runtime.DisposableEffectResult
                            public final void dispose() {
                                atomicBoolean5.set(true);
                                MutableIntState mutableIntState10 = mutableIntState8;
                                mutableIntState10.setIntValue(mutableIntState10.getIntValue() + 1);
                                mutableIntState9.setIntValue(0);
                                AdsterUnifiedAd_androidKt.g(mutableState21, false);
                                String message2 = str10 + " dispose";
                                Intrinsics.i(message2, "message");
                                frameLayout10.removeAllViews();
                                MutableState mutableState24 = mutableState22;
                                AdsterUnifiedAd_androidKt.n(mutableState24.getValue(), (Function1) state7.getValue());
                                mutableState24.setValue(null);
                                mutableState23.setValue(null);
                            }
                        };
                    }
                };
                frameLayout4 = frameLayout9;
                composerStartRestartGroup.updateRememberedValue(objRememberedValue31);
            } else {
                frameLayout4 = frameLayout3;
            }
            EffectsKt.DisposableEffect(frameLayout4, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue31, composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            modifier2 = modifier;
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new g2((Object) unifiedAdRenderConfig, modifier2, function2, function1, function0, function3, i, 0));
        }
    }

    public static final UnifiedAdHostState c(Activity activity, LifecycleOwner lifecycleOwner, FrameLayout container) {
        Lifecycle.State lifecycleState = lifecycleOwner.getLifecycle().getState();
        Intrinsics.i(lifecycleState, "lifecycleState");
        Intrinsics.i(container, "container");
        return new UnifiedAdHostState((activity == null || activity.isFinishing() || activity.isDestroyed()) ? false : true, lifecycleState.isAtLeast(Lifecycle.State.STARTED), container.getWindowToken() != null);
    }

    public static final boolean d(AtomicBoolean atomicBoolean, MutableIntState mutableIntState, Activity activity, LifecycleOwner lifecycleOwner, FrameLayout frameLayout, int i, boolean z) {
        if (!atomicBoolean.get() && i == mutableIntState.getIntValue()) {
            UnifiedAdHostState unifiedAdHostStateC = c(activity, lifecycleOwner, frameLayout);
            boolean z2 = unifiedAdHostStateC.b;
            boolean z3 = unifiedAdHostStateC.f841a;
            if (z) {
                if (z3 && z2 && unifiedAdHostStateC.c) {
                    return true;
                }
            } else if (z3 && z2) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean e(MutableState mutableState) {
        return ((Boolean) mutableState.getValue()).booleanValue();
    }

    public static final void f(MutableState mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    public static final void g(MutableState mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    public static final boolean h(UnifiedAdSlotSpec unifiedAdSlotSpec, UnifiedAdFailureReporter unifiedAdFailureReporter, String str, FrameLayout frameLayout, UnifiedAdSlot unifiedAdSlot, String str2, MutableState mutableState, State state, MutableState mutableState2, State state2, UnifiedAdCreativeType creativeType, Function0 function0) {
        Intrinsics.i(unifiedAdSlotSpec, "<this>");
        Intrinsics.i(creativeType, "creativeType");
        if (UnifiedAdCapability_androidKt.f828a.contains(creativeType)) {
            mutableState.setValue(creativeType);
            return true;
        }
        p(unifiedAdFailureReporter, (Function1) state.getValue(), str, frameLayout, new c2(mutableState2, mutableState, 0), unifiedAdSlot, str2, -1003, vo1.m("unsupported_creative_type:", creativeType.name()), creativeType.getAnalyticsValue(), (Function1) state2.getValue(), function0);
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:106:0x021b  */
    /* JADX WARN: Code duplicated, block: B:20:0x0053  */
    /* JADX WARN: Code duplicated, block: B:32:0x007b  */
    public static final NativeBindingResult i(Context context, FrameLayout frameLayout, MediationNativeAd mediationNativeAd, String str, UnifiedAdSlot unifiedAdSlot, AdsterUnifiedDimens adsterUnifiedDimens, q2 q2Var) {
        MediaContent mediaContent;
        Float fValueOf;
        Float fValueOf2;
        NativeMediaRatioResolution nativeMediaRatioResolution;
        String strValueOf;
        Object objA;
        Object objA2;
        String scheme;
        String host;
        HomeInlineTemplateLayoutConfig homeInlineTemplateLayoutConfig;
        HomeInlineTemplateBindResult homeInlineTemplateBindResultC;
        HomeInlineTemplateViews homeInlineTemplateViews;
        String headLine = mediationNativeAd.getHeadLine();
        if (headLine == null) {
            headLine = "";
        }
        String string = StringsKt.u0(headLine).toString();
        String callToAction = mediationNativeAd.getCallToAction();
        if (callToAction == null) {
            callToAction = "";
        }
        String string2 = StringsKt.u0(callToAction).toString();
        if (StringsKt.F(string) || StringsKt.F(string2)) {
            ChaloLog.c("AdsterUnifiedAd", str + " native missing headline/cta", null);
            return new NativeBindingResult(false, 0, NativeBindingFailureReason.MISSING_REQUIRED_FIELDS);
        }
        Float aspectRatio = mediationNativeAd.getAspectRatio();
        if (aspectRatio != null) {
            float fFloatValue = aspectRatio.floatValue();
            if (Math.abs(fFloatValue) > Float.MAX_VALUE || fFloatValue <= 0.0f) {
                aspectRatio = null;
            }
        } else {
            aspectRatio = null;
        }
        if (aspectRatio != null) {
            nativeMediaRatioResolution = new NativeMediaRatioResolution("native_ad_field", aspectRatio);
        } else {
            View mediaView = mediationNativeAd.getMediaView();
            if (mediaView == null) {
                nativeMediaRatioResolution = new NativeMediaRatioResolution("missing_media_view", null);
            } else {
                MediaView mediaView2 = mediaView instanceof MediaView ? (MediaView) mediaView : null;
                if (mediaView2 == null || (mediaContent = mediaView2.getMediaContent()) == null) {
                    fValueOf = null;
                } else {
                    float aspectRatio2 = mediaContent.getAspectRatio();
                    fValueOf = Float.valueOf(aspectRatio2);
                    if (Math.abs(aspectRatio2) > Float.MAX_VALUE || aspectRatio2 <= 0.0f) {
                        fValueOf = null;
                    }
                }
                if (fValueOf != null) {
                    nativeMediaRatioResolution = new NativeMediaRatioResolution("sdk_media_content", fValueOf);
                } else {
                    Pair pair = new Pair(Integer.valueOf(mediaView.getWidth()), Integer.valueOf(mediaView.getHeight()));
                    Pair pair2 = new Pair(Integer.valueOf(mediaView.getMeasuredWidth()), Integer.valueOf(mediaView.getMeasuredHeight()));
                    ViewGroup.LayoutParams layoutParams = mediaView.getLayoutParams();
                    Integer numValueOf = Integer.valueOf(layoutParams != null ? layoutParams.width : 0);
                    ViewGroup.LayoutParams layoutParams2 = mediaView.getLayoutParams();
                    Iterator it = CollectionsKt.S(pair, pair2, new Pair(numValueOf, Integer.valueOf(layoutParams2 != null ? layoutParams2.height : 0))).iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            fValueOf2 = null;
                            break;
                        }
                        Pair pair3 = (Pair) it.next();
                        int iIntValue = ((Number) pair3.getFirst()).intValue();
                        int iIntValue2 = ((Number) pair3.getSecond()).intValue();
                        if (iIntValue > 0 && iIntValue2 > 0) {
                            float f = iIntValue / iIntValue2;
                            if (Math.abs(f) <= Float.MAX_VALUE && f > 0.0f) {
                                fValueOf2 = Float.valueOf(f);
                                break;
                            }
                        }
                    }
                    nativeMediaRatioResolution = fValueOf2 != null ? new NativeMediaRatioResolution("view_dimensions", fValueOf2) : new NativeMediaRatioResolution("unavailable", null);
                }
            }
        }
        Float f2 = nativeMediaRatioResolution.f819a;
        HomeInlineTemplateLayoutConfig homeInlineTemplateLayoutConfigR = r(unifiedAdSlot, f2, adsterUnifiedDimens);
        int i = homeInlineTemplateLayoutConfigR.b;
        if (f2 == null || (strValueOf = String.valueOf(f2.floatValue())) == null) {
            strValueOf = "null";
        }
        String str2 = strValueOf;
        String strQ = q(unifiedAdSlot, f2);
        int i2 = homeInlineTemplateLayoutConfigR.f787a;
        try {
            objA = context.getResources().getResourceEntryName(i2);
        } catch (Throwable th) {
            objA = ResultKt.a(th);
        }
        if (Result.a(objA) != null) {
            objA = String.valueOf(i2);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" native layoutSelection ratio=");
        sb.append(str2);
        sb.append(" ratioSource=");
        sb.append(nativeMediaRatioResolution.b);
        cb0.t(sb, " variant=", strQ, " layout=", (String) objA);
        sb.append(" heightDp=");
        sb.append(i);
        String message = sb.toString();
        Intrinsics.i(message, "message");
        Double starRating = mediationNativeAd.getStarRating();
        String body = mediationNativeAd.getBody();
        if (body == null) {
            body = "";
        }
        String string3 = StringsKt.u0(body).toString();
        boolean z = UnifiedAdSlotSpecKt.a(unifiedAdSlot).e != UnifiedAdVisualTreatment.MEDIUM_FIXED_HEIGHT;
        boolean z2 = z && starRating != null && starRating.doubleValue() > 0.0d;
        boolean z3 = z && !StringsKt.F(string3);
        String logo = mediationNativeAd.getLogo();
        String string4 = StringsKt.u0(StringsKt.u0(logo != null ? logo : "").toString()).toString();
        if (StringsKt.F(string4) || StringsKt.n(string4, ' ')) {
            string4 = null;
        } else {
            try {
                objA2 = Uri.parse(string4);
            } catch (Throwable th2) {
                objA2 = ResultKt.a(th2);
            }
            if (objA2 instanceof Result.Failure) {
                objA2 = null;
            }
            Uri uri = (Uri) objA2;
            if (uri == null || (scheme = uri.getScheme()) == null) {
                string4 = null;
            } else {
                String lowerCase = scheme.toLowerCase(Locale.ROOT);
                Intrinsics.h(lowerCase, "toLowerCase(...)");
                if ((!lowerCase.equals(ProxyConfig.MATCH_HTTP) && !lowerCase.equals("https")) || (host = uri.getHost()) == null || StringsKt.F(host)) {
                    string4 = null;
                }
            }
        }
        boolean z4 = string4 != null;
        if (!z4) {
            String message2 = str + " native missing icon; rendering without icon";
            Intrinsics.i(message2, "message");
        }
        if (z2 == 0 && !z3) {
            String message3 = str + " native missing both body and star rating; rendering headline + CTA only";
            Intrinsics.i(message3, "message");
        }
        MediationNativeAdView mediationNativeAdView = new MediationNativeAdView(context, null, 0, 6, null);
        String str3 = z3 ? string3 : null;
        if (starRating != null) {
            homeInlineTemplateLayoutConfig = homeInlineTemplateLayoutConfigR;
            Float fValueOf3 = z2 ? Float.valueOf((float) starRating.doubleValue()) : null;
            HomeInlineTemplateLayoutConfig homeInlineTemplateLayoutConfig2 = homeInlineTemplateLayoutConfig;
            homeInlineTemplateBindResultC = HomeInlineNativeTemplateBinder_androidKt.c(context, mediationNativeAdView, homeInlineTemplateLayoutConfig, new HomeInlineTemplateContent(string, string2, str3, fValueOf3, z4), new k2(string4, 0), new defpackage.f(3, mediationNativeAd, context), new i2(context, homeInlineTemplateLayoutConfig2, f2, str, 1));
            boolean z5 = homeInlineTemplateBindResultC.d;
            if (homeInlineTemplateBindResultC.f785a || (homeInlineTemplateViews = homeInlineTemplateBindResultC.b) == null) {
                return new NativeBindingResult(false, 0, NativeBindingFailureReason.MISSING_REQUIRED_FIELDS);
            }
            TextView textView = homeInlineTemplateViews.b;
            TextView textView2 = homeInlineTemplateViews.c;
            RatingBar ratingBar = homeInlineTemplateViews.d;
            TextView textView3 = homeInlineTemplateViews.e;
            ImageView imageView = homeInlineTemplateViews.f;
            FrameLayout frameLayout2 = homeInlineTemplateViews.h;
            mediationNativeAdView.setHeadlineView(textView);
            mediationNativeAdView.setBodyView(textView2);
            mediationNativeAdView.setCtaView(textView3);
            mediationNativeAdView.setLogoView(z5 ? imageView : null);
            mediationNativeAdView.setRatingBarView(ratingBar);
            HashMap map = new HashMap(6);
            map.put("headline", textView);
            map.put(InMobiNetworkValues.CTA, textView3);
            if (z5) {
                map.put(InMobiNetworkValues.ICON, imageView);
            }
            if (textView2.getVisibility() == 0) {
                map.put(TtmlNode.TAG_BODY, textView2);
            }
            if (ratingBar.getVisibility() == 0) {
                map.put("starRating", ratingBar);
            }
            boolean z6 = homeInlineTemplateLayoutConfig2.c != null;
            View mediaView3 = mediationNativeAd.getMediaView();
            if (mediaView3 != null) {
                if (frameLayout2 != null) {
                    ViewParent parent = mediaView3.getParent();
                    ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                    if (viewGroup != null) {
                        viewGroup.removeView(mediaView3);
                    }
                    frameLayout2.removeAllViews();
                    frameLayout2.addView(mediaView3, new FrameLayout.LayoutParams(-1, -1));
                    frameLayout2.post(new j2(1, (Object) str, (Object) frameLayout2, (Object) mediaView3));
                }
                mediationNativeAdView.setMediaView(mediaView3);
                map.put("media", mediaView3);
            } else {
                if (z6) {
                    ChaloLog.c("AdsterUnifiedAd", str + " native mediaView missing from SDK payload", null);
                    return new NativeBindingResult(false, 0, NativeBindingFailureReason.MISSING_REQUIRED_FIELDS);
                }
                String message4 = str + " native mediaView missing; continuing for non-media layout";
                Intrinsics.i(message4, "message");
            }
            if (!((Boolean) q2Var.invoke()).booleanValue()) {
                return new NativeBindingResult(false, 0, NativeBindingFailureReason.HOST_INVALID);
            }
            mediationNativeAdView.setNativeAd(mediationNativeAd);
            mediationNativeAd.trackViews(mediationNativeAdView, null, map);
            frameLayout.removeAllViews();
            frameLayout.addView(mediationNativeAdView, new FrameLayout.LayoutParams(-1, -1));
            return new NativeBindingResult(true, i, null);
        }
        homeInlineTemplateLayoutConfig = homeInlineTemplateLayoutConfigR;
        HomeInlineTemplateLayoutConfig homeInlineTemplateLayoutConfig3 = homeInlineTemplateLayoutConfig;
        homeInlineTemplateBindResultC = HomeInlineNativeTemplateBinder_androidKt.c(context, mediationNativeAdView, homeInlineTemplateLayoutConfig, new HomeInlineTemplateContent(string, string2, str3, fValueOf3, z4), new k2(string4, 0), new defpackage.f(3, mediationNativeAd, context), new i2(context, homeInlineTemplateLayoutConfig3, f2, str, 1));
        boolean z7 = homeInlineTemplateBindResultC.d;
        if (homeInlineTemplateBindResultC.f785a) {
        }
        return new NativeBindingResult(false, 0, NativeBindingFailureReason.MISSING_REQUIRED_FIELDS);
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0096  */
    public static final NativeBindingResult j(Context context, FrameLayout frameLayout, MediationNativeCustomFormatAd mediationNativeCustomFormatAd, String str, UnifiedAdSlot unifiedAdSlot, AdsterUnifiedDimens adsterUnifiedDimens, q2 q2Var) {
        Object objA;
        Object objA2;
        Float f;
        String strValueOf;
        int i;
        Object objA3;
        String[] strArr;
        int i2;
        int i3;
        String[] strArr2;
        int i4;
        NativeAd.Image image;
        HomeInlineTemplateViews homeInlineTemplateViews;
        Object objA4;
        String str2;
        Object objA5;
        Object objA6;
        Pair pairS = s(mediationNativeCustomFormatAd, "Headline", "headline");
        Pair pairS2 = s(mediationNativeCustomFormatAd, "Calltoaction", "CallToAction", "calltoaction", "callToAction");
        String str3 = pairS != null ? (String) pairS.e() : null;
        String str4 = "";
        if (str3 == null) {
            str3 = "";
        }
        String string = StringsKt.u0(str3).toString();
        String str5 = pairS2 != null ? (String) pairS2.e() : null;
        if (str5 == null) {
            str5 = "";
        }
        String string2 = StringsKt.u0(str5).toString();
        if (StringsKt.F(string) || StringsKt.F(string2)) {
            ChaloLog.c("AdsterUnifiedAd", str + " custom native missing headline/cta", null);
            return new NativeBindingResult(false, 0, NativeBindingFailureReason.MISSING_REQUIRED_FIELDS);
        }
        try {
            try {
                objA = mediationNativeCustomFormatAd.getMediaContent();
                while (true) {
                    i3 = 2;
                    if (i2 < 2) {
                        CharSequence text = mediationNativeCustomFormatAd.getText(strArr[i2]);
                        String string3 = text != null ? text.toString() : null;
                        if (string3 != null && !StringsKt.F(string3)) {
                            str4 = string3;
                            break;
                        }
                        i2++;
                    } else {
                        break;
                    }
                }
                while (true) {
                    if (i4 >= i3) {
                        image = null;
                        break;
                    }
                    try {
                        objA6 = mediationNativeCustomFormatAd.getImage(strArr2[i4]);
                    } catch (Throwable th) {
                        objA6 = ResultKt.a(th);
                    }
                    if (objA6 instanceof Result.Failure) {
                        objA6 = null;
                    }
                    image = (NativeAd.Image) objA6;
                    if (image != null) {
                        break;
                    }
                    i4++;
                    i3 = 2;
                }
            } catch (Throwable th2) {
                objA = ResultKt.a(th2);
            }
            objA3 = context.getResources().getResourceEntryName(i);
        } catch (Throwable th3) {
            objA3 = ResultKt.a(th3);
        }
        if (objA instanceof Result.Failure) {
            objA = null;
        }
        MediaContent mediaContent = (MediaContent) objA;
        if (mediaContent != null) {
            try {
                objA2 = Float.valueOf(mediaContent.getAspectRatio());
            } catch (Throwable th4) {
                objA2 = ResultKt.a(th4);
            }
            if (objA2 instanceof Result.Failure) {
                objA2 = null;
            }
            Float f2 = (Float) objA2;
            if (f2 == null || f2.floatValue() <= 0.0f) {
                f = null;
            } else {
                f = f2;
            }
        } else {
            f = null;
        }
        HomeInlineTemplateLayoutConfig homeInlineTemplateLayoutConfigR = r(unifiedAdSlot, f, adsterUnifiedDimens);
        int i5 = homeInlineTemplateLayoutConfigR.b;
        if (f == null || (strValueOf = String.valueOf(f.floatValue())) == null) {
            strValueOf = "null";
        }
        String str6 = strValueOf;
        String strQ = q(unifiedAdSlot, f);
        i = homeInlineTemplateLayoutConfigR.f787a;
        if (Result.a(objA3) != null) {
            objA3 = String.valueOf(i);
        }
        String message = str + " customNative layoutSelection ratio=" + str6 + " variant=" + strQ + " layout=" + ((String) objA3) + " heightDp=" + i5;
        Intrinsics.i(message, "message");
        strArr = new String[]{"Body", TtmlNode.TAG_BODY};
        i2 = 0;
        String string4 = StringsKt.u0(str4).toString();
        if (StringsKt.F(string4)) {
            String message2 = str + " custom native missing body; rendering headline + CTA only";
            Intrinsics.i(message2, "message");
        }
        strArr2 = new String[]{"Image", "image"};
        i4 = 0;
        Drawable drawable = image != null ? image.getDrawable() : null;
        if (drawable == null) {
            String message3 = str + " custom native missing icon; rendering without icon";
            Intrinsics.i(message3, "message");
        }
        boolean z = drawable != null;
        MediationNativeAdView mediationNativeAdView = new MediationNativeAdView(context, null, 0, 6, null);
        HomeInlineTemplateBindResult homeInlineTemplateBindResultC = HomeInlineNativeTemplateBinder_androidKt.c(context, mediationNativeAdView, homeInlineTemplateLayoutConfigR, new HomeInlineTemplateContent(string, string2, (StringsKt.F(string4) || UnifiedAdSlotSpecKt.a(unifiedAdSlot).e == UnifiedAdVisualTreatment.MEDIUM_FIXED_HEIGHT) ? null : string4, null, z), new defpackage.g(drawable, 3), new t(5), new i2(context, homeInlineTemplateLayoutConfigR, f, str, 0));
        if (!homeInlineTemplateBindResultC.f785a || (homeInlineTemplateViews = homeInlineTemplateBindResultC.b) == null) {
            return new NativeBindingResult(false, 0, NativeBindingFailureReason.MISSING_REQUIRED_FIELDS);
        }
        TextView textView = homeInlineTemplateViews.b;
        TextView textView2 = homeInlineTemplateViews.e;
        TextView textView3 = homeInlineTemplateViews.c;
        RatingBar ratingBar = homeInlineTemplateViews.d;
        FrameLayout frameLayout2 = homeInlineTemplateViews.h;
        ImageView imageView = homeInlineTemplateViews.f;
        mediationNativeAdView.setHeadlineView(textView);
        mediationNativeAdView.setBodyView(textView3);
        mediationNativeAdView.setCtaView(textView2);
        if (!homeInlineTemplateBindResultC.d) {
            imageView = null;
        }
        mediationNativeAdView.setLogoView(imageView);
        mediationNativeAdView.setRatingBarView(ratingBar);
        boolean z2 = homeInlineTemplateLayoutConfigR.c != null;
        if (frameLayout2 != null) {
            try {
                objA5 = mediationNativeCustomFormatAd.getMediaContent();
            } catch (Throwable th5) {
                objA5 = ResultKt.a(th5);
            }
            if (objA5 instanceof Result.Failure) {
                objA5 = null;
            }
            MediaContent mediaContent2 = (MediaContent) objA5;
            if (mediaContent2 == null) {
                if (z2) {
                    ChaloLog.c("AdsterUnifiedAd", str + " customNative mediaContent missing from SDK payload", null);
                    return new NativeBindingResult(false, 0, NativeBindingFailureReason.MISSING_REQUIRED_FIELDS);
                }
                String message4 = str + " customNative mediaContent missing; continuing for non-media layout";
                Intrinsics.i(message4, "message");
                mediaContent2 = null;
            }
            if (mediaContent2 != null) {
                MediaView mediaView = new MediaView(context);
                mediaView.setMediaContent(mediaContent2);
                frameLayout2.removeAllViews();
                frameLayout2.addView(mediaView, new FrameLayout.LayoutParams(-1, -1));
                mediationNativeAdView.setMediaView(mediaView);
                frameLayout2.post(new j2(0, (Object) str, (Object) frameLayout2, (Object) mediaView));
            }
        } else {
            try {
                objA4 = mediationNativeCustomFormatAd.getMediaContent();
            } catch (Throwable th6) {
                objA4 = ResultKt.a(th6);
            }
            if (objA4 instanceof Result.Failure) {
                objA4 = null;
            }
            if (((MediaContent) objA4) == null && z2) {
                ChaloLog.c("AdsterUnifiedAd", str + " customNative mediaContent missing from SDK payload", null);
                return new NativeBindingResult(false, 0, NativeBindingFailureReason.MISSING_REQUIRED_FIELDS);
            }
        }
        if (pairS2 == null || (str2 = (String) pairS2.d()) == null) {
            textView2.setOnClickListener(null);
        } else {
            textView2.setOnClickListener(new b2(2, mediationNativeCustomFormatAd, str2));
        }
        if (!((Boolean) q2Var.invoke()).booleanValue()) {
            return new NativeBindingResult(false, 0, NativeBindingFailureReason.HOST_INVALID);
        }
        frameLayout.removeAllViews();
        frameLayout.addView(mediationNativeAdView, new FrameLayout.LayoutParams(-1, -1));
        mediationNativeCustomFormatAd.recordImpression();
        return new NativeBindingResult(true, i5, null);
    }

    public static final void k(final View view, final Function0 function0) {
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        ViewTreeObserver.OnDrawListener onDrawListener = new ViewTreeObserver.OnDrawListener() { // from class: app.chalo.ads.AdsterUnifiedAd_androidKt$attachRenderedListenerOnce$onDrawListener$1

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public boolean f738a;

            @Override // android.view.ViewTreeObserver.OnDrawListener
            public final void onDraw() {
                if (this.f738a) {
                    return;
                }
                this.f738a = true;
                function0.invoke();
                View view2 = view;
                view2.post(new defpackage.b(4, view2, this));
            }
        };
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.addOnDrawListener(onDrawListener);
        }
    }

    public static final Integer l(View view, Context context) {
        AdSize adSize;
        AdManagerAdView adManagerAdView = view instanceof AdManagerAdView ? (AdManagerAdView) view : null;
        if (adManagerAdView != null && (adSize = adManagerAdView.getAdSize()) != null) {
            int heightInPixels = adSize.getHeightInPixels(context);
            Integer numValueOf = Integer.valueOf(heightInPixels);
            if (heightInPixels <= 0) {
                numValueOf = null;
            }
            if (numValueOf != null) {
                return Integer.valueOf(MathKt.f(numValueOf.intValue() / context.getResources().getDisplayMetrics().density));
            }
        }
        Integer numValueOf2 = Integer.valueOf(view.getHeight());
        Integer numValueOf3 = Integer.valueOf(view.getMeasuredHeight());
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Iterator it = CollectionsKt.S(numValueOf2, numValueOf3, Integer.valueOf(layoutParams != null ? layoutParams.height : 0)).iterator();
        while (it.hasNext()) {
            int iIntValue = ((Number) it.next()).intValue();
            if (iIntValue > 0 && iIntValue != -2 && iIntValue != -1) {
                return Integer.valueOf(MathKt.f(iIntValue / context.getResources().getDisplayMetrics().density));
            }
        }
        return null;
    }

    public static final void m(FrameLayout container, View view, UnifiedBannerUiSpec bannerUiSpec, String logContext) {
        Intrinsics.i(container, "container");
        Intrinsics.i(bannerUiSpec, "bannerUiSpec");
        Intrinsics.i(logContext, "logContext");
        container.removeAllViews();
        boolean z = bannerUiSpec.c;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(z ? -1 : -2, z ? -1 : -2);
        layoutParams.gravity = bannerUiSpec.d;
        container.addView(view, layoutParams);
        String message = logContext + " banner attached class=" + view.getClass().getSimpleName();
        Intrinsics.i(message, "message");
    }

    public static final void n(Object obj, Function1 function1) {
        boolean z = obj instanceof MediationBannerAd;
        Object objA = Unit.f17538a;
        if (z) {
            try {
                ((MediationBannerAd) obj).destroy();
            } catch (Throwable th) {
                objA = ResultKt.a(th);
            }
            Throwable thA = Result.a(objA);
            if (thA != null) {
                String strF = Reflection.a(thA.getClass()).f();
                String message = thA.getMessage();
                function1.invoke(new CrashlyticsLog("AdsterUnifiedAd destroy banner", vo1.n(strF, ":", message != null ? message : "")));
                return;
            }
            return;
        }
        if (obj instanceof MediationBannerVideoAd) {
            try {
                ((MediationBannerVideoAd) obj).destroy();
            } catch (Throwable th2) {
                objA = ResultKt.a(th2);
            }
            Throwable thA2 = Result.a(objA);
            if (thA2 != null) {
                String strF2 = Reflection.a(thA2.getClass()).f();
                String message2 = thA2.getMessage();
                function1.invoke(new CrashlyticsLog("AdsterUnifiedAd destroy banner video", vo1.n(strF2, ":", message2 != null ? message2 : "")));
                return;
            }
            return;
        }
        if (obj instanceof MediationNativeAd) {
            try {
                ((MediationNativeAd) obj).destroy();
            } catch (Throwable th3) {
                objA = ResultKt.a(th3);
            }
            Throwable thA3 = Result.a(objA);
            if (thA3 != null) {
                String strF3 = Reflection.a(thA3.getClass()).f();
                String message3 = thA3.getMessage();
                function1.invoke(new CrashlyticsLog("AdsterUnifiedAd destroy native", vo1.n(strF3, ":", message3 != null ? message3 : "")));
                return;
            }
            return;
        }
        if (obj instanceof MediationNativeCustomFormatAd) {
            try {
                ((MediationNativeCustomFormatAd) obj).destroy();
            } catch (Throwable th4) {
                objA = ResultKt.a(th4);
            }
            Throwable thA4 = Result.a(objA);
            if (thA4 != null) {
                String strF4 = Reflection.a(thA4.getClass()).f();
                String message4 = thA4.getMessage();
                function1.invoke(new CrashlyticsLog("AdsterUnifiedAd destroy custom native", vo1.n(strF4, ":", message4 != null ? message4 : "")));
            }
        }
    }

    public static final int o(Context context, int i) {
        return MathKt.f(context.getResources().getDimensionPixelSize(i) / context.getResources().getDisplayMetrics().density);
    }

    public static final void p(UnifiedAdFailureReporter failureReporter, Function1 onCrashLoggingRequired, String logContext, FrameLayout container, Function0 function0, UnifiedAdSlot slot, String placementName, int i, String errorMessage, String adType, Function1 function1, Function0 function2) {
        Intrinsics.i(failureReporter, "failureReporter");
        Intrinsics.i(onCrashLoggingRequired, "onCrashLoggingRequired");
        Intrinsics.i(logContext, "logContext");
        Intrinsics.i(container, "container");
        Intrinsics.i(slot, "slot");
        Intrinsics.i(placementName, "placementName");
        Intrinsics.i(errorMessage, "errorMessage");
        Intrinsics.i(adType, "adType");
        function0.invoke();
        container.removeAllViews();
        Throwable thA = Result.a(((Result) function2.invoke()).getValue());
        if (thA != null) {
            String strF = Reflection.a(thA.getClass()).f();
            String message = thA.getMessage();
            if (message == null) {
                message = "";
            }
            onCrashLoggingRequired.invoke(new CrashlyticsLog("AdsterUnifiedAd destroy", vo1.n(strF, ":", message)));
            ChaloLog.c("AdsterUnifiedAd", logContext.concat(" destroy failed during terminal failure"), thA);
        }
        failureReporter.a(new UnifiedAdTerminalFailureReport(placementName, UnifiedAdFailureReportingKt.a(slot), i, errorMessage, adType, logContext + " terminalFailure code=" + i + " message=" + errorMessage, pk0.g(i, "terminal_failure:", ":", errorMessage), null, 1536), function1, onCrashLoggingRequired);
    }

    public static final String q(UnifiedAdSlot unifiedAdSlot, Float f) {
        Intrinsics.i(unifiedAdSlot, "<this>");
        int i = WhenMappings.d[UnifiedAdSlotSpecKt.a(unifiedAdSlot).e.ordinal()];
        if (i == 1) {
            return "anchored";
        }
        if (i == 2) {
            NativeHomeLayoutVariant nativeHomeLayoutVariant = (f == null || f.floatValue() > 1.0f) ? NativeHomeLayoutVariant.WIDE_MEDIA : NativeHomeLayoutVariant.SPLIT;
            return nativeHomeLayoutVariant.name();
        }
        if (i == 3) {
            return "medium_fixed_height";
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final HomeInlineTemplateLayoutConfig r(UnifiedAdSlot slot, Float f, AdsterUnifiedDimens adDimens) {
        Intrinsics.i(slot, "slot");
        Intrinsics.i(adDimens, "adDimens");
        int i = adDimens.h;
        int i2 = WhenMappings.d[UnifiedAdSlotSpecKt.a(slot).e.ordinal()];
        if (i2 == 1) {
            return new HomeInlineTemplateLayoutConfig(R.layout.adster_unified_native_anchored_50dp, adDimens.f741a, null, 236);
        }
        if (i2 != 2) {
            if (i2 == 3) {
                return new HomeInlineTemplateLayoutConfig(R.layout.adster_unified_native_medium_fixed_height, adDimens.g, Integer.valueOf(i), true, true, false, Integer.valueOf(i), Float.valueOf(0.6f));
            }
            throw new NoWhenBranchMatchedException();
        }
        NativeHomeLayoutVariant nativeHomeLayoutVariant = (f == null || f.floatValue() > 1.0f) ? NativeHomeLayoutVariant.WIDE_MEDIA : NativeHomeLayoutVariant.SPLIT;
        int i3 = WhenMappings.c[nativeHomeLayoutVariant.ordinal()];
        if (i3 == 1) {
            return new HomeInlineTemplateLayoutConfig(R.layout.adster_unified_native_home_inline_wide, adDimens.f, Integer.valueOf(adDimens.c), 248);
        }
        if (i3 == 2) {
            return new HomeInlineTemplateLayoutConfig(R.layout.adster_unified_native_home_inline_split, adDimens.e, Integer.valueOf(adDimens.d), 224);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final Pair s(MediationNativeCustomFormatAd mediationNativeCustomFormatAd, String... strArr) {
        int length = strArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                return null;
            }
            String str = strArr[i];
            CharSequence text = mediationNativeCustomFormatAd.getText(str);
            String string = text != null ? text.toString() : null;
            if (string != null && !StringsKt.F(string)) {
                return new Pair(str, string);
            }
            i++;
        }
    }
}
