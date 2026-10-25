package app.chalo.livetracking.tripplanner.ui.result;

import app.chalo.location.LatLng;
import app.chalo.providers.cityprovider.CityProviderKt;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.recent.model.app.UniversalSearchDescriptiveLocationAppModel;
import app.chalo.usecase.FetchCurrentLocationUseCase;
import defpackage.ml1;
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
@DebugMetadata(c = "app.chalo.livetracking.tripplanner.ui.result.TripPlannerResultsComponent$handleLocationEnabledIntent$1", f = "TripPlannerResultsComponent.kt", l = {842, 845, 846}, m = "invokeSuspend", v = 1)
final class TripPlannerResultsComponent$handleLocationEnabledIntent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ TripPlannerResultsComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TripPlannerResultsComponent$handleLocationEnabledIntent$1(TripPlannerResultsComponent tripPlannerResultsComponent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = tripPlannerResultsComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TripPlannerResultsComponent$handleLocationEnabledIntent$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((TripPlannerResultsComponent$handleLocationEnabledIntent$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x008f  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        TripPlannerResultsComponent tripPlannerResultsComponent;
        LatLng latLng;
        String str;
        Object objB;
        TripPlannerResultsComponent tripPlannerResultsComponent2;
        LatLng latLng2;
        String str2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            FetchCurrentLocationUseCase fetchCurrentLocationUseCase = this.this$0.u;
            this.label = 1;
            obj = fetchCurrentLocationUseCase.a(false, this);
            if (obj != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i == 1) {
            ResultKt.b(obj);
        } else {
            if (i == 2) {
                tripPlannerResultsComponent = (TripPlannerResultsComponent) this.L$1;
                latLng = (LatLng) this.L$0;
                ResultKt.b(obj);
                str = (String) obj;
                this.L$0 = latLng;
                this.L$1 = tripPlannerResultsComponent;
                this.L$2 = str;
                this.label = 3;
                objB = this.this$0.o.b(StringEnum.CURRENT_LOCATION, new Object[0], this);
                if (objB != coroutineSingletons) {
                    tripPlannerResultsComponent2 = tripPlannerResultsComponent;
                    latLng2 = latLng;
                    str2 = str;
                    obj = objB;
                }
                return coroutineSingletons;
            }
            if (i != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            String str3 = (String) this.L$2;
            TripPlannerResultsComponent tripPlannerResultsComponent3 = (TripPlannerResultsComponent) this.L$1;
            LatLng latLng3 = (LatLng) this.L$0;
            ResultKt.b(obj);
            tripPlannerResultsComponent2 = tripPlannerResultsComponent3;
            latLng2 = latLng3;
            str2 = str3;
        }
        tripPlannerResultsComponent2.M = new UniversalSearchDescriptiveLocationAppModel(str2, (String) obj, "", "", latLng2);
        TripPlannerResultsComponent tripPlannerResultsComponent4 = this.this$0;
        tripPlannerResultsComponent4.E0(new ml1(tripPlannerResultsComponent4, 2));
        this.this$0.W0();
        return Unit.f17538a;
        LatLng latLng4 = (LatLng) obj;
        if (latLng4 != null && CityProviderKt.a(this.this$0.s, latLng4)) {
            tripPlannerResultsComponent = this.this$0;
            if (tripPlannerResultsComponent.M == null) {
                this.L$0 = latLng4;
                this.L$1 = tripPlannerResultsComponent;
                this.label = 2;
                Object objB2 = tripPlannerResultsComponent.o.b(StringEnum.CURRENT_LOCATION, new Object[0], this);
                if (objB2 != coroutineSingletons) {
                    latLng = latLng4;
                    obj = objB2;
                    str = (String) obj;
                    this.L$0 = latLng;
                    this.L$1 = tripPlannerResultsComponent;
                    this.L$2 = str;
                    this.label = 3;
                    objB = this.this$0.o.b(StringEnum.CURRENT_LOCATION, new Object[0], this);
                    if (objB != coroutineSingletons) {
                        tripPlannerResultsComponent2 = tripPlannerResultsComponent;
                        latLng2 = latLng;
                        str2 = str;
                        obj = objB;
                        tripPlannerResultsComponent2.M = new UniversalSearchDescriptiveLocationAppModel(str2, (String) obj, "", "", latLng2);
                        TripPlannerResultsComponent tripPlannerResultsComponent5 = this.this$0;
                        tripPlannerResultsComponent5.E0(new ml1(tripPlannerResultsComponent5, 2));
                        this.this$0.W0();
                    }
                }
                return coroutineSingletons;
            }
        }
        return Unit.f17538a;
    }
}
