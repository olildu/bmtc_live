package app.chalo.compose.components;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
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
import androidx.compose.foundation.pager.PagerKt;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.foundation.pager.PagerStateKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.ZIndexModifierKt;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.window.AndroidDialog_androidKt;
import androidx.compose.ui.window.DialogProperties;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import app.chalo.compose.components.HorizontalImageDialogViewerKt;
import app.chalo.compose.resources.PainterResourceHelperKt;
import app.chalo.compose.theme.ChaloTheme;
import app.chalo.providers.iconassetprovider.IconType;
import defpackage.af;
import defpackage.ir;
import defpackage.pk0;
import defpackage.q80;
import defpackage.r80;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"chalo-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class HorizontalImageDialogViewerKt {
    public static final void a(Modifier modifier, IconType iconId, Function0 onClick, Composer composer, int i) {
        int i2;
        Composer composer2;
        Intrinsics.i(iconId, "iconId");
        Intrinsics.i(onClick, "onClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(-24246727);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(iconId.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onClick) ? 256 : 128;
        }
        int i3 = i2;
        if (composerStartRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-24246727, i3, -1, "app.chalo.compose.components.HorizontalImageButtonIcon (HorizontalImageDialogViewer.kt:229)");
            }
            composer2 = composerStartRestartGroup;
            ImageKt.Image(PainterResourceHelperKt.a(iconId, composerStartRestartGroup, (i3 >> 3) & 14), (String) null, PaddingKt.m784padding3ABfNKs(ClickableKt.m295clickableO2vRcR0$default(BackgroundKt.m264backgroundbw27NRU$default(ClipKt.clip(SizeKt.m828size3ABfNKs(modifier, ChaloTheme.b(composerStartRestartGroup, 6).j), RoundedCornerShapeKt.getCircleShape()), ChaloTheme.a(composerStartRestartGroup, 6).t, null, 2, null), RippleEffectKt.b(composerStartRestartGroup), null, false, null, null, onClick, 28, null), ChaloTheme.b(composerStartRestartGroup, 6).d), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer2, Painter.$stable | 48, 120);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new ir(i, 16, modifier, iconId, onClick));
        }
    }

    public static final void b(final Modifier modifier, final DialogProperties dialogProperties, final String str, final TextStyle textStyle, final long j, final List imageList, final int i, final Function0 function0, Composer composer, final int i2) {
        final Modifier modifier2;
        int i3;
        DialogProperties dialogProperties2;
        String str2;
        Function0 function1;
        Intrinsics.i(imageList, "imageList");
        Composer composerStartRestartGroup = composer.startRestartGroup(1302452855);
        if ((i2 & 6) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i2;
        } else {
            modifier2 = modifier;
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            dialogProperties2 = dialogProperties;
            i3 |= composerStartRestartGroup.changed(dialogProperties2) ? 32 : 16;
        } else {
            dialogProperties2 = dialogProperties;
        }
        if ((i2 & 384) == 0) {
            str2 = str;
            i3 |= composerStartRestartGroup.changed(str2) ? 256 : 128;
        } else {
            str2 = str;
        }
        if ((i2 & 3072) == 0) {
            i3 |= composerStartRestartGroup.changed(textStyle) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= composerStartRestartGroup.changed(j) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(imageList) ? 131072 : 65536;
        }
        int i4 = i3 | 1572864;
        if ((12582912 & i2) == 0) {
            i4 |= composerStartRestartGroup.changed(i) ? 8388608 : 4194304;
        }
        if ((100663296 & i2) == 0) {
            function1 = function0;
            i4 |= composerStartRestartGroup.changedInstance(function1) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        } else {
            function1 = function0;
        }
        int i5 = i4;
        if (composerStartRestartGroup.shouldExecute((38347923 & i5) != 38347922, i5 & 1)) {
            composerStartRestartGroup.startDefaults();
            if ((i2 & 1) != 0 && !composerStartRestartGroup.getDefaultsInvalid()) {
                composerStartRestartGroup.skipToGroupEnd();
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1302452855, i5, -1, "app.chalo.compose.components.HorizontalImageDialogViewer (HorizontalImageDialogViewer.kt:56)");
            }
            if (imageList.isEmpty()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    final int i6 = 0;
                    final DialogProperties dialogProperties3 = dialogProperties2;
                    final String str3 = str2;
                    final Function0 function2 = function1;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: m80
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            switch (i6) {
                                case 0:
                                    ((Integer) obj2).getClass();
                                    HorizontalImageDialogViewerKt.b(modifier2, dialogProperties3, str3, textStyle, j, imageList, i, function2, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                                    break;
                                default:
                                    ((Integer) obj2).getClass();
                                    HorizontalImageDialogViewerKt.b(modifier2, dialogProperties3, str3, textStyle, j, imageList, i, function2, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                                    break;
                            }
                            return Unit.f17538a;
                        }
                    });
                    return;
                }
                return;
            }
            boolean zChanged = composerStartRestartGroup.changed(imageList);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = Integer.valueOf(imageList.size());
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            ((Number) objRememberedValue).intValue();
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.f17583a, composerStartRestartGroup);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            final CoroutineScope coroutineScope = (CoroutineScope) objRememberedValue2;
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(imageList);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = new af(imageList, 9);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            final PagerState pagerStateRememberPagerState = PagerStateKt.rememberPagerState(i, 0.0f, (Function0) objRememberedValue3, composerStartRestartGroup, (i5 >> 21) & 14, 2);
            composerStartRestartGroup = composerStartRestartGroup;
            AndroidDialog_androidKt.Dialog(function0, dialogProperties, ComposableLambdaKt.rememberComposableLambda(-360344960, true, new Function2() { // from class: o80
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Modifier.Companion companion2;
                    int i7;
                    int i8;
                    Composer composer2 = (Composer) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (composer2.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-360344960, iIntValue, -1, "app.chalo.compose.components.HorizontalImageDialogViewer.<anonymous> (HorizontalImageDialogViewer.kt:72)");
                        }
                        Modifier modifierM784padding3ABfNKs = PaddingKt.m784padding3ABfNKs(BackgroundKt.m263backgroundbw27NRU(modifier, ChaloTheme.a(composer2, 6).t, ChaloTheme.d(composer2, 6).c), ChaloTheme.b(composer2, 6).h);
                        Arrangement arrangement = Arrangement.INSTANCE;
                        Arrangement.Vertical top = arrangement.getTop();
                        Alignment.Companion companion3 = Alignment.INSTANCE;
                        MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion3.getStart(), composer2, 0);
                        long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0);
                        int i9 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, modifierM784padding3ABfNKs);
                        ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion4.getConstructor();
                        if (composer2.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor);
                        } else {
                            composer2.useNode();
                        }
                        Composer composerM3915constructorimpl = Updater.m3915constructorimpl(composer2);
                        pk0.v(companion4, composerM3915constructorimpl, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
                        Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion4, composerM3915constructorimpl, Integer.valueOf(i9), composerM3915constructorimpl));
                        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                        String str4 = str;
                        Arrangement.Horizontal spaceBetween = str4 != null ? arrangement.getSpaceBetween() : arrangement.getEnd();
                        Modifier.Companion companion5 = Modifier.INSTANCE;
                        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion5, 0.0f, 1, null);
                        MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, companion3.getCenterVertically(), composer2, 48);
                        long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0);
                        int i10 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
                        CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer2, modifierFillMaxWidth$default);
                        Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
                        if (composer2.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor2);
                        } else {
                            composer2.useNode();
                        }
                        Composer composerM3915constructorimpl2 = Updater.m3915constructorimpl(composer2);
                        pk0.v(companion4, composerM3915constructorimpl2, measurePolicyRowMeasurePolicy, composerM3915constructorimpl2, currentCompositionLocalMap2);
                        Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion4, composerM3915constructorimpl2, Integer.valueOf(i10), composerM3915constructorimpl2));
                        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                        if (str4 == null) {
                            composer2.startReplaceGroup(-508908626);
                            composer2.endReplaceGroup();
                            i7 = 6;
                            companion2 = companion5;
                        } else {
                            composer2.startReplaceGroup(-508908625);
                            companion2 = companion5;
                            i7 = 6;
                            TextKt.m2623TextNvy7gAk(str4, null, j, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, textStyle, composer2, 0, 0, 131066);
                            composer2 = composer2;
                            composer2.endReplaceGroup();
                        }
                        Modifier.Companion companion6 = companion2;
                        Modifier modifierM828size3ABfNKs = SizeKt.m828size3ABfNKs(companion6, ChaloTheme.b(composer2, i7).h);
                        Function0 function3 = function0;
                        boolean zChanged2 = composer2.changed(function3);
                        Object objRememberedValue4 = composer2.rememberedValue();
                        if (zChanged2 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                            i8 = 0;
                            objRememberedValue4 = new p80(function3, 0);
                            composer2.updateRememberedValue(objRememberedValue4);
                        } else {
                            i8 = 0;
                        }
                        Composer composer3 = composer2;
                        ImageKt.Image(PainterResourceHelperKt.a(IconType.IC_CLOSE, composer2, i7), (String) null, ClickableKt.m299clickableoSLSa3U$default(modifierM828size3ABfNKs, false, null, null, null, (Function0) objRememberedValue4, 15, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer3, Painter.$stable | 48, 120);
                        composer3.endNode();
                        SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion6, ChaloTheme.b(composer3, i7).h), composer3, i8);
                        HorizontalImageDialogViewerKt.c(6, pagerStateRememberPagerState, composer3, SizeKt.fillMaxWidth$default(companion6, 0.0f, 1, null), imageList, coroutineScope);
                        composer3.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    } else {
                        composer2.skipToGroupEnd();
                    }
                    return Unit.f17538a;
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, ((i5 >> 24) & 14) | 384 | (i5 & 112), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup2 != null) {
            final int i7 = 1;
            scopeUpdateScopeEndRestartGroup2.updateScope(new Function2() { // from class: m80
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    switch (i7) {
                        case 0:
                            ((Integer) obj2).getClass();
                            HorizontalImageDialogViewerKt.b(modifier, dialogProperties, str, textStyle, j, imageList, i, function0, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                            break;
                        default:
                            ((Integer) obj2).getClass();
                            HorizontalImageDialogViewerKt.b(modifier, dialogProperties, str, textStyle, j, imageList, i, function0, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                            break;
                    }
                    return Unit.f17538a;
                }
            });
        }
    }

    public static final void c(int i, PagerState pagerState, Composer composer, Modifier modifier, List imageList, CoroutineScope scope) {
        int i2;
        Composer composer2;
        PagerState pagerState2;
        Intrinsics.i(pagerState, "pagerState");
        Intrinsics.i(imageList, "imageList");
        Intrinsics.i(scope, "scope");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1817472510);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(pagerState) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(imageList) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(scope) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changed((Object) null) ? 16384 : 8192;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 9363) != 9362, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1817472510, i2, -1, "app.chalo.compose.components.ImagePager (HorizontalImageDialogViewer.kt:135)");
            }
            boolean zChanged = composerStartRestartGroup.changed(imageList);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = Integer.valueOf(imageList.size());
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            int iIntValue = ((Number) objRememberedValue).intValue();
            boolean z = (57344 & i2) == 16384;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = Modifier.INSTANCE;
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            Modifier modifier2 = (Modifier) objRememberedValue2;
            Alignment.Companion companion = Alignment.INSTANCE;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion.getTopStart(), false);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier);
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
            pk0.v(companion2, composerM3915constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl, Integer.valueOf(i3), composerM3915constructorimpl));
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Modifier.Companion companion3 = Modifier.INSTANCE;
            Modifier modifierZIndex = ZIndexModifierKt.zIndex(PaddingKt.m788paddingqDBjuR0$default(boxScopeInstance.align(companion3, companion.getCenterStart()), ChaloTheme.b(composerStartRestartGroup, 6).f, 0.0f, 0.0f, 0.0f, 14, null), 1.0f);
            IconType iconType = IconType.IC_PREVIOUS;
            int i4 = i2 & 112;
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(scope) | composerStartRestartGroup.changed(iIntValue) | (i4 == 32);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new a(scope, iIntValue, pagerState, 1);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            a(modifierZIndex, iconType, (Function0) objRememberedValue3, composerStartRestartGroup, 48);
            pagerState2 = pagerState;
            PagerKt.m1020HorizontalPager8jOkeI(pagerState2, SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), null, null, 0, 0.0f, null, null, false, false, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(-314505463, true, new q80(0, imageList, modifier2, boxScopeInstance), composerStartRestartGroup, 54), composerStartRestartGroup, ((i2 >> 3) & 14) | 48, 24576, 16380);
            composer2 = composerStartRestartGroup;
            Modifier modifierM788paddingqDBjuR0$default = PaddingKt.m788paddingqDBjuR0$default(boxScopeInstance.align(companion3, companion.getCenterEnd()), 0.0f, 0.0f, ChaloTheme.b(composer2, 6).f, 0.0f, 11, null);
            IconType iconType2 = IconType.IC_NEXT;
            boolean zChangedInstance2 = composer2.changedInstance(scope) | composer2.changed(iIntValue) | (i4 == 32);
            Object objRememberedValue4 = composer2.rememberedValue();
            if (zChangedInstance2 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue4 = new a(scope, iIntValue, pagerState2, 2);
                composer2.updateRememberedValue(objRememberedValue4);
            }
            a(modifierM788paddingqDBjuR0$default, iconType2, (Function0) objRememberedValue4, composer2, 48);
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            pagerState2 = pagerState;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new r80(modifier, pagerState2, imageList, scope, i));
        }
    }
}
