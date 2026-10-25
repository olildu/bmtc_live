package app.chalo.ads;

import android.content.Context;
import android.view.View;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.nativead.NativeAdView;
import defpackage.ay;
import defpackage.ej0;
import defpackage.f5;
import defpackage.fl0;
import defpackage.ir;
import defpackage.jk0;
import defpackage.wi0;
import defpackage.zc;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"chalo-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class NativeAdViewKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ProvidableCompositionLocal f801a = CompositionLocalKt.staticCompositionLocalOf(new jk0(4));

    public static final void a(Modifier modifier, Function2 content, Composer composer, int i) {
        Modifier modifier2;
        Intrinsics.i(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1687117164);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(content) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            modifier2 = Modifier.INSTANCE;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1687117164, i2, -1, "app.chalo.ads.NativeAdBodyView (NativeAdView.kt:134)");
            }
            NativeAdView nativeAdView = (NativeAdView) composerStartRestartGroup.consume(f801a);
            if (nativeAdView == null) {
                throw new IllegalStateException("NativeAdView null");
            }
            Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                ComposeView composeView = new ComposeView(context, null, 0, 6, null);
                composeView.setId(View.generateViewId());
                composerStartRestartGroup.updateRememberedValue(composeView);
                objRememberedValue = composeView;
            }
            ComposeView composeView2 = (ComposeView) objRememberedValue;
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(nativeAdView) | composerStartRestartGroup.changedInstance(composeView2) | ((i2 & 112) == 32);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new fl0(nativeAdView, composeView2, content, 0);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            AndroidView_androidKt.AndroidView((Function1) objRememberedValue2, modifier2, null, composerStartRestartGroup, (i2 << 3) & 112, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier2 = modifier;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new ay(modifier2, content, i, 1));
        }
    }

    public static final void b(Modifier modifier, Function2 content, Composer composer, int i) {
        int i2;
        Intrinsics.i(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1162030009);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(content) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1162030009, i2, -1, "app.chalo.ads.NativeAdCallToActionView (NativeAdView.kt:155)");
            }
            NativeAdView nativeAdView = (NativeAdView) composerStartRestartGroup.consume(f801a);
            if (nativeAdView == null) {
                throw new IllegalStateException("NativeAdView null");
            }
            Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                ComposeView composeView = new ComposeView(context, null, 0, 6, null);
                composeView.setId(View.generateViewId());
                composerStartRestartGroup.updateRememberedValue(composeView);
                objRememberedValue = composeView;
            }
            ComposeView composeView2 = (ComposeView) objRememberedValue;
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(nativeAdView) | composerStartRestartGroup.changedInstance(composeView2) | ((i2 & 112) == 32);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new fl0(nativeAdView, composeView2, content, 1);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            AndroidView_androidKt.AndroidView((Function1) objRememberedValue2, modifier, null, composerStartRestartGroup, (i2 << 3) & 112, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new ay(modifier, content, i, 2));
        }
    }

    public static final void c(Modifier modifier, Composer composer, int i) {
        int i2;
        Modifier modifier2;
        Composer composerStartRestartGroup = composer.startRestartGroup(429361813);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(429361813, i2, -1, "app.chalo.ads.NativeAdChoicesView (NativeAdView.kt:175)");
            }
            NativeAdView nativeAdView = (NativeAdView) composerStartRestartGroup.consume(f801a);
            if (nativeAdView == null) {
                throw new IllegalStateException("NativeAdView null");
            }
            Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(context);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new wi0(context, 19);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            Function1 function1 = (Function1) objRememberedValue;
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(nativeAdView);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new wi0(nativeAdView, 20);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            modifier2 = modifier;
            AndroidView_androidKt.AndroidView(function1, modifier2, (Function1) objRememberedValue2, composerStartRestartGroup, (i2 << 3) & 112, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            modifier2 = modifier;
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new zc(modifier2, i, 10));
        }
    }

    public static final void d(Modifier modifier, Function2 content, int i, Composer composer, int i2) {
        Modifier modifier2;
        int i3;
        Modifier modifier3;
        Intrinsics.i(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1084410974);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = i | (composerStartRestartGroup.changed(modifier2) ? 4 : 2);
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(content) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            Modifier modifier4 = i4 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1084410974, i3, -1, "app.chalo.ads.NativeAdHeadlineView (NativeAdView.kt:198)");
            }
            NativeAdView nativeAdView = (NativeAdView) composerStartRestartGroup.consume(f801a);
            if (nativeAdView == null) {
                throw new IllegalStateException("NativeAdView null");
            }
            Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                ComposeView composeView = new ComposeView(context, null, 0, 6, null);
                composeView.setId(View.generateViewId());
                composerStartRestartGroup.updateRememberedValue(composeView);
                objRememberedValue = composeView;
            }
            ComposeView composeView2 = (ComposeView) objRememberedValue;
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(nativeAdView) | composerStartRestartGroup.changedInstance(composeView2) | ((i3 & 112) == 32);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new fl0(nativeAdView, composeView2, content, 2);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            int i5 = (i3 << 3) & 112;
            Modifier modifier5 = modifier4;
            AndroidView_androidKt.AndroidView((Function1) objRememberedValue2, modifier5, null, composerStartRestartGroup, i5, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier5;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier3 = modifier2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new f5(modifier3, content, i, i2, 2));
        }
    }

    public static final void e(NativeAd nativeAd, Modifier modifier, Function2 content, Composer composer, int i) {
        int i2;
        Intrinsics.i(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(219618482);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(nativeAd) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(content) ? 256 : 128;
        }
        int i3 = i2;
        if (composerStartRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(219618482, i3, -1, "app.chalo.ads.NativeAdView (NativeAdView.kt:58)");
            }
            Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            Object obj = objRememberedValue;
            if (objRememberedValue == companion.getEmpty()) {
                NativeAdView nativeAdView = new NativeAdView(context);
                nativeAdView.setId(View.generateViewId());
                composerStartRestartGroup.updateRememberedValue(nativeAdView);
                obj = nativeAdView;
            }
            NativeAdView nativeAdView2 = (NativeAdView) obj;
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(nativeAdView2) | ((i3 & 896) == 256);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new ej0(9, nativeAdView2, content);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            AndroidView_androidKt.AndroidView((Function1) objRememberedValue2, modifier, null, composerStartRestartGroup, i3 & 112, 4);
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(nativeAdView2) | composerStartRestartGroup.changedInstance(nativeAd);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = new ej0(10, nativeAdView2, nativeAd);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            EffectsKt.DisposableEffect(nativeAd, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue3, composerStartRestartGroup, i3 & 14);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new ir(i, 28, nativeAd, modifier, content));
        }
    }
}
