package app.chalo.onboarding.cityselection.ui;

import defpackage.wn;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.DelayKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.onboarding.cityselection.ui.CitySelectionComponent$handleSearchQueryEnteredIntent$2", f = "CitySelectionComponent.kt", l = {118}, m = "invokeSuspend", v = 1)
final class CitySelectionComponent$handleSearchQueryEnteredIntent$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $query;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ CitySelectionComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CitySelectionComponent$handleSearchQueryEnteredIntent$2(CitySelectionComponent citySelectionComponent, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = citySelectionComponent;
        this.$query = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        CitySelectionComponent$handleSearchQueryEnteredIntent$2 citySelectionComponent$handleSearchQueryEnteredIntent$2 = new CitySelectionComponent$handleSearchQueryEnteredIntent$2(this.this$0, this.$query, continuation);
        citySelectionComponent$handleSearchQueryEnteredIntent$2.L$0 = obj;
        return citySelectionComponent$handleSearchQueryEnteredIntent$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((CitySelectionComponent$handleSearchQueryEnteredIntent$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineScope coroutineScope;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            CoroutineScope coroutineScope2 = (CoroutineScope) this.L$0;
            this.L$0 = coroutineScope2;
            this.label = 1;
            if (DelayKt.b(300L, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            coroutineScope = coroutineScope2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            coroutineScope = (CoroutineScope) this.L$0;
            ResultKt.b(obj);
        }
        CoroutineScopeKt.d(coroutineScope);
        CitySelectionComponent citySelectionComponent = this.this$0;
        citySelectionComponent.E0(new wn(10, citySelectionComponent, this.$query));
        return Unit.f17538a;
    }
}
