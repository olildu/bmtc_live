package app.chalo.instantticket.ui.faredetails;

import app.chalo.instantticket.ui.instantticketscreen.InstantTicketWalletAccessComponent;
import app.chalo.mvibase.simple.ChaloBaseStateMviComponent;
import app.chalo.scenes.args.FareDetailsArgs;
import com.arkivanov.decompose.ComponentContext;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.ClassReference;
import kotlin.jvm.internal.Reflection;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.context.GlobalContext;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.parameter.ParametersHolderKt;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/instantticket/ui/faredetails/FareDetailsCoordinatorComponent;", "Lapp/chalo/mvibase/simple/ChaloBaseStateMviComponent;", "", "Lorg/koin/core/component/KoinComponent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FareDetailsCoordinatorComponent extends ChaloBaseStateMviComponent<Unit, Unit, Unit, Unit> implements KoinComponent {
    public final FareDetailsArgs k;
    public final FareDetailsComponent l;
    public final InstantTicketWalletAccessComponent m;

    /* JADX WARN: Multi-variable type inference failed */
    public FareDetailsCoordinatorComponent(FareDetailsArgs fareDetailsArgs, ComponentContext componentContext) {
        Scope f18836a;
        ClassReference classReferenceA;
        ParametersHolder parametersHolderA;
        Scope f18836a2;
        ClassReference classReferenceA2;
        ParametersHolder parametersHolderA2;
        super(componentContext);
        this.k = fareDetailsArgs;
        boolean z = this instanceof KoinScopeComponent;
        GlobalContext globalContext = GlobalContext.f18817a;
        if (z) {
            f18836a = ((KoinScopeComponent) this).getF18811a();
            classReferenceA = Reflection.a(FareDetailsComponent.class);
            f18836a.getClass();
            parametersHolderA = ParametersHolderKt.a(this.k, componentContext);
        } else {
            f18836a = globalContext.a().c.d;
            classReferenceA = Reflection.a(FareDetailsComponent.class);
            f18836a.getClass();
            parametersHolderA = ParametersHolderKt.a(this.k, componentContext);
        }
        this.l = (FareDetailsComponent) f18836a.d(classReferenceA, parametersHolderA, null);
        if (z) {
            f18836a2 = ((KoinScopeComponent) this).getF18811a();
            classReferenceA2 = Reflection.a(InstantTicketWalletAccessComponent.class);
            f18836a2.getClass();
            parametersHolderA2 = ParametersHolderKt.a(this.k, componentContext);
        } else {
            f18836a2 = globalContext.a().c.d;
            classReferenceA2 = Reflection.a(InstantTicketWalletAccessComponent.class);
            f18836a2.getClass();
            parametersHolderA2 = ParametersHolderKt.a(this.k, componentContext);
        }
        this.m = (InstantTicketWalletAccessComponent) f18836a2.d(classReferenceA2, parametersHolderA2, null);
    }

    @Override // org.koin.core.component.KoinComponent
    public final Koin L() {
        return GlobalContext.f18817a.a();
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final Object p0(Object obj, ContinuationImpl continuationImpl) {
        return (Unit) obj;
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final /* bridge */ /* synthetic */ Object u0() {
        return Unit.f17538a;
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final /* bridge */ /* synthetic */ Object v0() {
        return Unit.f17538a;
    }
}
