package app.chalo.multimodalticket.validation;

import app.chalo.analytics.contract.AnalyticsContract;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/multimodalticket/validation/MultiModalGroupTicketValidationAnalyticsManagerFactoryImpl;", "Lapp/chalo/multimodalticket/validation/MultiModalGroupTicketValidationAnalyticsManagerFactory;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MultiModalGroupTicketValidationAnalyticsManagerFactoryImpl implements MultiModalGroupTicketValidationAnalyticsManagerFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AnalyticsContract f5974a;

    public MultiModalGroupTicketValidationAnalyticsManagerFactoryImpl(AnalyticsContract analyticsContract) {
        this.f5974a = analyticsContract;
    }

    @Override // app.chalo.multimodalticket.validation.MultiModalGroupTicketValidationAnalyticsManagerFactory
    public final MultiModalGroupTicketValidationAnalyticsManager a(MultiModalGroupTicketValidationData multiModalGroupTicketValidationData, MultiModalChildResolver childResolver) {
        Intrinsics.i(childResolver, "childResolver");
        return new MultiModalGroupTicketValidationAnalyticsManager(this.f5974a, multiModalGroupTicketValidationData, childResolver);
    }
}
