package app.chalo.home;

import androidx.webkit.Profile;
import app.chalo.compose.components.userprofile.UserProfilePicComposableUIState;
import defpackage.r1;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lapp/chalo/home/ChaloBottomSheetLayoutType;", "", Profile.DEFAULT_PROFILE_NAME, "NotificationPermissionBottomSheet", "TutorialBottomSheet", "UserProfiling", "Lapp/chalo/home/ChaloBottomSheetLayoutType$Default;", "Lapp/chalo/home/ChaloBottomSheetLayoutType$NotificationPermissionBottomSheet;", "Lapp/chalo/home/ChaloBottomSheetLayoutType$TutorialBottomSheet;", "Lapp/chalo/home/ChaloBottomSheetLayoutType$UserProfiling;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class ChaloBottomSheetLayoutType {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ChaloBottomSheetLayoutType$Default;", "Lapp/chalo/home/ChaloBottomSheetLayoutType;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Default extends ChaloBottomSheetLayoutType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Default f2845a = new Default();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ChaloBottomSheetLayoutType$NotificationPermissionBottomSheet;", "Lapp/chalo/home/ChaloBottomSheetLayoutType;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class NotificationPermissionBottomSheet extends ChaloBottomSheetLayoutType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final NotificationPermissionBottomSheet f2846a = new NotificationPermissionBottomSheet();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ChaloBottomSheetLayoutType$TutorialBottomSheet;", "Lapp/chalo/home/ChaloBottomSheetLayoutType;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TutorialBottomSheet extends ChaloBottomSheetLayoutType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f2847a;

        public TutorialBottomSheet(List tutorialList) {
            Intrinsics.i(tutorialList, "tutorialList");
            this.f2847a = tutorialList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TutorialBottomSheet) && Intrinsics.d(this.f2847a, ((TutorialBottomSheet) obj).f2847a);
        }

        public final int hashCode() {
            return this.f2847a.hashCode();
        }

        public final String toString() {
            return r1.d("TutorialBottomSheet(tutorialList=", ")", this.f2847a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ChaloBottomSheetLayoutType$UserProfiling;", "Lapp/chalo/home/ChaloBottomSheetLayoutType;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class UserProfiling extends ChaloBottomSheetLayoutType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final UserProfilePicComposableUIState f2848a;

        public UserProfiling(UserProfilePicComposableUIState userProfilePicComposableUIState) {
            this.f2848a = userProfilePicComposableUIState;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UserProfiling) && Intrinsics.d(this.f2848a, ((UserProfiling) obj).f2848a);
        }

        public final int hashCode() {
            return this.f2848a.hashCode();
        }

        public final String toString() {
            return "UserProfiling(profilePicUiState=" + this.f2848a + ")";
        }
    }
}
