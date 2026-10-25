package app.chalo.ncmc.cardreceipt;

import app.chalo.providers.UserProfileDetailsProvider;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.receipt.UserDetailsForProducts;
import app.chalo.userprofile.Gender;
import app.chalo.userprofile.GenderKt;
import app.chalo.userprofile.UserProfileAppModel;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ncmc/cardreceipt/UserDetailsForChaloCard;", "Lapp/chalo/receipt/UserDetailsForProducts;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class UserDetailsForChaloCard implements UserDetailsForProducts {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UserProfileDetailsProvider f6023a;

    public UserDetailsForChaloCard(UserProfileDetailsProvider userProfileDetailsProvider) {
        this.f6023a = userProfileDetailsProvider;
    }

    @Override // app.chalo.receipt.UserDetailsForProducts
    public final String a() {
        String strA;
        UserProfileAppModel userProfileAppModelF = this.f6023a.f();
        return (userProfileAppModelF == null || (strA = userProfileAppModelF.a()) == null) ? "" : strA;
    }

    @Override // app.chalo.receipt.UserDetailsForProducts
    public final String b() {
        return "";
    }

    @Override // app.chalo.receipt.UserDetailsForProducts
    public final String c() {
        return "";
    }

    @Override // app.chalo.receipt.UserDetailsForProducts
    public final StringEnum d() {
        return GenderKt.a(Gender.NULL);
    }

    @Override // app.chalo.receipt.UserDetailsForProducts
    public final String e() {
        return "";
    }
}
