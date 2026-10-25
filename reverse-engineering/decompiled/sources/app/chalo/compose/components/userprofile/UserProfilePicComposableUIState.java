package app.chalo.compose.components.userprofile;

import app.chalo.uistate.image.ImageUIState;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/compose/components/userprofile/UserProfilePicComposableUIState;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class UserProfilePicComposableUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UserProfilePicComposableUISpecs f1902a;
    public final ImageUIState b;

    public UserProfilePicComposableUIState(UserProfilePicComposableUISpecs userProfilePicComposableUISpecs, ImageUIState imageUIState) {
        this.f1902a = userProfilePicComposableUISpecs;
        this.b = imageUIState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserProfilePicComposableUIState)) {
            return false;
        }
        UserProfilePicComposableUIState userProfilePicComposableUIState = (UserProfilePicComposableUIState) obj;
        return Intrinsics.d(this.f1902a, userProfilePicComposableUIState.f1902a) && Intrinsics.d(this.b, userProfilePicComposableUIState.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f1902a.hashCode() * 31);
    }

    public final String toString() {
        return "UserProfilePicComposableUIState(specs=" + this.f1902a + ", defaultProfileImage=" + this.b + ")";
    }
}
