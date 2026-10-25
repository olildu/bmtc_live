package app.chalo.citydata.domain;

import app.chalo.citydata.data.model.app.RouteAppModel;
import app.chalo.citydata.data.model.app.RouteAppModelKt;
import app.chalo.citydata.manager.CityDataManagerKotlin;
import app.chalo.providers.cityprovider.CityProvider;
import app.chalo.providers.cityprovider.impl.data.models.app.CityAppModel;
import app.chalo.utils.ChaloUseCaseResult;
import app.chalo.utils.timeutil.TimeUtilsContract;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/citydata/domain/GetCachedRouteUseCase;", "", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GetCachedRouteUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CityDataManagerKotlin f1757a;
    public final CityProvider b;
    public final TimeUtilsContract c;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f1758a;

        static {
            int[] iArr = new int[RouteTimeTableType.values().length];
            try {
                iArr[RouteTimeTableType.FULL_WEEK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RouteTimeTableType.CURRENT_DAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f1758a = iArr;
        }
    }

    public GetCachedRouteUseCase(CityDataManagerKotlin cityDataManagerKotlin, CityProvider cityProvider, TimeUtilsContract timeUtilsContract) {
        this.f1757a = cityDataManagerKotlin;
        this.b = cityProvider;
        this.c = timeUtilsContract;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, RouteTimeTableType routeTimeTableType, ContinuationImpl continuationImpl) {
        GetCachedRouteUseCase$invoke$1 getCachedRouteUseCase$invoke$1;
        String str2;
        if (continuationImpl instanceof GetCachedRouteUseCase$invoke$1) {
            getCachedRouteUseCase$invoke$1 = (GetCachedRouteUseCase$invoke$1) continuationImpl;
            int i = getCachedRouteUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getCachedRouteUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                getCachedRouteUseCase$invoke$1 = new GetCachedRouteUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            getCachedRouteUseCase$invoke$1 = new GetCachedRouteUseCase$invoke$1(this, continuationImpl);
        }
        Object objC = getCachedRouteUseCase$invoke$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = getCachedRouteUseCase$invoke$1.label;
        if (i2 == 0) {
            ResultKt.b(objC);
            getCachedRouteUseCase$invoke$1.L$0 = routeTimeTableType;
            getCachedRouteUseCase$invoke$1.label = 1;
            objC = this.f1757a.c(str, getCachedRouteUseCase$invoke$1);
            if (objC == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            routeTimeTableType = (RouteTimeTableType) getCachedRouteUseCase$invoke$1.L$0;
            ResultKt.b(objC);
        }
        RouteAppModel routeAppModelB = (RouteAppModel) objC;
        if (routeAppModelB == null) {
            return new ChaloUseCaseResult.Failure(FetchSavedRouteErrorType.RouteNotAvailable);
        }
        int i3 = WhenMappings.f1758a[routeTimeTableType.ordinal()];
        if (i3 != 1) {
            if (i3 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            CityAppModel cityAppModel = (CityAppModel) this.b.b().getValue();
            if (cityAppModel == null || (str2 = cityAppModel.l) == null) {
                str2 = "Asia/Kolkata";
            }
            routeAppModelB = RouteAppModelKt.b(routeAppModelB, this.c.I(str2) - 1);
        }
        return new ChaloUseCaseResult.Success(routeAppModelB);
    }
}
