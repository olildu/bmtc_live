package app.chalo.metro.ui.landing;

import app.chalo.citydata.data.model.app.StopAppModel;
import app.chalo.ondc.model.app.OndcMetroRouteSearchAppModel;
import app.chalo.providers.cityprovider.impl.data.models.app.ChaloTransitMode;
import app.chalo.routeselection.domain.FetchRoutesForGivenStopsUseCase;
import app.chalo.routeselection.domain.FetchRoutesResult;
import app.chalo.routeselection.domain.RouteForStopPairRequestType;
import defpackage.xg0;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.metro.ui.landing.MetroLandingScreenComponent$handleOnSearchButtonClicked$1", f = "MetroLandingScreenComponent.kt", l = {323, 338, 339}, m = "invokeSuspend", v = 1)
final class MetroLandingScreenComponent$handleOnSearchButtonClicked$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MetroLandingScreenDataState $currentDataState;
    int label;
    final /* synthetic */ MetroLandingScreenComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MetroLandingScreenComponent$handleOnSearchButtonClicked$1(MetroLandingScreenDataState metroLandingScreenDataState, MetroLandingScreenComponent metroLandingScreenComponent, Continuation continuation) {
        super(2, continuation);
        this.$currentDataState = metroLandingScreenDataState;
        this.this$0 = metroLandingScreenComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MetroLandingScreenComponent$handleOnSearchButtonClicked$1(this.$currentDataState, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((MetroLandingScreenComponent$handleOnSearchButtonClicked$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:44:0x00a8 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str;
        StopAppModel stopAppModel;
        String str2;
        MetroLandingScreenComponent$handleOnSearchButtonClicked$1 metroLandingScreenComponent$handleOnSearchButtonClicked$1;
        OndcMetroRouteSearchAppModel ondcMetroRouteSearchAppModel;
        MetroLandingScreenHelper metroLandingScreenHelper;
        Object objD;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        Unit unit = Unit.f17538a;
        if (i != 0) {
            if (i == 1) {
                ResultKt.b(obj);
                metroLandingScreenComponent$handleOnSearchButtonClicked$1 = this;
            } else {
                if (i != 2) {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.b(obj);
                    return unit;
                }
                ResultKt.b(obj);
                metroLandingScreenComponent$handleOnSearchButtonClicked$1 = this;
            }
            MetroLandingScreenComponent metroLandingScreenComponent = metroLandingScreenComponent$handleOnSearchButtonClicked$1.this$0;
            metroLandingScreenComponent$handleOnSearchButtonClicked$1.label = 3;
            metroLandingScreenHelper = metroLandingScreenComponent.C;
            if (metroLandingScreenHelper != null || (objD = metroLandingScreenHelper.d((MetroLandingScreenDataState) metroLandingScreenComponent.f.getValue(), this)) != coroutineSingletons) {
                objD = unit;
            }
            if (objD != coroutineSingletons) {
                return coroutineSingletons;
            }
            return unit;
        }
        ResultKt.b(obj);
        MetroLandingScreenDataState metroLandingScreenDataState = this.$currentDataState;
        MetroLineListItemState metroLineListItemState = metroLandingScreenDataState.j;
        String str3 = (metroLineListItemState == null || (ondcMetroRouteSearchAppModel = metroLineListItemState.f5509a) == null) ? null : ondcMetroRouteSearchAppModel.f6766a;
        StopAppModel stopAppModel2 = metroLandingScreenDataState.k;
        if (stopAppModel2 != null && (str = stopAppModel2.f1727a) != null && (stopAppModel = metroLandingScreenDataState.l) != null && (str2 = stopAppModel.f1727a) != null) {
            this.this$0.E0(new xg0(27));
            FetchRoutesForGivenStopsUseCase fetchRoutesForGivenStopsUseCase = this.this$0.r;
            RouteForStopPairRequestType routeForStopPairRequestType = RouteForStopPairRequestType.ONDC;
            ChaloTransitMode chaloTransitMode = ChaloTransitMode.METRO;
            boolean zBooleanValue = this.$currentDataState.d.booleanValue();
            this.label = 1;
            metroLandingScreenComponent$handleOnSearchButtonClicked$1 = this;
            obj = fetchRoutesForGivenStopsUseCase.a(str, str2, str3, routeForStopPairRequestType, chaloTransitMode, zBooleanValue, metroLandingScreenComponent$handleOnSearchButtonClicked$1);
            if (obj != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        return unit;
        metroLandingScreenComponent$handleOnSearchButtonClicked$1.this$0.E0(new xg0(28));
        MetroLandingScreenComponent metroLandingScreenComponent2 = metroLandingScreenComponent$handleOnSearchButtonClicked$1.this$0;
        metroLandingScreenComponent$handleOnSearchButtonClicked$1.label = 2;
        if (MetroLandingScreenComponent.H0(metroLandingScreenComponent2, (FetchRoutesResult) obj, this) != coroutineSingletons) {
            MetroLandingScreenComponent metroLandingScreenComponent3 = metroLandingScreenComponent$handleOnSearchButtonClicked$1.this$0;
            metroLandingScreenComponent$handleOnSearchButtonClicked$1.label = 3;
            metroLandingScreenHelper = metroLandingScreenComponent3.C;
            if (metroLandingScreenHelper != null) {
                objD = unit;
            } else {
                objD = unit;
            }
            if (objD != coroutineSingletons) {
                return unit;
            }
        }
        return coroutineSingletons;
    }
}
