package app.chalo.locationdisclaimer;

import app.chalo.analytics.AnalyticsContractImplKt;
import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.constants.Source;
import app.chalo.locationdisclaimer.domain.GetLocationDisclaimerStepsAndLottieTypeUseCase;
import app.chalo.locationdisclaimer.domain.LocationDisclaimerStepsAndLottiType;
import app.chalo.scenes.ChaloNavigationManagerKt;
import defpackage.kf0;
import defpackage.n8;
import java.util.Map;
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
@DebugMetadata(c = "app.chalo.locationdisclaimer.LocationDisclaimerComponent$handleViewCreatedIntent$1", f = "LocationDisclaimerComponent.kt", l = {146, 152, 161}, m = "invokeSuspend", v = 1)
final class LocationDisclaimerComponent$handleViewCreatedIntent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ LocationDisclaimerComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocationDisclaimerComponent$handleViewCreatedIntent$1(LocationDisclaimerComponent locationDisclaimerComponent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = locationDisclaimerComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LocationDisclaimerComponent$handleViewCreatedIntent$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((LocationDisclaimerComponent$handleViewCreatedIntent$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0083  */
    /* JADX WARN: Code duplicated, block: B:24:0x0096  */
    /* JADX WARN: Code duplicated, block: B:27:0x00a3  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Source source;
        AnalyticsContract analyticsContract;
        String str;
        LocationDisclaimerStepsAndLottiType locationDisclaimerStepsAndLottiType;
        Object objF0;
        LocationDisclaimerStepsAndLottiType locationDisclaimerStepsAndLottiType2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        Unit unit = Unit.f17538a;
        if (i == 0) {
            ResultKt.b(obj);
            LocationDisclaimerComponent locationDisclaimerComponent = this.this$0;
            AnalyticsContract analyticsContract2 = locationDisclaimerComponent.k;
            source = Source.LOCATION_DISCLAIMER_ACTIVITY;
            this.L$0 = analyticsContract2;
            this.L$1 = "location disclaimer activity opened";
            this.L$2 = source;
            this.label = 1;
            obj = locationDisclaimerComponent.J0(this);
            if (obj != coroutineSingletons) {
                analyticsContract = analyticsContract2;
                str = "location disclaimer activity opened";
            }
            return coroutineSingletons;
        }
        if (i == 1) {
            source = (Source) this.L$2;
            String str2 = (String) this.L$1;
            AnalyticsContract analyticsContract3 = (AnalyticsContract) this.L$0;
            ResultKt.b(obj);
            str = str2;
            analyticsContract = analyticsContract3;
        } else {
            if (i == 2) {
                ResultKt.b(obj);
                locationDisclaimerStepsAndLottiType = (LocationDisclaimerStepsAndLottiType) obj;
                if (locationDisclaimerStepsAndLottiType == null) {
                    this.this$0.E0(new kf0(3));
                    ChaloNavigationManagerKt.c(this.this$0.o);
                    return unit;
                }
                LocationDisclaimerComponent locationDisclaimerComponent2 = this.this$0;
                this.L$0 = locationDisclaimerStepsAndLottiType;
                this.label = 3;
                objF0 = LocationDisclaimerComponent.F0(locationDisclaimerComponent2, this);
                if (objF0 != coroutineSingletons) {
                    locationDisclaimerStepsAndLottiType2 = locationDisclaimerStepsAndLottiType;
                    obj = objF0;
                }
                return coroutineSingletons;
            }
            if (i != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            locationDisclaimerStepsAndLottiType2 = (LocationDisclaimerStepsAndLottiType) this.L$0;
            ResultKt.b(obj);
        }
        this.this$0.E0(new n8(locationDisclaimerStepsAndLottiType2, ((Boolean) obj).booleanValue(), 5));
        return unit;
        AnalyticsContractImplKt.b(analyticsContract, str, source, (Map) obj, false, 24);
        this.this$0.E0(new kf0(2));
        GetLocationDisclaimerStepsAndLottieTypeUseCase getLocationDisclaimerStepsAndLottieTypeUseCase = this.this$0.l;
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.label = 2;
        obj = getLocationDisclaimerStepsAndLottieTypeUseCase.a(this);
        if (obj != coroutineSingletons) {
            locationDisclaimerStepsAndLottiType = (LocationDisclaimerStepsAndLottiType) obj;
            if (locationDisclaimerStepsAndLottiType == null) {
                this.this$0.E0(new kf0(3));
                ChaloNavigationManagerKt.c(this.this$0.o);
                return unit;
            }
            LocationDisclaimerComponent locationDisclaimerComponent3 = this.this$0;
            this.L$0 = locationDisclaimerStepsAndLottiType;
            this.label = 3;
            objF0 = LocationDisclaimerComponent.F0(locationDisclaimerComponent3, this);
            if (objF0 != coroutineSingletons) {
                locationDisclaimerStepsAndLottiType2 = locationDisclaimerStepsAndLottiType;
                obj = objF0;
                this.this$0.E0(new n8(locationDisclaimerStepsAndLottiType2, ((Boolean) obj).booleanValue(), 5));
                return unit;
            }
        }
        return coroutineSingletons;
    }
}
