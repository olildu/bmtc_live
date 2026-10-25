package app.chalo.home.manager;

import app.chalo.home.domain.GetHomeScreenConfigUseCase;
import app.chalo.homescreen.data.model.app.HomeScreenConfigGetType;
import app.chalo.manager.homescreen.HomeScreenConfigManager;
import app.chalo.providers.cityprovider.CityProvider;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/manager/HomeScreenConfigManagerImpl;", "Lapp/chalo/manager/homescreen/HomeScreenConfigManager;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class HomeScreenConfigManagerImpl implements HomeScreenConfigManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CityProvider f3112a;
    public final GetHomeScreenConfigUseCase b;

    public HomeScreenConfigManagerImpl(GetHomeScreenConfigUseCase getHomeScreenConfigUseCase, CityProvider cityProvider) {
        this.f3112a = cityProvider;
        this.b = getHomeScreenConfigUseCase;
    }

    @Override // app.chalo.manager.homescreen.HomeScreenConfigManager
    public final Object a(ContinuationImpl continuationImpl) {
        return this.b.c(this.f3112a.h(), HomeScreenConfigGetType.ONLY_RETURN_CACHED_DATA_EVEN_IF_NULL_AND_DO_NOT_REFRESH, continuationImpl);
    }

    @Override // app.chalo.manager.homescreen.HomeScreenConfigManager
    public final Object b(String str, HomeScreenConfigGetType homeScreenConfigGetType, ContinuationImpl continuationImpl) {
        return this.b.c(str, homeScreenConfigGetType, continuationImpl);
    }
}
