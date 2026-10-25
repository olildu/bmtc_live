package app.chalo.premiumbus.bulkbookingridedetails.domain;

import app.chalo.premiumbus.data.repository.PremiumBusRepository;
import app.chalo.providers.UserProfileDetailsProvider;
import app.chalo.providers.cityprovider.CityProvider;
import app.chalo.providers.cityprovider.CityProviderKt;
import app.chalo.userprofile.UserProfileAppModel;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/bulkbookingridedetails/domain/FetchAllPremiumReserveTicketsBookedThroughPassUseCase;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FetchAllPremiumReserveTicketsBookedThroughPassUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PremiumBusRepository f6895a;
    public final UserProfileDetailsProvider b;
    public final CityProvider c;

    public FetchAllPremiumReserveTicketsBookedThroughPassUseCase(PremiumBusRepository premiumBusRepository, UserProfileDetailsProvider userProfileDetailsProvider, CityProvider cityProvider) {
        this.f6895a = premiumBusRepository;
        this.b = userProfileDetailsProvider;
        this.c = cityProvider;
    }

    public final Object a(String str, ContinuationImpl continuationImpl) {
        String str2;
        UserProfileAppModel userProfileAppModelF = this.b.f();
        String lowerCase = "";
        if (userProfileAppModelF == null || (str2 = userProfileAppModelF.i) == null) {
            str2 = "";
        }
        String strB = CityProviderKt.b(this.c);
        if (strB != null) {
            lowerCase = strB.toLowerCase(Locale.ROOT);
            Intrinsics.h(lowerCase, "toLowerCase(...)");
        }
        return this.f6895a.z(str2, str, lowerCase, continuationImpl);
    }
}
