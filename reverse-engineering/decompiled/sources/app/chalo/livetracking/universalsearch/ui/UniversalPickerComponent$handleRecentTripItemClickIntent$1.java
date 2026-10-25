package app.chalo.livetracking.universalsearch.ui;

import app.chalo.livetracking.universalsearch.UniversalSearchHelper;
import app.chalo.providers.cityprovider.CityProviderKt;
import app.chalo.recent.model.app.RecentTripAppModel;
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
@DebugMetadata(c = "app.chalo.livetracking.universalsearch.ui.UniversalPickerComponent$handleRecentTripItemClickIntent$1", f = "UniversalPickerComponent.kt", l = {801}, m = "invokeSuspend", v = 1)
final class UniversalPickerComponent$handleRecentTripItemClickIntent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ RecentTripAppModel $tripDetail;
    int label;
    final /* synthetic */ UniversalPickerComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UniversalPickerComponent$handleRecentTripItemClickIntent$1(UniversalPickerComponent universalPickerComponent, RecentTripAppModel recentTripAppModel, Continuation continuation) {
        super(2, continuation);
        this.this$0 = universalPickerComponent;
        this.$tripDetail = recentTripAppModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new UniversalPickerComponent$handleRecentTripItemClickIntent$1(this.this$0, this.$tripDetail, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((UniversalPickerComponent$handleRecentTripItemClickIntent$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
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
        UniversalPickerComponent universalPickerComponent = this.this$0;
        UniversalSearchHelper universalSearchHelper = universalPickerComponent.n;
        String str = this.$tripDetail.e;
        String strB = CityProviderKt.b(universalPickerComponent.l);
        if (strB == null) {
            strB = "";
        }
        this.label = 1;
        Object objA = universalSearchHelper.f4960a.getE().a(str, strB, this);
        if (objA != coroutineSingletons) {
            objA = unit;
        }
        return objA == coroutineSingletons ? coroutineSingletons : unit;
    }
}
