package app.chalo.instantticket.ui.faredetails.compose;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
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
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.media3.extractor.WavUtil;
import app.chalo.compose.components.buttons.ChaloFilledButtonKt;
import app.chalo.compose.resources.StringResourcesHelperKt;
import app.chalo.compose.theme.ChaloTheme;
import app.chalo.compose.theme.ChaloTypographyKt;
import app.chalo.providers.stringprovider.StringEnum;
import defpackage.fk;
import defpackage.g5;
import defpackage.jh;
import defpackage.nk;
import defpackage.pk0;
import defpackage.qg;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002¨\u0006\u0004²\u0006\u000e\u0010\u0001\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0003\u001a\u00020\u00028\n@\nX\u008a\u008e\u0002"}, d2 = {"", "isClickable", "Landroidx/compose/ui/text/AnnotatedString;", "finalText", "productbooking_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class FareDetailsCTAViewKt {
    public static final void a(Modifier modifier, boolean z, String totalAmount, String str, boolean z2, Function0 onPayButtonClick, Function0 onReadMoreFareNoteClick, Composer composer, int i) {
        int i2;
        String strC;
        Intrinsics.i(totalAmount, "totalAmount");
        Intrinsics.i(onPayButtonClick, "onPayButtonClick");
        Intrinsics.i(onReadMoreFareNoteClick, "onReadMoreFareNoteClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(957989750);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(totalAmount) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changed(str) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changed(z2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onPayButtonClick) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onReadMoreFareNoteClick) ? 1048576 : 524288;
        }
        int i3 = i2;
        if (composerStartRestartGroup.shouldExecute((599187 & i3) != 599186, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(957989750, i3, -1, "app.chalo.instantticket.ui.faredetails.compose.FareDetailsCTAView (FareDetailsCTAView.kt:36)");
            }
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i4 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier);
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
            pk0.v(companion, composerM3915constructorimpl, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion, composerM3915constructorimpl, Integer.valueOf(i4), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            Modifier.Companion companion2 = Modifier.INSTANCE;
            SpacerKt.Spacer(SizeKt.m828size3ABfNKs(companion2, ChaloTheme.b(composerStartRestartGroup, 0).h), composerStartRestartGroup, 0);
            if (str == null) {
                composerStartRestartGroup.startReplaceGroup(1195151016);
            } else {
                composerStartRestartGroup.startReplaceGroup(1195151017);
                SpacerKt.Spacer(SizeKt.m828size3ABfNKs(companion2, ChaloTheme.b(composerStartRestartGroup, 0).h), composerStartRestartGroup, 0);
                int i5 = i3 >> 9;
                b(0, (i5 & 14) | 48 | (i5 & 7168), composerStartRestartGroup, SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), str, onReadMoreFareNoteClick);
            }
            composerStartRestartGroup.endReplaceGroup();
            if (z2) {
                composerStartRestartGroup.startReplaceGroup(1195455592);
                SpacerKt.Spacer(SizeKt.m828size3ABfNKs(companion2, ChaloTheme.b(composerStartRestartGroup, 0).h), composerStartRestartGroup, 0);
                c(composerStartRestartGroup, (i3 >> 6) & 14, totalAmount);
            } else {
                composerStartRestartGroup.startReplaceGroup(1193615618);
            }
            composerStartRestartGroup.endReplaceGroup();
            if (z2) {
                composerStartRestartGroup.startReplaceGroup(1195619954);
                strC = StringResourcesHelperKt.c(StringEnum.FARE_DETAILS_PAY, new Object[]{totalAmount}, composerStartRestartGroup, 6);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(1195704584);
                strC = StringResourcesHelperKt.c(StringEnum.PAY_NOW, new Object[0], composerStartRestartGroup, 6);
                composerStartRestartGroup.endReplaceGroup();
            }
            SpacerKt.Spacer(SizeKt.m828size3ABfNKs(companion2, ChaloTheme.b(composerStartRestartGroup, 0).h), composerStartRestartGroup, 0);
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null);
            boolean z3 = (i3 & 458752) == 131072;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z3 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new fk(onPayButtonClick, 25);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            ChaloFilledButtonKt.g(modifierFillMaxWidth$default, strC, null, 0L, null, z, 0.0f, null, 0L, (Function0) objRememberedValue, composerStartRestartGroup, ((i3 << 12) & 458752) | 6, 476);
            SpacerKt.Spacer(SizeKt.m828size3ABfNKs(companion2, ChaloTheme.b(composerStartRestartGroup, 0).h), composerStartRestartGroup, 0);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new jh(modifier, z, totalAmount, str, z2, onPayButtonClick, onReadMoreFareNoteClick, i));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(int i, int i2, Composer composer, Modifier modifier, String str, Function0 function0) {
        int i3;
        Composer composer2;
        int i4;
        String str2;
        MutableState mutableState;
        int i5;
        TextLayoutResult textLayoutResult;
        int i6;
        Object obj;
        int i7;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1680025321);
        if ((i2 & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        int i8 = i3 | 384;
        if ((i2 & 3072) == 0) {
            i8 |= composerStartRestartGroup.changedInstance(function0) ? 2048 : 1024;
        }
        if (composerStartRestartGroup.shouldExecute((i8 & 1171) != 1170, i8 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1680025321, i8, -1, "app.chalo.instantticket.ui.faredetails.compose.FareDetailsFareNote (FareDetailsCTAView.kt:100)");
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            MutableState mutableState2 = (MutableState) objRememberedValue;
            TextLayoutResult textLayoutResult2 = (TextLayoutResult) mutableState2.getValue();
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            MutableState mutableState3 = (MutableState) objRememberedValue2;
            String strC = StringResourcesHelperKt.c(StringEnum.READ_MORE, new Object[0], composerStartRestartGroup, 6);
            long j = ChaloTheme.a(composerStartRestartGroup, 0).B;
            long j2 = ChaloTheme.a(composerStartRestartGroup, 0).i;
            TextStyle textStyleL = ChaloTypographyKt.l(ChaloTheme.e(composerStartRestartGroup, 0));
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
                AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
                int iPushStyle = builder.pushStyle(SpanStyle.m6672copyGSF8kmg$default(textStyleL.toSpanStyle(), j2, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE, null));
                str2 = str;
                try {
                    builder.append(str2);
                    builder.pop(iPushStyle);
                    objRememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(builder.toAnnotatedString(), null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                } catch (Throwable th) {
                    builder.pop(iPushStyle);
                    throw th;
                }
            } else {
                str2 = str;
            }
            MutableState mutableState4 = (MutableState) objRememberedValue3;
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(textLayoutResult2) | ((i8 & 896) == 256) | composerStartRestartGroup.changed(strC) | ((i8 & 14) == 4) | composerStartRestartGroup.changed(textStyleL) | composerStartRestartGroup.changed(j2) | composerStartRestartGroup.changed(j);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue4 == companion.getEmpty()) {
                mutableState = mutableState4;
                i5 = 0;
                textLayoutResult = textLayoutResult2;
                i6 = 3;
                obj = null;
                i7 = 1;
                FareDetailsCTAViewKt$FareDetailsFareNote$1$1 fareDetailsCTAViewKt$FareDetailsFareNote$1$1 = new FareDetailsCTAViewKt$FareDetailsFareNote$1$1(textLayoutResult, 3, strC, str2, textStyleL, j2, j, mutableState, mutableState3, null);
                composerStartRestartGroup.updateRememberedValue(fareDetailsCTAViewKt$FareDetailsFareNote$1$1);
                objRememberedValue4 = fareDetailsCTAViewKt$FareDetailsFareNote$1$1;
            } else {
                textLayoutResult = textLayoutResult2;
                mutableState = mutableState4;
                i6 = 3;
                obj = null;
                i7 = 1;
                i5 = 0;
            }
            EffectsKt.LaunchedEffect(textLayoutResult, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue4, composerStartRestartGroup, TextLayoutResult.$stable);
            AnnotatedString annotatedString = (AnnotatedString) mutableState.getValue();
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier, 0.0f, i7, obj);
            boolean zBooleanValue = ((Boolean) mutableState3.getValue()).booleanValue();
            int i9 = (i8 & 7168) == 2048 ? i7 : i5;
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (i9 != 0 || objRememberedValue5 == companion.getEmpty()) {
                objRememberedValue5 = new fk(function0, 24);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            Modifier modifierM299clickableoSLSa3U$default = ClickableKt.m299clickableoSLSa3U$default(modifierFillMaxWidth$default, zBooleanValue, null, null, null, (Function0) objRememberedValue5, 14, null);
            Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue6 == companion.getEmpty()) {
                objRememberedValue6 = new g5(mutableState2, 18);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
            }
            int i10 = i6;
            composer2 = composerStartRestartGroup;
            TextKt.m2624TextZ58ophY(annotatedString, modifierM299clickableoSLSa3U$default, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, i10, 0, null, (Function1) objRememberedValue6, null, composer2, 0, (57344 & (i8 << 6)) | 12582912, 376828);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            i4 = i10;
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
            i4 = i;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new nk(str, modifier, i4, function0, i2));
        }
    }

    public static final void c(Composer composer, int i, String totalAmount) {
        int i2;
        Composer composer2;
        Intrinsics.i(totalAmount, "totalAmount");
        Composer composerStartRestartGroup = composer.startRestartGroup(1124034214);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(totalAmount) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1124034214, i2, -1, "app.chalo.instantticket.ui.faredetails.compose.TotalFareView (FareDetailsCTAView.kt:75)");
            }
            Arrangement.HorizontalOrVertical spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, Alignment.INSTANCE.getTop(), composerStartRestartGroup, 6);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
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
            TextKt.m2623TextNvy7gAk(StringResourcesHelperKt.c(StringEnum.TOTAL_AMOUNT, new Object[0], composerStartRestartGroup, 6), null, ChaloTheme.a(composerStartRestartGroup, 0).g, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTypographyKt.f(ChaloTheme.e(composerStartRestartGroup, 0)), composerStartRestartGroup, 0, 0, 131066);
            composer2 = composerStartRestartGroup;
            TextKt.m2623TextNvy7gAk(totalAmount, null, ChaloTheme.a(composerStartRestartGroup, 0).g, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTypographyKt.f(ChaloTheme.e(composerStartRestartGroup, 0)), composer2, i2 & 14, 0, 131066);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new qg(totalAmount, i, 9));
        }
    }
}
