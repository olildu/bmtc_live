package app.chalo.chalobususerprofile.ui.compose;

import app.chalo.chalobususerprofile.data.model.PBUserProfileSurveyPreference;
import defpackage.n21;
import defpackage.r30;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/chalobususerprofile/ui/compose/ChaloBusUserProfileSurveyDataState;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ChaloBusUserProfileSurveyDataState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PBUserProfileSurveyPreference f1206a;
    public final List b;
    public final int c;
    public final boolean d;
    public final TimePickerType e;
    public final TimePickerSelection f;
    public final boolean g;
    public final boolean h;

    public ChaloBusUserProfileSurveyDataState(PBUserProfileSurveyPreference pBUserProfileSurveyPreference, List surveyInputSequence, int i, boolean z, TimePickerType timePickerType, TimePickerSelection timePickerSelection, boolean z2, boolean z3) {
        Intrinsics.i(surveyInputSequence, "surveyInputSequence");
        this.f1206a = pBUserProfileSurveyPreference;
        this.b = surveyInputSequence;
        this.c = i;
        this.d = z;
        this.e = timePickerType;
        this.f = timePickerSelection;
        this.g = z2;
        this.h = z3;
    }

    public static ChaloBusUserProfileSurveyDataState a(ChaloBusUserProfileSurveyDataState chaloBusUserProfileSurveyDataState, PBUserProfileSurveyPreference pBUserProfileSurveyPreference, List list, int i, boolean z, TimePickerType timePickerType, TimePickerSelection timePickerSelection, boolean z2, int i2) {
        if ((i2 & 1) != 0) {
            pBUserProfileSurveyPreference = chaloBusUserProfileSurveyDataState.f1206a;
        }
        PBUserProfileSurveyPreference preference = pBUserProfileSurveyPreference;
        if ((i2 & 2) != 0) {
            list = chaloBusUserProfileSurveyDataState.b;
        }
        List surveyInputSequence = list;
        if ((i2 & 4) != 0) {
            i = chaloBusUserProfileSurveyDataState.c;
        }
        int i3 = i;
        if ((i2 & 8) != 0) {
            z = chaloBusUserProfileSurveyDataState.d;
        }
        boolean z3 = z;
        if ((i2 & 16) != 0) {
            timePickerType = chaloBusUserProfileSurveyDataState.e;
        }
        TimePickerType timePickerType2 = timePickerType;
        if ((i2 & 32) != 0) {
            timePickerSelection = chaloBusUserProfileSurveyDataState.f;
        }
        TimePickerSelection timePickerSelection2 = timePickerSelection;
        boolean z4 = (i2 & 64) != 0 ? chaloBusUserProfileSurveyDataState.g : true;
        boolean z5 = (i2 & 128) != 0 ? chaloBusUserProfileSurveyDataState.h : z2;
        chaloBusUserProfileSurveyDataState.getClass();
        Intrinsics.i(preference, "preference");
        Intrinsics.i(surveyInputSequence, "surveyInputSequence");
        return new ChaloBusUserProfileSurveyDataState(preference, surveyInputSequence, i3, z3, timePickerType2, timePickerSelection2, z4, z5);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChaloBusUserProfileSurveyDataState)) {
            return false;
        }
        ChaloBusUserProfileSurveyDataState chaloBusUserProfileSurveyDataState = (ChaloBusUserProfileSurveyDataState) obj;
        return Intrinsics.d(this.f1206a, chaloBusUserProfileSurveyDataState.f1206a) && Intrinsics.d(this.b, chaloBusUserProfileSurveyDataState.b) && this.c == chaloBusUserProfileSurveyDataState.c && this.d == chaloBusUserProfileSurveyDataState.d && this.e == chaloBusUserProfileSurveyDataState.e && Intrinsics.d(this.f, chaloBusUserProfileSurveyDataState.f) && this.g == chaloBusUserProfileSurveyDataState.g && this.h == chaloBusUserProfileSurveyDataState.h;
    }

    public final int hashCode() {
        int iB = (((r30.b(this.f1206a.hashCode() * 31, 31, this.b) + this.c) * 31) + (this.d ? 1231 : 1237)) * 31;
        TimePickerType timePickerType = this.e;
        int iHashCode = (iB + (timePickerType == null ? 0 : timePickerType.hashCode())) * 31;
        TimePickerSelection timePickerSelection = this.f;
        return ((((iHashCode + (timePickerSelection != null ? timePickerSelection.hashCode() : 0)) * 31) + (this.g ? 1231 : 1237)) * 31) + (this.h ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChaloBusUserProfileSurveyDataState(preference=");
        sb.append(this.f1206a);
        sb.append(", surveyInputSequence=");
        sb.append(this.b);
        sb.append(", currentInputIndex=");
        sb.append(this.c);
        sb.append(", isLoading=");
        sb.append(this.d);
        sb.append(", timePickerType=");
        sb.append(this.e);
        sb.append(", activeTimePickerSelection=");
        sb.append(this.f);
        sb.append(", showSuccessScreen=");
        return n21.h(sb, this.g, ", showErrorScreen=", this.h, ")");
    }
}
