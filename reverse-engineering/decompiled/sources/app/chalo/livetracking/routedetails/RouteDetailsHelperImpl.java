package app.chalo.livetracking.routedetails;

import app.chalo.features.reportproblem.IReportProblemFeature;
import app.chalo.features.reportproblem.ReportProblemMetadata;
import app.chalo.livetracking.routedetails.data.repository.RouteAvailabilityBannerRepository;
import app.chalo.providers.cityprovider.CityProvider;
import app.chalo.providers.cityprovider.CityProviderKt;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/routedetails/RouteDetailsHelperImpl;", "Lapp/chalo/livetracking/routedetails/RouteDetailsHelper;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RouteDetailsHelperImpl implements RouteDetailsHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CityProvider f4384a;
    public final IReportProblemFeature b;
    public final RouteAvailabilityBannerRepository c;

    public RouteDetailsHelperImpl(CityProvider cityProvider, IReportProblemFeature iReportProblemFeature, RouteAvailabilityBannerRepository routeAvailabilityBannerRepository) {
        this.f4384a = cityProvider;
        this.b = iReportProblemFeature;
        this.c = routeAvailabilityBannerRepository;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.livetracking.routedetails.RouteDetailsHelper
    public final Object a(ContinuationImpl continuationImpl) {
        RouteDetailsHelperImpl$getReportProblemMetaData$1 routeDetailsHelperImpl$getReportProblemMetaData$1;
        if (continuationImpl instanceof RouteDetailsHelperImpl$getReportProblemMetaData$1) {
            routeDetailsHelperImpl$getReportProblemMetaData$1 = (RouteDetailsHelperImpl$getReportProblemMetaData$1) continuationImpl;
            int i = routeDetailsHelperImpl$getReportProblemMetaData$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                routeDetailsHelperImpl$getReportProblemMetaData$1.label = i - Integer.MIN_VALUE;
            } else {
                routeDetailsHelperImpl$getReportProblemMetaData$1 = new RouteDetailsHelperImpl$getReportProblemMetaData$1(this, continuationImpl);
            }
        } else {
            routeDetailsHelperImpl$getReportProblemMetaData$1 = new RouteDetailsHelperImpl$getReportProblemMetaData$1(this, continuationImpl);
        }
        Object objD = routeDetailsHelperImpl$getReportProblemMetaData$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = routeDetailsHelperImpl$getReportProblemMetaData$1.label;
        if (i2 == 0) {
            ResultKt.b(objD);
            String strB = CityProviderKt.b(this.f4384a);
            if (strB == null) {
                return null;
            }
            routeDetailsHelperImpl$getReportProblemMetaData$1.label = 1;
            objD = this.b.d("stopEta", strB, routeDetailsHelperImpl$getReportProblemMetaData$1);
            if (objD == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objD);
        }
        ReportProblemMetadata reportProblemMetadata = (ReportProblemMetadata) objD;
        ArrayList arrayList = new ArrayList();
        if (reportProblemMetadata == null) {
            return null;
        }
        ArrayList arrayList2 = reportProblemMetadata.d;
        int size = arrayList2.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList2.get(i3);
            i3++;
            String str = (String) obj;
            String str2 = (String) reportProblemMetadata.f2764a.get(str);
            if (str2 != null) {
                arrayList.add(new ReportProblemTagDetails(str, str2));
            }
        }
        return new ReportProblemMetaData(reportProblemMetadata.b, reportProblemMetadata.c, arrayList);
    }

    @Override // app.chalo.livetracking.routedetails.RouteDetailsHelper
    public final Object b(Continuation continuation) {
        String strB = CityProviderKt.b(this.f4384a);
        return strB == null ? MapsKt.d() : this.c.c(strB, (ContinuationImpl) continuation);
    }
}
