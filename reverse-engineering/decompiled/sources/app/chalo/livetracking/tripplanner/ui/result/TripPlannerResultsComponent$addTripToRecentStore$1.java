package app.chalo.livetracking.tripplanner.ui.result;

import app.chalo.contract.BasicInfoContract;
import app.chalo.providers.cityprovider.CityProviderKt;
import app.chalo.providers.cityprovider.impl.data.models.app.ChaloTransitMode;
import app.chalo.recent.database.repository.recent.TripRecentRepository;
import app.chalo.recent.model.app.RecentTripAppModel;
import app.chalo.recent.model.app.UniversalSearchDescriptiveLocationAppModel;
import defpackage.z40;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.livetracking.tripplanner.ui.result.TripPlannerResultsComponent$addTripToRecentStore$1", f = "TripPlannerResultsComponent.kt", l = {1345, 1338}, m = "invokeSuspend", v = 1)
final class TripPlannerResultsComponent$addTripToRecentStore$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    final /* synthetic */ TripPlannerResultsComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TripPlannerResultsComponent$addTripToRecentStore$1(TripPlannerResultsComponent tripPlannerResultsComponent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = tripPlannerResultsComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TripPlannerResultsComponent$addTripToRecentStore$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((TripPlannerResultsComponent$addTripToRecentStore$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        UniversalSearchDescriptiveLocationAppModel universalSearchDescriptiveLocationAppModel;
        UniversalSearchDescriptiveLocationAppModel universalSearchDescriptiveLocationAppModel2;
        TripRecentRepository tripRecentRepository;
        String strH;
        String str;
        ChaloTransitMode chaloTransitMode;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        Unit unit = Unit.f17538a;
        if (i == 0) {
            ResultKt.b(obj);
            TripPlannerResultsComponent tripPlannerResultsComponent = this.this$0;
            universalSearchDescriptiveLocationAppModel = tripPlannerResultsComponent.M;
            if (universalSearchDescriptiveLocationAppModel != null && (universalSearchDescriptiveLocationAppModel2 = tripPlannerResultsComponent.N) != null) {
                String fromPlaceId = universalSearchDescriptiveLocationAppModel.c;
                String toPlaceId = universalSearchDescriptiveLocationAppModel2.c;
                if (!Intrinsics.d(universalSearchDescriptiveLocationAppModel.d, "userLocation") && !Intrinsics.d(universalSearchDescriptiveLocationAppModel2.d, "userLocation")) {
                    tripRecentRepository = this.this$0.r;
                    RecentTripAppModel.INSTANCE.getClass();
                    Intrinsics.i(fromPlaceId, "fromPlaceId");
                    Intrinsics.i(toPlaceId, "toPlaceId");
                    strH = z40.h(new StringBuilder(), fromPlaceId, "-", toPlaceId);
                    String strB = CityProviderKt.b(this.this$0.s);
                    if (strB == null) {
                        strB = "";
                    }
                    str = strB;
                    chaloTransitMode = ChaloTransitMode.BUS;
                    BasicInfoContract basicInfoContract = this.this$0.n;
                    this.L$0 = tripRecentRepository;
                    this.L$1 = strH;
                    this.L$2 = str;
                    this.L$3 = universalSearchDescriptiveLocationAppModel;
                    this.L$4 = universalSearchDescriptiveLocationAppModel2;
                    this.L$5 = chaloTransitMode;
                    this.label = 1;
                    obj = basicInfoContract.c(this);
                    if (obj != coroutineSingletons) {
                    }
                }
            }
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            return unit;
        }
        chaloTransitMode = (ChaloTransitMode) this.L$5;
        universalSearchDescriptiveLocationAppModel2 = (UniversalSearchDescriptiveLocationAppModel) this.L$4;
        universalSearchDescriptiveLocationAppModel = (UniversalSearchDescriptiveLocationAppModel) this.L$3;
        str = (String) this.L$2;
        strH = (String) this.L$1;
        tripRecentRepository = (TripRecentRepository) this.L$0;
        ResultKt.b(obj);
        ChaloTransitMode chaloTransitMode2 = chaloTransitMode;
        TripRecentRepository tripRecentRepository2 = tripRecentRepository;
        RecentTripAppModel recentTripAppModel = new RecentTripAppModel(strH, str, universalSearchDescriptiveLocationAppModel, universalSearchDescriptiveLocationAppModel2, chaloTransitMode2, ((Number) obj).longValue(), 1);
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.L$3 = null;
        this.L$4 = null;
        this.L$5 = null;
        this.label = 2;
        return tripRecentRepository2.b(recentTripAppModel, true, this) == coroutineSingletons ? coroutineSingletons : unit;
    }
}
