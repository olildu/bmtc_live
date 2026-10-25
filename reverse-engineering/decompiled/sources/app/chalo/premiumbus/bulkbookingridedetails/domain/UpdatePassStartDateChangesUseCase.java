package app.chalo.premiumbus.bulkbookingridedetails.domain;

import app.chalo.premiumbus.bulkbookingridedetails.data.remote.PbBulkBookingRideDetailsRepository;
import app.chalo.providers.cityprovider.CityProvider;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.superpass.domain.InsertOrUpdatePassInPassTableUseCase;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/bulkbookingridedetails/domain/UpdatePassStartDateChangesUseCase;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class UpdatePassStartDateChangesUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InsertOrUpdatePassInPassTableUseCase f6897a;
    public final PbBulkBookingRideDetailsRepository b;
    public final StringProvider c;
    public final CityProvider d;

    public UpdatePassStartDateChangesUseCase(InsertOrUpdatePassInPassTableUseCase insertOrUpdatePassInPassTableUseCase, PbBulkBookingRideDetailsRepository pbBulkBookingRideDetailsRepository, StringProvider stringProvider, CityProvider cityProvider) {
        this.f6897a = insertOrUpdatePassInPassTableUseCase;
        this.b = pbBulkBookingRideDetailsRepository;
        this.c = stringProvider;
        this.d = cityProvider;
    }

    /* JADX WARN: Code duplicated, block: B:110:0x0241  */
    /* JADX WARN: Code duplicated, block: B:119:0x027b  */
    /* JADX WARN: Code duplicated, block: B:48:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:49:0x00f7 A[Catch: Exception -> 0x00a4, ChaloLocalException -> 0x00a8, NetworkSuccessResponseParseException -> 0x00ac, PbUpdatePassStartDateException -> 0x00af, PbUpdatePassStartDateInvalidDataException -> 0x0254, PHI: r0
      0x00f7: PHI (r0v60 java.lang.Object) = (r0v59 java.lang.Object), (r0v1 java.lang.Object) binds: [B:47:0x00f3, B:36:0x00b9] A[DONT_GENERATE, DONT_INLINE], TryCatch #2 {ChaloLocalException -> 0x00a8, NetworkSuccessResponseParseException -> 0x00ac, PbUpdatePassStartDateException -> 0x00af, PbUpdatePassStartDateInvalidDataException -> 0x0254, Exception -> 0x00a4, blocks: (B:24:0x009f, B:60:0x0129, B:35:0x00b5, B:57:0x0113, B:36:0x00b9, B:49:0x00f7, B:51:0x00fb, B:53:0x0101, B:37:0x00bd, B:46:0x00e6, B:40:0x00c4, B:43:0x00d0), top: B:122:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:51:0x00fb A[Catch: Exception -> 0x00a4, ChaloLocalException -> 0x00a8, NetworkSuccessResponseParseException -> 0x00ac, PbUpdatePassStartDateException -> 0x00af, PbUpdatePassStartDateInvalidDataException -> 0x0254, TryCatch #2 {ChaloLocalException -> 0x00a8, NetworkSuccessResponseParseException -> 0x00ac, PbUpdatePassStartDateException -> 0x00af, PbUpdatePassStartDateInvalidDataException -> 0x0254, Exception -> 0x00a4, blocks: (B:24:0x009f, B:60:0x0129, B:35:0x00b5, B:57:0x0113, B:36:0x00b9, B:49:0x00f7, B:51:0x00fb, B:53:0x0101, B:37:0x00bd, B:46:0x00e6, B:40:0x00c4, B:43:0x00d0), top: B:122:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:53:0x0101 A[Catch: Exception -> 0x00a4, ChaloLocalException -> 0x00a8, NetworkSuccessResponseParseException -> 0x00ac, PbUpdatePassStartDateException -> 0x00af, PbUpdatePassStartDateInvalidDataException -> 0x0254, TryCatch #2 {ChaloLocalException -> 0x00a8, NetworkSuccessResponseParseException -> 0x00ac, PbUpdatePassStartDateException -> 0x00af, PbUpdatePassStartDateInvalidDataException -> 0x0254, Exception -> 0x00a4, blocks: (B:24:0x009f, B:60:0x0129, B:35:0x00b5, B:57:0x0113, B:36:0x00b9, B:49:0x00f7, B:51:0x00fb, B:53:0x0101, B:37:0x00bd, B:46:0x00e6, B:40:0x00c4, B:43:0x00d0), top: B:122:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:55:0x0110  */
    /* JADX WARN: Code duplicated, block: B:56:0x0112  */
    /* JADX WARN: Code duplicated, block: B:59:0x0127  */
    /* JADX WARN: Code duplicated, block: B:80:0x019c  */
    /* JADX WARN: Code duplicated, block: B:83:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01dc, code lost:
    
        if (r0 == r1) goto L118;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r15, long r16, boolean r18, kotlin.coroutines.jvm.internal.ContinuationImpl r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 684
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.premiumbus.bulkbookingridedetails.domain.UpdatePassStartDateChangesUseCase.a(java.lang.String, long, boolean, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
