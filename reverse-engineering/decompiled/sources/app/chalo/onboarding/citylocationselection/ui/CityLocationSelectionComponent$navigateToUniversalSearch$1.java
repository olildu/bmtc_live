package app.chalo.onboarding.citylocationselection.ui;

import app.chalo.network.config.ChaloJson;
import app.chalo.resultstatemanager.ResultStateData;
import app.chalo.resultstatemanager.universalsearch.UniversalSearchResultState;
import app.chalo.scenes.ChaloNavigationManagerKt;
import app.chalo.universalsearch.data.UniversalSearchCitySelectionResult;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.serialization.json.Json;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.onboarding.citylocationselection.ui.CityLocationSelectionComponent$navigateToUniversalSearch$1", f = "CityLocationSelectionComponent.kt", l = {994}, m = "invokeSuspend", v = 1)
final class CityLocationSelectionComponent$navigateToUniversalSearch$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $requestId;
    int label;
    final /* synthetic */ CityLocationSelectionComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CityLocationSelectionComponent$navigateToUniversalSearch$1(CityLocationSelectionComponent cityLocationSelectionComponent, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cityLocationSelectionComponent;
        this.$requestId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CityLocationSelectionComponent$navigateToUniversalSearch$1(this.this$0, this.$requestId, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((CityLocationSelectionComponent$navigateToUniversalSearch$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objB;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            CityLocationSelectionComponent cityLocationSelectionComponent = this.this$0;
            Flow flowB = cityLocationSelectionComponent.A.b(this.$requestId);
            this.label = 1;
            obj = cityLocationSelectionComponent.b.v(flowB, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        ResultStateData resultStateData = (ResultStateData) obj;
        if (resultStateData instanceof ResultStateData.Cancelled) {
            ChaloNavigationManagerKt.c(this.this$0.v);
        } else {
            if (!(resultStateData instanceof ResultStateData.Success)) {
                throw new NoWhenBranchMatchedException();
            }
            String str = ((UniversalSearchResultState) ((ResultStateData.Success) resultStateData).f9039a).d;
            if (str != null) {
                CityLocationSelectionComponent cityLocationSelectionComponent2 = this.this$0;
                try {
                    Json json = ChaloJson.b;
                    json.getClass();
                    objB = json.b(str, UniversalSearchCitySelectionResult.INSTANCE.serializer());
                } catch (Exception unused) {
                    objB = null;
                }
                UniversalSearchCitySelectionResult universalSearchCitySelectionResult = (UniversalSearchCitySelectionResult) objB;
                if (universalSearchCitySelectionResult != null) {
                    cityLocationSelectionComponent2.M0(new CityLocationSelectionIntent.UniversalSearchResultReceived(universalSearchCitySelectionResult));
                }
            }
        }
        return Unit.f17538a;
    }
}
