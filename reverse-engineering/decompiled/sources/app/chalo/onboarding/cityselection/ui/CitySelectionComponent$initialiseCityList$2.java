package app.chalo.onboarding.cityselection.ui;

import app.chalo.analytics.AnalyticsContractImplKt;
import app.chalo.constants.Source;
import app.chalo.models.BasicCityInfoAppModel;
import defpackage.cp;
import defpackage.wn;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.onboarding.cityselection.ui.CitySelectionComponent$initialiseCityList$2", f = "CitySelectionComponent.kt", l = {187}, m = "invokeSuspend", v = 1)
final class CitySelectionComponent$initialiseCityList$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ CitySelectionComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CitySelectionComponent$initialiseCityList$2(CitySelectionComponent citySelectionComponent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = citySelectionComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CitySelectionComponent$initialiseCityList$2(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((CitySelectionComponent$initialiseCityList$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ArrayList arrayListC0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            CitySelectionComponent citySelectionComponent = this.this$0;
            this.label = 1;
            obj = CitySelectionComponent.G0(citySelectionComponent, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        List<BasicCityInfoAppModel> list = (List) obj;
        if (list != null) {
            this.this$0.getClass();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (BasicCityInfoAppModel basicCityInfoAppModel : list) {
                if (!basicCityInfoAppModel.e) {
                    if (basicCityInfoAppModel.c) {
                        arrayList2.add(basicCityInfoAppModel);
                    } else {
                        arrayList.add(basicCityInfoAppModel);
                    }
                }
            }
            arrayListC0 = CollectionsKt.c0(arrayList2, arrayList);
        } else {
            arrayListC0 = null;
        }
        CitySelectionComponent citySelectionComponent2 = this.this$0;
        citySelectionComponent2.E0(new wn(11, arrayListC0, citySelectionComponent2));
        if (arrayListC0 == null) {
            this.this$0.E0(new cp(2));
        } else {
            AnalyticsContractImplKt.b(this.this$0.l, "city selection screen displayed", Source.CITY_SELECTION_FRAGMENT, null, false, 28);
        }
        return Unit.f17538a;
    }
}
