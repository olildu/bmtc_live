package app.chalo.onboarding.citylocationselection.ui;

import app.chalo.universalsearch.data.UniversalSearchOption;
import app.chalo.universalsearch.data.UniversalSearchOptions;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.onboarding.citylocationselection.ui.CityLocationSelectionComponent$navigateToUniversalSearch$2", f = "CityLocationSelectionComponent.kt", l = {}, m = "invokeSuspend", v = 1)
final class CityLocationSelectionComponent$navigateToUniversalSearch$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $requestId;
    int label;
    final /* synthetic */ CityLocationSelectionComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CityLocationSelectionComponent$navigateToUniversalSearch$2(CityLocationSelectionComponent cityLocationSelectionComponent, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cityLocationSelectionComponent;
        this.$requestId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CityLocationSelectionComponent$navigateToUniversalSearch$2(this.this$0, this.$requestId, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CityLocationSelectionComponent$navigateToUniversalSearch$2 cityLocationSelectionComponent$navigateToUniversalSearch$2 = (CityLocationSelectionComponent$navigateToUniversalSearch$2) create((CoroutineScope) obj, (Continuation) obj2);
        Unit unit = Unit.f17538a;
        cityLocationSelectionComponent$navigateToUniversalSearch$2.invokeSuspend(unit);
        return unit;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj);
        UniversalSearchOptions.INSTANCE.getClass();
        final UniversalSearchOptions universalSearchOptions = new UniversalSearchOptions(SetsKt.g(new UniversalSearchOption.PLACES(false, false)));
        final CityLocationSelectionComponent cityLocationSelectionComponent = this.this$0;
        final String str = this.$requestId;
        cityLocationSelectionComponent.q0(new Function0() { // from class: app.chalo.onboarding.citylocationselection.ui.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CityLocationSelectionComponent cityLocationSelectionComponent2 = cityLocationSelectionComponent;
                BuildersKt.d(cityLocationSelectionComponent2.j, null, null, new CityLocationSelectionComponent$navigateToUniversalSearch$2$1$1(cityLocationSelectionComponent2, universalSearchOptions, str, null), 3);
                return Unit.f17538a;
            }
        });
        return Unit.f17538a;
    }
}
