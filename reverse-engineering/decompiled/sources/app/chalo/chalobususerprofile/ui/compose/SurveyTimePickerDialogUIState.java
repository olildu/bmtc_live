package app.chalo.chalobususerprofile.ui.compose;

import app.chalo.uistate.button.ButtonUIState;
import app.chalo.uistate.text.TextUIState;
import defpackage.ii;
import defpackage.r30;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/chalobususerprofile/ui/compose/SurveyTimePickerDialogUIState;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SurveyTimePickerDialogUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextUIState.ChaloTextUIState f1236a;
    public final TimePickerSelection b;
    public final Function3 c;
    public final ButtonUIState d;
    public final ButtonUIState e;
    public final ii f;

    public SurveyTimePickerDialogUIState(TextUIState.ChaloTextUIState title, TimePickerSelection selection, Function3 onTimeChanged, ButtonUIState doneButton, ButtonUIState buttonUIState, ii iiVar) {
        Intrinsics.i(title, "title");
        Intrinsics.i(selection, "selection");
        Intrinsics.i(onTimeChanged, "onTimeChanged");
        Intrinsics.i(doneButton, "doneButton");
        this.f1236a = title;
        this.b = selection;
        this.c = onTimeChanged;
        this.d = doneButton;
        this.e = buttonUIState;
        this.f = iiVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SurveyTimePickerDialogUIState)) {
            return false;
        }
        SurveyTimePickerDialogUIState surveyTimePickerDialogUIState = (SurveyTimePickerDialogUIState) obj;
        return Intrinsics.d(this.f1236a, surveyTimePickerDialogUIState.f1236a) && Intrinsics.d(this.b, surveyTimePickerDialogUIState.b) && Intrinsics.d(this.c, surveyTimePickerDialogUIState.c) && Intrinsics.d(this.d, surveyTimePickerDialogUIState.d) && this.e.equals(surveyTimePickerDialogUIState.e) && this.f.equals(surveyTimePickerDialogUIState.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + r30.d(this.e, r30.d(this.d, (this.c.hashCode() + ((this.b.hashCode() + (this.f1236a.hashCode() * 31)) * 31)) * 31, 31), 31);
    }

    public final String toString() {
        return "SurveyTimePickerDialogUIState(title=" + this.f1236a + ", selection=" + this.b + ", onTimeChanged=" + this.c + ", doneButton=" + this.d + ", cancelButton=" + this.e + ", onDismiss=" + this.f + ")";
    }
}
