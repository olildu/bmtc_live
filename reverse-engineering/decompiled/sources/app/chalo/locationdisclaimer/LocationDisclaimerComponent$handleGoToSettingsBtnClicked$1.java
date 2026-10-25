package app.chalo.locationdisclaimer;

import app.chalo.analytics.AnalyticsContractImplKt;
import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.constants.Source;
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
@DebugMetadata(c = "app.chalo.locationdisclaimer.LocationDisclaimerComponent$handleGoToSettingsBtnClicked$1", f = "LocationDisclaimerComponent.kt", l = {182}, m = "invokeSuspend", v = 1)
final class LocationDisclaimerComponent$handleGoToSettingsBtnClicked$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ LocationDisclaimerComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocationDisclaimerComponent$handleGoToSettingsBtnClicked$1(LocationDisclaimerComponent locationDisclaimerComponent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = locationDisclaimerComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LocationDisclaimerComponent$handleGoToSettingsBtnClicked$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((LocationDisclaimerComponent$handleGoToSettingsBtnClicked$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        AnalyticsContract analyticsContract;
        Source source;
        String str;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            LocationDisclaimerComponent locationDisclaimerComponent = this.this$0;
            AnalyticsContract analyticsContract2 = locationDisclaimerComponent.k;
            Source source2 = Source.LOCATION_DISCLAIMER_ACTIVITY;
            this.L$0 = analyticsContract2;
            this.L$1 = "go to settings btn clicked";
            this.L$2 = source2;
            this.label = 1;
            obj = locationDisclaimerComponent.J0(this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
            analyticsContract = analyticsContract2;
            source = source2;
            str = "go to settings btn clicked";
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Source source3 = (Source) this.L$2;
            str = (String) this.L$1;
            AnalyticsContract analyticsContract3 = (AnalyticsContract) this.L$0;
            ResultKt.b(obj);
            source = source3;
            analyticsContract = analyticsContract3;
        }
        AnalyticsContractImplKt.b(analyticsContract, str, source, (Map) obj, false, 24);
        LocationDisclaimerComponent.H0(this.this$0);
        return Unit.f17538a;
    }
}
