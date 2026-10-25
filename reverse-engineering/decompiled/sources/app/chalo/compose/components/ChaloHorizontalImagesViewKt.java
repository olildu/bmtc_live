package app.chalo.compose.components;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import androidx.media3.extractor.ts.TsExtractor;
import app.chalo.compose.components.shimmer.ShimmerEffectKt;
import app.chalo.compose.theme.ChaloTheme;
import coil3.compose.AsyncImagePainter;
import coil3.compose.SingletonSubcomposeAsyncImageKt;
import coil3.compose.SubcomposeAsyncImageScope;
import defpackage.b3;
import defpackage.cf;
import defpackage.nf1;
import defpackage.pk0;
import defpackage.qh;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"chalo-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ChaloHorizontalImagesViewKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r24v2 */
    /* JADX WARN: Type inference failed for: r24v3 */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v3 */
    public static final void a(int i, Composer composer, Modifier modifier, List urlList, Function1 function1) {
        Modifier modifier2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        qh qhVar;
        int i2;
        Intrinsics.i(urlList, "urlList");
        Composer composerStartRestartGroup = composer.startRestartGroup(-910346860);
        int i3 = i | 6;
        if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(urlList) ? 32 : 16;
        }
        int i4 = 256;
        if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        final int i5 = 0;
        final ?? r9 = 1;
        if (composerStartRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            Modifier.Companion companion = Modifier.INSTANCE;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-910346860, i3, -1, "app.chalo.compose.components.ChaloHorizontalImagesView (ChaloHorizontalImagesView.kt:24)");
            }
            if (urlList.isEmpty()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                } else {
                    qhVar = new qh(companion, urlList, function1, i, 1);
                }
            } else {
                Function1 function2 = function1;
                Modifier modifierHorizontalScroll$default = ScrollKt.horizontalScroll$default(companion, ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), false, null, false, 14, null);
                MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), composerStartRestartGroup, 0);
                long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                int i6 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierHorizontalScroll$default);
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
                pk0.v(companion2, composerM3915constructorimpl, measurePolicyRowMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
                Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl, Integer.valueOf(i6), composerM3915constructorimpl));
                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                int i7 = 6;
                final float fM7278constructorimpl = Dp.m7278constructorimpl(ChaloTheme.b(composerStartRestartGroup, 6).u + ChaloTheme.b(composerStartRestartGroup, 6).d);
                final float fM7278constructorimpl2 = Dp.m7278constructorimpl(ChaloTheme.b(composerStartRestartGroup, 6).u + ChaloTheme.b(composerStartRestartGroup, 6).l);
                composerStartRestartGroup.startReplaceGroup(121297763);
                int i8 = 0;
                for (Object obj : urlList) {
                    int i9 = i8 + 1;
                    if (i8 < 0) {
                        CollectionsKt.z0();
                        throw null;
                    }
                    String str = (String) obj;
                    Modifier.Companion companion3 = Modifier.INSTANCE;
                    Modifier modifierClip = ClipKt.clip(SizeKt.m833width3ABfNKs(SizeKt.m814height3ABfNKs(companion3, fM7278constructorimpl), fM7278constructorimpl2), ChaloTheme.d(composerStartRestartGroup, i7).b);
                    ?? r10 = ((i3 & 896) == i4 ? r9 : i5) | (composerStartRestartGroup.changed(i8) ? 1 : 0);
                    Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (r10 != 0 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new cf(i8, r9, function2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    float f = fM7278constructorimpl2;
                    int i10 = i3;
                    int i11 = i8;
                    ?? r24 = r9;
                    float f2 = fM7278constructorimpl;
                    SingletonSubcomposeAsyncImageKt.a(str, null, ClickableKt.m299clickableoSLSa3U$default(modifierClip, false, null, null, null, (Function0) objRememberedValue, 15, null), ComposableLambdaKt.rememberComposableLambda(1873003301, r9, new Function4() { // from class: ok
                        @Override // kotlin.jvm.functions.Function4
                        public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
                            SubcomposeAsyncImageScope SubcomposeAsyncImage = (SubcomposeAsyncImageScope) obj2;
                            switch (i5) {
                                case 0:
                                    AsyncImagePainter.State.Loading it = (AsyncImagePainter.State.Loading) obj3;
                                    Composer composer2 = (Composer) obj4;
                                    int iIntValue = ((Integer) obj5).intValue();
                                    Intrinsics.i(SubcomposeAsyncImage, "$this$SubcomposeAsyncImage");
                                    Intrinsics.i(it, "it");
                                    if (composer2.shouldExecute((iIntValue & TsExtractor.TS_STREAM_TYPE_AC3) != 128, iIntValue & 1)) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(1873003301, iIntValue, -1, "app.chalo.compose.components.ChaloHorizontalImagesView.<anonymous>.<anonymous>.<anonymous> (ChaloHorizontalImagesView.kt:45)");
                                        }
                                        BoxKt.Box(ShimmerEffectKt.b(ClipKt.clip(SizeKt.m833width3ABfNKs(SizeKt.m814height3ABfNKs(Modifier.INSTANCE, fM7278constructorimpl), fM7278constructorimpl2), ChaloTheme.d(composer2, 6).b), Color.m4595boximpl(ChaloTheme.a(composer2, 6).p), Color.m4595boximpl(ChaloTheme.a(composer2, 6).q), 4), composer2, 0);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    } else {
                                        composer2.skipToGroupEnd();
                                    }
                                    break;
                                default:
                                    AsyncImagePainter.State.Error it2 = (AsyncImagePainter.State.Error) obj3;
                                    Composer composer3 = (Composer) obj4;
                                    int iIntValue2 = ((Integer) obj5).intValue();
                                    Intrinsics.i(SubcomposeAsyncImage, "$this$SubcomposeAsyncImage");
                                    Intrinsics.i(it2, "it");
                                    if (composer3.shouldExecute((iIntValue2 & TsExtractor.TS_STREAM_TYPE_AC3) != 128, iIntValue2 & 1)) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(1733604443, iIntValue2, -1, "app.chalo.compose.components.ChaloHorizontalImagesView.<anonymous>.<anonymous>.<anonymous> (ChaloHorizontalImagesView.kt:57)");
                                        }
                                        BoxKt.Box(BackgroundKt.m264backgroundbw27NRU$default(ClipKt.clip(SizeKt.m833width3ABfNKs(SizeKt.m814height3ABfNKs(Modifier.INSTANCE, fM7278constructorimpl), fM7278constructorimpl2), ChaloTheme.d(composer3, 6).b), ChaloTheme.a(composer3, 6).A, null, 2, null), composer3, 0);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    } else {
                                        composer3.skipToGroupEnd();
                                    }
                                    break;
                            }
                            return Unit.f17538a;
                        }
                    }, composerStartRestartGroup, 54), null, ComposableLambdaKt.rememberComposableLambda(1733604443, r9, new Function4() { // from class: ok
                        @Override // kotlin.jvm.functions.Function4
                        public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
                            SubcomposeAsyncImageScope SubcomposeAsyncImage = (SubcomposeAsyncImageScope) obj2;
                            switch (r9) {
                                case 0:
                                    AsyncImagePainter.State.Loading it = (AsyncImagePainter.State.Loading) obj3;
                                    Composer composer2 = (Composer) obj4;
                                    int iIntValue = ((Integer) obj5).intValue();
                                    Intrinsics.i(SubcomposeAsyncImage, "$this$SubcomposeAsyncImage");
                                    Intrinsics.i(it, "it");
                                    if (composer2.shouldExecute((iIntValue & TsExtractor.TS_STREAM_TYPE_AC3) != 128, iIntValue & 1)) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(1873003301, iIntValue, -1, "app.chalo.compose.components.ChaloHorizontalImagesView.<anonymous>.<anonymous>.<anonymous> (ChaloHorizontalImagesView.kt:45)");
                                        }
                                        BoxKt.Box(ShimmerEffectKt.b(ClipKt.clip(SizeKt.m833width3ABfNKs(SizeKt.m814height3ABfNKs(Modifier.INSTANCE, fM7278constructorimpl), fM7278constructorimpl2), ChaloTheme.d(composer2, 6).b), Color.m4595boximpl(ChaloTheme.a(composer2, 6).p), Color.m4595boximpl(ChaloTheme.a(composer2, 6).q), 4), composer2, 0);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    } else {
                                        composer2.skipToGroupEnd();
                                    }
                                    break;
                                default:
                                    AsyncImagePainter.State.Error it2 = (AsyncImagePainter.State.Error) obj3;
                                    Composer composer3 = (Composer) obj4;
                                    int iIntValue2 = ((Integer) obj5).intValue();
                                    Intrinsics.i(SubcomposeAsyncImage, "$this$SubcomposeAsyncImage");
                                    Intrinsics.i(it2, "it");
                                    if (composer3.shouldExecute((iIntValue2 & TsExtractor.TS_STREAM_TYPE_AC3) != 128, iIntValue2 & 1)) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(1733604443, iIntValue2, -1, "app.chalo.compose.components.ChaloHorizontalImagesView.<anonymous>.<anonymous>.<anonymous> (ChaloHorizontalImagesView.kt:57)");
                                        }
                                        BoxKt.Box(BackgroundKt.m264backgroundbw27NRU$default(ClipKt.clip(SizeKt.m833width3ABfNKs(SizeKt.m814height3ABfNKs(Modifier.INSTANCE, fM7278constructorimpl), fM7278constructorimpl2), ChaloTheme.d(composer3, 6).b), ChaloTheme.a(composer3, 6).A, null, 2, null), composer3, 0);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    } else {
                                        composer3.skipToGroupEnd();
                                    }
                                    break;
                            }
                            return Unit.f17538a;
                        }
                    }, composerStartRestartGroup, 54), null, null, null, ContentScale.INSTANCE.getFillBounds(), composerStartRestartGroup, 1597488, 48, 63400);
                    if (i11 != CollectionsKt.K(urlList)) {
                        composerStartRestartGroup.startReplaceGroup(-95947832);
                        i2 = 0;
                        nf1.t(companion3, ChaloTheme.b(composerStartRestartGroup, 6).f, composerStartRestartGroup, 0);
                    } else {
                        i2 = 0;
                        composerStartRestartGroup.startReplaceGroup(-98606268);
                        composerStartRestartGroup.endReplaceGroup();
                    }
                    i7 = 6;
                    i5 = i2;
                    i8 = i9;
                    i3 = i10;
                    fM7278constructorimpl2 = f;
                    r9 = r24 == true ? 1 : 0;
                    fM7278constructorimpl = f2;
                    i4 = 256;
                    function2 = function1;
                }
                if (b3.t(composerStartRestartGroup)) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = companion;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(qhVar);
        }
        composerStartRestartGroup.skipToGroupEnd();
        modifier2 = modifier;
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            qhVar = new qh(modifier2, urlList, function1, i, 2);
            scopeUpdateScopeEndRestartGroup.updateScope(qhVar);
        }
    }
}
