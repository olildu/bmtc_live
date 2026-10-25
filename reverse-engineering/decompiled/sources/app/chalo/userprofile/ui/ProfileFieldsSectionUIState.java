package app.chalo.userprofile.ui;

import app.chalo.compose.theme.UIShape;
import app.chalo.uistate.button.ButtonUIState;
import app.chalo.uistate.userprofile.GenderCardSelectionUIState;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/userprofile/ui/ProfileFieldsSectionUIState;", "", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ProfileFieldsSectionUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextFieldSectionUISpecs f10334a;
    public final UserProfileTextField b;
    public final UserProfileTextField c;
    public final UserProfileTextField d;
    public final GenderCardSelectionUIState e;
    public final ButtonUIState f;

    static {
        UIShape.Rectangle rectangle = UIShape.f1926a;
    }

    public ProfileFieldsSectionUIState(UserProfileTextField nameFieldUIState, UserProfileTextField emailFieldUIState, UserProfileTextField ageFieldUIState, GenderCardSelectionUIState genderCardSelectionUIState, ButtonUIState buttonUIState) {
        TextFieldSectionUISpecs textFieldSectionUISpecs = new TextFieldSectionUISpecs();
        Intrinsics.i(nameFieldUIState, "nameFieldUIState");
        Intrinsics.i(emailFieldUIState, "emailFieldUIState");
        Intrinsics.i(ageFieldUIState, "ageFieldUIState");
        Intrinsics.i(genderCardSelectionUIState, "genderCardSelectionUIState");
        this.f10334a = textFieldSectionUISpecs;
        this.b = nameFieldUIState;
        this.c = emailFieldUIState;
        this.d = ageFieldUIState;
        this.e = genderCardSelectionUIState;
        this.f = buttonUIState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProfileFieldsSectionUIState)) {
            return false;
        }
        ProfileFieldsSectionUIState profileFieldsSectionUIState = (ProfileFieldsSectionUIState) obj;
        return Intrinsics.d(this.f10334a, profileFieldsSectionUIState.f10334a) && Intrinsics.d(this.b, profileFieldsSectionUIState.b) && Intrinsics.d(this.c, profileFieldsSectionUIState.c) && Intrinsics.d(this.d, profileFieldsSectionUIState.d) && Intrinsics.d(this.e, profileFieldsSectionUIState.e) && Intrinsics.d(this.f, profileFieldsSectionUIState.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.f10334a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ProfileFieldsSectionUIState(specs=" + this.f10334a + ", nameFieldUIState=" + this.b + ", emailFieldUIState=" + this.c + ", ageFieldUIState=" + this.d + ", genderCardSelectionUIState=" + this.e + ", saveBtnUIState=" + this.f + ")";
    }
}
