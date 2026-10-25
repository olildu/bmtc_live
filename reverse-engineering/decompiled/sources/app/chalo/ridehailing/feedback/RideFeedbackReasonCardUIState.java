package app.chalo.ridehailing.feedback;

import app.chalo.uistate.text.TextUIState;
import app.chalo.uistate.textField.BaseTextFieldUIState;
import defpackage.r30;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ridehailing/feedback/RideFeedbackReasonCardUIState;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class RideFeedbackReasonCardUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RideFeedbackReasonCardUISpecs f9148a;
    public final TextUIState.ChaloTextUIState b;
    public final List c;
    public final RideFeedbackSubtagCardUIState d;
    public final TextUIState.ChaloTextUIState e;
    public final BaseTextFieldUIState.TextFieldUIState f;

    public RideFeedbackReasonCardUIState(TextUIState.ChaloTextUIState header, List ratingReasonList, RideFeedbackSubtagCardUIState rideFeedbackSubtagCardUIState, TextUIState.ChaloTextUIState chaloTextUIState, BaseTextFieldUIState.TextFieldUIState textFieldUIState) {
        RideFeedbackReasonCardUISpecs rideFeedbackReasonCardUISpecs = new RideFeedbackReasonCardUISpecs();
        Intrinsics.i(header, "header");
        Intrinsics.i(ratingReasonList, "ratingReasonList");
        this.f9148a = rideFeedbackReasonCardUISpecs;
        this.b = header;
        this.c = ratingReasonList;
        this.d = rideFeedbackSubtagCardUIState;
        this.e = chaloTextUIState;
        this.f = textFieldUIState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RideFeedbackReasonCardUIState)) {
            return false;
        }
        RideFeedbackReasonCardUIState rideFeedbackReasonCardUIState = (RideFeedbackReasonCardUIState) obj;
        return Intrinsics.d(this.f9148a, rideFeedbackReasonCardUIState.f9148a) && Intrinsics.d(this.b, rideFeedbackReasonCardUIState.b) && Intrinsics.d(this.c, rideFeedbackReasonCardUIState.c) && Intrinsics.d(this.d, rideFeedbackReasonCardUIState.d) && Intrinsics.d(this.e, rideFeedbackReasonCardUIState.e) && Intrinsics.d(this.f, rideFeedbackReasonCardUIState.f);
    }

    public final int hashCode() {
        int iB = r30.b(r30.f(this.b, this.f9148a.hashCode() * 31, 31), 31, this.c);
        RideFeedbackSubtagCardUIState rideFeedbackSubtagCardUIState = this.d;
        int iHashCode = (iB + (rideFeedbackSubtagCardUIState == null ? 0 : rideFeedbackSubtagCardUIState.hashCode())) * 31;
        TextUIState.ChaloTextUIState chaloTextUIState = this.e;
        int iHashCode2 = (iHashCode + (chaloTextUIState == null ? 0 : chaloTextUIState.hashCode())) * 31;
        BaseTextFieldUIState.TextFieldUIState textFieldUIState = this.f;
        return iHashCode2 + (textFieldUIState != null ? textFieldUIState.hashCode() : 0);
    }

    public final String toString() {
        return "RideFeedbackReasonCardUIState(specs=" + this.f9148a + ", header=" + this.b + ", ratingReasonList=" + this.c + ", subtagCard=" + this.d + ", otherReasonHeader=" + this.e + ", otherReasonTextField=" + this.f + ")";
    }
}
