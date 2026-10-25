package app.chalo.userprofile.ui;

import app.chalo.uistate.dialog.ConfirmationDialogUiState;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/userprofile/ui/UserProfileFormUIState;", "", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class UserProfileFormUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UserProfileFormUISpecs f10370a;
    public final ToolbarAndProfilePicSectionUIState b;
    public final ProfileFieldsSectionUIState c;
    public final ConfirmationDialogUiState d;
    public final boolean e;
    public final UserProfileFormDialogType.DobPicker f;

    public UserProfileFormUIState(ToolbarAndProfilePicSectionUIState toolbarAndProfilePicSectionUIState, ProfileFieldsSectionUIState profileFieldsSectionUIState, ConfirmationDialogUiState confirmationDialogUiState, boolean z, UserProfileFormDialogType.DobPicker dobPicker) {
        UserProfileFormUISpecs userProfileFormUISpecs = new UserProfileFormUISpecs();
        Intrinsics.i(toolbarAndProfilePicSectionUIState, "toolbarAndProfilePicSectionUIState");
        Intrinsics.i(profileFieldsSectionUIState, "profileFieldsSectionUIState");
        this.f10370a = userProfileFormUISpecs;
        this.b = toolbarAndProfilePicSectionUIState;
        this.c = profileFieldsSectionUIState;
        this.d = confirmationDialogUiState;
        this.e = z;
        this.f = dobPicker;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserProfileFormUIState)) {
            return false;
        }
        UserProfileFormUIState userProfileFormUIState = (UserProfileFormUIState) obj;
        return Intrinsics.d(this.f10370a, userProfileFormUIState.f10370a) && Intrinsics.d(this.b, userProfileFormUIState.b) && Intrinsics.d(this.c, userProfileFormUIState.c) && Intrinsics.d(this.d, userProfileFormUIState.d) && this.e == userProfileFormUIState.e && Intrinsics.d(this.f, userProfileFormUIState.f);
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + ((this.b.hashCode() + (this.f10370a.f10369a.hashCode() * 31)) * 31)) * 31;
        ConfirmationDialogUiState confirmationDialogUiState = this.d;
        int iHashCode2 = (((iHashCode + (confirmationDialogUiState == null ? 0 : confirmationDialogUiState.hashCode())) * 31) + (this.e ? 1231 : 1237)) * 31;
        UserProfileFormDialogType.DobPicker dobPicker = this.f;
        return iHashCode2 + (dobPicker != null ? dobPicker.hashCode() : 0);
    }

    public final String toString() {
        return "UserProfileFormUIState(specs=" + this.f10370a + ", toolbarAndProfilePicSectionUIState=" + this.b + ", profileFieldsSectionUIState=" + this.c + ", confirmationDialogUiState=" + this.d + ", isLoading=" + this.e + ", dobPickerDialog=" + this.f + ")";
    }
}
