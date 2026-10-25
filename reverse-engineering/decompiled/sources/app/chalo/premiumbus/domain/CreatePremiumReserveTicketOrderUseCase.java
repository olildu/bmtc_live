package app.chalo.premiumbus.domain;

import app.chalo.features.onetimeoffer.IUserPreferencesDataStore;
import app.chalo.premiumbus.data.repository.PremiumBusRepository;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/domain/CreatePremiumReserveTicketOrderUseCase;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CreatePremiumReserveTicketOrderUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PremiumBusRepository f7183a;
    public final IUserPreferencesDataStore b;

    public CreatePremiumReserveTicketOrderUseCase(PremiumBusRepository premiumBusRepository, IUserPreferencesDataStore iUserPreferencesDataStore) {
        this.f7183a = premiumBusRepository;
        this.b = iUserPreferencesDataStore;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00f2 A[Catch: Exception -> 0x0035, ChaloLocalException -> 0x0038, PBTicketOrderCreationFailedException -> 0x003b, NetworkSuccessResponseParseException -> 0x0192, TryCatch #0 {PBTicketOrderCreationFailedException -> 0x003b, blocks: (B:13:0x002f, B:24:0x0065, B:38:0x00ec, B:40:0x00f2, B:41:0x0101, B:43:0x0107, B:45:0x0116, B:46:0x0127, B:48:0x012d, B:50:0x013d, B:56:0x014b, B:61:0x0157, B:27:0x008b, B:34:0x00c3, B:30:0x0094), top: B:107:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x0107 A[Catch: Exception -> 0x0035, ChaloLocalException -> 0x0038, PBTicketOrderCreationFailedException -> 0x003b, NetworkSuccessResponseParseException -> 0x0192, LOOP:0: B:41:0x0101->B:43:0x0107, LOOP_END, TryCatch #0 {PBTicketOrderCreationFailedException -> 0x003b, blocks: (B:13:0x002f, B:24:0x0065, B:38:0x00ec, B:40:0x00f2, B:41:0x0101, B:43:0x0107, B:45:0x0116, B:46:0x0127, B:48:0x012d, B:50:0x013d, B:56:0x014b, B:61:0x0157, B:27:0x008b, B:34:0x00c3, B:30:0x0094), top: B:107:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x0115  */
    /* JADX WARN: Code duplicated, block: B:48:0x012d A[Catch: Exception -> 0x0035, ChaloLocalException -> 0x0038, PBTicketOrderCreationFailedException -> 0x003b, NetworkSuccessResponseParseException -> 0x0192, LOOP:1: B:46:0x0127->B:48:0x012d, LOOP_END, TryCatch #0 {PBTicketOrderCreationFailedException -> 0x003b, blocks: (B:13:0x002f, B:24:0x0065, B:38:0x00ec, B:40:0x00f2, B:41:0x0101, B:43:0x0107, B:45:0x0116, B:46:0x0127, B:48:0x012d, B:50:0x013d, B:56:0x014b, B:61:0x0157, B:27:0x008b, B:34:0x00c3, B:30:0x0094), top: B:107:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x0147  */
    /* JADX WARN: Code duplicated, block: B:60:0x0155  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0175, code lost:
    
        if (r0 == r3) goto L65;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r21, java.lang.String r22, long r23, app.chalo.premiumbus.data.models.api.request.PBTicketSelectedTripDetailsApiRequestModel r25, java.util.List r26, java.util.List r27, java.util.List r28, kotlin.coroutines.jvm.internal.ContinuationImpl r29) {
        /*
            Method dump skipped, instruction units count: 617
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.premiumbus.domain.CreatePremiumReserveTicketOrderUseCase.a(java.lang.String, java.lang.String, long, app.chalo.premiumbus.data.models.api.request.PBTicketSelectedTripDetailsApiRequestModel, java.util.List, java.util.List, java.util.List, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
