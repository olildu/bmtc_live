package app.chalo.chalobususerprofile.ui.compose;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.uistate.button.ButtonUIState;
import app.chalo.uistate.image.GifImageUIState;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.text.TextUIState;
import defpackage.hq0;
import defpackage.pk0;
import defpackage.r30;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lapp/chalo/chalobususerprofile/ui/compose/ProfileSurveyUIState;", "", "WorkTimingUIState", "FrequencyUIState", "SuccessErrorUIState", "Lapp/chalo/chalobususerprofile/ui/compose/ProfileSurveyUIState$FrequencyUIState;", "Lapp/chalo/chalobususerprofile/ui/compose/ProfileSurveyUIState$SuccessErrorUIState;", "Lapp/chalo/chalobususerprofile/ui/compose/ProfileSurveyUIState$WorkTimingUIState;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class ProfileSurveyUIState {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/chalobususerprofile/ui/compose/ProfileSurveyUIState$FrequencyUIState;", "Lapp/chalo/chalobususerprofile/ui/compose/ProfileSurveyUIState;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class FrequencyUIState extends ProfileSurveyUIState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final float f1233a;
        public final ImageUIState b;
        public final TextUIState.ChaloTextUIState c;
        public final List d;

        public FrequencyUIState(ImageUIState scheduleIconUiState, TextUIState.ChaloTextUIState titleUIState, List frequencyOptionsUIState) {
            float f = ChaloThemeHelper.a().d;
            Intrinsics.i(scheduleIconUiState, "scheduleIconUiState");
            Intrinsics.i(titleUIState, "titleUIState");
            Intrinsics.i(frequencyOptionsUIState, "frequencyOptionsUIState");
            this.f1233a = f;
            this.b = scheduleIconUiState;
            this.c = titleUIState;
            this.d = frequencyOptionsUIState;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FrequencyUIState)) {
                return false;
            }
            FrequencyUIState frequencyUIState = (FrequencyUIState) obj;
            return Dp.m7283equalsimpl0(this.f1233a, frequencyUIState.f1233a) && Intrinsics.d(this.b, frequencyUIState.b) && Intrinsics.d(this.c, frequencyUIState.c) && Intrinsics.d(this.d, frequencyUIState.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + r30.f(this.c, r30.e(this.b, Dp.m7284hashCodeimpl(this.f1233a) * 31, 31), 31);
        }

        public final String toString() {
            return "FrequencyUIState(spaceBtwStepsAndTitle=" + Dp.m7289toStringimpl(this.f1233a) + ", scheduleIconUiState=" + this.b + ", titleUIState=" + this.c + ", frequencyOptionsUIState=" + this.d + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/chalobususerprofile/ui/compose/ProfileSurveyUIState$SuccessErrorUIState;", "Lapp/chalo/chalobususerprofile/ui/compose/ProfileSurveyUIState;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SuccessErrorUIState extends ProfileSurveyUIState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final GifImageUIState f1234a;
        public final TextUIState.ChaloTextUIState b;
        public final TextUIState.ChaloTextUIState c;
        public final ButtonUIState d;
        public final ButtonUIState e;

        public SuccessErrorUIState(GifImageUIState gif, TextUIState.ChaloTextUIState titleUIState, TextUIState.ChaloTextUIState subTitleUIState, ButtonUIState primaryButton, ButtonUIState buttonUIState) {
            Intrinsics.i(gif, "gif");
            Intrinsics.i(titleUIState, "titleUIState");
            Intrinsics.i(subTitleUIState, "subTitleUIState");
            Intrinsics.i(primaryButton, "primaryButton");
            this.f1234a = gif;
            this.b = titleUIState;
            this.c = subTitleUIState;
            this.d = primaryButton;
            this.e = buttonUIState;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SuccessErrorUIState)) {
                return false;
            }
            SuccessErrorUIState successErrorUIState = (SuccessErrorUIState) obj;
            return Intrinsics.d(this.f1234a, successErrorUIState.f1234a) && Intrinsics.d(this.b, successErrorUIState.b) && Intrinsics.d(this.c, successErrorUIState.c) && Intrinsics.d(this.d, successErrorUIState.d) && Intrinsics.d(this.e, successErrorUIState.e);
        }

        public final int hashCode() {
            int iD = r30.d(this.d, r30.f(this.c, r30.f(this.b, this.f1234a.hashCode() * 31, 31), 31), 31);
            ButtonUIState buttonUIState = this.e;
            return iD + (buttonUIState == null ? 0 : buttonUIState.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SuccessErrorUIState(gif=");
            sb.append(this.f1234a);
            sb.append(", titleUIState=");
            sb.append(this.b);
            sb.append(", subTitleUIState=");
            sb.append(this.c);
            sb.append(", primaryButton=");
            sb.append(this.d);
            sb.append(", secondaryButton=");
            return hq0.j(sb, this.e, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/chalobususerprofile/ui/compose/ProfileSurveyUIState$WorkTimingUIState;", "Lapp/chalo/chalobususerprofile/ui/compose/ProfileSurveyUIState;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class WorkTimingUIState extends ProfileSurveyUIState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ImageUIState f1235a;
        public final TextUIState.ChaloTextUIState b;
        public final TextUIState.ChaloTextUIState c;
        public final OfficeInfoUIState d;
        public final OfficeInfoUIState e;
        public final WorkTimingUISpecs f;

        public WorkTimingUIState(ImageUIState clockIconUiState, TextUIState.ChaloTextUIState titleUIState, TextUIState.ChaloTextUIState subTitleUIState, OfficeInfoUIState officeReachByComponentUIState, OfficeInfoUIState officeLeaveByComponentUIState) {
            WorkTimingUISpecs workTimingUISpecs = new WorkTimingUISpecs();
            Intrinsics.i(clockIconUiState, "clockIconUiState");
            Intrinsics.i(titleUIState, "titleUIState");
            Intrinsics.i(subTitleUIState, "subTitleUIState");
            Intrinsics.i(officeReachByComponentUIState, "officeReachByComponentUIState");
            Intrinsics.i(officeLeaveByComponentUIState, "officeLeaveByComponentUIState");
            this.f1235a = clockIconUiState;
            this.b = titleUIState;
            this.c = subTitleUIState;
            this.d = officeReachByComponentUIState;
            this.e = officeLeaveByComponentUIState;
            this.f = workTimingUISpecs;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof WorkTimingUIState)) {
                return false;
            }
            WorkTimingUIState workTimingUIState = (WorkTimingUIState) obj;
            return Intrinsics.d(this.f1235a, workTimingUIState.f1235a) && Intrinsics.d(this.b, workTimingUIState.b) && Intrinsics.d(this.c, workTimingUIState.c) && Intrinsics.d(this.d, workTimingUIState.d) && Intrinsics.d(this.e, workTimingUIState.e) && Intrinsics.d(this.f, workTimingUIState.f);
        }

        public final int hashCode() {
            return this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + r30.f(this.c, r30.f(this.b, this.f1235a.hashCode() * 31, 31), 31)) * 31)) * 31);
        }

        public final String toString() {
            StringBuilder sbN = pk0.n("WorkTimingUIState(clockIconUiState=", this.f1235a, ", titleUIState=", this.b, ", subTitleUIState=");
            sbN.append(this.c);
            sbN.append(", officeReachByComponentUIState=");
            sbN.append(this.d);
            sbN.append(", officeLeaveByComponentUIState=");
            sbN.append(this.e);
            sbN.append(", workTimingUISpecs=");
            sbN.append(this.f);
            sbN.append(")");
            return sbN.toString();
        }
    }
}
