package app.chalo.productsummary.ui.compose.components;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
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
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.media3.extractor.ts.TsExtractor;
import app.chalo.compose.components.ChaloSpacersKt;
import app.chalo.compose.components.ChaloTextViewKt;
import app.chalo.compose.components.image.CommonImageKt;
import app.chalo.compose.theme.ChaloTheme;
import app.chalo.productsummary.ui.data.UserInfoUIState;
import app.chalo.uistate.base.BorderUISpecKt;
import app.chalo.uistate.image.ImageUISize;
import app.chalo.uistate.image.ImageUIStateKt;
import app.chalo.uistate.image.ImageUrlUIState;
import app.chalo.uistate.text.TextUIState;
import coil3.compose.AsyncImagePainter;
import coil3.compose.SingletonSubcomposeAsyncImageKt;
import coil3.compose.SubcomposeAsyncImageScope;
import defpackage.hn1;
import defpackage.pk0;
import defpackage.r1;
import defpackage.yh1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"home_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class UserProfileComponentKt {
    public static final void a(Modifier modifier, final UserInfoUIState uiState, Composer composer, int i) {
        Modifier modifier2;
        Modifier modifierM299clickableoSLSa3U$default;
        int i2;
        ComposeUiNode.Companion companion;
        Intrinsics.i(uiState, "uiState");
        ImageUrlUIState imageUrlUIState = uiState.f8763a;
        Composer composerStartRestartGroup = composer.startRestartGroup(829823000);
        int i3 = i | 6;
        if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(uiState) ? 32 : 16;
        }
        final int i4 = 0;
        final int i5 = 1;
        final int i6 = 2;
        if (composerStartRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            Modifier.Companion companion2 = Modifier.INSTANCE;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(829823000, i3, -1, "app.chalo.productsummary.ui.compose.components.UserProfileComponent (UserProfileComponent.kt:29)");
            }
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null);
            Alignment.Companion companion3 = Alignment.INSTANCE;
            Alignment.Vertical centerVertically = companion3.getCenterVertically();
            Arrangement arrangement = Arrangement.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), centerVertically, composerStartRestartGroup, 48);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i7 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
            ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion4.getConstructor();
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
            pk0.v(companion4, composerM3915constructorimpl, measurePolicyRowMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion4, composerM3915constructorimpl, Integer.valueOf(i7), composerM3915constructorimpl));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            ImageUISize imageUISize = imageUrlUIState != null ? imageUrlUIState.c : null;
            if (imageUISize == null) {
                composerStartRestartGroup.startReplaceGroup(502051097);
                imageUISize = new ImageUISize(ChaloTheme.b(composerStartRestartGroup, 0).n);
            } else {
                composerStartRestartGroup.startReplaceGroup(502050074);
            }
            composerStartRestartGroup.endReplaceGroup();
            Modifier modifierA = BorderUISpecKt.a(ClipKt.clip(ImageUIStateKt.b(companion2, imageUISize), RoundedCornerShapeKt.getCircleShape()), uiState.f);
            if ((imageUrlUIState != null ? imageUrlUIState.f : null) != null) {
                composerStartRestartGroup.startReplaceGroup(-1616079800);
                boolean z = (i3 & 112) == 32;
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new yh1(uiState, 8);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                modifierM299clickableoSLSa3U$default = ClickableKt.m299clickableoSLSa3U$default(modifierA, false, null, null, null, (Function0) objRememberedValue, 15, null);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-1615974834);
                composerStartRestartGroup.endReplaceGroup();
                modifierM299clickableoSLSa3U$default = companion2;
            }
            if (imageUrlUIState != null) {
                composerStartRestartGroup.startReplaceGroup(-1615861343);
                modifier2 = companion2;
                i2 = 0;
                Modifier modifier3 = modifierM299clickableoSLSa3U$default;
                companion = companion4;
                SingletonSubcomposeAsyncImageKt.a(imageUrlUIState.f10037a, null, modifier3, ComposableLambdaKt.rememberComposableLambda(16080146, true, new Function4() { // from class: nn1
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
                                        ComposerKt.traceEventStart(16080146, iIntValue, -1, "app.chalo.productsummary.ui.compose.components.UserProfileComponent.<anonymous>.<anonymous> (UserProfileComponent.kt:52)");
                                    }
                                    CommonImageKt.a(uiState.b, null, false, composer2, 0, 6);
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
                                        ComposerKt.traceEventStart(1719592824, iIntValue2, -1, "app.chalo.productsummary.ui.compose.components.UserProfileComponent.<anonymous>.<anonymous> (UserProfileComponent.kt:55)");
                                    }
                                    ImageKt.Image(it.f11481a, (String) null, (Modifier) null, (Alignment) null, ImageUIStateKt.c(uiState.f8763a.d), 0.0f, (ColorFilter) null, composer3, Painter.$stable | 48, 108);
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
                                        ComposerKt.traceEventStart(-1394711396, iIntValue3, -1, "app.chalo.productsummary.ui.compose.components.UserProfileComponent.<anonymous>.<anonymous> (UserProfileComponent.kt:62)");
                                    }
                                    CommonImageKt.a(uiState.b, null, false, composer4, 0, 6);
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
                }, composerStartRestartGroup, 54), ComposableLambdaKt.rememberComposableLambda(1719592824, true, new Function4() { // from class: nn1
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
                                        ComposerKt.traceEventStart(16080146, iIntValue, -1, "app.chalo.productsummary.ui.compose.components.UserProfileComponent.<anonymous>.<anonymous> (UserProfileComponent.kt:52)");
                                    }
                                    CommonImageKt.a(uiState.b, null, false, composer2, 0, 6);
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
                                        ComposerKt.traceEventStart(1719592824, iIntValue2, -1, "app.chalo.productsummary.ui.compose.components.UserProfileComponent.<anonymous>.<anonymous> (UserProfileComponent.kt:55)");
                                    }
                                    ImageKt.Image(it.f11481a, (String) null, (Modifier) null, (Alignment) null, ImageUIStateKt.c(uiState.f8763a.d), 0.0f, (ColorFilter) null, composer3, Painter.$stable | 48, 108);
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
                                        ComposerKt.traceEventStart(-1394711396, iIntValue3, -1, "app.chalo.productsummary.ui.compose.components.UserProfileComponent.<anonymous>.<anonymous> (UserProfileComponent.kt:62)");
                                    }
                                    CommonImageKt.a(uiState.b, null, false, composer4, 0, 6);
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
                }, composerStartRestartGroup, 54), ComposableLambdaKt.rememberComposableLambda(-1394711396, true, new Function4() { // from class: nn1
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
                                        ComposerKt.traceEventStart(16080146, iIntValue, -1, "app.chalo.productsummary.ui.compose.components.UserProfileComponent.<anonymous>.<anonymous> (UserProfileComponent.kt:52)");
                                    }
                                    CommonImageKt.a(uiState.b, null, false, composer2, 0, 6);
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
                                        ComposerKt.traceEventStart(1719592824, iIntValue2, -1, "app.chalo.productsummary.ui.compose.components.UserProfileComponent.<anonymous>.<anonymous> (UserProfileComponent.kt:55)");
                                    }
                                    ImageKt.Image(it.f11481a, (String) null, (Modifier) null, (Alignment) null, ImageUIStateKt.c(uiState.f8763a.d), 0.0f, (ColorFilter) null, composer3, Painter.$stable | 48, 108);
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
                                        ComposerKt.traceEventStart(-1394711396, iIntValue3, -1, "app.chalo.productsummary.ui.compose.components.UserProfileComponent.<anonymous>.<anonymous> (UserProfileComponent.kt:62)");
                                    }
                                    CommonImageKt.a(uiState.b, null, false, composer4, 0, 6);
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
                composerStartRestartGroup = composerStartRestartGroup;
                composerStartRestartGroup.endReplaceGroup();
            } else {
                modifier2 = companion2;
                i2 = 0;
                companion = companion4;
                composerStartRestartGroup.startReplaceGroup(-1615153861);
                CommonImageKt.a(uiState.b, null, false, composerStartRestartGroup, 0, 6);
                composerStartRestartGroup = composerStartRestartGroup;
                composerStartRestartGroup.endReplaceGroup();
            }
            ChaloSpacersKt.w(composerStartRestartGroup, i2);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getCenter(), companion3.getStart(), composerStartRestartGroup, 6);
            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, i2);
            int i8 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier2);
            Function0<ComposeUiNode> constructor2 = companion.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3915constructorimpl2 = Updater.m3915constructorimpl(composerStartRestartGroup);
            pk0.v(companion, composerM3915constructorimpl2, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl2, currentCompositionLocalMap2);
            Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion, composerM3915constructorimpl2, Integer.valueOf(i8), composerM3915constructorimpl2));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            TextUIState.ChaloTextUIState chaloTextUIState = uiState.c;
            if (chaloTextUIState == null) {
                composerStartRestartGroup.startReplaceGroup(177858626);
            } else {
                composerStartRestartGroup.startReplaceGroup(177858627);
                ChaloTextViewKt.a(null, chaloTextUIState, null, null, composerStartRestartGroup, 0, 13);
            }
            composerStartRestartGroup.endReplaceGroup();
            TextUIState.ChaloTextUIState chaloTextUIState2 = uiState.d;
            if (chaloTextUIState2 == null) {
                composerStartRestartGroup.startReplaceGroup(177923292);
            } else {
                composerStartRestartGroup.startReplaceGroup(177923293);
                ChaloSpacersKt.t(composerStartRestartGroup, i2);
                ChaloTextViewKt.a(null, chaloTextUIState2, null, null, composerStartRestartGroup, 0, 13);
            }
            composerStartRestartGroup.endReplaceGroup();
            TextUIState.ChaloTextUIState chaloTextUIState3 = uiState.e;
            if (chaloTextUIState3 == null) {
                composerStartRestartGroup.startReplaceGroup(178058204);
            } else {
                composerStartRestartGroup.startReplaceGroup(178058205);
                ChaloSpacersKt.t(composerStartRestartGroup, i2);
                ChaloTextViewKt.a(null, chaloTextUIState3, null, null, composerStartRestartGroup, 0, 13);
            }
            composerStartRestartGroup.endReplaceGroup();
            if (r1.k(composerStartRestartGroup)) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier2 = modifier;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new hn1(i, 2, modifier2, uiState));
        }
    }
}
