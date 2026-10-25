package app.chalo.core.navigation.superpass;

import app.chalo.core.component.AppComponentFactory;
import app.chalo.navigation.child.ChildComponent;
import app.chalo.navigation.parent.DefaultParentComponent;
import app.chalo.productpurchase.passpurchase.ui.SuperPassPurchaseSharedViewModel;
import app.chalo.productpurchase.passpurchase.ui.confirmation.ConfirmSuperPassPurchaseViewModel;
import app.chalo.productpurchase.passpurchase.ui.enteruserdetails.SuperPassEnterUserDetailsViewModel;
import app.chalo.productpurchase.passpurchase.ui.passengerselection.SuperPassPassengerSelectionViewModel;
import app.chalo.productpurchase.passpurchase.ui.proofoverview.SuperPassProofOverviewViewModel;
import app.chalo.productpurchase.passpurchase.ui.proofupload.SuperPassUserProofUploadViewModel;
import app.chalo.scenes.args.SceneArgs;
import app.chalo.scenes.args.SuperPassPurchaseArgs;
import com.arkivanov.decompose.ComponentContext;
import com.arkivanov.essenty.backhandler.BackHandlerOwner;
import defpackage.g61;
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
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/core/navigation/superpass/SuperPassParentComponent;", "Lapp/chalo/navigation/parent/DefaultParentComponent;", "Lapp/chalo/scenes/args/SuperPassPurchaseArgs;", "Lapp/chalo/core/navigation/superpass/SuperPassParentComponent$Child;", "Lorg/koin/core/component/KoinComponent;", "Child", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SuperPassParentComponent extends DefaultParentComponent<SuperPassPurchaseArgs, Child> implements KoinComponent {
    public final SuperPassPurchaseArgs d;
    public final ComponentContext e;
    public final Object f;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lapp/chalo/core/navigation/superpass/SuperPassParentComponent$Child;", "Lapp/chalo/navigation/child/ChildComponent;", "ConfirmPurchase", "UserDetails", "UserProofOverview", "PassengerSelection", "ProofUpload", "Lapp/chalo/core/navigation/superpass/SuperPassParentComponent$Child$ConfirmPurchase;", "Lapp/chalo/core/navigation/superpass/SuperPassParentComponent$Child$PassengerSelection;", "Lapp/chalo/core/navigation/superpass/SuperPassParentComponent$Child$ProofUpload;", "Lapp/chalo/core/navigation/superpass/SuperPassParentComponent$Child$UserDetails;", "Lapp/chalo/core/navigation/superpass/SuperPassParentComponent$Child$UserProofOverview;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class Child implements ChildComponent {

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/core/navigation/superpass/SuperPassParentComponent$Child$ConfirmPurchase;", "Lapp/chalo/core/navigation/superpass/SuperPassParentComponent$Child;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class ConfirmPurchase extends Child {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final ConfirmSuperPassPurchaseViewModel f2283a;

            public ConfirmPurchase(ConfirmSuperPassPurchaseViewModel confirmSuperPassPurchaseViewModel) {
                this.f2283a = confirmSuperPassPurchaseViewModel;
            }

            @Override // app.chalo.navigation.child.ChildComponent
            public final ComponentContext a() {
                return this.f2283a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ConfirmPurchase) && Intrinsics.d(this.f2283a, ((ConfirmPurchase) obj).f2283a);
            }

            public final int hashCode() {
                return this.f2283a.hashCode();
            }

            public final String toString() {
                return "ConfirmPurchase(component=" + this.f2283a + ")";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/core/navigation/superpass/SuperPassParentComponent$Child$PassengerSelection;", "Lapp/chalo/core/navigation/superpass/SuperPassParentComponent$Child;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class PassengerSelection extends Child {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final SuperPassPassengerSelectionViewModel f2284a;

            public PassengerSelection(SuperPassPassengerSelectionViewModel superPassPassengerSelectionViewModel) {
                this.f2284a = superPassPassengerSelectionViewModel;
            }

            @Override // app.chalo.navigation.child.ChildComponent
            public final ComponentContext a() {
                return this.f2284a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof PassengerSelection) && Intrinsics.d(this.f2284a, ((PassengerSelection) obj).f2284a);
            }

            public final int hashCode() {
                return this.f2284a.hashCode();
            }

            public final String toString() {
                return "PassengerSelection(component=" + this.f2284a + ")";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/core/navigation/superpass/SuperPassParentComponent$Child$ProofUpload;", "Lapp/chalo/core/navigation/superpass/SuperPassParentComponent$Child;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class ProofUpload extends Child {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final SuperPassUserProofUploadViewModel f2285a;

            public ProofUpload(SuperPassUserProofUploadViewModel superPassUserProofUploadViewModel) {
                this.f2285a = superPassUserProofUploadViewModel;
            }

            @Override // app.chalo.navigation.child.ChildComponent
            public final ComponentContext a() {
                return this.f2285a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ProofUpload) && Intrinsics.d(this.f2285a, ((ProofUpload) obj).f2285a);
            }

            public final int hashCode() {
                return this.f2285a.hashCode();
            }

            public final String toString() {
                return "ProofUpload(component=" + this.f2285a + ")";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/core/navigation/superpass/SuperPassParentComponent$Child$UserDetails;", "Lapp/chalo/core/navigation/superpass/SuperPassParentComponent$Child;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class UserDetails extends Child {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final SuperPassEnterUserDetailsViewModel f2286a;

            public UserDetails(SuperPassEnterUserDetailsViewModel superPassEnterUserDetailsViewModel) {
                this.f2286a = superPassEnterUserDetailsViewModel;
            }

            @Override // app.chalo.navigation.child.ChildComponent
            public final ComponentContext a() {
                return this.f2286a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof UserDetails) && Intrinsics.d(this.f2286a, ((UserDetails) obj).f2286a);
            }

            public final int hashCode() {
                return this.f2286a.hashCode();
            }

            public final String toString() {
                return "UserDetails(component=" + this.f2286a + ")";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/core/navigation/superpass/SuperPassParentComponent$Child$UserProofOverview;", "Lapp/chalo/core/navigation/superpass/SuperPassParentComponent$Child;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class UserProofOverview extends Child {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final SuperPassProofOverviewViewModel f2287a;

            public UserProofOverview(SuperPassProofOverviewViewModel superPassProofOverviewViewModel) {
                this.f2287a = superPassProofOverviewViewModel;
            }

            @Override // app.chalo.navigation.child.ChildComponent
            public final ComponentContext a() {
                return this.f2287a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof UserProofOverview) && Intrinsics.d(this.f2287a, ((UserProofOverview) obj).f2287a);
            }

            public final int hashCode() {
                return this.f2287a.hashCode();
            }

            public final String toString() {
                return "UserProofOverview(component=" + this.f2287a + ")";
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuperPassParentComponent(SuperPassPurchaseArgs args, ComponentContext componentContext) {
        super(args, componentContext);
        Intrinsics.i(args, "args");
        Intrinsics.i(componentContext, "componentContext");
        this.d = args;
        this.e = componentContext;
        final g61 g61Var = new g61(this, 20);
        this.f = LazyKt.a(LazyThreadSafetyMode.SYNCHRONIZED, new Function0<SuperPassPurchaseSharedViewModel>() { // from class: app.chalo.core.navigation.superpass.SuperPassParentComponent$special$$inlined$inject$default$1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                BackHandlerOwner backHandlerOwner = this.f2288a;
                boolean z = backHandlerOwner instanceof KoinScopeComponent;
                return (z ? ((KoinScopeComponent) backHandlerOwner).getF18811a() : GlobalContext.f18817a.a().c.d).a(Reflection.a(SuperPassPurchaseSharedViewModel.class), null, g61Var);
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
        return args instanceof SuperPassPurchaseArgs;
    }

    @Override // app.chalo.navigation.parent.DefaultParentComponent
    public final KSerializer a() {
        return SuperPassPurchaseArgs.INSTANCE.serializer();
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // app.chalo.navigation.parent.DefaultParentComponent
    public final ChildComponent m(SceneArgs sceneArgs, ComponentContext componentContext) {
        SuperPassPurchaseArgs args = (SuperPassPurchaseArgs) sceneArgs;
        Intrinsics.i(args, "args");
        Intrinsics.i(componentContext, "componentContext");
        boolean z = args instanceof SuperPassPurchaseArgs.ConfirmSuperPassPurchaseArgs;
        ?? r2 = this.f;
        AppComponentFactory appComponentFactory = AppComponentFactory.f2029a;
        if (z) {
            return new Child.ConfirmPurchase((ConfirmSuperPassPurchaseViewModel) appComponentFactory.a(args, componentContext, Arrays.copyOf(new Object[]{(SuperPassPurchaseSharedViewModel) r2.getValue()}, 1)));
        }
        if (args instanceof SuperPassPurchaseArgs.EnterUserDetailsArgs) {
            return new Child.UserDetails((SuperPassEnterUserDetailsViewModel) appComponentFactory.a(args, componentContext, Arrays.copyOf(new Object[]{(SuperPassPurchaseSharedViewModel) r2.getValue()}, 1)));
        }
        if (args instanceof SuperPassPurchaseArgs.UserProofsOverviewArgs) {
            return new Child.UserProofOverview((SuperPassProofOverviewViewModel) appComponentFactory.a(args, componentContext, Arrays.copyOf(new Object[]{(SuperPassPurchaseSharedViewModel) r2.getValue()}, 1)));
        }
        if (args instanceof SuperPassPurchaseArgs.PassengerSelectionArgs) {
            return new Child.PassengerSelection((SuperPassPassengerSelectionViewModel) appComponentFactory.a(args, componentContext, Arrays.copyOf(new Object[]{(SuperPassPurchaseSharedViewModel) r2.getValue()}, 1)));
        }
        if (args instanceof SuperPassPurchaseArgs.ProofUploadInternalArgs) {
            return new Child.ProofUpload((SuperPassUserProofUploadViewModel) appComponentFactory.a(args, componentContext, Arrays.copyOf(new Object[]{(SuperPassPurchaseSharedViewModel) r2.getValue()}, 1)));
        }
        throw new NoWhenBranchMatchedException();
    }
}
