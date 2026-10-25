package app.chalo.home.ui;

import app.chalo.homescreen.data.model.app.BottomNavTabType;
import java.util.Set;
import kotlin.Metadata;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/HomeTabScreensNavigationAndStateManager;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface HomeTabScreensNavigationAndStateManager {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
    }

    void a(BottomNavTabType bottomNavTabType, BottomNavTabType bottomNavTabType2);

    void b(HomeTabScreensRetainedData homeTabScreensRetainedData);

    void c(BottomNavTabType bottomNavTabType, boolean z);

    void d(Set set);

    void e();

    StateFlow getState();

    void goBack();
}
