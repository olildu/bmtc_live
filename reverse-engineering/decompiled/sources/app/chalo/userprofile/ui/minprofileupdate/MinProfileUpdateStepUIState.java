package app.chalo.userprofile.ui.minprofileupdate;

import androidx.compose.ui.unit.Dp;
import app.chalo.uistate.text.TextUIState;
import app.chalo.userprofile.ui.ProfileIconWithEditBtnUIState;
import defpackage.pk0;
import defpackage.r30;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lapp/chalo/userprofile/ui/minprofileupdate/MinProfileUpdateStepUIState;", "", "ProfilePhotoStepUIState", "GenderStepUIState", "AgeStepUIState", "Lapp/chalo/userprofile/ui/minprofileupdate/MinProfileUpdateStepUIState$AgeStepUIState;", "Lapp/chalo/userprofile/ui/minprofileupdate/MinProfileUpdateStepUIState$GenderStepUIState;", "Lapp/chalo/userprofile/ui/minprofileupdate/MinProfileUpdateStepUIState$ProfilePhotoStepUIState;", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class MinProfileUpdateStepUIState {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/userprofile/ui/minprofileupdate/MinProfileUpdateStepUIState$AgeStepUIState;", "Lapp/chalo/userprofile/ui/minprofileupdate/MinProfileUpdateStepUIState;", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class AgeStepUIState extends MinProfileUpdateStepUIState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TextUIState f10407a;
        public final TextUIState b;
        public final TextUIState c;
        public final AgeInputFieldUIState d;
        public final AgeInputFieldUIState e;
        public final AgeStepUISpec f;

        public AgeStepUIState(TextUIState questionText, TextUIState ageQuestionText, TextUIState textUIState, AgeInputFieldUIState ageInputFieldUIState, AgeInputFieldUIState inputField, int i) {
            ageInputFieldUIState = (i & 8) != 0 ? null : ageInputFieldUIState;
            AgeStepUISpec ageStepUISpec = new AgeStepUISpec();
            Intrinsics.i(questionText, "questionText");
            Intrinsics.i(ageQuestionText, "ageQuestionText");
            Intrinsics.i(inputField, "inputField");
            this.f10407a = questionText;
            this.b = ageQuestionText;
            this.c = textUIState;
            this.d = ageInputFieldUIState;
            this.e = inputField;
            this.f = ageStepUISpec;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AgeStepUIState)) {
                return false;
            }
            AgeStepUIState ageStepUIState = (AgeStepUIState) obj;
            return Intrinsics.d(this.f10407a, ageStepUIState.f10407a) && Intrinsics.d(this.b, ageStepUIState.b) && Intrinsics.d(this.c, ageStepUIState.c) && Intrinsics.d(this.d, ageStepUIState.d) && Intrinsics.d(this.e, ageStepUIState.e) && Intrinsics.d(this.f, ageStepUIState.f);
        }

        public final int hashCode() {
            int iC = pk0.c(this.b, this.f10407a.hashCode() * 31, 31);
            TextUIState textUIState = this.c;
            int iHashCode = (iC + (textUIState == null ? 0 : textUIState.hashCode())) * 31;
            AgeInputFieldUIState ageInputFieldUIState = this.d;
            return Dp.m7284hashCodeimpl(this.f.f10378a) + ((this.e.hashCode() + ((iHashCode + (ageInputFieldUIState != null ? ageInputFieldUIState.hashCode() : 0)) * 31)) * 31);
        }

        public final String toString() {
            return "AgeStepUIState(questionText=" + this.f10407a + ", ageQuestionText=" + this.b + ", pageCounterText=" + this.c + ", nameInputField=" + this.d + ", inputField=" + this.e + ", spec=" + this.f + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/userprofile/ui/minprofileupdate/MinProfileUpdateStepUIState$GenderStepUIState;", "Lapp/chalo/userprofile/ui/minprofileupdate/MinProfileUpdateStepUIState;", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class GenderStepUIState extends MinProfileUpdateStepUIState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TextUIState f10408a;
        public final TextUIState b;
        public final List c;
        public final GenderStepUISpec d;

        public GenderStepUIState(TextUIState questionText, TextUIState textUIState, List options) {
            GenderStepUISpec genderStepUISpec = new GenderStepUISpec();
            Intrinsics.i(questionText, "questionText");
            Intrinsics.i(options, "options");
            this.f10408a = questionText;
            this.b = textUIState;
            this.c = options;
            this.d = genderStepUISpec;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof GenderStepUIState)) {
                return false;
            }
            GenderStepUIState genderStepUIState = (GenderStepUIState) obj;
            return Intrinsics.d(this.f10408a, genderStepUIState.f10408a) && Intrinsics.d(this.b, genderStepUIState.b) && Intrinsics.d(this.c, genderStepUIState.c) && Intrinsics.d(this.d, genderStepUIState.d);
        }

        public final int hashCode() {
            int iHashCode = this.f10408a.hashCode() * 31;
            TextUIState textUIState = this.b;
            return this.d.hashCode() + r30.b((iHashCode + (textUIState == null ? 0 : textUIState.hashCode())) * 31, 31, this.c);
        }

        public final String toString() {
            return "GenderStepUIState(questionText=" + this.f10408a + ", pageCounterText=" + this.b + ", options=" + this.c + ", spec=" + this.d + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/userprofile/ui/minprofileupdate/MinProfileUpdateStepUIState$ProfilePhotoStepUIState;", "Lapp/chalo/userprofile/ui/minprofileupdate/MinProfileUpdateStepUIState;", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ProfilePhotoStepUIState extends MinProfileUpdateStepUIState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TextUIState.ChaloTextUIState f10409a;
        public final TextUIState b;
        public final ProfileIconWithEditBtnUIState c;
        public final ProfilePhotoStepUISpec d;

        public ProfilePhotoStepUIState(TextUIState.ChaloTextUIState chaloTextUIState, TextUIState textUIState, ProfileIconWithEditBtnUIState profileIconWithEditBtnUIState) {
            ProfilePhotoStepUISpec profilePhotoStepUISpec = new ProfilePhotoStepUISpec();
            this.f10409a = chaloTextUIState;
            this.b = textUIState;
            this.c = profileIconWithEditBtnUIState;
            this.d = profilePhotoStepUISpec;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ProfilePhotoStepUIState)) {
                return false;
            }
            ProfilePhotoStepUIState profilePhotoStepUIState = (ProfilePhotoStepUIState) obj;
            return Intrinsics.d(this.f10409a, profilePhotoStepUIState.f10409a) && Intrinsics.d(this.b, profilePhotoStepUIState.b) && Intrinsics.d(this.c, profilePhotoStepUIState.c) && Intrinsics.d(this.d, profilePhotoStepUIState.d);
        }

        public final int hashCode() {
            int iHashCode = this.f10409a.hashCode() * 31;
            TextUIState textUIState = this.b;
            return Dp.m7284hashCodeimpl(this.d.f10411a) + ((this.c.hashCode() + ((iHashCode + (textUIState == null ? 0 : textUIState.hashCode())) * 31)) * 31);
        }

        public final String toString() {
            return "ProfilePhotoStepUIState(questionText=" + this.f10409a + ", pageCounterText=" + this.b + ", profileIcon=" + this.c + ", spec=" + this.d + ")";
        }
    }
}
