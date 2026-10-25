package app.chalo.home.helper;

import app.chalo.homescreen.data.model.app.HomeScreenConfigAppModel;
import app.chalo.manager.homescreen.HomeScreenConfigManager;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/helper/HomeScreenConfigDataHelperImpl;", "Lapp/chalo/home/helper/HomeScreenConfigDataHelper;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class HomeScreenConfigDataHelperImpl implements HomeScreenConfigDataHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HomeScreenConfigManager f3102a;

    public HomeScreenConfigDataHelperImpl(HomeScreenConfigManager homeScreenConfigManager) {
        this.f3102a = homeScreenConfigManager;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.home.helper.HomeScreenConfigDataHelper
    public final Object a(ContinuationImpl continuationImpl) {
        HomeScreenConfigDataHelperImpl$getBusService$1 homeScreenConfigDataHelperImpl$getBusService$1;
        if (continuationImpl instanceof HomeScreenConfigDataHelperImpl$getBusService$1) {
            homeScreenConfigDataHelperImpl$getBusService$1 = (HomeScreenConfigDataHelperImpl$getBusService$1) continuationImpl;
            int i = homeScreenConfigDataHelperImpl$getBusService$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                homeScreenConfigDataHelperImpl$getBusService$1.label = i - Integer.MIN_VALUE;
            } else {
                homeScreenConfigDataHelperImpl$getBusService$1 = new HomeScreenConfigDataHelperImpl$getBusService$1(this, continuationImpl);
            }
        } else {
            homeScreenConfigDataHelperImpl$getBusService$1 = new HomeScreenConfigDataHelperImpl$getBusService$1(this, continuationImpl);
        }
        Object objA = homeScreenConfigDataHelperImpl$getBusService$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = homeScreenConfigDataHelperImpl$getBusService$1.label;
        if (i2 == 0) {
            ResultKt.b(objA);
            homeScreenConfigDataHelperImpl$getBusService$1.label = 1;
            objA = this.f3102a.a(homeScreenConfigDataHelperImpl$getBusService$1);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objA);
        }
        HomeScreenConfigAppModel homeScreenConfigAppModel = (HomeScreenConfigAppModel) objA;
        if (homeScreenConfigAppModel != null) {
            return homeScreenConfigAppModel.f3749a;
        }
        return null;
    }
}
