package app.chalo.ondc.validation.metro;

import app.chalo.providers.UserProfileDetailsProvider;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.receipt.UserDetailsForProducts;
import app.chalo.userprofile.Gender;
import app.chalo.userprofile.GenderKt;
import app.chalo.userprofile.UserProfileAppModel;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ondc/validation/metro/OndcMetroTicketUserDetailsForProducts;", "Lapp/chalo/receipt/UserDetailsForProducts;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class OndcMetroTicketUserDetailsForProducts implements UserDetailsForProducts {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UserProfileDetailsProvider f6812a;
    public final UserProfileAppModel b;

    public OndcMetroTicketUserDetailsForProducts(UserProfileDetailsProvider userProfileDetailsProvider) {
        this.f6812a = userProfileDetailsProvider;
        this.b = userProfileDetailsProvider.f();
    }

    @Override // app.chalo.receipt.UserDetailsForProducts
    /* JADX INFO: renamed from: a */
    public final String getC() {
        String str;
        UserProfileAppModel userProfileAppModel = this.b;
        return (userProfileAppModel == null || (str = userProfileAppModel.f10305a) == null) ? "" : str;
    }

    @Override // app.chalo.receipt.UserDetailsForProducts
    public final String b() {
        Gender gender;
        String strName;
        UserProfileAppModel userProfileAppModel = this.b;
        return (userProfileAppModel == null || (gender = userProfileAppModel.d) == null || (strName = gender.name()) == null) ? "" : strName;
    }

    @Override // app.chalo.receipt.UserDetailsForProducts
    /* JADX INFO: renamed from: c */
    public final String getE() {
        String str;
        UserProfileAppModel userProfileAppModel = this.b;
        return (userProfileAppModel == null || (str = userProfileAppModel.c) == null) ? "" : str;
    }

    @Override // app.chalo.receipt.UserDetailsForProducts
    public final StringEnum d() {
        Gender gender;
        UserProfileAppModel userProfileAppModel = this.b;
        if (userProfileAppModel == null || (gender = userProfileAppModel.d) == null) {
            return null;
        }
        return GenderKt.a(gender);
    }

    @Override // app.chalo.receipt.UserDetailsForProducts
    public final String e() {
        UserProfileAppModel userProfileAppModel = this.b;
        return String.valueOf(userProfileAppModel != null ? userProfileAppModel.g : null);
    }
}
