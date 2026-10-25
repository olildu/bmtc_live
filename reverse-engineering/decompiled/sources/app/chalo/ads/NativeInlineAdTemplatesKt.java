package app.chalo.ads;

import android.content.Context;
import android.content.res.Configuration;
import android.view.View;
import android.widget.ImageView;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.ProgressIndicatorKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import app.chalo.ads.NativeInlineAdTelemetry;
import app.chalo.compose.components.shimmer.ShimmerEffectKt;
import app.chalo.compose.theme.ChaloTheme;
import com.google.android.gms.ads.MediaContent;
import com.google.android.gms.ads.nativead.MediaView;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.nativead.NativeAdView;
import defpackage.dq;
import defpackage.g5;
import defpackage.hq0;
import defpackage.i41;
import defpackage.jl0;
import defpackage.ll0;
import defpackage.pk;
import defpackage.pk0;
import defpackage.uf0;
import defpackage.v;
import defpackage.wd;
import defpackage.zc;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002¨\u0006\u0006²\u0006\u0010\u0010\u0001\u001a\u0004\u0018\u00010\u00008\n@\nX\u008a\u008e\u0002²\u0006\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u00028\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0005\u001a\u00020\u00048\n@\nX\u008a\u008e\u0002²\u0006\u0010\u0010\u0001\u001a\u0004\u0018\u00010\u00008\n@\nX\u008a\u008e\u0002²\u0006\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u00028\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0005\u001a\u00020\u00048\n@\nX\u008a\u008e\u0002"}, d2 = {"", "stableWidthPx", "Landroidx/compose/ui/unit/IntSize;", "measuredSize", "", "mediaReady", "chalo-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class NativeInlineAdTemplatesKt {
    public static final void a(final NativeAd nativeAd, Modifier modifier, final int i, final Function1 function1, Composer composer, int i2) {
        int i3;
        final Function1 function2;
        final NativeAdView nativeAdView;
        Composer composerStartRestartGroup = composer.startRestartGroup(1429700241);
        if ((i2 & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(nativeAd) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(i) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            function2 = function1;
            i3 |= composerStartRestartGroup.changedInstance(function2) ? 2048 : 1024;
        } else {
            function2 = function1;
        }
        int i4 = i3;
        if (composerStartRestartGroup.shouldExecute((i4 & 1171) != 1170, i4 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1429700241, i4, -1, "app.chalo.ads.CapturableMediaView (NativeInlineAdTemplates.kt:403)");
            }
            NativeAdView nativeAdView2 = (NativeAdView) composerStartRestartGroup.consume(NativeAdViewKt.f801a);
            if (nativeAdView2 == null) {
                throw new IllegalStateException("NativeAdView null");
            }
            int i5 = i4 & 896;
            int i6 = i4 & 7168;
            boolean zChangedInstance = (i5 == 256) | composerStartRestartGroup.changedInstance(nativeAd) | composerStartRestartGroup.changedInstance(nativeAdView2) | (i6 == 2048);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                nativeAdView = nativeAdView2;
                final int i7 = 0;
                Function1 function3 = new Function1() { // from class: kl0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        switch (i7) {
                            case 0:
                                Context context = (Context) obj;
                                Intrinsics.i(context, "context");
                                MediaView mediaView = new MediaView(context);
                                mediaView.setId(View.generateViewId());
                                int i8 = i;
                                mediaView.setMinimumHeight(i8);
                                mediaView.setMinimumWidth(i8);
                                mediaView.setImageScaleType(ImageView.ScaleType.FIT_CENTER);
                                NativeAd nativeAd2 = nativeAd;
                                MediaContent mediaContent = nativeAd2.getMediaContent();
                                if (mediaContent != null) {
                                    mediaView.setMediaContent(mediaContent);
                                }
                                nativeAdView.setMediaView(mediaView);
                                function2.invoke(mediaView);
                                NativeInlineAdTelemetry.a("template_media_view_created", null, null, null, "media_view", nativeAd2, nf1.i(mediaView.getMinimumWidth(), mediaView.getMinimumHeight(), "minWidth=", " minHeight="), 29);
                                return mediaView;
                            default:
                                MediaView view = (MediaView) obj;
                                Intrinsics.i(view, "view");
                                int i9 = i;
                                view.setMinimumHeight(i9);
                                view.setMinimumWidth(i9);
                                view.setImageScaleType(ImageView.ScaleType.FIT_CENTER);
                                NativeAd nativeAd3 = nativeAd;
                                MediaContent mediaContent2 = nativeAd3.getMediaContent();
                                if (mediaContent2 != null) {
                                    view.setMediaContent(mediaContent2);
                                }
                                nativeAdView.setMediaView(view);
                                function2.invoke(view);
                                NativeInlineAdTelemetry.a("template_media_view_updated", null, null, null, "media_view", nativeAd3, nf1.i(view.getWidth(), view.getHeight(), "width=", " height="), 29);
                                return Unit.f17538a;
                        }
                    }
                };
                composerStartRestartGroup.updateRememberedValue(function3);
                objRememberedValue = function3;
            } else {
                nativeAdView = nativeAdView2;
            }
            Function1 function4 = (Function1) objRememberedValue;
            boolean zChangedInstance2 = (i5 == 256) | composerStartRestartGroup.changedInstance(nativeAd) | composerStartRestartGroup.changedInstance(nativeAdView) | (i6 == 2048);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                final int i8 = 1;
                Function1 function5 = new Function1() { // from class: kl0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        switch (i8) {
                            case 0:
                                Context context = (Context) obj;
                                Intrinsics.i(context, "context");
                                MediaView mediaView = new MediaView(context);
                                mediaView.setId(View.generateViewId());
                                int i9 = i;
                                mediaView.setMinimumHeight(i9);
                                mediaView.setMinimumWidth(i9);
                                mediaView.setImageScaleType(ImageView.ScaleType.FIT_CENTER);
                                NativeAd nativeAd2 = nativeAd;
                                MediaContent mediaContent = nativeAd2.getMediaContent();
                                if (mediaContent != null) {
                                    mediaView.setMediaContent(mediaContent);
                                }
                                nativeAdView.setMediaView(mediaView);
                                function1.invoke(mediaView);
                                NativeInlineAdTelemetry.a("template_media_view_created", null, null, null, "media_view", nativeAd2, nf1.i(mediaView.getMinimumWidth(), mediaView.getMinimumHeight(), "minWidth=", " minHeight="), 29);
                                return mediaView;
                            default:
                                MediaView view = (MediaView) obj;
                                Intrinsics.i(view, "view");
                                int i10 = i;
                                view.setMinimumHeight(i10);
                                view.setMinimumWidth(i10);
                                view.setImageScaleType(ImageView.ScaleType.FIT_CENTER);
                                NativeAd nativeAd3 = nativeAd;
                                MediaContent mediaContent2 = nativeAd3.getMediaContent();
                                if (mediaContent2 != null) {
                                    view.setMediaContent(mediaContent2);
                                }
                                nativeAdView.setMediaView(view);
                                function1.invoke(view);
                                NativeInlineAdTelemetry.a("template_media_view_updated", null, null, null, "media_view", nativeAd3, nf1.i(view.getWidth(), view.getHeight(), "width=", " height="), 29);
                                return Unit.f17538a;
                        }
                    }
                };
                composerStartRestartGroup.updateRememberedValue(function5);
                objRememberedValue2 = function5;
            }
            AndroidView_androidKt.AndroidView(function4, modifier, (Function1) objRememberedValue2, composerStartRestartGroup, i4 & 112, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new v(nativeAd, modifier, i, function1, i2));
        }
    }

    public static final void b(Modifier modifier, Composer composer, int i) {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1921809728);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1921809728, i2, -1, "app.chalo.ads.NativeAdBadge (NativeInlineAdTemplates.kt:442)");
            }
            Modifier modifierM785paddingVpY3zN4 = PaddingKt.m785paddingVpY3zN4(BackgroundKt.m264backgroundbw27NRU$default(ClipKt.clip(modifier, ChaloTheme.d(composerStartRestartGroup, 6).c), Color.m4604copywmQWz5c$default(Color.INSTANCE.m4642getWhite0d7_KjU(), 0.9f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), Dp.m7278constructorimpl(8), Dp.m7278constructorimpl(4));
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getCenter(), false);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM785paddingVpY3zN4);
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
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
            pk0.v(companion, composerM3915constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion, composerM3915constructorimpl, Integer.valueOf(i3), composerM3915constructorimpl));
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            composer2 = composerStartRestartGroup;
            TextKt.m2623TextNvy7gAk("Ad", null, ChaloTheme.a(composerStartRestartGroup, 6).v0, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, TextStyle.m6753copyp1EtxEg$default(MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable).getLabelSmall(), 0L, TextUnitKt.getSp(10), null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777213, null), composer2, 6, 0, 131066);
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new zc(modifier, i, 11));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v29, types: [androidx.compose.runtime.SnapshotMutationPolicy, java.lang.Object, kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r0v37 */
    public static final void c(final NativeAd nativeAd, float f, Integer num, final Function1 onNativeAdViewReady, final Function1 onMediaViewReady, Function1 onTargetSizeCalculated, Function2 onMediaSizeResolved, Modifier modifier, Composer composer, int i) {
        int i2;
        Composer composer2;
        int iIntValue;
        ?? r0;
        int i3;
        NativeAd nativeAd2 = nativeAd;
        Intrinsics.i(onNativeAdViewReady, "onNativeAdViewReady");
        Intrinsics.i(onMediaViewReady, "onMediaViewReady");
        Intrinsics.i(onTargetSizeCalculated, "onTargetSizeCalculated");
        Intrinsics.i(onMediaSizeResolved, "onMediaSizeResolved");
        Composer composerStartRestartGroup = composer.startRestartGroup(1412099706);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(nativeAd2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(f) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(num) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onNativeAdViewReady) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onMediaViewReady) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onTargetSizeCalculated) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onMediaSizeResolved) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= composerStartRestartGroup.changed(modifier) ? 8388608 : 4194304;
        }
        if (composerStartRestartGroup.shouldExecute((4793491 & i2) != 4793490, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1412099706, i2, -1, "app.chalo.ads.NativeInlineCardAd (NativeInlineAdTemplates.kt:232)");
            }
            Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            int iMo398roundToPx0680j_4 = density.mo398roundToPx0680j_4(Dp.m7278constructorimpl(((Configuration) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalConfiguration())).screenWidthDp));
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            int i4 = i2;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            MutableState mutableState = (MutableState) objRememberedValue;
            Integer num2 = (Integer) mutableState.getValue();
            if (num2 != null) {
                iIntValue = num2.intValue();
            } else {
                iIntValue = num != null ? num.intValue() : iMo398roundToPx0680j_4;
            }
            if (iIntValue < 1) {
                iIntValue = 1;
            }
            Integer num3 = (Integer) mutableState.getValue();
            StringBuilder sb = new StringBuilder("stableWidthPx=");
            sb.append(num3);
            sb.append(" cachedWidth=");
            sb.append(num);
            sb.append(" screenWidthPx=");
            hq0.p(iMo398roundToPx0680j_4, iIntValue, " widthForCalc=", " aspectRatio=", sb);
            sb.append(f);
            NativeInlineAdTelemetry.a("template_width_calc", null, null, null, "card", nativeAd2, sb.toString(), 29);
            MediaBoxSpec mediaBoxSpecF = f(Float.valueOf(f), iIntValue, 0.25f, composerStartRestartGroup, ((i4 >> 3) & 14) | 384);
            final int iMo398roundToPx0680j_5 = density.mo398roundToPx0680j_4(Dp.m7278constructorimpl(120));
            int i5 = mediaBoxSpecF.b;
            int i6 = mediaBoxSpecF.f796a;
            final float fMo401toDpu2uoSUM = density.mo401toDpu2uoSUM(i5);
            final float fMo401toDpu2uoSUM2 = density.mo401toDpu2uoSUM(i6);
            float fM7278constructorimpl = Dp.m7278constructorimpl(Dp.m7278constructorimpl(24) + fMo401toDpu2uoSUM);
            int i7 = mediaBoxSpecF.b;
            boolean z = mediaBoxSpecF.c;
            String strM7289toStringimpl = Dp.m7289toStringimpl(fMo401toDpu2uoSUM);
            String strM7289toStringimpl2 = Dp.m7289toStringimpl(fM7278constructorimpl);
            StringBuilder sbS = uf0.s(i6, i7, "wPx=", " hPx=", " ready=");
            pk0.x(" heightDp=", strM7289toStringimpl, " totalHeightDp=", sbS, z);
            sbS.append(strM7289toStringimpl2);
            NativeInlineAdTelemetry.a("template_media_spec", null, null, null, "card", nativeAd, sbS.toString(), 29);
            boolean zChanged = composerStartRestartGroup.changed(mediaBoxSpecF) | ((i4 & 458752) == 131072);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue2 == companion.getEmpty()) {
                r0 = 0;
                objRememberedValue2 = new NativeInlineAdTemplatesKt$NativeInlineCardAd$1$1(mediaBoxSpecF, onTargetSizeCalculated, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            } else {
                r0 = 0;
            }
            EffectsKt.LaunchedEffect(mediaBoxSpecF, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, 0);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
                i3 = 2;
                objRememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(r0, r0, 2, r0);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            } else {
                i3 = 2;
            }
            final MutableState mutableState2 = (MutableState) objRememberedValue3;
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, r0, i3, r0);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            final MutableState mutableState3 = (MutableState) objRememberedValue4;
            IntSize intSize = (IntSize) mutableState2.getValue();
            boolean z2 = (i4 & 3670016) == 1048576;
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (z2 || objRememberedValue5 == companion.getEmpty()) {
                objRememberedValue5 = new NativeInlineAdTemplatesKt$NativeInlineCardAd$2$1(mutableState2, onMediaSizeResolved, mutableState3, r0);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            EffectsKt.LaunchedEffect(intSize, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue5, composerStartRestartGroup, 0);
            Modifier modifierClip = ClipKt.clip(SizeKt.m814height3ABfNKs(SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, r0), fM7278constructorimpl), ChaloTheme.d(composerStartRestartGroup, 6).c);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(nativeAd);
            Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue6 == companion.getEmpty()) {
                objRememberedValue6 = new jl0(nativeAd, mutableState, 1);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
            }
            composer2 = composerStartRestartGroup;
            nativeAd2 = nativeAd;
            NativeAdViewKt.e(nativeAd2, OnGloballyPositionedModifierKt.onGloballyPositioned(modifierClip, (Function1) objRememberedValue6), ComposableLambdaKt.rememberComposableLambda(-412950424, true, new Function2() { // from class: app.chalo.ads.l
                /* JADX WARN: Multi-variable type inference failed */
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer3 = (Composer) obj;
                    int iIntValue2 = ((Integer) obj2).intValue();
                    if (composer3.shouldExecute((iIntValue2 & 3) != 2, iIntValue2 & 1)) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-412950424, iIntValue2, -1, "app.chalo.ads.NativeInlineCardAd.<anonymous> (NativeInlineAdTemplates.kt:309)");
                        }
                        NativeAdView nativeAdView = (NativeAdView) composer3.consume(NativeAdViewKt.f801a);
                        boolean zChangedInstance2 = composer3.changedInstance(nativeAdView);
                        Function1 function1 = onNativeAdViewReady;
                        boolean zChanged2 = zChangedInstance2 | composer3.changed(function1);
                        Object objRememberedValue7 = composer3.rememberedValue();
                        if (zChanged2 || objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue7 = new NativeInlineAdTemplatesKt$NativeInlineCardAd$4$1$1(nativeAdView, function1, null);
                            composer3.updateRememberedValue(objRememberedValue7);
                        }
                        EffectsKt.LaunchedEffect(nativeAdView, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue7, composer3, 0);
                        Modifier.Companion companion2 = Modifier.INSTANCE;
                        float f2 = 12;
                        Modifier modifierM784padding3ABfNKs = PaddingKt.m784padding3ABfNKs(SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null), Dp.m7278constructorimpl(f2));
                        Arrangement arrangement = Arrangement.INSTANCE;
                        Arrangement.Horizontal start = arrangement.getStart();
                        Alignment.Companion companion3 = Alignment.INSTANCE;
                        MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(start, companion3.getTop(), composer3, 0);
                        long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0);
                        int i8 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                        CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer3, modifierM784padding3ABfNKs);
                        ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion4.getConstructor();
                        if (composer3.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composer3.startReusableNode();
                        if (composer3.getInserting()) {
                            composer3.createNode(constructor);
                        } else {
                            composer3.useNode();
                        }
                        Composer composerM3915constructorimpl = Updater.m3915constructorimpl(composer3);
                        pk0.v(companion4, composerM3915constructorimpl, measurePolicyRowMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
                        Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion4, composerM3915constructorimpl, Integer.valueOf(i8), composerM3915constructorimpl));
                        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                        Modifier modifierClip2 = ClipKt.clip(SizeKt.fillMaxHeight$default(SizeKt.m833width3ABfNKs(companion2, fMo401toDpu2uoSUM2), 0.0f, 1, null), ChaloTheme.d(composer3, 6).c);
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), false);
                        long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0);
                        int i9 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
                        CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer3, modifierClip2);
                        Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
                        if (composer3.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composer3.startReusableNode();
                        if (composer3.getInserting()) {
                            composer3.createNode(constructor2);
                        } else {
                            composer3.useNode();
                        }
                        Composer composerM3915constructorimpl2 = Updater.m3915constructorimpl(composer3);
                        pk0.v(companion4, composerM3915constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3915constructorimpl2, currentCompositionLocalMap2);
                        Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion4, composerM3915constructorimpl2, Integer.valueOf(i9), composerM3915constructorimpl2));
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null);
                        Object objRememberedValue8 = composer3.rememberedValue();
                        if (objRememberedValue8 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue8 = new g5(mutableState2, 27);
                            composer3.updateRememberedValue(objRememberedValue8);
                        }
                        Modifier modifierOnGloballyPositioned = OnGloballyPositionedModifierKt.onGloballyPositioned(modifierFillMaxSize$default, (Function1) objRememberedValue8);
                        NativeAd nativeAd3 = nativeAd;
                        NativeInlineAdTemplatesKt.a(nativeAd3, modifierOnGloballyPositioned, iMo398roundToPx0680j_5, onMediaViewReady, composer3, 48);
                        float f3 = 4;
                        NativeAdViewKt.c(SizeKt.m828size3ABfNKs(PaddingKt.m784padding3ABfNKs(boxScopeInstance.align(companion2, companion3.getTopEnd()), Dp.m7278constructorimpl(f3)), Dp.m7278constructorimpl(15)), composer3, 0);
                        if (((Boolean) mutableState3.getValue()).booleanValue()) {
                            composer3.startReplaceGroup(891001360);
                        } else {
                            composer3.startReplaceGroup(904146073);
                            NativeInlineAdTemplatesKt.e(fMo401toDpu2uoSUM, null, composer3, 0);
                        }
                        composer3.endReplaceGroup();
                        composer3.endNode();
                        SpacerKt.Spacer(SizeKt.m833width3ABfNKs(companion2, Dp.m7278constructorimpl(f2)), composer3, 6);
                        Modifier modifierFillMaxHeight$default = SizeKt.fillMaxHeight$default(i41.a(rowScopeInstance, companion2, 1.0f, false, 2, null), 0.0f, 1, null);
                        MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion3.getStart(), composer3, 0);
                        long currentCompositeKeyHashCode3 = ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0);
                        int i10 = (int) (currentCompositeKeyHashCode3 ^ (currentCompositeKeyHashCode3 >>> 32));
                        CompositionLocalMap currentCompositionLocalMap3 = composer3.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer3, modifierFillMaxHeight$default);
                        Function0<ComposeUiNode> constructor3 = companion4.getConstructor();
                        if (composer3.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composer3.startReusableNode();
                        if (composer3.getInserting()) {
                            composer3.createNode(constructor3);
                        } else {
                            composer3.useNode();
                        }
                        Composer composerM3915constructorimpl3 = Updater.m3915constructorimpl(composer3);
                        pk0.v(companion4, composerM3915constructorimpl3, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl3, currentCompositionLocalMap3);
                        Updater.m3923setimpl(composerM3915constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion4, composerM3915constructorimpl3, Integer.valueOf(i10), composerM3915constructorimpl3));
                        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                        String headline = nativeAd3.getHeadline();
                        if (headline == null || StringsKt.F(headline)) {
                            headline = null;
                        }
                        if (headline == null) {
                            composer3.startReplaceGroup(719585610);
                        } else {
                            composer3.startReplaceGroup(719585611);
                            NativeAdViewKt.d(null, ComposableLambdaKt.rememberComposableLambda(-1241948285, true, new pk(headline, 7), composer3, 54), 48, composer3, 1);
                        }
                        composer3.endReplaceGroup();
                        String body = nativeAd3.getBody();
                        if (body == null || StringsKt.F(body)) {
                            body = null;
                        }
                        if (body == null) {
                            composer3.startReplaceGroup(720080401);
                        } else {
                            composer3.startReplaceGroup(720080402);
                            SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion2, Dp.m7278constructorimpl(2)), composer3, 6);
                            NativeAdViewKt.a(null, ComposableLambdaKt.rememberComposableLambda(1564385388, true, new pk(body, 4), composer3, 54), composer3, 48);
                        }
                        composer3.endReplaceGroup();
                        SpacerKt.Spacer(dq.a(columnScopeInstance, companion2, 1.0f, false, 2, null), composer3, 0);
                        MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement.getStart(), companion3.getTop(), composer3, 0);
                        long currentCompositeKeyHashCode4 = ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0);
                        int i11 = (int) (currentCompositeKeyHashCode4 ^ (currentCompositeKeyHashCode4 >>> 32));
                        CompositionLocalMap currentCompositionLocalMap4 = composer3.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composer3, companion2);
                        Function0<ComposeUiNode> constructor4 = companion4.getConstructor();
                        if (composer3.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composer3.startReusableNode();
                        if (composer3.getInserting()) {
                            composer3.createNode(constructor4);
                        } else {
                            composer3.useNode();
                        }
                        Composer composerM3915constructorimpl4 = Updater.m3915constructorimpl(composer3);
                        pk0.v(companion4, composerM3915constructorimpl4, measurePolicyRowMeasurePolicy2, composerM3915constructorimpl4, currentCompositionLocalMap4);
                        Updater.m3923setimpl(composerM3915constructorimpl4, modifierMaterializeModifier4, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion4, composerM3915constructorimpl4, Integer.valueOf(i11), composerM3915constructorimpl4));
                        String callToAction = nativeAd3.getCallToAction();
                        String str = (callToAction == null || StringsKt.F(callToAction)) ? null : callToAction;
                        if (str == null) {
                            composer3.startReplaceGroup(-694872452);
                        } else {
                            composer3.startReplaceGroup(-694872451);
                            NativeAdViewKt.b(rowScopeInstance.align(companion2, companion3.getCenterVertically()), ComposableLambdaKt.rememberComposableLambda(925797580, true, new pk(str, 5), composer3, 54), composer3, 48);
                        }
                        composer3.endReplaceGroup();
                        SpacerKt.Spacer(i41.a(rowScopeInstance, companion2, 1.0f, false, 2, null), composer3, 0);
                        NativeInlineAdTemplatesKt.b(PaddingKt.m784padding3ABfNKs(companion2, Dp.m7278constructorimpl(f3)), composer3, 6);
                        composer3.endNode();
                        composer3.endNode();
                        composer3.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    } else {
                        composer3.skipToGroupEnd();
                    }
                    return Unit.f17538a;
                }
            }, composer2, 54), composer2, (i4 & 14) | 384);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new ll0(nativeAd2, f, num, onNativeAdViewReady, onMediaViewReady, onTargetSizeCalculated, onMediaSizeResolved, modifier, i, 1));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12, types: [androidx.compose.runtime.SnapshotMutationPolicy, androidx.compose.ui.Alignment$Vertical, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v14 */
    public static final void d(final NativeAd nativeAd, float f, Integer num, final Function1 onNativeAdViewReady, final Function1 onMediaViewReady, Function1 onTargetSizeCalculated, Function2 onMediaSizeResolved, Modifier modifier, Composer composer, int i) {
        int i2;
        Composer composer2;
        int iIntValue;
        ?? r7;
        int i3;
        MutableState mutableState;
        NativeAd nativeAd2 = nativeAd;
        Intrinsics.i(onNativeAdViewReady, "onNativeAdViewReady");
        Intrinsics.i(onMediaViewReady, "onMediaViewReady");
        Intrinsics.i(onTargetSizeCalculated, "onTargetSizeCalculated");
        Intrinsics.i(onMediaSizeResolved, "onMediaSizeResolved");
        Composer composerStartRestartGroup = composer.startRestartGroup(-195726896);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(nativeAd2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(f) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(num) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onNativeAdViewReady) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onMediaViewReady) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onTargetSizeCalculated) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onMediaSizeResolved) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= composerStartRestartGroup.changed(modifier) ? 8388608 : 4194304;
        }
        if (composerStartRestartGroup.shouldExecute((4793491 & i2) != 4793490, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-195726896, i2, -1, "app.chalo.ads.NativeInlineHeroAd (NativeInlineAdTemplates.kt:90)");
            }
            Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            int iMo398roundToPx0680j_4 = density.mo398roundToPx0680j_4(Dp.m7278constructorimpl(((Configuration) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalConfiguration())).screenWidthDp));
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            int i4 = i2;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            MutableState mutableState2 = (MutableState) objRememberedValue;
            Integer num2 = (Integer) mutableState2.getValue();
            if (num2 != null) {
                iIntValue = num2.intValue();
            } else {
                iIntValue = num != null ? num.intValue() : iMo398roundToPx0680j_4;
            }
            if (iIntValue < 1) {
                iIntValue = 1;
            }
            Integer num3 = (Integer) mutableState2.getValue();
            StringBuilder sb = new StringBuilder("stableWidthPx=");
            sb.append(num3);
            sb.append(" cachedWidth=");
            sb.append(num);
            sb.append(" screenWidthPx=");
            hq0.p(iMo398roundToPx0680j_4, iIntValue, " widthForCalc=", " aspectRatio=", sb);
            sb.append(f);
            composer2 = composerStartRestartGroup;
            NativeInlineAdTelemetry.a("template_width_calc", null, null, null, "hero", nativeAd2, sb.toString(), 29);
            MediaBoxSpec mediaBoxSpecF = f(Float.valueOf(f), iIntValue, 1.0f, composer2, ((i4 >> 3) & 14) | 384);
            final float fMo401toDpu2uoSUM = density.mo401toDpu2uoSUM(mediaBoxSpecF.b);
            int i5 = mediaBoxSpecF.f796a;
            int i6 = mediaBoxSpecF.b;
            boolean z = mediaBoxSpecF.c;
            String strM7289toStringimpl = Dp.m7289toStringimpl(fMo401toDpu2uoSUM);
            StringBuilder sbS = uf0.s(i5, i6, "wPx=", " hPx=", " ready=");
            sbS.append(z);
            sbS.append(" heightDp=");
            sbS.append(strM7289toStringimpl);
            NativeInlineAdTelemetry.a("template_media_spec", null, null, null, "hero", nativeAd, sbS.toString(), 29);
            boolean zChanged = composer2.changed(mediaBoxSpecF) | ((i4 & 458752) == 131072);
            Object objRememberedValue2 = composer2.rememberedValue();
            if (zChanged || objRememberedValue2 == companion.getEmpty()) {
                r7 = 0;
                objRememberedValue2 = new NativeInlineAdTemplatesKt$NativeInlineHeroAd$1$1(mediaBoxSpecF, onTargetSizeCalculated, null);
                composer2.updateRememberedValue(objRememberedValue2);
            } else {
                r7 = 0;
            }
            EffectsKt.LaunchedEffect(mediaBoxSpecF, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composer2, 0);
            Object objRememberedValue3 = composer2.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
                i3 = 2;
                objRememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(r7, r7, 2, r7);
                composer2.updateRememberedValue(objRememberedValue3);
            } else {
                i3 = 2;
            }
            MutableState mutableState3 = (MutableState) objRememberedValue3;
            Object objRememberedValue4 = composer2.rememberedValue();
            if (objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, r7, i3, r7);
                composer2.updateRememberedValue(objRememberedValue4);
            }
            final MutableState mutableState4 = (MutableState) objRememberedValue4;
            final int iMo398roundToPx0680j_5 = density.mo398roundToPx0680j_4(Dp.m7278constructorimpl(120));
            IntSize intSize = (IntSize) mutableState3.getValue();
            boolean zChanged2 = composer2.changed(iMo398roundToPx0680j_5) | ((i4 & 3670016) == 1048576);
            Object objRememberedValue5 = composer2.rememberedValue();
            if (zChanged2 || objRememberedValue5 == companion.getEmpty()) {
                mutableState = mutableState3;
                NativeInlineAdTemplatesKt$NativeInlineHeroAd$2$1 nativeInlineAdTemplatesKt$NativeInlineHeroAd$2$1 = new NativeInlineAdTemplatesKt$NativeInlineHeroAd$2$1(mutableState, iMo398roundToPx0680j_5, onMediaSizeResolved, mutableState4, null);
                composer2.updateRememberedValue(nativeInlineAdTemplatesKt$NativeInlineHeroAd$2$1);
                objRememberedValue5 = nativeInlineAdTemplatesKt$NativeInlineHeroAd$2$1;
            } else {
                mutableState = mutableState3;
            }
            EffectsKt.LaunchedEffect(intSize, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue5, composer2, 0);
            Modifier modifierWrapContentHeight$default = SizeKt.wrapContentHeight$default(SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, r7), r7, false, 3, r7);
            boolean zChangedInstance = composer2.changedInstance(nativeAd);
            Object objRememberedValue6 = composer2.rememberedValue();
            if (zChangedInstance || objRememberedValue6 == companion.getEmpty()) {
                objRememberedValue6 = new jl0(nativeAd, mutableState2, 0);
                composer2.updateRememberedValue(objRememberedValue6);
            }
            Modifier modifierOnGloballyPositioned = OnGloballyPositionedModifierKt.onGloballyPositioned(modifierWrapContentHeight$default, (Function1) objRememberedValue6);
            final MutableState mutableState5 = mutableState;
            nativeAd2 = nativeAd;
            NativeAdViewKt.e(nativeAd2, modifierOnGloballyPositioned, ComposableLambdaKt.rememberComposableLambda(-2020777026, true, new Function2() { // from class: app.chalo.ads.k
                /* JADX WARN: Multi-variable type inference failed */
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer3 = (Composer) obj;
                    int iIntValue2 = ((Integer) obj2).intValue();
                    if (composer3.shouldExecute((iIntValue2 & 3) != 2, iIntValue2 & 1)) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-2020777026, iIntValue2, -1, "app.chalo.ads.NativeInlineHeroAd.<anonymous> (NativeInlineAdTemplates.kt:163)");
                        }
                        NativeAdView nativeAdView = (NativeAdView) composer3.consume(NativeAdViewKt.f801a);
                        boolean zChangedInstance2 = composer3.changedInstance(nativeAdView);
                        Function1 function1 = onNativeAdViewReady;
                        boolean zChanged3 = zChangedInstance2 | composer3.changed(function1);
                        Object objRememberedValue7 = composer3.rememberedValue();
                        if (zChanged3 || objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue7 = new NativeInlineAdTemplatesKt$NativeInlineHeroAd$4$1$1(nativeAdView, function1, null);
                            composer3.updateRememberedValue(objRememberedValue7);
                        }
                        EffectsKt.LaunchedEffect(nativeAdView, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue7, composer3, 0);
                        Modifier.Companion companion2 = Modifier.INSTANCE;
                        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null);
                        Arrangement.Vertical top = Arrangement.INSTANCE.getTop();
                        Alignment.Companion companion3 = Alignment.INSTANCE;
                        MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion3.getStart(), composer3, 0);
                        long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0);
                        int i7 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                        CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer3, modifierFillMaxWidth$default);
                        ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion4.getConstructor();
                        if (composer3.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composer3.startReusableNode();
                        if (composer3.getInserting()) {
                            composer3.createNode(constructor);
                        } else {
                            composer3.useNode();
                        }
                        Composer composerM3915constructorimpl = Updater.m3915constructorimpl(composer3);
                        pk0.v(companion4, composerM3915constructorimpl, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
                        Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion4, composerM3915constructorimpl, Integer.valueOf(i7), composerM3915constructorimpl));
                        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                        Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null);
                        float f2 = fMo401toDpu2uoSUM;
                        Modifier modifierClip = ClipKt.clip(SizeKt.m814height3ABfNKs(modifierFillMaxWidth$default2, f2), ChaloTheme.d(composer3, 6).c);
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), false);
                        long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0);
                        int i8 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
                        CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer3, modifierClip);
                        Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
                        if (composer3.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composer3.startReusableNode();
                        if (composer3.getInserting()) {
                            composer3.createNode(constructor2);
                        } else {
                            composer3.useNode();
                        }
                        Composer composerM3915constructorimpl2 = Updater.m3915constructorimpl(composer3);
                        pk0.v(companion4, composerM3915constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3915constructorimpl2, currentCompositionLocalMap2);
                        Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion4, composerM3915constructorimpl2, Integer.valueOf(i8), composerM3915constructorimpl2));
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null);
                        Object objRememberedValue8 = composer3.rememberedValue();
                        if (objRememberedValue8 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue8 = new g5(mutableState5, 26);
                            composer3.updateRememberedValue(objRememberedValue8);
                        }
                        Modifier modifierOnGloballyPositioned2 = OnGloballyPositionedModifierKt.onGloballyPositioned(modifierFillMaxSize$default, (Function1) objRememberedValue8);
                        NativeAd nativeAd3 = nativeAd;
                        NativeInlineAdTemplatesKt.a(nativeAd3, modifierOnGloballyPositioned2, iMo398roundToPx0680j_5, onMediaViewReady, composer3, 48);
                        float f3 = 4;
                        NativeAdViewKt.c(SizeKt.m828size3ABfNKs(PaddingKt.m784padding3ABfNKs(boxScopeInstance.align(companion2, companion3.getTopEnd()), Dp.m7278constructorimpl(f3)), Dp.m7278constructorimpl(15)), composer3, 0);
                        float f4 = 8;
                        NativeInlineAdTemplatesKt.b(PaddingKt.m784padding3ABfNKs(boxScopeInstance.align(companion2, companion3.getBottomEnd()), Dp.m7278constructorimpl(f4)), composer3, 0);
                        if (((Boolean) mutableState4.getValue()).booleanValue()) {
                            composer3.startReplaceGroup(2076195688);
                        } else {
                            composer3.startReplaceGroup(2083779249);
                            NativeInlineAdTemplatesKt.e(f2, null, composer3, 0);
                        }
                        composer3.endReplaceGroup();
                        composer3.endNode();
                        String headline = nativeAd3.getHeadline();
                        if (headline == null || StringsKt.F(headline)) {
                            headline = null;
                        }
                        if (headline == null) {
                            composer3.startReplaceGroup(-1882884262);
                        } else {
                            composer3.startReplaceGroup(-1882884261);
                            NativeAdViewKt.d(PaddingKt.m785paddingVpY3zN4(SizeKt.wrapContentHeight$default(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), null, false, 3, null), Dp.m7278constructorimpl(f4), Dp.m7278constructorimpl(f3)), ComposableLambdaKt.rememberComposableLambda(1472544181, true, new pk(headline, 6), composer3, 54), 54, composer3, 0);
                        }
                        composer3.endReplaceGroup();
                        composer3.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    } else {
                        composer3.skipToGroupEnd();
                    }
                    return Unit.f17538a;
                }
            }, composer2, 54), composer2, (i4 & 14) | 384);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new ll0(nativeAd2, f, num, onNativeAdViewReady, onMediaViewReady, onTargetSizeCalculated, onMediaSizeResolved, modifier, i, 0));
        }
    }

    public static final void e(float f, Modifier modifier, Composer composer, int i) {
        int i2;
        Modifier modifier2;
        Composer composerStartRestartGroup = composer.startRestartGroup(2115127484);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(f) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if (composerStartRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            Modifier.Companion companion = Modifier.INSTANCE;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2115127484, i3, -1, "app.chalo.ads.NativeInlineMediaLoader (NativeInlineAdTemplates.kt:462)");
            }
            Modifier modifierClip = ClipKt.clip(SizeKt.m814height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), f), ChaloTheme.d(composerStartRestartGroup, 6).c);
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i4 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierClip);
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
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl, Integer.valueOf(i4), composerM3915constructorimpl));
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            ShimmerEffectKt.a(boxScopeInstance.matchParentSize(companion), f, 0.0f, null, ChaloTheme.a(composerStartRestartGroup, 6).p, ChaloTheme.a(composerStartRestartGroup, 6).q, composerStartRestartGroup, (i3 << 3) & 112, 12);
            modifier2 = companion;
            ProgressIndicatorKt.m2278CircularProgressIndicator4lLiAd8(boxScopeInstance.align(SizeKt.m828size3ABfNKs(companion, Dp.m7278constructorimpl(28)), companion2.getCenter()), ChaloTheme.a(composerStartRestartGroup, 6).f1915a, Dp.m7278constructorimpl(2), 0L, 0, 0.0f, composerStartRestartGroup, 384, 56);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier2 = modifier;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new wd(f, modifier2, i));
        }
    }

    public static final MediaBoxSpec f(Float f, int i, float f2, Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2046585150, i2, -1, "app.chalo.ads.rememberMediaBoxSpec (NativeInlineAdTemplates.kt:59)");
        }
        Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
        boolean z = false;
        boolean zChanged = ((((i2 & 896) ^ 384) > 256 && composer.changed(f2)) || (i2 & 384) == 256) | ((((i2 & 14) ^ 6) > 4 && composer.changed(f)) || (i2 & 6) == 4) | ((((i2 & 112) ^ 48) > 32 && composer.changed(i)) || (i2 & 48) == 32) | composer.changed(density);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            int iMo398roundToPx0680j_4 = density.mo398roundToPx0680j_4(Dp.m7278constructorimpl(120));
            if (f.floatValue() <= 0.0f) {
                f = null;
            }
            float fFloatValue = f != null ? f.floatValue() : 1.7777778f;
            int iMax = Math.max(MathKt.f(i * f2), iMo398roundToPx0680j_4);
            int iMax2 = Math.max(i, iMo398roundToPx0680j_4);
            if (iMax > iMax2) {
                iMax = iMax2;
            }
            int iMax3 = Math.max(MathKt.f(iMax / fFloatValue), iMo398roundToPx0680j_4);
            if (iMax > 0 && iMax3 > 0) {
                z = true;
            }
            objRememberedValue = new MediaBoxSpec(iMax, iMax3, z);
            composer.updateRememberedValue(objRememberedValue);
        }
        MediaBoxSpec mediaBoxSpec = (MediaBoxSpec) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return mediaBoxSpec;
    }
}
