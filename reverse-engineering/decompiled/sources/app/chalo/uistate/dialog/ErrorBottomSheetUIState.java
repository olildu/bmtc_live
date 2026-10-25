package app.chalo.uistate.dialog;

import app.chalo.uistate.button.ButtonUIState;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.text.TextUIState;
import defpackage.n21;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/dialog/ErrorBottomSheetUIState;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ErrorBottomSheetUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextUIState.ChaloTextUIState f9998a;
    public final TextUIState.ChaloTextUIState b;
    public final ButtonUIState c;
    public final ButtonUIState d;
    public final ImageUIState e;
    public final ImageUIState f;
    public final ErrorBottomSheetUISpecs g;

    public ErrorBottomSheetUIState(TextUIState.ChaloTextUIState title, TextUIState.ChaloTextUIState chaloTextUIState, ButtonUIState buttonUIState, ButtonUIState buttonUIState2, ImageUIState imageUIState, ImageUIState imageUIState2) {
        ErrorBottomSheetUISpecs errorBottomSheetUISpecs = new ErrorBottomSheetUISpecs();
        Intrinsics.i(title, "title");
        this.f9998a = title;
        this.b = chaloTextUIState;
        this.c = buttonUIState;
        this.d = buttonUIState2;
        this.e = imageUIState;
        this.f = imageUIState2;
        this.g = errorBottomSheetUISpecs;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ErrorBottomSheetUIState)) {
            return false;
        }
        ErrorBottomSheetUIState errorBottomSheetUIState = (ErrorBottomSheetUIState) obj;
        return Intrinsics.d(this.f9998a, errorBottomSheetUIState.f9998a) && Intrinsics.d(this.b, errorBottomSheetUIState.b) && Intrinsics.d(this.c, errorBottomSheetUIState.c) && Intrinsics.d(this.d, errorBottomSheetUIState.d) && Intrinsics.d(this.e, errorBottomSheetUIState.e) && Intrinsics.d(this.f, errorBottomSheetUIState.f) && Intrinsics.d(this.g, errorBottomSheetUIState.g);
    }

    public final int hashCode() {
        int iHashCode = this.f9998a.hashCode() * 31;
        TextUIState.ChaloTextUIState chaloTextUIState = this.b;
        int iHashCode2 = (iHashCode + (chaloTextUIState == null ? 0 : chaloTextUIState.hashCode())) * 31;
        ButtonUIState buttonUIState = this.c;
        int iHashCode3 = (iHashCode2 + (buttonUIState == null ? 0 : buttonUIState.hashCode())) * 31;
        ButtonUIState buttonUIState2 = this.d;
        int iHashCode4 = (iHashCode3 + (buttonUIState2 == null ? 0 : buttonUIState2.hashCode())) * 31;
        ImageUIState imageUIState = this.e;
        int iHashCode5 = (iHashCode4 + (imageUIState == null ? 0 : imageUIState.hashCode())) * 31;
        ImageUIState imageUIState2 = this.f;
        return this.g.hashCode() + ((iHashCode5 + (imageUIState2 != null ? imageUIState2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sbJ = n21.j("ErrorBottomSheetUIState(title=", this.f9998a, ", subtitle=", this.b, ", primaryBtn=");
        sbJ.append(this.c);
        sbJ.append(", secondaryBtn=");
        sbJ.append(this.d);
        sbJ.append(", closeBtnUIState=");
        sbJ.append(this.e);
        sbJ.append(", iconUIState=");
        sbJ.append(this.f);
        sbJ.append(", specs=");
        sbJ.append(this.g);
        sbJ.append(")");
        return sbJ.toString();
    }
}
