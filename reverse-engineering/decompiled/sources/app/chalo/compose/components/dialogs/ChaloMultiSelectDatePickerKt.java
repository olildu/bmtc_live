package app.chalo.compose.components.dialogs;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.AspectRatioKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.FlowLayoutKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import app.chalo.compose.components.ChaloTextViewKt;
import app.chalo.compose.components.TextKt;
import app.chalo.compose.components.buttons.ChaloFilledButtonKt;
import app.chalo.compose.components.image.CommonImageKt;
import app.chalo.compose.components.shimmer.ShimmerEffectKt;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.compose.theme.ChaloThemeKt;
import app.chalo.uistate.base.BorderUISpec;
import app.chalo.uistate.base.BorderUISpecKt;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.ChaloColorTokenKt;
import app.chalo.uistate.dialog.AvailabilityStatusLineUIState;
import app.chalo.uistate.dialog.CalendarDateUISpec;
import app.chalo.uistate.dialog.CalendarDateUIState;
import app.chalo.uistate.dialog.CalendarMonthUIState;
import app.chalo.uistate.dialog.DatesLoadingUIState;
import app.chalo.uistate.dialog.DotUIState;
import app.chalo.uistate.dialog.LegendUIState;
import app.chalo.uistate.dialog.MultiSelectDatePickerSpec;
import app.chalo.uistate.dialog.MultiSelectDatePickerUIState;
import app.chalo.uistate.dialog.WeekDayHeaderUIState;
import app.chalo.uistate.divider.DividerUIState;
import app.chalo.uistate.divider.DividerUIStateKt;
import app.chalo.uistate.text.TextUIState;
import defpackage.b3;
import defpackage.ch;
import defpackage.d0;
import defpackage.eh;
import defpackage.fi;
import defpackage.fj;
import defpackage.gf;
import defpackage.i41;
import defpackage.mk;
import defpackage.pk0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"chalo-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ChaloMultiSelectDatePickerKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v2, types: [androidx.compose.ui.Alignment$Vertical, androidx.compose.ui.Modifier, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r24v2 */
    public static final void a(MultiSelectDatePickerUIState state, Modifier modifier, Composer composer, int i) {
        int i2;
        Composer composer2;
        Object obj;
        ChaloPadding chaloPadding;
        ?? r14;
        Composer composer3;
        MultiSelectDatePickerSpec multiSelectDatePickerSpec;
        Modifier.Companion companion;
        Modifier.Companion companion2;
        MultiSelectDatePickerSpec multiSelectDatePickerSpec2;
        ChaloPadding chaloPadding2;
        Object obj2;
        float f;
        int i3;
        int i4;
        Intrinsics.i(state, "state");
        DatesLoadingUIState datesLoadingUIState = state.h;
        DividerUIState dividerUIState = state.i;
        TextUIState textUIState = state.b;
        TextUIState textUIState2 = state.f10009a;
        Object obj3 = state.j;
        Composer composerStartRestartGroup = composer.startRestartGroup(1636837062);
        if ((i & 6) == 0) {
            i2 = i | (composerStartRestartGroup.changedInstance(state) ? 4 : 2);
        } else {
            i2 = i;
        }
        int i5 = i2 | 48;
        if (composerStartRestartGroup.shouldExecute((i5 & 19) != 18, i5 & 1)) {
            Modifier.Companion companion3 = Modifier.INSTANCE;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1636837062, i5, -1, "app.chalo.compose.components.dialogs.ChaloMultiSelectDatePicker (ChaloMultiSelectDatePicker.kt:58)");
            }
            boolean zChanged = composerStartRestartGroup.changed(obj3);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                composerStartRestartGroup.updateRememberedValue(obj3);
            } else {
                obj3 = objRememberedValue;
            }
            MultiSelectDatePickerSpec multiSelectDatePickerSpec3 = (MultiSelectDatePickerSpec) obj3;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null);
            ChaloColorToken chaloColorToken = multiSelectDatePickerSpec3.f10008a;
            ChaloPadding chaloPadding3 = multiSelectDatePickerSpec3.d;
            Modifier modifierC = ChaloThemeKt.c(BackgroundKt.m264backgroundbw27NRU$default(modifierFillMaxWidth$default, ChaloColorTokenKt.c(chaloColorToken), null, 2, null), multiSelectDatePickerSpec3.b);
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion4 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion4.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i6 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierC);
            ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion5.getConstructor();
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
            pk0.v(companion5, composerM3915constructorimpl, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion5, composerM3915constructorimpl, Integer.valueOf(i6), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            Alignment.Vertical centerVertically = companion4.getCenterVertically();
            Modifier modifierC2 = ChaloThemeKt.c(companion3, chaloPadding3);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), centerVertically, composerStartRestartGroup, 48);
            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i7 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierC2);
            Function0<ComposeUiNode> constructor2 = companion5.getConstructor();
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
            pk0.v(companion5, composerM3915constructorimpl2, measurePolicyRowMeasurePolicy, composerM3915constructorimpl2, currentCompositionLocalMap2);
            Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion5, composerM3915constructorimpl2, Integer.valueOf(i7), composerM3915constructorimpl2));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            if (textUIState2 == null) {
                composerStartRestartGroup.startReplaceGroup(1231829485);
                composerStartRestartGroup.endReplaceGroup();
                chaloPadding = chaloPadding3;
                composer3 = composerStartRestartGroup;
                r14 = 0;
            } else {
                composerStartRestartGroup.startReplaceGroup(1231829486);
                chaloPadding = chaloPadding3;
                r14 = 0;
                TextKt.c(textUIState2, null, null, null, composerStartRestartGroup, 0, 14);
                composer3 = composerStartRestartGroup;
                composer3.endReplaceGroup();
            }
            SpacerKt.Spacer(i41.a(rowScopeInstance, companion3, 1.0f, false, 2, null), composer3, 0);
            Composer composer4 = composer3;
            CommonImageKt.a(state.e, null, false, composer4, 0, 6);
            composer2 = composer4;
            composer2.endNode();
            if (textUIState == null) {
                composer2.startReplaceGroup(1095993901);
                composer2.endReplaceGroup();
                multiSelectDatePickerSpec = multiSelectDatePickerSpec3;
                companion = companion3;
            } else {
                composer2.startReplaceGroup(1095993902);
                SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion3, multiSelectDatePickerSpec3.j), composer2, 0);
                Modifier modifierC3 = ChaloThemeKt.c(companion3, chaloPadding);
                multiSelectDatePickerSpec = multiSelectDatePickerSpec3;
                companion = companion3;
                TextKt.c(textUIState, modifierC3, null, null, composer2, 0, 12);
                gf.r(companion, multiSelectDatePickerSpec.k, composer2, 0);
            }
            if (textUIState2 == null && textUIState == null) {
                composer2.startReplaceGroup(1092790982);
            } else {
                composer2.startReplaceGroup(1096373993);
                DividerUIStateKt.a(r14, dividerUIState, composer2, 0, 1);
            }
            composer2.endReplaceGroup();
            e(state.k, composer2, 0);
            if (state.c != null) {
                composer2.startReplaceGroup(1096548399);
                Modifier modifierC4 = ChaloThemeKt.c(SizeKt.fillMaxWidth$default(SizeKt.m816heightInVpY3zN4$default(SizeKt.wrapContentHeight$default(companion, r14, false, 3, r14), 0.0f, multiSelectDatePickerSpec.c, 1, r14), 0.0f, 1, r14), chaloPadding);
                boolean zChangedInstance = composer2.changedInstance(state);
                Object objRememberedValue2 = composer2.rememberedValue();
                if (zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new ch(state, 14);
                    composer2.updateRememberedValue(objRememberedValue2);
                }
                companion2 = companion;
                multiSelectDatePickerSpec2 = multiSelectDatePickerSpec;
                chaloPadding2 = chaloPadding;
                LazyDslKt.LazyColumn(modifierC4, null, null, false, null, null, null, false, null, (Function1) objRememberedValue2, composer2, 0, TypedValues.PositionType.TYPE_POSITION_TYPE);
                composer2 = composer2;
            } else {
                companion2 = companion;
                multiSelectDatePickerSpec2 = multiSelectDatePickerSpec;
                chaloPadding2 = chaloPadding;
                composer2.startReplaceGroup(1092790982);
            }
            composer2.endReplaceGroup();
            if (datesLoadingUIState != null) {
                composer2.startReplaceGroup(1097175033);
                Modifier modifierC5 = ChaloThemeKt.c(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), chaloPadding2);
                float f2 = datesLoadingUIState.f9985a;
                Composer composer5 = composer2;
                obj2 = null;
                ShimmerEffectKt.a(modifierC5, f2, 0.0f, null, 0L, 0L, composer5, 0, 60);
                composer2 = composer5;
                composer2.endReplaceGroup();
                f = 0.0f;
            } else {
                obj2 = null;
                f = 0.0f;
                composer2.startReplaceGroup(1092790982);
                composer2.endReplaceGroup();
            }
            SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion2, multiSelectDatePickerSpec2.i), composer2, 0);
            List list = state.d;
            if (list == null) {
                composer2.startReplaceGroup(1097526913);
                composer2.endReplaceGroup();
                i4 = 0;
                i3 = 1;
            } else {
                composer2.startReplaceGroup(1097526914);
                Modifier modifierC6 = ChaloThemeKt.c(SizeKt.fillMaxWidth$default(companion2, f, 1, obj2), chaloPadding2);
                Alignment.Vertical centerVertically2 = companion4.getCenterVertically();
                ComposableLambda composableLambdaRememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(-730302275, true, new d0(14, list, multiSelectDatePickerSpec2), composer2, 54);
                Composer composer6 = composer2;
                i3 = 1;
                i4 = 0;
                FlowLayoutKt.FlowRow(modifierC6, null, null, centerVertically2, 0, 0, composableLambdaRememberComposableLambda, composer6, 1575936, 54);
                composer2 = composer6;
                composer2.endReplaceGroup();
            }
            SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion2, multiSelectDatePickerSpec2.h), composer2, i4);
            DividerUIStateKt.a(null, dividerUIState, composer2, i4, i3);
            SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion2, multiSelectDatePickerSpec2.g), composer2, i4);
            ChaloFilledButtonKt.a(i4, i4, composer2, ChaloThemeKt.c(SizeKt.fillMaxWidth$default(companion2, 0.0f, i3, null), chaloPadding2), state.f);
            SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion2, multiSelectDatePickerSpec2.f), composer2, i4);
            if (b3.s(i4, i4, composer2, ChaloThemeKt.c(SizeKt.fillMaxWidth$default(companion2, 0.0f, i3, null), chaloPadding2), state.g)) {
                ComposerKt.traceEventEnd();
            }
            obj = companion2;
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
            obj = modifier;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new fj(state, obj, false, i, 8));
        }
    }

    public static final void b(CalendarDateUIState calendarDateUIState, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(820055150);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(calendarDateUIState) : composerStartRestartGroup.changedInstance(calendarDateUIState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(820055150, i2, -1, "app.chalo.compose.components.dialogs.DateCell (ChaloMultiSelectDatePicker.kt:236)");
            }
            CalendarDateUISpec calendarDateUISpec = calendarDateUIState.d;
            BorderUISpec borderUISpec = calendarDateUISpec.c;
            AvailabilityStatusLineUIState availabilityStatusLineUIState = calendarDateUIState.c;
            DotUIState dotUIState = calendarDateUIState.b;
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierM264backgroundbw27NRU$default = BackgroundKt.m264backgroundbw27NRU$default(ClipKt.clip(BorderUISpecKt.a(AspectRatioKt.aspectRatio$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 1.0f, false, 2, null), borderUISpec), ChaloThemeKt.d(borderUISpec.c)), ChaloColorTokenKt.c(calendarDateUISpec.f9968a), null, 2, null);
            boolean z = (i2 & 14) == 4 || ((i2 & 8) != 0 && composerStartRestartGroup.changedInstance(calendarDateUIState));
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new fi(calendarDateUIState, 8);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            Modifier modifierM299clickableoSLSa3U$default = ClickableKt.m299clickableoSLSa3U$default(modifierM264backgroundbw27NRU$default, true, null, null, null, (Function0) objRememberedValue, 14, null);
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM299clickableoSLSa3U$default);
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
            TextKt.c(calendarDateUIState.f9969a, boxScopeInstance.align(companion, companion2.getCenter()), null, null, composerStartRestartGroup, 0, 12);
            if (dotUIState != null) {
                composerStartRestartGroup.startReplaceGroup(1971975242);
                BoxKt.Box(BackgroundKt.m263backgroundbw27NRU(SizeKt.m828size3ABfNKs(ChaloThemeKt.c(boxScopeInstance.align(companion, companion2.getBottomCenter()), dotUIState.c), dotUIState.f9992a), ChaloColorTokenKt.c(ChaloColorToken.OrangePrimary.f9835a), ChaloThemeKt.d(dotUIState.b)), composerStartRestartGroup, 0);
            } else {
                composerStartRestartGroup.startReplaceGroup(1963275278);
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1972507016);
            BoxKt.Box(BackgroundKt.m263backgroundbw27NRU(SizeKt.m814height3ABfNKs(SizeKt.fillMaxWidth$default(boxScopeInstance.align(companion, companion2.getBottomCenter()), 0.0f, 1, null), availabilityStatusLineUIState.f9965a), ChaloColorTokenKt.c(availabilityStatusLineUIState.b), ChaloThemeKt.d(availabilityStatusLineUIState.c)), composerStartRestartGroup, 0);
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new mk(calendarDateUIState, i, 2));
        }
    }

    public static final void c(LegendUIState legendUIState, Composer composer, int i) {
        int i2;
        Intrinsics.i(legendUIState, "legendUIState");
        Composer composerStartRestartGroup = composer.startRestartGroup(1827405791);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(legendUIState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1827405791, i2, -1, "app.chalo.compose.components.dialogs.LegendItem (ChaloMultiSelectDatePicker.kt:160)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
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
            BoxKt.Box(BackgroundKt.m263backgroundbw27NRU(SizeKt.m828size3ABfNKs(companion, legendUIState.f10004a), ChaloColorTokenKt.c(legendUIState.b), ChaloThemeKt.d(ChaloThemeHelper.d.f)), composerStartRestartGroup, 0);
            SpacerKt.Spacer(SizeKt.m833width3ABfNKs(companion, legendUIState.d), composerStartRestartGroup, 0);
            TextKt.c(legendUIState.c, null, null, null, composerStartRestartGroup, 0, 14);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new mk(legendUIState, i, 3));
        }
    }

    public static final void d(CalendarMonthUIState calendarMonthUIState, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1109618863);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(calendarMonthUIState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1109618863, i2, -1, "app.chalo.compose.components.dialogs.MonthHeader (ChaloMultiSelectDatePicker.kt:199)");
            }
            ChaloTextViewKt.a(ChaloThemeKt.c(Modifier.INSTANCE, calendarMonthUIState.b), calendarMonthUIState.f9970a, null, null, composerStartRestartGroup, 0, 12);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new mk(calendarMonthUIState, i, 5));
        }
    }

    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v4 */
    public static final void e(WeekDayHeaderUIState weekDayHeaderUIState, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1342135304);
        int i3 = 2;
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(weekDayHeaderUIState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        ?? r12 = 0;
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1342135304, i2, -1, "app.chalo.compose.components.dialogs.WeekDayHeaderRow (ChaloMultiSelectDatePicker.kt:176)");
            }
            Modifier modifierC = ChaloThemeKt.c(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), weekDayHeaderUIState.b);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getSpaceEvenly(), Alignment.INSTANCE.getTop(), composerStartRestartGroup, 6);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i4 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierC);
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
            pk0.v(companion, composerM3915constructorimpl, measurePolicyRowMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion, composerM3915constructorimpl, Integer.valueOf(i4), composerM3915constructorimpl));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(121800509);
            ArrayList arrayList = weekDayHeaderUIState.f10015a;
            int size = arrayList.size();
            int i5 = 0;
            while (i5 < size) {
                int i6 = i5 + 1;
                TextUIState textUIState = (TextUIState) arrayList.get(i5);
                Modifier modifierAspectRatio$default = AspectRatioKt.aspectRatio$default(i41.a(rowScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null), 1.0f, r12, i3, null);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getCenter(), r12);
                long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, r12);
                int i7 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierAspectRatio$default);
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
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
                pk0.v(companion2, composerM3915constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3915constructorimpl2, currentCompositionLocalMap2);
                Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl2, Integer.valueOf(i7), composerM3915constructorimpl2));
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                TextKt.c(textUIState, null, null, null, composerStartRestartGroup, 0, 14);
                composerStartRestartGroup.endNode();
                size = size;
                i5 = i6;
                i3 = 2;
                r12 = 0;
            }
            if (b3.t(composerStartRestartGroup)) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new mk(weekDayHeaderUIState, i, 4));
        }
    }

    public static final void f(List list, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(501830055);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(list) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(501830055, i2, -1, "app.chalo.compose.components.dialogs.WeekRow (ChaloMultiSelectDatePicker.kt:207)");
            }
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getSpaceEvenly(), Alignment.INSTANCE.getTop(), composerStartRestartGroup, 6);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            char c = ' ';
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
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
            pk0.v(companion, composerM3915constructorimpl, measurePolicyRowMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion, composerM3915constructorimpl, Integer.valueOf(i3), composerM3915constructorimpl));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(782328700);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                CalendarDateUIState calendarDateUIState = (CalendarDateUIState) it.next();
                if (calendarDateUIState != null) {
                    composerStartRestartGroup.startReplaceGroup(-548814147);
                    Modifier modifierC = ChaloThemeKt.c(AspectRatioKt.aspectRatio$default(i41.a(rowScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null), 1.0f, false, 2, null), calendarDateUIState.d.d);
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getCenter(), false);
                    long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                    int i4 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> c));
                    CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierC);
                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
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
                    pk0.v(companion2, composerM3915constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3915constructorimpl2, currentCompositionLocalMap2);
                    Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl2, Integer.valueOf(i4), composerM3915constructorimpl2));
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    b(calendarDateUIState, composerStartRestartGroup, 0);
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    composerStartRestartGroup.startReplaceGroup(-548464622);
                    BoxKt.Box(AspectRatioKt.aspectRatio$default(i41.a(rowScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null), 1.0f, false, 2, null), composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceGroup();
                }
                c = ' ';
            }
            if (b3.t(composerStartRestartGroup)) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new eh(list, i, 4));
        }
    }
}
