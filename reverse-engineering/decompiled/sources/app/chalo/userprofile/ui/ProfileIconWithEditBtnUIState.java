package app.chalo.userprofile.ui;

import app.chalo.uistate.base.UiEventHandler$Companion$fromLambda$1;
import app.chalo.uistate.image.ImageUIState;
import defpackage.r30;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/userprofile/ui/ProfileIconWithEditBtnUIState;", "", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ProfileIconWithEditBtnUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ProfileIconWithEditBtnUISpecs f10336a;
    public final ProfileImageUIState b;
    public final ImageUIState c;
    public final UiEventHandler$Companion$fromLambda$1 d;

    public ProfileIconWithEditBtnUIState(ProfileIconWithEditBtnUISpecs profileIconWithEditBtnUISpecs, ProfileImageUIState profileImageUIState, ImageUIState imageUIState, UiEventHandler$Companion$fromLambda$1 uiEventHandler$Companion$fromLambda$1) {
        this.f10336a = profileIconWithEditBtnUISpecs;
        this.b = profileImageUIState;
        this.c = imageUIState;
        this.d = uiEventHandler$Companion$fromLambda$1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProfileIconWithEditBtnUIState)) {
            return false;
        }
        ProfileIconWithEditBtnUIState profileIconWithEditBtnUIState = (ProfileIconWithEditBtnUIState) obj;
        return this.f10336a.equals(profileIconWithEditBtnUIState.f10336a) && this.b.equals(profileIconWithEditBtnUIState.b) && this.c.equals(profileIconWithEditBtnUIState.c) && this.d.equals(profileIconWithEditBtnUIState.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + r30.e(this.c, (this.b.hashCode() + (this.f10336a.hashCode() * 31)) * 31, 31);
    }

    public final String toString() {
        return "ProfileIconWithEditBtnUIState(specs=" + this.f10336a + ", profileImageUIState=" + this.b + ", editBtnImageUIState=" + this.c + ", eventHandler=" + this.d + ")";
    }
}
