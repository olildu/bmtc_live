package app.chalo.core.navigation.premiumbus;

import app.chalo.core.component.AppComponentFactory;
import app.chalo.navigation.child.ChildComponent;
import app.chalo.navigation.parent.DefaultParentComponent;
import app.chalo.premiumbus.managers.PremiumBusSharedManagerViewModel;
import app.chalo.premiumbus.ui.bulkbookingsuccess.PremiumBusBulkBookingConfirmationComponent;
import app.chalo.premiumbus.ui.passpurchaselanding.PbPassPurchaseLandingScreenComponent;
import app.chalo.premiumbus.ui.productselection.PremiumBusProductSelectionComponent;
import app.chalo.premiumbus.ui.seatselection.PremiumBusSeatSelectionComponent;
import app.chalo.premiumbus.ui.slotselection.PremiumBusSlotSelectionComponent;
import app.chalo.premiumbus.ui.slotselectionlist.SlotSelectionListComponent;
import app.chalo.premiumbus.ui.stopdetails.PBStopDetailsComponent;
import app.chalo.premiumbus.ui.stopselection.PremiumBusStopSelectionComponent;
import app.chalo.scenes.args.PremiumBusArgs;
import app.chalo.scenes.args.SceneArgs;
import com.arkivanov.decompose.ComponentContext;
import com.arkivanov.essenty.backhandler.BackHandlerOwner;
import defpackage.kn0;
import java.util.Arrays;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.serialization.KSerializer;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.context.GlobalContext;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/core/navigation/premiumbus/PremiumBusParentComponent;", "Lapp/chalo/navigation/parent/DefaultParentComponent;", "Lapp/chalo/scenes/args/PremiumBusArgs;", "Lapp/chalo/core/navigation/premiumbus/PremiumBusParentComponent$PremiumBusChild;", "Lorg/koin/core/component/KoinComponent;", "PremiumBusChild", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PremiumBusParentComponent extends DefaultParentComponent<PremiumBusArgs, PremiumBusChild> implements KoinComponent {
    public final PremiumBusArgs d;
    public final ComponentContext e;
    public final Object f;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\u0082\u0001\b\n\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lapp/chalo/core/navigation/premiumbus/PremiumBusParentComponent$PremiumBusChild;", "Lapp/chalo/navigation/child/ChildComponent;", "PBStopDetails", "PremiumBusPassLanding", "PremiumBusProductSelection", "PremiumBusSeatSelection", "PremiumBusSlotSelection", "PremiumBusStopSelection", "PremiumBusBulkBookingSuccessScreen", "SlotSelectionListScreen", "Lapp/chalo/core/navigation/premiumbus/PremiumBusParentComponent$PremiumBusChild$PBStopDetails;", "Lapp/chalo/core/navigation/premiumbus/PremiumBusParentComponent$PremiumBusChild$PremiumBusBulkBookingSuccessScreen;", "Lapp/chalo/core/navigation/premiumbus/PremiumBusParentComponent$PremiumBusChild$PremiumBusPassLanding;", "Lapp/chalo/core/navigation/premiumbus/PremiumBusParentComponent$PremiumBusChild$PremiumBusProductSelection;", "Lapp/chalo/core/navigation/premiumbus/PremiumBusParentComponent$PremiumBusChild$PremiumBusSeatSelection;", "Lapp/chalo/core/navigation/premiumbus/PremiumBusParentComponent$PremiumBusChild$PremiumBusSlotSelection;", "Lapp/chalo/core/navigation/premiumbus/PremiumBusParentComponent$PremiumBusChild$PremiumBusStopSelection;", "Lapp/chalo/core/navigation/premiumbus/PremiumBusParentComponent$PremiumBusChild$SlotSelectionListScreen;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class PremiumBusChild implements ChildComponent {

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/core/navigation/premiumbus/PremiumBusParentComponent$PremiumBusChild$PBStopDetails;", "Lapp/chalo/core/navigation/premiumbus/PremiumBusParentComponent$PremiumBusChild;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class PBStopDetails extends PremiumBusChild {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final PBStopDetailsComponent f2172a;

            public PBStopDetails(PBStopDetailsComponent pBStopDetailsComponent) {
                this.f2172a = pBStopDetailsComponent;
            }

            @Override // app.chalo.navigation.child.ChildComponent
            public final ComponentContext a() {
                return this.f2172a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof PBStopDetails) && Intrinsics.d(this.f2172a, ((PBStopDetails) obj).f2172a);
            }

            public final int hashCode() {
                return this.f2172a.hashCode();
            }

            public final String toString() {
                return "PBStopDetails(component=" + this.f2172a + ")";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/core/navigation/premiumbus/PremiumBusParentComponent$PremiumBusChild$PremiumBusBulkBookingSuccessScreen;", "Lapp/chalo/core/navigation/premiumbus/PremiumBusParentComponent$PremiumBusChild;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class PremiumBusBulkBookingSuccessScreen extends PremiumBusChild {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final PremiumBusBulkBookingConfirmationComponent f2173a;

            public PremiumBusBulkBookingSuccessScreen(PremiumBusBulkBookingConfirmationComponent premiumBusBulkBookingConfirmationComponent) {
                this.f2173a = premiumBusBulkBookingConfirmationComponent;
            }

            @Override // app.chalo.navigation.child.ChildComponent
            public final ComponentContext a() {
                return this.f2173a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof PremiumBusBulkBookingSuccessScreen) && Intrinsics.d(this.f2173a, ((PremiumBusBulkBookingSuccessScreen) obj).f2173a);
            }

            public final int hashCode() {
                return this.f2173a.hashCode();
            }

            public final String toString() {
                return "PremiumBusBulkBookingSuccessScreen(component=" + this.f2173a + ")";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/core/navigation/premiumbus/PremiumBusParentComponent$PremiumBusChild$PremiumBusPassLanding;", "Lapp/chalo/core/navigation/premiumbus/PremiumBusParentComponent$PremiumBusChild;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class PremiumBusPassLanding extends PremiumBusChild {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final PbPassPurchaseLandingScreenComponent f2174a;

            public PremiumBusPassLanding(PbPassPurchaseLandingScreenComponent pbPassPurchaseLandingScreenComponent) {
                this.f2174a = pbPassPurchaseLandingScreenComponent;
            }

            @Override // app.chalo.navigation.child.ChildComponent
            public final ComponentContext a() {
                return this.f2174a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof PremiumBusPassLanding) && Intrinsics.d(this.f2174a, ((PremiumBusPassLanding) obj).f2174a);
            }

            public final int hashCode() {
                return this.f2174a.hashCode();
            }

            public final String toString() {
                return "PremiumBusPassLanding(component=" + this.f2174a + ")";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/core/navigation/premiumbus/PremiumBusParentComponent$PremiumBusChild$PremiumBusProductSelection;", "Lapp/chalo/core/navigation/premiumbus/PremiumBusParentComponent$PremiumBusChild;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class PremiumBusProductSelection extends PremiumBusChild {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final PremiumBusProductSelectionComponent f2175a;

            public PremiumBusProductSelection(PremiumBusProductSelectionComponent premiumBusProductSelectionComponent) {
                this.f2175a = premiumBusProductSelectionComponent;
            }

            @Override // app.chalo.navigation.child.ChildComponent
            public final ComponentContext a() {
                return this.f2175a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof PremiumBusProductSelection) && Intrinsics.d(this.f2175a, ((PremiumBusProductSelection) obj).f2175a);
            }

            public final int hashCode() {
                return this.f2175a.hashCode();
            }

            public final String toString() {
                return "PremiumBusProductSelection(component=" + this.f2175a + ")";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/core/navigation/premiumbus/PremiumBusParentComponent$PremiumBusChild$PremiumBusSeatSelection;", "Lapp/chalo/core/navigation/premiumbus/PremiumBusParentComponent$PremiumBusChild;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class PremiumBusSeatSelection extends PremiumBusChild {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final PremiumBusSeatSelectionComponent f2176a;

            public PremiumBusSeatSelection(PremiumBusSeatSelectionComponent premiumBusSeatSelectionComponent) {
                this.f2176a = premiumBusSeatSelectionComponent;
            }

            @Override // app.chalo.navigation.child.ChildComponent
            public final ComponentContext a() {
                return this.f2176a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof PremiumBusSeatSelection) && Intrinsics.d(this.f2176a, ((PremiumBusSeatSelection) obj).f2176a);
            }

            public final int hashCode() {
                return this.f2176a.hashCode();
            }

            public final String toString() {
                return "PremiumBusSeatSelection(component=" + this.f2176a + ")";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/core/navigation/premiumbus/PremiumBusParentComponent$PremiumBusChild$PremiumBusSlotSelection;", "Lapp/chalo/core/navigation/premiumbus/PremiumBusParentComponent$PremiumBusChild;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class PremiumBusSlotSelection extends PremiumBusChild {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final PremiumBusSlotSelectionComponent f2177a;

            public PremiumBusSlotSelection(PremiumBusSlotSelectionComponent premiumBusSlotSelectionComponent) {
                this.f2177a = premiumBusSlotSelectionComponent;
            }

            @Override // app.chalo.navigation.child.ChildComponent
            public final ComponentContext a() {
                return this.f2177a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof PremiumBusSlotSelection) && Intrinsics.d(this.f2177a, ((PremiumBusSlotSelection) obj).f2177a);
            }

            public final int hashCode() {
                return this.f2177a.hashCode();
            }

            public final String toString() {
                return "PremiumBusSlotSelection(component=" + this.f2177a + ")";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/core/navigation/premiumbus/PremiumBusParentComponent$PremiumBusChild$PremiumBusStopSelection;", "Lapp/chalo/core/navigation/premiumbus/PremiumBusParentComponent$PremiumBusChild;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class PremiumBusStopSelection extends PremiumBusChild {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final PremiumBusStopSelectionComponent f2178a;

            public PremiumBusStopSelection(PremiumBusStopSelectionComponent premiumBusStopSelectionComponent) {
                this.f2178a = premiumBusStopSelectionComponent;
            }

            @Override // app.chalo.navigation.child.ChildComponent
            public final ComponentContext a() {
                return this.f2178a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof PremiumBusStopSelection) && Intrinsics.d(this.f2178a, ((PremiumBusStopSelection) obj).f2178a);
            }

            public final int hashCode() {
                return this.f2178a.hashCode();
            }

            public final String toString() {
                return "PremiumBusStopSelection(component=" + this.f2178a + ")";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/core/navigation/premiumbus/PremiumBusParentComponent$PremiumBusChild$SlotSelectionListScreen;", "Lapp/chalo/core/navigation/premiumbus/PremiumBusParentComponent$PremiumBusChild;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class SlotSelectionListScreen extends PremiumBusChild {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final SlotSelectionListComponent f2179a;

            public SlotSelectionListScreen(SlotSelectionListComponent slotSelectionListComponent) {
                this.f2179a = slotSelectionListComponent;
            }

            @Override // app.chalo.navigation.child.ChildComponent
            public final ComponentContext a() {
                return this.f2179a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof SlotSelectionListScreen) && Intrinsics.d(this.f2179a, ((SlotSelectionListScreen) obj).f2179a);
            }

            public final int hashCode() {
                return this.f2179a.hashCode();
            }

            public final String toString() {
                return "SlotSelectionListScreen(component=" + this.f2179a + ")";
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PremiumBusParentComponent(PremiumBusArgs args, ComponentContext componentContext) {
        super(args, componentContext);
        Intrinsics.i(args, "args");
        Intrinsics.i(componentContext, "componentContext");
        this.d = args;
        this.e = componentContext;
        final kn0 kn0Var = new kn0(this, 21);
        this.f = LazyKt.a(LazyThreadSafetyMode.SYNCHRONIZED, new Function0<PremiumBusSharedManagerViewModel>() { // from class: app.chalo.core.navigation.premiumbus.PremiumBusParentComponent$special$$inlined$inject$default$1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                BackHandlerOwner backHandlerOwner = this.f2180a;
                boolean z = backHandlerOwner instanceof KoinScopeComponent;
                return (z ? ((KoinScopeComponent) backHandlerOwner).getF18811a() : GlobalContext.f18817a.a().c.d).a(Reflection.a(PremiumBusSharedManagerViewModel.class), null, kn0Var);
            }
        });
    }

    @Override // org.koin.core.component.KoinComponent
    public final Koin L() {
        return GlobalContext.f18817a.a();
    }

    @Override // app.chalo.navigation.parent.DefaultParentComponent, app.chalo.navigation.parent.ParentComponent
    public final boolean Y(SceneArgs args) {
        Intrinsics.i(args, "args");
        return args instanceof PremiumBusArgs;
    }

    @Override // app.chalo.navigation.parent.DefaultParentComponent
    public final KSerializer a() {
        return PremiumBusArgs.INSTANCE.serializer();
    }

    @Override // app.chalo.navigation.parent.DefaultParentComponent
    public final ChildComponent m(SceneArgs sceneArgs, ComponentContext componentContext) {
        PremiumBusArgs args = (PremiumBusArgs) sceneArgs;
        Intrinsics.i(args, "args");
        Intrinsics.i(componentContext, "componentContext");
        boolean z = args instanceof PremiumBusArgs.PremiumBusPassLandingScreenArgs;
        AppComponentFactory appComponentFactory = AppComponentFactory.f2029a;
        if (z) {
            return new PremiumBusChild.PremiumBusPassLanding((PbPassPurchaseLandingScreenComponent) appComponentFactory.a(args, componentContext, Arrays.copyOf(new Object[]{n(), n()}, 2)));
        }
        if (args instanceof PremiumBusArgs.PremiumBusSeatSelectionArgs) {
            return new PremiumBusChild.PremiumBusSeatSelection((PremiumBusSeatSelectionComponent) appComponentFactory.a(args, componentContext, Arrays.copyOf(new Object[]{n(), n()}, 2)));
        }
        if (args instanceof PremiumBusArgs.PremiumProductSelectionArgs) {
            return new PremiumBusChild.PremiumBusProductSelection((PremiumBusProductSelectionComponent) appComponentFactory.a(args, componentContext, Arrays.copyOf(new Object[]{n(), n()}, 2)));
        }
        if (args instanceof PremiumBusArgs.PremiumStopDetailsArgs) {
            return new PremiumBusChild.PBStopDetails((PBStopDetailsComponent) appComponentFactory.a(args, componentContext, Arrays.copyOf(new Object[]{n(), n()}, 2)));
        }
        if (args instanceof PremiumBusArgs.SlotSelectionArgs) {
            return new PremiumBusChild.PremiumBusSlotSelection((PremiumBusSlotSelectionComponent) appComponentFactory.a(args, componentContext, Arrays.copyOf(new Object[]{n(), n()}, 2)));
        }
        if (args instanceof PremiumBusArgs.StopSelectionArgs) {
            return new PremiumBusChild.PremiumBusStopSelection((PremiumBusStopSelectionComponent) appComponentFactory.a(args, componentContext, Arrays.copyOf(new Object[]{n(), n()}, 2)));
        }
        if (args instanceof PremiumBusArgs.PremiumBusBulkBookingConfirmationScreenArgs) {
            return new PremiumBusChild.PremiumBusBulkBookingSuccessScreen((PremiumBusBulkBookingConfirmationComponent) appComponentFactory.a(args, componentContext, Arrays.copyOf(new Object[]{n(), n()}, 2)));
        }
        if (args instanceof PremiumBusArgs.PremiumBusSlotListScreenArgs) {
            return new PremiumBusChild.SlotSelectionListScreen((SlotSelectionListComponent) appComponentFactory.a(args, componentContext, Arrays.copyOf(new Object[]{n(), n()}, 2)));
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final PremiumBusSharedManagerViewModel n() {
        return (PremiumBusSharedManagerViewModel) this.f.getValue();
    }
}
