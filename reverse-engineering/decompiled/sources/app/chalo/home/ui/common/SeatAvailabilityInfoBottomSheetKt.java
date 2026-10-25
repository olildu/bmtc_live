package app.chalo.home.ui.common;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import app.chalo.compose.components.ChaloSpacersKt;
import app.chalo.compose.components.buttons.ChaloFilledButtonKt;
import app.chalo.compose.resources.PainterResourceHelperKt;
import app.chalo.compose.resources.StringResourcesHelperKt;
import app.chalo.compose.theme.ChaloTheme;
import app.chalo.compose.theme.ChaloTypographyKt;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.providers.stringprovider.StringEnum;
import defpackage.gf;
import defpackage.o01;
import defpackage.og;
import defpackage.pk0;
import defpackage.q10;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"home_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class SeatAvailabilityInfoBottomSheetKt {
    public static final void a(Function0 onPositiveCTAClick, Function0 function0, String str, String str2, String str3, String str4, String str5, boolean z, Composer composer, int i) {
        int i2;
        Function0 function1;
        Composer composer2;
        int i3;
        int i4;
        Modifier.Companion companion;
        Modifier modifier;
        Function0 onNegativeCTAClick = function0;
        Intrinsics.i(onPositiveCTAClick, "onPositiveCTAClick");
        Intrinsics.i(onNegativeCTAClick, "onNegativeCTAClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1173970995);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(onPositiveCTAClick) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onNegativeCTAClick) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(str) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changed(str2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changed(str3) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerStartRestartGroup.changed(str4) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= composerStartRestartGroup.changed(str5) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 8388608 : 4194304;
        }
        if (composerStartRestartGroup.shouldExecute((4793491 & i2) != 4793490, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1173970995, i2, -1, "app.chalo.home.ui.common.SeatAvailabilityInfoBottomSheet (SeatAvailabilityInfoBottomSheet.kt:36)");
            }
            Modifier.Companion companion2 = Modifier.INSTANCE;
            Modifier modifierM787paddingqDBjuR0 = PaddingKt.m787paddingqDBjuR0(BackgroundKt.m264backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), ChaloTheme.a(composerStartRestartGroup, 0).t, null, 2, null), ChaloTheme.b(composerStartRestartGroup, 0).h, ChaloTheme.b(composerStartRestartGroup, 0).i, ChaloTheme.b(composerStartRestartGroup, 0).h, ChaloTheme.b(composerStartRestartGroup, 0).h);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i5 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM787paddingqDBjuR0);
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
            pk0.v(companion3, composerM3915constructorimpl, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl, Integer.valueOf(i5), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            if (str == null) {
                composerStartRestartGroup.startReplaceGroup(42553655);
                composerStartRestartGroup.endReplaceGroup();
                companion = companion2;
                composer2 = composerStartRestartGroup;
                i3 = i2;
                i4 = 0;
            } else {
                composerStartRestartGroup.startReplaceGroup(42553656);
                i3 = i2;
                i4 = 0;
                companion = companion2;
                TextKt.m2623TextNvy7gAk(str, null, ChaloTheme.a(composerStartRestartGroup, 0).g, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTypographyKt.a(ChaloTheme.e(composerStartRestartGroup, 0).getDisplaySmall()), composerStartRestartGroup, 0, 0, 131066);
                composer2 = composerStartRestartGroup;
                gf.r(companion, ChaloTheme.b(composer2, 0).B, composer2, 0);
            }
            if (str2 == null) {
                composer2.startReplaceGroup(42853177);
                composer2.endReplaceGroup();
                modifier = null;
            } else {
                composer2.startReplaceGroup(42853178);
                modifier = null;
                b(48, composer2, null, IconType.SEATS_AVAILABLE, str2);
                composer2.endReplaceGroup();
            }
            if (str3 == null) {
                composer2.startReplaceGroup(43059606);
                composer2.endReplaceGroup();
            } else {
                composer2.startReplaceGroup(43059607);
                b(48, composer2, modifier, IconType.STANDING_AVAILABLE, str3);
                composer2.endReplaceGroup();
            }
            if (str4 == null) {
                composer2.startReplaceGroup(43267709);
                composer2.endReplaceGroup();
            } else {
                composer2.startReplaceGroup(43267710);
                b(48, composer2, modifier, IconType.OVERCROWDED, str4);
                composer2.endReplaceGroup();
            }
            if (str5 == null) {
                composer2.startReplaceGroup(43476153);
            } else {
                composer2.startReplaceGroup(43476154);
                ChaloSpacersKt.p(composer2, i4);
                Composer composer3 = composer2;
                TextKt.m2623TextNvy7gAk(str5, null, ChaloTheme.a(composer2, i4).g, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTheme.e(composer2, i4).getBodySmall(), composer3, (i3 >> 18) & 14, 0, 131066);
                composer2 = composer3;
            }
            composer2.endReplaceGroup();
            ChaloSpacersKt.p(composer2, i4);
            String strC = StringResourcesHelperKt.c(StringEnum.GOT_IT, new Object[i4], composer2, 6);
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            int i6 = (i3 & 14) == 4 ? 1 : i4;
            Object objRememberedValue = composer2.rememberedValue();
            if (i6 != 0 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                function1 = onPositiveCTAClick;
                objRememberedValue = new o01(function1, 15);
                composer2.updateRememberedValue(objRememberedValue);
            } else {
                function1 = onPositiveCTAClick;
            }
            ChaloFilledButtonKt.g(modifierFillMaxWidth$default, strC, null, 0L, null, false, 0.0f, null, 0L, (Function0) objRememberedValue, composer2, 6, TypedValues.PositionType.TYPE_CURVE_FIT);
            if (z) {
                composer2.startReplaceGroup(43979222);
                ChaloSpacersKt.o(composer2, i4);
                String strC2 = StringResourcesHelperKt.c(StringEnum.LEARN_MORE_CAPS, new Object[i4], composer2, 6);
                Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                int i7 = (i3 & 112) == 32 ? 1 : i4;
                Object objRememberedValue2 = composer2.rememberedValue();
                if (i7 != 0 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    onNegativeCTAClick = function0;
                    objRememberedValue2 = new o01(onNegativeCTAClick, 16);
                    composer2.updateRememberedValue(objRememberedValue2);
                } else {
                    onNegativeCTAClick = function0;
                }
                ChaloFilledButtonKt.f(strC2, false, modifierFillMaxWidth$default2, null, null, 0.0f, 0L, (Function0) objRememberedValue2, composer2, 384, 122);
            } else {
                onNegativeCTAClick = function0;
                composer2.startReplaceGroup(40671243);
            }
            composer2.endReplaceGroup();
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            function1 = onPositiveCTAClick;
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new og(function1, onNegativeCTAClick, str, str2, str3, str4, str5, z, i));
        }
    }

    public static final void b(int i, Composer composer, Modifier modifier, IconType seatAvailabilityLevelResId, String infoText) {
        Composer composer2;
        Modifier modifier2;
        Intrinsics.i(seatAvailabilityLevelResId, "seatAvailabilityLevelResId");
        Intrinsics.i(infoText, "infoText");
        Composer composerStartRestartGroup = composer.startRestartGroup(1140499182);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(seatAvailabilityLevelResId.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(infoText) ? 256 : 128;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            Modifier.Companion companion = Modifier.INSTANCE;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1140499182, i2, -1, "app.chalo.home.ui.common.SeatAvailabilityLevelWithInfoText (SeatAvailabilityInfoBottomSheet.kt:113)");
            }
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getCenterVertically(), composerStartRestartGroup, 48);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) ((currentCompositeKeyHashCode >>> 32) ^ currentCompositeKeyHashCode);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion);
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
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl, Integer.valueOf(i3), composerM3915constructorimpl));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            ImageKt.Image(PainterResourceHelperKt.a(seatAvailabilityLevelResId, composerStartRestartGroup, (i2 >> 3) & 14), (String) null, PaddingKt.m788paddingqDBjuR0$default(SizeKt.m828size3ABfNKs(companion, ChaloTheme.b(composerStartRestartGroup, 0).m), 0.0f, 0.0f, ChaloTheme.b(composerStartRestartGroup, 0).f, 0.0f, 11, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, Painter.$stable | 48, 120);
            composer2 = composerStartRestartGroup;
            TextKt.m2623TextNvy7gAk(infoText, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTheme.e(composerStartRestartGroup, 0).getBodyMedium(), composer2, (i2 >> 6) & 14, 0, 131070);
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = companion;
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
            modifier2 = modifier;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new q10(modifier2, seatAvailabilityLevelResId, infoText, i, 2));
        }
    }
}
