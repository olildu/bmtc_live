package app.chalo.mTicketing.validation;

import app.chalo.models.userprofile.UserProfile;
import app.chalo.providers.UserProfileDetailsProvider;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.receipt.UserDetailsForProducts;
import app.chalo.userprofile.Gender;
import app.chalo.userprofile.GenderKt;
import app.chalo.userprofile.UserProfileAppModel;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/mTicketing/validation/MTicketUserDetailsForProducts;", "Lapp/chalo/receipt/UserDetailsForProducts;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MTicketUserDetailsForProducts implements UserDetailsForProducts {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UserProfile f5394a;
    public final UserProfileDetailsProvider b;
    public final UserProfileAppModel c;

    public MTicketUserDetailsForProducts(UserProfile userProfile, UserProfileDetailsProvider userProfileDetailsProvider) {
        this.f5394a = userProfile;
        this.b = userProfileDetailsProvider;
        this.c = userProfileDetailsProvider.f();
    }

    @Override // app.chalo.receipt.UserDetailsForProducts
    /* JADX INFO: renamed from: a */
    public final String getC() {
        String strA;
        UserProfile userProfile = this.f5394a;
        if (userProfile != null && (strA = userProfile.a()) != null) {
            return strA;
        }
        UserProfileAppModel userProfileAppModel = this.c;
        return userProfileAppModel != null ? userProfileAppModel.a() : "";
    }

    @Override // app.chalo.receipt.UserDetailsForProducts
    public final String b() {
        Gender gender;
        String str;
        UserProfile userProfile = this.f5394a;
        return (userProfile == null || (gender = userProfile.d) == null || (str = gender.get_value()) == null) ? "" : str;
    }

    @Override // app.chalo.receipt.UserDetailsForProducts
    /* JADX INFO: renamed from: c */
    public final String getE() {
        String str;
        UserProfile userProfile = this.f5394a;
        return (userProfile == null || (str = userProfile.h) == null) ? "" : str;
    }

    @Override // app.chalo.receipt.UserDetailsForProducts
    public final StringEnum d() {
        Gender gender;
        UserProfile userProfile = this.f5394a;
        if (userProfile == null || (gender = userProfile.d) == null) {
            return null;
        }
        return GenderKt.a(gender);
    }

    @Override // app.chalo.receipt.UserDetailsForProducts
    public final String e() {
        String str;
        UserProfile userProfile = this.f5394a;
        return (userProfile == null || (str = userProfile.e) == null) ? "" : str;
    }
}
