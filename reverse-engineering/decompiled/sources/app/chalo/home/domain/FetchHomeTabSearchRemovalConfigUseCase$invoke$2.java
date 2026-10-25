package app.chalo.home.domain;

import app.chalo.constants.Source;
import app.chalo.domain.CheckIfExperimentEnabledUseCase;
import app.chalo.utils.abtestanalytics.ABTestAnalyticsContract;
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
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lapp/chalo/home/domain/HomeScreenSearchRemovalConfigModel;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.home.domain.FetchHomeTabSearchRemovalConfigUseCase$invoke$2", f = "FetchHomeTabSearchRemovalConfigUseCase.kt", l = {25}, m = "invokeSuspend", v = 1)
final class FetchHomeTabSearchRemovalConfigUseCase$invoke$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super HomeScreenSearchRemovalConfigModel>, Object> {
    final /* synthetic */ HomeScreenSearchRemovalConfigModel $abConfig;
    final /* synthetic */ Source $source;
    int label;
    final /* synthetic */ FetchHomeTabSearchRemovalConfigUseCase this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FetchHomeTabSearchRemovalConfigUseCase$invoke$2(FetchHomeTabSearchRemovalConfigUseCase fetchHomeTabSearchRemovalConfigUseCase, HomeScreenSearchRemovalConfigModel homeScreenSearchRemovalConfigModel, Source source, Continuation continuation) {
        super(2, continuation);
        this.this$0 = fetchHomeTabSearchRemovalConfigUseCase;
        this.$abConfig = homeScreenSearchRemovalConfigModel;
        this.$source = source;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new FetchHomeTabSearchRemovalConfigUseCase$invoke$2(this.this$0, this.$abConfig, this.$source, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((FetchHomeTabSearchRemovalConfigUseCase$invoke$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            CheckIfExperimentEnabledUseCase checkIfExperimentEnabledUseCase = this.this$0.b;
            HomeScreenSearchRemovalConfigModel homeScreenSearchRemovalConfigModel = this.$abConfig;
            String str = homeScreenSearchRemovalConfigModel.b;
            String str2 = homeScreenSearchRemovalConfigModel.f3053a;
            this.label = 1;
            obj = checkIfExperimentEnabledUseCase.a(str, str2, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        if (!((Boolean) obj).booleanValue()) {
            return FetchHomeTabSearchRemovalConfigUseCase.e;
        }
        ABTestAnalyticsContract aBTestAnalyticsContract = this.this$0.d;
        HomeScreenSearchRemovalConfigModel homeScreenSearchRemovalConfigModel2 = this.$abConfig;
        aBTestAnalyticsContract.a(homeScreenSearchRemovalConfigModel2.b, homeScreenSearchRemovalConfigModel2.f3053a, homeScreenSearchRemovalConfigModel2.d, this.$source.name());
        return this.$abConfig;
    }
}
