package app.chalo.home.ui.base;

import com.arkivanov.decompose.ComponentContext;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final /* synthetic */ class HomeComponent$tabStack$1 extends FunctionReferenceImpl implements Function2<HomeScreenBottomTabConfiguration, ComponentContext, HomeComponent.TabChild> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Object next;
        HomeScreenBottomTabConfiguration p0 = (HomeScreenBottomTabConfiguration) obj;
        ComponentContext p1 = (ComponentContext) obj2;
        Intrinsics.i(p0, "p0");
        Intrinsics.i(p1, "p1");
        HomeComponent homeComponent = (HomeComponent) this.receiver;
        homeComponent.getClass();
        if (Intrinsics.d(p0, HomeScreenBottomTabConfiguration.UnknownTab.INSTANCE)) {
            return HomeComponent.TabChild.UnknownTab.f3192a;
        }
        Iterator it = ((Iterable) homeComponent.N0.a()).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((HomeComponent.TabComponentEntry) next).f3193a != p0.f3204a);
        HomeComponent.TabComponentEntry tabComponentEntry = (HomeComponent.TabComponentEntry) next;
        return tabComponentEntry != null ? tabComponentEntry.d : homeComponent.h1(p0, p1, null);
    }
}
