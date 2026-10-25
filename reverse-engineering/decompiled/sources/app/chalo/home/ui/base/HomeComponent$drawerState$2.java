package app.chalo.home.ui.base;

import app.chalo.home.ui.profile.ProfileScreenComponent;
import app.chalo.homescreen.data.model.app.HomeScreenConfigAppModel;
import com.arkivanov.decompose.ComponentContext;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.ClassReference;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.context.GlobalContext;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.parameter.ParametersHolderKt;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final /* synthetic */ class HomeComponent$drawerState$2 extends FunctionReferenceImpl implements Function2<HomeScreenDrawerConfiguration, ComponentContext, HomeScreenDrawerChild> {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Scope f18811a;
        ClassReference classReferenceA;
        ParametersHolder parametersHolderA;
        HomeScreenDrawerConfiguration p0 = (HomeScreenDrawerConfiguration) obj;
        ComponentContext p1 = (ComponentContext) obj2;
        Intrinsics.i(p0, "p0");
        Intrinsics.i(p1, "p1");
        HomeComponent homeComponent = (HomeComponent) this.receiver;
        homeComponent.getClass();
        if (!p0.equals(HomeScreenDrawerConfiguration.ProfileScreenDrawer.INSTANCE)) {
            throw new NoWhenBranchMatchedException();
        }
        if (homeComponent instanceof KoinScopeComponent) {
            f18811a = ((KoinScopeComponent) homeComponent).getF18811a();
            classReferenceA = Reflection.a(ProfileScreenComponent.class);
            f18811a.getClass();
            parametersHolderA = ParametersHolderKt.a(p1);
        } else {
            f18811a = GlobalContext.f18817a.a().c.d;
            classReferenceA = Reflection.a(ProfileScreenComponent.class);
            f18811a.getClass();
            parametersHolderA = ParametersHolderKt.a(p1);
        }
        ProfileScreenComponent profileScreenComponent = (ProfileScreenComponent) f18811a.d(classReferenceA, parametersHolderA, null);
        HomeScreenConfigAppModel homeScreenConfigAppModel = ((HomeScreenFragmentViewState) homeComponent.f.getValue()).d;
        return new HomeScreenDrawerChild.ProfileDrawerChild(profileScreenComponent, homeScreenConfigAppModel != null ? homeScreenConfigAppModel.b : null);
    }
}
