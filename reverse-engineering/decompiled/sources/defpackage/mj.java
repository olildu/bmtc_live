package defpackage;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.material3.DatePickerDefaults;
import androidx.compose.material3.DatePickerState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import app.chalo.compose.components.TextKt;
import app.chalo.compose.components.dialogs.ChaloDatePickerKt;
import app.chalo.compose.theme.ChaloThemeKt;
import app.chalo.uistate.dialog.DatePickerUIState;
import app.chalo.uistate.text.TextUIState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class mj implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18403a;
    public final /* synthetic */ DatePickerUIState b;
    public final /* synthetic */ DatePickerState c;

    public /* synthetic */ mj(DatePickerUIState datePickerUIState, DatePickerState datePickerState, int i) {
        this.f18403a = i;
        this.b = datePickerUIState;
        this.c = datePickerState;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f18403a;
        Unit unit = Unit.f17538a;
        DatePickerState datePickerState = this.c;
        DatePickerUIState datePickerUIState = this.b;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj;
                int iIntValue = ((Integer) obj2).intValue();
                PaddingValues paddingValues = ChaloDatePickerKt.f1888a;
                if (!composer.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                    composer.skipToGroupEnd();
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-818533304, iIntValue, -1, "app.chalo.compose.components.dialogs.ChaloDatePicker.<anonymous>.<anonymous> (ChaloDatePicker.kt:171)");
                    }
                    if (datePickerUIState.c != null) {
                        composer.startReplaceGroup(1898696609);
                        TextKt.c(datePickerUIState.c, PaddingKt.padding(Modifier.INSTANCE, paddingValues), null, null, composer, 48, 12);
                        composer.endReplaceGroup();
                    } else {
                        composer.startReplaceGroup(1898918538);
                        DatePickerDefaults.INSTANCE.m1894DatePickerTitleFNtVw6o(datePickerState.mo1907getDisplayModejFl4v0(), PaddingKt.padding(Modifier.INSTANCE, paddingValues), 0L, composer, 3120, 4);
                        composer.endReplaceGroup();
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
                break;
            default:
                Composer composer2 = (Composer) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                PaddingValues paddingValues2 = ChaloDatePickerKt.f1888a;
                if (!composer2.shouldExecute((iIntValue2 & 3) != 2, iIntValue2 & 1)) {
                    composer2.skipToGroupEnd();
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1502836668, iIntValue2, -1, "app.chalo.compose.components.dialogs.ChaloDatePicker.<anonymous> (ChaloDatePicker.kt:141)");
                    }
                    TextUIState textUIState = datePickerUIState.d;
                    Modifier.Companion companion = Modifier.INSTANCE;
                    boolean zChanged = composer2.changed(datePickerUIState) | composer2.changed(datePickerState);
                    Object objRememberedValue = composer2.rememberedValue();
                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new ti(4, datePickerUIState, datePickerState);
                        composer2.updateRememberedValue(objRememberedValue);
                    }
                    TextKt.c(textUIState, ChaloThemeKt.c(ClickableKt.m299clickableoSLSa3U$default(companion, false, null, null, null, (Function0) objRememberedValue, 15, null), datePickerUIState.f.b), null, null, composer2, 0, 12);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
                break;
        }
        return unit;
    }
}
