package app.chalo.onboarding.citylocationselection.ui;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import app.chalo.contract.CityMetaDataManager;
import app.chalo.contract.FetchCityMetaDataErrorType;
import app.chalo.providers.cityprovider.impl.data.models.app.CityAppModel;
import app.chalo.utils.ChaloUseCaseResult;
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
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0004H\n"}, d2 = {"<anonymous>", "Lapp/chalo/utils/ChaloUseCaseResult;", "Lapp/chalo/providers/cityprovider/impl/data/models/app/CityAppModel;", "Lapp/chalo/contract/FetchCityMetaDataErrorType;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.onboarding.citylocationselection.ui.CityLocationSelectionComponent$fetchConfigDataAndProceed$1$cityMetaDataAsync$1", f = "CityLocationSelectionComponent.kt", l = {TypedValues.CycleType.TYPE_CUSTOM_WAVE_SHAPE}, m = "invokeSuspend", v = 1)
final class CityLocationSelectionComponent$fetchConfigDataAndProceed$1$cityMetaDataAsync$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ChaloUseCaseResult<CityAppModel, FetchCityMetaDataErrorType>>, Object> {
    final /* synthetic */ String $cityId;
    int label;
    final /* synthetic */ CityLocationSelectionComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CityLocationSelectionComponent$fetchConfigDataAndProceed$1$cityMetaDataAsync$1(CityLocationSelectionComponent cityLocationSelectionComponent, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cityLocationSelectionComponent;
        this.$cityId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CityLocationSelectionComponent$fetchConfigDataAndProceed$1$cityMetaDataAsync$1(this.this$0, this.$cityId, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((CityLocationSelectionComponent$fetchConfigDataAndProceed$1$cityMetaDataAsync$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
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
        CityMetaDataManager cityMetaDataManager = this.this$0.m;
        String str = this.$cityId;
        this.label = 1;
        Object objB = cityMetaDataManager.b(str, this);
        return objB == coroutineSingletons ? coroutineSingletons : objB;
    }
}
