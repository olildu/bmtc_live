package app.chalo.compose.components.dialogs;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.material3.DatePickerColors;
import androidx.compose.material3.DatePickerDefaults;
import androidx.compose.material3.DatePickerDialog_androidKt;
import androidx.compose.material3.DatePickerFormatter;
import androidx.compose.material3.DatePickerKt;
import androidx.compose.material3.DatePickerState;
import androidx.compose.material3.SelectableDates;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ScaleKt;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntSize;
import androidx.profileinstaller.ProfileVerifier;
import app.chalo.compose.components.ComposeUtils_androidKt;
import app.chalo.compose.theme.ChaloTheme;
import app.chalo.uistate.base.ChaloColorTokenKt;
import app.chalo.uistate.dialog.DatePickerContract;
import app.chalo.uistate.dialog.DatePickerSelectableDates;
import app.chalo.uistate.dialog.DatePickerUIEventHandler;
import app.chalo.uistate.dialog.DatePickerUIState;
import defpackage.d0;
import defpackage.e0;
import defpackage.g5;
import defpackage.h3;
import defpackage.mj;
import defpackage.n4;
import defpackage.nj;
import defpackage.ze;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KFunction;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002¨\u0006\u0004²\u0006\u000e\u0010\u0001\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0003\u001a\u00020\u00028\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0001\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0003\u001a\u00020\u00028\n@\nX\u008a\u008e\u0002"}, d2 = {"Landroidx/compose/ui/unit/IntSize;", "dialogSize", "", "dialogScale", "chalo-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ChaloDatePickerKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PaddingValues f1888a = PaddingKt.m781PaddingValuesa9UjIt4$default(Dp.m7278constructorimpl(24), Dp.m7278constructorimpl(16), Dp.m7278constructorimpl(12), 0.0f, 8, null);

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(long j, Function0 onDismiss, Function1 confirmClicked, Function0 cancelClicked, SelectableDates selectableDates, Composer composer, int i) {
        int i2;
        Intrinsics.i(onDismiss, "onDismiss");
        Intrinsics.i(confirmClicked, "confirmClicked");
        Intrinsics.i(cancelClicked, "cancelClicked");
        Composer composerStartRestartGroup = composer.startRestartGroup(1462919979);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(j) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onDismiss) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(confirmClicked) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(cancelClicked) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changed(selectableDates) ? 16384 : 8192;
        }
        int i3 = i2;
        if (composerStartRestartGroup.shouldExecute((i3 & 9363) != 9362, i3 & 1)) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0 && !composerStartRestartGroup.getDefaultsInvalid()) {
                composerStartRestartGroup.skipToGroupEnd();
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1462919979, i3, -1, "app.chalo.compose.components.dialogs.ChaloDatePicker (ChaloDatePicker.kt:43)");
            }
            DatePickerState datePickerStateM1905rememberDatePickerStateEU0dCGE = DatePickerKt.m1905rememberDatePickerStateEU0dCGE(Long.valueOf(j), null, null, 0, selectableDates, composerStartRestartGroup, i3 & 57358, 14);
            composerStartRestartGroup = composerStartRestartGroup;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = DatePickerDefaults.dateFormatter$default(DatePickerDefaults.INSTANCE, null, null, null, 7, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            DatePickerFormatter datePickerFormatter = (DatePickerFormatter) objRememberedValue;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(IntSize.m7437boximpl(IntSize.INSTANCE.m7450getZeroYbymL2g()), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            MutableState mutableState = (MutableState) objRememberedValue2;
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(1.0f), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            MutableState mutableState2 = (MutableState) objRememberedValue3;
            float fC = ComposeUtils_androidKt.c(composerStartRestartGroup);
            Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            IntSize intSizeM7437boximpl = IntSize.m7437boximpl(((IntSize) mutableState.getValue()).m7449unboximpl());
            boolean zChanged = composerStartRestartGroup.changed(density) | composerStartRestartGroup.changed(fC);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = new ChaloDatePickerKt$ChaloDatePicker$1$1(density, fC, mutableState, mutableState2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            EffectsKt.LaunchedEffect(intSizeM7437boximpl, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue4, composerStartRestartGroup, 0);
            Modifier modifierScale = ScaleKt.scale(Modifier.INSTANCE, ((Number) mutableState2.getValue()).floatValue());
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue5 == companion.getEmpty()) {
                objRememberedValue5 = new g5(mutableState, 7);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            DatePickerDialog_androidKt.m1897DatePickerDialogGmEhDVc(onDismiss, ComposableLambdaKt.rememberComposableLambda(1288952153, true, new h3(6, confirmClicked, datePickerStateM1905rememberDatePickerStateEU0dCGE), composerStartRestartGroup, 54), OnGloballyPositionedModifierKt.onGloballyPositioned(modifierScale, (Function1) objRememberedValue5), ComposableLambdaKt.rememberComposableLambda(-435656169, true, new ze(cancelClicked, 3), composerStartRestartGroup, 54), null, 0.0f, DatePickerDefaults.INSTANCE.m1895colorsbSRYm20(ChaloTheme.a(composerStartRestartGroup, 6).t, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, null, composerStartRestartGroup, 0, 0, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 33554430), null, ComposableLambdaKt.rememberComposableLambda(927713890, true, new d0(11, datePickerStateM1905rememberDatePickerStateEU0dCGE, datePickerFormatter), composerStartRestartGroup, 54), composerStartRestartGroup, ((i3 >> 3) & 14) | 100666416, 176);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new nj(j, onDismiss, confirmClicked, cancelClicked, selectableDates, i));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(DatePickerUIState state, Composer composer, int i) {
        int i2;
        Intrinsics.i(state, "state");
        DatePickerContract datePickerContract = state.f9979a;
        Composer composerStartRestartGroup = composer.startRestartGroup(1088926770);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(state) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1088926770, i2, -1, "app.chalo.compose.components.dialogs.ChaloDatePicker (ChaloDatePicker.kt:109)");
            }
            boolean zChanged = composerStartRestartGroup.changed(datePickerContract.c);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                final DatePickerSelectableDates datePickerSelectableDates = datePickerContract.c;
                objRememberedValue = new SelectableDates() { // from class: app.chalo.compose.components.dialogs.ChaloDatePickerKt$toSelectableDate$1
                    @Override // androidx.compose.material3.SelectableDates
                    public final boolean isSelectableDate(long j) {
                        return datePickerSelectableDates.isSelectableDate(j);
                    }

                    @Override // androidx.compose.material3.SelectableDates
                    public final boolean isSelectableYear(int i3) {
                        return datePickerSelectableDates.isSelectableYear(i3);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            DatePickerState datePickerStateM1905rememberDatePickerStateEU0dCGE = DatePickerKt.m1905rememberDatePickerStateEU0dCGE(datePickerContract.f9977a, null, datePickerContract.b, 0, (SelectableDates) objRememberedValue, composerStartRestartGroup, 0, 10);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(IntSize.m7437boximpl(IntSize.INSTANCE.m7450getZeroYbymL2g()), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            MutableState mutableState = (MutableState) objRememberedValue2;
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(1.0f), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            MutableState mutableState2 = (MutableState) objRememberedValue3;
            float fC = ComposeUtils_androidKt.c(composerStartRestartGroup);
            Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            IntSize intSizeM7437boximpl = IntSize.m7437boximpl(((IntSize) mutableState.getValue()).m7449unboximpl());
            boolean zChanged2 = composerStartRestartGroup.changed(density) | composerStartRestartGroup.changed(fC);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = new ChaloDatePickerKt$ChaloDatePicker$7$1(density, fC, mutableState, mutableState2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            EffectsKt.LaunchedEffect(intSizeM7437boximpl, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue4, composerStartRestartGroup, 0);
            Modifier modifierScale = ScaleKt.scale(Modifier.INSTANCE, ((Number) mutableState2.getValue()).floatValue());
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue5 == companion.getEmpty()) {
                objRememberedValue5 = new g5(mutableState, 8);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            Modifier modifierOnGloballyPositioned = OnGloballyPositionedModifierKt.onGloballyPositioned(modifierScale, (Function1) objRememberedValue5);
            DatePickerUIEventHandler datePickerUIEventHandler = state.b;
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(datePickerUIEventHandler);
            Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue6 == companion.getEmpty()) {
                ChaloDatePickerKt$ChaloDatePicker$9$1 chaloDatePickerKt$ChaloDatePicker$9$1 = new ChaloDatePickerKt$ChaloDatePicker$9$1(0, datePickerUIEventHandler, DatePickerUIEventHandler.class, "onDismiss", "onDismiss()V", 0);
                composerStartRestartGroup.updateRememberedValue(chaloDatePickerKt$ChaloDatePicker$9$1);
                objRememberedValue6 = chaloDatePickerKt$ChaloDatePicker$9$1;
            }
            DatePickerColors datePickerColorsM1895colorsbSRYm20 = DatePickerDefaults.INSTANCE.m1895colorsbSRYm20(ChaloColorTokenKt.c(state.f.f9978a), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, null, composerStartRestartGroup, 0, 0, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 33554430);
            composerStartRestartGroup = composerStartRestartGroup;
            DatePickerDialog_androidKt.m1897DatePickerDialogGmEhDVc((Function0) ((KFunction) objRememberedValue6), ComposableLambdaKt.rememberComposableLambda(-1502836668, true, new mj(state, datePickerStateM1905rememberDatePickerStateEU0dCGE, 1), composerStartRestartGroup, 54), modifierOnGloballyPositioned, ComposableLambdaKt.rememberComposableLambda(-2047709242, true, new n4(state, 8), composerStartRestartGroup, 54), null, 0.0f, datePickerColorsM1895colorsbSRYm20, null, ComposableLambdaKt.rememberComposableLambda(1019407899, true, new d0(12, state, datePickerStateM1905rememberDatePickerStateEU0dCGE), composerStartRestartGroup, 54), composerStartRestartGroup, 100666416, 176);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new e0(state, i, 29));
        }
    }
}
