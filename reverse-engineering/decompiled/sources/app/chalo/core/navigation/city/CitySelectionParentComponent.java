package app.chalo.core.navigation.city;

import app.chalo.core.component.AppComponentFactory;
import app.chalo.navigation.child.ChildComponent;
import app.chalo.navigation.parent.DefaultParentComponent;
import app.chalo.onboarding.citylocationselection.ui.CityLocationSelectionComponent;
import app.chalo.onboarding.cityselection.ui.CitySelectionComponent;
import app.chalo.scenes.args.CitySelectionArgs;
import app.chalo.scenes.args.SceneArgs;
import com.arkivanov.decompose.ComponentContext;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lapp/chalo/core/navigation/city/CitySelectionParentComponent;", "Lapp/chalo/navigation/parent/DefaultParentComponent;", "Lapp/chalo/scenes/args/CitySelectionArgs;", "Lapp/chalo/core/navigation/city/CitySelectionParentComponent$CitySelectionChild;", "CitySelectionChild", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CitySelectionParentComponent extends DefaultParentComponent<CitySelectionArgs, CitySelectionChild> {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/core/navigation/city/CitySelectionParentComponent$CitySelectionChild;", "Lapp/chalo/navigation/child/ChildComponent;", "CityLocationSelection", "CitySelection", "Lapp/chalo/core/navigation/city/CitySelectionParentComponent$CitySelectionChild$CityLocationSelection;", "Lapp/chalo/core/navigation/city/CitySelectionParentComponent$CitySelectionChild$CitySelection;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class CitySelectionChild implements ChildComponent {

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/core/navigation/city/CitySelectionParentComponent$CitySelectionChild$CityLocationSelection;", "Lapp/chalo/core/navigation/city/CitySelectionParentComponent$CitySelectionChild;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class CityLocationSelection extends CitySelectionChild {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final CityLocationSelectionComponent f2170a;

            public CityLocationSelection(CityLocationSelectionComponent cityLocationSelectionComponent) {
                this.f2170a = cityLocationSelectionComponent;
            }

            @Override // app.chalo.navigation.child.ChildComponent
            public final ComponentContext a() {
                return this.f2170a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof CityLocationSelection) && Intrinsics.d(this.f2170a, ((CityLocationSelection) obj).f2170a);
            }

            public final int hashCode() {
                return this.f2170a.hashCode();
            }

            public final String toString() {
                return "CityLocationSelection(component=" + this.f2170a + ")";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/core/navigation/city/CitySelectionParentComponent$CitySelectionChild$CitySelection;", "Lapp/chalo/core/navigation/city/CitySelectionParentComponent$CitySelectionChild;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class CitySelection extends CitySelectionChild {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final CitySelectionComponent f2171a;

            public CitySelection(CitySelectionComponent citySelectionComponent) {
                this.f2171a = citySelectionComponent;
            }

            @Override // app.chalo.navigation.child.ChildComponent
            public final ComponentContext a() {
                return this.f2171a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof CitySelection) && Intrinsics.d(this.f2171a, ((CitySelection) obj).f2171a);
            }

            public final int hashCode() {
                return this.f2171a.hashCode();
            }

            public final String toString() {
                return "CitySelection(component=" + this.f2171a + ")";
            }
        }
    }

    @Override // app.chalo.navigation.parent.DefaultParentComponent, app.chalo.navigation.parent.ParentComponent
    public final boolean Y(SceneArgs args) {
        Intrinsics.i(args, "args");
        return args instanceof CitySelectionArgs;
    }

    @Override // app.chalo.navigation.parent.DefaultParentComponent
    public final KSerializer a() {
        return CitySelectionArgs.INSTANCE.serializer();
    }

    @Override // app.chalo.navigation.parent.DefaultParentComponent
    public final ChildComponent m(SceneArgs sceneArgs, ComponentContext componentContext) {
        CitySelectionArgs args = (CitySelectionArgs) sceneArgs;
        Intrinsics.i(args, "args");
        Intrinsics.i(componentContext, "componentContext");
        boolean z = args instanceof CitySelectionArgs.CityLocationSelectionArgs;
        AppComponentFactory appComponentFactory = AppComponentFactory.f2029a;
        if (z) {
            return new CitySelectionChild.CityLocationSelection((CityLocationSelectionComponent) appComponentFactory.a(args, componentContext, Arrays.copyOf(new Object[0], 0)));
        }
        if (args instanceof CitySelectionArgs.OldCitySelectionArgs) {
            return new CitySelectionChild.CitySelection((CitySelectionComponent) appComponentFactory.a(args, componentContext, Arrays.copyOf(new Object[0], 0)));
        }
        throw new NoWhenBranchMatchedException();
    }
}
