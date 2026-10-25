package app.chalo.onboarding.cityprovider;

import androidx.datastore.preferences.core.Preferences;
import app.chalo.datastore.LocalDataStore;
import app.chalo.network.config.ChaloJson;
import app.chalo.providers.cityprovider.impl.data.models.app.CityAppModel;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.serialization.json.Json;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lapp/chalo/providers/cityprovider/impl/data/models/app/CityAppModel;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.onboarding.cityprovider.ProcessCityChangeUseCase$invoke$1", f = "ProcessCityChangeUseCase.kt", l = {21}, m = "invokeSuspend", v = 1)
final class ProcessCityChangeUseCase$invoke$1 extends SuspendLambda implements Function2<FlowCollector<? super CityAppModel>, Continuation<? super Unit>, Object> {
    final /* synthetic */ CityAppModel $cityBefore;
    final /* synthetic */ CityAppModel $selectedCity;
    int label;
    final /* synthetic */ ProcessCityChangeUseCase this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProcessCityChangeUseCase$invoke$1(ProcessCityChangeUseCase processCityChangeUseCase, CityAppModel cityAppModel, CityAppModel cityAppModel2, Continuation continuation) {
        super(2, continuation);
        this.this$0 = processCityChangeUseCase;
        this.$cityBefore = cityAppModel;
        this.$selectedCity = cityAppModel2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ProcessCityChangeUseCase$invoke$1(this.this$0, this.$cityBefore, this.$selectedCity, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ProcessCityChangeUseCase$invoke$1) create((FlowCollector) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        Unit unit = Unit.f17538a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            return unit;
        }
        ResultKt.b(obj);
        CityChangeOperationTracker cityChangeOperationTracker = this.this$0.b;
        CityAppModel cityAppModel = this.$cityBefore;
        String str = cityAppModel != null ? cityAppModel.f8854a : null;
        String str2 = this.$selectedCity.f8854a;
        this.label = 1;
        CityChangeInfo cityChangeInfo = new CityChangeInfo(str, str2, cityChangeOperationTracker.b.j());
        LocalDataStore localDataStore = cityChangeOperationTracker.f6605a;
        Preferences.Key key = cityChangeOperationTracker.c;
        Json json = ChaloJson.b;
        json.getClass();
        Object objG = localDataStore.g(key, json.a(CityChangeInfo.INSTANCE.serializer(), cityChangeInfo), this);
        if (objG != coroutineSingletons) {
            objG = unit;
        }
        return objG == coroutineSingletons ? coroutineSingletons : unit;
    }
}
