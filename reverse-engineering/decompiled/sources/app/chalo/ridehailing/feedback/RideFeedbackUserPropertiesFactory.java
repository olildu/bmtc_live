package app.chalo.ridehailing.feedback;

import app.chalo.providers.UserProfileDetailsProvider;
import app.chalo.providers.cityprovider.CityProvider;
import app.chalo.providers.cityprovider.CityProviderKt;
import app.chalo.userprofile.UserProfileAppModel;
import java.util.LinkedHashMap;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ridehailing/feedback/RideFeedbackUserPropertiesFactory;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RideFeedbackUserPropertiesFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CityProvider f9156a;
    public final UserProfileDetailsProvider b;

    public RideFeedbackUserPropertiesFactory(CityProvider cityProvider, UserProfileDetailsProvider userProfileDetailsProvider) {
        this.f9156a = cityProvider;
        this.b = userProfileDetailsProvider;
    }

    public final LinkedHashMap a() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String strB = CityProviderKt.b(this.f9156a);
        UserProfileAppModel userProfileAppModelF = this.b.f();
        if (userProfileAppModelF != null) {
            linkedHashMap.put("userPropertyPhoneNo", userProfileAppModelF.e);
            linkedHashMap.put("userPropertyUserID", userProfileAppModelF.i);
            linkedHashMap.put("userPropertyUserName", userProfileAppModelF.f10305a + " " + userProfileAppModelF.b);
        }
        if (strB != null) {
            linkedHashMap.put("userPropertyCity", strB);
        }
        return linkedHashMap;
    }
}
