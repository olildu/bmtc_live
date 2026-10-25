package app.chalo.tito.domain;

import app.chalo.citydata.data.model.app.RouteAppModel;
import app.chalo.utils.ChaloUseCaseResult;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0004H\n"}, d2 = {"<anonymous>", "Lapp/chalo/utils/ChaloUseCaseResult;", "Lapp/chalo/citydata/data/model/app/RouteAppModel;", "Lapp/chalo/tito/domain/CachedRouteFetchFailureReason;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.tito.domain.GetCachedRouteInfoRouteIdUseCase$invoke$useCaseResult$1", f = "GetCachedRouteInfoFromRouteIdUseCase.kt", l = {}, m = "invokeSuspend", v = 1)
final class GetCachedRouteInfoRouteIdUseCase$invoke$useCaseResult$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ChaloUseCaseResult<RouteAppModel, CachedRouteFetchFailureReason>>, Object> {
    final /* synthetic */ String $routeId;
    final /* synthetic */ Ref.ObjectRef<List<RouteAppModel>> $routeInfoList;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetCachedRouteInfoRouteIdUseCase$invoke$useCaseResult$1(Ref.ObjectRef objectRef, String str, Continuation continuation) {
        super(2, continuation);
        this.$routeInfoList = objectRef;
        this.$routeId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        GetCachedRouteInfoRouteIdUseCase$invoke$useCaseResult$1 getCachedRouteInfoRouteIdUseCase$invoke$useCaseResult$1 = new GetCachedRouteInfoRouteIdUseCase$invoke$useCaseResult$1(this.$routeInfoList, this.$routeId, continuation);
        getCachedRouteInfoRouteIdUseCase$invoke$useCaseResult$1.L$0 = obj;
        return getCachedRouteInfoRouteIdUseCase$invoke$useCaseResult$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((GetCachedRouteInfoRouteIdUseCase$invoke$useCaseResult$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object next;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj);
        List<RouteAppModel> list = this.$routeInfoList.element;
        String str = this.$routeId;
        Iterator<T> it = list.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.d(((RouteAppModel) next).b, str));
        RouteAppModel routeAppModel = (RouteAppModel) next;
        return routeAppModel != null ? new ChaloUseCaseResult.Success(routeAppModel) : new ChaloUseCaseResult.Failure(CachedRouteFetchFailureReason.ROUTE_NOT_FOUND_IN_CITY_DATA_CACHE);
    }
}
