package app.chalo.uistate.dialog;

import app.chalo.uistate.text.TextUIState;
import defpackage.pk0;
import defpackage.r30;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/dialog/DatePickerUIState;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class DatePickerUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DatePickerContract f9979a;
    public final DatePickerUIEventHandler b;
    public final TextUIState.ChaloTextUIState c;
    public final TextUIState d;
    public final TextUIState.ChaloTextUIState e;
    public final DatePickerUISpec f;

    public DatePickerUIState(DatePickerContract contract, DatePickerUIStateFactory$standard$2 eventHandler, TextUIState.ChaloTextUIState chaloTextUIState, TextUIState.ChaloTextUIState confirmButton, TextUIState.ChaloTextUIState chaloTextUIState2) {
        DatePickerUISpec datePickerUISpec = new DatePickerUISpec();
        Intrinsics.i(contract, "contract");
        Intrinsics.i(eventHandler, "eventHandler");
        Intrinsics.i(confirmButton, "confirmButton");
        this.f9979a = contract;
        this.b = eventHandler;
        this.c = chaloTextUIState;
        this.d = confirmButton;
        this.e = chaloTextUIState2;
        this.f = datePickerUISpec;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DatePickerUIState)) {
            return false;
        }
        DatePickerUIState datePickerUIState = (DatePickerUIState) obj;
        return Intrinsics.d(this.f9979a, datePickerUIState.f9979a) && Intrinsics.d(this.b, datePickerUIState.b) && Intrinsics.d(this.c, datePickerUIState.c) && Intrinsics.d(this.d, datePickerUIState.d) && Intrinsics.d(this.e, datePickerUIState.e) && Intrinsics.d(this.f, datePickerUIState.f);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.f9979a.hashCode() * 31)) * 31;
        TextUIState.ChaloTextUIState chaloTextUIState = this.c;
        return this.f.hashCode() + r30.f(this.e, pk0.c(this.d, (iHashCode + (chaloTextUIState == null ? 0 : chaloTextUIState.hashCode())) * 31, 31), 31);
    }

    public final String toString() {
        return "DatePickerUIState(contract=" + this.f9979a + ", eventHandler=" + this.b + ", title=" + this.c + ", confirmButton=" + this.d + ", dismissButton=" + this.e + ", spec=" + this.f + ")";
    }
}
