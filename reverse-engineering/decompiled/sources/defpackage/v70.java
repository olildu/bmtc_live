package defpackage;

import app.chalo.home.ui.base.HomeComponent;
import app.chalo.home.ui.base.HomeScreenFragmentViewIntent;
import app.chalo.homescreen.data.model.app.BottomNavTabType;
import app.chalo.login.userprofiling.hookorchestrator.UserProfilingHookSlot;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class v70 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19810a;
    public final /* synthetic */ HomeComponent b;

    public /* synthetic */ v70(HomeComponent homeComponent, int i) {
        this.f19810a = i;
        this.b = homeComponent;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f19810a) {
            case 0:
                this.b.l1(HomeScreenFragmentViewIntent.UserProfilingStickyBannerClickedIntent.f3223a);
                break;
            case 1:
                this.b.l1(HomeScreenFragmentViewIntent.ChaloBusStickyBannerClickedIntent.f3211a);
                break;
            case 2:
                HomeComponent homeComponent = this.b;
                homeComponent.h1 = true;
                BottomNavTabType bottomNavTabType = homeComponent.g1;
                if (bottomNavTabType != null) {
                    homeComponent.M0.f3227a.setValue(bottomNavTabType);
                }
                return Unit.f17538a;
            case 3:
                HomeComponent homeComponent2 = this.b;
                homeComponent2.h1 = false;
                homeComponent2.M0.f3227a.setValue(null);
                break;
            default:
                this.b.l1(new HomeScreenFragmentViewIntent.UserProfilingHookDisplayedIntent(UserProfilingHookSlot.HOME_STICKY_BANNER, null, null));
                break;
        }
        return Unit.f17538a;
    }
}
