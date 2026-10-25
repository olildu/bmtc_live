package app.chalo.metro.ui.landing;

import app.chalo.domain.GetProductCapabilitiesUseCase;
import app.chalo.models.productbooking.productcapability.BookingFlowType;
import app.chalo.models.productbooking.productcapability.ProductCapabilityAppModel;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.JobKt;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.context.GlobalContext;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/metro/ui/landing/MetroLandingScreenHelperFactory;", "Lorg/koin/core/component/KoinComponent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MetroLandingScreenHelperFactory implements KoinComponent {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GetProductCapabilitiesUseCase f5489a;

    public MetroLandingScreenHelperFactory(GetProductCapabilitiesUseCase getProductCapabilitiesUseCase) {
        this.f5489a = getProductCapabilitiesUseCase;
    }

    @Override // org.koin.core.component.KoinComponent
    public final Koin L() {
        return GlobalContext.f18817a.a();
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0064  */
    /* JADX WARN: Code duplicated, block: B:31:0x006a  */
    /* JADX WARN: Code duplicated, block: B:33:0x007a  */
    /* JADX WARN: Code duplicated, block: B:36:0x0086 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:37:0x0088  */
    /* JADX WARN: Code duplicated, block: B:39:0x008e  */
    /* JADX WARN: Code duplicated, block: B:41:0x009e  */
    /* JADX WARN: Code duplicated, block: B:44:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object a(Boolean bool, ContinuationImpl continuationImpl) {
        MetroLandingScreenHelperFactory$create$1 metroLandingScreenHelperFactory$create$1;
        boolean zBooleanValue;
        GlobalContext globalContext;
        Scope scopeI0;
        Scope scopeI1;
        if (continuationImpl instanceof MetroLandingScreenHelperFactory$create$1) {
            metroLandingScreenHelperFactory$create$1 = (MetroLandingScreenHelperFactory$create$1) continuationImpl;
            int i = metroLandingScreenHelperFactory$create$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                metroLandingScreenHelperFactory$create$1.label = i - Integer.MIN_VALUE;
            } else {
                metroLandingScreenHelperFactory$create$1 = new MetroLandingScreenHelperFactory$create$1(this, continuationImpl);
            }
        } else {
            metroLandingScreenHelperFactory$create$1 = new MetroLandingScreenHelperFactory$create$1(this, continuationImpl);
        }
        Object objA = metroLandingScreenHelperFactory$create$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = metroLandingScreenHelperFactory$create$1.label;
        if (i2 == 0) {
            ResultKt.b(objA);
            if (bool == null) {
                metroLandingScreenHelperFactory$create$1.label = 1;
                objA = this.f5489a.a("mobileTicket", "ondcMetroTicket", "", metroLandingScreenHelperFactory$create$1);
                if (objA == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                zBooleanValue = bool.booleanValue();
            }
            globalContext = GlobalContext.f18817a;
            if (zBooleanValue) {
                if (this instanceof KoinScopeComponent) {
                    scopeI1 = ((KoinScopeComponent) this).i0();
                } else {
                    scopeI1 = globalContext.a().c.d;
                }
                return (MetroLandingScreenHelper) scopeI1.d(Reflection.a(RouteBasedMetroLandingScreenHelper.class), null, null);
            }
            if (!zBooleanValue) {
                throw new NoWhenBranchMatchedException();
            }
            if (this instanceof KoinScopeComponent) {
                scopeI0 = ((KoinScopeComponent) this).i0();
            } else {
                scopeI0 = globalContext.a().c.d;
            }
            return (MetroLandingScreenHelper) scopeI0.d(Reflection.a(StopBasedMetroLandingScreenHelper.class), null, null);
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(objA);
        JobKt.e(metroLandingScreenHelperFactory$create$1.getC());
        BookingFlowType bookingFlowType = ((ProductCapabilityAppModel) objA).c;
        zBooleanValue = bookingFlowType == null || bookingFlowType == BookingFlowType.ROUTE_BASED;
        globalContext = GlobalContext.f18817a;
        if (zBooleanValue) {
            if (this instanceof KoinScopeComponent) {
                scopeI1 = ((KoinScopeComponent) this).i0();
            } else {
                scopeI1 = globalContext.a().c.d;
            }
            return (MetroLandingScreenHelper) scopeI1.d(Reflection.a(RouteBasedMetroLandingScreenHelper.class), null, null);
        }
        if (!zBooleanValue) {
            throw new NoWhenBranchMatchedException();
        }
        if (this instanceof KoinScopeComponent) {
            scopeI0 = ((KoinScopeComponent) this).i0();
        } else {
            scopeI0 = globalContext.a().c.d;
        }
        return (MetroLandingScreenHelper) scopeI0.d(Reflection.a(StopBasedMetroLandingScreenHelper.class), null, null);
    }
}
