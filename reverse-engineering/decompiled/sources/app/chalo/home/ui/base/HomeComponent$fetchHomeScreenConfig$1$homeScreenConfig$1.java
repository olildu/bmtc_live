package app.chalo.home.ui.base;

import app.chalo.home.domain.GetHomeScreenConfigUseCase;
import app.chalo.homescreen.data.model.app.HomeScreenConfigAppModel;
import app.chalo.homescreen.data.model.app.HomeScreenConfigGetType;
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
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lapp/chalo/homescreen/data/model/app/HomeScreenConfigAppModel;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.home.ui.base.HomeComponent$fetchHomeScreenConfig$1$homeScreenConfig$1", f = "HomeComponent.kt", l = {989}, m = "invokeSuspend", v = 1)
final class HomeComponent$fetchHomeScreenConfig$1$homeScreenConfig$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super HomeScreenConfigAppModel>, Object> {
    final /* synthetic */ String $cityId;
    int label;
    final /* synthetic */ HomeComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeComponent$fetchHomeScreenConfig$1$homeScreenConfig$1(HomeComponent homeComponent, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = homeComponent;
        this.$cityId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new HomeComponent$fetchHomeScreenConfig$1$homeScreenConfig$1(this.this$0, this.$cityId, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((HomeComponent$fetchHomeScreenConfig$1$homeScreenConfig$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            return obj;
        }
        ResultKt.b(obj);
        GetHomeScreenConfigUseCase getHomeScreenConfigUseCase = this.this$0.G;
        String str = this.$cityId;
        HomeScreenConfigGetType homeScreenConfigGetType = HomeScreenConfigGetType.RETURN_CACHED_INFO_IF_AVL_AND_REFRESH_IN_BACKGROUND_FOR_NEXT_SESSION;
        this.label = 1;
        Object objC = getHomeScreenConfigUseCase.c(str, homeScreenConfigGetType, this);
        return objC == coroutineSingletons ? coroutineSingletons : objC;
    }
}
