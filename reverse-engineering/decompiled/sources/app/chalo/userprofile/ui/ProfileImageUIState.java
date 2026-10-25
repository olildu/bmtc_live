package app.chalo.userprofile.ui;

import app.chalo.fileupload.picker.BitmapImage;
import app.chalo.uistate.image.ImageUIState;
import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lapp/chalo/userprofile/ui/ProfileImageUIState;", "", "ProfilePhotoUrl", "DefaultProfileImage", "ExistingImage", "Lapp/chalo/userprofile/ui/ProfileImageUIState$DefaultProfileImage;", "Lapp/chalo/userprofile/ui/ProfileImageUIState$ExistingImage;", "Lapp/chalo/userprofile/ui/ProfileImageUIState$ProfilePhotoUrl;", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class ProfileImageUIState {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/userprofile/ui/ProfileImageUIState$DefaultProfileImage;", "Lapp/chalo/userprofile/ui/ProfileImageUIState;", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class DefaultProfileImage extends ProfileImageUIState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ImageUIState f10337a;

        public DefaultProfileImage(ImageUIState imageUIState) {
            this.f10337a = imageUIState;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof DefaultProfileImage) && Intrinsics.d(this.f10337a, ((DefaultProfileImage) obj).f10337a);
        }

        public final int hashCode() {
            return this.f10337a.hashCode();
        }

        public final String toString() {
            return "DefaultProfileImage(defaultProfileImage=" + this.f10337a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/userprofile/ui/ProfileImageUIState$ExistingImage;", "Lapp/chalo/userprofile/ui/ProfileImageUIState;", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ExistingImage extends ProfileImageUIState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BitmapImage f10338a;

        public ExistingImage(BitmapImage bitmapImage) {
            Intrinsics.i(bitmapImage, "bitmapImage");
            this.f10338a = bitmapImage;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ExistingImage) && Intrinsics.d(this.f10338a, ((ExistingImage) obj).f10338a);
        }

        public final int hashCode() {
            return this.f10338a.hashCode();
        }

        public final String toString() {
            return "ExistingImage(bitmapImage=" + this.f10338a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/userprofile/ui/ProfileImageUIState$ProfilePhotoUrl;", "Lapp/chalo/userprofile/ui/ProfileImageUIState;", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ProfilePhotoUrl extends ProfileImageUIState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f10339a;

        public ProfilePhotoUrl(String profilePhotoUrl) {
            Intrinsics.i(profilePhotoUrl, "profilePhotoUrl");
            this.f10339a = profilePhotoUrl;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ProfilePhotoUrl) && Intrinsics.d(this.f10339a, ((ProfilePhotoUrl) obj).f10339a);
        }

        public final int hashCode() {
            return this.f10339a.hashCode();
        }

        public final String toString() {
            return vo1.B("ProfilePhotoUrl(profilePhotoUrl=", this.f10339a, ")");
        }
    }
}
