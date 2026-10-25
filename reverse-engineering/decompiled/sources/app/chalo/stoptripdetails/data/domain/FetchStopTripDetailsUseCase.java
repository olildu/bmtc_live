package app.chalo.stoptripdetails.data.domain;

import app.chalo.contract.BasicInfoContract;
import app.chalo.features.language.LanguageFeature;
import app.chalo.providers.cityprovider.CityProvider;
import app.chalo.stoptripdetails.repo.StopTripDetailsRepository;
import app.chalo.usecase.GetDistinctIdUseCase;
import app.chalo.utils.timeutil.TimeUtilsContract;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/stoptripdetails/data/domain/FetchStopTripDetailsUseCase;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FetchStopTripDetailsUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StopTripDetailsRepository f9459a;
    public final CityProvider b;
    public final GetDistinctIdUseCase c;
    public final LanguageFeature d;
    public final BasicInfoContract e;
    public final TimeUtilsContract f;

    public FetchStopTripDetailsUseCase(StopTripDetailsRepository stopTripDetailsRepository, CityProvider cityProvider, GetDistinctIdUseCase getDistinctIdUseCase, LanguageFeature languageFeature, BasicInfoContract basicInfoContract, TimeUtilsContract timeUtilsContract) {
        this.f9459a = stopTripDetailsRepository;
        this.b = cityProvider;
        this.c = getDistinctIdUseCase;
        this.d = languageFeature;
        this.e = basicInfoContract;
        this.f = timeUtilsContract;
    }

    /* JADX WARN: Code duplicated, block: B:56:0x0197 A[Catch: Exception -> 0x01a3, TryCatch #1 {Exception -> 0x01a3, blocks: (B:12:0x002f, B:47:0x0164, B:48:0x017c, B:50:0x0182, B:56:0x0197, B:58:0x019d, B:53:0x0190, B:44:0x014d), top: B:64:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x019d A[Catch: Exception -> 0x01a3, TRY_LEAVE, TryCatch #1 {Exception -> 0x01a3, blocks: (B:12:0x002f, B:47:0x0164, B:48:0x017c, B:50:0x0182, B:56:0x0197, B:58:0x019d, B:53:0x0190, B:44:0x014d), top: B:64:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0161, code lost:
    
        if (r1 == r3) goto L46;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r18, java.lang.String r19, kotlin.coroutines.jvm.internal.ContinuationImpl r20) {
        /*
            Method dump skipped, instruction units count: 425
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.stoptripdetails.data.domain.FetchStopTripDetailsUseCase.a(java.lang.String, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
