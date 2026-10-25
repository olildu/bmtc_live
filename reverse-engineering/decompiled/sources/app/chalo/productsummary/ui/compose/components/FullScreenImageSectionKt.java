package app.chalo.productsummary.ui.compose.components;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
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
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.media3.extractor.ts.TsExtractor;
import app.chalo.compose.components.RippleEffectKt;
import app.chalo.compose.components.image.CommonImageKt;
import app.chalo.compose.theme.ChaloTheme;
import app.chalo.compose.theme.ChaloThemeKt;
import app.chalo.productsummary.ui.data.FullScreenImageUIState;
import app.chalo.uistate.image.ImageUIStateKt;
import coil3.compose.AsyncImagePainter;
import coil3.compose.SingletonSubcomposeAsyncImageKt;
import coil3.compose.SubcomposeAsyncImageScope;
import defpackage.pk0;
import defpackage.w00;
import defpackage.wb;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"home_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class FullScreenImageSectionKt {
    public static final void a(final FullScreenImageUIState uiState, Composer composer, int i) {
        int i2;
        Intrinsics.i(uiState, "uiState");
        Composer composerStartRestartGroup = composer.startRestartGroup(1614631402);
        if ((i & 6) == 0) {
            i2 = i | ((i & 8) == 0 ? composerStartRestartGroup.changed(uiState) : composerStartRestartGroup.changedInstance(uiState) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1614631402, i2, -1, "app.chalo.productsummary.ui.compose.components.FullScreenImageSection (FullScreenImageSection.kt:23)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierM264backgroundbw27NRU$default = BackgroundKt.m264backgroundbw27NRU$default(SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), ChaloTheme.a(composerStartRestartGroup, 0).h, null, 2, null);
            MutableInteractionSource mutableInteractionSourceB = RippleEffectKt.b(composerStartRestartGroup);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new wb(8);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            Modifier modifierM295clickableO2vRcR0$default = ClickableKt.m295clickableO2vRcR0$default(modifierM264backgroundbw27NRU$default, mutableInteractionSourceB, null, false, null, null, (Function0) objRememberedValue, 28, null);
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM295clickableO2vRcR0$default);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
            if (!(composerStartRestartGroup.getApplier() != null)) {
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
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl, Integer.valueOf(i3), composerM3915constructorimpl));
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            final int i4 = 0;
            final int i5 = 1;
            final int i6 = 2;
            SingletonSubcomposeAsyncImageKt.a(uiState.f8752a.f10037a, null, boxScopeInstance.align(SizeKt.m814height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), ChaloTheme.b(composerStartRestartGroup, 0).x), companion2.getCenter()), ComposableLambdaKt.rememberComposableLambda(-123542595, true, new Function4() { // from class: v50
                @Override // kotlin.jvm.functions.Function4
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    SubcomposeAsyncImageScope SubcomposeAsyncImage = (SubcomposeAsyncImageScope) obj;
                    switch (i4) {
                        case 0:
                            Composer composer2 = (Composer) obj3;
                            int iIntValue = ((Integer) obj4).intValue();
                            Intrinsics.i(SubcomposeAsyncImage, "$this$SubcomposeAsyncImage");
                            Intrinsics.i((AsyncImagePainter.State.Loading) obj2, "it");
                            if (composer2.shouldExecute((iIntValue & TsExtractor.TS_STREAM_TYPE_AC3) != 128, iIntValue & 1)) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-123542595, iIntValue, -1, "app.chalo.productsummary.ui.compose.components.FullScreenImageSection.<anonymous>.<anonymous> (FullScreenImageSection.kt:42)");
                                }
                                CommonImageKt.a(uiState.c, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), false, composer2, 48, 4);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            } else {
                                composer2.skipToGroupEnd();
                            }
                            break;
                        case 1:
                            AsyncImagePainter.State.Success it = (AsyncImagePainter.State.Success) obj2;
                            Composer composer3 = (Composer) obj3;
                            int iIntValue2 = ((Integer) obj4).intValue();
                            Intrinsics.i(SubcomposeAsyncImage, "$this$SubcomposeAsyncImage");
                            Intrinsics.i(it, "it");
                            if ((iIntValue2 & 48) == 0) {
                                iIntValue2 |= (iIntValue2 & 64) == 0 ? composer3.changed(it) : composer3.changedInstance(it) ? 32 : 16;
                            }
                            if (composer3.shouldExecute((iIntValue2 & 145) != 144, iIntValue2 & 1)) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1295528995, iIntValue2, -1, "app.chalo.productsummary.ui.compose.components.FullScreenImageSection.<anonymous>.<anonymous> (FullScreenImageSection.kt:48)");
                                }
                                ImageKt.Image(it.f11481a, (String) null, (Modifier) null, (Alignment) null, ImageUIStateKt.c(uiState.f8752a.d), 0.0f, (ColorFilter) null, composer3, Painter.$stable | 48, 108);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            } else {
                                composer3.skipToGroupEnd();
                            }
                            break;
                        default:
                            Composer composer4 = (Composer) obj3;
                            int iIntValue3 = ((Integer) obj4).intValue();
                            Intrinsics.i(SubcomposeAsyncImage, "$this$SubcomposeAsyncImage");
                            Intrinsics.i((AsyncImagePainter.State.Error) obj2, "it");
                            if (composer4.shouldExecute((iIntValue3 & TsExtractor.TS_STREAM_TYPE_AC3) != 128, iIntValue3 & 1)) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-999746233, iIntValue3, -1, "app.chalo.productsummary.ui.compose.components.FullScreenImageSection.<anonymous>.<anonymous> (FullScreenImageSection.kt:55)");
                                }
                                CommonImageKt.a(uiState.c, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), false, composer4, 48, 4);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            } else {
                                composer4.skipToGroupEnd();
                            }
                            break;
                    }
                    return Unit.f17538a;
                }
            }, composerStartRestartGroup, 54), ComposableLambdaKt.rememberComposableLambda(1295528995, true, new Function4() { // from class: v50
                @Override // kotlin.jvm.functions.Function4
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    SubcomposeAsyncImageScope SubcomposeAsyncImage = (SubcomposeAsyncImageScope) obj;
                    switch (i5) {
                        case 0:
                            Composer composer2 = (Composer) obj3;
                            int iIntValue = ((Integer) obj4).intValue();
                            Intrinsics.i(SubcomposeAsyncImage, "$this$SubcomposeAsyncImage");
                            Intrinsics.i((AsyncImagePainter.State.Loading) obj2, "it");
                            if (composer2.shouldExecute((iIntValue & TsExtractor.TS_STREAM_TYPE_AC3) != 128, iIntValue & 1)) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-123542595, iIntValue, -1, "app.chalo.productsummary.ui.compose.components.FullScreenImageSection.<anonymous>.<anonymous> (FullScreenImageSection.kt:42)");
                                }
                                CommonImageKt.a(uiState.c, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), false, composer2, 48, 4);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            } else {
                                composer2.skipToGroupEnd();
                            }
                            break;
                        case 1:
                            AsyncImagePainter.State.Success it = (AsyncImagePainter.State.Success) obj2;
                            Composer composer3 = (Composer) obj3;
                            int iIntValue2 = ((Integer) obj4).intValue();
                            Intrinsics.i(SubcomposeAsyncImage, "$this$SubcomposeAsyncImage");
                            Intrinsics.i(it, "it");
                            if ((iIntValue2 & 48) == 0) {
                                iIntValue2 |= (iIntValue2 & 64) == 0 ? composer3.changed(it) : composer3.changedInstance(it) ? 32 : 16;
                            }
                            if (composer3.shouldExecute((iIntValue2 & 145) != 144, iIntValue2 & 1)) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1295528995, iIntValue2, -1, "app.chalo.productsummary.ui.compose.components.FullScreenImageSection.<anonymous>.<anonymous> (FullScreenImageSection.kt:48)");
                                }
                                ImageKt.Image(it.f11481a, (String) null, (Modifier) null, (Alignment) null, ImageUIStateKt.c(uiState.f8752a.d), 0.0f, (ColorFilter) null, composer3, Painter.$stable | 48, 108);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            } else {
                                composer3.skipToGroupEnd();
                            }
                            break;
                        default:
                            Composer composer4 = (Composer) obj3;
                            int iIntValue3 = ((Integer) obj4).intValue();
                            Intrinsics.i(SubcomposeAsyncImage, "$this$SubcomposeAsyncImage");
                            Intrinsics.i((AsyncImagePainter.State.Error) obj2, "it");
                            if (composer4.shouldExecute((iIntValue3 & TsExtractor.TS_STREAM_TYPE_AC3) != 128, iIntValue3 & 1)) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-999746233, iIntValue3, -1, "app.chalo.productsummary.ui.compose.components.FullScreenImageSection.<anonymous>.<anonymous> (FullScreenImageSection.kt:55)");
                                }
                                CommonImageKt.a(uiState.c, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), false, composer4, 48, 4);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            } else {
                                composer4.skipToGroupEnd();
                            }
                            break;
                    }
                    return Unit.f17538a;
                }
            }, composerStartRestartGroup, 54), ComposableLambdaKt.rememberComposableLambda(-999746233, true, new Function4() { // from class: v50
                @Override // kotlin.jvm.functions.Function4
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    SubcomposeAsyncImageScope SubcomposeAsyncImage = (SubcomposeAsyncImageScope) obj;
                    switch (i6) {
                        case 0:
                            Composer composer2 = (Composer) obj3;
                            int iIntValue = ((Integer) obj4).intValue();
                            Intrinsics.i(SubcomposeAsyncImage, "$this$SubcomposeAsyncImage");
                            Intrinsics.i((AsyncImagePainter.State.Loading) obj2, "it");
                            if (composer2.shouldExecute((iIntValue & TsExtractor.TS_STREAM_TYPE_AC3) != 128, iIntValue & 1)) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-123542595, iIntValue, -1, "app.chalo.productsummary.ui.compose.components.FullScreenImageSection.<anonymous>.<anonymous> (FullScreenImageSection.kt:42)");
                                }
                                CommonImageKt.a(uiState.c, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), false, composer2, 48, 4);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            } else {
                                composer2.skipToGroupEnd();
                            }
                            break;
                        case 1:
                            AsyncImagePainter.State.Success it = (AsyncImagePainter.State.Success) obj2;
                            Composer composer3 = (Composer) obj3;
                            int iIntValue2 = ((Integer) obj4).intValue();
                            Intrinsics.i(SubcomposeAsyncImage, "$this$SubcomposeAsyncImage");
                            Intrinsics.i(it, "it");
                            if ((iIntValue2 & 48) == 0) {
                                iIntValue2 |= (iIntValue2 & 64) == 0 ? composer3.changed(it) : composer3.changedInstance(it) ? 32 : 16;
                            }
                            if (composer3.shouldExecute((iIntValue2 & 145) != 144, iIntValue2 & 1)) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1295528995, iIntValue2, -1, "app.chalo.productsummary.ui.compose.components.FullScreenImageSection.<anonymous>.<anonymous> (FullScreenImageSection.kt:48)");
                                }
                                ImageKt.Image(it.f11481a, (String) null, (Modifier) null, (Alignment) null, ImageUIStateKt.c(uiState.f8752a.d), 0.0f, (ColorFilter) null, composer3, Painter.$stable | 48, 108);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            } else {
                                composer3.skipToGroupEnd();
                            }
                            break;
                        default:
                            Composer composer4 = (Composer) obj3;
                            int iIntValue3 = ((Integer) obj4).intValue();
                            Intrinsics.i(SubcomposeAsyncImage, "$this$SubcomposeAsyncImage");
                            Intrinsics.i((AsyncImagePainter.State.Error) obj2, "it");
                            if (composer4.shouldExecute((iIntValue3 & TsExtractor.TS_STREAM_TYPE_AC3) != 128, iIntValue3 & 1)) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-999746233, iIntValue3, -1, "app.chalo.productsummary.ui.compose.components.FullScreenImageSection.<anonymous>.<anonymous> (FullScreenImageSection.kt:55)");
                                }
                                CommonImageKt.a(uiState.c, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), false, composer4, 48, 4);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            } else {
                                composer4.skipToGroupEnd();
                            }
                            break;
                    }
                    return Unit.f17538a;
                }
            }, composerStartRestartGroup, 54), null, null, null, null, composerStartRestartGroup, 1794096, 0, 65416);
            CommonImageKt.a(uiState.b, ChaloThemeKt.c(boxScopeInstance.align(companion, companion2.getTopEnd()), uiState.d), false, composerStartRestartGroup, 0, 4);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new w00(uiState, i, 19));
        }
    }
}
