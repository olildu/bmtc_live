package app.chalo.premiumbus.ui.faredetails;

import defpackage.g41;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/faredetails/DefaultPremiumBusFareDetailsDelegateResolver;", "Lapp/chalo/premiumbus/ui/faredetails/PremiumBusFareDetailsDelegateResolver;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DefaultPremiumBusFareDetailsDelegateResolver implements PremiumBusFareDetailsDelegateResolver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g41 f7543a;

    public DefaultPremiumBusFareDetailsDelegateResolver(g41 g41Var) {
        this.f7543a = g41Var;
    }

    @Override // app.chalo.premiumbus.ui.faredetails.PremiumBusFareDetailsDelegateResolver
    public final PremiumBusFareDetailsDelegate a(PremiumBusFareDetailsFlowType flowType) {
        Intrinsics.i(flowType, "flowType");
        return (PremiumBusFareDetailsDelegate) this.f7543a.invoke(flowType);
    }
}
