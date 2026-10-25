package app.chalo.instantticket.domain;

import app.chalo.instantticket.data.InstantTicketRepository;
import app.chalo.premiumbus.helper.InstantTicketConfigHelper;
import app.chalo.providers.cityprovider.CityProvider;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/instantticket/domain/CreateInstantTicketOrderUseCase;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CreateInstantTicketOrderUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InstantTicketRepository f3898a;
    public final InstantTicketConfigHelper b;
    public final CityProvider c;

    public CreateInstantTicketOrderUseCase(InstantTicketRepository instantTicketRepository, InstantTicketConfigHelper instantTicketConfigHelper, CityProvider cityProvider) {
        this.f3898a = instantTicketRepository;
        this.b = instantTicketConfigHelper;
        this.c = cityProvider;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0091, code lost:
    
        if (r0 == r2) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(long r15, java.util.ArrayList r17, app.chalo.instantticket.data.model.app.InstantTicketTripDetails r18, kotlin.coroutines.jvm.internal.ContinuationImpl r19) {
        /*
            Method dump skipped, instruction units count: 257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.instantticket.domain.CreateInstantTicketOrderUseCase.a(long, java.util.ArrayList, app.chalo.instantticket.data.model.app.InstantTicketTripDetails, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
