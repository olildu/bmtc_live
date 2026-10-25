package app.chalo.home.ui.profile;

import app.chalo.homescreen.data.model.app.ProfilePageFeature;
import app.chalo.userprofile.domain.AccountSettingsAction;
import defpackage.pk0;
import defpackage.r1;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\n\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\u0082\u0001\n\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015¨\u0006\u0016"}, d2 = {"Lapp/chalo/home/ui/profile/ProfileScreenViewIntent;", "", "ChaloPayIntroBottomSheetCtaClickedIntent", "DismissAccountSettingsBottomSheet", "AccountSettingsActionClickedIntent", "DeleteAccountDialogAgreeClicked", "DeleteAccountDialogCancelClicked", "DismissLogoutFailedDialog", "ProfileScreenStartedIntent", "ProfilePageItemClickedIntent", "CloseEnvironmentChangeDialog", "JuspayBackPressedIntent", "Lapp/chalo/home/ui/profile/ProfileScreenViewIntent$AccountSettingsActionClickedIntent;", "Lapp/chalo/home/ui/profile/ProfileScreenViewIntent$ChaloPayIntroBottomSheetCtaClickedIntent;", "Lapp/chalo/home/ui/profile/ProfileScreenViewIntent$CloseEnvironmentChangeDialog;", "Lapp/chalo/home/ui/profile/ProfileScreenViewIntent$DeleteAccountDialogAgreeClicked;", "Lapp/chalo/home/ui/profile/ProfileScreenViewIntent$DeleteAccountDialogCancelClicked;", "Lapp/chalo/home/ui/profile/ProfileScreenViewIntent$DismissAccountSettingsBottomSheet;", "Lapp/chalo/home/ui/profile/ProfileScreenViewIntent$DismissLogoutFailedDialog;", "Lapp/chalo/home/ui/profile/ProfileScreenViewIntent$JuspayBackPressedIntent;", "Lapp/chalo/home/ui/profile/ProfileScreenViewIntent$ProfilePageItemClickedIntent;", "Lapp/chalo/home/ui/profile/ProfileScreenViewIntent$ProfileScreenStartedIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class ProfileScreenViewIntent {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/profile/ProfileScreenViewIntent$AccountSettingsActionClickedIntent;", "Lapp/chalo/home/ui/profile/ProfileScreenViewIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class AccountSettingsActionClickedIntent extends ProfileScreenViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AccountSettingsAction f3604a;

        public AccountSettingsActionClickedIntent(AccountSettingsAction action) {
            Intrinsics.i(action, "action");
            this.f3604a = action;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof AccountSettingsActionClickedIntent) && this.f3604a == ((AccountSettingsActionClickedIntent) obj).f3604a;
        }

        public final int hashCode() {
            return this.f3604a.hashCode();
        }

        public final String toString() {
            return "AccountSettingsActionClickedIntent(action=" + this.f3604a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/profile/ProfileScreenViewIntent$ChaloPayIntroBottomSheetCtaClickedIntent;", "Lapp/chalo/home/ui/profile/ProfileScreenViewIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ChaloPayIntroBottomSheetCtaClickedIntent extends ProfileScreenViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ChaloPayIntroBottomSheetCtaClickedIntent f3605a = new ChaloPayIntroBottomSheetCtaClickedIntent();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/profile/ProfileScreenViewIntent$CloseEnvironmentChangeDialog;", "Lapp/chalo/home/ui/profile/ProfileScreenViewIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class CloseEnvironmentChangeDialog extends ProfileScreenViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final CloseEnvironmentChangeDialog f3606a = new CloseEnvironmentChangeDialog();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/profile/ProfileScreenViewIntent$DeleteAccountDialogAgreeClicked;", "Lapp/chalo/home/ui/profile/ProfileScreenViewIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class DeleteAccountDialogAgreeClicked extends ProfileScreenViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final DeleteAccountDialogAgreeClicked f3607a = new DeleteAccountDialogAgreeClicked();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/profile/ProfileScreenViewIntent$DeleteAccountDialogCancelClicked;", "Lapp/chalo/home/ui/profile/ProfileScreenViewIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class DeleteAccountDialogCancelClicked extends ProfileScreenViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final DeleteAccountDialogCancelClicked f3608a = new DeleteAccountDialogCancelClicked();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/profile/ProfileScreenViewIntent$DismissAccountSettingsBottomSheet;", "Lapp/chalo/home/ui/profile/ProfileScreenViewIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class DismissAccountSettingsBottomSheet extends ProfileScreenViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final DismissAccountSettingsBottomSheet f3609a = new DismissAccountSettingsBottomSheet();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/profile/ProfileScreenViewIntent$DismissLogoutFailedDialog;", "Lapp/chalo/home/ui/profile/ProfileScreenViewIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class DismissLogoutFailedDialog extends ProfileScreenViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final DismissLogoutFailedDialog f3610a = new DismissLogoutFailedDialog();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/profile/ProfileScreenViewIntent$JuspayBackPressedIntent;", "Lapp/chalo/home/ui/profile/ProfileScreenViewIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class JuspayBackPressedIntent extends ProfileScreenViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final JuspayBackPressedIntent f3611a = new JuspayBackPressedIntent();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/profile/ProfileScreenViewIntent$ProfilePageItemClickedIntent;", "Lapp/chalo/home/ui/profile/ProfileScreenViewIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ProfilePageItemClickedIntent extends ProfileScreenViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ProfilePageFeature f3612a;
        public final String b;
        public final Integer c;

        public ProfilePageItemClickedIntent(ProfilePageFeature featureType, String str, Integer num) {
            Intrinsics.i(featureType, "featureType");
            this.f3612a = featureType;
            this.b = str;
            this.c = num;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ProfilePageItemClickedIntent)) {
                return false;
            }
            ProfilePageItemClickedIntent profilePageItemClickedIntent = (ProfilePageItemClickedIntent) obj;
            return this.f3612a == profilePageItemClickedIntent.f3612a && Intrinsics.d(this.b, profilePageItemClickedIntent.b) && Intrinsics.d(this.c, profilePageItemClickedIntent.c);
        }

        public final int hashCode() {
            int iHashCode = this.f3612a.hashCode() * 31;
            String str = this.b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            Integer num = this.c;
            return iHashCode2 + (num != null ? num.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ProfilePageItemClickedIntent(featureType=");
            sb.append(this.f3612a);
            sb.append(", title=");
            sb.append(this.b);
            sb.append(", position=");
            return pk0.k(sb, this.c, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/profile/ProfileScreenViewIntent$ProfileScreenStartedIntent;", "Lapp/chalo/home/ui/profile/ProfileScreenViewIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ProfileScreenStartedIntent extends ProfileScreenViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f3613a;

        public ProfileScreenStartedIntent(List profilePageItems) {
            Intrinsics.i(profilePageItems, "profilePageItems");
            this.f3613a = profilePageItems;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ProfileScreenStartedIntent) && Intrinsics.d(this.f3613a, ((ProfileScreenStartedIntent) obj).f3613a);
        }

        public final int hashCode() {
            return this.f3613a.hashCode();
        }

        public final String toString() {
            return r1.d("ProfileScreenStartedIntent(profilePageItems=", ")", this.f3613a);
        }
    }
}
