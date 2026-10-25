package app.chalo.livetracking.ui.routedetailsscreen;

import app.chalo.uistate.text.TextUIState;
import app.chalo.uistate.textField.BaseTextFieldUIState;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/ui/routedetailsscreen/ReportProblemDialogUIState;", "", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ReportProblemDialogUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ReportProblemDialogSpecs f4819a = new ReportProblemDialogSpecs();
    public final ReportProblemAckUIState b;
    public final TextUIState c;
    public final List d;
    public final BaseTextFieldUIState.TextFieldUIState e;
    public final ReportProblemCtaUIState f;

    public ReportProblemDialogUIState(ReportProblemAckUIState reportProblemAckUIState, TextUIState.ChaloTextUIState chaloTextUIState, List list, BaseTextFieldUIState.TextFieldUIState textFieldUIState, ReportProblemCtaUIState reportProblemCtaUIState) {
        this.b = reportProblemAckUIState;
        this.c = chaloTextUIState;
        this.d = list;
        this.e = textFieldUIState;
        this.f = reportProblemCtaUIState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReportProblemDialogUIState)) {
            return false;
        }
        ReportProblemDialogUIState reportProblemDialogUIState = (ReportProblemDialogUIState) obj;
        return Intrinsics.d(this.f4819a, reportProblemDialogUIState.f4819a) && Intrinsics.d(this.b, reportProblemDialogUIState.b) && Intrinsics.d(this.c, reportProblemDialogUIState.c) && Intrinsics.d(this.d, reportProblemDialogUIState.d) && Intrinsics.d(this.e, reportProblemDialogUIState.e) && Intrinsics.d(this.f, reportProblemDialogUIState.f);
    }

    public final int hashCode() {
        int iHashCode = this.f4819a.hashCode() * 31;
        ReportProblemAckUIState reportProblemAckUIState = this.b;
        int iHashCode2 = (iHashCode + (reportProblemAckUIState == null ? 0 : reportProblemAckUIState.hashCode())) * 31;
        TextUIState textUIState = this.c;
        int iHashCode3 = (iHashCode2 + (textUIState == null ? 0 : textUIState.hashCode())) * 31;
        List list = this.d;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        BaseTextFieldUIState.TextFieldUIState textFieldUIState = this.e;
        int iHashCode5 = (iHashCode4 + (textFieldUIState == null ? 0 : textFieldUIState.hashCode())) * 31;
        ReportProblemCtaUIState reportProblemCtaUIState = this.f;
        return iHashCode5 + (reportProblemCtaUIState != null ? reportProblemCtaUIState.hashCode() : 0);
    }

    public final String toString() {
        return "ReportProblemDialogUIState(spec=" + this.f4819a + ", ack=" + this.b + ", title=" + this.c + ", reportProblemTags=" + this.d + ", feedbackTextField=" + this.e + ", cta=" + this.f + ")";
    }
}
