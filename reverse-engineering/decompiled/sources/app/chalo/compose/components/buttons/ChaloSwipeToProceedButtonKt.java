package app.chalo.compose.components.buttons;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.gestures.AnchoredDraggableDefaults;
import androidx.compose.foundation.gestures.AnchoredDraggableKt;
import androidx.compose.foundation.gestures.AnchoredDraggableState;
import androidx.compose.foundation.gestures.DraggableAnchors;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.draw.RotateKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import app.chalo.compose.components.ComposeUtils_androidKt;
import app.chalo.compose.components.buttons.ChaloSwipeToProceedButtonKt;
import app.chalo.compose.resources.PainterResourceHelperKt;
import app.chalo.compose.resources.StringResourcesHelperKt;
import app.chalo.compose.theme.ChaloTheme;
import app.chalo.compose.theme.ChaloTypographyKt;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.providers.stringprovider.StringEnum;
import defpackage.am;
import defpackage.ch;
import defpackage.i3;
import defpackage.pk0;
import defpackage.xl;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002¨\u0006\u0002²\u0006\u000e\u0010\u0001\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002"}, d2 = {"", "hasTriggered", "chalo-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ChaloSwipeToProceedButtonKt {
    public static final void a(final Modifier modifier, final StringEnum stringEnum, final IconType iconType, final IconType iconType2, final double d, final Function0 onSwipe, Composer composer, final int i) {
        int i2;
        Composer composer2;
        float f;
        AnchoredDraggableState anchoredDraggableState;
        float f2;
        int i3;
        Intrinsics.i(onSwipe, "onSwipe");
        Composer composerStartRestartGroup = composer.startRestartGroup(1174887009);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(stringEnum == null ? -1 : stringEnum.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(iconType == null ? -1 : iconType.ordinal()) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changed(iconType2 == null ? -1 : iconType2.ordinal()) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changed(d) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onSwipe) ? 131072 : 65536;
        }
        int i4 = i2;
        if (composerStartRestartGroup.shouldExecute((74899 & i4) != 74898, i4 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1174887009, i4, -1, "app.chalo.compose.components.buttons.ChaloSwipeToProceedButton (ChaloSwipeToProceedButton.kt:58)");
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.f17583a, composerStartRestartGroup);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            float fC = ComposeUtils_androidKt.c(composerStartRestartGroup);
            float f3 = ChaloTheme.b(composerStartRestartGroup, 6).m;
            Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            float fMo404toPx0680j_4 = density.mo404toPx0680j_4(Dp.m7278constructorimpl(fC - Dp.m7278constructorimpl(((float) 1.8d) * f3)));
            boolean zChanged = composerStartRestartGroup.changed(fMo404toPx0680j_4);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new xl(fMo404toPx0680j_4, 0);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            DraggableAnchors DraggableAnchors = AnchoredDraggableKt.DraggableAnchors((Function1) objRememberedValue2);
            int i5 = i4 & 57344;
            boolean z = i5 == 16384;
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue3 == companion.getEmpty()) {
                ConfirmationState confirmationState = ConfirmationState.DEFAULT;
                Function1 function1 = new Function1() { // from class: yl
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return Float.valueOf(((Float) obj).floatValue() * ((float) d));
                    }
                };
                i3 i3Var = new i3(density, 1);
                AnchoredDraggableDefaults anchoredDraggableDefaults = AnchoredDraggableDefaults.INSTANCE;
                objRememberedValue3 = AnchoredDraggableKt.AnchoredDraggableState$default(confirmationState, DraggableAnchors, function1, i3Var, anchoredDraggableDefaults.getSnapAnimationSpec(), anchoredDraggableDefaults.getDecayAnimationSpec(), null, 64, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            AnchoredDraggableState anchoredDraggableState2 = (AnchoredDraggableState) objRememberedValue3;
            float offset = anchoredDraggableState2.getOffset() != 0.0f ? anchoredDraggableState2.getOffset() / fMo404toPx0680j_4 : 0.0f;
            boolean z2 = i5 == 16384;
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (z2 || objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            MutableState mutableState = (MutableState) objRememberedValue4;
            Float fValueOf = Float.valueOf(fMo404toPx0680j_4);
            boolean zChanged2 = (i5 == 16384) | composerStartRestartGroup.changed(anchoredDraggableState2) | composerStartRestartGroup.changed(fMo404toPx0680j_4) | composerStartRestartGroup.changed(mutableState) | ((i4 & 458752) == 131072);
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue5 == companion.getEmpty()) {
                f = fC;
                anchoredDraggableState = anchoredDraggableState2;
                f2 = f3;
                i3 = 6;
                ChaloSwipeToProceedButtonKt$ChaloSwipeToProceedButton$1$1 chaloSwipeToProceedButtonKt$ChaloSwipeToProceedButton$1$1 = new ChaloSwipeToProceedButtonKt$ChaloSwipeToProceedButton$1$1(anchoredDraggableState, fMo404toPx0680j_4, d, onSwipe, mutableState, null);
                composerStartRestartGroup.updateRememberedValue(chaloSwipeToProceedButtonKt$ChaloSwipeToProceedButton$1$1);
                objRememberedValue5 = chaloSwipeToProceedButtonKt$ChaloSwipeToProceedButton$1$1;
            } else {
                f2 = f3;
                anchoredDraggableState = anchoredDraggableState2;
                i3 = 6;
                f = fC;
            }
            EffectsKt.LaunchedEffect(anchoredDraggableState, fValueOf, (Function2) objRememberedValue5, composerStartRestartGroup, 0);
            Modifier modifierM263backgroundbw27NRU = BackgroundKt.m263backgroundbw27NRU(AnchoredDraggableKt.anchoredDraggable$default(SizeKt.m833width3ABfNKs(modifier, f), anchoredDraggableState, Orientation.Horizontal, false, null, null, null, 60, null), ChaloTheme.a(composerStartRestartGroup, i3).f1915a, ChaloTheme.d(composerStartRestartGroup, i3).b);
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i6 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM263backgroundbw27NRU);
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
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl, Integer.valueOf(i6), composerM3915constructorimpl));
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Modifier.Companion companion4 = Modifier.INSTANCE;
            Modifier modifierAlign = boxScopeInstance.align(AlphaKt.alpha(companion4, 1.0f - offset), companion2.getCenter());
            int iM7168getCentere0LSkKk = TextAlign.INSTANCE.m7168getCentere0LSkKk();
            String strC = StringResourcesHelperKt.c(stringEnum, new Object[0], composerStartRestartGroup, (i4 >> 3) & 14);
            TextStyle textStyleH = ChaloTypographyKt.h(ChaloTheme.e(composerStartRestartGroup, i3));
            AnchoredDraggableState anchoredDraggableState3 = anchoredDraggableState;
            float f4 = f2;
            TextKt.m2623TextNvy7gAk(strC, modifierAlign, Color.INSTANCE.m4642getWhite0d7_KjU(), null, 0L, null, null, null, 0L, null, TextAlign.m7161boximpl(iM7168getCentere0LSkKk), 0L, 0, false, 0, 0, null, textStyleH, composerStartRestartGroup, 384, 0, 130040);
            composer2 = composerStartRestartGroup;
            boolean zChanged3 = composer2.changed(anchoredDraggableState3);
            Object objRememberedValue6 = composer2.rememberedValue();
            if (zChanged3 || objRememberedValue6 == companion.getEmpty()) {
                objRememberedValue6 = new ch(anchoredDraggableState3, 15);
                composer2.updateRememberedValue(objRememberedValue6);
            }
            b(SizeKt.m828size3ABfNKs(OffsetKt.offset(companion4, (Function1) objRememberedValue6), f4), offset, iconType, iconType2, composer2, i4 & 8064);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: zl
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    ChaloSwipeToProceedButtonKt.a(modifier, stringEnum, iconType, iconType2, d, onSwipe, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                    return Unit.f17538a;
                }
            });
        }
    }

    public static final void b(Modifier modifier, float f, IconType iconType, IconType iconType2, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-113795900);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(f) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(iconType.ordinal()) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changed(iconType2.ordinal()) ? 2048 : 1024;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 1171) != 1170, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-113795900, i2, -1, "app.chalo.compose.components.buttons.DraggableControl (ChaloSwipeToProceedButton.kt:148)");
            }
            Modifier modifierM263backgroundbw27NRU = BackgroundKt.m263backgroundbw27NRU(PaddingKt.m784padding3ABfNKs(modifier, ChaloTheme.b(composerStartRestartGroup, 6).d), Color.INSTANCE.m4642getWhite0d7_KjU(), RoundedCornerShapeKt.m1074RoundedCornerShape0680j_4(ChaloTheme.b(composerStartRestartGroup, 6).c));
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getCenter(), false);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM263backgroundbw27NRU);
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
            float fC = c(f, 0.0f, 90.0f);
            float fC2 = c(f, 1.0f, 0.0f);
            float fC3 = c(f, -90.0f, 0.0f) - 90.0f;
            float fC4 = c(f, 0.0f, 1.0f);
            Painter painterA = PainterResourceHelperKt.a(iconType2, composerStartRestartGroup, (i2 >> 9) & 14);
            long j = ChaloTheme.a(composerStartRestartGroup, 6).f1915a;
            Modifier.Companion companion2 = Modifier.INSTANCE;
            Modifier modifierAlpha = AlphaKt.alpha(RotateKt.rotate(companion2, fC3), fC4);
            int i4 = Painter.$stable | 48;
            IconKt.m2070Iconww6aTOc(painterA, "Confirm Icon", modifierAlpha, j, composerStartRestartGroup, i4, 0);
            IconKt.m2070Iconww6aTOc(PainterResourceHelperKt.a(iconType, composerStartRestartGroup, (i2 >> 6) & 14), "Swipe Icon", AlphaKt.alpha(RotateKt.rotate(companion2, fC), fC2), ChaloTheme.a(composerStartRestartGroup, 6).f1915a, composerStartRestartGroup, i4, 0);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new am(modifier, f, iconType, iconType2, i, 0));
        }
    }

    public static final float c(float f, float f2, float f3) {
        if (f <= 0.2f) {
            return f2;
        }
        if (f > 0.85f) {
            return f3 - f2;
        }
        if (f3 < f2) {
            float f4 = f2 - f3;
            return f4 - (((f - 0.2f) * f4) / 0.65000004f);
        }
        return ((f3 - f2) * (f - 0.2f)) / 0.65000004f;
    }
}
